package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.livesdk.chatroom.p518ui.DouyinLoadingLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88929L2d;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$loadingView$2 extends Lambda implements Function0<DouyinLoadingLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88929L2d this$0;

    static {
        Covode.recordClassIndex(16030);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteDetailDialog$loadingView$2(C88929L2d c88929L2d) {
        super(0);
        this.this$0 = c88929L2d;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DouyinLoadingLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C88929L2d.m23437LJ(this.this$0).findViewById(2131168884);
    }
}
