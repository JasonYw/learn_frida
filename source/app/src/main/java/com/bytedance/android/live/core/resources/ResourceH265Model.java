package com.bytedance.android.live.core.resources;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class ResourceH265Model {
    @SerializedName("md5")
    public String md5;
    @SerializedName("resource_url")
    public C4086b resourceModel;
    @SerializedName("resource_uri")
    public String resourceUri;
    @SerializedName("size")
    public String size;
    @SerializedName("ttmd5")
    public String ttmd5;

    static {
        Covode.recordClassIndex(23582);
    }

    public String getMD5() {
        return this.md5;
    }

    public String getSize() {
        return this.size;
    }

    @SerializedName("md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @SerializedName("size")
    public void setSize(String str) {
        this.size = str;
    }
}
