package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C89023L5t;
import p003X.C89032L6c;
import p003X.L6B;
import p003X.L7U;

/* loaded from: classes5.dex */
public final class AudienceOrderGameInfoItemWidget$officialItemWidget$2 extends Lambda implements Function0<GameOfficialItemWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceOrderGameInfoItemWidget this$0;

    static {
        Covode.recordClassIndex(16353);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderGameInfoItemWidget$officialItemWidget$2(AudienceOrderGameInfoItemWidget audienceOrderGameInfoItemWidget) {
        super(0);
        this.this$0 = audienceOrderGameInfoItemWidget;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.GameOfficialItemWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ GameOfficialItemWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        GameOfficialItemWidget gameOfficialItemWidget = new GameOfficialItemWidget();
        AudienceOrderGameInfoItemWidget audienceOrderGameInfoItemWidget = this.this$0;
        View view = this.this$0.contentView;
        if (view != null) {
            gameOfficialItemWidget.LIZ((PureWidget<?>) audienceOrderGameInfoItemWidget, (Integer) 2131175932, (ViewGroup) view);
            gameOfficialItemWidget.LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89023L5t.LIZJ);
            Context context = gameOfficialItemWidget.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            L7U.LIZ(gameOfficialItemWidget, new L6B(context, gameOfficialItemWidget.LJIILL()), (Function1) null, 2, (Object) null);
            return gameOfficialItemWidget;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
