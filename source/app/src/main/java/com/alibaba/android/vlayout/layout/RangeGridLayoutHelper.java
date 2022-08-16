package com.alibaba.android.vlayout.layout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.Range;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.alibaba.android.vlayout.layout.BaseLayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes20.dex */
public class RangeGridLayoutHelper extends BaseLayoutHelper {
    public static boolean DEBUG;
    public static final int MAIN_DIR_SPEC = View.MeasureSpec.makeMeasureSpec(0, 0);
    public boolean mLayoutWithAnchor;
    public GridRangeStyle mRangeStyle;
    public int mTotalSize;

    /* loaded from: classes20.dex */
    public static class GridRangeStyle extends RangeStyle<GridRangeStyle> {
        public float mAspectRatio;
        public int mHGap;
        public boolean mIgnoreExtra;
        public boolean mIsAutoExpand;
        public View[] mSet;
        public int mSizePerSpan;
        public int[] mSpanCols;
        public int mSpanCount;
        public int[] mSpanIndices;
        public GridLayoutHelper.SpanSizeLookup mSpanSizeLookup;
        public int mVGap;
        public float[] mWeights;

        static {
            Covode.recordClassIndex(4399);
        }

        public float getAspectRatio() {
            return this.mAspectRatio;
        }

        public int getSpanCount() {
            return this.mSpanCount;
        }

        public GridRangeStyle() {
            this.mAspectRatio = Float.NaN;
            this.mSpanCount = 4;
            this.mIsAutoExpand = true;
            this.mSpanSizeLookup = new GridLayoutHelper.DefaultSpanSizeLookup();
            this.mVGap = 0;
            this.mHGap = 0;
            this.mWeights = new float[0];
            this.mSpanSizeLookup.setSpanIndexCacheEnabled(true);
        }

        public void ensureSpanCount() {
            View[] viewArr = this.mSet;
            if (viewArr == null || viewArr.length != this.mSpanCount) {
                this.mSet = new View[this.mSpanCount];
            }
            int[] iArr = this.mSpanIndices;
            if (iArr == null || iArr.length != this.mSpanCount) {
                this.mSpanIndices = new int[this.mSpanCount];
            }
            int[] iArr2 = this.mSpanCols;
            if (iArr2 == null || iArr2.length != this.mSpanCount) {
                this.mSpanCols = new int[this.mSpanCount];
            }
        }

        public void onInvalidateSpanIndexCache() {
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            for (Map.Entry entry : this.mChildren.entrySet()) {
                ((GridRangeStyle) entry.getValue()).onInvalidateSpanIndexCache();
            }
        }

        public void setAspectRatio(float f) {
            this.mAspectRatio = f;
        }

        public void setAutoExpand(boolean z) {
            this.mIsAutoExpand = z;
        }

        public void setIgnoreExtra(boolean z) {
            this.mIgnoreExtra = z;
        }

        public GridRangeStyle findRangeStyleByPosition(int i) {
            return findRangeStyle(this, i);
        }

        public void setGap(int i) {
            setVGap(i);
            setHGap(i);
        }

        public void setHGap(int i) {
            if (i < 0) {
                i = 0;
            }
            this.mHGap = i;
        }

        public void setVGap(int i) {
            if (i < 0) {
                i = 0;
            }
            this.mVGap = i;
        }

        public void setSpanSizeLookup(GridLayoutHelper.SpanSizeLookup spanSizeLookup) {
            if (spanSizeLookup != null) {
                spanSizeLookup.setStartPosition(this.mSpanSizeLookup.getStartPosition());
                this.mSpanSizeLookup = spanSizeLookup;
            }
        }

        public void setWeights(float[] fArr) {
            if (fArr != null) {
                this.mWeights = Arrays.copyOf(fArr, fArr.length);
            } else {
                this.mWeights = new float[0];
            }
        }

        public GridRangeStyle findSiblingStyleByPosition(int i) {
            if (this.mParent != 0) {
                for (Map.Entry entry : this.mParent.mChildren.entrySet()) {
                    if (((Range) entry.getKey()).contains((Range) Integer.valueOf(i))) {
                        GridRangeStyle gridRangeStyle = (GridRangeStyle) entry.getValue();
                        if (!gridRangeStyle.equals(this)) {
                            return gridRangeStyle;
                        }
                        return null;
                    }
                }
                return null;
            }
            return null;
        }

