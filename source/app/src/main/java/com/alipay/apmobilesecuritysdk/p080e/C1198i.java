package com.alipay.apmobilesecuritysdk.p080e;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.alipay.apmobilesecuritysdk.e.i */
/* loaded from: classes2.dex */
public final class C1198i {

    /* renamed from: a */
    public static String f21970a = "";

    /* renamed from: b */
    public static String f21971b = "";

    /* renamed from: c */
    public static String f21972c = "";

    /* renamed from: d */
    public static String f21973d = "";

    /* renamed from: e */
    public static String f21974e = "";

    /* renamed from: f */
    public static Map<String, String> f21975f = new HashMap();

    static {
        Covode.recordClassIndex(4670);
    }

    /* renamed from: a */
    public static synchronized String m19511a(String str) {
        synchronized (C1198i.class) {
            String m25086C = C0002O.m25086C("apdidTokenCache", str);
            if (f21975f.containsKey(m25086C)) {
                String str2 = f21975f.get(m25086C);
                if (C1448a.m18661b(str2)) {
                    return str2;
                }
            }
            return "";
        }
    }

    /* renamed from: a */
    public static synchronized void m19515a() {
        synchronized (C1198i.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m19513a(C1191b c1191b) {
        synchronized (C1198i.class) {
            if (c1191b != null) {
                f21970a = c1191b.f21956a;
                f21971b = c1191b.f21957b;
                f21972c = c1191b.f21958c;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19512a(C1192c c1192c) {
        synchronized (C1198i.class) {
            if (c1192c != null) {
                f21970a = c1192c.f21959a;
                f21971b = c1192c.f21960b;
                f21973d = c1192c.f21962d;
                f21974e = c1192c.f21963e;
                f21972c = c1192c.f21961c;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19510a(String str, String str2) {
        synchronized (C1198i.class) {
            String m25086C = C0002O.m25086C("apdidTokenCache", str);
            if (f21975f.containsKey(m25086C)) {
                f21975f.remove(m25086C);
            }
            f21975f.put(m25086C, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4 < 0) goto L6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m19514a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r6 = com.alipay.apmobilesecuritysdk.p080e.C1198i.class
            monitor-enter(r6)
            long r4 = com.alipay.apmobilesecuritysdk.p080e.C1197h.m19532a(r7)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
        Ld:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
        L10:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L23
            long r0 = com.alipay.apmobilesecuritysdk.p080e.C1197h.m19516h(r7, r8)     // Catch: java.lang.Throwable -> L23
            long r2 = r2 - r0
            long r1 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L23
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2b
            r0 = 1
            goto L2c
        L23:
            r0 = move-exception
            com.alipay.apmobilesecuritysdk.p078c.C1182a.m19575a(r0)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L2b:
            r0 = 0
        L2c:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.p080e.C1198i.m19514a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static synchronized String m19509b() {
        String str;
        synchronized (C1198i.class) {
            str = f21970a;
        }
        return str;
    }

    /* renamed from: b */
    public static void m19508b(String str) {
        f21970a = str;
    }

    /* renamed from: c */
    public static synchronized String m19507c() {
        String str;
        synchronized (C1198i.class) {
            str = f21971b;
        }
        return str;
    }

    /* renamed from: c */
    public static void m19506c(String str) {
        f21971b = str;
    }

    /* renamed from: d */
    public static synchronized String m19505d() {
        String str;
        synchronized (C1198i.class) {
            str = f21973d;
        }
        return str;
    }

    /* renamed from: d */
    public static void m19504d(String str) {
        f21972c = str;
    }

    /* renamed from: e */
    public static synchronized String m19503e() {
        String str;
        synchronized (C1198i.class) {
            str = f21974e;
        }
        return str;
    }

    /* renamed from: e */
    public static void m19502e(String str) {
        f21973d = str;
    }

    /* renamed from: f */
    public static synchronized String m19501f() {
        String str;
        synchronized (C1198i.class) {
            str = f21972c;
        }
        return str;
    }

    /* renamed from: f */
    public static void m19500f(String str) {
        f21974e = str;
    }

    /* renamed from: g */
    public static synchronized C1192c m19499g() {
        C1192c c1192c;
        synchronized (C1198i.class) {
            c1192c = new C1192c(f21970a, f21971b, f21972c, f21973d, f21974e);
        }
        return c1192c;
    }

    /* renamed from: h */
    public static void m19498h() {
        f21975f.clear();
        f21970a = "";
        f21971b = "";
        f21973d = "";
        f21974e = "";
        f21972c = "";
    }
}
