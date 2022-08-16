package com.alibaba.android.vlayout.layout;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class FloatLayoutHelper extends FixAreaLayoutHelper {
    public int mAlignType;
    public boolean mDoNormalHandle;
    public View mFixView;
    public int mTransitionX;
    public int mTransitionY;

    /* renamed from: mX */
    public int f21515mX;

    /* renamed from: mY */
    public int f21516mY;
    public int mZIndex = 1;
    public int mPos = -1;
    public final View.OnTouchListener touchDragListener = new View.OnTouchListener() { // from class: com.alibaba.android.vlayout.layout.FloatLayoutHelper.1
        public int bottomMargin;
        public boolean isDrag;
        public int lastPosX;
        public int lastPosY;
        public int leftMargin;
        public int mTouchSlop;
        public final Rect parentLoction = new Rect();
        public int parentViewHeight;
        public int parentViewWidth;
        public int rightMargin;
        public int topMargin;

        static {
            Covode.recordClassIndex(4389);
        }

        private void doPullOverAnimation(View view) {
            ObjectAnimator ofFloat;
            if (view.getTranslationX() + (view.getWidth() / 2) + view.getLeft() > this.parentViewWidth / 2) {
                ofFloat = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), (((this.parentViewWidth - view.getWidth()) - view.getLeft()) - this.rightMargin) - FloatLayoutHelper.this.mAdjuster.right);
                FloatLayoutHelper.this.mTransitionX = (((this.parentViewWidth - view.getWidth()) - view.getLeft()) - this.rightMargin) - FloatLayoutHelper.this.mAdjuster.right;
            } else {
                ofFloat = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), (-view.getLeft()) + this.leftMargin + FloatLayoutHelper.this.mAdjuster.left);
                FloatLayoutHelper.this.mTransitionX = (-view.getLeft()) + this.leftMargin + FloatLayoutHelper.this.mAdjuster.left;
            }
            FloatLayoutHelper.this.mTransitionY = (int) view.getTranslationY();
            ofFloat.setDuration(200L);
            ofFloat.start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
            if (r3 != 3) goto L13;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.FloatLayoutHelper.View$OnTouchListenerC10181.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    };
    public boolean dragEnable = true;

    static {
        Covode.recordClassIndex(4388);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public boolean requireLayoutView() {
        return false;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setBgColor(int i) {
    }

    public boolean shouldBeDraw(int i, int i2) {
        return true;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public View getFixedView() {
        return this.mFixView;
    }

    public void setAlignType(int i) {
        this.mAlignType = i;
    }

    public void setX(int i) {
        this.f21515mX = i;
    }

    public void setY(int i) {
        this.f21516mY = i;
    }

    public void setDragEnable(boolean z) {
        View.OnTouchListener onTouchListener;
        this.dragEnable = z;
        View view = this.mFixView;
        if (view != null) {
            if (z) {
                onTouchListener = this.touchDragListener;
            } else {
                onTouchListener = null;
            }
            view.setOnTouchListener(onTouchListener);
        }
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
            view.setOnTouchListener(null);
            layoutManagerHelper.removeChildView(this.mFixView);
            layoutManagerHelper.recycleView(this.mFixView);
            this.mFixView = null;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mPos = i;
    }

    public void setDefaultLocation(int i, int i2) {
        this.f21515mX = i;
        this.f21516mY = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doMeasureAndLayout(android.view.View r15, com.alibaba.android.vlayout.LayoutManagerHelper r16) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.FloatLayoutHelper.doMeasureAndLayout(android.view.View, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        super.beforeLayout(recycler, state, layoutManagerHelper);
        View view = this.mFixView;
        if (view != null && layoutManagerHelper.isViewHolderUpdated(view)) {
            layoutManagerHelper.removeChildView(this.mFixView);
            layoutManagerHelper.recycleView(this.mFixView);
            this.mFixView.setOnTouchListener(null);
            this.mFixView = null;
        }
        this.mDoNormalHandle = false;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
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
        layoutManagerHelper.getChildViewHolder(view).setIsRecyclable(false);
        this.mDoNormalHandle = state.isPreLayout();
        if (this.mDoNormalHandle) {
            layoutManagerHelper.addChildView(layoutStateWrapper, view);
        }
        this.mFixView = view;
        this.mFixView.setClickable(true);
        doMeasureAndLayout(view, layoutManagerHelper);
        layoutChunkResult.mConsumed = 0;
        layoutChunkResult.mIgnoreConsumed = true;
        handleStateOnResult(layoutChunkResult, view);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        super.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
        if (this.mPos < 0) {
            return;
        }
        if (this.mDoNormalHandle) {
            this.mFixView = null;
        } else if (shouldBeDraw(i, i2)) {
            View view = this.mFixView;
            if (view != null) {
                if (view.getParent() == null) {
                    layoutManagerHelper.addFixedView(this.mFixView);
                    if (this.dragEnable) {
                        this.mFixView.setOnTouchListener(this.touchDragListener);
                    }
                    this.mFixView.setTranslationX(this.mTransitionX);
                    this.mFixView.setTranslationY(this.mTransitionY);
                    return;
                }
                layoutManagerHelper.showView(this.mFixView);
                if (this.dragEnable) {
                    this.mFixView.setOnTouchListener(this.touchDragListener);
                }
                layoutManagerHelper.addFixedView(this.mFixView);
                return;
            }
            this.mFixView = recycler.getViewForPosition(this.mPos);
            layoutManagerHelper.getChildViewHolder(this.mFixView).setIsRecyclable(false);
            doMeasureAndLayout(this.mFixView, layoutManagerHelper);
            layoutManagerHelper.addFixedView(this.mFixView);
            this.mFixView.setTranslationX(this.mTransitionX);
            this.mFixView.setTranslationY(this.mTransitionY);
            if (this.dragEnable) {
                this.mFixView.setOnTouchListener(this.touchDragListener);
            }
        }
    }
}
