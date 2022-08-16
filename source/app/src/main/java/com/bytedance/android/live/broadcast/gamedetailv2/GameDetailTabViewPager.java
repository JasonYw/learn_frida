package com.bytedance.android.live.broadcast.gamedetailv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes6.dex */
public final class GameDetailTabViewPager extends ViewPager {
    public static ChangeQuickRedirect LIZ;
    public RecyclerView LIZIZ;

    static {
        Covode.recordClassIndex(16590);
    }

    public GameDetailTabViewPager(Context context) {
        this(context, null, 2, null);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.setCurrentItem(i, true);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            if (this.LIZIZ == null) {
                this.LIZIZ = (RecyclerView) childAt.findViewWithTag("HorizontalListView");
            }
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null && !recyclerView.canScrollVertically(1)) {
                if (motionEvent != null) {
                    i = (int) motionEvent.getX();
                    i2 = (int) motionEvent.getY();
                } else {
                    i = 0;
                    i2 = 0;
                }
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 4);
                if (proxy2.isSupported) {
                    if (((Boolean) proxy2.result).booleanValue()) {
                        return false;
                    }
                } else if (i >= 0 && i2 >= 0 && i < (recyclerView.getRight() - recyclerView.getLeft()) + 0 && i2 < (recyclerView.getBottom() - recyclerView.getTop()) + 0) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.bytedance.android.live.broadcast.gamedetailv2.GameDetailTabViewPager.1
            static {
                Covode.recordClassIndex(16591);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                GameDetailTabViewPager.this.LIZIZ = null;
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.setCurrentItem(i, z);
    }

    public /* synthetic */ GameDetailTabViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
