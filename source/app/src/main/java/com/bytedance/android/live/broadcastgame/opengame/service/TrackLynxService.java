package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class TrackLynxService extends TrackCommonService implements AbstractC3717a, AbstractC3719c {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public C3682x f26092LJ;

    static {
        Covode.recordClassIndex(21072);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService
    public final C3682x LJIIJJI() {
        return this.f26092LJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = System.currentTimeMillis();
        LJIIJ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 2).isSupported) {
            return;
        }
        LJIIIIZZ();
        LJIIIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackLynxService(C3682x c3682x) {
        super(c3682x);
        C106862S5w.LIZ(c3682x);
        this.f26092LJ = c3682x;
    }
}
