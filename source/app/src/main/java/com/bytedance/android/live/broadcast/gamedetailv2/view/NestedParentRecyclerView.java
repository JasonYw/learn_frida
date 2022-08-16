package com.bytedance.android.live.broadcast.gamedetailv2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C140396dT6;

/* loaded from: classes19.dex */
public final class NestedParentRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final C140396dT6 LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public int f25897LJ;
    public int LJFF;
    public VelocityTracker LJI;
    public AbstractC3123l LJII;

    static {
        Covode.recordClassIndex(16728);
    }

    public NestedParentRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NestedParentRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final AbstractC3123l getMChildNestedScrollViewProvider() {
        return this.LJII;
    }

    public final int getTotalDy() {
        return this.f25897LJ;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        final Context context = getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView$initLayoutManager$linearLayoutManager$1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(16730);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, this, LIZ, false, 2);
                return proxy.isSupported ? ((Integer) proxy.result).intValue() : LIZ(this, i, recycler, state);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                NestedChildRecyclerView LIZLLL = NestedParentRecyclerView.this.LIZLLL();
                if (LIZLLL != null && !LIZLLL.LIZIZ()) {
                    return false;
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void addDisappearingView(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 6).isSupported) {
                    return;
                }
                try {
                    super.addDisappearingView(view);
                } catch (Exception unused) {
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{recycler, state}, this, LIZ, false, 4).isSupported) {
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception unused) {
                }
            }

            private int LIZ(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, this, LIZ, false, 3);
                if (proxy.isSupported) {
                    return ((Integer) proxy.result).intValue();
                }
                try {
                    return super.scrollVerticallyBy(i, recycler, state);
                } catch (Exception unused) {
                    return 0;
                }
            }

            public static int LIZ(NestedParentRecyclerView$initLayoutManager$linearLayoutManager$1 nestedParentRecyclerView$initLayoutManager$linearLayoutManager$1, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nestedParentRecyclerView$initLayoutManager$linearLayoutManager$1, Integer.valueOf(i), recycler, state}, null, LIZ, true, 1);
                if (proxy.isSupported) {
                    return ((Integer) proxy.result).intValue();
                }
                try {
                    return nestedParentRecyclerView$initLayoutManager$linearLayoutManager$1.LIZ(i, recycler, state);
                } catch (NullPointerException unused) {
                    return 0;
                }
            }
        };
        linearLayoutManager.setOrientation(1);
        setLayoutManager(linearLayoutManager);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (canScrollVertically(1)) {
            return false;
        }
        return true;
    }

    public final NestedChildRecyclerView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        RecyclerView.Adapter mo25798getAdapter = mo25798getAdapter();
        if (!(mo25798getAdapter instanceof AbstractC3123l)) {
            mo25798getAdapter = null;
        }
        AbstractC3123l abstractC3123l = (AbstractC3123l) mo25798getAdapter;
        if (abstractC3123l != null) {
            return abstractC3123l.LIZJ();
        }
        AbstractC3123l abstractC3123l2 = this.LJII;
        if (abstractC3123l2 == null) {
            return null;
        }
        return abstractC3123l2.LIZJ();
    }

    public final void LIZ() {
        int i;
        NestedChildRecyclerView LIZLLL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        if (LIZJ() && (i = this.LJFF) != 0 && this.LIZJ.LIZ(i) > this.f25897LJ) {
            int i2 = this.LJFF;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported && (LIZLLL = LIZLLL()) != null) {
                LIZLLL.fling(0, i2);
            }
        }
        this.f25897LJ = 0;
        this.LJFF = 0;
    }

    public final void setMChildNestedScrollViewProvider(AbstractC3123l abstractC3123l) {
        this.LJII = abstractC3123l;
    }

    public final void setStartFling(boolean z) {
        this.LIZIZ = z;
    }

    public final void setTotalDy(int i) {
        this.f25897LJ = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r5.getAction() == 2) goto L12;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView.LIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            if (r5 == 0) goto L2f
            int r0 = r5.getAction()
            if (r0 != 0) goto L27
            r4.LJFF = r2
            r4.stopScroll()
        L27:
            int r1 = r5.getAction()
            r0 = 2
            if (r1 != r0) goto L2f
            goto L32
        L2f:
            r0 = 0
            r4.LIZLLL = r0
        L32:
            boolean r2 = super.dispatchTouchEvent(r5)     // Catch: java.lang.Exception -> L36
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 6);
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
            this.LJFF = -i;
            LIZ();
        }
        if (this.LIZLLL == 0.0f) {
            this.LIZLLL = motionEvent.getY();
        }
        if (LIZJ()) {
            NestedChildRecyclerView LIZLLL = LIZLLL();
            int y = (int) (this.LIZLLL - motionEvent.getY());
            if (LIZLLL != null) {
                if (y != 0) {
                    LIZLLL.scrollBy(0, y);
                    if (LIZLLL.LIZIZ()) {
                        scrollBy(0, y);
                    }
                }
            } else {
                scrollBy(0, y);
            }
            this.LIZLLL = motionEvent.getY();
            return true;
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
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (fling && i2 > 0) {
            this.LIZIZ = true;
            this.LJFF = i2;
            return fling;
        }
        this.LJFF = 0;
        return fling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void scrollBy(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.scrollBy(i, i2);
        this.LIZIZ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedParentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = new C140396dT6(context);
        setDescendantFocusability(393216);
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(16729);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(recyclerView);
                super.onScrolled(recyclerView, i2, i3);
                NestedParentRecyclerView nestedParentRecyclerView = NestedParentRecyclerView.this;
                nestedParentRecyclerView.setTotalDy(nestedParentRecyclerView.getTotalDy() + i3);
                if (NestedParentRecyclerView.this.LIZJ()) {
                    NestedParentRecyclerView.this.LIZ();
                }
                if (NestedParentRecyclerView.this.LIZIZ) {
                    NestedParentRecyclerView.this.setTotalDy(0);
                    NestedParentRecyclerView.this.setStartFling(false);
                }
            }
        });
    }

    public /* synthetic */ NestedParentRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
