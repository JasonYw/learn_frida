package com.bytedance.android.live.broadcast.gamedetailv2;

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
import p003X.C89032L6c;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget$loadingWidget$2 extends Lambda implements Function0<GameDetailLoadingWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16576);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailContentWidget$loadingWidget$2(GameDetailContentWidget gameDetailContentWidget) {
        super(0);
        this.this$0 = gameDetailContentWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetailv2.GameDetailLoadingWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ GameDetailLoadingWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        GameDetailLoadingWidget gameDetailLoadingWidget = new GameDetailLoadingWidget();
        gameDetailLoadingWidget.LIZ(this.this$0, 2131175197);
        gameDetailLoadingWidget.LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LIZ());
        return gameDetailLoadingWidget;
    }
}
