package com.bytedance.android.live.broadcast.gamedetailv2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C140396dT6;
import p003X.C145680eqe;

/* loaded from: classes19.dex */
public final class NestedChildRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final C140396dT6 LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public int f25896LJ;
    public NestedParentRecyclerView LJFF;
    public VelocityTracker LJI;

    static {
        Covode.recordClassIndex(16726);
    }

    public NestedChildRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NestedChildRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    private final NestedParentRecyclerView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (NestedParentRecyclerView) proxy.result;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof NestedParentRecyclerView)) {
            Intrinsics.checkNotNullExpressionValue(parent, "");
            parent = parent.getParent();
        }
        return (NestedParentRecyclerView) parent;
    }

    public final void LIZ() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LJFF == null) {
            this.LJFF = LIZJ();
        }
        NestedParentRecyclerView nestedParentRecyclerView = this.LJFF;
        if (nestedParentRecyclerView != null && LIZIZ() && (i = this.f25896LJ) != 0) {
            if (this.LIZJ.LIZ(i) > Math.abs(nestedParentRecyclerView.getTotalDy())) {
                nestedParentRecyclerView.fling(0, this.f25896LJ);
            }
            nestedParentRecyclerView.setTotalDy(0);
            this.f25896LJ = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.f25896LJ = 0;
            }
            if (motionEvent.getAction() != 2) {
                this.LIZLLL = 0.0f;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int y;
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        if (this.LJI == null) {
            this.LJI = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LJI;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent.getAction() == 1 && !this.LIZIZ) {
            VelocityTracker velocityTracker2 = this.LJI;
            if (velocityTracker2 != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                Intrinsics.checkNotNullExpressionValue(viewConfiguration, "");
                velocityTracker2.computeCurrentVelocity(1000, viewConfiguration.getScaledMaximumFlingVelocity());
                i = (int) velocityTracker2.getYVelocity();
            } else {
                i = 0;
            }
            this.f25896LJ = -i;
            LIZ();
        }
        if (this.LIZLLL == 0.0f) {
            this.LIZLLL = motionEvent.getY();
        }
        if (LIZIZ()) {
            if (this.LJFF == null) {
                this.LJFF = LIZJ();
            }
            NestedParentRecyclerView nestedParentRecyclerView = this.LJFF;
            if (nestedParentRecyclerView != null && (y = (int) (this.LIZLLL - motionEvent.getY())) != 0) {
                nestedParentRecyclerView.scrollBy(0, y);
                if (nestedParentRecyclerView.LIZJ()) {
                    scrollBy(0, y);
                }
            }
            this.LIZLLL = motionEvent.getY();
        }
        this.LIZLLL = motionEvent.getY();
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!isAttachedToWindow()) {
            return false;
        }
        boolean fling = super.fling(i, i2);
        if (fling) {
            this.LIZIZ = true;
            this.f25896LJ = i2;
            return fling;
        }
        this.f25896LJ = 0;
        this.LIZIZ = false;
        return fling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void scrollBy(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.scrollBy(i, i2);
        this.LIZIZ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = new C140396dT6(context);
        setOverScrollMode(2);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            addOnScrollListener(new C145680eqe(this));
        }
        setNestedScrollingEnabled(false);
    }

    public /* synthetic */ NestedChildRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
