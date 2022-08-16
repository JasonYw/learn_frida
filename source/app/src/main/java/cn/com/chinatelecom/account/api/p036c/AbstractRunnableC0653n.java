package cn.com.chinatelecom.account.api.p036c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.n */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0653n implements Runnable {

    /* renamed from: c */
    public static Handler f20946c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public boolean f20947a;

    /* renamed from: b */
    public long f20948b;

    /* renamed from: d */
    public RunnableC0654o f20949d;

    static {
        Covode.recordClassIndex(2704);
    }

    public AbstractRunnableC0653n() {
    }

    public AbstractRunnableC0653n(long j) {
        this.f20948b = j;
    }

    /* renamed from: a */
    public abstract void mo20683a();

    /* renamed from: a */
    public final void m20698a(boolean z) {
        this.f20947a = true;
    }

    /* renamed from: b */
    public void mo20697b() {
    }

    /* renamed from: c */
    public final boolean m20696c() {
        return this.f20947a;
    }

    /* renamed from: d */
    public final void m20695d() {
        try {
            if (this.f20949d == null) {
                return;
            }
            f20946c.removeCallbacks(this.f20949d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f20948b > 0) {
            this.f20949d = new RunnableC0654o(this);
            f20946c.postDelayed(this.f20949d, this.f20948b);
        }
        mo20683a();
    }
}
