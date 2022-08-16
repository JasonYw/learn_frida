package com.bytedance.android.live.broadcast.gamedetail.block;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AnchorGamePromoteInfoWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AnchorGamePromoteToolsWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3082b;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameBottomButtonWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameDetailWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameDeveloperInfoWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameIntroWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameLoadingWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameOfficialItemWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameTitleBarWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89008L5e;
import p003X.C89021L5r;
import p003X.C89024L5u;
import p003X.L41;
import p003X.L6X;
import p003X.L6Y;
import p003X.L7U;
import p003X.LAC;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AnchorGameDetailContentWidget extends PureWidget<C3050a> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public final FragmentManager LIZJ;
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new AnchorGameDetailContentWidget$officialItemWidget$2(this));

    /* renamed from: LJ */
    public final Lazy f25849LJ = LazyKt__LazyJVMKt.lazy(new AnchorGameDetailContentWidget$loadingWidget$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(AnchorGameDetailContentWidget$gameTitleWidget$2.INSTANCE);

    static {
        Covode.recordClassIndex(16148);
    }

    public final GameOfficialItemWidget LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (GameOfficialItemWidget) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final GameLoadingWidget LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (GameLoadingWidget) (proxy.isSupported ? proxy.result : this.f25849LJ.mo27335getValue());
    }

    public final GameTitleBarWidget LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (GameTitleBarWidget) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698299;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, p003X.LAC
    /* renamed from: LJ */
    public final void mo14490LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.mo14490LJ();
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.LIZLLL();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            int LIZ2 = LK5.LIZ(70.0f);
            NestedScrollView nestedScrollView = (NestedScrollView) this.contentView.findViewById(2131183924);
            if (nestedScrollView != null) {
                nestedScrollView.setOnScrollChangeListener(new L41(this, LIZ2));
            }
        }
        LIZJ().LIZ(this, 2131175957).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LIZIZ());
        LIZJ().LIZ();
        this.LIZIZ = this.contentView.findViewById(2131175957);
        new AnchorGamePromoteInfoWidget().LIZ(this, 2131175939).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJIIJ);
        new GameDetailWidget(true).LIZ(this, 2131175885).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LIZIZ());
        LAC<C3082b> LIZ3 = new AnchorGamePromoteToolsWidget().LIZ(this, 2131175886);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        L7U.LIZ(LIZ3, new C89024L5u(context, LJIILL()), (Function1) null, 2, (Object) null).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJFF);
        new GameIntroWidget().LIZ(this, 2131175910).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.f8749LJ);
        new GameDeveloperInfoWidget().LIZ(this, 2131175888).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJI);
        GameBottomButtonWidget gameBottomButtonWidget = new GameBottomButtonWidget(true);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        gameBottomButtonWidget.LIZ(new C89008L5e(context2, this.LIZJ, LJIILL()), AnchorGameDetailContentWidget$onMount$1.INSTANCE).LIZ(this, 2131184593).LIZ(L6X.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJIIIZ).LIZ(L6Y.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJII);
    }

    public AnchorGameDetailContentWidget(FragmentManager fragmentManager) {
        super(null, 1);
        this.LIZJ = fragmentManager;
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, AnchorGameDetailContentWidget$onUpdate$1.INSTANCE, null, new AnchorGameDetailContentWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, AnchorGameDetailContentWidget$onUpdate$3.INSTANCE, null, new AnchorGameDetailContentWidget$onUpdate$4(this), 2, null);
        }
    }
}
