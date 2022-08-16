package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.Message;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import androidx.core.view.MotionEventCompat;
import com.amap.api.mapcore2d.C1499az;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

/* renamed from: com.amap.api.mapcore2d.aq */
/* loaded from: classes19.dex */
public final class View$OnKeyListenerC1480aq implements View.OnKeyListener {

    /* renamed from: a */
    public float f22691a;

    /* renamed from: b */
    public float f22692b;

    /* renamed from: c */
    public C1499az f22693c;

    /* renamed from: d */
    public boolean f22694d;

    /* renamed from: e */
    public animationAnimation$AnimationListenerC1483b f22695e = new animationAnimation$AnimationListenerC1483b(this, null);

    /* renamed from: f */
    public C1482a f22696f = new C1482a(this, null);

    /* renamed from: com.amap.api.mapcore2d.aq$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C14811 {
        static {
            Covode.recordClassIndex(5029);
        }
    }

    static {
        Covode.recordClassIndex(5028);
    }

    /* renamed from: e */
    public final void m18573e() {
        this.f22694d = true;
    }

    /* renamed from: b */
    public final float m18587b() {
        return this.f22692b;
    }

    /* renamed from: a */
    public final void m18591a(C1781w c1781w) {
        if (m18582b(c1781w)) {
            m18577c(c1781w);
        }
    }

    /* renamed from: a */
    public final void m18590a(C1781w c1781w, float f) {
        if (m18582b(c1781w) || m18570f(f)) {
            m18577c(c1781w);
            m18572e(f);
        }
    }

    /* renamed from: a */
    public final boolean m18599a(int i) {
        return m18598a(1, i);
    }

    /* renamed from: a */
    public final boolean m18598a(int i, int i2) {
        C1499az c1499az = this.f22693c;
        if (c1499az == null || c1499az.f22782c == null) {
            return false;
        }
        return m18593a(this.f22693c.f22782c.m18433c() / 2, this.f22693c.f22782c.m18432d() / 2, true, false, i, i2);
    }

    /* renamed from: a */
    public final void m18588a(boolean z) {
        float m18431e;
        this.f22693c.f22782c.m18429g().m18362r();
        if (z) {
            m18431e = this.f22693c.f22782c.m18431e() + 1.0f;
        } else {
            m18431e = this.f22693c.f22782c.m18431e() - 1.0f;
        }
        float m18418a = this.f22693c.f22782c.m18429g().m18418a(m18431e);
        if (m18418a != this.f22693c.f22782c.m18431e()) {
            m18579c(m18418a);
        }
    }

    /* renamed from: a */
    public final boolean m18600a(float f, int i, int i2, int i3) {
        return m18597a(i, i2, f, i3);
    }

    /* renamed from: a */
    public final void m18589a(C1781w c1781w, int i) {
        this.f22696f.m18566a(c1781w, null, null, i);
    }

