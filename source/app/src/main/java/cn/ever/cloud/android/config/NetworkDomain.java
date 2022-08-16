package cn.ever.cloud.android.config;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NetworkDomain {
    public final String host;
    public final boolean isHttps;

    static {
        Covode.recordClassIndex(2836);
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public NetworkDomain(String str, boolean z) {
        C106862S5w.LIZ(str);
        this.host = str;
        this.isHttps = z;
    }
}
