package anet.channel.request;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

/* renamed from: anet.channel.request.b */
/* loaded from: classes10.dex */
public class C0526b implements Cancelable {
    public static final C0526b NULL = new C0526b(null, null);

    /* renamed from: a */
    public final Future<?> f20614a;

    /* renamed from: b */
    public final String f20615b;

    static {
        Covode.recordClassIndex(2240);
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f20614a != null) {
            ALog.m20785i("awcn.FutureCancelable", "cancel request", this.f20615b, new Object[0]);
            this.f20614a.cancel(true);
        }
    }

    public C0526b(Future<?> future, String str) {
        this.f20614a = future;
        this.f20615b = str;
    }
}