        public void setSpanCount(int i) {
            if (i == this.mSpanCount) {
                return;
            }
            if (i > 0) {
                this.mSpanCount = i;
                this.mSpanSizeLookup.invalidateSpanIndexCache();
                ensureSpanCount();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }

        public GridRangeStyle(RangeGridLayoutHelper rangeGridLayoutHelper) {
            super(rangeGridLayoutHelper);
            this.mAspectRatio = Float.NaN;
            this.mSpanCount = 4;
            this.mIsAutoExpand = true;
            this.mSpanSizeLookup = new GridLayoutHelper.DefaultSpanSizeLookup();
            this.mVGap = 0;
            this.mHGap = 0;
            this.mWeights = new float[0];
            this.mSpanSizeLookup.setSpanIndexCacheEnabled(true);
        }

        @Override // com.alibaba.android.vlayout.layout.RangeStyle
        public void setRange(int i, int i2) {
            super.setRange(i, i2);
            this.mSpanSizeLookup.setStartPosition(i);
            this.mSpanSizeLookup.invalidateSpanIndexCache();
        }

        private GridRangeStyle findRangeStyle(GridRangeStyle gridRangeStyle, int i) {
            GridRangeStyle gridRangeStyle2;
            while (true) {
                for (Map.Entry entry : gridRangeStyle.mChildren.entrySet()) {
                    gridRangeStyle2 = (GridRangeStyle) entry.getValue();
                    Range range = (Range) entry.getKey();
                    if (!gridRangeStyle2.isChildrenEmpty()) {
                        break;
                    } else if (range.contains((Range) Integer.valueOf(i))) {
                        return gridRangeStyle2;
                    }
                }
                return gridRangeStyle;
                gridRangeStyle = gridRangeStyle2;
            }
        }

        public static int computeEndAlignOffset(GridRangeStyle gridRangeStyle, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            if (z) {
                i = gridRangeStyle.mMarginBottom;
                i2 = gridRangeStyle.mPaddingBottom;
            } else {
                i = gridRangeStyle.mMarginRight;
                i2 = gridRangeStyle.mPaddingRight;
            }
            int i5 = i + i2;
            int intValue = gridRangeStyle.getRange().getUpper().intValue();
            for (Map.Entry entry : gridRangeStyle.mChildren.entrySet()) {
                GridRangeStyle gridRangeStyle2 = (GridRangeStyle) entry.getValue();
                if (!gridRangeStyle2.isChildrenEmpty()) {
                    i5 += computeEndAlignOffset(gridRangeStyle2, z);
                } else if (gridRangeStyle2.mRange.getUpper().intValue() == intValue) {
                    if (z) {
                        i3 = gridRangeStyle2.mMarginBottom;
                        i4 = gridRangeStyle2.mPaddingBottom;
                    } else {
                        i3 = gridRangeStyle2.mMarginRight;
                        i4 = gridRangeStyle2.mPaddingRight;
                    }
                    return i5 + i3 + i4;
                }
            }
            return i5;
        }

        public static int computeStartAlignOffset(GridRangeStyle gridRangeStyle, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            if (z) {
                i = -gridRangeStyle.mMarginTop;
                i2 = gridRangeStyle.mPaddingTop;
            } else {
                i = -gridRangeStyle.mMarginLeft;
                i2 = gridRangeStyle.mPaddingLeft;
            }
            int i5 = i - i2;
            int intValue = gridRangeStyle.getRange().getLower().intValue();
            for (Map.Entry entry : gridRangeStyle.mChildren.entrySet()) {
                GridRangeStyle gridRangeStyle2 = (GridRangeStyle) entry.getValue();
                if (!gridRangeStyle2.isChildrenEmpty()) {
                    i5 += computeStartAlignOffset(gridRangeStyle2, z);
                } else if (gridRangeStyle2.mRange.getLower().intValue() == intValue) {
                    if (z) {
                        i3 = -gridRangeStyle2.mMarginTop;
                        i4 = gridRangeStyle2.mPaddingTop;
                    } else {
                        i3 = -gridRangeStyle2.mMarginLeft;
                        i4 = gridRangeStyle2.mPaddingLeft;
                    }
                    return i5 + (i3 - i4);
                }
            }
            return i5;
        }
    }

