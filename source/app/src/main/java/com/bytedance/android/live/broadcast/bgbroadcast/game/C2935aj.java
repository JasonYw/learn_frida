package com.bytedance.android.live.broadcast.bgbroadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C88799Kyn;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.aj */
/* loaded from: classes5.dex */
public class C2935aj implements AbstractC2936ak {
    public static ChangeQuickRedirect LIZJ;

    static {
        Covode.recordClassIndex(14728);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    public void LIZ(C88799Kyn c88799Kyn, C88799Kyn c88799Kyn2) {
        if (PatchProxy.proxy(new Object[]{c88799Kyn, c88799Kyn2}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c88799Kyn, c88799Kyn2);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    public void LIZ(Command command) {
        if (PatchProxy.proxy(new Object[]{command}, this, LIZJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(command);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    public void LIZIZ(C88799Kyn c88799Kyn, C88799Kyn c88799Kyn2) {
        if (PatchProxy.proxy(new Object[]{c88799Kyn, c88799Kyn2}, this, LIZJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c88799Kyn, c88799Kyn2);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    public void LIZJ() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    public void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    /* renamed from: LJ */
    public void mo15915LJ() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    /* renamed from: n_ */
    public void mo15914n_() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.game.AbstractC2936ak
    /* renamed from: p_ */
    public void mo15913p_() {
    }
}
