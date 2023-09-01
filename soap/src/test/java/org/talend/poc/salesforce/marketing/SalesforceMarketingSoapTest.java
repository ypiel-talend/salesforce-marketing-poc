package org.talend.poc.salesforce.marketing;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.talend.poc.salesforce.marketing.generated.PartnerAPI;
import org.talend.poc.salesforce.marketing.generated.SalesforceMarketingSOAP;
import org.talend.poc.salesforce.marketing.generated.VersionInfoRequestMsg;
import org.talend.poc.salesforce.marketing.generated.VersionInfoResponse;
import org.talend.poc.salesforce.marketing.generated.VersionInfoResponseMsg;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
    public void cxfSOAPCall() throws IOException, InterruptedException, JAXBException {
        String token = retrieveTokenOAUTHClientCredentials();

        URL resource = SalesforceMarketingSoapTest.class.getResource("/SalesforceMarketing.wsdl");

        // This is the service
        PartnerAPI partnerAPI = new PartnerAPI();

        // This is the port
        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);

        VersionInfoRequestMsg versionInfoRequestMsg = new VersionInfoRequestMsg();
        versionInfoRequestMsg.setIncludeVersionHistory(true);

        // Authenticate with an Access Token
        // https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/authenticate-soap-api.html
        QName qnFuelOAuth = new QName("fueloauth");
        Header header = new Header(qnFuelOAuth, token, new JAXBDataBinding(String.class));
        Client client = ClientProxy.getClient(salesforceMarketingSOAP);
        Map<String, Object> requestContext = client.getRequestContext();
        List<Header> headers = (List<Header>) requestContext.get(Header.HEADER_LIST);
        if (headers == null) {
            headers = new ArrayList<>();
            requestContext.put(Header.HEADER_LIST, headers);
        }
        headers.add(header);

        // Do the call
        VersionInfoResponseMsg versionInfoResponseMsg = salesforceMarketingSOAP.versionInfo(versionInfoRequestMsg);

        VersionInfoResponse versionInfo = versionInfoResponseMsg.getVersionInfo();
        System.out.println("Version: " + versionInfo.getVersion() + "\n\tNotes: " + versionInfo.getNotes()+"\n\tDate: "+ versionInfo.getVersionDate());

        System.out.println("End.");
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