    public GridRangeStyle getRootRangeStyle() {
        return this.mRangeStyle;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public float getAspectRatio() {
        return this.mRangeStyle.getAspectRatio();
    }

    public int getSpanCount() {
        return this.mRangeStyle.getSpanCount();
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public boolean requireLayoutView() {
        return this.mRangeStyle.requireLayoutView();
    }

    static {
        Covode.recordClassIndex(4398);
    }

    public RangeGridLayoutHelper(int i) {
        this(i, -1, -1);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setAspectRatio(float f) {
        this.mRangeStyle.setAspectRatio(f);
    }

    public void setAutoExpand(boolean z) {
        this.mRangeStyle.setAutoExpand(z);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setBgColor(int i) {
        this.mRangeStyle.setBgColor(i);
    }

    public void setGap(int i) {
        setVGap(i);
        setHGap(i);
    }

    public void setHGap(int i) {
        this.mRangeStyle.setHGap(i);
    }

    public void setIgnoreExtra(boolean z) {
        this.mRangeStyle.setIgnoreExtra(z);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setLayoutViewBindListener(BaseLayoutHelper.LayoutViewBindListener layoutViewBindListener) {
        this.mRangeStyle.setLayoutViewBindListener(layoutViewBindListener);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setLayoutViewHelper(BaseLayoutHelper.DefaultLayoutViewHelper defaultLayoutViewHelper) {
        this.mRangeStyle.setLayoutViewHelper(defaultLayoutViewHelper);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void setLayoutViewUnBindListener(BaseLayoutHelper.LayoutViewUnBindListener layoutViewUnBindListener) {
        this.mRangeStyle.setLayoutViewUnBindListener(layoutViewUnBindListener);
    }

    public void setSpanCount(int i) {
        this.mRangeStyle.setSpanCount(i);
    }

    public void setSpanSizeLookup(GridLayoutHelper.SpanSizeLookup spanSizeLookup) {
        this.mRangeStyle.setSpanSizeLookup(spanSizeLookup);
    }

    public void setVGap(int i) {
        this.mRangeStyle.setVGap(i);
    }

    public void setWeights(float[] fArr) {
        this.mRangeStyle.setWeights(fArr);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
        this.mRangeStyle.onClear(layoutManagerHelper);
        this.mRangeStyle.onInvalidateSpanIndexCache();
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onItemsChanged(LayoutManagerHelper layoutManagerHelper) {
        super.onItemsChanged(layoutManagerHelper);
        this.mRangeStyle.onInvalidateSpanIndexCache();
    }

    public int getBorderEndSpace(LayoutManagerHelper layoutManagerHelper) {
        int familyMarginRight;
        int familyPaddingRight;
        GridRangeStyle findRangeStyleByPosition = this.mRangeStyle.findRangeStyleByPosition(getRange().getUpper().intValue());
        if (layoutManagerHelper.getOrientation() == 1) {
            familyMarginRight = findRangeStyleByPosition.getFamilyMarginBottom();
            familyPaddingRight = findRangeStyleByPosition.getFamilyPaddingBottom();
        } else {
            familyMarginRight = findRangeStyleByPosition.getFamilyMarginRight();
            familyPaddingRight = findRangeStyleByPosition.getFamilyPaddingRight();
        }
        return familyMarginRight + familyPaddingRight;
    }

    public int getBorderStartSpace(LayoutManagerHelper layoutManagerHelper) {
        int familyMarginLeft;
        int familyPaddingLeft;
        GridRangeStyle findRangeStyleByPosition = this.mRangeStyle.findRangeStyleByPosition(getRange().getLower().intValue());
        if (layoutManagerHelper.getOrientation() == 1) {
            familyMarginLeft = findRangeStyleByPosition.getFamilyMarginTop();
            familyPaddingLeft = findRangeStyleByPosition.getFamilyPaddingTop();
        } else {
            familyMarginLeft = findRangeStyleByPosition.getFamilyMarginLeft();
            familyPaddingLeft = findRangeStyleByPosition.getFamilyPaddingLeft();
        }
        return familyMarginLeft + familyPaddingLeft;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mRangeStyle.setRange(i, i2);
    }

    public RangeGridLayoutHelper(int i, int i2) {
        this(i, i2, 0);
    }

    public RangeGridLayoutHelper(int i, int i2, int i3) {
        this(i, i2, i3, i3);
    }

    public void addRangeStyle(int i, int i2, GridRangeStyle gridRangeStyle) {
        this.mRangeStyle.addChildRangeStyle(i, i2, gridRangeStyle);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void adjustLayout(int i, int i2, LayoutManagerHelper layoutManagerHelper) {
        this.mRangeStyle.adjustLayout(i, i2, layoutManagerHelper);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        this.mRangeStyle.beforeLayout(recycler, state, layoutManagerHelper);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        if (state.getItemCount() > 0) {
            GridRangeStyle findRangeStyleByPosition = this.mRangeStyle.findRangeStyleByPosition(anchorInfoWrapper.position);
            int cachedSpanIndex = findRangeStyleByPosition.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, findRangeStyleByPosition.mSpanCount);
            if (anchorInfoWrapper.layoutFromEnd) {
                while (cachedSpanIndex < findRangeStyleByPosition.mSpanCount - 1 && anchorInfoWrapper.position < getRange().getUpper().intValue()) {
                    anchorInfoWrapper.position++;
                    cachedSpanIndex = findRangeStyleByPosition.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, findRangeStyleByPosition.mSpanCount);
                }
            } else {
                while (cachedSpanIndex > 0 && anchorInfoWrapper.position > 0) {
                    anchorInfoWrapper.position--;
                    cachedSpanIndex = findRangeStyleByPosition.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, findRangeStyleByPosition.mSpanCount);
                }
            }
            this.mLayoutWithAnchor = true;
        }
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper
    public void setMargin(int i, int i2, int i3, int i4) {
        super.setMargin(i, i2, i3, i4);
        this.mRangeStyle.setMargin(i, i2, i3, i4);
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.mRangeStyle.setPadding(i, i2, i3, i4);
    }

    public RangeGridLayoutHelper(int i, int i2, int i3, int i4) {
        this.mRangeStyle = new GridRangeStyle(this);
        this.mRangeStyle.setSpanCount(i);
        this.mRangeStyle.setVGap(i3);
        this.mRangeStyle.setHGap(i4);
        setItemCount(i2);
    }

    private int getSpanSize(GridLayoutHelper.SpanSizeLookup spanSizeLookup, RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return spanSizeLookup.getSpanSize(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return spanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        boolean z3;
        if (layoutManagerHelper.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (i == getItemCount() - 1) {
                return GridRangeStyle.computeEndAlignOffset(this.mRangeStyle, z3);
            }
        } else if (i == 0) {
            return GridRangeStyle.computeStartAlignOffset(this.mRangeStyle, z3);
        }
        return super.computeAlignOffset(i, z, z2, layoutManagerHelper);
    }

    private int getSpanIndex(GridLayoutHelper.SpanSizeLookup spanSizeLookup, int i, RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.isPreLayout()) {
            return spanSizeLookup.getCachedSpanIndex(i2, i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return spanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, i);
    }

    private int getMainDirSpec(GridRangeStyle gridRangeStyle, int i, int i2, int i3, float f) {
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(gridRangeStyle.mAspectRatio) && gridRangeStyle.mAspectRatio > 0.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i2 / gridRangeStyle.mAspectRatio) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return MAIN_DIR_SPEC;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0266, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01de, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0206, code lost:
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0228, code lost:
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
        r22 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutViews(androidx.recyclerview.widget.RecyclerView.Recycler r34, androidx.recyclerview.widget.RecyclerView.State r35, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r36, com.alibaba.android.vlayout.layout.LayoutChunkResult r37, com.alibaba.android.vlayout.LayoutManagerHelper r38) {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.RangeGridLayoutHelper.layoutViews(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.layout.LayoutChunkResult, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        this.mRangeStyle.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
    }

    private void assignSpans(GridRangeStyle gridRangeStyle, RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, LayoutManagerHelper layoutManagerHelper) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (z) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i - 1;
            i = -1;
            i4 = -1;
        }
        if (layoutManagerHelper.getOrientation() == 1 && layoutManagerHelper.isDoLayoutRTL()) {
            i6 = i2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
        }
        while (i3 != i) {
            int spanSize = getSpanSize(gridRangeStyle.mSpanSizeLookup, recycler, state, layoutManagerHelper.getPosition(gridRangeStyle.mSet[i3]));
            if (i5 == -1 && spanSize > 1) {
                gridRangeStyle.mSpanIndices[i3] = i6 - (spanSize - 1);
            } else {
                gridRangeStyle.mSpanIndices[i3] = i6;
            }
            i6 += spanSize * i5;
            i3 += i4;
        }
    }
}
