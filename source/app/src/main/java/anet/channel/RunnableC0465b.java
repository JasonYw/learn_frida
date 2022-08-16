package anet.channel;

import anet.channel.entity.C0503b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.b */
/* loaded from: classes2.dex */
public class RunnableC0465b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f20416a;

    /* renamed from: b */
    public final /* synthetic */ C0503b f20417b;

    /* renamed from: c */
    public final /* synthetic */ Session f20418c;

    static {
        Covode.recordClassIndex(2156);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f20418c.f20346b != null) {
                for (EventCb eventCb : this.f20418c.f20346b.keySet()) {
                    if (eventCb != null && (this.f20418c.f20346b.get(eventCb).intValue() & this.f20416a) != 0) {
                        try {
                            eventCb.onEvent(this.f20418c, this.f20416a, this.f20417b);
                        } catch (Exception e) {
                            ALog.m20786e("awcn.Session", e.toString(), this.f20418c.f20360p, new Object[0]);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            ALog.m20787e("awcn.Session", "handleCallbacks", this.f20418c.f20360p, e2, new Object[0]);
        }
    }

    public RunnableC0465b(Session session, int i, C0503b c0503b) {
        this.f20418c = session;
        this.f20416a = i;
        this.f20417b = c0503b;
    }
}
