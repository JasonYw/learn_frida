package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.c */
/* loaded from: classes2.dex */
public final class C1155c implements HttpRequestInterceptor {
    static {
        Covode.recordClassIndex(4626);
    }

    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new RuntimeException("This thread forbids HTTP requests");
    }
}
