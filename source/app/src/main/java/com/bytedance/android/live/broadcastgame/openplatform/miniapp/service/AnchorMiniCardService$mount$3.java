package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C87811Kir;
import p003X.C88335KrJ;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class AnchorMiniCardService$mount$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnchorMiniCardService this$0;

    static {
        Covode.recordClassIndex(21799);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniCardService$mount$3(AnchorMiniCardService anchorMiniCardService) {
        super(0);
        this.this$0 = anchorMiniCardService;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PageDataV2 LIZ = C87811Kir.LIZ();
            if (LIZ != null && LIZ.LJFF) {
                C88440Kt0.LIZ(2131586342);
            } else {
                C88440Kt0.LIZ(2131586343);
            }
            AnchorMiniCardService anchorMiniCardService = this.this$0;
            C3682x LJIIJJI = anchorMiniCardService.LJIIJJI();
            long j = this.this$0.LJFF;
            String str = this.this$0.LJI;
            if (!PatchProxy.proxy(new Object[]{LJIIJJI, new Long(j), str}, anchorMiniCardService, AnchorMiniCardService.LIZ, false, 20).isSupported) {
                String str2 = "023009";
                if (!LJIIJJI.LJIIJJI && !LJIIJJI.LJIIJ) {
                    str2 = !LJIIJJI.LJIIJ ? C88335KrJ.LIZ() : "";
                }
                C4574547f.LIZ().LIZIZ("mp_first_mount_result", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("mp_id", LJIIJJI.LJIIIIZZ.LJII), TuplesKt.m137to("mp_name", LJIIJJI.LJIIIIZZ.LIZ(LJIIJJI.LJIIJ)), TuplesKt.m137to("scene", str2), TuplesKt.m137to("launch_from", "live"), TuplesKt.m137to("_param_for_special", BdpAppEventConstant.MICRO_APP), TuplesKt.m137to("open_duration", String.valueOf(j)), TuplesKt.m137to("location", str)), new Object[0]);
            }
        }
        return Unit.INSTANCE;
    }
}
