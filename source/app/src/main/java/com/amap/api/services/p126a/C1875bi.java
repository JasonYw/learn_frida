package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.bi */
/* loaded from: classes19.dex */
public class C1875bi {

    /* renamed from: com.amap.api.services.a.bi$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C18761 {
        static {
            Covode.recordClassIndex(5487);
        }
    }

    static {
        Covode.recordClassIndex(5486);
    }

    /* renamed from: com.amap.api.services.a.bi$a */
    /* loaded from: classes19.dex */
    public static class C1877a {

        /* renamed from: a */
        public String f24461a;

        /* renamed from: b */
        public String f24462b;

        /* renamed from: c */
        public String f24463c;

        /* renamed from: d */
        public String f24464d;

        /* renamed from: e */
        public String f24465e;

        /* renamed from: f */
        public String f24466f;

        /* renamed from: g */
        public String f24467g;

        /* renamed from: h */
        public String f24468h;

        /* renamed from: i */
        public String f24469i;

        /* renamed from: j */
        public String f24470j;

        /* renamed from: k */
        public String f24471k;

        /* renamed from: l */
        public String f24472l;

        /* renamed from: m */
        public String f24473m;

        /* renamed from: n */
        public String f24474n;

        /* renamed from: o */
        public String f24475o;

        /* renamed from: p */
        public String f24476p;

        /* renamed from: q */
        public String f24477q;

        /* renamed from: r */
        public String f24478r;

        /* renamed from: s */
        public String f24479s;

        /* renamed from: t */
        public String f24480t;

        /* renamed from: u */
        public String f24481u;

        /* renamed from: v */
        public String f24482v;

        /* renamed from: w */
        public String f24483w;

        /* renamed from: x */
        public String f24484x;

        /* renamed from: y */
        public String f24485y;

        static {
            Covode.recordClassIndex(5488);
        }

        public C1877a() {
        }

        public /* synthetic */ C1877a(C18761 c18761) {
            this();
        }
    }

