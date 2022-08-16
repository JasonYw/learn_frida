package com.alibaba.p052a.p061b.p065d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.alibaba.p052a.p053a.p055b.C0887b;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alibaba.a.b.d.s */
/* loaded from: classes13.dex */
public class C0989s {

    /* renamed from: a */
    public static C0989s f21421a;

    /* renamed from: b */
    public static ThreadPoolExecutor f21422b;

    /* renamed from: c */
    public static int f21423c = 1;

    /* renamed from: d */
    public static int f21424d = 2;

    /* renamed from: e */
    public static int f21425e = 10;

    /* renamed from: f */
    public static int f21426f = 60;

    /* renamed from: i */
    public static final AtomicInteger f21427i = new AtomicInteger();

    /* renamed from: g */
    public HandlerThread f21428g = new HandlerThread("AppMonitor");

    /* renamed from: h */
    public Handler f21429h = new Handler(this.f21428g.getLooper()) { // from class: com.alibaba.a.b.d.s.1
        static {
            Covode.recordClassIndex(4300);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                if (message.obj == null || !(message.obj instanceof Runnable)) {
                    return;
                }
                C0989s.m20054d().submit((Runnable) message.obj);
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: com.alibaba.a.b.d.s$a */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC0991a implements ThreadFactory {

        /* renamed from: a */
        public int f21431a;

        static {
            Covode.recordClassIndex(4301);
        }

        public ThreadFactoryC0991a(int i) {
            this.f21431a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int andIncrement = C0989s.f21427i.getAndIncrement();
            Thread thread = new Thread(runnable, "AppMonitor:" + andIncrement);
            thread.setPriority(this.f21431a);
            return thread;
        }
    }

    static {
        Covode.recordClassIndex(4299);
    }

    public C0989s() {
        this.f21428g.start();
    }

    /* renamed from: a */
    public static synchronized C0989s m20062a() {
        C0989s c0989s;
        synchronized (C0989s.class) {
            if (f21421a == null) {
                f21421a = new C0989s();
            }
            c0989s = f21421a;
        }
        return c0989s;
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m20060a(int i, int i2, int i3, int i4, int i5) {
        return new PThreadPoolExecutor(i2, i3, i4, TimeUnit.SECONDS, i5 > 0 ? new LinkedBlockingQueue(i5) : new LinkedBlockingQueue(), new ThreadFactoryC0991a(i), new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    /* renamed from: d */
    public static synchronized ThreadPoolExecutor m20054d() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (C0989s.class) {
            if (f21422b == null) {
                f21422b = m20060a(f21423c, f21424d, f21425e, f21426f, 500);
            }
            threadPoolExecutor = f21422b;
        }
        return threadPoolExecutor;
    }

    /* renamed from: a */
    public final void m20061a(int i) {
        this.f21429h.removeMessages(i);
    }

    /* renamed from: a */
    public final void m20059a(int i, Runnable runnable, long j) {
        try {
            Message obtain = Message.obtain(this.f21429h, i);
            obtain.obj = runnable;
            this.f21429h.sendMessageDelayed(obtain, j);
        } catch (Exception e) {
            C0887b.m20436a(e);
        }
    }

    /* renamed from: a */
    public void m20058a(Runnable runnable) {
        try {
            m20054d().submit(runnable);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final boolean m20056b(int i) {
        return this.f21429h.hasMessages(i);
    }
}
