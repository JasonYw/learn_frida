package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class ProfilePoiInfo {
    @SerializedName("city")
    public String city;
    @SerializedName("content")
    public String content;
    @SerializedName("icon")
    public ImageModel icon;
    @SerializedName("jump_schema")
    public String jumpSchema;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName("poi_id_str")
    public String poiIdStr;
    @SerializedName("poi_name")
    public String poiName;
    @SerializedName("is_poi_enabled")
    public boolean poiPermission;

    static {
        Covode.recordClassIndex(14176);
    }

    public String getCity() {
        return this.city;
    }

    public String getContent() {
        return this.content;
    }

    public ImageModel getIcon() {
        return this.icon;
    }

    public String getJumpSchema() {
        return this.jumpSchema;
    }

    public long getPoiId() {
        return this.poiId;
    }

    public String getPoiIdStr() {
        return this.poiIdStr;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public boolean isPoiPermission() {
        return this.poiPermission;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon(ImageModel imageModel) {
        this.icon = imageModel;
    }

    public void setJumpSchema(String str) {
        this.jumpSchema = str;
    }

    public void setPoiId(long j) {
        this.poiId = j;
    }

    public void setPoiIdStr(String str) {
        this.poiIdStr = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiPermission(boolean z) {
        this.poiPermission = z;
    }
}
