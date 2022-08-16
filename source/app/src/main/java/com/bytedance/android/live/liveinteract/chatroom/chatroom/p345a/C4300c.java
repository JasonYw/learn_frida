package com.bytedance.android.live.liveinteract.chatroom.chatroom.p345a;

import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C80997HwF;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.a.c */
/* loaded from: classes3.dex */
public final class C4300c {
    public static ChangeQuickRedirect LIZ;
    public static final float LIZJ = LK5.LIZ(52.0f);
    public float LIZIZ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26266LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public C80997HwF LJIIL;

    static {
        Covode.recordClassIndex(25301);
    }

    public final int LIZ() {
        if (this.LJIIJJI) {
            return this.LJIIL.LIZ;
        }
        if (this.LJFF) {
            return this.f26266LJ / 6;
        }
        return (int) (this.LIZLLL * 0.21850002f);
    }

    public final int LIZIZ() {
        if (this.LJIIJJI) {
            return this.LJIIL.LIZIZ;
        }
        if (this.LJFF) {
            return this.f26266LJ / 6;
        }
        return (int) (this.f26266LJ * 0.12291667f);
    }

    public final int LIZJ() {
        if (this.LJIIJJI) {
            return this.LJIIL.f7390LJ;
        }
        if (this.LJFF) {
            return this.f26266LJ;
        }
        return (int) (this.f26266LJ * 0.7375f);
    }

    public final int LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIIJJI) {
            return this.LJIIL.LIZLLL;
        }
        int min = Math.min(LK5.LIZJ(), LK5.LIZIZ());
        if (this.LJFF) {
            min -= LIZ();
        }
        int i = this.LIZLLL;
        if (min <= i) {
            return 0;
        }
        return (min - i) / 2;
    }

    /* renamed from: LJ */
    public final int m15774LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJIIJJI) {
            return this.LJIIL.LIZJ;
        }
        if (this.LJFF) {
            return (this.LJIIJ - this.f26266LJ) - ((int) this.LJI);
        }
        return LK5.LIZ(48.0f);
    }

    public C4300c(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, false, -1);
    }

    public C4300c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.LIZIZ = 0.2388f;
        this.LJI = LK5.LIZJ(LiveConfigSettingKeys.VIDEO_TALK_MARGIN_TOP.getValue().intValue());
        this.LJII = LK5.LIZJ(48.0f);
        this.LJIIJJI = true;
        this.LIZLLL = i;
        this.f26266LJ = i2;
        this.LJFF = z2;
        this.LJIIL = new C80997HwF(i, i2, i3, i4);
    }

    public C4300c(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.LIZIZ = 0.2388f;
        this.LJI = LK5.LIZJ(LiveConfigSettingKeys.VIDEO_TALK_MARGIN_TOP.getValue().intValue());
        this.LJII = LK5.LIZJ(48.0f);
        this.LJIIJJI = false;
        this.LJFF = z;
        this.LJIIIZ = i3;
        this.LJIIIIZZ = i2;
        if (z) {
            int LIZJ2 = (int) (this.LIZIZ * LK5.LIZJ());
            this.f26266LJ = (int) (this.LIZIZ * 6.0f * LK5.LIZJ());
            this.LIZLLL = LK5.LIZJ() - LIZJ2;
            this.LJIIJ = i;
            float f = i;
            float f2 = this.LJI;
            float f3 = this.LJII;
            if (this.f26266LJ > (f - f2) - f3) {
                this.f26266LJ = (int) ((f - f2) - f3);
                this.LIZLLL = (this.f26266LJ * 9) / 16;
                return;
            }
            return;
        }
        this.LJI = LK5.LIZJ(LiveConfigSettingKeys.VIDEO_TALK_MARGIN_TOP.getValue().intValue() - 17);
        if (z2 && i4 != 0 && i4 != 3) {
            this.f26266LJ = (int) (i / 0.7375f);
        } else {
            this.f26266LJ = (int) (((i - this.LJII) - this.LJI) / 0.7375f);
            if (i4 == 0 && this.f26266LJ > LK5.LIZIZ()) {
                this.f26266LJ = LK5.LIZIZ();
            }
        }
        this.LIZLLL = (this.f26266LJ * this.LJIIIIZZ) / this.LJIIIZ;
    }
}
