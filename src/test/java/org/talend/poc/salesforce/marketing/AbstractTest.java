package org.talend.poc.salesforce.marketing;

import com.exacttarget.fuelsdk.ETConfiguration;
import org.junit.jupiter.api.BeforeAll;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.stream.Collectors;

public abstract class AbstractTest {

    private static ETConfiguration conf;

    @BeforeAll
    public static void loadConf() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("/tmp/salesforce.properties"));

        conf = new ETConfiguration();
        conf.set("clientId", prop.getProperty("client_id"));
        conf.set("clientSecret", prop.getProperty("client_secret"));
        conf.set("endpoint", prop.getProperty("rest_url"));
        conf.set("soapEndpoint", prop.getProperty("soap_url"));
        conf.set("authEndpoint", prop.getProperty("authent_url"));
        conf.set("useOAuth2Authentication", "true");
    }

    protected ETConfiguration getConf(){
        return conf;
    }

    public static String loadResource(String path){
        InputStream stream = AbstractTest.class.getResourceAsStream(path);
        String str = loadString(stream);
        return str;
    }

    public static String loadString(InputStream resourceAsStream) {
        InputStreamReader isr = new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String content = br.lines().collect(Collectors.joining("\n"));
        return content;
    }

}
