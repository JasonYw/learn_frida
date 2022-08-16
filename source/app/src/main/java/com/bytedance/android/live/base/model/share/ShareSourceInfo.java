package com.bytedance.android.live.base.model.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes28.dex */
public class ShareSourceInfo {
    @SerializedName("app_name")
    public String appName;
    @SerializedName("img_title")
    public String imgTitle;
    @SerializedName("img_url")
    public ImageModel imgUrl;
    @SerializedName("pkg_name")
    public String pkgName;
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("title")
    public String title;

    static {
        Covode.recordClassIndex(14122);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getImgTitle() {
        return this.imgTitle;
    }

    public ImageModel getImgUrl() {
        return this.imgUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setImgTitle(String str) {
        this.imgTitle = str;
    }

    public void setImgUrl(ImageModel imageModel) {
        this.imgUrl = imageModel;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
