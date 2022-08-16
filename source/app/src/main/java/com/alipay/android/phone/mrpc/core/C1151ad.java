package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.ad */
/* loaded from: classes2.dex */
public class C1151ad implements HttpRequestRetryHandler {

    /* renamed from: a */
    public static final String f21870a = C1151ad.class.getSimpleName();

    static {
        Covode.recordClassIndex(4622);
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        if (i >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        return ((iOException instanceof SocketException) || (iOException instanceof SSLException)) && iOException.getMessage() != null && iOException.getMessage().contains("Broken pipe");
    }
}
