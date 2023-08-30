package org.talend.poc.salesforce.marketing;

import com.exacttarget.fuelsdk.ETAsset;
import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETConfiguration;
import com.exacttarget.fuelsdk.ETContentArea;
import com.exacttarget.fuelsdk.ETExpression;
import com.exacttarget.fuelsdk.ETFilter;
import com.exacttarget.fuelsdk.ETObject;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.ETRestObject;
import com.exacttarget.fuelsdk.ETResult;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETSoapObject;
import com.exacttarget.fuelsdk.ETUnsubEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.spi.LoggerContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

class SalesforceMarketingTest extends AbstractTest {

    @Test
    public void listAssetTypes() throws ETSdkException {
        ETClient client = new ETClient(this.getConf());

    }


    @Test
    public void createAsset() throws ETSdkException, IOException {
        ETClient client = new ETClient(this.getConf());

        ETAsset asset = new ETAsset();
        asset.setName("First Test");
        asset.setContent("Hello world!");

        asset.setContentType("text/plain");

        ETResponse<ETAsset> etAssetETResponse = client.create(asset);

        System.out.println("Response code : " + etAssetETResponse.getResults().get(0).getResponseCode());
        System.out.println("Response error code : " + etAssetETResponse.getResults().get(0).getErrorCode());
        System.out.println("Response status : " + etAssetETResponse.getResults().get(0).getStatus());
        System.out.println("Response message : " + etAssetETResponse.getResults().get(0).getResponseMessage());
        // The real error message is not returned, but only logged:
        // https://github.com/salesforce-marketingcloud/FuelSDK-Java/blob/bcc6960301ccbfbd2281c91e74078078eae38574/src/main/java/com/exacttarget/fuelsdk/ETRestObject.java#L432
        System.out.println("Response error message : " + etAssetETResponse.getResults().get(0).getErrorMessage());
    }

    @Test
    public void createRetrieveContentAreaWithFuelSDK() throws ETSdkException {
        ETClient client = new ETClient(this.getConf());

        ETContentArea ca = new ETContentArea();
        ca.setName("CA_YPL_11");
        ca.setContent("<b>Hello!</b>>");
        ETResponse<ETContentArea> createCAResponse = client.create(ca);
        // /!\ for some entities createCAResponse.getResponseCode() returns "200", for some others "OK"
        Assertions.assertEquals("OK", createCAResponse.getResponseCode());

        ETResponse<ETContentArea> retrieveCAResponse = client.retrieve(ETContentArea.class);
        Assertions.assertEquals("OK", retrieveCAResponse.getResponseCode());

        displayContentArea(retrieveCAResponse);

        System.out.println("End.");

    }

    @Test
    public void retrieveContentAreaWithFilter() throws ETSdkException {
        ETClient client = new ETClient(this.getConf());

        ETExpression exp = new ETExpression();
        exp.setProperty("name");
        exp.setValue("CA_YPL_09");
        exp.setOperator(ETExpression.Operator.EQUALS);

        ETFilter filter = new ETFilter();
        filter.setExpression(exp);

        ETResponse<ETContentArea> retrieveCAResponse = client.retrieve(ETContentArea.class, filter);
        displayContentArea(retrieveCAResponse);

        System.out.println("End.");
    }

    @Test
    public void createUnsubEvent() {
        ETUnsubEvent etUnsubEvent = new ETUnsubEvent();
        //etUnsubEvent.setList();
    }

    @Test
    public void getAllEntities() throws ClassNotFoundException, IOException {
        String packageName = "com.exacttarget.fuelsdk";
        String path = packageName.replace('.', '/');
        URL resource = ClassLoader.getSystemClassLoader().getResource(path);

        if (resource == null) {
            throw new ClassNotFoundException("No resource for " + path);
        }

        String jarPath = resource.getPath().substring(resource.getPath().indexOf(':') + 1, resource.getPath().indexOf('!'));
        List<Class> classes = getClassesInPackageFromJar(jarPath, packageName);
        List<EntityDesc> entities = classes.stream().map(EntityDesc::new).collect(Collectors.toList());

        System.out.println("Entites are :");
        for (EntityDesc e : entities) {
            System.out.println(e);
        }

        String file = "/tmp/SFMC_Entities.json";
        System.out.println("Write all entities in a json file: " + file);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(file), entities);

        System.out.println("END");
    }

    public List<Class> getClassesInPackageFromJar(String jarPath, String packageName) {
        List<Class> classes = new ArrayList<>();

        // Convert package name to a relative path
        String relPath = packageName.replace('.', '/');

        try (JarFile jarFile = new JarFile(jarPath)) {
            Enumeration<JarEntry> entries = jarFile.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String entryName = entry.getName();

                // Check if the entry is in the specified package and is a class (not a directory)
                if (entryName.startsWith(relPath) && entryName.endsWith(".class") && !entry.getName().contains("$")) {
                    // Remove ".class" from the end and convert the path to a fully qualified class name
                    String className = entryName.substring(0, entryName.length() - 6).replace('/', '.');
                    Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass(className);

                    if (ETSoapObject.class.isAssignableFrom(clazz) || ETRestObject.class.isAssignableFrom(clazz)) {
                        classes.add(clazz);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return classes;
    }

    @Data
    public static class EntityDesc {
        private final Class clazz;

        private Type type;
        private String name;
        private List<EntityAttribute> attributes;

        enum Type {
            REST,
            SOAP
        }

        public EntityDesc(Class clazz) {
            this.clazz = clazz;
            this.attributes = this.computeAttributes();
            this.type = this.computeType();
            this.name = this.computeName();
        }

        private Type computeType() {
            if (ETSoapObject.class.isAssignableFrom(this.getClazz())) {
                return Type.SOAP;
            } else if (ETRestObject.class.isAssignableFrom(this.getClazz())) {
                return Type.REST;
            }

            throw new RuntimeException("This entity doesn't extends nor SOAP not REST : " + this.clazz.getName());
        }

        private List<EntityAttribute> computeAttributes() {
            return Arrays.stream(this.clazz.getDeclaredMethods())
                    // Only setter
                    .filter(m -> m.getName().startsWith("set") &&
                            m.getReturnType().equals(void.class) &&
                            m.getParameterCount() == 1)
                    .map(m -> {
                        char first = Character.toLowerCase(m.getName().charAt(3));
                        String name = first + m.getName().substring(4);

                        EntityAttribute attribute = new EntityAttribute();
                        attribute.setName(name);

                        Class type = m.getParameterTypes()[0];
                        attribute.setType(type.getSimpleName());

                        return attribute;
                    })
                    .sorted(Comparator.comparing(EntityAttribute::getName))
                    .collect(Collectors.toList());

        }

        private String computeName() {
            return this.clazz.getSimpleName();
        }

        public String toString() {
            String params = this.attributes.stream().map(a -> new StringBuilder("\t").append(a.getName()).append(": ").append(a.getType())).collect(Collectors.joining("\n"));
            return String.format("%s:%s:%s(\n%s)", this.getName(), this.getType(), this.getClazz().getName(), params);
        }

    }

    @Data
    public static class EntityAttribute {
        private String name;
        private String type;
    }

    private void displayContentArea(ETResponse<ETContentArea> retrieveCAResponse) {
        List<ETResult<ETContentArea>> results = retrieveCAResponse.getResults();
        for (ETResult<ETContentArea> r : results) {
            ETContentArea contentAreaObj = r.getObject();
            System.out.println(String.format("Retrieved ContentArea %s %s : %s", contentAreaObj.getId(), contentAreaObj.getName(), contentAreaObj.getContent()));
        }
    }


}