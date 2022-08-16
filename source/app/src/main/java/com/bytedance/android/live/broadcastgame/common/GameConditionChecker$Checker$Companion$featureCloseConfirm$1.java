package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C441573dP;
import p003X.C4574547f;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class GameConditionChecker$Checker$Companion$featureCloseConfirm$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $args;
    public final /* synthetic */ int $bizFlag;
    public final /* synthetic */ Function0 $cancelAction;
    public final /* synthetic */ Function1 $closeAction;
    public final /* synthetic */ C441573dP this$0;

    static {
        Covode.recordClassIndex(19606);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$Checker$Companion$featureCloseConfirm$1(C441573dP c441573dP, Map map, int i, Function1 function1, Function0 function0) {
        super(1);
        this.this$0 = c441573dP;
        this.$args = map;
        this.$bizFlag = i;
        this.$closeAction = function1;
        this.$cancelAction = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        String str;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            HashMap hashMap = new HashMap(this.$args);
            if (booleanValue) {
                str = "confirm";
            } else {
                str = "cancel";
            }
            hashMap.put("click_type", str);
            C4574547f.LIZ().LIZ("livesdk_live_game_exclude_popup_click", hashMap, Room.class);
            if (booleanValue) {
                C441573dP c441573dP = this.this$0;
                int i = this.$bizFlag;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c441573dP, C441573dP.LIZ, false, 4).isSupported) {
                    C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7088cJ;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f7088cJ;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Integer.valueOf(c87308Kak.LIZ().intValue() | i));
                }
                this.$closeAction.invoke(Boolean.FALSE);
            } else {
                this.$cancelAction.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
