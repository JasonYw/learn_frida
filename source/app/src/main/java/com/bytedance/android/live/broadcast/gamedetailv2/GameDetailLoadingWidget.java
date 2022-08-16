package com.bytedance.android.live.broadcast.gamedetailv2;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3093v;
import com.bytedance.android.live.broadcast.view.C3252c;
import com.bytedance.android.live.broadcast.view.C3253d;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.p518ui.DouyinLoadingLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C3CX;
import p003X.L7U;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class GameDetailLoadingWidget extends PureWidget<C3093v> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public LoadingStatusView LIZIZ;
    public View LIZJ;
    public final boolean LIZLLL = true ^ AnonymousClass479.LIZJ();

    /* renamed from: LJ */
    public final Lazy f25884LJ = LazyKt__LazyJVMKt.lazy(new GameDetailLoadingWidget$emptyView$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new GameDetailLoadingWidget$errorView$2(this));

    static {
        Covode.recordClassIndex(16582);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699252;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameDetailLoadingWidget() {
        super(null, 1);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        LK1.LIZJ(view);
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            loadingStatusView.LIZ();
        }
        LoadingStatusView loadingStatusView2 = this.LIZIZ;
        if (loadingStatusView2 != null) {
            loadingStatusView2.setVisibility(0);
        }
        LoadingStatusView loadingStatusView3 = this.LIZIZ;
        if (loadingStatusView3 != null) {
            loadingStatusView3.LIZLLL();
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        LK1.LIZJ(view);
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            loadingStatusView.LIZ();
        }
        LoadingStatusView loadingStatusView2 = this.LIZIZ;
        if (loadingStatusView2 != null) {
            LK1.LIZJ(loadingStatusView2);
        }
        LoadingStatusView loadingStatusView3 = this.LIZIZ;
        if (loadingStatusView3 != null) {
            loadingStatusView3.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        Object mo27335getValue;
        Object mo27335getValue2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZJ = this.containerView.findViewById(2131196400);
        this.LIZIZ = (LoadingStatusView) this.contentView.findViewById(2131182084);
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            C3CX LIZ2 = C3CX.LIZ(this.context);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = this.LJFF.mo27335getValue();
            }
            LIZ2.LIZJ((C3253d) mo27335getValue);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy2.isSupported) {
                mo27335getValue2 = proxy2.result;
            } else {
                mo27335getValue2 = this.f25884LJ.mo27335getValue();
            }
            LIZ2.LIZIZ((C3252c) mo27335getValue2);
            LIZ2.LIZ(new DouyinLoadingLayout(this.context));
            loadingStatusView.setBuilder(LIZ2);
        }
        if (this.LIZLLL) {
            View view = this.LIZJ;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LIZJ();
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameDetailLoadingWidget$onUpdate$1.INSTANCE, null, new GameDetailLoadingWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameDetailLoadingWidget$onUpdate$3.INSTANCE, null, new GameDetailLoadingWidget$onUpdate$4(this), 2, null);
        }
    }
}
