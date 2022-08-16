package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NGps {
    @SerializedName("latitude")
    public final double latitude;
    @SerializedName("longitude")
    public final double longitude;

    static {
        Covode.recordClassIndex(3223);
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public NGps(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }
}
