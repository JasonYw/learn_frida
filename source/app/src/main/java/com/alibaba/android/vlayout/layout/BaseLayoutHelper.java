package com.alibaba.android.vlayout.layout;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.Range;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public abstract class BaseLayoutHelper extends MarginLayoutHelper {
    public static boolean DEBUG;
    public int mBgColor;
    public View mLayoutView;
    public LayoutViewBindListener mLayoutViewBindListener;
    public LayoutViewUnBindListener mLayoutViewUnBindListener;
    public Rect mLayoutRegion = new Rect();
    public float mAspectRatio = Float.NaN;
    public int mItemCount = 0;

    /* loaded from: classes20.dex */
    public interface LayoutViewBindListener {
        static {
            Covode.recordClassIndex(4376);
        }

        void onBind(View view, BaseLayoutHelper baseLayoutHelper);
    }

    /* loaded from: classes20.dex */
    public interface LayoutViewHelper {
        static {
            Covode.recordClassIndex(4377);
        }

        void onBindViewSuccess(View view, String str);
    }

    /* loaded from: classes20.dex */
    public interface LayoutViewUnBindListener {
        static {
            Covode.recordClassIndex(4378);
        }

        void onUnbind(View view, BaseLayoutHelper baseLayoutHelper);
    }

    static {
        Covode.recordClassIndex(4374);
    }

    private int calGap(int i, int i2) {
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public boolean isFixLayout() {
        return false;
    }

    public boolean isValidScrolled(int i) {
        return (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) ? false : true;
    }

    public abstract void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper);

    public void onClear(LayoutManagerHelper layoutManagerHelper) {
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public int getItemCount() {
        return this.mItemCount;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public boolean requireLayoutView() {
        if (this.mBgColor == 0 && this.mLayoutViewBindListener == null) {
            return false;
        }
        return true;
    }

    public void setAspectRatio(float f) {
        this.mAspectRatio = f;
    }

    public void setBgColor(int i) {
        this.mBgColor = i;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void setItemCount(int i) {
        this.mItemCount = i;
    }

    public void setLayoutViewBindListener(LayoutViewBindListener layoutViewBindListener) {
        this.mLayoutViewBindListener = layoutViewBindListener;
    }

    public void setLayoutViewUnBindListener(LayoutViewUnBindListener layoutViewUnBindListener) {
        this.mLayoutViewUnBindListener = layoutViewUnBindListener;
    }

    public void setLayoutViewHelper(DefaultLayoutViewHelper defaultLayoutViewHelper) {
        this.mLayoutViewBindListener = defaultLayoutViewHelper;
        this.mLayoutViewUnBindListener = defaultLayoutViewHelper;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public final void clear(LayoutManagerHelper layoutManagerHelper) {
        View view = this.mLayoutView;
        if (view != null) {
            LayoutViewUnBindListener layoutViewUnBindListener = this.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, this);
            }
            layoutManagerHelper.removeChildView(this.mLayoutView);
            this.mLayoutView = null;
        }
        onClear(layoutManagerHelper);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void bindLayoutView(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.mLayoutRegion.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mLayoutRegion.height(), 1073741824));
        view.layout(this.mLayoutRegion.left, this.mLayoutRegion.top, this.mLayoutRegion.right, this.mLayoutRegion.bottom);
        view.setBackgroundColor(this.mBgColor);
        LayoutViewBindListener layoutViewBindListener = this.mLayoutViewBindListener;
        if (layoutViewBindListener != null) {
            layoutViewBindListener.onBind(view, this);
        }
        this.mLayoutRegion.set(0, 0, 0, 0);
    }

    /* loaded from: classes20.dex */
    public static class DefaultLayoutViewHelper implements LayoutViewBindListener, LayoutViewHelper, LayoutViewUnBindListener {
        public final LayoutViewBindListener mLayoutViewBindListener;
        public final LayoutViewUnBindListener mLayoutViewUnBindListener;

        static {
            Covode.recordClassIndex(4375);
        }

        public DefaultLayoutViewHelper(LayoutViewBindListener layoutViewBindListener, LayoutViewUnBindListener layoutViewUnBindListener) {
            this.mLayoutViewBindListener = layoutViewBindListener;
            this.mLayoutViewUnBindListener = layoutViewUnBindListener;
        }

        @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper.LayoutViewHelper
        public void onBindViewSuccess(View view, String str) {
            view.setTag(2131191492, str);
        }

        @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper.LayoutViewUnBindListener
        public void onUnbind(View view, BaseLayoutHelper baseLayoutHelper) {
            LayoutViewUnBindListener layoutViewUnBindListener = this.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, baseLayoutHelper);
            }
            view.setTag(2131191492, null);
        }

        @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper.LayoutViewBindListener
        public void onBind(View view, BaseLayoutHelper baseLayoutHelper) {
            LayoutViewBindListener layoutViewBindListener;
            if (view.getTag(2131191492) == null && (layoutViewBindListener = this.mLayoutViewBindListener) != null) {
                layoutViewBindListener.onBind(view, baseLayoutHelper);
            }
        }
    }

    public void handleStateOnResult(LayoutChunkResult layoutChunkResult, View view) {
        if (view == null) {
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        boolean z = true;
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        if (!layoutChunkResult.mFocusable && !view.isFocusable()) {
            z = false;
        }
        layoutChunkResult.mFocusable = z;
    }

    public void handleStateOnResult(LayoutChunkResult layoutChunkResult, View[] viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                boolean z = true;
                if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                    layoutChunkResult.mIgnoreConsumed = true;
                }
                if (!layoutChunkResult.mFocusable && !view.isFocusable()) {
                    z = false;
                }
                layoutChunkResult.mFocusable = z;
                if (layoutChunkResult.mFocusable && layoutChunkResult.mIgnoreConsumed) {
                    return;
                }
            }
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        if (requireLayoutView()) {
            if (this.mLayoutView != null) {
                return;
            }
            return;
        }
        View view = this.mLayoutView;
        if (view != null) {
            LayoutViewUnBindListener layoutViewUnBindListener = this.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, this);
            }
            layoutManagerHelper.removeChildView(this.mLayoutView);
            this.mLayoutView = null;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void adjustLayout(int i, int i2, LayoutManagerHelper layoutManagerHelper) {
        if (requireLayoutView()) {
            Rect rect = new Rect();
            OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
            for (int i3 = 0; i3 < layoutManagerHelper.getChildCount(); i3++) {
                View childAt = layoutManagerHelper.getChildAt(i3);
                if (getRange().contains((Range<Integer>) Integer.valueOf(layoutManagerHelper.getPosition(childAt)))) {
                    if (childAt.getVisibility() == 8) {
                        rect.setEmpty();
                    } else {
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                        if (layoutManagerHelper.getOrientation() == 1) {
                            rect.union(layoutManagerHelper.getDecoratedLeft(childAt) - layoutParams.leftMargin, mainOrientationHelper.getDecoratedStart(childAt), layoutManagerHelper.getDecoratedRight(childAt) + layoutParams.rightMargin, mainOrientationHelper.getDecoratedEnd(childAt));
                        } else {
                            rect.union(mainOrientationHelper.getDecoratedStart(childAt), layoutManagerHelper.getDecoratedTop(childAt) - layoutParams.topMargin, mainOrientationHelper.getDecoratedEnd(childAt), layoutManagerHelper.getDecoratedBottom(childAt) + layoutParams.bottomMargin);
                        }
                    }
                }
            }
            if (!rect.isEmpty()) {
                this.mLayoutRegion.set(rect.left - this.mPaddingLeft, rect.top - this.mPaddingTop, rect.right + this.mPaddingRight, rect.bottom + this.mPaddingBottom);
            } else {
                this.mLayoutRegion.setEmpty();
            }
            View view = this.mLayoutView;
            if (view != null) {
                view.layout(this.mLayoutRegion.left, this.mLayoutRegion.top, this.mLayoutRegion.right, this.mLayoutRegion.bottom);
            }
        }
    }

    public int computeEndSpace(LayoutManagerHelper layoutManagerHelper, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = this.mMarginBottom;
            i2 = this.mPaddingBottom;
        } else {
            i = this.mMarginLeft;
            i2 = this.mPaddingLeft;
        }
        return i + i2;
    }

    public final View nextView(RecyclerView.Recycler recycler, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutManagerHelper layoutManagerHelper, LayoutChunkResult layoutChunkResult) {
        View next = layoutStateWrapper.next(recycler);
        if (next == null) {
            if (DEBUG && !layoutStateWrapper.hasScrapList()) {
                throw new RuntimeException("received null view when unexpected");
            }
            layoutChunkResult.mFinished = true;
            return null;
        }
        layoutManagerHelper.addChildView(layoutStateWrapper, next);
        return next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r6 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int computeStartSpace(com.alibaba.android.vlayout.LayoutManagerHelper r5, boolean r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.alibaba.android.vlayout.VirtualLayoutManager
            r3 = 0
            if (r0 == 0) goto L18
            com.alibaba.android.vlayout.VirtualLayoutManager r5 = (com.alibaba.android.vlayout.VirtualLayoutManager) r5
            com.alibaba.android.vlayout.LayoutHelper r1 = r5.findNeighbourNonfixLayoutHelper(r4, r7)
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.alibaba.android.vlayout.layout.MarginLayoutHelper
            if (r0 == 0) goto L14
            r3 = r1
            com.alibaba.android.vlayout.layout.MarginLayoutHelper r3 = (com.alibaba.android.vlayout.layout.MarginLayoutHelper) r3
        L14:
            r2 = 0
            if (r1 != r4) goto L1a
            return r2
        L18:
            r1 = r3
            goto L14
        L1a:
            if (r8 != 0) goto L29
            if (r6 == 0) goto L24
            int r1 = r4.mMarginTop
            int r0 = r4.mPaddingTop
        L22:
            int r1 = r1 + r0
            return r1
        L24:
            int r1 = r4.mMarginLeft
            int r0 = r4.mPaddingLeft
            goto L22
        L29:
            if (r3 != 0) goto L43
            if (r6 == 0) goto L3e
            int r1 = r4.mMarginTop
            int r0 = r4.mPaddingTop
        L31:
            int r1 = r1 + r0
            if (r6 == 0) goto L5f
        L34:
            if (r7 == 0) goto L3b
            int r0 = r4.mPaddingTop
        L38:
            int r0 = r0 + r2
            int r1 = r1 + r0
            return r1
        L3b:
            int r0 = r4.mPaddingBottom
            goto L38
        L3e:
            int r1 = r4.mMarginLeft
            int r0 = r4.mPaddingLeft
            goto L31
        L43:
            if (r6 == 0) goto L55
            if (r7 == 0) goto L50
            int r1 = r3.mMarginBottom
            int r0 = r4.mMarginTop
        L4b:
            int r1 = r4.calGap(r1, r0)
            goto L34
        L50:
            int r1 = r3.mMarginTop
            int r0 = r4.mMarginBottom
            goto L4b
        L55:
            if (r7 == 0) goto L64
            int r1 = r3.mMarginRight
            int r0 = r4.mMarginLeft
        L5b:
            int r1 = r4.calGap(r1, r0)
        L5f:
            if (r7 == 0) goto L69
            int r0 = r4.mPaddingLeft
            goto L38
        L64:
            int r1 = r3.mMarginLeft
            int r0 = r4.mMarginRight
            goto L5b
        L69:
            int r0 = r4.mPaddingRight
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.BaseLayoutHelper.computeStartSpace(com.alibaba.android.vlayout.LayoutManagerHelper, boolean, boolean, boolean):int");
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void doLayout(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        layoutViews(recycler, state, layoutStateWrapper, layoutChunkResult, layoutManagerHelper);
    }

    public void layoutChild(View view, int i, int i2, int i3, int i4, LayoutManagerHelper layoutManagerHelper) {
        layoutChild(view, i, i2, i3, i4, layoutManagerHelper, false);
    }

    public void layoutChildWithMargin(View view, int i, int i2, int i3, int i4, LayoutManagerHelper layoutManagerHelper) {
        layoutChildWithMargin(view, i, i2, i3, i4, layoutManagerHelper, false);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        View view;
        if (requireLayoutView()) {
            if (isValidScrolled(i3) && (view = this.mLayoutView) != null) {
                this.mLayoutRegion.union(view.getLeft(), this.mLayoutView.getTop(), this.mLayoutView.getRight(), this.mLayoutView.getBottom());
            }
            if (!this.mLayoutRegion.isEmpty()) {
                if (isValidScrolled(i3)) {
                    if (layoutManagerHelper.getOrientation() == 1) {
                        this.mLayoutRegion.offset(0, -i3);
                    } else {
                        this.mLayoutRegion.offset(-i3, 0);
                    }
                }
                int contentWidth = layoutManagerHelper.getContentWidth();
                int contentHeight = layoutManagerHelper.getContentHeight();
                if (layoutManagerHelper.getOrientation() != 1 ? this.mLayoutRegion.intersects((-contentWidth) / 4, 0, contentWidth + (contentWidth / 4), contentHeight) : this.mLayoutRegion.intersects(0, (-contentHeight) / 4, contentWidth, contentHeight + (contentHeight / 4))) {
                    if (this.mLayoutView == null) {
                        this.mLayoutView = layoutManagerHelper.generateLayoutView();
                        layoutManagerHelper.addOffFlowView(this.mLayoutView, true);
                    }
                    if (layoutManagerHelper.getOrientation() == 1) {
                        this.mLayoutRegion.left = layoutManagerHelper.getPaddingLeft() + this.mMarginLeft;
                        this.mLayoutRegion.right = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - this.mMarginRight;
                    } else {
                        this.mLayoutRegion.top = layoutManagerHelper.getPaddingTop() + this.mMarginTop;
                        this.mLayoutRegion.bottom = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingBottom()) - this.mMarginBottom;
                    }
                    bindLayoutView(this.mLayoutView);
                    return;
                }
                this.mLayoutRegion.set(0, 0, 0, 0);
                View view2 = this.mLayoutView;
                if (view2 != null) {
                    view2.layout(0, 0, 0, 0);
                }
            }
        }
        View view3 = this.mLayoutView;
        if (view3 != null) {
            LayoutViewUnBindListener layoutViewUnBindListener = this.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view3, this);
            }
            layoutManagerHelper.removeChildView(this.mLayoutView);
            this.mLayoutView = null;
        }
    }

    public void layoutChild(View view, int i, int i2, int i3, int i4, LayoutManagerHelper layoutManagerHelper, boolean z) {
        layoutManagerHelper.layoutChild(view, i, i2, i3, i4);
        if (requireLayoutView()) {
            if (z) {
                this.mLayoutRegion.union((i - this.mPaddingLeft) - this.mMarginLeft, (i2 - this.mPaddingTop) - this.mMarginTop, i3 + this.mPaddingRight + this.mMarginRight, i4 + this.mPaddingBottom + this.mMarginBottom);
            } else {
                this.mLayoutRegion.union(i - this.mPaddingLeft, i2 - this.mPaddingTop, i3 + this.mPaddingRight, i4 + this.mPaddingBottom);
            }
        }
    }

    public void layoutChildWithMargin(View view, int i, int i2, int i3, int i4, LayoutManagerHelper layoutManagerHelper, boolean z) {
        layoutManagerHelper.layoutChildWithMargins(view, i, i2, i3, i4);
        if (requireLayoutView()) {
            if (z) {
                this.mLayoutRegion.union((i - this.mPaddingLeft) - this.mMarginLeft, (i2 - this.mPaddingTop) - this.mMarginTop, i3 + this.mPaddingRight + this.mMarginRight, i4 + this.mPaddingBottom + this.mMarginBottom);
            } else {
                this.mLayoutRegion.union(i - this.mPaddingLeft, i2 - this.mPaddingTop, i3 + this.mPaddingRight, i4 + this.mPaddingBottom);
            }
        }
    }
}
