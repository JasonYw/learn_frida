package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.Map;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class EcRequest {
    public final ByteBuffer body;
    public final Map<String, String> headers;
    public final String method;
    public final String url;

    static {
        Covode.recordClassIndex(3397);
    }

    public final ByteBuffer getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public EcRequest(String str, String str2, Map<String, String> map, ByteBuffer byteBuffer) {
        C106862S5w.LIZ(str, str2, map, byteBuffer);
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.body = byteBuffer;
    }
}
