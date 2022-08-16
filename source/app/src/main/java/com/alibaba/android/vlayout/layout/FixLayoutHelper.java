package com.alibaba.android.vlayout.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class FixLayoutHelper extends FixAreaLayoutHelper {
    public boolean isAddFixViewImmediately;
    public boolean isRemoveFixViewImmediately;
    public int mAlignType;
    public boolean mDoNormalHandle;
    public View mFixView;
    public FixViewAppearAnimatorListener mFixViewAppearAnimatorListener;
    public FixViewDisappearAnimatorListener mFixViewDisappearAnimatorListener;
    public int mPos;
    public boolean mShouldDrawn;
    public boolean mSketchMeasure;

    /* renamed from: mX */
    public int f21513mX;

    /* renamed from: mY */
    public int f21514mY;

    static {
        Covode.recordClassIndex(4384);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public boolean requireLayoutView() {
        return false;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper
    public void setMargin(int i, int i2, int i3, int i4) {
    }

    public boolean shouldBeDraw(LayoutManagerHelper layoutManagerHelper, int i, int i2, int i3) {
        return true;
    }

    /* loaded from: classes20.dex */
    public static class FixViewAppearAnimatorListener extends AnimatorListenerAdapter {
        public View mFixView;
        public LayoutManagerHelper mLayoutManagerHelper;

        static {
            Covode.recordClassIndex(4386);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        public FixViewAppearAnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.mFixView.setVisibility(0);
        }

        public void bindAction(LayoutManagerHelper layoutManagerHelper, View view) {
            this.mLayoutManagerHelper = layoutManagerHelper;
            this.mFixView = view;
        }
    }

    /* loaded from: classes20.dex */
    public static class FixViewDisappearAnimatorListener extends AnimatorListenerAdapter {
        public boolean isAnimating;
        public Runnable mEndAction;
        public View mFixView;
        public LayoutManagerHelper mLayoutManagerHelper;
        public RecyclerView.Recycler mRecycler;

        static {
            Covode.recordClassIndex(4387);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public FixViewDisappearAnimatorListener() {
        }

        public boolean isAnimating() {
            return this.isAnimating;
        }

        public void withEndAction(Runnable runnable) {
            this.mEndAction = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.mLayoutManagerHelper.removeChildView(this.mFixView);
            this.mRecycler.recycleView(this.mFixView);
            this.isAnimating = false;
            Runnable runnable = this.mEndAction;
            if (runnable != null) {
                runnable.run();
                this.mEndAction = null;
            }
        }

        public void bindAction(RecyclerView.Recycler recycler, LayoutManagerHelper layoutManagerHelper, View view) {
            this.isAnimating = true;
            this.mRecycler = recycler;
            this.mLayoutManagerHelper = layoutManagerHelper;
            this.mFixView = view;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public View getFixedView() {
        return this.mFixView;
    }

    public void setAlignType(int i) {
        this.mAlignType = i;
    }

    public void setSketchMeasure(boolean z) {
        this.mSketchMeasure = z;
    }

    public void setX(int i) {
        this.f21513mX = i;
    }

    public void setY(int i) {
        this.f21514mY = i;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void setItemCount(int i) {
        if (i > 0) {
            super.setItemCount(1);
        } else {
            super.setItemCount(0);
        }
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
        View view = this.mFixView;
        if (view != null) {
            layoutManagerHelper.removeChildView(view);
            layoutManagerHelper.recycleView(this.mFixView);
            this.mFixView.animate().cancel();
            this.mFixView = null;
            this.isAddFixViewImmediately = false;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mPos = i;
    }

    public FixLayoutHelper(int i, int i2) {
        this(0, i, i2);
    }

    public void addFixViewWithAnimator(LayoutManagerHelper layoutManagerHelper, View view) {
        if (this.mFixViewAnimatorHelper != null) {
            ViewPropertyAnimator onGetFixViewAppearAnimator = this.mFixViewAnimatorHelper.onGetFixViewAppearAnimator(view);
            if (onGetFixViewAppearAnimator != null) {
                view.setVisibility(4);
                layoutManagerHelper.addFixedView(view);
                this.mFixViewAppearAnimatorListener.bindAction(layoutManagerHelper, view);
                onGetFixViewAppearAnimator.setListener(this.mFixViewAppearAnimatorListener).start();
            } else {
                layoutManagerHelper.addFixedView(view);
            }
        } else {
            layoutManagerHelper.addFixedView(view);
        }
        this.isRemoveFixViewImmediately = false;
    }

    public void doMeasureAndLayout(View view, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int contentWidth;
        float size;
        float f;
        int paddingLeft;
        int paddingTop;
        int decoratedMeasurement;
        int i;
        int decoratedMeasurementInOther;
        int i2;
        int contentHeight;
        int measuredHeight;
        int i3;
        int contentHeight2;
        float size2;
        float f2;
        if (view != null && layoutManagerHelper != null) {
            VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
            OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
            if (layoutManagerHelper.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = -1;
            int i5 = -2;
            if (z) {
                int contentWidth2 = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight();
                if (layoutParams.width >= 0) {
                    i4 = layoutParams.width;
                } else if (!this.mSketchMeasure) {
                    i4 = -2;
                }
                int childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(contentWidth2, i4, false);
                if (!Float.isNaN(layoutParams.mAspectRatio) && layoutParams.mAspectRatio > 0.0f) {
                    contentHeight2 = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                    size2 = View.MeasureSpec.getSize(childMeasureSpec);
                    f2 = layoutParams.mAspectRatio;
                } else if (!Float.isNaN(this.mAspectRatio) && this.mAspectRatio > 0.0f) {
                    contentHeight2 = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                    size2 = View.MeasureSpec.getSize(childMeasureSpec);
                    f2 = this.mAspectRatio;
                } else {
                    contentHeight2 = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                    if (layoutParams.height >= 0) {
                        i5 = layoutParams.height;
                    }
                    layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(contentHeight2, i5, false));
                }
                i5 = (int) ((size2 / f2) + 0.5f);
                layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(contentHeight2, i5, false));
            } else {
                int contentHeight3 = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                if (layoutParams.height >= 0) {
                    i4 = layoutParams.height;
                } else if (!this.mSketchMeasure) {
                    i4 = -2;
                }
                int childMeasureSpec2 = layoutManagerHelper.getChildMeasureSpec(contentHeight3, i4, false);
                if (!Float.isNaN(layoutParams.mAspectRatio) && layoutParams.mAspectRatio > 0.0f) {
                    contentWidth = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight();
                    size = View.MeasureSpec.getSize(childMeasureSpec2);
                    f = layoutParams.mAspectRatio;
                } else if (!Float.isNaN(this.mAspectRatio) && this.mAspectRatio > 0.0f) {
                    contentWidth = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight();
                    size = View.MeasureSpec.getSize(childMeasureSpec2);
                    f = this.mAspectRatio;
                } else {
                    contentWidth = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight();
                    if (layoutParams.width >= 0) {
                        i5 = layoutParams.width;
                    }
                    layoutManagerHelper.measureChildWithMargins(view, layoutManagerHelper.getChildMeasureSpec(contentWidth, i5, false), childMeasureSpec2);
                }
                i5 = (int) ((size * f) + 0.5f);
                layoutManagerHelper.measureChildWithMargins(view, layoutManagerHelper.getChildMeasureSpec(contentWidth, i5, false), childMeasureSpec2);
            }
            int i6 = this.mAlignType;
            if (i6 == 1) {
                i2 = layoutManagerHelper.getPaddingTop() + this.f21514mY + this.mAdjuster.top;
                i = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - this.f21513mX) - this.mAdjuster.right;
                paddingLeft = ((i - layoutParams.leftMargin) - layoutParams.rightMargin) - view.getMeasuredWidth();
                paddingTop = layoutParams.topMargin + i2 + layoutParams.bottomMargin;
                decoratedMeasurementInOther = view.getMeasuredHeight();
            } else {
                if (i6 == 2) {
                    paddingLeft = layoutManagerHelper.getPaddingLeft() + this.f21513mX + this.mAdjuster.left;
                    contentHeight = ((layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingBottom()) - this.f21514mY) - this.mAdjuster.bottom;
                    i = layoutParams.leftMargin + paddingLeft + layoutParams.rightMargin + view.getMeasuredWidth();
                    measuredHeight = (contentHeight - view.getMeasuredHeight()) - layoutParams.topMargin;
                    i3 = layoutParams.bottomMargin;
                } else if (i6 == 3) {
                    i = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - this.f21513mX) - this.mAdjuster.right;
                    contentHeight = ((layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingBottom()) - this.f21514mY) - this.mAdjuster.bottom;
                    paddingLeft = ((i - layoutParams.leftMargin) - layoutParams.rightMargin) - view.getMeasuredWidth();
                    measuredHeight = (contentHeight - view.getMeasuredHeight()) - layoutParams.topMargin;
                    i3 = layoutParams.bottomMargin;
                } else {
                    paddingLeft = this.mAdjuster.left + layoutManagerHelper.getPaddingLeft() + this.f21513mX;
                    paddingTop = layoutManagerHelper.getPaddingTop() + this.f21514mY + this.mAdjuster.top;
                    if (z) {
                        decoratedMeasurement = mainOrientationHelper.getDecoratedMeasurementInOther(view);
                    } else {
                        decoratedMeasurement = mainOrientationHelper.getDecoratedMeasurement(view);
                    }
                    i = decoratedMeasurement + paddingLeft;
                    if (z) {
                        decoratedMeasurementInOther = mainOrientationHelper.getDecoratedMeasurement(view);
                    } else {
                        decoratedMeasurementInOther = mainOrientationHelper.getDecoratedMeasurementInOther(view);
                    }
                    i2 = paddingTop;
                }
                i2 = measuredHeight - i3;
                layoutChildWithMargin(view, paddingLeft, i2, i, contentHeight, layoutManagerHelper);
            }
            contentHeight = paddingTop + decoratedMeasurementInOther;
            layoutChildWithMargin(view, paddingLeft, i2, i, contentHeight, layoutManagerHelper);
        }
    }

    public FixLayoutHelper(int i, int i2, int i3) {
        this.mPos = -1;
        this.mShouldDrawn = true;
        this.isRemoveFixViewImmediately = true;
        this.mFixViewAppearAnimatorListener = new FixViewAppearAnimatorListener();
        this.mFixViewDisappearAnimatorListener = new FixViewDisappearAnimatorListener();
        this.mAlignType = i;
        this.f21513mX = i2;
        this.f21514mY = i3;
        setItemCount(1);
    }

    private void removeFixViewWithAnimator(RecyclerView.Recycler recycler, LayoutManagerHelper layoutManagerHelper, View view) {
        if (!this.isRemoveFixViewImmediately && this.mFixViewAnimatorHelper != null) {
            ViewPropertyAnimator onGetFixViewDisappearAnimator = this.mFixViewAnimatorHelper.onGetFixViewDisappearAnimator(view);
            if (onGetFixViewDisappearAnimator != null) {
                this.mFixViewDisappearAnimatorListener.bindAction(recycler, layoutManagerHelper, view);
                onGetFixViewDisappearAnimator.setListener(this.mFixViewDisappearAnimatorListener).start();
                this.isAddFixViewImmediately = false;
                return;
            }
            layoutManagerHelper.removeChildView(view);
            recycler.recycleView(view);
            this.isAddFixViewImmediately = false;
            return;
        }
        layoutManagerHelper.removeChildView(view);
        recycler.recycleView(view);
        this.isAddFixViewImmediately = false;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        super.beforeLayout(recycler, state, layoutManagerHelper);
        View view = this.mFixView;
        if (view != null && layoutManagerHelper.isViewHolderUpdated(view)) {
            layoutManagerHelper.removeChildView(this.mFixView);
            recycler.recycleView(this.mFixView);
            this.mFixView = null;
            this.isAddFixViewImmediately = true;
        }
        this.mDoNormalHandle = false;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
            return;
        }
        if (!this.mShouldDrawn) {
            layoutStateWrapper.skipCurrentPosition();
            return;
        }
        View view = this.mFixView;
        if (view == null) {
            view = layoutStateWrapper.next(recycler);
        } else {
            layoutStateWrapper.skipCurrentPosition();
        }
        if (view == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        this.mDoNormalHandle = state.isPreLayout();
        if (this.mDoNormalHandle) {
            layoutManagerHelper.addChildView(layoutStateWrapper, view);
        }
        this.mFixView = view;
        doMeasureAndLayout(view, layoutManagerHelper);
        layoutChunkResult.mConsumed = 0;
        layoutChunkResult.mIgnoreConsumed = true;
        handleStateOnResult(layoutChunkResult, view);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(final RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, final LayoutManagerHelper layoutManagerHelper) {
        super.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
        if (this.mPos < 0) {
            return;
        }
        if (this.mDoNormalHandle && state.isPreLayout()) {
            View view = this.mFixView;
            if (view != null) {
                layoutManagerHelper.removeChildView(view);
                recycler.recycleView(this.mFixView);
                this.isAddFixViewImmediately = false;
            }
            this.mFixView = null;
        } else if (shouldBeDraw(layoutManagerHelper, i, i2, i3)) {
            this.mShouldDrawn = true;
            View view2 = this.mFixView;
            if (view2 != null) {
                if (view2.getParent() == null) {
                    addFixViewWithAnimator(layoutManagerHelper, this.mFixView);
                    return;
                }
                layoutManagerHelper.addFixedView(this.mFixView);
                this.isRemoveFixViewImmediately = false;
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.alibaba.android.vlayout.layout.FixLayoutHelper.1
                static {
                    Covode.recordClassIndex(4385);
                }

                @Override // java.lang.Runnable
                public void run() {
                    FixLayoutHelper fixLayoutHelper = FixLayoutHelper.this;
                    fixLayoutHelper.mFixView = recycler.getViewForPosition(fixLayoutHelper.mPos);
                    FixLayoutHelper fixLayoutHelper2 = FixLayoutHelper.this;
                    fixLayoutHelper2.doMeasureAndLayout(fixLayoutHelper2.mFixView, layoutManagerHelper);
                    if (FixLayoutHelper.this.isAddFixViewImmediately) {
                        layoutManagerHelper.addFixedView(FixLayoutHelper.this.mFixView);
                        FixLayoutHelper.this.isRemoveFixViewImmediately = false;
                        return;
                    }
                    FixLayoutHelper fixLayoutHelper3 = FixLayoutHelper.this;
                    fixLayoutHelper3.addFixViewWithAnimator(layoutManagerHelper, fixLayoutHelper3.mFixView);
                }
            };
            if (this.mFixViewDisappearAnimatorListener.isAnimating()) {
                this.mFixViewDisappearAnimatorListener.withEndAction(runnable);
            } else {
                runnable.run();
            }
        } else {
            this.mShouldDrawn = false;
            View view3 = this.mFixView;
            if (view3 != null) {
                removeFixViewWithAnimator(recycler, layoutManagerHelper, view3);
                this.mFixView = null;
            }
        }
    }
}
