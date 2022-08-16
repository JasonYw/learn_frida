package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.p282a.C3330f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.C87687Kgr;
import p003X.C87688Kgs;
import p003X.C87811Kir;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$PreviewMiniAppNode$process$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87687Kgr this$0;

    static {
        Covode.recordClassIndex(21496);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$PreviewMiniAppNode$process$$inlined$let$lambda$1(C87687Kgr c87687Kgr) {
        super(0);
        this.this$0 = c87687Kgr;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87811Kir.LIZ(this.this$0.LIZJ);
            C87010KQi.LIZ().LIZ(new C3330f(this.this$0.LIZJ));
            PageDataV2 LIZ = C87811Kir.LIZ();
            if (LIZ != null && !LIZ.LJFF) {
                C88440Kt0.LIZ(2131586348);
            } else {
                C88440Kt0.LIZ(2131586347);
            }
            C87688Kgs c87688Kgs = C87688Kgs.f8558LJ;
            C3384q c3384q = this.this$0.LIZJ;
            if (!PatchProxy.proxy(new Object[]{c3384q}, c87688Kgs, C87688Kgs.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(c3384q);
                C87688Kgs.LIZIZ.clear();
                C87688Kgs.LIZIZ.add(c3384q.LIZLLL());
                if (!C87688Kgs.LIZJ.contains(c3384q.LIZLLL())) {
                    C87688Kgs.LIZJ.add(c3384q.LIZLLL());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
