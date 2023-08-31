package org.talend.poc.salesforce.marketing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Disabled
public class SalesforceMarketingHTTPTest extends AbstractTest {

    @Test
    public void retrieveAssetCategories() throws IOException, InterruptedException {
        Properties prop = loadConf();

        String token = retrieveTokenOAUTHClientCredentials();

        System.out.println("Retrieve assets categories...");

        String rest_endpoint = prop.getProperty("rest_url") + "asset/v1/content/categories?$page=1&$pagesize=100";
        System.out.println("Query : " + rest_endpoint);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rest_endpoint))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Can't retrieve Assets categories. Status: " + response.statusCode() + "\n Body: " + response.body());
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body());
        JsonNode items = root.get("items");
        for(JsonNode elt : items){
            System.out.println(String.format("%s: %s - %s", elt.get("id"), elt.get("name").asText(), elt.get("description").asText()));
        }


        System.out.println("Done.");
    }

    @Test
    public void createAsset() throws IOException, InterruptedException {
        String token = retrieveTokenOAUTHClientCredentials();
         createAsset_(token,"Fourth", "4444", 1);
    }

    /**
     * Documentation : https://developer.salesforce.com/docs/marketing/marketing-cloud/guide/getCampaignCollection.html
     *
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void retrieveAssets() throws IOException, InterruptedException {
        String token = retrieveTokenOAUTHClientCredentials();
        List<Asset> assetList = retrieveAssets(token);
        for(Asset a : assetList){
            System.out.println("\t - " + a);
        }
    }


    private List<Asset> retrieveAssets(String token) throws IOException, InterruptedException {
        System.out.println("Retrieve campaigns...");

        Properties prop = loadConf();

        String rest_endpoint = prop.getProperty("rest_url") + "asset/v1/content/assets?$page=1&$pageSize=50";
        System.out.println("Query : " + rest_endpoint);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rest_endpoint))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Can't retrieve Assets. Status: " + response.statusCode() + "\n Body: " + response.body());
        }
        System.out.println("Assets ok. Status: " + response.statusCode() + "\n Body: " + response.body());

        ObjectMapper objectMapper = new ObjectMapper();
        List<Asset> assetList = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body());
        JsonNode items = root.get("items");
        for(JsonNode elt : items){
            Asset asset = objectMapper.treeToValue(elt, Asset.class);
            assetList.add(asset);
        }


        System.out.println(String.format("'%s' assets retrieved.", assetList.size()));
        return assetList;
    }

    private void createAsset_(String token, String name, String data, int typeId) throws IOException, InterruptedException {
        System.out.println("Create asset...");

        Properties prop = loadConf();

        String payload = loadResource("/rest/createAsset.json");
        payload = payload.replace("__NAME__", name);
        payload = payload.replace("__MSG__", data);
        payload = payload.replace("__ASSET_TYPE_ID__", String.valueOf(typeId));
        //payload = payload.replace("__ASSERT_TYPE_NAME__", typeName);

        String rest_endpoint = prop.getProperty("rest_url") + "asset/v1/content/assets";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rest_endpoint))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(payload, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new RuntimeException("Can't create asset. Status: " + response.statusCode() + "\n Body: " + response.body());
        }

        System.out.println("Asset created.");

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

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Asset {
        private int id;
        private String name;
        private AssetType assetType;
        private CreatedBy createdBy;
        private NestedData data;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatedBy {
        private int id;
        private String email;
        private String name;
        private String userId;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AssetType {
        private int id;
        private String name;
        private String displayName;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NestedData {
        private String message;
    }

}
