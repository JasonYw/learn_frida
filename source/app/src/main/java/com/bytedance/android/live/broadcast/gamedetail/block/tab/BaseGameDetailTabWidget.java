package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l;
import com.bytedance.android.live.broadcast.view.C3252c;
import com.bytedance.android.live.broadcast.view.C3253d;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.p518ui.DouyinLoadingLayout;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.viewpager.PagerItemWidget;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass479;
import p003X.C3CX;
import p003X.C88999L4v;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public abstract class BaseGameDetailTabWidget<P extends AbstractC12642p> extends PagerItemWidget<P> implements AbstractC3123l, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public LoadingStatusView LIZIZ;
    public final boolean LIZJ = !AnonymousClass479.LIZJ();
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new BaseGameDetailTabWidget$emptyView$2(this));

    /* renamed from: LJ */
    public final Lazy f25854LJ = LazyKt__LazyJVMKt.lazy(new BaseGameDetailTabWidget$errorView$2(this));

    static {
        Covode.recordClassIndex(16281);
    }

    private final C3253d LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3253d) (proxy.isSupported ? proxy.result : this.f25854LJ.mo27335getValue());
    }

    public final C3252c LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3252c) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    @Override // com.bytedance.ies.viewpager.PagerItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            LK1.LIZ((View) loadingStatusView);
        }
        LoadingStatusView loadingStatusView2 = this.LIZIZ;
        if (loadingStatusView2 != null) {
            loadingStatusView2.LIZ();
        }
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
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
    public void LIZLLL() {
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.m14708i(1266);
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1266);
            return;
        }
        super.LIZLLL();
        this.LIZIZ = new LoadingStatusView(this.context);
        if (this.LIZIZ != null) {
            this.containerView.addView(this.LIZIZ, new ViewGroup.LayoutParams(-1, -1));
        }
        View view = this.contentView;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            if (this.LIZJ) {
                SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_STYLE_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Integer value = settingKey.getValue();
                if ((value == null || value.intValue() != 4) && !C88999L4v.LIZIZ.LIZIZ()) {
                    i = LK5.LIZ(61.0f);
                }
            }
            layoutParams2.bottomMargin = i;
            View view2 = this.contentView;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
        LoadingStatusView loadingStatusView = this.LIZIZ;
        if (loadingStatusView != null) {
            C3CX LIZ2 = C3CX.LIZ(this.context);
            LIZ2.LIZJ(LJIIIIZZ());
            LIZ2.LIZIZ(LIZ());
            LIZ2.LIZ(new DouyinLoadingLayout(this.context));
            loadingStatusView.setBuilder(LIZ2);
            MethodCollector.m14707o(1266);
            return;
        }
        MethodCollector.m14707o(1266);
    }

    public static /* synthetic */ void LIZ(BaseGameDetailTabWidget baseGameDetailTabWidget, String str, Integer num, int i, Object obj) {
        C3253d LJIIIIZZ;
        if (!PatchProxy.proxy(new Object[]{baseGameDetailTabWidget, null, num, 1, null}, null, LIZ, true, 7).isSupported && !PatchProxy.proxy(new Object[]{"", num}, baseGameDetailTabWidget, LIZ, false, 6).isSupported) {
            if ((!StringsKt__StringsJVMKt.isBlank("")) && (LJIIIIZZ = baseGameDetailTabWidget.LJIIIIZZ()) != null) {
                LJIIIIZZ.setMsgText("");
            }
            if (num != null) {
                int intValue = num.intValue();
                C3253d LJIIIIZZ2 = baseGameDetailTabWidget.LJIIIIZZ();
                if (LJIIIIZZ2 != null) {
                    LJIIIIZZ2.setMsgTextColor(intValue);
                }
            }
            LoadingStatusView loadingStatusView = baseGameDetailTabWidget.LIZIZ;
            if (loadingStatusView != null) {
                loadingStatusView.LIZ();
            }
            LoadingStatusView loadingStatusView2 = baseGameDetailTabWidget.LIZIZ;
            if (loadingStatusView2 != null) {
                LK1.LIZJ(loadingStatusView2);
            }
            LoadingStatusView loadingStatusView3 = baseGameDetailTabWidget.LIZIZ;
            if (loadingStatusView3 != null) {
                loadingStatusView3.LIZLLL();
            }
        }
    }
}
