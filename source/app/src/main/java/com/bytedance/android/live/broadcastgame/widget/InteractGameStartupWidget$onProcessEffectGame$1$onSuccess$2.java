package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87145KVn;
import p003X.KQR;

/* loaded from: classes5.dex */
public final class InteractGameStartupWidget$onProcessEffectGame$1$onSuccess$2 extends Lambda implements Function1<List<? extends w$a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87145KVn this$0;

    static {
        Covode.recordClassIndex(21836);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractGameStartupWidget$onProcessEffectGame$1$onSuccess$2(C87145KVn c87145KVn) {
        super(1);
        this.this$0 = c87145KVn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends w$a> list) {
        List<? extends w$a> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            KQR.LIZIZ.LIZ(list2);
            this.this$0.LIZIZ.dataCenter.put("data_eyes_blinked_game_item", this.this$0.LIZLLL);
            this.this$0.LIZIZ.dataCenter.put("cmd_old_broadcast_game_click", 0);
            this.this$0.LIZIZ.dataCenter.put("cmd_update_income_dot", 0);
            this.this$0.LIZIZ.dataCenter.put("data_is_playing_network_game", Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
