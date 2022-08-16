package com.alibaba.p052a.p053a;

import com.alibaba.p052a.p053a.p054a.C0875e;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alibaba.a.a.j */
/* loaded from: classes13.dex */
public class RunnableC0939j implements Runnable {

    /* renamed from: a */
    public static boolean f21265a;

    /* renamed from: b */
    public static long f21266b = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;

    /* renamed from: c */
    public static RunnableC0939j f21267c;

    static {
        Covode.recordClassIndex(4249);
    }

    /* renamed from: a */
    public static void m20246a() {
        if (!f21265a) {
            C0974i.m20098a("CleanTask", "init TimeoutEventManager");
            f21267c = new RunnableC0939j();
            C0989s.m20062a().m20059a(5, f21267c, f21266b);
            f21265a = true;
        }
    }

    /* renamed from: b */
    public static void m20245b() {
        C0989s.m20062a().m20061a(5);
        f21265a = false;
        f21267c = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0974i.m20098a("CleanTask", "clean TimeoutEvent");
        C0875e.m20503a().m20488b();
        C0989s.m20062a().m20059a(5, f21267c, f21266b);
    }
}
