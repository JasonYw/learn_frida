package cn.com.chinatelecom.account.api.p035b;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p036c.C0645f;
import cn.com.chinatelecom.account.api.p036c.C0651l;
import cn.com.chinatelecom.account.api.p037d.C0657b;
import cn.com.chinatelecom.account.api.p037d.C0658c;
import cn.com.chinatelecom.account.api.p037d.C0663h;
import cn.com.chinatelecom.account.api.p038e.C0666a;
import cn.com.chinatelecom.account.api.p038e.C0667b;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0670e;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: cn.com.chinatelecom.account.api.b.b */
/* loaded from: classes2.dex */
public class C0635b {

    /* renamed from: a */
    public static final String f20868a = C0635b.class.getSimpleName();

    /* renamed from: c */
    public static byte[] f20869c = {122, 99, 122, 102};

    /* renamed from: d */
    public static byte[] f20870d = {44, 104, 120, 99, 109, 75, 122, 122, 55};

    /* renamed from: e */
    public static byte[] f20871e = {44, 121, 126, 55};

    /* renamed from: f */
    public static byte[] f20872f = {44, 104, 126, 55};

    /* renamed from: g */
    public static byte[] f20873g = {44, 107, Byte.MAX_VALUE, 126, 98, 94, 115, 122, 111, 55};

    /* renamed from: b */
    public C0645f f20874b;

    static {
        Covode.recordClassIndex(2686);
    }

