package cn.ever.cloud.network.api;

import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ApiBundle {
    public final String baseUrl;
    public final String sourceFrom;

    static {
        Covode.recordClassIndex(3169);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getSourceFrom() {
        return this.sourceFrom;
    }

    public ApiBundle(String str, boolean z, String str2) {
        String str3;
        C106862S5w.LIZ(str, str2);
        this.sourceFrom = str2;
        new StringBuilder();
        if (z) {
            str3 = "https://";
        } else {
            str3 = "http://";
        }
        this.baseUrl = C0002O.m25086C(str3, str);
    }
}
