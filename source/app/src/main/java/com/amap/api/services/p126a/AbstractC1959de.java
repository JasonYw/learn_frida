package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.de */
/* loaded from: classes19.dex */
public abstract class AbstractC1959de extends AbstractC1969di {

    /* renamed from: a */
    public Context f24729a;

    /* renamed from: b */
    public C1889bo f24730b;

    static {
        Covode.recordClassIndex(5570);
    }

    /* renamed from: b */
    public abstract byte[] mo16496b();

    /* renamed from: c */
    public abstract byte[] mo16495c();

    /* renamed from: f */
    public String mo16494f() {
        return "2.1";
    }

    /* renamed from: g */
    public boolean m16493g() {
        return true;
    }

    /* renamed from: l */
    public boolean m16490l() {
        return false;
    }

    /* renamed from: t */
    private boolean m16487t() {
        C1889bo c1889bo = this.f24730b;
        if (c1889bo != null && "navi".equals(c1889bo.m16818a())) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public String m16491k() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.f24730b.m16812c(), this.f24730b.m16818a());
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        String m16960f = C1864bf.m16960f(this.f24729a);
        String m16937a = C1875bi.m16937a();
        String m16933a = C1875bi.m16933a(this.f24729a, m16937a, C0002O.m25086C("key=", m16960f));
        HashMap hashMap = new HashMap();
        hashMap.put("ts", m16937a);
        hashMap.put("key", m16960f);
        hashMap.put("scode", m16933a);
        return hashMap;
    }

    /* renamed from: a */
    private byte[] m16498a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(C1892bp.m16786a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th22) {
                    return null;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } finally {
                    C1901by.m16742a(th22, "bre", "gbh");
                }
            }
        }
    }

    /* renamed from: r */
    private byte[] m16489r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] mo16496b = mo16496b();
            if (mo16496b != null && mo16496b.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(m16497a(mo16496b));
                byteArrayOutputStream.write(mo16496b);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                return byteArray2;
            }
        } catch (Throwable th22) {
            try {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th222) {
                }
                return new byte[]{0};
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } finally {
                    C1901by.m16742a(th222, "bre", "grrd");
                }
            }
        }
    }

    /* renamed from: s */
    private byte[] m16488s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] mo16495c = mo16495c();
            if (mo16495c != null && mo16495c.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] m16930a = C1875bi.m16930a(this.f24729a, mo16495c);
                byteArrayOutputStream.write(m16497a(m16930a));
                byteArrayOutputStream.write(m16930a);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                return byteArray2;
            }
        } catch (Throwable th22) {
            try {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th222) {
                }
                return new byte[]{0};
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } finally {
                    C1901by.m16742a(th222, "bre", "gred");
                }
            }
        }
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: h */
    public final byte[] mo16449h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(m16498a());
            byteArrayOutputStream.write(m16492j());
            byteArrayOutputStream.write(m16489r());
            byteArrayOutputStream.write(m16488s());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th22) {
                    return null;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } finally {
                    C1901by.m16742a(th22, "bre", "geb");
                }
            }
        }
    }

    /* renamed from: j */
    public byte[] m16492j() {
        String str = "gred";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (m16493g()) {
                byte[] m16931a = C1875bi.m16931a(this.f24729a, m16490l(), m16487t());
                byteArrayOutputStream.write(m16497a(m16931a));
                byteArrayOutputStream.write(m16931a);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] m16786a = C1892bp.m16786a(mo16494f());
            if (m16786a != null && m16786a.length > 0) {
                byteArrayOutputStream.write(m16497a(m16786a));
                byteArrayOutputStream.write(m16786a);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] m16786a2 = C1892bp.m16786a(m16491k());
            if (m16786a2 != null && m16786a2.length > 0) {
                byteArrayOutputStream.write(m16497a(m16786a2));
                byteArrayOutputStream.write(m16786a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                str = "gpd";
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th22) {
                }
                return new byte[]{0};
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } finally {
                    C1901by.m16742a(th22, "bre", str);
                }
            }
        }
    }

    /* renamed from: a */
    public byte[] m16497a(byte[] bArr) {
        int length = bArr.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public AbstractC1959de(Context context, C1889bo c1889bo) {
        if (context != null) {
            this.f24729a = context.getApplicationContext();
        }
        this.f24730b = c1889bo;
    }
}
