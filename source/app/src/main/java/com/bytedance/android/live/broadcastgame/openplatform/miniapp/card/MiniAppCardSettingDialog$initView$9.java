package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87890Kk8;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$initView$9 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21563);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$initView$9(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 1).isSupported) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                FrameLayout frameLayout = (FrameLayout) this.this$0.LIZ(2131190121);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                C87890Kk8.LIZ(frameLayout, Boolean.TRUE);
                RelativeLayout relativeLayout = (RelativeLayout) this.this$0.LIZ(2131190119);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
                C87890Kk8.LIZ(relativeLayout, Boolean.FALSE);
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                FrameLayout frameLayout2 = (FrameLayout) this.this$0.LIZ(2131190121);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                C87890Kk8.LIZ(frameLayout2, Boolean.FALSE);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.this$0.LIZ(2131190119);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "");
                C87890Kk8.LIZ(relativeLayout2, Boolean.TRUE);
            } else {
                FrameLayout frameLayout3 = (FrameLayout) this.this$0.LIZ(2131190121);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                C87890Kk8.LIZ(frameLayout3, Boolean.FALSE);
                RelativeLayout relativeLayout3 = (RelativeLayout) this.this$0.LIZ(2131190119);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "");
                C87890Kk8.LIZ(relativeLayout3, Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
