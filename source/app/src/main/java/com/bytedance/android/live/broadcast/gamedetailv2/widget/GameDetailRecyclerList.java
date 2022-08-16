package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.AbstractC12648a;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import com.bytedance.ies.sve_list.SimpleRecyclerList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class GameDetailRecyclerList<Item extends AbstractC12648a> extends SimpleRecyclerList<Item, NestedChildRecyclerView> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(16764);
    }

    @Override // com.bytedance.ies.sve_list.RecyclerList, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699258;
    }

    @Override // com.bytedance.ies.sve_list.SimpleRecyclerList, com.bytedance.ies.sve_list.RecyclerList, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_list.RecyclerList
    /* renamed from: LIZJ */
    public final NestedChildRecyclerView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        View findViewById = this.contentView.findViewById(2131191134);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        return (NestedChildRecyclerView) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailRecyclerList(Function2<? super Integer, ? super LAB<Item, NestedChildRecyclerView>, ? extends RecyclerViewItemWidget<? extends Item>> function2, Function1<? super NestedChildRecyclerView, Unit> function1) {
        super(function2, function1);
        C106862S5w.LIZ(function2);
    }
}
