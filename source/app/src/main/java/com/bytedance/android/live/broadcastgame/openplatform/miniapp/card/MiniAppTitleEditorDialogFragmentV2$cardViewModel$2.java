package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87871Kjp;

/* loaded from: classes5.dex */
public final class MiniAppTitleEditorDialogFragmentV2$cardViewModel$2 extends Lambda implements Function0<C3796c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87871Kjp this$0;

    static {
        Covode.recordClassIndex(21586);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppTitleEditorDialogFragmentV2$cardViewModel$2(C87871Kjp c87871Kjp) {
        super(0);
        this.this$0 = c87871Kjp;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.ViewModel, com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3796c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            return ViewModelProviders.m21142of(activity).get(C3796c.class);
        }
        return null;
    }
}
