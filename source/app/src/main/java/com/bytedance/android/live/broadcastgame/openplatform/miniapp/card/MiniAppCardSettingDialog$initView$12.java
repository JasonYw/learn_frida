package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.widget.TextView;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87841KjL;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$initView$12 extends Lambda implements Function1<PageDataV2.ReviewStatus, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21559);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$initView$12(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PageDataV2.ReviewStatus reviewStatus) {
        int i;
        PageDataV2.ReviewStatus reviewStatus2 = reviewStatus;
        if (!PatchProxy.proxy(new Object[]{reviewStatus2}, this, changeQuickRedirect, false, 1).isSupported) {
            TextView textView = (TextView) this.this$0.LIZ(2131192991);
            String str = "";
            Intrinsics.checkNotNullExpressionValue(textView, str);
            if (reviewStatus2 != null && (i = C87841KjL.LIZ[reviewStatus2.ordinal()]) != 1 && i != 2 && i == 3) {
                str = this.this$0.LIZJ() ? "审核中" : "待审核";
            }
            textView.setText(str);
        }
        return Unit.INSTANCE;
    }
}
