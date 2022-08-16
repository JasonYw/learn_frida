package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import com.amap.api.mapcore2d.C1499az;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.amap.api.mapcore2d.av */
/* loaded from: classes19.dex */
public class C1492av {

    /* renamed from: e */
    public int f22734e;

    /* renamed from: k */
    public double f22740k;

    /* renamed from: l */
    public C1781w f22741l;

    /* renamed from: m */
    public C1781w f22742m;

    /* renamed from: n */
    public Point f22743n;

    /* renamed from: o */
    public C1493a f22744o;

    /* renamed from: p */
    public C1499az.C1505c f22745p;

    /* renamed from: a */
    public int f22730a = 256;

    /* renamed from: b */
    public int f22731b = 256;

    /* renamed from: c */
    public float f22732c = 1.0f;

    /* renamed from: q */
    public double f22746q = 116.39716d;

    /* renamed from: r */
    public double f22747r = 39.91669d;

    /* renamed from: d */
    public double f22733d = 156543.0339d;

    /* renamed from: f */
    public double f22735f = -2.003750834E7d;

    /* renamed from: g */
    public double f22736g = 2.003750834E7d;

    /* renamed from: h */
    public int f22737h = C1771q.f24015d;

    /* renamed from: i */
    public int f22738i = C1771q.f24014c;

    /* renamed from: j */
    public float f22739j = 10.0f;

    /* renamed from: s */
    public double f22748s = 0.01745329251994329d;

    /* renamed from: com.amap.api.mapcore2d.av$a */
    /* loaded from: classes19.dex */
    public static class C1493a {

        /* renamed from: a */
        public float f22749a;

        /* renamed from: b */
        public float f22750b;

        /* renamed from: c */
        public float f22751c;

        /* renamed from: d */
        public float f22752d;

        static {
            Covode.recordClassIndex(5041);
        }
    }

    static {
        Covode.recordClassIndex(5040);
    }

    /* renamed from: a */
    public void m18521a() {
        this.f22733d = (this.f22736g * 2.0d) / this.f22730a;
        float f = this.f22739j;
        int i = (int) f;
        this.f22740k = (this.f22733d / (1 << i)) / ((f + 1.0f) - i);
        this.f22741l = m18514a(new C1781w(this.f22747r, this.f22746q, true));
        this.f22742m = this.f22741l.m17156g();
        this.f22743n = new Point(this.f22745p.m18433c() / 2, this.f22745p.m18432d() / 2);
        this.f22744o = new C1493a();
        C1493a c1493a = this.f22744o;
        c1493a.f22749a = -2.0037508E7f;
        c1493a.f22750b = 2.0037508E7f;
        c1493a.f22751c = 2.0037508E7f;
        c1493a.f22752d = -2.0037508E7f;
    }

    /* renamed from: a */
    public ArrayList<C1541bs> m18513a(C1781w c1781w, int i, int i2, int i3) {
        int i4;
        double d;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double d2 = this.f22740k;
        double m17158e = c1781w.m17158e();
        double d3 = this.f22735f;
        int i11 = (int) ((m17158e - d3) / (this.f22730a * d2));
        double d4 = (i4 * i11 * d2) + d3;
        int i12 = this.f22734e;
        if (i12 == 0) {
            i5 = (int) ((this.f22736g - c1781w.m17157f()) / (this.f22730a * d2));
            d = this.f22736g - ((i10 * i5) * d2);
        } else if (i12 == 1) {
            i5 = (int) ((c1781w.m17157f() - this.f22736g) / (this.f22730a * d2));
            d = (i5 + 1) * i6 * d2;
        } else {
            d = 0.0d;
            i5 = 0;
        }
        PointF m18511a = m18511a(new C1781w(d, d4, false), c1781w, this.f22743n, d2);
        C1541bs c1541bs = new C1541bs(i11, i5, m18510b(), -1);
        c1541bs.f23058g = m18511a;
        ArrayList<C1541bs> arrayList = new ArrayList<>();
        arrayList.add(c1541bs);
        int i13 = 1;
        while (true) {
            int i14 = i11 - i13;
            int i15 = i14;
            boolean z = false;
            while (true) {
                i7 = i11 + i13;
                i8 = i2;
                i9 = i3;
                if (i15 > i7) {
                    break;
                }
                int i16 = i5 + i13;
                int i17 = i5;
                try {
                    PointF m18519a = m18519a(i15, i16, i11, i17, m18511a, i8, i9);
                    if (m18519a != null) {
                        if (!z) {
                            z = true;
                        }
                        C1541bs c1541bs2 = new C1541bs(i15, i16, m18510b(), -1);
                        c1541bs2.f23058g = m18519a;
                        arrayList.add(c1541bs2);
                    }
                    int i18 = i17 - i13;
                    int i19 = i15;
                    i11 = i11;
                    m18511a = m18511a;
                    PointF m18519a2 = m18519a(i19, i18, i11, i17, m18511a, i8, i9);
                    if (m18519a2 != null) {
                        if (!z) {
                            z = true;
                        }
                        C1541bs c1541bs3 = new C1541bs(i19, i18, m18510b(), -1);
                        c1541bs3.f23058g = m18519a2;
                        arrayList.add(c1541bs3);
                    }
                    i15 = i19 + 1;
                    i5 = i17;
                } catch (Error e) {
                    C1569cm.m18147a(e, "MapProjection", "getTilesInDomain");
                }
            }
            int i20 = (i5 + i13) - 1;
            while (i20 > i5 - i13) {
                int i21 = i7;
                int i22 = i11;
                int i23 = i5;
                PointF pointF = m18511a;
                int i24 = i8;
                int i25 = i9;
                PointF m18519a3 = m18519a(i7, i20, i22, i23, pointF, i24, i25);
                if (m18519a3 != null) {
                    if (!z) {
                        z = true;
                    }
                    C1541bs c1541bs4 = new C1541bs(i21, i20, m18510b(), -1);
                    c1541bs4.f23058g = m18519a3;
                    arrayList.add(c1541bs4);
                }
                i11 = i22;
                i5 = i23;
                m18511a = pointF;
                i8 = i24;
                i9 = i25;
                PointF m18519a4 = m18519a(i14, i20, i11, i5, m18511a, i8, i9);
                if (m18519a4 != null) {
                    if (!z) {
                        z = true;
                    }
                    C1541bs c1541bs5 = new C1541bs(i14, i20, m18510b(), -1);
                    c1541bs5.f23058g = m18519a4;
                    arrayList.add(c1541bs5);
                }
                i20--;
                i7 = i21;
            }
            if (!z) {
                break;
            }
            i13++;
        }
        return arrayList;
    }

