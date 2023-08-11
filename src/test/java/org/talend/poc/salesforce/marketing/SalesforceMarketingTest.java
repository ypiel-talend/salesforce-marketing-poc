package org.talend.poc.salesforce.marketing;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETConfiguration;
import com.exacttarget.fuelsdk.ETContentArea;
import com.exacttarget.fuelsdk.ETExpression;
import com.exacttarget.fuelsdk.ETFilter;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.ETResult;
import com.exacttarget.fuelsdk.ETSdkException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

class SalesforceMarketingTest {

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

    @Test
    public void createRetrieveContentAreaWithFuelSDK() throws ETSdkException {
        ETClient client = new ETClient(conf);

        ETContentArea ca = new ETContentArea();
        ca.setName("CA_YPL_09");
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
        ETClient client = new ETClient(conf);

        ETExpression exp = new ETExpression();
        exp.setProperty("name");
        exp.setValue("CA_YPL_08");
        exp.setOperator(ETExpression.Operator.EQUALS);

        ETFilter filter = new ETFilter();
        filter.setExpression(exp);

        ETResponse<ETContentArea> retrieveCAResponse = client.retrieve(ETContentArea.class, filter);
        displayContentArea(retrieveCAResponse);

        System.out.println("End.");
    }

    private void displayContentArea(ETResponse<ETContentArea> retrieveCAResponse ){
        List<ETResult<ETContentArea>> results = retrieveCAResponse.getResults();
        for(ETResult<ETContentArea> r : results){
            ETContentArea contentAreaObj = r.getObject();
            System.out.println(String.format("Retrieved ContentArea %s %s : %s", contentAreaObj.getId(), contentAreaObj.getName(), contentAreaObj.getContent()));
        }
    }


}