    /* renamed from: a */
    public static String m16937a() {
        String str = null;
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String str2 = "1";
            if (!C1864bf.m16968a()) {
                str2 = "0";
            }
            int length = valueOf.length();
            new StringBuilder();
            str = C0002O.m25085C(valueOf.substring(0, length - 2), str2, valueOf.substring(length - 1));
            return str;
        } catch (Throwable th) {
            C1901by.m16742a(th, "CI", "TS");
            return str;
        }
    }

    /* renamed from: a */
    public static String m16936a(Context context) {
        return m16932a(context, false);
    }

    /* renamed from: a */
    public static String m16935a(Context context, C1877a c1877a) {
        return C1882bk.m16859b(m16928b(context, c1877a));
    }

    /* renamed from: a */
    public static String m16932a(Context context, boolean z) {
        try {
            return m16935a(context, m16927b(context, false, z));
        } catch (Throwable th) {
            C1901by.m16742a(th, "CI", "gCXi");
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m16926b(Context context, byte[] bArr) {
        PublicKey m16774d = C1892bp.m16774d();
        if (bArr.length > 117) {
            byte[] bArr2 = new byte[117];
            System.arraycopy(bArr, 0, bArr2, 0, 117);
            byte[] m16863a = C1882bk.m16863a(bArr2, m16774d);
            byte[] bArr3 = new byte[(bArr.length + 128) - 117];
            System.arraycopy(m16863a, 0, bArr3, 0, 128);
            System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
            return bArr3;
        }
        return C1882bk.m16863a(bArr, m16774d);
    }

    /* renamed from: a */
    public static void m16929a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte length;
        if (!TextUtils.isEmpty(str)) {
            if (str.getBytes().length > 255) {
                length = -1;
            } else {
                length = (byte) str.getBytes().length;
            }
            C1892bp.m16789a(byteArrayOutputStream, length, C1892bp.m16786a(str));
            return;
        }
        C1892bp.m16789a(byteArrayOutputStream, (byte) 0, new byte[0]);
    }

    /* renamed from: b */
    public static byte[] m16928b(Context context, C1877a c1877a) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                m16929a(byteArrayOutputStream, c1877a.f24461a);
                m16929a(byteArrayOutputStream, c1877a.f24462b);
                m16929a(byteArrayOutputStream, c1877a.f24463c);
                m16929a(byteArrayOutputStream, c1877a.f24464d);
                m16929a(byteArrayOutputStream, c1877a.f24465e);
                m16929a(byteArrayOutputStream, c1877a.f24466f);
                m16929a(byteArrayOutputStream, c1877a.f24467g);
                m16929a(byteArrayOutputStream, c1877a.f24468h);
                m16929a(byteArrayOutputStream, c1877a.f24469i);
                m16929a(byteArrayOutputStream, c1877a.f24470j);
                m16929a(byteArrayOutputStream, c1877a.f24471k);
                m16929a(byteArrayOutputStream, c1877a.f24472l);
                m16929a(byteArrayOutputStream, c1877a.f24473m);
                m16929a(byteArrayOutputStream, c1877a.f24474n);
                m16929a(byteArrayOutputStream, c1877a.f24475o);
                m16929a(byteArrayOutputStream, c1877a.f24476p);
                m16929a(byteArrayOutputStream, c1877a.f24477q);
                m16929a(byteArrayOutputStream, c1877a.f24478r);
                m16929a(byteArrayOutputStream, c1877a.f24479s);
                m16929a(byteArrayOutputStream, c1877a.f24480t);
                m16929a(byteArrayOutputStream, c1877a.f24481u);
                m16929a(byteArrayOutputStream, c1877a.f24482v);
                m16929a(byteArrayOutputStream, c1877a.f24483w);
                m16929a(byteArrayOutputStream, c1877a.f24484x);
                m16929a(byteArrayOutputStream, c1877a.f24485y);
                byte[] m16934a = m16934a(context, byteArrayOutputStream);
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                return m16934a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1901by.m16742a(th, "CI", "gzx");
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* renamed from: a */
    public static byte[] m16934a(Context context, ByteArrayOutputStream byteArrayOutputStream) {
        return m16926b(context, C1892bp.m16778b(byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: a */
    public static byte[] m16930a(Context context, byte[] bArr) {
        return C1882bk.m16864a(bArr);
    }

    /* renamed from: a */
    public static String m16933a(Context context, String str, String str2) {
        try {
            String m16961e = C1864bf.m16961e(context);
            new StringBuilder();
            return C1887bm.m16832b(C0002O.m25083C(m16961e, Constants.COLON_SEPARATOR, str.substring(0, str.length() - 3), Constants.COLON_SEPARATOR, str2));
        } catch (Throwable th) {
            C1901by.m16742a(th, "CI", "Sco");
            return null;
        }
    }

    /* renamed from: b */
    public static C1877a m16927b(Context context, boolean z, boolean z2) {
        C1877a c1877a = new C1877a(null);
        c1877a.f24461a = C1878bj.m16869w(context);
        c1877a.f24462b = C1878bj.m16878n(context);
        String m16883i = C1878bj.m16883i(context);
        if (m16883i == null) {
            m16883i = "";
        }
        c1877a.f24463c = m16883i;
        c1877a.f24464d = C1864bf.m16963c(context);
        c1877a.f24465e = Build.MODEL;
        c1877a.f24466f = Build.MANUFACTURER;
        c1877a.f24467g = Build.DEVICE;
        c1877a.f24468h = C1864bf.m16965b(context);
        c1877a.f24469i = C1864bf.m16962d(context);
        c1877a.f24470j = String.valueOf(Build.VERSION.SDK_INT);
        c1877a.f24471k = C1878bj.m16867y(context);
        c1877a.f24472l = C1878bj.m16870v(context);
        StringBuilder sb = new StringBuilder();
        sb.append(C1878bj.m16873s(context));
        c1877a.f24473m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1878bj.m16874r(context));
        c1877a.f24474n = sb2.toString();
        c1877a.f24475o = C1878bj.m16925A(context);
        c1877a.f24476p = C1878bj.m16875q(context);
        if (z) {
            c1877a.f24477q = "";
            c1877a.f24478r = "";
        } else {
            c1877a.f24477q = C1878bj.m16879m(context);
            c1877a.f24478r = C1878bj.m16880l(context);
        }
        if (z) {
            c1877a.f24479s = "";
            c1877a.f24480t = "";
        } else {
            String[] m16877o = C1878bj.m16877o(context);
            c1877a.f24479s = m16877o[0];
            c1877a.f24480t = m16877o[1];
        }
        c1877a.f24483w = C1878bj.m16914a();
        String m16906b = C1878bj.m16906b(context);
        if (!TextUtils.isEmpty(m16906b)) {
            c1877a.f24484x = m16906b;
        } else {
            c1877a.f24484x = "";
        }
        c1877a.f24485y = "aid=" + C1878bj.m16881k(context);
        if ((z2 && C1899bw.f24548e) || C1899bw.f24549f) {
            String m16884h = C1878bj.m16884h(context);
            if (!TextUtils.isEmpty(m16884h)) {
                c1877a.f24485y += "|oaid=" + m16884h;
            }
        }
        String m16911a = C1878bj.m16911a(context, Constants.ACCEPT_TIME_SEPARATOR_SP, true);
        if (!TextUtils.isEmpty(m16911a)) {
            c1877a.f24485y += "|multiImeis=" + m16911a;
        }
        String m16868x = C1878bj.m16868x(context);
        if (!TextUtils.isEmpty(m16868x)) {
            c1877a.f24485y += "|meid=" + m16868x;
        }
        c1877a.f24485y += "|serial=" + C1878bj.m16882j(context);
        String m16913a = C1878bj.m16913a(context);
        if (!TextUtils.isEmpty(m16913a)) {
            c1877a.f24485y += "|adiuExtras=" + m16913a;
        }
        c1877a.f24485y += "|storage=" + C1878bj.m16905c() + "|ram=" + C1878bj.m16866z(context) + "|arch=" + C1878bj.m16890d();
        return c1877a;
    }

    /* renamed from: a */
    public static byte[] m16931a(Context context, boolean z, boolean z2) {
        try {
            return m16928b(context, m16927b(context, z, z2));
        } catch (Throwable th) {
            C1901by.m16742a(th, "CI", "gz");
            return null;
        }
    }
}
