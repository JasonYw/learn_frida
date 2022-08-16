package anet.channel;

import android.content.Intent;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: anet.channel.a */
/* loaded from: classes10.dex */
public class RunnableC0460a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f20405a;

    /* renamed from: b */
    public final /* synthetic */ AccsSessionManager f20406b;

    static {
        Covode.recordClassIndex(2149);
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = AccsSessionManager.f20296c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            try {
                ((ISessionListener) it.next()).onConnectionChanged(this.f20405a);
            } catch (Exception e) {
                ALog.m20787e("awcn.AccsSessionManager", "notifyListener exception.", null, e, new Object[0]);
            }
        }
    }

    public RunnableC0460a(AccsSessionManager accsSessionManager, Intent intent) {
        this.f20406b = accsSessionManager;
        this.f20405a = intent;
    }
}
