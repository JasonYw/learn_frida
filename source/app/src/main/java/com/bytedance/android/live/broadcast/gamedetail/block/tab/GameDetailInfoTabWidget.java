package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailRecyclerList;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89032L6c;
import p003X.C89037L6h;
import p003X.C89094L8m;
import p003X.L5K;

/* loaded from: classes5.dex */
public final class GameDetailInfoTabWidget extends BaseGameDetailTabWidget<C3074b> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public Integer LIZLLL = 0;

    /* renamed from: LJ */
    public final Function0<Integer> f25856LJ = new GameDetailInfoTabWidget$getListSize$1(this);
    public GameDetailRecyclerList<?> LJFF;

    static {
        Covode.recordClassIndex(16296);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699259;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.viewpager.PagerItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l
    public final NestedChildRecyclerView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 4);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        GameDetailRecyclerList<?> gameDetailRecyclerList = this.LJFF;
        if (gameDetailRecyclerList != null) {
            return gameDetailRecyclerList.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.ies.viewpager.PagerItemWidget
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported) {
            return;
        }
        LIZJ(new L5K("tab_game_detail"));
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, GameDetailInfoTabWidget$onMount$1.INSTANCE);
        GameDetailRecyclerList<?> gameDetailRecyclerList = new GameDetailRecyclerList<>(C89037L6h.LIZ(), new GameDetailInfoTabWidget$onMount$2(this));
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        gameDetailRecyclerList.LIZ((PureWidget<?>) this, (Integer) 2131183784, viewGroup);
        gameDetailRecyclerList.LIZ(C89032L6c.LIZ, C89094L8m.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89037L6h.LIZIZ());
        this.LJFF = gameDetailRecyclerList;
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        C3074b c3074b = (C3074b) abstractC12642p;
        if (!PatchProxy.proxy(new Object[]{c3074b}, this, LIZJ, false, 2).isSupported) {
            C106862S5w.LIZ(c3074b);
            this.LIZLLL = c3074b.LIZIZ;
        }
    }
}
