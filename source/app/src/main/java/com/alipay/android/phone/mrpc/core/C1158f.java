package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.f */
/* loaded from: classes2.dex */
public final class C1158f implements ConnectionKeepAliveStrategy {

    /* renamed from: a */
    public final /* synthetic */ C1156d f21883a;

    static {
        Covode.recordClassIndex(4629);
    }

    public C1158f(C1156d c1156d) {
        this.f21883a = c1156d;
    }

    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000L;
    }
}
