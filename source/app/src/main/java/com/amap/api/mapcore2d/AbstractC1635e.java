package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.e */
/* loaded from: classes19.dex */
public abstract class AbstractC1635e {

    /* renamed from: a */
    public int f23418a;

    /* renamed from: b */
    public int f23419b;

    /* renamed from: c */
    public Handler f23420c;

    /* renamed from: d */
    public int f23421d;

    /* renamed from: e */
    public boolean f23422e;

    /* renamed from: f */
    public boolean f23423f = true;

    /* renamed from: g */
    public Runnable f23424g = new Runnable() { // from class: com.amap.api.mapcore2d.e.1
        static {
            Covode.recordClassIndex(5184);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1635e.this.m17776h();
            if (!AbstractC1635e.this.m17778f()) {
                if (AbstractC1635e.this.f23420c != null) {
                    AbstractC1635e.this.f23420c.removeCallbacks(this);
                }
                AbstractC1635e.this.f23420c = null;
                if (AbstractC1635e.this.f23423f) {
                    AbstractC1635e.this.mo17783c();
                    return;
                } else {
                    AbstractC1635e.this.mo17786b();
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC1635e.this.mo17791a();
            AbstractC1635e.this.m17775i();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 < AbstractC1635e.this.f23419b) {
                try {
                    Thread.sleep(AbstractC1635e.this.f23419b - currentTimeMillis2);
                } catch (InterruptedException e) {
                    C1569cm.m18147a(e, "AnimBase", "run");
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(5183);
    }

    /* renamed from: g */
    private void m17777g() {
        this.f23422e = false;
    }

    /* renamed from: a */
    public abstract void mo17791a();

    /* renamed from: b */
    public abstract void mo17786b();

    /* renamed from: c */
    public abstract void mo17783c();

    /* renamed from: f */
    public boolean m17778f() {
        return this.f23422e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m17775i() {
        Handler handler = this.f23420c;
        if (handler != null) {
            handler.post(this.f23424g);
        }
    }

    /* renamed from: e */
    public void m17779e() {
        C1765n.m17212a().m17210b();
        m17777g();
        this.f23424g.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m17776h() {
        this.f23421d += this.f23419b;
        int i = this.f23418a;
        if (i != -1 && this.f23421d > i) {
            m17777g();
            m17784b(true);
        }
    }

    /* renamed from: d */
    public void m17781d() {
        if (!m17778f()) {
            this.f23420c = new Handler(Looper.getMainLooper());
            this.f23422e = true;
            this.f23423f = false;
            this.f23421d = 0;
        }
        m17775i();
    }

    /* renamed from: b */
    public void m17784b(boolean z) {
        this.f23423f = z;
    }

    /* renamed from: a */
    public void mo17790a(int i) {
        this.f23418a = i;
    }

    /* renamed from: a */
    public void m17787a(boolean z) {
        this.f23422e = z;
    }

    public AbstractC1635e(int i, int i2) {
        this.f23418a = i;
        this.f23419b = i2;
    }
}
