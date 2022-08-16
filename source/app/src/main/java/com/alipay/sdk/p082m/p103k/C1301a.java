package com.alipay.sdk.p082m.p103k;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.alipay.sdk.p082m.p115q.C1364d;
import com.alipay.sdk.p082m.p115q.C1365e;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1395j;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.k.a */
/* loaded from: classes2.dex */
public class C1301a {
    static {
        Covode.recordClassIndex(4801);
    }

    /* renamed from: com.alipay.sdk.m.k.a$a */
    /* loaded from: classes2.dex */
    public static final class C1302a {
        static {
            Covode.recordClassIndex(4802);
        }

        /* renamed from: com.alipay.sdk.m.k.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C1303a {

            /* renamed from: a */
            public final LinkedHashMap<String, String> f22187a = new LinkedHashMap<>();

            static {
                Covode.recordClassIndex(4803);
            }

            public C1303a() {
            }

            /* renamed from: a */
            public final String m19205a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f22187a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    C1385e.m18866a(th);
                    return new JSONArray().toString();
                }
            }

            public C1303a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.f22187a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    C1385e.m18866a(th);
                }
            }
        }

        /* renamed from: a */
        public static synchronized C1303a m19210a(Context context) {
            synchronized (C1302a.class) {
                try {
                    String m18831a = C1395j.m18831a(null, context, "alipay_cashier_statistic_record", null);
                    if (TextUtils.isEmpty(m18831a)) {
                        return new C1303a();
                    }
                    return new C1303a(m18831a);
                } catch (Throwable th) {
                    C1385e.m18866a(th);
                    return new C1303a();
                }
            }
        }

        /* renamed from: b */
        public static synchronized String m19206b(Context context) {
            synchronized (C1302a.class) {
                C1385e.m18865b("RecordPref", "stat peek");
                if (context == null) {
                    return null;
                }
                C1303a m19210a = m19210a(context);
                if (m19210a.f22187a.isEmpty()) {
                    return null;
                }
                return m19210a.f22187a.entrySet().iterator().next().getValue();
            }
        }

        /* renamed from: a */
        public static synchronized void m19209a(Context context, C1303a c1303a) {
            synchronized (C1302a.class) {
                if (c1303a == null) {
                    try {
                        c1303a = new C1303a();
                    } catch (Throwable th) {
                        C1385e.m18866a(th);
                        return;
                    }
                }
                C1395j.m18829b(null, context, "alipay_cashier_statistic_record", c1303a.m19205a());
            }
        }

        /* renamed from: a */
        public static synchronized int m19208a(Context context, String str) {
            synchronized (C1302a.class) {
                C1385e.m18865b("RecordPref", C0002O.m25086C("stat remove ", str));
                if (context == null || TextUtils.isEmpty(str)) {
                    return 0;
                }
                C1303a m19210a = m19210a(context);
                if (m19210a.f22187a.isEmpty()) {
                    return 0;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : m19210a.f22187a.entrySet()) {
                    if (str.equals(entry.getValue())) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m19210a.f22187a.remove((String) it.next());
                }
                m19209a(context, m19210a);
                return arrayList.size();
            }
        }

        /* renamed from: a */
        public static synchronized String m19207a(Context context, String str, String str2) {
            synchronized (C1302a.class) {
                C1385e.m18865b("RecordPref", C0002O.m25084C("stat append ", str2, " , ", str));
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C1303a m19210a = m19210a(context);
                    if (m19210a.f22187a.size() > 20) {
                        m19210a.f22187a.clear();
                    }
                    m19210a.f22187a.put(str2, str);
                    m19209a(context, m19210a);
                    return str2;
                }
                return null;
            }
        }
    }

    /* renamed from: com.alipay.sdk.m.k.a$b */
    /* loaded from: classes2.dex */
    public static final class C1304b {
        static {
            Covode.recordClassIndex(4804);
        }

        /* renamed from: com.alipay.sdk.m.k.a$b$a */
        /* loaded from: classes2.dex */
        public static class RunnableC1305a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f22188a;

            /* renamed from: b */
            public final /* synthetic */ Context f22189b;

            static {
                Covode.recordClassIndex(4805);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(this.f22188a) && !C1304b.m19200b(this.f22189b, this.f22188a)) {
                    return;
                }
                int i = 0;
                do {
                    String m19206b = C1302a.m19206b(this.f22189b);
                    if (!TextUtils.isEmpty(m19206b) && C1304b.m19200b(this.f22189b, m19206b)) {
                        i++;
                    } else {
                        return;
                    }
                } while (i < 4);
            }

            public RunnableC1305a(String str, Context context) {
                this.f22188a = str;
                this.f22189b = context;
            }
        }

        /* renamed from: a */
        public static synchronized void m19204a(Context context) {
            synchronized (C1304b.class) {
                m19201a(context, null, null);
            }
        }

        /* renamed from: b */
        public static synchronized boolean m19200b(Context context, String str) {
            AbstractC1354e c1365e;
            synchronized (C1304b.class) {
                C1385e.m18865b("mspl", C0002O.m25086C("stat sub ", str));
                if (C1328a.m19107z().m19128e()) {
                    c1365e = new C1364d();
                } else {
                    c1365e = new C1365e();
                }
                if (c1365e.mo18977a((C1376a) null, context, str) == null) {
                    return false;
                }
                C1302a.m19208a(context, str);
                return true;
            }
        }

        /* renamed from: a */
        public static synchronized void m19201a(Context context, String str, String str2) {
            synchronized (C1304b.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    C1302a.m19207a(context, str, str2);
                }
                new Thread(new RunnableC1305a(str, context)).start();
            }
        }

        /* renamed from: a */
        public static synchronized void m19203a(Context context, C1309b c1309b, String str, String str2) {
            synchronized (C1304b.class) {
                if (context != null && c1309b != null && str != null) {
                    m19201a(context, c1309b.m19192a(str), str2);
                }
            }
        }
    }

    /* renamed from: com.alipay.sdk.m.k.a$c */
    /* loaded from: classes2.dex */
    public static final class C1306c {
        static {
            Covode.recordClassIndex(4806);
        }

        /* renamed from: a */
        public static synchronized long m19199a(Context context) {
            long m19198a;
            synchronized (C1306c.class) {
                m19198a = C1307d.m19198a(context, "alipay_cashier_ap_seq_v");
            }
            return m19198a;
        }
    }

    /* renamed from: com.alipay.sdk.m.k.a$e */
    /* loaded from: classes2.dex */
    public static final class C1308e {
        static {
            Covode.recordClassIndex(4808);
        }

        /* renamed from: a */
        public static synchronized long m19197a(Context context) {
            long m19198a;
            synchronized (C1308e.class) {
                m19198a = C1307d.m19198a(context, "alipay_cashier_statistic_v");
            }
            return m19198a;
        }
    }

    /* renamed from: a */
    public static synchronized void m19219a(Context context) {
        synchronized (C1301a.class) {
            C1304b.m19204a(context);
        }
    }

    /* renamed from: com.alipay.sdk.m.k.a$d */
    /* loaded from: classes2.dex */
    public static final class C1307d {
        static {
            Covode.recordClassIndex(4807);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|5|(5:7|8|9|10|11)|17|8|9|10|11) */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static synchronized long m19198a(android.content.Context r6, java.lang.String r7) {
            /*
                java.lang.Class<com.alipay.sdk.m.k.a$d> r5 = com.alipay.sdk.p082m.p103k.C1301a.C1307d.class
                monitor-enter(r5)
                r4 = 0
                java.lang.String r1 = com.alipay.sdk.p082m.p121u.C1395j.m18831a(r4, r6, r7, r4)     // Catch: java.lang.Throwable -> L13
                boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13
                if (r0 != 0) goto L13
                long r2 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = 0
            L15:
                r0 = 1
                long r2 = r2 + r0
                java.lang.String r0 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L1f
                com.alipay.sdk.p082m.p121u.C1395j.m18829b(r4, r6, r7, r0)     // Catch: java.lang.Throwable -> L1f
            L1f:
                monitor-exit(r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p103k.C1301a.C1307d.m19198a(android.content.Context, java.lang.String):long");
        }
    }

    /* renamed from: a */
    public static void m19217a(C1376a c1376a, String str, String str2) {
        if (c1376a == null) {
            return;
        }
        c1376a.f22373j.m19191a(str, str2);
    }

    /* renamed from: a */
    public static void m19213a(C1376a c1376a, String str, Throwable th) {
        if (c1376a != null && th != null && th.getClass() != null) {
            c1376a.f22373j.m19189a(str, th.getClass().getSimpleName(), th);
        }
    }

    /* renamed from: b */
    public static void m19211b(C1376a c1376a, String str, String str2, String str3) {
        if (c1376a == null) {
            return;
        }
        c1376a.f22373j.m19183b(str, str2, str3);
    }

    /* renamed from: a */
    public static synchronized void m19218a(Context context, C1376a c1376a, String str, String str2) {
        synchronized (C1301a.class) {
            if (context != null && c1376a != null) {
                try {
                    C1302a.m19207a(context, c1376a.f22373j.m19192a(str), str2);
                } catch (Throwable th) {
                    C1385e.m18866a(th);
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m19212b(Context context, C1376a c1376a, String str, String str2) {
        synchronized (C1301a.class) {
            if (context != null && c1376a != null) {
                C1304b.m19203a(context, c1376a.f22373j, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m19216a(C1376a c1376a, String str, String str2, String str3) {
        if (c1376a == null) {
            return;
        }
        c1376a.f22373j.m19190a(str, str2, str3);
    }

    /* renamed from: a */
    public static void m19215a(C1376a c1376a, String str, String str2, Throwable th) {
        if (c1376a == null) {
            return;
        }
        c1376a.f22373j.m19189a(str, str2, th);
    }

    /* renamed from: a */
    public static void m19214a(C1376a c1376a, String str, String str2, Throwable th, String str3) {
        if (c1376a == null) {
            return;
        }
        c1376a.f22373j.m19188a(str, str2, th, str3);
    }
}