    /* renamed from: a */
    public static JSONObject m20733a(Context context, String str, String str2, Network network, String str3, String str4) {
        JSONObject m20569g;
        MethodCollector.m14708i(169);
        try {
            C0663h c0663h = new C0663h();
            c0663h.m20671a(str4);
            c0663h.m20669a(false, C0658c.m20691a(), C0632d.m20735a(C0667b.f20991b));
            c0663h.m20666b(str3);
            c0663h.m20673a(network);
            c0663h.m20674a(CtSetting.getConnTimeout(null));
            c0663h.m20668b(CtSetting.getReadTimeout(null));
            HashMap hashMap = new HashMap();
            hashMap.put(C0632d.m20735a(f20869c), Helper.dnprecohdjs());
            c0663h.m20670a(hashMap);
            m20569g = C0666a.m20654a(context, new C0657b(context).mo20682a(str2, "", 0, c0663h.m20675a()), str, network, true, str3);
            C0671f.m20600b(str3, m20569g, str2);
        } catch (Throwable th) {
            m20569g = C0676k.m20569g();
            C0670e m20603a = C0671f.m20603a(str3);
            m20603a.m20606g(C0002O.m25086C("gpm ：", th.getMessage()));
            m20603a.m20617a(80102);
            m20603a.m20608e(C0632d.m20735a(C0676k.f21040g));
            CtAuth.warn(f20868a, "GPM Throwable", th);
        }
        MethodCollector.m14707o(169);
        return m20569g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m20734a(Context context, String str, String str2, Network network, long j, String str3, String str4, AbstractC0634a abstractC0634a) {
        new C0651l().execute(new C0638e(this, j, context, str, str2, network, str3, str4, abstractC0634a));
    }

    /* renamed from: a */
    public static /* synthetic */ void m20732a(C0635b c0635b) {
        C0645f c0645f = c0635b.f20874b;
        if (c0645f != null) {
            c0645f.m20710a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m20731a(C0635b c0635b, int i, String str, String str2, long j, String str3, AbstractC0634a abstractC0634a) {
        C0670e m20603a = C0671f.m20603a(str2);
        m20603a.m20617a(i);
        m20603a.m20608e(str);
        m20603a.m20616a(j);
        m20603a.m20606g(str3);
        C0671f.m20599c(str2);
        String m20576a = C0676k.m20576a(i, str, str2);
        if (abstractC0634a != null) {
            abstractC0634a.callbackPreCode(m20576a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20728a(java.lang.String r8, cn.com.chinatelecom.account.api.p035b.AbstractC0634a r9) {
        /*
            cn.com.chinatelecom.account.api.CtAuth r0 = cn.com.chinatelecom.account.api.CtAuth.getInstance()
            android.content.Context r3 = r0.getContext()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            java.lang.String r7 = ""
            if (r0 != 0) goto L2c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29
            r1.<init>(r8)     // Catch: org.json.JSONException -> L29
            java.lang.String r0 = "st"
            java.lang.String r7 = r1.optString(r0)     // Catch: org.json.JSONException -> L29
            java.lang.String r0 = "bt"
            java.lang.String r6 = r1.optString(r0)     // Catch: org.json.JSONException -> L29
            java.lang.String r0 = "authType"
            java.lang.String r4 = r1.optString(r0)     // Catch: org.json.JSONException -> L2e
            goto L32
        L29:
            r0 = move-exception
            r6 = r4
            goto L2f
        L2c:
            r6 = r4
            goto L32
        L2e:
            r0 = move-exception
        L2f:
            r0.printStackTrace()
        L32:
            long r1 = cn.com.chinatelecom.account.api.p038e.C0666a.m20656a(r3)
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            byte[] r0 = cn.com.chinatelecom.account.api.p035b.C0635b.f20870d
            java.lang.String r0 = cn.com.chinatelecom.account.api.p034a.C0632d.m20735a(r0)
            r5.append(r0)
            java.lang.String r0 = cn.com.chinatelecom.account.api.CtAuth.mAppId
            r5.append(r0)
            byte[] r0 = cn.com.chinatelecom.account.api.p035b.C0635b.f20871e
            java.lang.String r0 = cn.com.chinatelecom.account.api.p034a.C0632d.m20735a(r0)
            r5.append(r0)
            r5.append(r7)
            byte[] r0 = cn.com.chinatelecom.account.api.p035b.C0635b.f20872f
            java.lang.String r0 = cn.com.chinatelecom.account.api.p034a.C0632d.m20735a(r0)
            r5.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L66
            java.lang.String r6 = "tyx"
        L66:
            r5.append(r6)
            byte[] r0 = cn.com.chinatelecom.account.api.p035b.C0635b.f20873g
            java.lang.String r0 = cn.com.chinatelecom.account.api.p034a.C0632d.m20735a(r0)
            r5.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7a
            java.lang.String r4 = "2"
        L7a:
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = cn.com.chinatelecom.account.api.p038e.C0674i.m20583a(r3, r1, r0)
            if (r9 == 0) goto L8a
            r9.callbackPreCodeParams(r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p035b.C0635b.m20728a(java.lang.String, cn.com.chinatelecom.account.api.b.a):void");
    }

    /* renamed from: a */
    public final void m20727a(String str, String str2, AbstractC0634a abstractC0634a) {
        Context context = CtAuth.getInstance().getContext();
        int totalTimeout = CtSetting.getTotalTimeout(null);
        String m20638a = C0669d.m20638a();
        String m20637a = C0669d.m20637a(context);
        C0670e m20603a = C0671f.m20603a(m20638a);
        m20603a.m20615a(m20637a);
        m20603a.m20610c("preCodeByJs");
        m20603a.m20611b(C0673h.m20591d(context));
        m20603a.m20607f(C0673h.m20587h(context));
        m20734a(context, str, str2, null, totalTimeout, m20638a, "preCodeByJs", abstractC0634a);
    }

    /* renamed from: b */
    public final void m20726b(String str, String str2, AbstractC0634a abstractC0634a) {
        Context context = CtAuth.getInstance().getContext();
        int totalTimeout = CtSetting.getTotalTimeout(null);
        String m20638a = C0669d.m20638a();
        String m20637a = C0669d.m20637a(context);
        C0670e m20603a = C0671f.m20603a(m20638a);
        m20603a.m20615a(m20637a);
        m20603a.m20610c("preCodeByJs");
        m20603a.m20611b("BOTH");
        m20603a.m20607f(C0673h.m20587h(context));
        int i = Build.VERSION.SDK_INT;
        this.f20874b = new C0645f(context);
        this.f20874b.m20709a(new C0636c(this, m20638a, totalTimeout, context, str, str2, abstractC0634a));
    }
}
