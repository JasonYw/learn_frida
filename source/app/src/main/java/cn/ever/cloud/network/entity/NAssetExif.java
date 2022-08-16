package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class NAssetExif {
    @SerializedName("exposureTime")
    public final String exposureTime;
    @SerializedName("fNumber")
    public final Long fNumber;
    @SerializedName("flash")
    public final Long flash;
    @SerializedName("focalLength")
    public final Double focalLength;
    @SerializedName("iso")
    public final Long iso;
    @SerializedName("manufacturer")
    public final String manufacturer;
    @SerializedName("model")
    public final String model;

    static {
        Covode.recordClassIndex(3191);
    }

    public final String getExposureTime() {
        return this.exposureTime;
    }

    public final Long getFNumber() {
        return this.fNumber;
    }

    public final Long getFlash() {
        return this.flash;
    }

    public final Double getFocalLength() {
        return this.focalLength;
    }

    public final Long getIso() {
        return this.iso;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public NAssetExif(String str, String str2, Long l, String str3, Long l2, Double d, Long l3) {
        this.manufacturer = str;
        this.model = str2;
        this.fNumber = l;
        this.exposureTime = str3;
        this.iso = l2;
        this.focalLength = d;
        this.flash = l3;
    }
}
