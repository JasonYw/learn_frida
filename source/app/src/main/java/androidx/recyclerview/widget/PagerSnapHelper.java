package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC113806UrA;
import p003X.AbstractC147106fDg;

/* loaded from: classes11.dex */
public class PagerSnapHelper extends SnapHelper {
    public AbstractC147106fDg mHorizontalHelper;
    public AbstractC147106fDg mVerticalHelper;

    static {
        Covode.recordClassIndex(1680);
    }

    private AbstractC147106fDg getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        AbstractC147106fDg abstractC147106fDg = this.mHorizontalHelper;
        if (abstractC147106fDg == null || abstractC147106fDg.LIZ != layoutManager) {
            this.mHorizontalHelper = AbstractC147106fDg.LIZ(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private AbstractC147106fDg getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    private AbstractC147106fDg getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        AbstractC147106fDg abstractC147106fDg = this.mVerticalHelper;
        if (abstractC147106fDg == null || abstractC147106fDg.LIZ != layoutManager) {
            this.mVerticalHelper = AbstractC147106fDg.LIZIZ(layoutManager);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof AbstractC113806UrA)) {
            return null;
        }
        return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
            static {
                Covode.recordClassIndex(1681);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                int[] calculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.mo25799getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof AbstractC113806UrA) || (computeScrollVectorForPosition = ((AbstractC113806UrA) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    private View findCenterView(RecyclerView.LayoutManager layoutManager, AbstractC147106fDg abstractC147106fDg) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int LIZIZ = abstractC147106fDg.LIZIZ() + (abstractC147106fDg.mo21355LJ() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((abstractC147106fDg.LIZ(childAt) + (abstractC147106fDg.mo21354LJ(childAt) / 2)) - LIZIZ);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, view, getVerticalHelper(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.canScrollHorizontally()) {
            if (i > 0) {
                return true;
            }
            return false;
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private int distanceToCenter(RecyclerView.LayoutManager layoutManager, View view, AbstractC147106fDg abstractC147106fDg) {
        return (abstractC147106fDg.LIZ(view) + (abstractC147106fDg.mo21354LJ(view) / 2)) - (abstractC147106fDg.LIZIZ() + (abstractC147106fDg.mo21355LJ() / 2));
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        AbstractC147106fDg orientationHelper;
        int i3;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        View view2 = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = layoutManager.getChildAt(i6);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(layoutManager, childAt, orientationHelper);
                if (distanceToCenter <= 0) {
                    if (distanceToCenter > i4) {
                        view2 = childAt;
                        i4 = distanceToCenter;
                    }
                    if (distanceToCenter < 0) {
                    }
                }
                if (distanceToCenter < i5) {
                    view = childAt;
                    i5 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i, i2);
        if (isForwardFling) {
            if (view != null) {
                return layoutManager.getPosition(view);
            }
        } else if (view2 != null) {
            return layoutManager.getPosition(view2);
        } else {
            view2 = view;
        }
        if (view2 == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view2);
        if (isReverseLayout(layoutManager) == isForwardFling) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = position + i3;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }
}
