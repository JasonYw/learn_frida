package com.alibaba.android.vlayout.layout;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.Range;
import com.alibaba.android.vlayout.layout.BaseLayoutHelper;
import com.alibaba.android.vlayout.layout.RangeStyle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes20.dex */
public class RangeStyle<T extends RangeStyle> {
    public int mBgColor;
    public BaseLayoutHelper mLayoutHelper;
    public View mLayoutView;
    public BaseLayoutHelper.LayoutViewBindListener mLayoutViewBindListener;
    public BaseLayoutHelper.LayoutViewUnBindListener mLayoutViewUnBindListener;
    public int mMarginBottom;
    public int mMarginLeft;
    public int mMarginRight;
    public int mMarginTop;
    public int mOriginEndOffset;
    public int mOriginStartOffset;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public T mParent;
    public Range<Integer> mRange;
    public HashMap<Range<Integer>, T> mChildren = new HashMap<>();
    public Rect mLayoutRegion = new Rect();

    static {
        Covode.recordClassIndex(4400);
    }

    private boolean isValidScrolled(int i) {
        return (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) ? false : true;
    }

    public int getMarginBottom() {
        return this.mMarginBottom;
    }

    public int getMarginLeft() {
        return this.mMarginLeft;
    }

    public int getMarginRight() {
        return this.mMarginRight;
    }

    public int getMarginTop() {
        return this.mMarginTop;
    }

    public int getOriginEndOffset() {
        return this.mOriginEndOffset;
    }

