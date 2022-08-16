package anet.channel.thread;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class ThreadPoolExecutorFactory {

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor f20810a = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC0581b("AWCN Scheduler"));

    /* renamed from: b */
    public static ThreadPoolExecutor f20811b = new PThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN Worker(H)"));

    /* renamed from: c */
    public static ThreadPoolExecutor f20812c = new C0582a(16, 16, 60, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0581b("AWCN Worker(M)"));

    /* renamed from: d */
    public static ThreadPoolExecutor f20813d = new PThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN Worker(L)"));

    /* renamed from: e */
    public static ThreadPoolExecutor f20814e = new PThreadPoolExecutor(32, 32, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN Worker(Backup)"));

    /* renamed from: f */
    public static ThreadPoolExecutor f20815f = new PThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN Detector"));

    /* renamed from: g */
    public static ThreadPoolExecutor f20816g = new PThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN HR"));

    /* renamed from: h */
    public static ThreadPoolExecutor f20817h = new PThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0581b("AWCN Cookie"));

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$a */
    /* loaded from: classes2.dex */
    public static class RunnableC0580a implements Comparable<RunnableC0580a>, Runnable {

        /* renamed from: a */
        public Runnable f20818a;

        /* renamed from: b */
        public int f20819b;

        /* renamed from: c */
        public long f20820c;

        static {
            Covode.recordClassIndex(2351);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20818a.run();
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(RunnableC0580a runnableC0580a) {
            int i = this.f20819b;
            int i2 = runnableC0580a.f20819b;
            if (i != i2) {
                return i - i2;
            }
            return (int) (runnableC0580a.f20820c - this.f20820c);
        }

        public RunnableC0580a(Runnable runnable, int i) {
            this.f20820c = System.currentTimeMillis();
            this.f20818a = runnable;
            this.f20819b = i;
            this.f20820c = System.currentTimeMillis();
        }
    }

    /* loaded from: classes2.dex */
    public static class Priority {
        public static int HIGH;
        public static int NORMAL = 1;
        public static int LOW = 9;

        static {
            Covode.recordClassIndex(2350);
        }
    }

    static {
        Covode.recordClassIndex(2349);
        C116971W2r.LIZ(f20811b, true);
        C116971W2r.LIZ(f20812c, true);
        C116971W2r.LIZ(f20813d, true);
        C116971W2r.LIZ(f20814e, true);
        C116971W2r.LIZ(f20815f, true);
        C116971W2r.LIZ(f20816g, true);
        C116971W2r.LIZ(f20817h, true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f20810a.remove(runnable);
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f20814e.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        return f20817h.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        return f20815f.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        return f20816g.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f20810a.submit(runnable);
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$b */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC0581b implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f20821a = new AtomicInteger(0);

        /* renamed from: b */
        public String f20822b;

        static {
            Covode.recordClassIndex(2352);
        }

        public ThreadFactoryC0581b(String str) {
            this.f20822b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            MethodCollector.m14708i(93);
            Thread thread = new Thread(runnable, this.f20822b + this.f20821a.incrementAndGet());
            ALog.m20785i("awcn.ThreadPoolExecutorFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            MethodCollector.m14707o(93);
            return thread;
        }
    }

    public static synchronized void setNormalExecutorPoolSize(int i) {
        synchronized (ThreadPoolExecutorFactory.class) {
            MethodCollector.m14708i(94);
            if (i < 6) {
                i = 6;
            }
            f20812c.setCorePoolSize(i);
            f20812c.setMaximumPoolSize(i);
            MethodCollector.m14707o(94);
        }
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i) {
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, "priority", Integer.valueOf(i));
        }
        if (i < Priority.HIGH || i > Priority.LOW) {
            i = Priority.LOW;
        }
        if (i == Priority.HIGH) {
            return f20811b.submit(runnable);
        }
        if (i == Priority.LOW) {
            return f20813d.submit(runnable);
        }
        return f20812c.submit(new RunnableC0580a(runnable, i));
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j, TimeUnit timeUnit) {
        return f20810a.schedule(runnable, j, timeUnit);
    }
}
