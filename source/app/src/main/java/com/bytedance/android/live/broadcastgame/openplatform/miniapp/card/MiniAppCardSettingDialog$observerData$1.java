package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3779b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$observerData$1 extends Lambda implements Function1<C3779b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21570);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$observerData$1(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(1);
        this.this$0 = miniAppCardSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3779b c3779b) {
        if (!PatchProxy.proxy(new Object[]{c3779b}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL();
        }
        return Unit.INSTANCE;
    }
}
