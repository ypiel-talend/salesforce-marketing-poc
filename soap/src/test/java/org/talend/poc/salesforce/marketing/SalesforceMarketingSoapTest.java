package org.talend.poc.salesforce.marketing;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.phase.PhaseInterceptor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.talend.poc.salesforce.marketing.generated.Asset;
import org.talend.poc.salesforce.marketing.generated.CreateOptions;
import org.talend.poc.salesforce.marketing.generated.CreateRequest;
import org.talend.poc.salesforce.marketing.generated.CreateResponse;
import org.talend.poc.salesforce.marketing.generated.NameIdReference;
import org.talend.poc.salesforce.marketing.generated.PartnerAPI;
import org.talend.poc.salesforce.marketing.generated.RetrieveOptions;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequest;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequestMsg;
import org.talend.poc.salesforce.marketing.generated.RetrieveResponseMsg;
import org.talend.poc.salesforce.marketing.generated.SalesforceMarketingSOAP;
import org.talend.poc.salesforce.marketing.generated.VersionInfoRequestMsg;
import org.talend.poc.salesforce.marketing.generated.VersionInfoResponse;
import org.talend.poc.salesforce.marketing.generated.VersionInfoResponseMsg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SalesforceMarketingSoapTest extends AbstractTest {

    private static String token;

    @BeforeAll
    public static void retrieveOAUTHToken() throws IOException, InterruptedException {
        // retrieve OAuth token
        token = retrieveTokenOAUTHClientCredentials();
    }

    @Disabled
    @Test
    public void getWSDL() throws IOException, InterruptedException {
        Properties prop = loadConf();
        String soap_endpoint = prop.getProperty("soap_url");
        String soap_wsdl = soap_endpoint + "etframework.wsdl";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(soap_wsdl))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new RuntimeException("Can't retrieve WSDL. Status: " + response.statusCode() + "\n Body: " + body);
        }

        String wsdlPath = "/tmp/SFM_WSDL.xml";
        System.out.println("WSDL written to " + wsdlPath);
        Files.writeString(Paths.get(wsdlPath), body);
    }

    @Test
    public void retrieveVersion() throws IOException, InterruptedException, JAXBException {
        // This is the service
        PartnerAPI partnerAPI = new PartnerAPI();

        // This is the port
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);

        VersionInfoRequestMsg versionInfoRequestMsg = new VersionInfoRequestMsg();
        versionInfoRequestMsg.setIncludeVersionHistory(true);

        setOAuthTokenInSOAPMessage(salesforceMarketingSOAP);

        // Do the call
        VersionInfoResponseMsg versionInfoResponseMsg = salesforceMarketingSOAP.versionInfo(versionInfoRequestMsg);

        VersionInfoResponse versionInfo = versionInfoResponseMsg.getVersionInfo();
        System.out.println("Version: " + versionInfo.getVersion() + "\n\tNotes: " + versionInfo.getNotes() + "\n\tDate: " + versionInfo.getVersionDate());

        System.out.println("End.");
    }

    @Test
    @Disabled
    public void retrieveAssets() throws IOException, InterruptedException, JAXBException {
        // This is the service
        PartnerAPI partnerAPI = new PartnerAPI();

        // This is the port
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);
        setOAuthTokenInSOAPMessage(salesforceMarketingSOAP);


        RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Link");
        retrieveRequest.setQueryAllAccounts(true);

        RetrieveOptions retrieveOptions = new RetrieveOptions();
        retrieveOptions.setBatchSize(500);
        retrieveOptions.setIncludeObjects(true);

        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        retrieveRequest.setOptions(retrieveOptions);
        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);
        RetrieveResponseMsg retrieveResponseMsg = salesforceMarketingSOAP.retrieve(retrieveRequestMsg);

        System.out.println("Overall status : " + retrieveResponseMsg.getOverallStatus());


        /*List<APIObject> results = retrieveResponseMsg.getResults();
        for (APIObject o : results) {
            Message a = (Message) o;
            System.out.println("=> " + a.getTextBody());
        }*/

    }

    @Test
    public void createAsset() throws JAXBException, IOException {
        // Set logger
        InputStream confLogStream = SalesforceMarketingSoapTest.class.getResourceAsStream("/log.conf");
        LogManager.getLogManager().readConfiguration(confLogStream);

        Logger ClientImplLogger = Logger.getLogger("org.apache.cxf.endpoint.ClientImpl");
        FileHandler fh = new FileHandler("/tmp/ClientImpl.log", false);
        fh.setLevel(Level.ALL);
        ClientImplLogger.addHandler(fh);

        // SOAP call
        PartnerAPI partnerAPI = new PartnerAPI();
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);
        setOAuthTokenInSOAPMessage(salesforceMarketingSOAP);

        Asset asset = new Asset();
        asset.setName("SOAP Asset 1");
        asset.setContent("A content from SOAP.");

        QName qName = new QName("http://www.example.com", "myElement");
        NameIdReference nameIdReference = new NameIdReference();
        JAXBElement<Long> longJAXBElement = new JAXBElement<Long>(qName, Long.class, 1L);
        nameIdReference.setId(longJAXBElement);
        asset.setAssetType(nameIdReference);

        CreateRequest createRequest = new CreateRequest();
        createRequest.getObjects().add(asset);
        CreateResponse createResponse = salesforceMarketingSOAP.create(createRequest);

        System.out.println("Create / Overall status: " + createResponse.getOverallStatus());
    }

    @Disabled
    @Test
    public void createAsset_test() throws JAXBException, IOException {

        FileInputStream confLog = new FileInputStream("/tmp/log.prop");
        LogManager.getLogManager().readConfiguration(confLog);

        Logger logger = Logger.getLogger("org.apache.cxf.endpoint.ClientImpl");
        FileHandler fh = new FileHandler("/tmp/log.log", false);
        fh.setLevel(Level.ALL);
        logger.addHandler(fh);


        // This is the service
        PartnerAPI partnerAPI = new PartnerAPI();

        // This is the port
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);
        setOAuthTokenInSOAPMessage(salesforceMarketingSOAP);

        Asset asset = new Asset();
        asset.setName("SOAP Asset 1");
        asset.setContent("A content from SOAP.");

        QName qName = new QName("http://www.example.com", "myElement");
        NameIdReference nameIdReference = new NameIdReference();
        JAXBElement<Long> longJAXBElement = new JAXBElement<Long>(qName, Long.class, 1L);
        nameIdReference.setId(longJAXBElement);
        asset.setAssetType(nameIdReference);

        CreateOptions createOptions = new CreateOptions();

        CreateRequest createRequest = new CreateRequest();
        createRequest.setOptions(createOptions);
        createRequest.getObjects().add(asset);

        Client client = ClientProxy.getClient(salesforceMarketingSOAP);

        client.getOutFaultInterceptors().add(new MyOutInterceptor("YPLgetOutFaultInterceptors", Phase.RECEIVE, true));
        client.getOutInterceptors().add(new MyOutInterceptor("YPLgetOutInterceptors", Phase.RECEIVE, true));

        client.getInFaultInterceptors().add(new MyOutInterceptor("YPLgetInFaultInterceptors", Phase.PREPARE_SEND, true));
        client.getInInterceptors().add(new MyOutInterceptor("YPLgetInInterceptors", Phase.PREPARE_SEND, true));

        client.getOutFaultInterceptors().add(new MyOutInterceptor("YPLXXgetOutFaultInterceptors", Phase.POST_LOGICAL, true));
        client.getOutInterceptors().add(new MyOutInterceptor("YPLXXgetOutInterceptors", Phase.POST_LOGICAL, true));

        client.getInFaultInterceptors().add(new MyOutInterceptor("YPLYYgetInFaultInterceptors", Phase.RECEIVE, true));
        client.getInInterceptors().add(new MyOutInterceptor("YPLYYgetInInterceptors", Phase.RECEIVE, true));


        client.getOutInterceptors().add(new DisplayXMLInterceptor("OUT", Phase.PRE_STREAM, true));


        CreateResponse createResponse = salesforceMarketingSOAP.create(createRequest);
        System.out.println("Create / Overall status: " + createResponse.getOverallStatus());
    }

    public static class MyOutInterceptor extends AbstractPhaseInterceptor<Message> {
        public MyOutInterceptor(String id, String phase, boolean uniq) {
            super(id+"/"+phase, phase, uniq);
        }

        @Override
        public void handleMessage(Message message) throws Fault {
            System.out.println("XXXXXXXXXXXXXXXX " + this.getId() + " : " + message.getContent(String.class));
            // Custom logic
        }
    }


    public static class DisplayXMLInterceptor extends AbstractPhaseInterceptor<Message> {
        public DisplayXMLInterceptor(String id, String phase, boolean uniq) {
            super("DisplayXML/" + id+"/"+phase, phase, uniq);
        }

        @Override
        public void handleMessage(Message message) throws Fault {
            try {
                InputStream is = message.getContent(InputStream.class);
                if(is == null){
                    System.out.println("INPUT STREAM is NULL !!!!!!!!!!!!!!!!!!!!!!!!!!");
                    return;
                }
                String xmlContent = new Scanner(is).useDelimiter("\\A").next();

                // Reset the input stream so the message can continue to be processed
                message.setContent(InputStream.class, new ByteArrayInputStream(xmlContent.getBytes()));

                // Do something with xmlContent, like validate or log it
                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZz XML content: \n" + xmlContent);

            } catch (Exception e) {
                throw new Fault(e);
            }
        }
    }

    /**
     * The token is retrieve in @BeforeAll method, this method set the token in the SOAP message.
     *
     * @param port
     * @throws JAXBException
     */
    private void setOAuthTokenInSOAPMessage(SalesforceMarketingSOAP port) throws JAXBException {
        // Authenticate with an Access Token
        // https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/authenticate-soap-api.html
        QName qnFuelOAuth = new QName("fueloauth");
        Header header = new Header(qnFuelOAuth, token, new JAXBDataBinding(String.class));
        Client client = ClientProxy.getClient(port);
        Map<String, Object> requestContext = client.getRequestContext();
        List<Header> headers = (List<Header>) requestContext.get(Header.HEADER_LIST);
        if (headers == null) {
            headers = new ArrayList<>();
            requestContext.put(Header.HEADER_LIST, headers);
        }
        headers.add(header);
    }

    @Test
    public void displayToken(){
        System.out.println("=> TOKEN\n" + token + "\n---------------------");
    }

    /**
     * Documentation : https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/integration-s2s-client-credentials.html
     *
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    private static String retrieveTokenOAUTHClientCredentials() throws IOException, InterruptedException {
        System.out.println("* Retrieve token...");

        Properties prop = loadConf();

        HttpClient client = HttpClient.newHttpClient();

        String clientId = prop.getProperty("client_id");
        String clientSecret = prop.getProperty("client_secret");

        String payload = "{\n" +
                "\"grant_type\": \"client_credentials\",\n" +
                "\"client_id\": \"" + clientId + "\",\n" +
                "\"client_secret\": \"" + clientSecret + "\"\n" +
                "}";

        String authEndpoint = prop.getProperty("authent_url") + "v2/token";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authEndpoint))
                .header("Content-Type", "application/json")
                //.header("User-Agent", "FuelSDK-Java-v1.5.0-REST-POST-token") // The fuel library set this header.
                .POST(HttpRequest.BodyPublishers.ofString(payload, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Can't retrieve OAuth token. Status: " + response.statusCode() + "\n Body: " + response.body());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        OAuthResponse oAuthResponse = objectMapper.readValue(response.body(), OAuthResponse.class);

        String token = oAuthResponse.getAccess_token();
        System.out.println("Retrieved token : " + token.substring(0, 15) + "...");
        return token;
    }

    @Data
    public static class OAuthResponse {
        private String access_token;
        private String token_type;
        private long expires_in;
        private String scope;
        private String soap_instance_url;
        private String rest_instance_url;
    }


}