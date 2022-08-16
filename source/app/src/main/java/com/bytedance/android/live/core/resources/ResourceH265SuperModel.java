package com.bytedance.android.live.core.resources;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class ResourceH265SuperModel {
    @SerializedName("md5")
    public String md5;
    @SerializedName("resource_url")
    public C4086b resourceModel;
    @SerializedName("resource_uri")
    public String resourceUri;

    static {
        Covode.recordClassIndex(23583);
    }

    public String getMd5() {
        return this.md5;
    }

    public C4086b getResourceModel() {
        return this.resourceModel;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setResourceModel(C4086b c4086b) {
        this.resourceModel = c4086b;
    }

    public void setResourceUri(String str) {
        this.resourceUri = str;
    }
}
