package com.alibaba.android.vlayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface LayoutManagerHelper {
    static {
        Covode.recordClassIndex(4341);
    }

    void addBackgroundView(View view, boolean z);

    void addChildView(View view, int i);

    void addChildView(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, View view);

    void addChildView(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, View view, int i);

    void addFixedView(View view);

    void addOffFlowView(View view, boolean z);

    int findFirstVisibleItemPosition();

    int findLastVisibleItemPosition();

    LayoutHelper findLayoutHelperByPosition(int i);

    View findViewByPosition(int i);

    View generateLayoutView();

    View getChildAt(int i);

    int getChildCount();

    int getChildMeasureSpec(int i, int i2, boolean z);

    RecyclerView.ViewHolder getChildViewHolder(View view);

    int getContentHeight();

    int getContentWidth();

    int getDecoratedBottom(View view);

    int getDecoratedLeft(View view);

    int getDecoratedRight(View view);

    int getDecoratedTop(View view);

    OrientationHelperEx getMainOrientationHelper();

    int getOrientation();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    int getPosition(View view);

    RecyclerView getRecyclerView();

    boolean getReverseLayout();

    OrientationHelperEx getSecondaryOrientationHelper();

    void hideView(View view);

    boolean isDoLayoutRTL();

    boolean isEnableMarginOverLap();

    boolean isViewHolderUpdated(View view);

    void layoutChild(View view, int i, int i2, int i3, int i4);

    void layoutChildWithMargins(View view, int i, int i2, int i3, int i4);

    void measureChild(View view, int i, int i2);

    void measureChildWithMargins(View view, int i, int i2);

    void recycleView(View view);

    void removeChildView(View view);

    void showView(View view);
}
