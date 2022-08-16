package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003X.C116971W2r;

/* renamed from: com.alipay.android.phone.mrpc.core.l */
/* loaded from: classes2.dex */
public final class C1165l implements AbstractC1149ab {

    /* renamed from: b */
    public static C1165l f21893b;

    /* renamed from: i */
    public static final ThreadFactory f21894i = new ThreadFactoryC1167n();

    /* renamed from: a */
    public Context f21895a;

    /* renamed from: c */
    public ThreadPoolExecutor f21896c;

    /* renamed from: d */
    public C1152b f21897d = C1152b.m19659a("android");

    /* renamed from: e */
    public long f21898e;

    /* renamed from: f */
    public long f21899f;

    /* renamed from: g */
    public long f21900g;

    /* renamed from: h */
    public int f21901h;

    static {
        Covode.recordClassIndex(4636);
    }

    public C1165l(Context context) {
        this.f21895a = context;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f21894i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f21896c = pThreadPoolExecutor;
        try {
            C116971W2r.LIZ((ThreadPoolExecutor) pThreadPoolExecutor, true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f21895a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    /* renamed from: a */
    public static final C1165l m19636a(Context context) {
        C1165l c1165l = f21893b;
        return c1165l != null ? c1165l : m19633b(context);
    }

    /* renamed from: b */
    public static final synchronized C1165l m19633b(Context context) {
        synchronized (C1165l.class) {
            C1165l c1165l = f21893b;
            if (c1165l != null) {
                return c1165l;
            }
            C1165l c1165l2 = new C1165l(context);
            f21893b = c1165l2;
            return c1165l2;
        }
    }

    /* renamed from: a */
    public final C1152b m19638a() {
        return this.f21897d;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1149ab
    /* renamed from: a */
    public final Future<C1174u> mo19635a(AbstractC1173t abstractC1173t) {
        if (C1172s.m19600a(this.f21895a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f21896c.getActiveCount());
            objArr[1] = Long.valueOf(this.f21896c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f21896c.getTaskCount());
            long j = this.f21900g;
            long j2 = 0;
            objArr[3] = Long.valueOf(j == 0 ? 0L : ((this.f21898e * 1000) / j) >> 10);
            int i = this.f21901h;
            if (i != 0) {
                j2 = this.f21899f / i;
            }
            objArr[4] = Long.valueOf(j2);
            objArr[5] = Long.valueOf(this.f21898e);
            objArr[6] = Long.valueOf(this.f21899f);
            objArr[7] = Long.valueOf(this.f21900g);
            objArr[8] = Integer.valueOf(this.f21901h);
            String.format(str, objArr);
        }
        CallableC1170q callableC1170q = new CallableC1170q(this, (C1168o) abstractC1173t);
        C1166m c1166m = new C1166m(this, callableC1170q, callableC1170q);
        this.f21896c.execute(c1166m);
        return c1166m;
    }

    /* renamed from: a */
    public final void m19637a(long j) {
        this.f21898e += j;
    }

    /* renamed from: b */
    public final void m19634b(long j) {
        this.f21899f += j;
        this.f21901h++;
    }

    /* renamed from: c */
    public final void m19632c(long j) {
        this.f21900g += j;
    }
}
