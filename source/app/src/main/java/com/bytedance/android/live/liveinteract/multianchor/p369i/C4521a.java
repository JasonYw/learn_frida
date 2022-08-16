package com.bytedance.android.live.liveinteract.multianchor.p369i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multianchor.utils.DeviceType;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.roomplayer.AbstractC9682a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import p003X.C106862S5w;
import p003X.C2RT;
import p003X.C4579949h;
import p003X.C4CG;
import p003X.C79589HYx;
import p003X.C79590HYy;
import p003X.C88440Kt0;
import p003X.HZ0;
import p003X.HZ2;
import p003X.HZ4;
import p003X.HZ5;
import p003X.HZ6;
import p003X.HZ7;
import p003X.HZ8;
import p003X.HZ9;
import p003X.HZA;
import p003X.HZB;
import p003X.HZC;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.i.a */
/* loaded from: classes3.dex */
public final class C4521a {
    public static ChangeQuickRedirect LIZ;
    public HZ6 LIZIZ;
    public final boolean LIZJ;
    public final Boolean LIZLLL;

    /* renamed from: LJ */
    public final HZ5 f26342LJ = new HZ9();
    public final HZ5 LJFF = new HZ8();
    public final HZ5 LJI = new HZA();
    public final HZ5 LJII = new HZB();
    public final HZC LJIIIIZZ = new HZC();
    public Disposable LJIIIZ;

    static {
        Covode.recordClassIndex(28045);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIIZ;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJIIIZ = null;
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIIZ;
        if (disposable != null && !disposable.isDisposed()) {
            return;
        }
        C88440Kt0.LIZ(2131584206);
        this.LJIIIZ = Observable.just(1).delay(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(C2RT.LIZIZ);
    }

    private final void LIZ(C79590HYy c79590HYy) {
        HZ5 LIZJ;
        if (PatchProxy.proxy(new Object[]{c79590HYy}, this, LIZ, false, 2).isSupported || (LIZJ = LIZJ(c79590HYy)) == null) {
            return;
        }
        if (!c79590HYy.LJFF && !LIZJ.LIZ() && !this.LIZJ) {
            LIZIZ(c79590HYy);
            LIZIZ();
            return;
        }
        LIZ(LIZJ, c79590HYy);
    }

    private final void LIZIZ(C79590HYy c79590HYy) {
        HZ6 LIZ2;
        if (!PatchProxy.proxy(new Object[]{c79590HYy}, this, LIZ, false, 5).isSupported && (LIZ2 = this.LJIIIIZZ.LIZ(new HZ7(c79590HYy.LIZIZ, c79590HYy.LIZJ, c79590HYy.LIZLLL, c79590HYy.LJII, c79590HYy.LJIIIIZZ, c79590HYy.LJIIIZ))) != null) {
            LIZ(LIZ2, c79590HYy);
        }
    }

    private final HZ5 LIZJ(C79590HYy c79590HYy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c79590HYy}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (HZ5) proxy.result;
        }
        DeviceType LIZ2 = C4579949h.LIZ();
        if (!C79589HYx.LIZIZ.LIZ(HZ2.LIZ(c79590HYy.LJI), LIZ2, c79590HYy.LJFF)) {
            return null;
        }
        if (LIZ2 == DeviceType.NORMAL_MOBILE) {
            return this.f26342LJ;
        }
        if (LIZ2 == DeviceType.FOLD_FULL) {
            return this.LJFF;
        }
        if (LIZ2 == DeviceType.PAD && c79590HYy.LJFF) {
            return this.LJI;
        }
        if (LIZ2 != DeviceType.PAD || c79590HYy.LJFF) {
            return null;
        }
        return this.LJII;
    }

    public final void LIZ(C4CG c4cg) {
        if (PatchProxy.proxy(new Object[]{c4cg}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4cg);
        View view = c4cg.f1156LJ;
        if (!(view instanceof AbstractC9682a)) {
            view = null;
        }
        AbstractC9682a abstractC9682a = (AbstractC9682a) view;
        if (abstractC9682a != null && c4cg.LIZIZ != 0 && c4cg.LIZJ != 0) {
            LIZ(new C79590HYy(c4cg.LIZIZ, c4cg.LIZJ, c4cg.LIZLLL, abstractC9682a, c4cg.LJFF, c4cg.LJI, c4cg.LJII, c4cg.LJIIIIZZ, c4cg.LJIIIZ));
        }
    }

    public C4521a(boolean z, Boolean bool) {
        this.LIZJ = z;
        this.LIZLLL = bool;
    }

    private final void LIZ(HZ5 hz5, C79590HYy c79590HYy) {
        HZ6 LIZ2;
        if (!PatchProxy.proxy(new Object[]{hz5, c79590HYy}, this, LIZ, false, 3).isSupported && (LIZ2 = hz5.LIZ(new HZ7(c79590HYy.LIZIZ, c79590HYy.LIZJ, c79590HYy.LIZLLL, c79590HYy.LJII, c79590HYy.LJIIIIZZ, c79590HYy.LJIIIZ), this.LIZJ, this.LIZLLL)) != null) {
            LIZ(LIZ2, c79590HYy);
        }
    }

    private final void LIZ(HZ6 hz6, C79590HYy c79590HYy) {
        if (PatchProxy.proxy(new Object[]{hz6, c79590HYy}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ = hz6;
        HZ0 LIZ2 = hz6.LIZ(c79590HYy.LJII);
        if (LIZ2 != null) {
            LIZ(c79590HYy.f6849LJ, LIZ2);
        }
    }

    private final void LIZ(AbstractC9682a abstractC9682a, HZ0 hz0) {
        if (PatchProxy.proxy(new Object[]{abstractC9682a, hz0}, this, LIZ, false, 7).isSupported) {
            return;
        }
        abstractC9682a.getRenderView().setScaleType(4);
        abstractC9682a.getRenderView().setStrictMeasureData(new HZ4(hz0.LIZIZ, hz0.LIZJ));
        ViewGroup.LayoutParams layoutParams = abstractC9682a.getRenderView().getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = hz0.LIZIZ;
        layoutParams2.height = hz0.LIZJ;
        layoutParams2.gravity = hz0.LJFF;
        layoutParams2.topMargin = hz0.LIZLLL;
        layoutParams2.leftMargin = hz0.f6851LJ;
        abstractC9682a.getRenderView().setLayoutParams(layoutParams2);
    }

    public final boolean LIZ(LiveMode liveMode, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{liveMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(liveMode);
        return C79589HYx.LIZIZ.LIZ(HZ2.LIZ(liveMode), C4579949h.LIZ(), z);
    }
}
