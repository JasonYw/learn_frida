package anet.channel.session;

import com.bytedance.covode.number.Covode;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.session.c */
/* loaded from: classes19.dex */
public final class C0536c implements HostnameVerifier {

    /* renamed from: a */
    public final /* synthetic */ String f20648a;

    static {
        Covode.recordClassIndex(2253);
    }

    public C0536c(String str) {
        this.f20648a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f20648a, sSLSession);
    }
}
