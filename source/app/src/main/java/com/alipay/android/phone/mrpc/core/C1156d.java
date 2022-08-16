package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.C1152b;
import com.bytedance.covode.number.Covode;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.d */
/* loaded from: classes2.dex */
public final class C1156d extends DefaultHttpClient {

    /* renamed from: a */
    public final /* synthetic */ C1152b f21880a;

    static {
        Covode.recordClassIndex(4627);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156d(C1152b c1152b, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f21880a = c1152b;
    }

    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new C1158f(this);
    }

    public final HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    public final BasicHttpProcessor createHttpProcessor() {
        HttpRequestInterceptor httpRequestInterceptor;
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        httpRequestInterceptor = C1152b.f21873c;
        createHttpProcessor.addRequestInterceptor(httpRequestInterceptor);
        createHttpProcessor.addRequestInterceptor(new C1152b.C1153a(this.f21880a, (byte) 0));
        return createHttpProcessor;
    }

    public final RedirectHandler createRedirectHandler() {
        return new C1157e(this);
    }
}
