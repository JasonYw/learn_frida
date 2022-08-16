package com.bytedance.android.live.broadcastgame.debug;

import androidx.customview.widget.ViewDragHelper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcastgame.debug.view.DragFrameLayout;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.LPK;
import p003X.LPN;
import p003X.LPO;

/* loaded from: classes5.dex */
public final class LiveGameDebugWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new LiveGameDebugWidget$viewPager$2(this));
    public final LPO LIZJ = new LPO();

    static {
        Covode.recordClassIndex(19701);
    }

    public final ViewPager LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ViewPager) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698417;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public LiveGameDebugWidget() {
        LazyKt__LazyJVMKt.lazy(new LiveGameDebugWidget$container$2(this));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        findViewById(2131167988).setOnClickListener(new LPN(this));
        DragFrameLayout dragFrameLayout = (DragFrameLayout) findViewById(2131192978);
        if (dragFrameLayout != null) {
            ViewDragHelper create = ViewDragHelper.create(dragFrameLayout, this.LIZJ);
            Intrinsics.checkNotNullExpressionValue(create, "");
            dragFrameLayout.setDragHelper(create);
        }
        Widget.WidgetCallback widgetCallback = this.widgetCallback;
        Intrinsics.checkNotNullExpressionValue(widgetCallback, "");
        WidgetManager widgetManager = widgetCallback.getWidgetManager();
        Intrinsics.checkNotNullExpressionValue(widgetManager, "");
        final FragmentManager fragmentManager = widgetManager.getFragmentManager();
        if (fragmentManager != null) {
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new LPK());
            ViewPager LIZ2 = LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.setAdapter(new FragmentPagerAdapter(fragmentManager, arrayList) { // from class: X.7G7
                public static ChangeQuickRedirect LIZ;
                public final List<Fragment> LIZIZ;

                static {
                    Covode.recordClassIndex(19702);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return ((Integer) proxy.result).intValue();
                    }
                    return this.LIZIZ.size();
                }

                @Override // androidx.fragment.app.FragmentPagerAdapter
                public final Fragment getItem(int i) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return (Fragment) proxy.result;
                    }
                    return this.LIZIZ.get(i);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(fragmentManager);
                    C106862S5w.LIZ(fragmentManager, arrayList);
                    this.LIZIZ = arrayList;
                }
            });
        }
    }
}
