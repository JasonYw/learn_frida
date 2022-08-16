package cn.ever.cloud.network.retrofit;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes23.dex */
public final class NetResponse {
    public final AbstractC0738a body;
    public final Object extraInfo;
    public final Map<String, String> headers;
    public final String reason;
    public final int status;

    static {
        Covode.recordClassIndex(3255);
    }

    public final AbstractC0738a getBody() {
        return this.body;
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getStatus() {
        return this.status;
    }

    public NetResponse(int i, String str, Map<String, String> map, AbstractC0738a abstractC0738a, Object obj) {
        this.status = i;
        this.reason = str;
        this.headers = map;
        this.body = abstractC0738a;
        this.extraInfo = obj;
    }
}
