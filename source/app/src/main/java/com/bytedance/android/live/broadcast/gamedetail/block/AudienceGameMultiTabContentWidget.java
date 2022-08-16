package com.bytedance.android.live.broadcast.gamedetail.block;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.RecyclerList;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L8K;
import p003X.L8Z;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class AudienceGameMultiTabContentWidget extends RecyclerList<C3051b, AbstractC3125c, NestedParentRecyclerView> implements AbstractC3123l, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = 1;

    static {
        Covode.recordClassIndex(16158);
    }

    @Override // com.bytedance.ies.sve_list.RecyclerList, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699803;
    }

    @Override // com.bytedance.ies.sve_list.RecyclerList, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.mo14489r_();
        LIZ().setAdapter(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.ies.sve_list.RecyclerList
    /* renamed from: LJFF */
    public NestedParentRecyclerView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (NestedParentRecyclerView) proxy.result;
        }
        View findViewById = this.contentView.findViewById(2131188496);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (NestedParentRecyclerView) findViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView LIZJ() {
        /*
            r7 = this;
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r5 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r7, r0, r4, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView r0 = (com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView) r0
            return r0
        L13:
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            X.LAB<Item extends com.bytedance.ies.sve_list.a, RV extends androidx.recyclerview.widget.RecyclerView> r0 = r7.LIZLLL
            if (r0 == 0) goto La2
            int r0 = r0.getItemCount()
        L1d:
            r1.<init>(r4, r0)
            int r3 = r1.getFirst()
            int r2 = r1.getLast()
            r6 = 0
            if (r3 > r2) goto Lae
        L2b:
            com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView r0 = r7.LIZ()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.findViewHolderForAdapterPosition(r3)
            if (r1 == 0) goto L9d
            boolean r0 = r1 instanceof p003X.C89067L7l
            if (r0 == 0) goto L9d
            X.L7l r1 = (p003X.C89067L7l) r1
            com.bytedance.ies.sve_list.RecyclerViewItemWidget<Item extends com.bytedance.ies.sve_list.a> r0 = r1.LIZ
            boolean r0 = r0 instanceof com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget
            if (r0 == 0) goto L9d
            com.bytedance.ies.sve_list.RecyclerViewItemWidget<Item extends com.bytedance.ies.sve_list.a> r3 = r1.LIZ
            if (r3 == 0) goto La6
            com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget r3 = (com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget) r3
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget.LIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r1.result
        L56:
            com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget r1 = (com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget) r1
            if (r1 == 0) goto La5
            com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView r0 = r1.LIZJ()
            return r0
        L5f:
            com.bytedance.ies.viewpager.SimplePagerWidget r2 = r3.LIZLLL
            if (r2 == 0) goto L9b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.ies.viewpager.PagerWidget.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r2, r0, r4, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L79
            java.lang.Object r1 = r1.result
            com.bytedance.ies.viewpager.PagerItemWidget r1 = (com.bytedance.ies.viewpager.PagerItemWidget) r1
        L73:
            boolean r0 = r1 instanceof com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget
            if (r0 != 0) goto L56
            r1 = r6
            goto L56
        L79:
            X.L75 r3 = r2.LIZIZ
            if (r3 == 0) goto L9b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.L75.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L90
            java.lang.Object r1 = r1.result
            com.bytedance.ies.viewpager.PagerItemWidget r1 = (com.bytedance.ies.viewpager.PagerItemWidget) r1
            goto L73
        L90:
            java.util.List<com.bytedance.ies.viewpager.PagerItemWidget<?>> r1 = r3.LIZIZ
            int r0 = r3.LIZJ
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r1, r0)
            com.bytedance.ies.viewpager.PagerItemWidget r1 = (com.bytedance.ies.viewpager.PagerItemWidget) r1
            goto L73
        L9b:
            r1 = r6
            goto L73
        L9d:
            if (r3 == r2) goto Lae
            int r3 = r3 + 1
            goto L2b
        La2:
            r0 = 0
            goto L1d
        La5:
            return r6
        La6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget"
            r1.<init>(r0)
            throw r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZJ():com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
        if (r2 != null) goto L23;
     */
    @Override // com.bytedance.ies.sve_list.RecyclerList, com.bytedance.ies.sve_core.PureWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZLLL() {
        /*
            r8 = this;
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            super.LIZLLL()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r0.isSupported
            r5 = 2131175197(0x7f07271d, float:1.7964887E38)
            r7 = 0
            if (r0 != 0) goto L36
            com.bytedance.android.live.broadcast.gamedetailv2.GameDetailLoadingWidget r1 = new com.bytedance.android.live.broadcast.gamedetailv2.GameDetailLoadingWidget
            r1.<init>()
            r0 = r8
            X.LAC r2 = r1.LIZ(r0, r5)
            X.L6c r1 = p003X.C89032L6c.LIZ
            kotlin.jvm.functions.Function2 r0 = p003X.C89021L5r.LIZ()
            r2.LIZ(r1, r7, r0)
        L36:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r3 = 8
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r4, r3)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L5f
            com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView r1 = r8.LIZ()
            r0 = r8
            r1.setMChildNestedScrollViewProvider(r0)
            r1.LIZIZ()
            X.L5Z r0 = new X.L5Z
            r0.<init>()
            r1.addItemDecoration(r0)
            X.L7C r0 = new X.L7C
            r0.<init>(r1, r8)
            r1.addOnScrollListener(r0)
        L5f:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L8d
            com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceGameTitleBarWidget r2 = new com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceGameTitleBarWidget
            r2.<init>()
            r1 = r8
            r0 = 2131192892(0x7f076c3c, float:1.8000776E38)
            X.LAC r6 = r2.LIZ(r1, r0)
            X.L6c r2 = p003X.C89032L6c.LIZ
            X.L8m r1 = p003X.C89094L8m.LIZ
            com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$1 r0 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$1.INSTANCE
            X.LAC r2 = r6.LIZ(r2, r1, r7, r0)
            X.L6Z r1 = p003X.L6Z.LIZ
            com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$2 r0 = new com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$2
            r0.<init>(r8)
            r2.LIZ(r1, r7, r0)
        L8d:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZ
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto Lda
            android.view.View r1 = r8.contentView
            r0 = 2131180395(0x7f073b6b, float:1.797543E38)
            android.view.View r2 = r1.findViewById(r0)
            boolean r0 = p003X.L3P.LIZ()
            if (r0 == 0) goto Ldb
            android.view.View r0 = r8.contentView
            android.view.View r1 = r0.findViewById(r5)
            r0 = 1110441984(0x42300000, float:44.0)
            int r0 = p003X.LK5.LIZ(r0)
            r1.setPadding(r4, r0, r4, r4)
            if (r2 == 0) goto Lca
            r0 = 2131196399(0x7f0779ef, float:1.800789E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto Lc7
            r0.setVisibility(r4)
        Lc7:
            r2.setVisibility(r4)
        Lca:
            android.view.View r1 = r8.contentView
            r0 = 2131188131(0x7f0759a3, float:1.799112E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto Lda
            r0.setVisibility(r3)
        Lda:
            return
        Ldb:
            if (r2 == 0) goto Lca
            goto Lc7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget.LIZLLL():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameMultiTabContentWidget(Function2<? super Integer, ? super LAB<AbstractC3125c, NestedParentRecyclerView>, ? extends RecyclerViewItemWidget<? extends AbstractC3125c>> function2) {
        super(function2, null);
        C106862S5w.LIZ(function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.ies.sve_list.RecyclerList, p003X.LAL
    public void LIZ(C3051b c3051b) {
        if (PatchProxy.proxy(new Object[]{c3051b}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3051b);
        super.LIZ((AudienceGameMultiTabContentWidget) c3051b);
        List<AbstractC3125c> list = c3051b.LJFF;
        if ((!list.isEmpty()) && list != null) {
            LIZJ(new L8K(null, 1));
        }
        NestedParentRecyclerView LIZ2 = LIZ();
        LIZ2.post(new L8Z(LIZ2));
    }
}
