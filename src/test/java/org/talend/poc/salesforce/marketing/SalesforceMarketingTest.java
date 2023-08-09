package org.talend.poc.salesforce.marketing;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETConfiguration;
import com.exacttarget.fuelsdk.ETContentArea;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.ETResult;
import com.exacttarget.fuelsdk.ETSdkException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

class SalesforceMarketingTest {

    @Test
    public void createRetrieveContentAreaWithFuelSDK() throws ETSdkException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("/tmp/salesforce.properties"));

        ETConfiguration conf = new ETConfiguration();
        conf.set("clientId", prop.getProperty("client_id"));
        conf.set("clientSecret", prop.getProperty("client_secret"));
        conf.set("endpoint", prop.getProperty("rest_url"));
        conf.set("soapEndpoint", prop.getProperty("soap_url"));
        conf.set("authEndpoint", prop.getProperty("authent_url"));
        conf.set("useOAuth2Authentication", "true");
        ETClient client = new ETClient(conf);
        Z
        ETContentArea ca = new ETContentArea();
        ca.setName("CA_YPL_07");
        ca.setContent("<b>Hello!</b>>");
        ETResponse<ETContentArea> createCAResponse = client.create(ca);
        Assertions.assertEquals("OK", createCAResponse.getResponseCode());

        ETResponse<ETContentArea> retrieveCAResponse = client.retrieve(ETContentArea.class);
        Assertions.assertEquals("OK", retrieveCAResponse.getResponseCode());

        List<ETResult<ETContentArea>> results = retrieveCAResponse.getResults();
        for(ETResult<ETContentArea> r : results){
            ETContentArea contentAreaObj = r.getObject();
            System.out.println(String.format("Retrieved ContentArea %s %s : %s", contentAreaObj.getId(), contentAreaObj.getName(), contentAreaObj.getContent()));
        }

        System.out.println("End.");

    }


}