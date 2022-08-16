package com.alibaba.p052a.p061b.p064c;

import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.alibaba.p052a.p061b.p066e.C0999b;
import com.alibaba.p052a.p061b.p068g.C1003a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.alibaba.a.b.c.c */
/* loaded from: classes13.dex */
public class C0954c {

    /* renamed from: a */
    public static C0954c f21364a;

    /* renamed from: d */
    public static int f21365d;

    /* renamed from: e */
    public static final Object f21366e = new Object();

    /* renamed from: c */
    public List<C0999b> f21368c = new CopyOnWriteArrayList();

    /* renamed from: f */
    public Runnable f21369f = new Runnable() { // from class: com.alibaba.a.b.c.c.1
        static {
            Covode.recordClassIndex(4265);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0954c.this.m20149b();
        }
    };

    /* renamed from: b */
    public AbstractC0951a f21367b = new C0952b(C0941a.m20233c());

    /* renamed from: com.alibaba.a.b.c.c$a */
    /* loaded from: classes13.dex */
    public class RunnableC0956a implements Runnable {
        static {
            Covode.recordClassIndex(4266);
        }

        public RunnableC0956a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0954c.this.m20146d();
            int mo20167a = C0954c.this.f21367b.mo20167a();
            if (mo20167a > 9000) {
                C0954c.this.m20155a(mo20167a);
            }
        }
    }

    /* renamed from: com.alibaba.a.b.c.c$b */
    /* loaded from: classes13.dex */
    public class RunnableC0957b implements Runnable {
        static {
            Covode.recordClassIndex(4267);
        }

        public RunnableC0957b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0974i.m20098a("LogStoreMgr", "CleanLogTask");
            int mo20167a = C0954c.this.f21367b.mo20167a();
            if (mo20167a > 9000) {
                C0954c.this.m20155a(mo20167a);
            }
        }
    }

    static {
        Covode.recordClassIndex(4264);
    }

    public C0954c() {
        C1003a.m20036a().m20034b();
        C0989s.m20062a().m20058a(new RunnableC0956a());
    }

    /* renamed from: a */
    public static synchronized C0954c m20156a() {
        C0954c c0954c;
        synchronized (C0954c.class) {
            if (f21364a == null) {
                f21364a = new C0954c();
            }
            c0954c = f21364a;
        }
        return c0954c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m20155a(int i) {
        if (i > 9000) {
            this.f21367b.mo20166a((i - 9000) + 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m20146d() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -3);
        this.f21367b.mo20162a("time", String.valueOf(calendar.getTimeInMillis()));
    }

    /* renamed from: a */
    public int m20150a(List<C0999b> list) {
        C0974i.m20098a("LogStoreMgr", list);
        return this.f21367b.mo20158b(list);
    }

    /* renamed from: a */
    public List<C0999b> m20151a(String str, int i) {
        List<C0999b> mo20163a = this.f21367b.mo20163a(str, i);
        C0974i.m20098a("LogStoreMgr", "[get]", mo20163a);
        return mo20163a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m20152a(com.alibaba.p052a.p061b.p066e.C0999b r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r5 = 0
            java.lang.String r0 = "[add] :"
            r1[r5] = r0
            java.lang.String r0 = r7.f21477e
            r4 = 1
            r1[r4] = r0
            java.lang.String r0 = "LogStoreMgr"
            com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r0, r1)
            java.lang.String r0 = r7.f21474b
            com.alibaba.p052a.p061b.p063b.C0949a.m20184b(r0)
            java.util.List<com.alibaba.a.b.e.b> r0 = r6.f21368c
            r0.add(r7)
            java.util.List<com.alibaba.a.b.e.b> r0 = r6.f21368c
            int r1 = r0.size()
            r0 = 100
            if (r1 < r0) goto L3c
            com.alibaba.a.b.d.s r0 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()
            r0.m20061a(r4)
            com.alibaba.a.b.d.s r3 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()
            java.lang.Runnable r2 = r6.f21369f
            r0 = 0
        L35:
            r3.m20059a(r4, r2, r0)
        L38:
            java.lang.Object r2 = com.alibaba.p052a.p061b.p064c.C0954c.f21366e
            monitor-enter(r2)
            goto L4f
        L3c:
            com.alibaba.a.b.d.s r0 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()
            boolean r0 = r0.m20056b(r4)
            if (r0 != 0) goto L38
            com.alibaba.a.b.d.s r3 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()
            java.lang.Runnable r2 = r6.f21369f
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L35
        L4f:
            int r1 = com.alibaba.p052a.p061b.p064c.C0954c.f21365d     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + r4
            com.alibaba.p052a.p061b.p064c.C0954c.f21365d = r1     // Catch: java.lang.Throwable -> L68
            r0 = 5000(0x1388, float:7.006E-42)
            if (r1 <= r0) goto L66
            com.alibaba.p052a.p061b.p064c.C0954c.f21365d = r5     // Catch: java.lang.Throwable -> L68
            com.alibaba.a.b.d.s r1 = com.alibaba.p052a.p061b.p065d.C0989s.m20062a()     // Catch: java.lang.Throwable -> L68
            com.alibaba.a.b.c.c$b r0 = new com.alibaba.a.b.c.c$b     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            r1.m20058a(r0)     // Catch: java.lang.Throwable -> L68
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            return
        L68:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p064c.C0954c.m20152a(com.alibaba.a.b.e.b):void");
    }

    /* renamed from: b */
    public synchronized void m20149b() {
        C0974i.m20098a("LogStoreMgr", "[store]");
        ArrayList arrayList = null;
        try {
            synchronized (this.f21368c) {
                if (this.f21368c.size() > 0) {
                    arrayList = new ArrayList(this.f21368c);
                    this.f21368c.clear();
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                this.f21367b.mo20161a(arrayList);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void m20147c() {
        C0974i.m20098a("LogStoreMgr", "[clear]");
        this.f21367b.mo20160b();
        this.f21368c.clear();
    }
}
