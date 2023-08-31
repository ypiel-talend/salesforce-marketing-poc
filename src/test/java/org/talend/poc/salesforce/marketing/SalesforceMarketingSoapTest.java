package org.talend.poc.salesforce.marketing;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SalesforceMarketingSoapTest extends AbstractTest {

    @Test
    public void getWSDL() throws IOException, InterruptedException {
        String soap_endpoint = this.getConf().get("soapEndpoint");
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
    public void getAccounts(){

    }


}