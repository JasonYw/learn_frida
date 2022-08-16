package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class MediaAdInfo {
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("title")
    public String title;

    static {
        Covode.recordClassIndex(14084);
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
