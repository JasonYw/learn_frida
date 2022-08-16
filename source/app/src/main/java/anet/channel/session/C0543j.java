package anet.channel.session;

import android.content.Context;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import org.android.spdy.AccsSSLCallback;

/* renamed from: anet.channel.session.j */
/* loaded from: classes2.dex */
public class C0543j implements AccsSSLCallback {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f20659a;

    static {
        Covode.recordClassIndex(2260);
    }

    public C0543j(TnetSpdySession tnetSpdySession) {
        this.f20659a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i, byte[] bArr) {
        byte[] bArr2;
        Context context;
        try {
            ISecurity iSecurity = this.f20659a.f20631G;
            context = this.f20659a.f20345a;
            bArr2 = iSecurity.decrypt(context, "ASE128", "tnet_pksg_key", bArr);
            if (bArr2 != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.m20785i("getSSLPublicKey", null, "decrypt", new String(bArr2));
                        return bArr2;
                    }
                } catch (Throwable th) {
                    th = th;
                    ALog.m20787e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArr2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArr2 = null;
        }
        return bArr2;
    }
}
