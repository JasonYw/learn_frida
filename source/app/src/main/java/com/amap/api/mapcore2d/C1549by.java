package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.by */
/* loaded from: classes19.dex */
public class C1549by extends AbstractC1635e {

    /* renamed from: c */
    public C1781w f23079c;

    /* renamed from: d */
    public C1781w f23080d;

    /* renamed from: e */
    public int f23081e;

    /* renamed from: f */
    public int f23082f;

    /* renamed from: g */
    public int f23083g;

    /* renamed from: h */
    public int f23084h;

    /* renamed from: i */
    public int f23085i;

    /* renamed from: j */
    public int f23086j;

    /* renamed from: k */
    public int f23087k;

    /* renamed from: l */
    public AbstractC1550bz f23088l;

    /* renamed from: m */
    public long f23089m = System.currentTimeMillis();

    /* renamed from: n */
    public int f23090n;

    static {
        Covode.recordClassIndex(5097);
    }

    /* renamed from: g */
    public void m18219g() {
        C1534bm.m18271a().m18269b();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: b */
    public void mo17786b() {
        this.f23088l.mo18217c();
        C1765n.m17212a().m17210b();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: c */
    public void mo17783c() {
        this.f23088l.mo18217c();
        C1762l.m17233a().m17231b();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: a */
    public void mo17791a() {
        m18220b(this.f23090n);
        int m17158e = (int) this.f23080d.m17158e();
        int m17157f = (int) this.f23080d.m17157f();
        if (!m17778f()) {
            this.f23081e = m17158e;
            this.f23082f = m17157f;
            this.f23088l.mo18218a(new C1781w(this.f23082f, this.f23081e, false));
            return;
        }
        this.f23087k++;
        this.f23081e = m18221a(this.f23081e, m17158e, this.f23083g);
        this.f23082f = m18221a(this.f23082f, m17157f, this.f23084h);
        this.f23088l.mo18218a(new C1781w(this.f23082f, this.f23081e, false));
        if (this.f23081e == m17158e && this.f23082f == m17157f) {
            m17787a(false);
            m17784b(true);
            m18219g();
        }
    }

    /* renamed from: b */
    private void m18220b(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f23089m = currentTimeMillis;
        float f = ((int) (currentTimeMillis - this.f23089m)) / i;
        this.f23083g = (int) (this.f23085i * f);
        this.f23084h = (int) (this.f23086j * f);
    }

    /* renamed from: a */
    private int m18221a(int i, int i2, int i3) {
        int i4;
        if (i2 > i) {
            i4 = i + i3;
            if (i4 >= i2) {
                this.f23087k = 0;
                return i2;
            }
        } else {
            i4 = i - i3;
            if (i4 <= i2) {
                this.f23087k = 0;
                return i2;
            }
        }
        return i4;
    }

    public C1549by(int i, int i2, C1781w c1781w, C1781w c1781w2, int i3, AbstractC1550bz abstractC1550bz) {
        super(i, i2);
        this.f23079c = c1781w;
        this.f23080d = c1781w2;
        this.f23081e = (int) this.f23079c.m17158e();
        this.f23082f = (int) this.f23079c.m17157f();
        this.f23088l = abstractC1550bz;
        this.f23085i = (int) Math.abs(c1781w2.m17158e() - this.f23079c.m17158e());
        this.f23086j = (int) Math.abs(c1781w2.m17157f() - this.f23079c.m17157f());
        this.f23090n = i;
    }
}
