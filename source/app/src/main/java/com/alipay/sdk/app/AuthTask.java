package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p117r.C1371b;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p121u.C1388h;
import com.alipay.sdk.p082m.p121u.C1397l;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p123x.C1417a;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class AuthTask {

    /* renamed from: c */
    public static final Object f22000c = C1388h.class;

    /* renamed from: a */
    public Activity f22001a;

    /* renamed from: b */
    public C1417a f22002b;

    /* renamed from: com.alipay.sdk.app.AuthTask$a */
    /* loaded from: classes2.dex */
    public class C1206a implements C1388h.AbstractC1393e {
        static {
            Covode.recordClassIndex(4693);
        }

        @Override // com.alipay.sdk.p082m.p121u.C1388h.AbstractC1393e
        /* renamed from: b */
        public void mo18837b() {
        }

        @Override // com.alipay.sdk.p082m.p121u.C1388h.AbstractC1393e
        /* renamed from: a */
        public void mo18838a() {
            AuthTask.this.m19482a();
        }

        public C1206a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19482a() {
        C1417a c1417a = this.f22002b;
        if (c1417a != null) {
            c1417a.m18745a();
        }
    }

    /* renamed from: b */
    private C1388h.AbstractC1393e m19478b() {
        return new C1206a();
    }

    /* renamed from: c */
    private void m19476c() {
        C1417a c1417a = this.f22002b;
        if (c1417a != null) {
            c1417a.m18736d();
        }
    }

    static {
        Covode.recordClassIndex(4692);
    }

    public AuthTask(Activity activity) {
        this.f22001a = activity;
        C1378b.m18915d().m18918a(this.f22001a);
        this.f22002b = new C1417a(activity, "去支付宝授权");
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new C1376a(this.f22001a, str, "auth"), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        C1376a c1376a;
        c1376a = new C1376a(this.f22001a, str, "authV2");
        return C1397l.m18824a(c1376a, innerAuth(c1376a, str, z));
    }

    /* renamed from: a */
    private String m19479a(C1376a c1376a, C1371b c1371b) {
        String[] m18957c = c1371b.m18957c();
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.WEB_URL, m18957c[0]);
        Intent intent = new Intent(this.f22001a, H5AuthActivity.class);
        intent.putExtras(bundle);
        C1376a.C1377a.m18922a(c1376a, intent);
        C116971W2r.LIZIZ(this.f22001a, intent);
        synchronized (f22000c) {
            try {
                f22000c.wait();
            } catch (InterruptedException unused) {
                return C1295b.m19241a();
            }
        }
        String m19235d = C1295b.m19235d();
        if (TextUtils.isEmpty(m19235d)) {
            return C1295b.m19241a();
        }
        return m19235d;
    }

    /* renamed from: a */
    private String m19481a(Activity activity, String str, C1376a c1376a) {
        String m18940a = c1376a.m18940a(str);
        List<C1328a.C1330b> m19121l = C1328a.m19107z().m19121l();
        if (!C1328a.m19107z().f22239g || m19121l == null) {
            m19121l = C1294a.f22165d;
        }
        if (C1399n.m18805a(c1376a, (Context) this.f22001a, m19121l, true)) {
            C1388h c1388h = new C1388h(activity, c1376a, m19478b());
            String m18847a = c1388h.m18847a(m18940a, false);
            c1388h.m18857a();
            if (!TextUtils.equals(m18847a, "failed") && !TextUtils.equals(m18847a, "scheme_failed")) {
                if (TextUtils.isEmpty(m18847a)) {
                    return C1295b.m19241a();
                }
                return m18847a;
            }
            C1301a.m19217a(c1376a, "biz", "LogBindCalledH5");
            return m19477b(activity, m18940a, c1376a);
        }
        C1301a.m19217a(c1376a, "biz", "LogCalledH5");
        return m19477b(activity, m18940a, c1376a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m19477b(android.app.Activity r6, java.lang.String r7, com.alipay.sdk.p082m.p119s.C1376a r8) {
        /*
            r5 = this;
            r5.m19476c()
            r1 = 0
            com.alipay.sdk.m.q.a r0 = new com.alipay.sdk.m.q.a     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            com.alipay.sdk.m.p.b r0 = r0.mo18977a(r8, r6, r7)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            org.json.JSONObject r2 = r0.m19019c()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            java.lang.String r0 = "form"
            org.json.JSONObject r2 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            java.lang.String r0 = "onload"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            java.util.List r4 = com.alipay.sdk.p082m.p117r.C1371b.m18960a(r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            r5.m19482a()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            r3 = 0
        L25:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            if (r3 >= r0) goto L4b
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            com.alipay.sdk.m.r.b r0 = (com.alipay.sdk.p082m.p117r.C1371b) r0     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            com.alipay.sdk.m.r.a r2 = r0.m18963a()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            com.alipay.sdk.m.r.a r0 = com.alipay.sdk.p082m.p117r.EnumC1370a.WapPay     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            if (r2 != r0) goto L44
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            com.alipay.sdk.m.r.b r0 = (com.alipay.sdk.p082m.p117r.C1371b) r0     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            java.lang.String r0 = r5.m19479a(r8, r0)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L58
            goto L47
        L44:
            int r3 = r3 + 1
            goto L25
        L47:
            r5.m19482a()
            return r0
        L4b:
            r5.m19482a()
            goto L6b
        L4f:
            r3 = move-exception
            java.lang.String r2 = "biz"
            java.lang.String r0 = "H5AuthDataAnalysisError"
            com.alipay.sdk.p082m.p103k.C1301a.m19215a(r8, r2, r0, r3)     // Catch: java.lang.Throwable -> L86
            goto L68
        L58:
            r2 = move-exception
            com.alipay.sdk.m.j.c r0 = com.alipay.sdk.p082m.p101j.EnumC1296c.NETWORK_ERROR     // Catch: java.lang.Throwable -> L86
            int r0 = r0.m19230b()     // Catch: java.lang.Throwable -> L86
            com.alipay.sdk.m.j.c r1 = com.alipay.sdk.p082m.p101j.EnumC1296c.m19229b(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "net"
            com.alipay.sdk.p082m.p103k.C1301a.m19213a(r8, r0, r2)     // Catch: java.lang.Throwable -> L86
        L68:
            r5.m19482a()
        L6b:
            if (r1 != 0) goto L77
            com.alipay.sdk.m.j.c r0 = com.alipay.sdk.p082m.p101j.EnumC1296c.FAILED
            int r0 = r0.m19230b()
            com.alipay.sdk.m.j.c r1 = com.alipay.sdk.p082m.p101j.EnumC1296c.m19229b(r0)
        L77:
            int r2 = r1.m19230b()
            java.lang.String r1 = r1.m19233a()
            java.lang.String r0 = ""
            java.lang.String r0 = com.alipay.sdk.p082m.p101j.C1295b.m19240a(r2, r1, r0)
            return r0
        L86:
            r0 = move-exception
            r5.m19482a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.m19477b(android.app.Activity, java.lang.String, com.alipay.sdk.m.s.a):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b4, code lost:
        if (com.alipay.sdk.p082m.p107m.C1328a.m19107z().m19115r() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String innerAuth(com.alipay.sdk.p082m.p119s.C1376a r8, java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(com.alipay.sdk.m.s.a, java.lang.String, boolean):java.lang.String");
    }
}
