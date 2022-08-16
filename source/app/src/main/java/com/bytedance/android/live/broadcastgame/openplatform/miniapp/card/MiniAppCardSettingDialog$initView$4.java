package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87890Kk8;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$initView$4 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21561);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$initView$4(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.this$0.LIZ(2131192989);
            Intrinsics.checkNotNullExpressionValue(simpleDraweeView, "");
            PointF pointF = new PointF(0.0f, 0.0f);
            float f = MiniAppCardSettingDialog.LJFF;
            float f2 = MiniAppCardSettingDialog.LJFF;
            C87890Kk8.LIZ(simpleDraweeView, str2, null, pointF, f, f, f2, f2, 2, null);
        }
        return Unit.INSTANCE;
    }
}
