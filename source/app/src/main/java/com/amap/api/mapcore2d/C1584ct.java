package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.ct */
/* loaded from: classes19.dex */
public class C1584ct {

    /* renamed from: com.amap.api.mapcore2d.ct$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C15851 {
        static {
            Covode.recordClassIndex(5133);
        }
    }

    static {
        Covode.recordClassIndex(5132);
    }

    /* renamed from: com.amap.api.mapcore2d.ct$a */
    /* loaded from: classes19.dex */
    public static class C1586a {

        /* renamed from: a */
        public String f23243a;

        /* renamed from: b */
        public String f23244b;

        /* renamed from: c */
        public String f23245c;

        /* renamed from: d */
        public String f23246d;

        /* renamed from: e */
        public String f23247e;

        /* renamed from: f */
        public String f23248f;

        /* renamed from: g */
        public String f23249g;

        /* renamed from: h */
        public String f23250h;

        /* renamed from: i */
        public String f23251i;

        /* renamed from: j */
        public String f23252j;

        /* renamed from: k */
        public String f23253k;

        /* renamed from: l */
        public String f23254l;

        /* renamed from: m */
        public String f23255m;

        /* renamed from: n */
        public String f23256n;

        /* renamed from: o */
        public String f23257o;

        /* renamed from: p */
        public String f23258p;

        /* renamed from: q */
        public String f23259q;

        /* renamed from: r */
        public String f23260r;

        /* renamed from: s */
        public String f23261s;

        /* renamed from: t */
        public String f23262t;

        /* renamed from: u */
        public String f23263u;

        /* renamed from: v */
        public String f23264v;

        /* renamed from: w */
        public String f23265w;

        /* renamed from: x */
        public String f23266x;

        /* renamed from: y */
        public String f23267y;

        static {
            Covode.recordClassIndex(5134);
        }

        public C1586a() {
        }

        public /* synthetic */ C1586a(C15851 c15851) {
            this();
        }
    }

