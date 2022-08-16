package com.bytedance.als.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import p003X.C106862S5w;
import p003X.NS1;
import p003X.NY6;

/* renamed from: com.bytedance.als.monitor.b */
/* loaded from: classes6.dex */
public final class C2546b {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;
    public final NY6<?> LIZJ;

    static {
        Covode.recordClassIndex(10064);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_CREATE, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_START, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    /* renamed from: LJ */
    public final void m15994LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_RESUME, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_PAUSE, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_STOP, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        LIZ(this.LIZJ, ComponentLifecycle.ON_DESTROY, SystemClock.uptimeMillis() - this.LIZIZ);
    }

    public C2546b(NY6<?> ny6) {
        C106862S5w.LIZ(ny6);
        this.LIZJ = ny6;
    }

    private final void LIZ(NY6<?> ny6, ComponentLifecycle componentLifecycle, long j) {
        Function3<NY6<?>, ComponentLifecycle, Long, Unit> LIZ2;
        if (!PatchProxy.proxy(new Object[]{ny6, componentLifecycle, new Long(j)}, this, LIZ, false, 13).isSupported && (LIZ2 = NS1.LIZ()) != null) {
            LIZ2.invoke(ny6, componentLifecycle, Long.valueOf(j));
        }
    }
}
