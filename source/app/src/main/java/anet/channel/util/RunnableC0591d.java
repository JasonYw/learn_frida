package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.util.d */
/* loaded from: classes2.dex */
public final class RunnableC0591d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f20834a;

    /* renamed from: b */
    public final /* synthetic */ NetTypeStat f20835b;

    static {
        Covode.recordClassIndex(2375);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0592e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }

    public RunnableC0591d(String str, NetTypeStat netTypeStat) {
        this.f20834a = str;
        this.f20835b = netTypeStat;
    }
}
