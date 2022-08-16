package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.e */
/* loaded from: classes2.dex */
public final class C1157e extends DefaultRedirectHandler {

    /* renamed from: a */
    public int f21881a;

    /* renamed from: b */
    public final /* synthetic */ C1156d f21882b;

    static {
        Covode.recordClassIndex(4628);
    }

    public C1157e(C1156d c1156d) {
        this.f21882b = c1156d;
    }

    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f21881a++;
        boolean isRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (isRedirectRequested || this.f21881a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
            return isRedirectRequested;
        }
        return true;
    }
}
