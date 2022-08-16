package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class EcResponse {
    public final ByteBuffer body;
    public final int httpCode;
    public final String message;

    static {
        Covode.recordClassIndex(3398);
    }

    public final ByteBuffer getBody() {
        return this.body;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public EcResponse(int i, String str, ByteBuffer byteBuffer) {
        C106862S5w.LIZ(str, byteBuffer);
        this.httpCode = i;
        this.message = str;
        this.body = byteBuffer;
    }
}
