package com.alipay.sdk.p082m.p110n0;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p106l0.C1317b;
import com.alipay.sdk.p082m.p106l0.C1321c;
import com.alipay.sdk.p082m.p106l0.C1322d;
import com.alipay.sdk.p082m.p106l0.C1323e;
import com.alipay.sdk.p082m.p106l0.C1326f;
import com.alipay.sdk.p082m.p108m0.C1332a;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.n0.d */
/* loaded from: classes13.dex */
public class C1341d {

    /* renamed from: j */
    public static C1341d f22291j;

    /* renamed from: a */
    public Context f22293a;

    /* renamed from: c */
    public C1342e f22295c;

    /* renamed from: d */
    public String f22296d;

    /* renamed from: e */
    public String f22297e;

    /* renamed from: f */
    public C1332a f22298f;

    /* renamed from: g */
    public C1332a f22299g;

    /* renamed from: i */
    public static final Object f22290i = new Object();

    /* renamed from: k */
    public static final String f22292k = C0002O.m25085C(".UTSystemConfig", File.separator, "Global");

    /* renamed from: b */
    public String f22294b = null;

    /* renamed from: h */
    public Pattern f22300h = C116971W2r.LIZJ("[^0-9a-zA-Z=/+]+");

    /* renamed from: b */
    public synchronized String m19047b() {
        String str = this.f22294b;
        if (str != null) {
            return str;
        }
        return m19051a();
    }

    static {
        Covode.recordClassIndex(4841);
    }

    /* renamed from: f */
    private String m19041f() {
        C1332a c1332a = this.f22299g;
        if (c1332a != null) {
            String m19088a = c1332a.m19088a("UTDID2");
            if (!C1326f.m19144a(m19088a) && this.f22295c.m19040a(m19088a) != null) {
                return m19088a;
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private void m19043d() {
        C1332a c1332a = this.f22299g;
        if (c1332a != null) {
            if (C1326f.m19144a(c1332a.m19088a("UTDID2"))) {
                String m19088a = this.f22299g.m19088a("UTDID");
                if (!C1326f.m19144a(m19088a)) {
                    m19046b(m19088a);
                }
            }
            boolean z = false;
            if (!C1326f.m19144a(this.f22299g.m19088a("DID"))) {
                this.f22299g.m19085b("DID");
                z = true;
            }
            if (!C1326f.m19144a(this.f22299g.m19088a("EI"))) {
                this.f22299g.m19085b("EI");
                z = true;
            }
            if (!C1326f.m19144a(this.f22299g.m19088a("SI"))) {
                this.f22299g.m19085b("SI");
            } else if (!z) {
                return;
            }
            this.f22299g.m19089a();
        }
    }

    /* renamed from: e */
    private byte[] m19042e() {
        String sb;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nextInt = new Random().nextInt();
        byte[] m19154a = C1321c.m19154a((int) (System.currentTimeMillis() / 1000));
        byte[] m19154a2 = C1321c.m19154a(nextInt);
        byteArrayOutputStream.write(m19154a, 0, 4);
        byteArrayOutputStream.write(m19154a2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            sb = C1322d.m19152a(this.f22293a);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new Random().nextInt());
            sb = sb2.toString();
        }
        byteArrayOutputStream.write(C1321c.m19154a(C1326f.m19145a(sb)), 0, 4);
        byteArrayOutputStream.write(C1321c.m19154a(C1326f.m19145a(m19048a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public synchronized String m19045c() {
        String m19041f = m19041f();
        if (m19049a(m19041f)) {
            m19044c(this.f22295c.m19040a(m19041f));
            this.f22294b = m19041f;
            return m19041f;
        }
        String m19088a = this.f22298f.m19088a(this.f22296d);
        if (!C1326f.m19144a(m19088a)) {
            String m19037a = new C1343f().m19037a(m19088a);
            if (!m19049a(m19037a)) {
                m19037a = this.f22295c.m19038b(m19088a);
            }
            if (m19049a(m19037a) && !C1326f.m19144a(m19037a)) {
                this.f22294b = m19037a;
                m19046b(m19037a);
                return this.f22294b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized String m19051a() {
        String m19045c = m19045c();
        this.f22294b = m19045c;
        if (!TextUtils.isEmpty(m19045c)) {
            return this.f22294b;
        }
        try {
            byte[] m19042e = m19042e();
            if (m19042e != null) {
                String m19157c = C1317b.m19157c(m19042e, 2);
                this.f22294b = m19157c;
                m19046b(m19157c);
                String m19039a = this.f22295c.m19039a(m19042e);
                if (m19039a != null) {
                    m19044c(m19039a);
                }
                return this.f22294b;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static C1341d m19050a(Context context) {
        if (context != null && f22291j == null) {
            synchronized (f22290i) {
                if (f22291j == null) {
                    C1341d c1341d = new C1341d(context);
                    f22291j = c1341d;
                    c1341d.m19043d();
                }
            }
        }
        return f22291j;
    }

    /* renamed from: c */
    private void m19044c(String str) {
        C1332a c1332a;
        if (str != null && (c1332a = this.f22298f) != null && !str.equals(c1332a.m19088a(this.f22296d))) {
            this.f22298f.m19087a(this.f22296d, str);
            this.f22298f.m19089a();
        }
    }

    /* renamed from: a */
    private boolean m19049a(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f22300h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m19046b(String str) {
        C1332a c1332a;
        if (m19049a(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && (c1332a = this.f22299g) != null) {
                c1332a.m19087a("UTDID2", str);
                this.f22299g.m19089a();
            }
        }
    }

    public C1341d(Context context) {
        this.f22293a = null;
        this.f22295c = null;
        this.f22296d = "xx_utdid_key";
        this.f22297e = "xx_utdid_domain";
        this.f22298f = null;
        this.f22299g = null;
        this.f22293a = context;
        this.f22299g = new C1332a(context, f22292k, "Alvin2", false, true);
        this.f22298f = new C1332a(context, ".DataStorage", "ContextData", false, true);
        this.f22295c = new C1342e();
        this.f22296d = String.format("K_%d", Integer.valueOf(C1326f.m19145a(this.f22296d)));
        this.f22297e = String.format("D_%d", Integer.valueOf(C1326f.m19145a(this.f22297e)));
    }

    /* renamed from: a */
    public static String m19048a(byte[] bArr) {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C1323e.m19147a(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return C1317b.m19157c(mac.doFinal(bArr), 2);
    }
}
