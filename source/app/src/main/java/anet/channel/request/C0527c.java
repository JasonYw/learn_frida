package anet.channel.request;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* renamed from: anet.channel.request.c */
/* loaded from: classes19.dex */
public class C0527c implements Cancelable {
    public static final C0527c NULL = new C0527c(null, 0, null);

    /* renamed from: a */
    public final int f20616a;

    /* renamed from: b */
    public final SpdySession f20617b;

    /* renamed from: c */
    public final String f20618c;

    static {
        Covode.recordClassIndex(2241);
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        try {
            if (this.f20617b != null && this.f20616a != 0) {
                ALog.m20785i("awcn.TnetCancelable", "cancel tnet request", this.f20618c, "streamId", Integer.valueOf(this.f20616a));
                this.f20617b.streamReset(this.f20616a, 5);
            }
        } catch (SpdyErrorException e) {
            ALog.m20787e("awcn.TnetCancelable", "request cancel failed.", this.f20618c, e, "errorCode", Integer.valueOf(e.SpdyErrorGetCode()));
        }
    }

    public C0527c(SpdySession spdySession, int i, String str) {
        this.f20617b = spdySession;
        this.f20616a = i;
        this.f20618c = str;
    }
}
