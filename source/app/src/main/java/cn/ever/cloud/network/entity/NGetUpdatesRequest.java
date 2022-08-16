package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C522126k2;

/* loaded from: classes23.dex */
public final class NGetUpdatesRequest {
    public static final C522126k2 Companion = new C522126k2(null);
    @SerializedName("cursor")
    public final String cursor;

    static {
        Covode.recordClassIndex(3216);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public NGetUpdatesRequest(String str) {
        this.cursor = str;
    }
}
