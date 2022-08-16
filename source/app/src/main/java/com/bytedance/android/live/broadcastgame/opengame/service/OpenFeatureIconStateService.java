package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.model.C3388x;
import com.bytedance.android.live.broadcastgame.api.p282a.C3326b;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.C87425Kcd;
import p003X.C87426Kce;
import p003X.C87811Kir;

/* loaded from: classes5.dex */
public final class OpenFeatureIconStateService implements AbstractC3662k, AbstractC3717a {
    public static ChangeQuickRedirect LIZ;
    public C3682x LIZIZ;

    static {
        Covode.recordClassIndex(20997);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    private C3682x LJII() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        C87426Kce.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ(new C3388x(LJII().LJIIIIZZ.m15846LJ(), false, true, true, 2));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        String m15846LJ = LJII().LJIIIIZZ.m15846LJ();
        if (m15846LJ.length() > 0) {
            if (LJII().LJIIJJI) {
                if (C87811Kir.LIZLLL() == null) {
                    C87010KQi.LIZ().LIZ(new C3388x(m15846LJ, true, false, false, 4));
                    C87010KQi.LIZ().LIZ(new C3326b());
                    return;
                }
                return;
            }
            C87010KQi.LIZ().LIZ(new C3388x(m15846LJ, true, false, false, 4));
        }
    }

    public OpenFeatureIconStateService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZIZ = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        C87425Kcd.LIZ(this, obj);
    }
}
