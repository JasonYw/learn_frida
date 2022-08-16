package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameLoadingWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89021L5r;
import p003X.L6Y;

/* loaded from: classes5.dex */
public final class AnchorGameDetailContentWidget$loadingWidget$2 extends Lambda implements Function0<GameLoadingWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnchorGameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16151);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameDetailContentWidget$loadingWidget$2(AnchorGameDetailContentWidget anchorGameDetailContentWidget) {
        super(0);
        this.this$0 = anchorGameDetailContentWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.GameLoadingWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ GameLoadingWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        GameLoadingWidget gameLoadingWidget = new GameLoadingWidget();
        gameLoadingWidget.LIZ(this.this$0, 2131165635);
        gameLoadingWidget.LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LIZLLL);
        return gameLoadingWidget;
    }
}
