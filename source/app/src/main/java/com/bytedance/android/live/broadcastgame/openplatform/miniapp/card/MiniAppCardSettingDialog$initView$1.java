package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$initView$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21556);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$initView$1(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (!PatchProxy.proxy(new Object[]{bool2}, this, changeQuickRedirect, false, 1).isSupported && bool2 != null) {
            LiveSwitchButton liveSwitchButton = (LiveSwitchButton) this.this$0.LIZ(2131172584);
            Intrinsics.checkNotNullExpressionValue(liveSwitchButton, "");
            if (true ^ Intrinsics.areEqual(Boolean.valueOf(liveSwitchButton.isChecked()), bool2)) {
                LiveSwitchButton liveSwitchButton2 = (LiveSwitchButton) this.this$0.LIZ(2131172584);
                Intrinsics.checkNotNullExpressionValue(liveSwitchButton2, "");
                liveSwitchButton2.setChecked(bool2.booleanValue());
            }
        }
        return Unit.INSTANCE;
    }
}
