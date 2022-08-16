package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.C3517aq;
import com.bytedance.android.live.broadcastgame.opengame.performance.C3617a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import p003X.AbstractC426192th;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C442103eG;
import p003X.C81979ISv;
import p003X.C87421KcZ;
import p003X.C87422Kca;
import p003X.C87424Kcc;
import p003X.C87425Kcd;
import p003X.C87426Kce;

/* loaded from: classes5.dex */
public final class PerformanceDetectionService implements AbstractC3662k, AbstractC3717a {
    public static ChangeQuickRedirect LIZ;
    public C87421KcZ LIZIZ;
    public C3682x LIZJ;

    static {
        Covode.recordClassIndex(21019);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    private C3682x LJII() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C87426Kce.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C3617a.LIZ(false);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        C87421KcZ c87421KcZ;
        C2WC<Boolean> LJIILJJIL;
        C2WC<Boolean> LJIIZILJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (c87421KcZ = this.LIZIZ) != null && !PatchProxy.proxy(new Object[0], c87421KcZ, C87421KcZ.LIZ, false, 11).isSupported) {
            c87421KcZ.LIZJ().LJI();
            c87421KcZ.LIZ(3);
            c87421KcZ.LJFF = false;
            c87421KcZ.LJI = false;
            C442103eG LIZ2 = C442103eG.LIZJ.LIZ();
            if (LIZ2 != null && (LJIIZILJ = LIZ2.LJIIZILJ()) != null) {
                LJIIZILJ.LIZ(Boolean.FALSE);
            }
            C442103eG LIZ3 = C442103eG.LIZJ.LIZ();
            if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null) {
                LJIILJJIL.LIZ(Boolean.FALSE);
            }
            if (!PatchProxy.proxy(new Object[0], c87421KcZ, C87421KcZ.LIZ, false, 16).isSupported) {
                c87421KcZ.LIZ().clear();
            }
            c87421KcZ.LIZJ().LJI();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        Observable LIZ2;
        Disposable subscribe;
        AbstractC426192th<Boolean> LJIILLIIL;
        Observable<Boolean> LIZIZ;
        Disposable subscribe2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && this.LIZIZ == null) {
            this.LIZIZ = new C87421KcZ(LJII().LJIIIIZZ(), LJII().LIZLLL, LJII().LJII);
            C87421KcZ c87421KcZ = this.LIZIZ;
            if (c87421KcZ != null && !PatchProxy.proxy(new Object[0], c87421KcZ, C87421KcZ.LIZ, false, 13).isSupported && !c87421KcZ.LJII) {
                c87421KcZ.LJII = true;
                if (!PatchProxy.proxy(new Object[0], c87421KcZ, C87421KcZ.LIZ, false, 12).isSupported) {
                    C442103eG LIZ3 = C442103eG.LIZJ.LIZ();
                    if (LIZ3 != null && (LJIILLIIL = LIZ3.LJIILLIIL()) != null && (LIZIZ = LJIILLIIL.LIZIZ()) != null && (subscribe2 = LIZIZ.subscribe(new C87422Kca(c87421KcZ))) != null) {
                        c87421KcZ.LIZIZ(subscribe2);
                    }
                    AbstractC3512ag abstractC3512ag = c87421KcZ.LJIIJ;
                    if (abstractC3512ag != null && (LIZ2 = abstractC3512ag.LIZ(C3517aq.class)) != null && (subscribe = LIZ2.subscribe(new C81979ISv(c87421KcZ), C87424Kcc.LIZ)) != null) {
                        c87421KcZ.LIZIZ(subscribe);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r1 == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO) goto L69;
     */
    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.service.PerformanceDetectionService.LIZ():void");
    }

    public PerformanceDetectionService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZJ = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        C87425Kcd.LIZ(this, obj);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C3617a.LIZ(true);
    }
}
