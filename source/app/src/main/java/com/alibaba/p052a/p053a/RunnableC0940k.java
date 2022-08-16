package com.alibaba.p052a.p053a;

import com.alibaba.p052a.p053a.p054a.C0875e;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.a.a.k */
/* loaded from: classes13.dex */
public class RunnableC0940k implements Runnable {

    /* renamed from: a */
    public static boolean f21268a;

    /* renamed from: e */
    public static Map<Integer, RunnableC0940k> f21269e;

    /* renamed from: b */
    public int f21270b;

    /* renamed from: c */
    public int f21271c;

    /* renamed from: d */
    public long f21272d = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(4250);
    }

    public RunnableC0940k(int i, int i2) {
        this.f21270b = 180000;
        this.f21271c = i;
        this.f21270b = i2;
    }

    /* renamed from: a */
    public static int m20243a(int i) {
        if (i != 65133) {
            switch (i) {
                case 65501:
                    return 6;
                case 65502:
                    return 9;
                case 65503:
                    return 10;
                default:
                    return 0;
            }
        }
        return 11;
    }

    /* renamed from: a */
    public static void m20244a() {
        EnumC0877f[] values;
        if (!f21268a) {
            C0974i.m20098a("CommitTask", "init StatisticsAlarmEvent");
            f21269e = new ConcurrentHashMap();
            for (EnumC0877f enumC0877f : EnumC0877f.values()) {
                if (enumC0877f.m20482b()) {
                    int m20485a = enumC0877f.m20485a();
                    RunnableC0940k runnableC0940k = new RunnableC0940k(m20485a, enumC0877f.m20476e() * 1000);
                    f21269e.put(Integer.valueOf(m20485a), runnableC0940k);
                    C0989s.m20062a().m20059a(m20243a(m20485a), runnableC0940k, runnableC0940k.f21270b);
                }
            }
            f21268a = true;
        }
    }

    /* renamed from: a */
    public static void m20242a(int i, int i2) {
        C0974i.m20098a("CommitTask", "[setStatisticsInterval] eventId" + i + " statisticsInterval:" + i2);
        synchronized (f21269e) {
            RunnableC0940k runnableC0940k = f21269e.get(Integer.valueOf(i));
            if (runnableC0940k == null) {
                if (i2 > 0) {
                    RunnableC0940k runnableC0940k2 = new RunnableC0940k(i, i2 * 1000);
                    f21269e.put(Integer.valueOf(i), runnableC0940k2);
                    C0974i.m20098a("CommitTask", "post next eventId" + i + ": uploadTask.interval " + runnableC0940k2.f21270b);
                    C0989s.m20062a().m20059a(m20243a(i), runnableC0940k2, (long) runnableC0940k2.f21270b);
                }
            } else if (i2 > 0) {
                int i3 = i2 * 1000;
                if (runnableC0940k.f21270b != i3) {
                    C0989s.m20062a().m20061a(m20243a(i));
                    runnableC0940k.f21270b = i3;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = runnableC0940k.f21270b - (currentTimeMillis - runnableC0940k.f21272d);
                    if (j < 0) {
                        j = 0;
                    }
                    C0974i.m20098a("CommitTask", runnableC0940k + "post next eventId" + i + " next:" + j + "  uploadTask.interval: " + runnableC0940k.f21270b);
                    C0989s.m20062a().m20059a(m20243a(i), runnableC0940k, j);
                    runnableC0940k.f21272d = currentTimeMillis;
                }
            } else {
                C0974i.m20098a("CommitTask", "uploadTasks.size:" + f21269e.size());
                f21269e.remove(Integer.valueOf(i));
                C0974i.m20098a("CommitTask", "uploadTasks.size:" + f21269e.size());
            }
        }
    }

    /* renamed from: b */
    public static void m20241b() {
        for (EnumC0877f enumC0877f : EnumC0877f.values()) {
            C0989s.m20062a().m20061a(m20243a(enumC0877f.m20485a()));
        }
        f21268a = false;
        f21269e = null;
    }

    /* renamed from: c */
    public static void m20240c() {
        for (EnumC0877f enumC0877f : EnumC0877f.values()) {
            C0875e.m20503a().m20487b(enumC0877f.m20485a());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C0974i.m20098a("CommitTask", "check&commit event:", Integer.valueOf(this.f21271c));
        C0875e.m20503a().m20487b(this.f21271c);
        if (f21269e.containsValue(this)) {
            this.f21272d = System.currentTimeMillis();
            C0974i.m20098a("CommitTask", "next:" + this.f21271c);
            C0989s.m20062a().m20059a(m20243a(this.f21271c), this, (long) this.f21270b);
        }
    }
}
