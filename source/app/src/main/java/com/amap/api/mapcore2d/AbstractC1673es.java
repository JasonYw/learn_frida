package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.es */
/* loaded from: classes19.dex */
public abstract class AbstractC1673es extends AbstractC1683ew {

    /* renamed from: a */
    public Context f23541a;

    /* renamed from: b */
    public C1599da f23542b;

    static {
        Covode.recordClassIndex(5221);
    }

    /* renamed from: b */
    public abstract byte[] mo17328b();

    /* renamed from: c */
    public abstract byte[] mo17324c();

    /* renamed from: d */
    public String mo17609d() {
        return "2.1";
    }

    /* renamed from: e */
    public boolean mo17323e() {
        return true;
    }

    /* renamed from: k */
    public boolean mo17318k() {
        return false;
    }

    /* renamed from: j */
    public String mo17319j() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.f23542b.m17966c(), this.f23542b.m17972a());
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public Map<String, String> mo17321g() {
        String m18118f = C1573cq.m18118f(this.f23541a);
        String m18093a = C1584ct.m18093a();
        String m18089a = C1584ct.m18089a(this.f23541a, m18093a, C0002O.m25086C("key=", m18118f));
        HashMap hashMap = new HashMap();
        hashMap.put("ts", m18093a);
        hashMap.put("key", m18118f);
        hashMap.put("scode", m18089a);
        return hashMap;
    }

    /* renamed from: q */
    private byte[] m17607q() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(C1602db.m17940a("PANDORA$"));
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
                    C1612dl.m17891a(th22, "bre", "gbh");
                }
            }
        }
    }

    /* renamed from: r */
    private byte[] m17606r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] mo17328b = mo17328b();
            if (mo17328b != null && mo17328b.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(m17610a(mo17328b));
                byteArrayOutputStream.write(mo17328b);
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
                    C1612dl.m17891a(th222, "bre", "grrd");
                }
            }
        }
    }

    /* renamed from: s */
    private byte[] m17605s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] mo17324c = mo17324c();
            if (mo17324c != null && mo17324c.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] m18087a = C1584ct.m18087a(this.f23541a, mo17324c);
                byteArrayOutputStream.write(m17610a(m18087a));
                byteArrayOutputStream.write(m18087a);
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
                    C1612dl.m17891a(th222, "bre", "gred");
                }
            }
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: a_ */
    public final byte[] mo17570a_() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(m17607q());
            byteArrayOutputStream.write(m17608i());
            byteArrayOutputStream.write(m17606r());
            byteArrayOutputStream.write(m17605s());
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
                    C1612dl.m17891a(th22, "bre", "geb");
                }
            }
        }
    }

    /* renamed from: i */
    public byte[] m17608i() {
        String str = "gred";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (mo17323e()) {
                byte[] m18088a = C1584ct.m18088a(this.f23541a, mo17318k());
                byteArrayOutputStream.write(m17610a(m18088a));
                byteArrayOutputStream.write(m18088a);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] m17940a = C1602db.m17940a(mo17609d());
            if (m17940a != null && m17940a.length > 0) {
                byteArrayOutputStream.write(m17610a(m17940a));
                byteArrayOutputStream.write(m17940a);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] m17940a2 = C1602db.m17940a(mo17319j());
            if (m17940a2 != null && m17940a2.length > 0) {
                byteArrayOutputStream.write(m17610a(m17940a2));
                byteArrayOutputStream.write(m17940a2);
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
                    C1612dl.m17891a(th22, "bre", str);
                }
            }
        }
    }

    /* renamed from: a */
    public byte[] m17610a(byte[] bArr) {
        int length = bArr.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public AbstractC1673es(Context context, C1599da c1599da) {
        if (context != null) {
            this.f23541a = context.getApplicationContext();
        }
        this.f23542b = c1599da;
    }
}
