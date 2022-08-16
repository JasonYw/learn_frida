package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.strategy.utils.b */
/* loaded from: classes2.dex */
public final class ThreadFactoryC0578b implements ThreadFactory {
    static {
        Covode.recordClassIndex(2347);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger;
        MethodCollector.m14708i(92);
        StringBuilder sb = new StringBuilder("AMDC");
        atomicInteger = C0577a.f20808a;
        sb.append(atomicInteger.incrementAndGet());
        Thread thread = new Thread(runnable, sb.toString());
        ALog.m20785i("awcn.AmdcThreadPoolExecutor", "thread created!", null, "name", thread.getName());
        thread.setPriority(5);
        MethodCollector.m14707o(92);
        return thread;
    }
}
