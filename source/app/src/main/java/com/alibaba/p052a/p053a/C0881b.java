package com.alibaba.p052a.p053a;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.p052a.p053a.p054a.C0875e;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p055b.C0886a;
import com.alibaba.p052a.p053a.p055b.C0887b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p057d.C0907j;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p053a.p060g.C0919c;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p053a.p060g.C0923e;
import com.alibaba.p052a.p053a.p060g.C0925f;
import com.alibaba.p052a.p053a.p060g.C0929h;
import com.alibaba.p052a.p053a.p060g.C0931i;
import com.alibaba.p052a.p053a.p060g.C0932j;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p062a.C0942a;
import com.alibaba.p052a.p061b.p063b.C0949a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0977l;
import com.alibaba.p052a.p061b.p067f.C1000a;
import com.alibaba.p052a.p061b.p067f.C1002c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.a.a.b */
/* loaded from: classes13.dex */
public final class C0881b {

    /* renamed from: a */
    public static boolean f21183a;

    /* renamed from: b */
    public static volatile boolean f21184b;

    /* renamed from: c */
    public static Application f21185c;

    /* renamed from: com.alibaba.a.a.b$a */
    /* loaded from: classes13.dex */
    public static class C0882a {
        static {
            Covode.recordClassIndex(4192);
        }

        /* renamed from: a */
        public static void m20448a(int i) {
            EnumC0877f.ALARM.m20479c(i);
            C0881b.m20460a(EnumC0877f.ALARM, i);
        }

