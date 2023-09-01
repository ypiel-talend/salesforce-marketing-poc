package org.talend.poc.salesforce.marketing;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.common.gzip.GZIPFeature;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.talend.poc.salesforce.marketing.generated.CreateRequest;
import org.talend.poc.salesforce.marketing.generated.PartnerAPI;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequest;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequestMsg;
import org.talend.poc.salesforce.marketing.generated.RetrieveResponseMsg;
import org.talend.poc.salesforce.marketing.generated.SalesforceMarketingSOAP;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import java.io.IOException;
import java.net.CacheRequest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SalesforceMarketingSoapTest extends AbstractTest {

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
    public void cxfSOAPCall() throws IOException, InterruptedException {
        String token = retrieveTokenOAUTHClientCredentials();

        URL resource = SalesforceMarketingSoapTest.class.getResource("/SalesforceMarketing.wsdl");

        // This is the service
        PartnerAPI partnerAPI = new PartnerAPI(); //(resource, new QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerAPI"));
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);

        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Assets");

        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);
        RetrieveResponseMsg retrieve = salesforceMarketingSOAP.retrieve(retrieveRequestMsg);


        QName qnFuelOAuth = new QName("fueloauth");
        Document document = DOMUtils.createDocument();
        Element fueloauth = document.createElementNS(null, "fueloauth");
        fueloauth.setTextContent(token);

        SoapHeader header = new SoapHeader(qnFuelOAuth, fueloauth);

       /* SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);
        Client client = org.apache.cxf.frontend.ClientProxy.getClient(salesforceMarketingSOAP);

        salesforceMarketingSOAP.retrieve()*/


        /* RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Asset");
        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);

        RetrieveResponseMsg retrieve = partnerAPI.getSoap().retrieve(retrieveRequestMsg); */

        /*RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Asset");
        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);
        RetrieveResponseMsg retrieve = partnerAPI.getSoap().retrieve(retrieveRequestMsg);*/

        System.out.println("End.");
    }

    @Test
    public void clientInstance() throws IOException {
        // Code is coming from:
        // https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/connecting_to_the_soap_api_using_java_and_cxf.html

       /* Properties prop = loadConf();
        String clientId = prop.getProperty("client_id");
        String clientSecret = prop.getProperty("client_secret");

        GZIPFeature gzip = new GZIPFeature();
        gzip.setThreshold(1);
        JaxWsProxyFactoryBean factory = new
                JaxWsProxyFactoryBean();
        factory.getFeatures().add(gzip);
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new
                LoggingOutInterceptor());
        PartnerAPI service = new PartnerAPI();
        SalesforceMarketingSOAP salesforceMarketingSOAP = service.getSoap();
        Client client = org.apache.cxf.frontend.ClientProxy.getClient(salesforceMarketingSOAP);
        Map outProps = new HashMap();
        outProps.put(WSHandlerConstants.ACTION,
                WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER, clientId);
        System.out.println(clientId);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        // Automatically adds a Base64 encoded message nonce and a created timestamp
        outProps.put(WSHandlerConstants.ADD_UT_ELEMENTS,WSConstants.NONCE_LN + " " + WSConstants.CREATED_LN);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,
                ClientPasswordCallback.class.getName());
        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
        client.getOutInterceptors().add(wssOut);
        //Enable GZip compression
        Map<String, java.util.List<String httpHeaders = new HashMap<String, java.util.List<String();
        httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
        httpHeaders.put("Accept-Encoding",Collections.singletonList("gzip"));
        Map<String, Object> reqContext = client.getRequestContext();
        reqContext.put(MessageContext.HTTP_REQUEST_HEADERS,httpHeaders);*/
    }

    @Test
    public void getAccounts() {

    }

    /**
     * Documentation : https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/integration-s2s-client-credentials.html
     *
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    private String retrieveTokenOAUTHClientCredentials() throws IOException, InterruptedException {
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