    /* renamed from: a */
    public final void m18595a(int i, int i2, int i3) {
        if (this.f22694d) {
            this.f22694d = false;
        } else if ((i == 0 && i2 == 0) || this.f22693c == null) {
        } else {
            try {
                if (C1771q.f24030s) {
                    m18589a(this.f22693c.f22787h.m18517a(new PointF(0.0f, 0.0f), new PointF(i, i2)), i3);
                }
                this.f22693c.f22782c.m18438a(false, false);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "scrollBy");
            }
        }
    }

    /* renamed from: a */
    public final boolean m18597a(int i, int i2, float f, int i3) {
        C1499az c1499az = this.f22693c;
        boolean z = false;
        if (c1499az != null && c1499az.f22782c != null) {
            this.f22693c.f22782c.m18429g().m18362r();
            float m18431e = this.f22693c.f22782c.m18431e();
            if (f != m18431e) {
                this.f22695e.m18561a(i, i2, f, m18431e, i3);
                z = true;
            }
            try {
                if (this.f22693c.f22786g.m18390c().isScaleControlsEnabled()) {
                    this.f22693c.f22786g.m18361s();
                    return z;
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "MapController", "zoomToAnimation");
            }
        }
        return z;
    }

    /* renamed from: com.amap.api.mapcore2d.aq$a */
    /* loaded from: classes19.dex */
    public class C1482a implements AbstractC1550bz {

        /* renamed from: b */
        public C1549by f22698b;

        /* renamed from: c */
        public Message f22699c;

        /* renamed from: d */
        public Runnable f22700d;

        static {
            Covode.recordClassIndex(5030);
        }

        /* renamed from: d */
        private void m18564d() {
            this.f22698b = null;
            this.f22699c = null;
            this.f22700d = null;
        }

        /* renamed from: b */
        public void m18565b() {
            C1549by c1549by = this.f22698b;
            if (c1549by != null) {
                c1549by.m17779e();
            }
        }

        /* renamed from: a */
        public boolean m18568a() {
            C1549by c1549by = this.f22698b;
            if (c1549by != null) {
                return c1549by.m17778f();
            }
            return false;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1550bz
        /* renamed from: c */
        public void mo18217c() {
            Message message = this.f22699c;
            if (message != null) {
                message.getTarget().sendMessage(this.f22699c);
            }
            Runnable runnable = this.f22700d;
            if (runnable != null) {
                runnable.run();
            }
            m18564d();
            if (View$OnKeyListenerC1480aq.this.f22693c != null && View$OnKeyListenerC1480aq.this.f22693c.f22783d != null) {
                View$OnKeyListenerC1480aq.this.f22693c.f22783d.f22806a = false;
            }
        }

        public C1482a() {
        }

        @Override // com.amap.api.mapcore2d.AbstractC1550bz
        /* renamed from: a */
        public void mo18218a(C1781w c1781w) {
            if (c1781w != null && View$OnKeyListenerC1480aq.this.f22693c != null) {
                if (c1781w.m17159d() != Long.MIN_VALUE && c1781w.m17160c() != Long.MIN_VALUE) {
                    View$OnKeyListenerC1480aq.this.m18591a(c1781w);
                    return;
                }
                View$OnKeyListenerC1480aq.this.m18591a(View$OnKeyListenerC1480aq.this.f22693c.f22787h.m18507b(c1781w));
            }
        }

        public /* synthetic */ C1482a(View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq, C14811 c14811) {
            this();
        }

        /* renamed from: a */
        private C1549by m18567a(C1781w c1781w, int i) {
            int i2 = i;
            if (i2 < 500) {
                i2 = 500;
            }
            try {
                return new C1549by(i2, 10, View$OnKeyListenerC1480aq.this.f22693c.f22787h.f22741l, c1781w, i2, this);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "makeTransTool");
                return null;
            }
        }

        /* renamed from: a */
        public void m18566a(C1781w c1781w, Message message, Runnable runnable, int i) {
            if (View$OnKeyListenerC1480aq.this.f22693c != null) {
                View$OnKeyListenerC1480aq.this.f22693c.f22783d.f22806a = true;
                View$OnKeyListenerC1480aq.this.f22693c.f22787h.f22742m = c1781w.m17156g();
            }
            this.f22698b = m18567a(c1781w, i);
            this.f22699c = message;
            this.f22700d = runnable;
            C1549by c1549by = this.f22698b;
            if (c1549by != null) {
                c1549by.m17781d();
            }
        }
    }

    /* renamed from: com.amap.api.mapcore2d.aq$b  reason: invalid class name */
    /* loaded from: classes19.dex */
    public class animationAnimation$AnimationListenerC1483b implements Animation.AnimationListener {

        /* renamed from: b */
        public LinkedList<Animation> f22702b;

        /* renamed from: c */
        public C1562cf f22703c;

        static {
            Covode.recordClassIndex(5031);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        /* renamed from: a */
        public void m18563a() {
            this.f22702b.clear();
        }

        public animationAnimation$AnimationListenerC1483b() {
            this.f22702b = new LinkedList<>();
            this.f22703c = null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (View$OnKeyListenerC1480aq.this.f22693c == null) {
                return;
            }
            if (this.f22702b.size() == 0) {
                View$OnKeyListenerC1480aq.this.f22693c.f22784e.m18461b();
            } else {
                View$OnKeyListenerC1480aq.this.f22693c.f22782c.m18429g().startAnimation(this.f22702b.remove());
            }
        }

        public /* synthetic */ animationAnimation$AnimationListenerC1483b(View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq, C14811 c14811) {
            this();
        }

        /* renamed from: a */
        public void m18561a(int i, int i2, float f, float f2, int i3) {
            boolean z;
            try {
                if (this.f22703c == null) {
                    this.f22703c = new C1562cf(View$OnKeyListenerC1480aq.this.f22693c.f22782c.m18429g(), this, i3);
                } else {
                    C1562cf c1562cf = this.f22703c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    c1562cf.mo17790a(i3);
                }
                this.f22703c.f23144c = f;
                if (f > f2) {
                    z = true;
                } else {
                    z = false;
                }
                this.f22703c.m18178a(f, z, i, i2);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "zoomTo");
            }
        }

        /* renamed from: a */
        private void m18562a(float f, int i, int i2, boolean z, int i3) {
            try {
                if (this.f22703c == null && View$OnKeyListenerC1480aq.this.f22693c != null && View$OnKeyListenerC1480aq.this.f22693c.f22782c != null) {
                    this.f22703c = new C1562cf(View$OnKeyListenerC1480aq.this.f22693c.f22782c.m18429g(), this, i3);
                } else {
                    C1562cf c1562cf = this.f22703c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    c1562cf.mo17790a(i3);
                }
                if (this.f22703c != null) {
                    this.f22703c.f23145d = z;
                    this.f22703c.f23144c = f;
                    this.f22703c.m18178a(f, false, i, i2);
                }
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "doZoomOut");
            }
        }

        /* renamed from: b */
        private void m18559b(float f, int i, int i2, boolean z, int i3) {
            try {
                if (this.f22703c == null) {
                    this.f22703c = new C1562cf(View$OnKeyListenerC1480aq.this.f22693c.f22782c.m18429g(), this, i3);
                } else {
                    C1562cf c1562cf = this.f22703c;
                    if (i3 <= 160) {
                        i3 = 160;
                    }
                    c1562cf.mo17790a(i3);
                }
                this.f22703c.f23144c = f;
                this.f22703c.f23145d = z;
                if (this.f22703c.f23145d) {
                    Point point = new Point(i, i2);
                    C1781w mo18287a = View$OnKeyListenerC1480aq.this.f22693c.f22782c.m18429g().mo17142d().mo18287a(i, i2);
                    View$OnKeyListenerC1480aq.this.f22693c.f22787h.f22741l = View$OnKeyListenerC1480aq.this.f22693c.f22787h.m18514a(mo18287a);
                    View$OnKeyListenerC1480aq.this.f22693c.f22787h.m18518a(point);
                }
                this.f22703c.m18178a(f, true, i, i2);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "doZoomIn");
            }
        }

        /* renamed from: a */
        public void m18560a(int i, int i2, float f, boolean z, boolean z2, int i3) {
            if (!z) {
                m18562a(f, i, i2, z2, i3);
            } else {
                m18559b(f, i, i2, z2, i3);
            }
        }
    }

    /* renamed from: a */
    public final float m18606a() {
        return this.f22691a;
    }

    /* renamed from: c */
    public final boolean m18580c() {
        return m18599a(0);
    }

    /* renamed from: d */
    public final boolean m18576d() {
        return m18584b(0);
    }

    /* renamed from: f */
    public final boolean m18571f() {
        return this.f22696f.m18568a();
    }

    /* renamed from: g */
    public final void m18569g() {
        this.f22696f.m18565b();
    }

    /* renamed from: b */
    public final void m18586b(float f) {
        this.f22692b = f;
    }

    /* renamed from: b */
    public final void m18581b(boolean z) {
        this.f22695e.m18563a();
        this.f22696f.m18565b();
    }

    /* renamed from: c */
    public final float m18579c(float f) {
        if (!m18570f(f)) {
            return f;
        }
        m18572e(f);
        return f;
    }

    public View$OnKeyListenerC1480aq(C1499az c1499az) {
        this.f22693c = c1499az;
    }

    /* renamed from: c */
    private void m18577c(C1781w c1781w) {
        C1499az c1499az = this.f22693c;
        if (c1499az != null && c1499az.f22786g != null) {
            this.f22693c.f22786g.m18362r();
        }
        C1499az c1499az2 = this.f22693c;
        if (c1499az2 != null && c1499az2.f22782c != null) {
            this.f22693c.f22782c.m18439a(c1781w);
        }
    }

    /* renamed from: f */
    private boolean m18570f(float f) {
        C1499az c1499az = this.f22693c;
        if (c1499az == null || c1499az.f22782c == null || f == this.f22693c.f22782c.m18431e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m18582b(C1781w c1781w) {
        C1499az c1499az;
        C1781w m18430f;
        if (c1781w == null || (c1499az = this.f22693c) == null || c1499az.f22782c == null || (m18430f = this.f22693c.f22782c.m18430f()) == null) {
            return false;
        }
        if (c1781w.m17162b() == m18430f.m17162b() && c1781w.m17164a() == m18430f.m17164a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private float m18572e(float f) {
        C1499az c1499az = this.f22693c;
        if (c1499az != null && c1499az.f22782c != null) {
            GestureDetector$OnDoubleTapListenerC1507b m18429g = this.f22693c.f22782c.m18429g();
            m18429g.m18362r();
            f = m18429g.m18418a(f);
            this.f22693c.f22782c.m18444a(f);
            try {
                if (this.f22693c.f22786g.m18390c().isScaleControlsEnabled()) {
                    this.f22693c.f22786g.m18361s();
                    return f;
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "MapController", "setZoom");
            }
        }
        return f;
    }

    /* renamed from: a */
    public final void m18605a(float f) {
        this.f22691a = f;
    }

    /* renamed from: d */
    public final float m18575d(float f) {
        C1499az c1499az = this.f22693c;
        if (c1499az != null && c1499az.f22782c != null) {
            if (f < this.f22693c.f22782c.m18437b()) {
                f = this.f22693c.f22782c.m18437b();
            }
            if (f > this.f22693c.f22782c.m18445a()) {
                return this.f22693c.f22782c.m18445a();
            }
            return f;
        }
        return f;
    }

    /* renamed from: b */
    public final boolean m18584b(int i) {
        return m18583b(1, i);
    }

    /* renamed from: a */
    public final float m18601a(float f, int i) {
        if (f >= C1771q.f24014c) {
            f = C1771q.f24014c;
        }
        if (f <= C1771q.f24015d) {
            f = C1771q.f24015d;
        }
        if (!m18570f(f)) {
            return f;
        }
        m18585b(f, i);
        return f;
    }

    /* renamed from: b */
    public final boolean m18585b(float f, int i) {
        return m18597a(this.f22693c.f22782c.m18433c() / 2, this.f22693c.f22782c.m18432d() / 2, f, i);
    }

    /* renamed from: c */
    public final boolean m18578c(int i, int i2) {
        return m18594a(i, i2, true, true);
    }

    /* renamed from: d */
    public final void m18574d(int i, int i2) {
        if (this.f22694d) {
            this.f22694d = false;
        } else if ((i == 0 && i2 == 0) || this.f22693c == null) {
        } else {
            try {
                if (C1771q.f24030s) {
                    this.f22693c.f22787h.m18516a(new PointF(0.0f, 0.0f), new PointF(i, i2), this.f22693c.f22782c.m18431e());
                }
                this.f22693c.f22782c.m18438a(false, false);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MapController", "scrollBy");
            }
        }
    }

    /* renamed from: b */
    public final boolean m18583b(int i, int i2) {
        C1499az c1499az = this.f22693c;
        if (c1499az != null && c1499az.f22782c != null) {
            return m18593a(this.f22693c.f22782c.m18433c() / 2, this.f22693c.f22782c.m18432d() / 2, false, false, i, i2);
        }
        return false;
    }

    /* renamed from: a */
    public final void m18604a(float f, float f2) {
        m18603a(f, f2, 0, 0, 0);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (i) {
            case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                m18574d(0, -10);
                return true;
            case 20:
                m18574d(0, 10);
                return true;
            case 21:
                m18574d(-10, 0);
                return true;
            case MotionEventCompat.AXIS_GAS /* 22 */:
                m18574d(10, 0);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private boolean m18594a(int i, int i2, boolean z, boolean z2) {
        return m18593a(i, i2, z, z2, 1, 0);
    }

    /* renamed from: a */
    public final void m18603a(float f, float f2, int i, int i2, int i3) {
        C1499az c1499az;
        float m18431e;
        int m18425b;
        int m18427a;
        float f3;
        double d;
        double d2;
        float f4 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && (c1499az = this.f22693c) != null && c1499az.f22782c != null && this.f22693c.f22781b != null) {
            try {
                m18431e = this.f22693c.f22782c.m18431e();
                m18425b = this.f22693c.f22781b.m18425b(i, i2, i3);
                m18427a = this.f22693c.f22781b.m18427a(i, i2, i3);
            } catch (Exception e) {
                e = e;
            }
            if (m18425b == 0 && m18427a == 0) {
                this.f22691a = f;
                this.f22692b = f2;
                return;
            }
            try {
                double min = this.f22693c.f22787h.f22740k / Math.min(m18427a / f, m18425b / f2);
                int i4 = 0;
                double d3 = this.f22693c.f22787h.f22733d;
                while (true) {
                    d3 /= 2.0d;
                    if (d3 <= min) {
                        break;
                    }
                    i4++;
                }
                f4 = m18575d((float) (i4 + (Math.log((this.f22693c.f22787h.f22733d / (1 << i4)) / min) / Math.log(2.0d))));
                f3 = (int) f4;
                d = f4 - f3;
            } catch (Exception e2) {
                e = e2;
                f4 = m18431e;
                C1569cm.m18147a(e, "MapController", "zoomToSpan");
                m18579c(f4);
            }
            if (d > 1.0d - ((1.0d - C1499az.f22780a) * 0.4d)) {
                d2 = C1499az.f22780a;
            } else if (d > C1499az.f22780a) {
                d2 = C1499az.f22780a - 9.999999747378752E-5d;
            } else {
                if (Math.abs(d - C1499az.f22780a) <= 9.999999747378752E-5d) {
                    f4 = f3 + ((float) (C1499az.f22780a - 9.999999747378752E-5d));
                }
                m18579c(f4);
            }
            f4 = f3 + ((float) d2);
            m18579c(f4);
        }
    }

    /* renamed from: a */
    private boolean m18593a(int i, int i2, boolean z, boolean z2, int i3, int i4) {
        float m18431e;
        C1499az c1499az = this.f22693c;
        boolean z3 = false;
        if (c1499az != null && c1499az.f22782c != null) {
            this.f22693c.f22782c.m18429g().m18362r();
            C1499az.C1505c c1505c = this.f22693c.f22782c;
            if (z) {
                m18431e = c1505c.m18431e() + i3;
            } else {
                m18431e = c1505c.m18431e() - i3;
            }
            float m18418a = this.f22693c.f22782c.m18429g().m18418a(m18431e);
            if (m18418a != this.f22693c.f22782c.m18431e()) {
                m18596a(i, i2, m18418a, z, z2, i4);
                z3 = true;
            }
            try {
                if (this.f22693c.f22786g.m18390c().isScaleControlsEnabled()) {
                    this.f22693c.f22786g.m18361s();
                    return z3;
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "MapController", "zoomWithAnimation");
            }
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Float, java.lang.Boolean> m18602a(float r17, float r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.View$OnKeyListenerC1480aq.m18602a(float, float, int, int, int, int):android.util.Pair");
    }

    /* renamed from: a */
    public final void m18596a(int i, int i2, float f, boolean z, boolean z2, int i3) {
        this.f22695e.m18560a(i, i2, f, z, z2, i3);
    }
}