    /* renamed from: b */
    public int m18510b() {
        float f = this.f22739j;
        int i = (int) f;
        if (f - i < C1499az.f22780a) {
            return i;
        }
        return i + 1;
    }

    /* renamed from: a */
    public void m18518a(Point point) {
        this.f22743n = point;
    }

    public C1492av(C1499az.C1505c c1505c) {
        this.f22745p = c1505c;
    }

    /* renamed from: b */
    public C1781w m18507b(C1781w c1781w) {
        if (c1781w == null) {
            return null;
        }
        return new C1781w((int) (((float) (((Math.atan(Math.exp((((float) ((c1781w.m17157f() * 180.0d) / 2.003750834E7d)) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d)) * 1000000.0d), (int) (((float) ((c1781w.m17158e() * 180.0d) / 2.003750834E7d)) * 1000000.0d));
    }

    /* renamed from: a */
    public C1781w m18514a(C1781w c1781w) {
        if (c1781w == null) {
            return null;
        }
        return new C1781w(((Math.log(Math.tan((((c1781w.m17162b() / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d, ((c1781w.m17164a() / 1000000.0d) * 2.003750834E7d) / 180.0d, false);
    }

    /* renamed from: a */
    public PointF m18520a(int i, int i2) {
        double d;
        int i3 = this.f22730a;
        double d2 = this.f22740k;
        double d3 = (i * i3 * d2) + this.f22735f;
        int i4 = this.f22734e;
        if (i4 == 0) {
            d = this.f22736g - ((i2 * i3) * d2);
        } else if (i4 == 1) {
            d = (i2 + 1) * i3 * d2;
        } else {
            d = 0.0d;
        }
        return m18511a(new C1781w(d, d3, false), this.f22741l, this.f22743n, this.f22740k);
    }

    /* renamed from: b */
    private double[] m18509b(PointF pointF, PointF pointF2) {
        double d = this.f22740k;
        C1781w m18508b = m18508b(pointF, this.f22741l, this.f22743n, d, this.f22744o);
        C1781w m18508b2 = m18508b(pointF2, this.f22741l, this.f22743n, d, this.f22744o);
        double m17158e = m18508b2.m17158e() - m18508b.m17158e();
        double m17157f = m18508b2.m17157f() - m18508b.m17157f();
        double m17158e2 = this.f22741l.m17158e() + m17158e;
        double m17157f2 = this.f22741l.m17157f() + m17157f;
        while (m17158e2 < this.f22744o.f22749a) {
            m17158e2 += this.f22744o.f22750b - this.f22744o.f22749a;
        }
        while (m17158e2 > this.f22744o.f22750b) {
            m17158e2 -= this.f22744o.f22750b - this.f22744o.f22749a;
        }
        while (m17157f2 < this.f22744o.f22752d) {
            m17157f2 += this.f22744o.f22751c - this.f22744o.f22752d;
        }
        while (m17157f2 > this.f22744o.f22751c) {
            m17157f2 -= this.f22744o.f22751c - this.f22744o.f22752d;
        }
        return new double[]{m17158e2, m17157f2};
    }

    /* renamed from: a */
    public float m18512a(C1781w c1781w, C1781w c1781w2) {
        if (c1781w != null && c1781w2 != null) {
            double m17196a = C1773r.m17196a(c1781w.m17160c());
            double m17196a2 = C1773r.m17196a(c1781w.m17159d());
            double m17196a3 = C1773r.m17196a(c1781w2.m17160c());
            double m17196a4 = C1773r.m17196a(c1781w2.m17159d());
            double d = this.f22748s;
            double d2 = m17196a * d;
            double d3 = m17196a2 * d;
            double d4 = m17196a3 * d;
            double d5 = m17196a4 * d;
            double sin = Math.sin(d2);
            double sin2 = Math.sin(d3);
            double cos = Math.cos(d2);
            double cos2 = Math.cos(d3);
            double sin3 = Math.sin(d4);
            double sin4 = Math.sin(d5);
            double cos3 = Math.cos(d4);
            double cos4 = Math.cos(d5);
            double[] dArr = {cos * cos2, cos2 * sin, sin2};
            double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
            return (float) (Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public C1781w m18517a(PointF pointF, PointF pointF2) {
        double[] m18509b = m18509b(pointF, pointF2);
        C1781w c1781w = new C1781w(this.f22741l.m17162b(), this.f22741l.m17164a());
        c1781w.m17161b(m18509b[1]);
        c1781w.m17163a(m18509b[0]);
        return c1781w;
    }

    /* renamed from: a */
    public void m18516a(PointF pointF, PointF pointF2, float f) {
        if (this.f22741l == null) {
            return;
        }
        double[] m18509b = m18509b(pointF, pointF2);
        this.f22741l.m17161b(m18509b[1]);
        this.f22741l.m17163a(m18509b[0]);
    }

    /* renamed from: b */
    public PointF m18506b(C1781w c1781w, C1781w c1781w2, Point point, double d) {
        if (this.f22745p != null && c1781w != null && c1781w2 != null && point != null) {
            return this.f22745p.m18429g().m18396b(m18511a(m18514a(c1781w), c1781w2, point, d));
        }
        return null;
    }

    /* renamed from: a */
    public PointF m18511a(C1781w c1781w, C1781w c1781w2, Point point, double d) {
        PointF pointF;
        if (c1781w == null || c1781w2 == null) {
            return null;
        }
        try {
            pointF = new PointF();
            try {
                pointF.x = (float) (((c1781w.m17158e() - c1781w2.m17158e()) / d) + point.x);
                pointF.y = (float) (point.y - ((c1781w.m17157f() - c1781w2.m17157f()) / d));
                return pointF;
            } catch (Throwable th) {
                th = th;
                C1569cm.m18147a(th, "MapProjection", "convertProjectionToScreen");
                return pointF;
            }
        } catch (Throwable th2) {
            th = th2;
            pointF = null;
        }
    }

    /* renamed from: a */
    public C1781w m18515a(PointF pointF, C1781w c1781w, Point point, double d, C1493a c1493a) {
        return m18507b(m18508b(pointF, c1781w, point, d, c1493a));
    }

    /* renamed from: b */
    public C1781w m18508b(PointF pointF, C1781w c1781w, Point point, double d, C1493a c1493a) {
        C1499az.C1505c c1505c = this.f22745p;
        if (c1505c != null && pointF != null && c1781w != null && point != null && c1493a != null) {
            PointF m18388c = c1505c.m18429g().m18388c(pointF);
            float f = m18388c.x - point.x;
            float f2 = m18388c.y - point.y;
            double m17158e = c1781w.m17158e() + (f * d);
            double m17157f = c1781w.m17157f() - (f2 * d);
            while (m17158e < c1493a.f22749a) {
                m17158e += c1493a.f22750b - c1493a.f22749a;
            }
            while (m17158e > c1493a.f22750b) {
                m17158e -= c1493a.f22750b - c1493a.f22749a;
            }
            while (m17157f < c1493a.f22752d) {
                m17157f += c1493a.f22751c - c1493a.f22752d;
            }
            while (m17157f > c1493a.f22751c) {
                m17157f -= c1493a.f22751c - c1493a.f22752d;
            }
            return new C1781w(m17157f, m17158e, false);
        }
        return null;
    }

    /* renamed from: a */
    public PointF m18519a(int i, int i2, int i3, int i4, PointF pointF, int i5, int i6) {
        PointF pointF2 = new PointF();
        pointF2.x = ((i - i3) * this.f22730a) + pointF.x;
        int i7 = this.f22734e;
        if (i7 == 0) {
            pointF2.y = ((i2 - i4) * this.f22730a) + pointF.y;
        } else if (i7 == 1) {
            pointF2.y = pointF.y - ((i2 - i4) * this.f22730a);
        }
        if (pointF2.x + this.f22730a > 0.0f && pointF2.x < i5 && pointF2.y + this.f22730a > 0.0f && pointF2.y < i6) {
            return pointF2;
        }
        return null;
    }
}
