package com.bytedance.android.live.broadcast.gamedetail.block;

import android.content.Context;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameOfficialItemWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C89021L5r;
import p003X.L6A;
import p003X.L6Y;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class AnchorGameDetailContentWidget$officialItemWidget$2 extends Lambda implements Function0<GameOfficialItemWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnchorGameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16152);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameDetailContentWidget$officialItemWidget$2(AnchorGameDetailContentWidget anchorGameDetailContentWidget) {
        super(0);
        this.this$0 = anchorGameDetailContentWidget;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.GameOfficialItemWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ GameOfficialItemWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        GameOfficialItemWidget gameOfficialItemWidget = new GameOfficialItemWidget();
        gameOfficialItemWidget.LIZ(this.this$0, 2131175932);
        gameOfficialItemWidget.LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LIZIZ);
        Context context = gameOfficialItemWidget.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        L7U.LIZ(gameOfficialItemWidget, new L6A(context, gameOfficialItemWidget.LJIILL()), (Function1) null, 2, (Object) null);
        return gameOfficialItemWidget;
    }
}
