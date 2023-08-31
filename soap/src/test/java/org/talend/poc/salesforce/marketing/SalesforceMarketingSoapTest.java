package org.talend.poc.salesforce.marketing;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.talend.poc.salesforce.marketing.generated.PartnerAPI;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequest;
import org.talend.poc.salesforce.marketing.generated.RetrieveRequestMsg;
import org.talend.poc.salesforce.marketing.generated.RetrieveResponseMsg;
import org.talend.poc.salesforce.marketing.generated.SalesforceMarketingSOAP;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    public void cxfSOAPCall() throws MalformedURLException {
        URL resource = SalesforceMarketingSoapTest.class.getResource("/SalesforceMarketing.wsdl");
        PartnerAPI partnerAPI = new PartnerAPI(resource,
                new QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerAPI"));

        SalesforceMarketingSOAP salesforceMarketingSOAP = partnerAPI.getPort(SalesforceMarketingSOAP.class);


        /*RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Asset");
        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);
        RetrieveResponseMsg retrieve = partnerAPI.getSoap().retrieve(retrieveRequestMsg);*/

        System.out.println("End.");
    }

    @Test
    public void clientInstance() {
       /* GZIPFeature gzip = new GZIPFeature();
        gzip.setThreshold(1);
        JaxWsProxyFactoryBean factory = new
                JaxWsProxyFactoryBean();
        factory.getFeatures().add(gzip);
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new
                LoggingOutInterceptor());
        PartnerAPI service = new PartnerAPI();
        Soap s = service.getSoap();
        Client client = org.apache.cxf.frontend.ClientProxy.getClient(s);
        Map outProps = new HashMap();
        outProps.put(WSHandlerConstants.ACTION,
                WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER,PropertiesUtil.getInstance().getProperty("username"));
        System.out.println(PropertiesUtil.getInstance().getProperty("username"));
        outProps.put(WSHandlerConstants.PASSWORD_TYPE,WSConstants.PW_TEXT);
        // Automatically adds a Base64 encoded message nonce and a created timestamp
        outProps.put(WSHandlerConstants.ADD_UT_ELEMENTS,WSConstants.NONCE_LN + " " + WSConstants.CREATED_LN);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,

                ClientPasswordCallback.class.getName());
        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
        client.getOutInterceptors().add(wssOut);
        //Enable GZip compression
        Map<String, java.util.List<String httpHeaders = new HashMap<String, java.util.List<String();
        httpHeaders.put("Content-Encoding",Collections.singletonList("gzip"));
        httpHeaders.put("Accept-Encoding",Collections.singletonList("gzip"));
        Map<String, Object> reqContext = client.getRequestContext();
        reqContext.put(MessageContext.HTTP_REQUEST_HEADERS,httpHeaders); */
    }

    @Test
    public void getAccounts() {

    }


}