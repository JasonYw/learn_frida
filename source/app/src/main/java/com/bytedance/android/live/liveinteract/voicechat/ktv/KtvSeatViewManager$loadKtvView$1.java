package com.bytedance.android.live.liveinteract.voicechat.ktv;

import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C80557Hp9;

/* loaded from: classes3.dex */
public final class KtvSeatViewManager$loadKtvView$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80557Hp9 this$0;

    static {
        Covode.recordClassIndex(31421);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvSeatViewManager$loadKtvView$1(C80557Hp9 c80557Hp9) {
        super(1);
        this.this$0 = c80557Hp9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C5923dp LIZ;
        C2WC<Integer> LLFFF;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC5015e LIZ2 = AbstractC5015e.LIZIZ.LIZ();
            if (LIZ2 != null && !LIZ2.LJIIJ() && (LIZ = C5923dp.LJIIJ.LIZ(this.this$0.LJJJJLL, 0L)) != null && (LLFFF = LIZ.LLFFF()) != null && LLFFF.LIZ().intValue() == 2) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    ALogger.m15795w("ktv_seat_view_manager", "rejected anchor avatar click for pure clean mode");
                }
            }
            this.this$0.LJJJJLL.put("cmd_open_interact_manage_dialog_by_anchor", Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