        /* renamed from: a */
        public static void m20446a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    C0974i.m20100a("AppMonitorDelegate", "module & monitorPoint must not null");
                    return;
                }
                C0949a.m20176i();
                HashMap hashMap = new HashMap();
                hashMap.put("_status", "0");
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.ALARM.m20482b() || (!C0881b.f21183a && !C0907j.m20387a(str, str2, Boolean.FALSE, hashMap))) {
                    C0974i.m20100a("log discard !", "");
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "commitFail module:", str, " monitorPoint:", str2, " errorCode:", str4, "errorMsg:", str5);
                C0949a.m20175j();
                C0875e.m20503a().m20499a(EnumC0877f.ALARM.m20485a(), str, str2, str3, str4, str5, map);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* renamed from: a */
        public static void m20445a(String str, String str2, String str3, String str4, Map<String, String> map) {
            m20446a(str, str2, null, str3, str4, map);
        }

        /* renamed from: a */
        public static void m20444a(String str, String str2, String str3, Map<String, String> map) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    C0974i.m20100a("AppMonitorDelegate", "module & monitorPoint must not null");
                    return;
                }
                C0949a.m20176i();
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.ALARM.m20482b() || (!C0881b.f21183a && !C0907j.m20387a(str, str2, Boolean.TRUE, (Map<String, String>) null))) {
                    C0974i.m20100a("log discard !", "");
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "commitSuccess module:", str, " monitorPoint:", str2);
                C0949a.m20175j();
                C0875e.m20503a().m20498a(EnumC0877f.ALARM.m20485a(), str, str2, str3, map);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* renamed from: a */
        public static void m20443a(String str, String str2, Map<String, String> map) {
            m20444a(str, str2, null, map);
        }

        /* renamed from: a */
        public static boolean m20447a(String str, String str2) {
            return C0907j.m20390a(EnumC0877f.ALARM, str, str2);
        }

        /* renamed from: b */
        public static void m20442b(int i) {
            C0907j.m20393a().m20391a(EnumC0877f.ALARM, i);
        }
    }

    /* renamed from: com.alibaba.a.a.b$b */
    /* loaded from: classes13.dex */
    public static class C0883b {
        static {
            Covode.recordClassIndex(4193);
        }

        /* renamed from: a */
        public static void m20441a(int i) {
            EnumC0877f.COUNTER.m20479c(i);
            C0881b.m20460a(EnumC0877f.COUNTER, i);
        }

        /* renamed from: a */
        public static void m20438a(String str, String str2, double d, Map<String, String> map) {
            m20437a(str, str2, null, d, map);
        }

        /* renamed from: a */
        public static void m20437a(String str, String str2, String str3, double d, Map<String, String> map) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    C0974i.m20100a("AppMonitorDelegate", "module & monitorPoint must not null");
                    return;
                }
                C0949a.m20178g();
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.COUNTER.m20482b()) {
                    return;
                }
                if (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.COUNTER, str, str2)) {
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "commitCount module: ", str, " monitorPoint: ", str2, " value: ", Double.valueOf(d));
                C0949a.m20177h();
                C0875e.m20503a().m20500a(EnumC0877f.COUNTER.m20485a(), str, str2, str3, d, map);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* renamed from: a */
        public static boolean m20439a(String str, String str2) {
            return C0907j.m20390a(EnumC0877f.COUNTER, str, str2);
        }

        /* renamed from: b */
        public static void m20435b(int i) {
            C0907j.m20393a().m20391a(EnumC0877f.COUNTER, i);
        }
    }

    /* renamed from: com.alibaba.a.a.b$c */
    /* loaded from: classes13.dex */
    public static class C0884c {
        static {
            Covode.recordClassIndex(4194);
        }

        /* renamed from: a */
        public static void m20432a(int i) {
            EnumC0877f.OFFLINE_COUNTER.m20479c(i);
            C0881b.m20460a(EnumC0877f.OFFLINE_COUNTER, i);
        }

        /* renamed from: a */
        public static void m20430a(String str, String str2, double d) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    C0974i.m20100a("AppMonitorDelegate", "module & monitorPoint must not null");
                    return;
                }
                C0949a.m20180e();
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.OFFLINE_COUNTER.m20482b()) {
                    return;
                }
                if (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.OFFLINE_COUNTER, str, str2)) {
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "commitOffLineCount module: ", str, " monitorPoint: ", str2, " value: ", Double.valueOf(d));
                C0949a.m20179f();
                C0875e.m20503a().m20500a(EnumC0877f.OFFLINE_COUNTER.m20485a(), str, str2, (String) null, d, (Map<String, String>) null);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* renamed from: a */
        public static boolean m20431a(String str, String str2) {
            return C0907j.m20390a(EnumC0877f.OFFLINE_COUNTER, str, str2);
        }

        /* renamed from: b */
        public static void m20429b(int i) {
            C0907j.m20393a().m20391a(EnumC0877f.OFFLINE_COUNTER, i);
        }
    }

    /* renamed from: com.alibaba.a.a.b$d */
    /* loaded from: classes13.dex */
    public static class C0885d {
        static {
            Covode.recordClassIndex(4195);
        }

        /* renamed from: a */
        public static void m20428a(int i) {
            EnumC0877f.STAT.m20479c(i);
            C0881b.m20460a(EnumC0877f.STAT, i);
        }

        /* renamed from: a */
        public static void m20426a(String str, String str2, double d, Map<String, String> map) {
            m20425a(str, str2, (C0921d) null, d, map);
        }

        /* renamed from: a */
        public static void m20425a(String str, String str2, C0921d c0921d, double d, Map<String, String> map) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    C0974i.m20100a("AppMonitorDelegate", "module & monitorPoint must not null");
                    return;
                }
                C0949a.m20183c();
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.STAT.m20482b()) {
                    return;
                }
                if (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.STAT, str, str2)) {
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "statEvent commit. module: ", str, " monitorPoint: ", str2);
                C0931i m20258a = C0932j.m20260a().m20258a(str, str2);
                C0949a.m20181d();
                if (m20258a == null) {
                    return;
                }
                List<C0923e> m20295b = m20258a.m20262g().m20295b();
                if (m20295b.size() != 1) {
                    return;
                }
                String m20304b = m20295b.get(0).m20304b();
                C0929h c0929h = (C0929h) C0889a.m20418a().m20415a(C0929h.class, new Object[0]);
                c0929h.m20276a(m20304b, d);
                m20424a(str, str2, c0921d, c0929h, map);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
            if (com.alibaba.p052a.p053a.p057d.C0907j.m20389a(com.alibaba.p052a.p053a.p054a.EnumC0877f.STAT, r11, r12, r13 != null ? r13.m20311b() : null) != false) goto L21;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m20424a(java.lang.String r11, java.lang.String r12, com.alibaba.p052a.p053a.p060g.C0921d r13, com.alibaba.p052a.p053a.p060g.C0929h r14, java.util.Map<java.lang.String, java.lang.String> r15) {
            /*
                r9 = r11
                boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L7e
                if (r0 != 0) goto L76
                r10 = r12
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L7e
                if (r0 != 0) goto L76
                com.alibaba.p052a.p061b.p063b.C0949a.m20183c()     // Catch: java.lang.Throwable -> L7e
                boolean r0 = com.alibaba.p052a.p053a.C0881b.f21184b     // Catch: java.lang.Throwable -> L7e
                r8 = 3
                java.lang.String r7 = " monitorPoint: "
                r6 = 2
                r5 = 1
                r4 = 0
                r3 = 4
                if (r0 == 0) goto L64
                boolean r0 = com.alibaba.p052a.p061b.p062a.C0942a.m20219c()     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L64
                com.alibaba.a.a.a.f r0 = com.alibaba.p052a.p053a.p054a.EnumC0877f.STAT     // Catch: java.lang.Throwable -> L7e
                boolean r0 = r0.m20482b()     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L64
                boolean r0 = com.alibaba.p052a.p053a.C0881b.f21183a     // Catch: java.lang.Throwable -> L7e
                r12 = r13
                if (r0 != 0) goto L3d
                com.alibaba.a.a.a.f r1 = com.alibaba.p052a.p053a.p054a.EnumC0877f.STAT     // Catch: java.lang.Throwable -> L7e
                if (r12 == 0) goto L61
                java.util.Map r0 = r12.m20311b()     // Catch: java.lang.Throwable -> L7e
            L37:
                boolean r0 = com.alibaba.p052a.p053a.p057d.C0907j.m20389a(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L64
            L3d:
                java.lang.String r2 = "statEvent commit success"
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7e
                java.lang.String r0 = "statEvent commit. module: "
                r1[r4] = r0     // Catch: java.lang.Throwable -> L7e
                r1[r5] = r9     // Catch: java.lang.Throwable -> L7e
                r1[r6] = r7     // Catch: java.lang.Throwable -> L7e
                r1[r8] = r10     // Catch: java.lang.Throwable -> L7e
                com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r2, r1)     // Catch: java.lang.Throwable -> L7e
                com.alibaba.p052a.p061b.p063b.C0949a.m20181d()     // Catch: java.lang.Throwable -> L7e
                com.alibaba.a.a.a.e r7 = com.alibaba.p052a.p053a.p054a.C0875e.m20503a()     // Catch: java.lang.Throwable -> L7e
                com.alibaba.a.a.a.f r0 = com.alibaba.p052a.p053a.p054a.EnumC0877f.STAT     // Catch: java.lang.Throwable -> L7e
                int r8 = r0.m20485a()     // Catch: java.lang.Throwable -> L7e
                r13 = r15
                r11 = r14
                r7.m20501a(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L7e
                goto L63
            L61:
                r0 = 0
                goto L37
            L63:
                return
            L64:
                java.lang.String r2 = "statEvent commit failed,log discard"
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7e
                java.lang.String r0 = " ,. module: "
                r1[r4] = r0     // Catch: java.lang.Throwable -> L7e
                r1[r5] = r9     // Catch: java.lang.Throwable -> L7e
                r1[r6] = r7     // Catch: java.lang.Throwable -> L7e
                r1[r8] = r10     // Catch: java.lang.Throwable -> L7e
                com.alibaba.p052a.p061b.p065d.C0974i.m20098a(r2, r1)     // Catch: java.lang.Throwable -> L7e
                return
            L76:
                java.lang.String r1 = "AppMonitorDelegate"
                java.lang.String r0 = "module & monitorPoint must not null"
                com.alibaba.p052a.p061b.p065d.C0974i.m20100a(r1, r0)     // Catch: java.lang.Throwable -> L7e
                return
            L7e:
                r0 = move-exception
                com.alibaba.p052a.p053a.p055b.C0887b.m20436a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p053a.C0881b.C0885d.m20424a(java.lang.String, java.lang.String, com.alibaba.a.a.g.d, com.alibaba.a.a.g.h, java.util.Map):void");
        }

        /* renamed from: a */
        public static void m20423a(String str, String str2, String str3) {
            try {
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.STAT.m20482b()) {
                    return;
                }
                if (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.STAT, str, str2)) {
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "statEvent begin. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                C0875e.m20503a().m20494a(Integer.valueOf(EnumC0877f.STAT.m20485a()), str, str2, str3);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }

        /* renamed from: a */
        public static boolean m20427a(String str, String str2) {
            return C0907j.m20390a(EnumC0877f.STAT, str, str2);
        }

        /* renamed from: b */
        public static void m20422b(int i) {
            C0907j.m20393a().m20391a(EnumC0877f.STAT, i);
        }

        /* renamed from: b */
        public static void m20421b(String str, String str2, String str3) {
            try {
                if (!C0881b.f21184b || !C0942a.m20219c() || !EnumC0877f.STAT.m20482b()) {
                    return;
                }
                if (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.STAT, str, str2)) {
                    return;
                }
                C0974i.m20098a("AppMonitorDelegate", "statEvent end. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                C0875e.m20503a().m20490a(str, str2, str3);
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }
    }

    static {
        Covode.recordClassIndex(4191);
    }

    /* renamed from: a */
    public static synchronized void m20463a() {
        synchronized (C0881b.class) {
            try {
                C0974i.m20098a("AppMonitorDelegate", "start destory");
                if (f21184b) {
                    RunnableC0940k.m20240c();
                    RunnableC0940k.m20241b();
                    RunnableC0939j.m20245b();
                    if (f21185c != null) {
                        C0977l.m20083c(f21185c.getApplicationContext());
                    }
                    f21184b = false;
                }
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }
    }

    /* renamed from: a */
    public static void m20462a(int i) {
        EnumC0877f[] values;
        for (EnumC0877f enumC0877f : EnumC0877f.values()) {
            enumC0877f.m20479c(i);
            m20460a(enumC0877f, i);
        }
    }

    /* renamed from: a */
    public static synchronized void m20461a(Application application) {
        synchronized (C0881b.class) {
            C0974i.m20098a("AppMonitorDelegate", "start init");
            if (!f21184b) {
                f21185c = application;
                C0941a.m20238a(application.getApplicationContext());
                RunnableC0939j.m20246a();
                RunnableC0940k.m20244a();
                RunnableC0937i.m20248a(application);
                C0977l.m20085b(application.getApplicationContext());
                f21184b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m20460a(EnumC0877f enumC0877f, int i) {
        try {
            if (!f21184b || enumC0877f == null) {
                return;
            }
            RunnableC0940k.m20242a(enumC0877f.m20485a(), i);
            if (i > 0) {
                enumC0877f.m20483a(true);
            } else {
                enumC0877f.m20483a(false);
            }
        } catch (Throwable th) {
            C0887b.m20436a(th);
        }
    }

    /* renamed from: a */
    public static void m20459a(String str) {
        C0941a.m20236a(str);
    }

    /* renamed from: a */
    public static void m20458a(String str, String str2, C0925f c0925f) {
        m20457a(str, str2, c0925f, (C0919c) null);
    }

    /* renamed from: a */
    public static void m20457a(String str, String str2, C0925f c0925f, C0919c c0919c) {
        m20456a(str, str2, c0925f, c0919c, false);
    }

    /* renamed from: a */
    public static void m20456a(String str, String str2, C0925f c0925f, C0919c c0919c, boolean z) {
        try {
            if (!f21184b) {
                return;
            }
            if (!C0912b.m20336b(str) && !C0912b.m20336b(str2)) {
                C0932j.m20260a().m20259a(new C0931i(str, str2, c0925f, c0919c, z));
                return;
            }
            C0974i.m20098a("AppMonitorDelegate", "register stat event. module: ", str, " monitorPoint: ", str2);
            if (f21183a) {
                throw new C0886a("register error. module and monitorPoint can't be null");
            }
        } catch (Throwable th) {
            C0887b.m20436a(th);
        }
    }

    /* renamed from: a */
    public static void m20455a(String str, String str2, C0925f c0925f, boolean z) {
        m20456a(str, str2, c0925f, null, z);
    }

    /* renamed from: a */
    public static void m20454a(Map<String, String> map) {
        C0942a.m20222a(map);
    }

    /* renamed from: a */
    public static void m20453a(boolean z) {
        C0974i.m20098a("AppMonitorDelegate", "[enableLog]");
        C0974i.m20096a(z);
    }

    /* renamed from: a */
    public static void m20452a(boolean z, String str, String str2, String str3) {
        C0941a.m20237a(z ? new C1002c(str, str3) : new C1000a(str, str2, "1".equalsIgnoreCase(str3)));
        C0942a.m20225a(f21185c);
    }

    /* renamed from: b */
    public static synchronized void m20451b() {
        synchronized (C0881b.class) {
            try {
                C0974i.m20098a("AppMonitorDelegate", "triggerUpload");
                if (f21184b && C0942a.m20219c()) {
                    RunnableC0940k.m20240c();
                }
            } catch (Throwable th) {
                C0887b.m20436a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m20450b(int i) {
        EnumC0877f[] values;
        C0974i.m20098a("AppMonitorDelegate", "[setSampling]");
        for (EnumC0877f enumC0877f : EnumC0877f.values()) {
            enumC0877f.m20477d(i);
            C0907j.m20393a().m20391a(enumC0877f, i);
        }
    }

    /* renamed from: c */
    public static void m20449c() {
        C0974i.m20098a("AppMonitorDelegate", "[turnOffRealTimeDebug]");
    }
}
