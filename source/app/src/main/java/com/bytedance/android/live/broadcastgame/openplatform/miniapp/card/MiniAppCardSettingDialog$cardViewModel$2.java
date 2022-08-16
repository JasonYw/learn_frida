package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$cardViewModel$2 extends Lambda implements Function0<C3796c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21549);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$cardViewModel$2(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(0);
        this.this$0 = miniAppCardSettingDialog;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.ViewModel, com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3796c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ViewModelProviders.m21142of(this.this$0).get(C3796c.class);
    }
}
