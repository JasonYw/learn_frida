package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89023L5t;
import p003X.C89032L6c;
import p003X.L7U;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class AudienceOrderGameInfoItemWidget extends BaseGameDetailWidget<C3087k> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new AudienceOrderGameInfoItemWidget$officialItemWidget$2(this));

    static {
        Covode.recordClassIndex(16352);
    }

    public final GameOfficialItemWidget LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (GameOfficialItemWidget) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698340;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.LIZLLL();
        GameIntroWidget gameIntroWidget = new GameIntroWidget();
        View view = this.contentView;
        if (view != null) {
            gameIntroWidget.LIZ((PureWidget<?>) this, (Integer) 2131175910, (ViewGroup) view).LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89023L5t.LIZIZ);
            GameDeveloperInfoWidget gameDeveloperInfoWidget = new GameDeveloperInfoWidget();
            View view2 = this.contentView;
            if (view2 != null) {
                gameDeveloperInfoWidget.LIZ((PureWidget<?>) this, (Integer) 2131175888, (ViewGroup) view2).LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89023L5t.LIZ);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderGameInfoItemWidget(LAB<AbstractC3125c, ?> lab) {
        super(lab, null, 2);
        C106862S5w.LIZ(lab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3087k c3087k) {
        if (PatchProxy.proxy(new Object[]{c3087k}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3087k);
        super.LIZ((AudienceOrderGameInfoItemWidget) c3087k);
        L7U.LIZ(this, c3087k, AudienceOrderGameInfoItemWidget$onUpdate$1.INSTANCE, null, new AudienceOrderGameInfoItemWidget$onUpdate$2(this), 2, null);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3087k c3087k) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3087k}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(c3087k);
        }
    }
}
