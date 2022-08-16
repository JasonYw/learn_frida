package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bq */
/* loaded from: classes19.dex */
public class C1539bq {

    /* renamed from: a */
    public Thread[] f23051a;

    static {
        Covode.recordClassIndex(5087);
    }

    /* renamed from: a */
    public void m18262a() {
        Thread[] threadArr;
        try {
            for (Thread thread : this.f23051a) {
                thread.setDaemon(true);
                thread.start();
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "ThreadPool", "start");
        }
    }

    /* renamed from: b */
    public void m18261b() {
        Thread[] threadArr = this.f23051a;
        if (threadArr == null) {
            return;
        }
        int length = threadArr.length;
        for (int i = 0; i < length; i++) {
            this.f23051a[i].interrupt();
            this.f23051a[i] = null;
        }
        this.f23051a = null;
    }

    public C1539bq(int i, Runnable runnable, Runnable runnable2) {
        this.f23051a = new Thread[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 && i > 1) {
                this.f23051a[i2] = new Thread(runnable);
            } else {
                this.f23051a[i2] = new Thread(runnable2);
            }
        }
    }
}
