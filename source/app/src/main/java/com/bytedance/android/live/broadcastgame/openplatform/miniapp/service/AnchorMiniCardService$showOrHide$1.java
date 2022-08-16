package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C87804Kik;
import p003X.C87811Kir;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class AnchorMiniCardService$showOrHide$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $callLoadingFinish;
    public final /* synthetic */ boolean $show;

    static {
        Covode.recordClassIndex(21801);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniCardService$showOrHide$1(boolean z, Function1 function1) {
        super(0);
        this.$show = z;
        this.$callLoadingFinish = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PageDataV2 LIZ = C87811Kir.LIZ();
            if (LIZ != null) {
                LIZ.LJFF = this.$show;
            }
            this.$callLoadingFinish.invoke(Boolean.TRUE);
            if (!PatchProxy.proxy(new Object[0], TrackMiniCardService.LJI, C87804Kik.LIZ, false, 5).isSupported) {
                C4574547f.LIZ().LIZ("livesdk_small_program_explanation_card_on_off_set", TrackCommonService.LIZJ.LIZ(), Room.class);
            }
            if (!this.$show) {
                C88440Kt0.LIZ(2131586321);
            } else {
                C88440Kt0.LIZ(2131586324);
            }
        }
        return Unit.INSTANCE;
    }
}
