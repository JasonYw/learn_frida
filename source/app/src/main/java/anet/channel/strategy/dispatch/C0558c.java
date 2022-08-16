package anet.channel.strategy.dispatch;

import com.bytedance.covode.number.Covode;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.strategy.dispatch.c */
/* loaded from: classes2.dex */
public final class C0558c implements HostnameVerifier {
    static {
        Covode.recordClassIndex(2326);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(DispatchConstants.getAmdcServerDomain(), sSLSession);
    }
}
