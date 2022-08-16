package com.bytedance.android.live.broadcast.gamedetail.block;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import com.bytedance.ies.viewpager.SimplePagerWidget;
import com.bytedance.live.datacontext.C13491f;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C89045L6p;
import p003X.IQV;
import p003X.L5O;
import p003X.L7U;
import p003X.LAB;
import p003X.LHN;
import p003X.LK1;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class GameTabWidget extends BaseGameDetailWidget<C3053d> implements Object {
    public static ChangeQuickRedirect LIZ;
    public TabLayout LIZIZ;
    public View LIZJ;
    public SimplePagerWidget LIZLLL;

    /* renamed from: LJ */
    public final C89045L6p f25850LJ;
    public LinearLayout LJFF;
    public final /* synthetic */ L5O LJII = new L5O();
    public final boolean LJI = !AnonymousClass479.LIZJ();

    static {
        Covode.recordClassIndex(16163);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJII.LIZ(disposable);
    }

    @Override // com.bytedance.ies.sve_list.RecyclerViewItemWidget
    public final boolean LIZ() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699451;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.mo14489r_();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            this.LJII.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        ViewParent viewParent;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (TabLayout) this.contentView.findViewById(2131192377);
        this.LIZJ = this.contentView.findViewById(2131196396);
        this.LJFF = (LinearLayout) this.contentView.findViewById(2131181943);
        LIZ(this.LJFF);
        LinearLayout linearLayout = this.LJFF;
        if (linearLayout != null) {
            viewParent = linearLayout.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof FrameLayout)) {
            viewParent = null;
        }
        LIZ((FrameLayout) viewParent);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            Observable<C3952am> observeOn = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("gamecpGameDetailTabToggle").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn, "");
            Disposable LIZ2 = QB4.LIZ(observeOn, new GameTabWidget$initJSB$1(this));
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ(LIZ2);
            Observable<C3952am> observeOn2 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("gamecpOpenPropOrder").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "");
            Disposable LIZ3 = QB4.LIZ(observeOn2, new GameTabWidget$initJSB$2(this));
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            LIZ(LIZ3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3053d c3053d) {
        if (PatchProxy.proxy(new Object[]{c3053d}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3053d);
        super.LIZ((GameTabWidget) c3053d);
        L7U.LIZ(this, c3053d, GameTabWidget$onUpdate$1.INSTANCE, null, new GameTabWidget$onUpdate$2(this), 2, null);
        L7U.LIZ(this, c3053d, GameTabWidget$onUpdate$3.INSTANCE, null, new GameTabWidget$onUpdate$4(this), 2, null);
        L7U.LIZ(this, c3053d, GameTabWidget$onUpdate$5.INSTANCE, null, new GameTabWidget$onUpdate$6(this), 2, null);
    }

    private final void LIZ(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (this.LJI) {
            if (layoutParams != null) {
                View view2 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                Context context = view2.getContext();
                if (context != null) {
                    layoutParams.height = LHN.LIZIZ((Context) ((Activity) context)) - LK1.LIZLLL(44);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        } else if (layoutParams != null) {
            layoutParams.height = LHN.LIZJ() - LK1.LIZLLL(44);
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTabWidget(LAB<AbstractC3125c, ?> lab, Function1<? super RecyclerViewItemWidget<C3053d>, ? extends Object> function1) {
        super(lab, function1);
        C106862S5w.LIZ(lab);
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.f25850LJ = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3053d c3053d) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3053d}, this, LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(c3053d);
        }
    }
}