    public int getOriginStartOffset() {
        return this.mOriginStartOffset;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public Range<Integer> getRange() {
        return this.mRange;
    }

    public int getHorizontalMargin() {
        return this.mMarginLeft + this.mMarginRight;
    }

    public int getHorizontalPadding() {
        return this.mPaddingLeft + this.mPaddingRight;
    }

    public int getVerticalMargin() {
        return this.mMarginTop + this.mMarginBottom;
    }

    public int getVerticalPadding() {
        return this.mPaddingTop + this.mPaddingBottom;
    }

    public boolean isChildrenEmpty() {
        return this.mChildren.isEmpty();
    }

    public boolean isRoot() {
        if (this.mParent == null) {
            return true;
        }
        return false;
    }

    public void onClearChildMap() {
        this.mChildren.clear();
    }

    public int getFamilyHorizontalMargin() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyHorizontalMargin();
        } else {
            i = 0;
        }
        return i + getHorizontalMargin();
    }

    public int getFamilyHorizontalPadding() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyHorizontalPadding();
        } else {
            i = 0;
        }
        return i + getHorizontalPadding();
    }

    public int getFamilyMarginBottom() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyMarginBottom();
        } else {
            i = 0;
        }
        return i + this.mMarginBottom;
    }

    public int getFamilyMarginLeft() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyMarginLeft();
        } else {
            i = 0;
        }
        return i + this.mMarginLeft;
    }

    public int getFamilyMarginRight() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyMarginRight();
        } else {
            i = 0;
        }
        return i + this.mMarginRight;
    }

    public int getFamilyMarginTop() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyMarginTop();
        } else {
            i = 0;
        }
        return i + this.mMarginTop;
    }

    public int getFamilyPaddingBottom() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyPaddingBottom();
        } else {
            i = 0;
        }
        return i + this.mPaddingBottom;
    }

    public int getFamilyPaddingLeft() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyPaddingLeft();
        } else {
            i = 0;
        }
        return i + this.mPaddingLeft;
    }

    public int getFamilyPaddingRight() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyPaddingRight();
        } else {
            i = 0;
        }
        return i + this.mPaddingRight;
    }

    public int getFamilyPaddingTop() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyPaddingTop();
        } else {
            i = 0;
        }
        return i + this.mPaddingTop;
    }

    public int getFamilyVerticalMargin() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyVerticalMargin();
        } else {
            i = 0;
        }
        return i + getVerticalMargin();
    }

    public int getFamilyVerticalPadding() {
        int i;
        T t = this.mParent;
        if (t != null) {
            i = t.getFamilyVerticalPadding();
        } else {
            i = 0;
        }
        return i + getVerticalPadding();
    }

    public BaseLayoutHelper getLayoutHelper() {
        BaseLayoutHelper baseLayoutHelper = this.mLayoutHelper;
        if (baseLayoutHelper != null) {
            return baseLayoutHelper;
        }
        T t = this.mParent;
        if (t != null) {
            return t.getLayoutHelper();
        }
        return null;
    }

    public RangeStyle() {
    }

    public int getAncestorHorizontalMargin() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorHorizontalMargin() + this.mParent.getHorizontalMargin();
        }
        return 0;
    }

    public int getAncestorHorizontalPadding() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorHorizontalPadding() + this.mParent.getHorizontalPadding();
        }
        return 0;
    }

    public int getAncestorMarginBottom() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorMarginBottom() + this.mParent.getMarginBottom();
        }
        return 0;
    }

    public int getAncestorMarginLeft() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorMarginLeft() + this.mParent.getMarginLeft();
        }
        return 0;
    }

    public int getAncestorMarginRight() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorMarginRight() + this.mParent.getMarginRight();
        }
        return 0;
    }

    public int getAncestorMarginTop() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorMarginTop() + this.mParent.getMarginTop();
        }
        return 0;
    }

    public int getAncestorPaddingBottom() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorPaddingBottom() + this.mParent.getPaddingBottom();
        }
        return 0;
    }

    public int getAncestorPaddingLeft() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorPaddingLeft() + this.mParent.getPaddingLeft();
        }
        return 0;
    }

    public int getAncestorPaddingRight() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorPaddingRight() + this.mParent.getPaddingRight();
        }
        return 0;
    }

    public int getAncestorPaddingTop() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorPaddingTop() + this.mParent.getPaddingTop();
        }
        return 0;
    }

    public int getAncestorVerticalMargin() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorVerticalMargin() + this.mParent.getVerticalMargin();
        }
        return 0;
    }

    public int getAncestorVerticalPadding() {
        T t = this.mParent;
        if (t != null) {
            return t.getAncestorVerticalPadding() + this.mParent.getVerticalPadding();
        }
        return 0;
    }

    public boolean requireLayoutView() {
        boolean z;
        if (this.mBgColor == 0 && this.mLayoutViewBindListener == null) {
            z = false;
        } else {
            z = true;
        }
        if (!isChildrenEmpty()) {
            return z | requireChildLayoutView(this);
        }
        return z;
    }

    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        clearChild(layoutManagerHelper, this);
    }

    public void setBgColor(int i) {
        this.mBgColor = i;
    }

    public void setLayoutViewBindListener(BaseLayoutHelper.LayoutViewBindListener layoutViewBindListener) {
        this.mLayoutViewBindListener = layoutViewBindListener;
    }

    public void setLayoutViewUnBindListener(BaseLayoutHelper.LayoutViewUnBindListener layoutViewUnBindListener) {
        this.mLayoutViewUnBindListener = layoutViewUnBindListener;
    }

    public void setMarginBottom(int i) {
        this.mMarginBottom = i;
    }

    public void setMarginLeft(int i) {
        this.mMarginLeft = i;
    }

    public void setMarginRight(int i) {
        this.mMarginRight = i;
    }

    public void setMarginTop(int i) {
        this.mMarginTop = i;
    }

    public void setOriginEndOffset(int i) {
        this.mOriginEndOffset = i;
    }

    public void setOriginStartOffset(int i) {
        this.mOriginStartOffset = i;
    }

    public void setPaddingBottom(int i) {
        this.mPaddingBottom = i;
    }

    public void setPaddingLeft(int i) {
        this.mPaddingLeft = i;
    }

    public void setPaddingRight(int i) {
        this.mPaddingRight = i;
    }

    public void setPaddingTop(int i) {
        this.mPaddingTop = i;
    }

    public void setParent(T t) {
        this.mParent = t;
    }

    public void setLayoutViewHelper(BaseLayoutHelper.DefaultLayoutViewHelper defaultLayoutViewHelper) {
        this.mLayoutViewBindListener = defaultLayoutViewHelper;
        this.mLayoutViewUnBindListener = defaultLayoutViewHelper;
    }

    /* loaded from: classes8.dex */
    public static class RangeMap<T> {
        public T[] mCardMap;
        public Class<T> mClass;
        public int lastIndex = -1;
        public int[] mOffsetMap = new int[64];

        static {
            Covode.recordClassIndex(4401);
        }

        public T getChild(int i) {
            return this.mCardMap[this.mOffsetMap[i]];
        }

        public RangeMap(Class<T> cls) {
            this.mCardMap = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mClass, 64));
            this.mClass = cls;
        }

        public void addChild(int i, int i2, T t) {
            int i3 = this.lastIndex + 1;
            T[] tArr = this.mCardMap;
            if (i3 < tArr.length) {
                tArr[i3] = t;
            } else {
                i3 = tArr.length;
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mClass, i3 * 2));
                System.arraycopy(this.mCardMap, 0, tArr2, 0, i3);
                this.mCardMap = tArr2;
                this.mCardMap[i3] = t;
                int[] iArr = this.mOffsetMap;
                int length = iArr.length;
                int[] iArr2 = new int[length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                this.mOffsetMap = iArr2;
            }
            this.lastIndex = i3;
            while (i <= i2) {
                this.mOffsetMap[i] = i3;
                i++;
            }
        }
    }

    private void hideLayoutViews(LayoutManagerHelper layoutManagerHelper) {
        if (isRoot()) {
            hideChildLayoutViews(layoutManagerHelper, this);
            View view = this.mLayoutView;
            if (view != null) {
                layoutManagerHelper.hideView(view);
            }
        }
    }

    public boolean isFirstPosition(int i) {
        Range<Integer> range = this.mRange;
        if (range == null || range.getLower().intValue() != i) {
            return false;
        }
        return true;
    }

    public boolean isLastPosition(int i) {
        Range<Integer> range = this.mRange;
        if (range == null || range.getUpper().intValue() != i) {
            return false;
        }
        return true;
    }

    public boolean isOutOfRange(int i) {
        Range<Integer> range = this.mRange;
        if (range != null && range.contains((Range<Integer>) Integer.valueOf(i))) {
            return false;
        }
        return true;
    }

    public RangeStyle(BaseLayoutHelper baseLayoutHelper) {
        this.mLayoutHelper = baseLayoutHelper;
    }

    private boolean requireChildLayoutView(RangeStyle<T> rangeStyle) {
        boolean z;
        if (rangeStyle.mBgColor == 0 && rangeStyle.mLayoutViewBindListener == null) {
            z = false;
        } else {
            z = true;
        }
        for (Map.Entry<Range<Integer>, T> entry : rangeStyle.mChildren.entrySet()) {
            T value = entry.getValue();
            if (!value.isChildrenEmpty()) {
                z |= requireChildLayoutView(value);
            } else {
                return value.requireLayoutView();
            }
        }
        return z;
    }

    private void unionChildRegion(RangeStyle<T> rangeStyle) {
        if (!rangeStyle.isChildrenEmpty()) {
            for (Map.Entry<Range<Integer>, T> entry : rangeStyle.mChildren.entrySet()) {
                T value = entry.getValue();
                unionChildRegion(value);
                View view = value.mLayoutView;
                if (view != null) {
                    rangeStyle.mLayoutRegion.union(view.getLeft(), value.mLayoutView.getTop(), value.mLayoutView.getRight(), value.mLayoutView.getBottom());
                }
            }
        }
    }

    public void bindLayoutView(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.mLayoutRegion.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mLayoutRegion.height(), 1073741824));
        view.layout(this.mLayoutRegion.left, this.mLayoutRegion.top, this.mLayoutRegion.right, this.mLayoutRegion.bottom);
        view.setBackgroundColor(this.mBgColor);
        BaseLayoutHelper.LayoutViewBindListener layoutViewBindListener = this.mLayoutViewBindListener;
        if (layoutViewBindListener != null) {
            layoutViewBindListener.onBind(view, getLayoutHelper());
        }
        this.mLayoutRegion.set(0, 0, 0, 0);
    }

    private void hideChildLayoutViews(LayoutManagerHelper layoutManagerHelper, RangeStyle<T> rangeStyle) {
        for (Map.Entry<Range<Integer>, T> entry : rangeStyle.mChildren.entrySet()) {
            T value = entry.getValue();
            if (!value.isChildrenEmpty()) {
                hideChildLayoutViews(layoutManagerHelper, value);
            }
            View view = value.mLayoutView;
            if (view != null) {
                layoutManagerHelper.hideView(view);
            }
        }
    }

    private void removeChildViews(LayoutManagerHelper layoutManagerHelper, RangeStyle<T> rangeStyle) {
        if (!rangeStyle.isChildrenEmpty()) {
            for (Map.Entry<Range<Integer>, T> entry : rangeStyle.mChildren.entrySet()) {
                removeChildViews(layoutManagerHelper, entry.getValue());
            }
        }
        View view = rangeStyle.mLayoutView;
        if (view != null) {
            BaseLayoutHelper.LayoutViewUnBindListener layoutViewUnBindListener = rangeStyle.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, getLayoutHelper());
            }
            layoutManagerHelper.removeChildView(rangeStyle.mLayoutView);
            rangeStyle.mLayoutView = null;
        }
    }

    private void clearChild(LayoutManagerHelper layoutManagerHelper, RangeStyle<T> rangeStyle) {
        View view = rangeStyle.mLayoutView;
        if (view != null) {
            BaseLayoutHelper.LayoutViewUnBindListener layoutViewUnBindListener = rangeStyle.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, getLayoutHelper());
            }
            layoutManagerHelper.removeChildView(rangeStyle.mLayoutView);
            rangeStyle.mLayoutView = null;
        }
        if (rangeStyle.mChildren.isEmpty()) {
            return;
        }
        for (Map.Entry<Range<Integer>, T> entry : rangeStyle.mChildren.entrySet()) {
            clearChild(layoutManagerHelper, entry.getValue());
        }
    }

    public void setRange(int i, int i2) {
        this.mRange = Range.create(Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.mChildren.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<Range<Integer>, T> entry : this.mChildren.entrySet()) {
                T value = entry.getValue();
                int originStartOffset = value.getOriginStartOffset() + i;
                int originEndOffset = value.getOriginEndOffset() + i;
                hashMap.put(Range.create(Integer.valueOf(originStartOffset), Integer.valueOf(originEndOffset)), value);
                value.setRange(originStartOffset, originEndOffset);
            }
            this.mChildren.clear();
            this.mChildren.putAll(hashMap);
        }
    }

    public void addChildRangeStyle(int i, int i2, T t) {
        if (i <= i2 && t != null) {
            t.setParent(this);
            t.setOriginStartOffset(i);
            t.setOriginEndOffset(i2);
            t.setRange(i, i2);
            this.mChildren.put(t.getRange(), t);
        }
    }

    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        if (!isChildrenEmpty()) {
            for (Map.Entry<Range<Integer>, T> entry : this.mChildren.entrySet()) {
                entry.getValue().beforeLayout(recycler, state, layoutManagerHelper);
            }
        }
        if (requireLayoutView()) {
            if (this.mLayoutView != null) {
                return;
            }
            return;
        }
        View view = this.mLayoutView;
        if (view != null) {
            BaseLayoutHelper.LayoutViewUnBindListener layoutViewUnBindListener = this.mLayoutViewUnBindListener;
            if (layoutViewUnBindListener != null) {
                layoutViewUnBindListener.onUnbind(view, getLayoutHelper());
            }
            layoutManagerHelper.removeChildView(this.mLayoutView);
            this.mLayoutView = null;
        }
    }

    public void adjustLayout(int i, int i2, LayoutManagerHelper layoutManagerHelper) {
        if (!isChildrenEmpty()) {
            for (Map.Entry<Range<Integer>, T> entry : this.mChildren.entrySet()) {
                entry.getValue().adjustLayout(i, i2, layoutManagerHelper);
            }
        }
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

    public void setMargin(int i, int i2, int i3, int i4) {
        this.mMarginLeft = i;
        this.mMarginTop = i2;
        this.mMarginRight = i3;
        this.mMarginBottom = i4;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingRight = i3;
        this.mPaddingTop = i2;
        this.mPaddingBottom = i4;
    }

    public void fillLayoutRegion(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            this.mLayoutRegion.union((i - this.mPaddingLeft) - this.mMarginLeft, (i2 - this.mPaddingTop) - this.mMarginTop, this.mPaddingRight + i3 + this.mMarginRight, this.mPaddingBottom + i4 + this.mMarginBottom);
        } else {
            this.mLayoutRegion.union(i - this.mPaddingLeft, i2 - this.mPaddingTop, this.mPaddingRight + i3, this.mPaddingBottom + i4);
        }
        T t = this.mParent;
        if (t != null) {
            int i5 = this.mMarginLeft;
            t.fillLayoutRegion((i - this.mPaddingLeft) - i5, (i2 - this.mPaddingTop) - i5, this.mPaddingRight + i3 + this.mMarginRight, this.mPaddingBottom + i4 + this.mMarginBottom, z);
        }
    }

    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        View view;
        if (!isChildrenEmpty()) {
            for (Map.Entry<Range<Integer>, T> entry : this.mChildren.entrySet()) {
                entry.getValue().afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
            }
        }
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
                unionChildRegion(this);
                int contentWidth = layoutManagerHelper.getContentWidth();
                int contentHeight = layoutManagerHelper.getContentHeight();
                if (layoutManagerHelper.getOrientation() != 1 ? this.mLayoutRegion.intersects((-contentWidth) / 4, 0, contentWidth + (contentWidth / 4), contentHeight) : this.mLayoutRegion.intersects(0, (-contentHeight) / 4, contentWidth, contentHeight + (contentHeight / 4))) {
                    if (this.mLayoutView == null) {
                        this.mLayoutView = layoutManagerHelper.generateLayoutView();
                        layoutManagerHelper.addBackgroundView(this.mLayoutView, true);
                    }
                    if (layoutManagerHelper.getOrientation() == 1) {
                        this.mLayoutRegion.left = layoutManagerHelper.getPaddingLeft() + getFamilyMarginLeft() + getAncestorPaddingLeft();
                        this.mLayoutRegion.right = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - getFamilyMarginRight()) - getAncestorPaddingRight();
                    } else {
                        this.mLayoutRegion.top = layoutManagerHelper.getPaddingTop() + getFamilyMarginTop() + getAncestorPaddingTop();
                        this.mLayoutRegion.bottom = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingBottom()) - getFamilyMarginBottom()) - getAncestorPaddingBottom();
                    }
                    bindLayoutView(this.mLayoutView);
                    hideLayoutViews(layoutManagerHelper);
                    return;
                }
                this.mLayoutRegion.set(0, 0, 0, 0);
                View view2 = this.mLayoutView;
                if (view2 != null) {
                    view2.layout(0, 0, 0, 0);
                }
                hideLayoutViews(layoutManagerHelper);
            }
        }
        hideLayoutViews(layoutManagerHelper);
        if (isRoot()) {
            removeChildViews(layoutManagerHelper, this);
        }
    }

    public void layoutChild(View view, int i, int i2, int i3, int i4, LayoutManagerHelper layoutManagerHelper, boolean z) {
        layoutManagerHelper.layoutChildWithMargins(view, i, i2, i3, i4);
        fillLayoutRegion(i, i2, i3, i4, z);
    }
}
