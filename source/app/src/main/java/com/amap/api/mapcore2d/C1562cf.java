package com.amap.api.mapcore2d;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.cf */
/* loaded from: classes19.dex */
public class C1562cf extends AbstractC1635e {

    /* renamed from: c */
    public float f23144c;

    /* renamed from: d */
    public boolean f23145d;

    /* renamed from: e */
    public Animation.AnimationListener f23146e;

    /* renamed from: f */
    public GestureDetector$OnDoubleTapListenerC1507b f23147f;

    /* renamed from: g */
    public float f23148g;

    /* renamed from: h */
    public float f23149h;

    /* renamed from: i */
    public float f23150i;

    /* renamed from: j */
    public float f23151j;

    /* renamed from: k */
    public float f23152k;

    /* renamed from: l */
    public boolean f23153l;

    /* renamed from: m */
    public boolean f23154m;

    static {
        Covode.recordClassIndex(5110);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: c */
    public void mo17783c() {
        mo17786b();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: a */
    public void mo17791a() {
        try {
            if (this.f23147f != null && this.f23147f.f22843a != null) {
                if (this.f23153l) {
                    this.f23147f.f22843a.f22787h.f22732c += this.f23152k;
                } else {
                    this.f23147f.f22843a.f22787h.f22732c -= this.f23152k;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(this.f23147f.f22843a.f22787h.f22732c, this.f23147f.f22843a.f22787h.f22732c, this.f23148g, this.f23149h);
                this.f23147f.m18389c(this.f23147f.f22843a.f22787h.f22732c);
                this.f23147f.m18397b(matrix);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: b */
    public void mo17786b() {
        if (this.f23154m) {
            return;
        }
        try {
        } catch (Exception e) {
            C1569cm.m18147a(e, "ZoomCtlAnim", "onStop");
        }
        if (this.f23147f != null && this.f23147f.mo17149a() != null) {
            this.f23147f.mo17149a().f22784e.f22790b = false;
            if (this.f23145d) {
                Point point = new Point((int) this.f23148g, (int) this.f23149h);
                C1781w mo18287a = this.f23147f.mo17142d().mo18287a((int) this.f23148g, (int) this.f23149h);
                this.f23147f.mo17149a().f22787h.f22741l = this.f23147f.mo17149a().f22787h.m18514a(mo18287a);
                this.f23147f.mo17149a().f22787h.m18518a(point);
                this.f23147f.mo17149a().f22782c.m18438a(false, false);
            }
            this.f23147f.m18377i().m18579c(this.f23144c);
            this.f23146e.onAnimationEnd(null);
            if (this.f23145d) {
                Point point2 = new Point(this.f23147f.mo17149a().f22782c.m18433c() / 2, this.f23147f.mo17149a().f22782c.m18432d() / 2);
                C1781w mo18287a2 = this.f23147f.mo17142d().mo18287a(this.f23147f.mo17149a().f22782c.m18433c() / 2, this.f23147f.mo17149a().f22782c.m18432d() / 2);
                this.f23147f.mo17149a().f22787h.f22741l = this.f23147f.mo17149a().f22787h.m18514a(mo18287a2);
                this.f23147f.mo17149a().f22787h.m18518a(point2);
                this.f23147f.mo17149a().f22782c.m18438a(false, false);
            }
            this.f23147f.f22843a.f22787h.f22732c = 1.0f;
            AbstractC1518bb.f22934j = 1.0f;
            this.f23147f.mo17149a().m18475a(true);
            C1762l.m17233a().m17231b();
            this.f23418a = 160;
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1635e
    /* renamed from: a */
    public void mo17790a(int i) {
        this.f23418a = i / 2;
    }

    public C1562cf(GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b, Animation.AnimationListener animationListener, int i) {
        super(i < 160 ? 160 : i, 40);
        this.f23154m = false;
        this.f23144c = -1.0f;
        this.f23145d = false;
        this.f23147f = gestureDetector$OnDoubleTapListenerC1507b;
        this.f23146e = animationListener;
        this.f23418a /= 2;
    }

    /* renamed from: a */
    public void m18178a(float f, boolean z, float f2, float f3) {
        this.f23147f.f22881c[0] = this.f23147f.f22881c[1];
        this.f23147f.f22881c[1] = f;
        if (this.f23147f.f22881c[0] == this.f23147f.f22881c[1]) {
            return;
        }
        this.f23147f.mo17149a().m18475a(this.f23147f.m18381g());
        if (!m17778f()) {
            if (this.f23418a < 160) {
                this.f23418a = 160;
            }
            m18179a(this.f23147f.m18365o(), f, z, f2, f3);
            this.f23147f.mo17149a().f22784e.m18462a(true);
            this.f23147f.mo17149a().f22784e.f22790b = true;
            this.f23146e.onAnimationStart(null);
            super.m17781d();
            return;
        }
        this.f23154m = true;
        m17779e();
        m18179a(this.f23151j, f, z, f2, f3);
        this.f23147f.mo17149a().f22784e.m18462a(true);
        this.f23147f.mo17149a().f22784e.f22790b = true;
        this.f23146e.onAnimationStart(null);
        super.m17781d();
        this.f23154m = false;
    }

    /* renamed from: a */
    public void m18179a(float f, float f2, boolean z, float f3, float f4) {
        this.f23153l = z;
        this.f23148g = f3;
        this.f23149h = f4;
        this.f23150i = f;
        this.f23147f.f22843a.f22787h.f22732c = this.f23150i;
        if (this.f23153l) {
            this.f23152k = (this.f23147f.f22843a.f22787h.f22732c * this.f23419b) / this.f23418a;
            this.f23151j = this.f23150i * 2.0f;
            return;
        }
        this.f23152k = ((this.f23147f.f22843a.f22787h.f22732c * 0.5f) * this.f23419b) / this.f23418a;
        this.f23151j = this.f23150i * 0.5f;
    }
}
