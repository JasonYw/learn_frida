package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.AbstractC0254k;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC94696NRy;
import p003X.C106862S5w;

/* loaded from: classes6.dex */
public final class CustomViewPager extends ViewPager implements AbstractC0254k {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ = true;
    public NestedScrollingParentHelper LIZJ;
    public AbstractC94696NRy LIZLLL;

    static {
        Covode.recordClassIndex(26492);
    }

    @Override // androidx.core.view.AbstractC0254k
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(view, view2);
        return (i & 2) != 0;
    }

    public final AbstractC94696NRy getScrollListener() {
        return this.LIZLLL;
    }

    private final NestedScrollingParentHelper getScrollingChildHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (NestedScrollingParentHelper) proxy.result;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new NestedScrollingParentHelper(this);
        }
        return this.LIZJ;
    }

    public final void setScrollListener(AbstractC94696NRy abstractC94696NRy) {
        this.LIZLLL = abstractC94696NRy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(Context context) {
        super(context);
        C106862S5w.LIZ(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LIZIZ) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LIZIZ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
    }

    @Override // androidx.core.view.AbstractC0254k
    public final void onStopNestedScroll(View view, int i) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        NestedScrollingParentHelper scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper != null) {
            scrollingChildHelper.onStopNestedScroll(view, i);
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{view, view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, view2);
        NestedScrollingParentHelper scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper != null) {
            scrollingChildHelper.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, iArr);
        AbstractC94696NRy abstractC94696NRy = this.LIZLLL;
        if (abstractC94696NRy != null) {
            abstractC94696NRy.LIZ(view, i, i2, iArr, i3);
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        AbstractC94696NRy abstractC94696NRy = this.LIZLLL;
        if (abstractC94696NRy != null) {
            abstractC94696NRy.LIZ(view, i, i2, i3, i4, i5);
        }
    }
}