    /* renamed from: a */
    public static String m18093a() {
        String str = null;
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String str2 = "1";
            if (!C1573cq.m18126a()) {
                str2 = "0";
            }
            int length = valueOf.length();
            new StringBuilder();
            str = C0002O.m25085C(valueOf.substring(0, length - 2), str2, valueOf.substring(length - 1));
            return str;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "CI", "TS");
            return str;
        }
    }

    /* renamed from: a */
    public static String m18092a(Context context) {
        try {
            C1586a c1586a = new C1586a(null);
            c1586a.f23246d = C1573cq.m18121c(context);
            c1586a.f23251i = C1573cq.m18120d(context);
            return m18091a(context, c1586a);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "CI", "IX");
            return null;
        }
    }

    /* renamed from: b */
    public static String m18085b(Context context) {
        try {
            return m18091a(context, m18083b(context, false));
        } catch (Throwable th) {
            C1612dl.m17891a(th, "CI", "gCX");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m18087a(Context context, byte[] bArr) {
        return C1589cv.m18025a(bArr);
    }

    /* renamed from: a */
    public static String m18091a(Context context, C1586a c1586a) {
        return C1589cv.m18020b(m18084b(context, c1586a));
    }

    /* renamed from: b */
    public static byte[] m18082b(Context context, byte[] bArr) {
        PublicKey m17928d = C1602db.m17928d();
        if (bArr.length > 117) {
            byte[] bArr2 = new byte[117];
            System.arraycopy(bArr, 0, bArr2, 0, 117);
            byte[] m18024a = C1589cv.m18024a(bArr2, m17928d);
            byte[] bArr3 = new byte[(bArr.length + 128) - 117];
            System.arraycopy(m18024a, 0, bArr3, 0, 128);
            System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
            return bArr3;
        }
        return C1589cv.m18024a(bArr, m17928d);
    }

    /* renamed from: a */
    public static void m18086a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte length;
        if (!TextUtils.isEmpty(str)) {
            if (str.getBytes().length > 255) {
                length = -1;
            } else {
                length = (byte) str.getBytes().length;
            }
            C1602db.m17943a(byteArrayOutputStream, length, C1602db.m17940a(str));
            return;
        }
        C1602db.m17943a(byteArrayOutputStream, (byte) 0, new byte[0]);
    }

    /* renamed from: b */
    public static byte[] m18084b(Context context, C1586a c1586a) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                m18086a(byteArrayOutputStream, c1586a.f23243a);
                m18086a(byteArrayOutputStream, c1586a.f23244b);
                m18086a(byteArrayOutputStream, c1586a.f23245c);
                m18086a(byteArrayOutputStream, c1586a.f23246d);
                m18086a(byteArrayOutputStream, c1586a.f23247e);
                m18086a(byteArrayOutputStream, c1586a.f23248f);
                m18086a(byteArrayOutputStream, c1586a.f23249g);
                m18086a(byteArrayOutputStream, c1586a.f23250h);
                m18086a(byteArrayOutputStream, c1586a.f23251i);
                m18086a(byteArrayOutputStream, c1586a.f23252j);
                m18086a(byteArrayOutputStream, c1586a.f23253k);
                m18086a(byteArrayOutputStream, c1586a.f23254l);
                m18086a(byteArrayOutputStream, c1586a.f23255m);
                m18086a(byteArrayOutputStream, c1586a.f23256n);
                m18086a(byteArrayOutputStream, c1586a.f23257o);
                m18086a(byteArrayOutputStream, c1586a.f23258p);
                m18086a(byteArrayOutputStream, c1586a.f23259q);
                m18086a(byteArrayOutputStream, c1586a.f23260r);
                m18086a(byteArrayOutputStream, c1586a.f23261s);
                m18086a(byteArrayOutputStream, c1586a.f23262t);
                m18086a(byteArrayOutputStream, c1586a.f23263u);
                m18086a(byteArrayOutputStream, c1586a.f23264v);
                m18086a(byteArrayOutputStream, c1586a.f23265w);
                m18086a(byteArrayOutputStream, c1586a.f23266x);
                m18086a(byteArrayOutputStream, c1586a.f23267y);
                byte[] m18090a = m18090a(context, byteArrayOutputStream);
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                return m18090a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1612dl.m17891a(th, "CI", "gzx");
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
    public static byte[] m18090a(Context context, ByteArrayOutputStream byteArrayOutputStream) {
        return m18082b(context, C1602db.m17932b(byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: b */
    public static C1586a m18083b(Context context, boolean z) {
        C1586a c1586a = new C1586a(null);
        c1586a.f23243a = C1587cu.m18031v(context);
        c1586a.f23244b = C1587cu.m18040m(context);
        String m18045h = C1587cu.m18045h(context);
        if (m18045h == null) {
            m18045h = "";
        }
        c1586a.f23245c = m18045h;
        c1586a.f23246d = C1573cq.m18121c(context);
        c1586a.f23247e = Build.MODEL;
        c1586a.f23248f = Build.MANUFACTURER;
        c1586a.f23249g = Build.DEVICE;
        c1586a.f23250h = C1573cq.m18123b(context);
        c1586a.f23251i = C1573cq.m18120d(context);
        c1586a.f23252j = String.valueOf(Build.VERSION.SDK_INT);
        c1586a.f23253k = C1587cu.m18029x(context);
        c1586a.f23254l = C1587cu.m18032u(context);
        StringBuilder sb = new StringBuilder();
        sb.append(C1587cu.m18035r(context));
        c1586a.f23255m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1587cu.m18036q(context));
        c1586a.f23256n = sb2.toString();
        c1586a.f23257o = C1587cu.m18027z(context);
        c1586a.f23258p = C1587cu.m18037p(context);
        if (z) {
            c1586a.f23259q = "";
            c1586a.f23260r = "";
        } else {
            c1586a.f23259q = C1587cu.m18041l(context);
            c1586a.f23260r = C1587cu.m18042k(context);
        }
        if (z) {
            c1586a.f23261s = "";
            c1586a.f23262t = "";
        } else {
            String[] m18039n = C1587cu.m18039n(context);
            c1586a.f23261s = m18039n[0];
            c1586a.f23262t = m18039n[1];
        }
        c1586a.f23265w = C1587cu.m18073a();
        String m18067b = C1587cu.m18067b(context);
        if (!TextUtils.isEmpty(m18067b)) {
            c1586a.f23266x = m18067b;
        } else {
            c1586a.f23266x = "";
        }
        c1586a.f23267y = "aid=" + C1587cu.m18043j(context) + "|serial=" + C1587cu.m18044i(context) + "|storage=" + C1587cu.m18066c() + "|ram=" + C1587cu.m18028y(context) + "|arch=" + C1587cu.m18051d();
        String m18072a = C1587cu.m18072a(context);
        if (!TextUtils.isEmpty(m18072a)) {
            c1586a.f23267y += "|adiuExtras=" + m18072a;
        }
        String m18070a = C1587cu.m18070a(context, Constants.ACCEPT_TIME_SEPARATOR_SP, true);
        if (!TextUtils.isEmpty(m18070a)) {
            c1586a.f23267y += "|multiImeis=" + m18070a;
        }
        String m18030w = C1587cu.m18030w(context);
        if (!TextUtils.isEmpty(m18030w)) {
            c1586a.f23267y += "|meid=" + m18030w;
        }
        return c1586a;
    }

    /* renamed from: a */
    public static byte[] m18088a(Context context, boolean z) {
        try {
            return m18084b(context, m18083b(context, z));
        } catch (Throwable th) {
            C1612dl.m17891a(th, "CI", "gz");
            return null;
        }
    }

    /* renamed from: a */
    public static String m18089a(Context context, String str, String str2) {
        try {
            String m18119e = C1573cq.m18119e(context);
            new StringBuilder();
            return C1594cx.m17990b(C0002O.m25083C(m18119e, Constants.COLON_SEPARATOR, str.substring(0, str.length() - 3), Constants.COLON_SEPARATOR, str2));
        } catch (Throwable th) {
            C1612dl.m17891a(th, "CI", "Sco");
            return null;
        }
    }
}
