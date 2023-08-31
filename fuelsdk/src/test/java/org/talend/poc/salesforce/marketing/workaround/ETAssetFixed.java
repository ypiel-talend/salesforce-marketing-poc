package org.talend.poc.salesforce.marketing.workaround;

import com.exacttarget.fuelsdk.ETAsset;
import com.exacttarget.fuelsdk.annotations.ExternalName;
import com.exacttarget.fuelsdk.annotations.RestObject;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
@RestObject(path = "/asset/v1/content/assets",
        primaryKey = "id",
        collection = "items",
        totalCount = "count")
public class ETAssetFixed extends ETAsset {

    @Expose
    @ExternalName("AssetType")
    private AssetType assetType = null;

    @Data
    public static class AssetType {

        @Expose
        @ExternalName("id")
        private int id;

    }
}
