package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C442103eG;
import p003X.C87625Kfr;
import p003X.C87630Kfw;
import p003X.C87659KgP;
import p003X.C88440Kt0;
import p003X.KUB;

/* loaded from: classes5.dex */
public final class AnchorPluginRuntime$start$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87625Kfr this$0;

    static {
        Covode.recordClassIndex(20833);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPluginRuntime$start$2(C87625Kfr c87625Kfr) {
        super(1);
        this.this$0 = c87625Kfr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        C2WC<Long> LJIIJ;
        C2WD<z$c> LJJI;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C87625Kfr c87625Kfr = this.this$0;
            if (!PatchProxy.proxy(new Object[]{str2}, c87625Kfr, C87625Kfr.LIZ, false, 6).isSupported) {
                C442103eG LIZ = C442103eG.LIZJ.LIZ();
                if (LIZ != null && (LJIIJ = LIZ.LJIIJ()) != null && LJIIJ.LIZ().longValue() == 1) {
                    C87659KgP.LIZ(c87625Kfr, null, false, false, 7, null);
                    C442103eG LIZ2 = C442103eG.LIZJ.LIZ();
                    if (LIZ2 != null && (LJJI = LIZ2.LJJI()) != null) {
                        LJJI.LIZ(new C87630Kfw(str2));
                    }
                } else {
                    if (str2 != null) {
                        C88440Kt0.LIZ(str2);
                    }
                    c87625Kfr.LIZJ("app/start fail");
                }
                KUB.LIZ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class), 1, c87625Kfr.LJIILLIIL(), null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
