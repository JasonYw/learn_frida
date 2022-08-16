package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87890Kk8;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$initView$10 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21557);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$initView$10(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (!PatchProxy.proxy(new Object[]{bool2}, this, changeQuickRedirect, false, 1).isSupported) {
            ImageView imageView = (ImageView) this.this$0.LIZ(2131192925);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C87890Kk8.LIZ(imageView, bool2);
        }
        return Unit.INSTANCE;
    }
}
