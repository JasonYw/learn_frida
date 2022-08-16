package anet.channel;

import android.content.Context;
import anet.channel.SessionRequest;
import anet.channel.util.C0596i;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.i */
/* loaded from: classes3.dex */
public class RunnableC0514i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Session f20535a;

    /* renamed from: b */
    public final /* synthetic */ SessionRequest.C0457a f20536b;

    static {
        Covode.recordClassIndex(2220);
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        try {
            SessionRequest sessionRequest = SessionRequest.this;
            context = this.f20536b.f20397c;
            sessionRequest.m21072a(context, this.f20535a.getConnType().getType(), C0596i.m20754a(SessionRequest.this.f20383a.f20374c), (SessionGetCallback) null, 0L);
        } catch (Exception unused) {
        }
    }

    public RunnableC0514i(SessionRequest.C0457a c0457a, Session session) {
        this.f20536b = c0457a;
        this.f20535a = session;
    }
}
