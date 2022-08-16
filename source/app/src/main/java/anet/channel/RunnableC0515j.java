package anet.channel;

import anet.channel.p023b.C0466a;
import anetwork.channel.cache.a$a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import p003X.C116223Vp3;

/* renamed from: anet.channel.j */
/* loaded from: classes13.dex */
public final class RunnableC0515j implements Runnable {
    static {
        Covode.recordClassIndex(2221);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0466a c0466a = new C0466a();
            c0466a.m21053a();
            C0516k c0516k = new C0516k(this);
            C116223Vp3.LIZIZ.lock();
            C116223Vp3.LIZ.add(new a$a(c0466a, c0516k, 1));
            Collections.sort(C116223Vp3.LIZ);
            C116223Vp3.LIZIZ.unlock();
        } catch (Exception unused) {
        }
    }
}
