package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.capture.p279a.C3241c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC144771ebt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.effect.e */
/* loaded from: classes5.dex */
public final class C3009e implements AbstractC144771ebt {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final C3241c LIZJ;

    static {
        Covode.recordClassIndex(15748);
    }

    public C3009e(C3241c c3241c) {
        C106862S5w.LIZ(c3241c);
        this.LIZJ = c3241c;
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZ(float f, float f2) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 2).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, c3241c, C3241c.LIZ, false, 1).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZ(f, f2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZIZ(float f, float f2) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 5).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, c3241c, C3241c.LIZ, false, 4).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZIZ(f, f2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZJ(float f, float f2) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 9).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, c3241c, C3241c.LIZ, false, 8).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZJ(f, f2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZIZ(float f, float f2, int i) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)}, this, LIZ, false, 8).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)}, c3241c, C3241c.LIZ, false, 7).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZIZ(f, f2, i);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZ(float f, float f2, int i) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)}, this, LIZ, false, 7).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)}, c3241c, C3241c.LIZ, false, 6).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZ(f, f2, i);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZ(float f, float f2, float f3, float f4, float f5) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, LIZ, false, 4).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, c3241c, C3241c.LIZ, false, 3).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZ(f, f2, f3, f4, f5);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }

    @Override // p003X.AbstractC144771ebt
    public final void LIZ(long j, float f, float f2, float f3, float f4, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported || !this.LIZIZ) {
            return;
        }
        C3241c c3241c = this.LIZJ;
        if (!PatchProxy.proxy(new Object[]{new Long(j), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), Integer.valueOf(i2)}, c3241c, C3241c.LIZ, false, 2).isSupported) {
            if (c3241c.LIZJ != null) {
                c3241c.LIZJ.LIZ(j, f, f2, f3, f4, i, i2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
