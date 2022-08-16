package com.alibaba.android.vlayout.layout;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* loaded from: classes20.dex */
public class GridLayoutHelper extends BaseLayoutHelper {
    public static boolean DEBUG;
    public static final int MAIN_DIR_SPEC = View.MeasureSpec.makeMeasureSpec(0, 0);
    public int mHGap;
    public boolean mIgnoreExtra;
    public boolean mIsAutoExpand;
    public boolean mLayoutWithAnchor;
    public View[] mSet;
    public int mSizePerSpan;
    public int[] mSpanCols;
    public int mSpanCount;
    public int[] mSpanIndices;
    public SpanSizeLookup mSpanSizeLookup;
    public int mTotalSize;
    public int mVGap;
    public float[] mWeights;

    /* loaded from: classes20.dex */
    public static abstract class SpanSizeLookup {
        public final SparseIntArray mSpanIndexCache = new SparseIntArray();
        public boolean mCacheSpanIndices = false;
        public int mStartPosition = 0;

        static {
            Covode.recordClassIndex(4392);
        }

        public abstract int getSpanSize(int i);

        public int getStartPosition() {
            return this.mStartPosition;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            this.mCacheSpanIndices = z;
        }

        public void setStartPosition(int i) {
            this.mStartPosition = i;
        }

        public int findReferenceIndexFromCache(int i) {
            int size = this.mSpanIndexCache.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.mSpanIndexCache.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < this.mSpanIndexCache.size()) {
                return this.mSpanIndexCache.keyAt(i4);
            }
            return -1;
        }

        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int spanSize = getSpanSize(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int spanSize2 = getSpanSize(i5);
                i3 += spanSize2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = spanSize2;
                }
            }
            if (i3 + spanSize > i2) {
                return i4 + 1;
            }
            return i4;
        }

        public int getSpanIndex(int i, int i2) {
            int i3;
            int findReferenceIndexFromCache;
            int spanSize = getSpanSize(i);
            if (spanSize == i2) {
                return 0;
            }
            int i4 = this.mStartPosition;
            if (this.mCacheSpanIndices && this.mSpanIndexCache.size() > 0 && (findReferenceIndexFromCache = findReferenceIndexFromCache(i)) >= 0) {
                i3 = this.mSpanIndexCache.get(findReferenceIndexFromCache) + getSpanSize(findReferenceIndexFromCache);
                i4 = findReferenceIndexFromCache + 1;
            } else {
                i3 = 0;
            }
            while (i4 < i) {
                int spanSize2 = getSpanSize(i4);
                i3 += spanSize2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = spanSize2;
                }
                i4++;
            }
            if (spanSize + i3 > i2) {
                return 0;
            }
            return i3;
        }
    }

    public int getHGap() {
        return this.mHGap;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public int getVGap() {
        return this.mVGap;
    }

    static {
        Covode.recordClassIndex(4390);
    }

    private void ensureSpanCount() {
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

    public void setAutoExpand(boolean z) {
        this.mIsAutoExpand = z;
    }

    public void setIgnoreExtra(boolean z) {
        this.mIgnoreExtra = z;
    }

    public GridLayoutHelper(int i) {
        this(i, -1, -1);
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

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onItemsChanged(LayoutManagerHelper layoutManagerHelper) {
        super.onItemsChanged(layoutManagerHelper);
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
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

    /* loaded from: classes20.dex */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        static {
            Covode.recordClassIndex(4391);
        }

        @Override // com.alibaba.android.vlayout.layout.GridLayoutHelper.SpanSizeLookup
        public final int getSpanSize(int i) {
            return 1;
        }

        @Override // com.alibaba.android.vlayout.layout.GridLayoutHelper.SpanSizeLookup
        public final int getSpanIndex(int i, int i2) {
            return (i - this.mStartPosition) % i2;
        }
    }

    public GridLayoutHelper(int i, int i2) {
        this(i, i2, 0);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mSpanSizeLookup.setStartPosition(i);
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public GridLayoutHelper(int i, int i2, int i3) {
        this(i, i2, i3, i3);
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            int cachedSpanIndex = this.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, this.mSpanCount);
            if (anchorInfoWrapper.layoutFromEnd) {
                while (cachedSpanIndex < this.mSpanCount - 1 && anchorInfoWrapper.position < getRange().getUpper().intValue()) {
                    anchorInfoWrapper.position++;
                    cachedSpanIndex = this.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, this.mSpanCount);
                }
            } else {
                while (cachedSpanIndex > 0 && anchorInfoWrapper.position > 0) {
                    anchorInfoWrapper.position--;
                    cachedSpanIndex = this.mSpanSizeLookup.getCachedSpanIndex(anchorInfoWrapper.position, this.mSpanCount);
                }
            }
            this.mLayoutWithAnchor = true;
        }
    }

    public GridLayoutHelper(int i, int i2, int i3, int i4) {
        this.mSpanCount = 4;
        this.mIsAutoExpand = true;
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mVGap = 0;
        this.mHGap = 0;
        this.mWeights = new float[0];
        this.mLayoutWithAnchor = false;
        setSpanCount(i);
        this.mSpanSizeLookup.setSpanIndexCacheEnabled(true);
        setItemCount(i2);
        setVGap(i3);
        setHGap(i4);
    }

    private int getMainDirSpec(int i, int i2, int i3, float f) {
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(this.mAspectRatio) && this.mAspectRatio > 0.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i2 / this.mAspectRatio) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return MAIN_DIR_SPEC;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
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
                if (z3) {
                    return this.mMarginBottom + this.mPaddingBottom;
                }
                return this.mMarginRight + this.mPaddingRight;
            }
        } else if (i == 0) {
            if (z3) {
                return (-this.mMarginTop) - this.mPaddingTop;
            }
            return (-this.mMarginLeft) - this.mPaddingLeft;
        }
        return super.computeAlignOffset(i, z, z2, layoutManagerHelper);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0249, code lost:
        r32.mSizePerSpan = (r32.mTotalSize - ((r3 - 1) * r32.mHGap)) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
        r0 = r32.mWeights;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0256, code lost:
        if (r0 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0259, code lost:
        if (r0.length <= 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025b, code lost:
        if (r9 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025d, code lost:
        r2 = r32.mTotalSize;
        r1 = r3 - 1;
        r0 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0263, code lost:
        r2 = r2 - (r1 * r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0265, code lost:
        if (r6 <= 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0269, code lost:
        if (r32.mIsAutoExpand == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026b, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026c, code lost:
        r8 = r2;
        r5 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026f, code lost:
        if (r5 >= r4) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0271, code lost:
        r1 = r32.mWeights;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0274, code lost:
        if (r5 >= r1.length) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027c, code lost:
        if (java.lang.Float.isNaN(r1[r5]) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027e, code lost:
        r6 = r32.mWeights;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0285, code lost:
        if (r6[r5] < 0.0f) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0287, code lost:
        r6 = r6[r5];
        r1 = r32.mSpanCols;
        r1[r5] = (int) ((((r6 * 1.0f) / 100.0f) * r2) + 0.5f);
        r8 = r8 - r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029d, code lost:
        r7 = r7 + 1;
        r32.mSpanCols[r5] = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e0, code lost:
        if (r7 <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02e2, code lost:
        r8 = r8 / r7;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e4, code lost:
        if (r2 >= r4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e6, code lost:
        r1 = r32.mSpanCols;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ea, code lost:
        if (r1[r2] >= 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ec, code lost:
        r1[r2] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ee, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f4, code lost:
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f6, code lost:
        r5 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f8, code lost:
        if (r5 >= r3) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fa, code lost:
        r4 = r32.mSet[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02fe, code lost:
        if (r29 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0300, code lost:
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0301, code lost:
        r37.addChildView(r35, r4, r1);
        r7 = getSpanSize(r33, r34, r37.getPosition(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x030e, code lost:
        if (r17 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0310, code lost:
        r15 = r32.mSpanIndices[r5];
        r1 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0316, code lost:
        if (r6 >= r7) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0318, code lost:
        r1 = r1 + r32.mSpanCols[r6 + r15];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x033c, code lost:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, r1), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0347, code lost:
        r0 = (com.alibaba.android.vlayout.VirtualLayoutManager.LayoutParams) r4.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0352, code lost:
        if (r37.getOrientation() != 1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0354, code lost:
        r37.measureChildWithMargins(r4, r7, getMainDirSpec(r0.height, r32.mTotalSize, android.view.View.MeasureSpec.getSize(r7), r0.mAspectRatio));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0365, code lost:
        r0 = r10.getDecoratedMeasurement(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0369, code lost:
        if (r0 <= r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x036b, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x036c, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x036f, code lost:
        r37.measureChildWithMargins(r4, getMainDirSpec(r0.width, r32.mTotalSize, android.view.View.MeasureSpec.getSize(r7), r0.mAspectRatio), android.view.View.MeasureSpec.getSize(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0322, code lost:
        r6 = r32.mSizePerSpan * r7;
        r1 = java.lang.Math.max(0, r7 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x032c, code lost:
        if (r9 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032e, code lost:
        r0 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0330, code lost:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r6 + (r1 * r0), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0339, code lost:
        r0 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0385, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0388, code lost:
        r6 = getMainDirSpec(r2, r32.mTotalSize, 0, Float.NaN);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0392, code lost:
        if (r5 >= r3) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0394, code lost:
        r4 = r32.mSet[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x039c, code lost:
        if (r10.getDecoratedMeasurement(r4) == r2) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x039e, code lost:
        r8 = getSpanSize(r33, r34, r37.getPosition(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03a6, code lost:
        if (r17 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03a8, code lost:
        r16 = r32.mSpanIndices[r5];
        r7 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ae, code lost:
        if (r7 >= r8) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03b0, code lost:
        r1 = r1 + r32.mSpanCols[r7 + r16];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03d4, code lost:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, r1), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03e6, code lost:
        if (r37.getOrientation() != 1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e8, code lost:
        r37.measureChildWithMargins(r4, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03eb, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ee, code lost:
        r37.measureChildWithMargins(r4, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ba, code lost:
        r7 = r32.mSizePerSpan * r8;
        r1 = java.lang.Math.max(0, r8 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03c4, code lost:
        if (r9 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03c6, code lost:
        r0 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03c8, code lost:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7 + (r1 * r0), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03d1, code lost:
        r0 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03f2, code lost:
        if (r19 == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03f4, code lost:
        r4 = true;
        r6 = computeStartSpace(r37, r9, !r37.getReverseLayout(), r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0400, code lost:
        if (r18 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0402, code lost:
        r5 = computeEndSpace(r37, r9, r37.getReverseLayout() ^ r4, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x040d, code lost:
        r36.mConsumed = (r2 + r6) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0419, code lost:
        if (r35.getLayoutDirection() != (-1)) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x041b, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x041e, code lost:
        if (r32.mLayoutWithAnchor != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0420, code lost:
        if (r18 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0422, code lost:
        if (r1 != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0424, code lost:
        if (r19 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0426, code lost:
        if (r1 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0428, code lost:
        r1 = r36.mConsumed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x042a, code lost:
        if (r9 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x042c, code lost:
        r0 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x042e, code lost:
        r36.mConsumed = r1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x053f, code lost:
        r0 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0431, code lost:
        if (r9 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0438, code lost:
        if (r35.getLayoutDirection() != (-1)) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x043a, code lost:
        r23 = r35.getOffset() - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0442, code lost:
        if (r32.mLayoutWithAnchor != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0444, code lost:
        if (r18 != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0446, code lost:
        r0 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0448, code lost:
        r23 = r23 - r0;
        r5 = r23 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x044c, code lost:
        r22 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x044f, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0450, code lost:
        if (r2 >= r3) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0452, code lost:
        r7 = r32.mSet[r2];
        r8 = r32.mSpanIndices[r2];
        r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0460, code lost:
        if (r9 == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0462, code lost:
        if (r17 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0464, code lost:
        r6 = (r37.getPaddingLeft() + r32.mMarginLeft) + r32.mPaddingLeft;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x046f, code lost:
        if (r14 >= r8) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0471, code lost:
        r6 = r6 + (r32.mSpanCols[r14] + r32.mHGap);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04c1, code lost:
        r22 = r10.getDecoratedMeasurementInOther(r7) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04c7, code lost:
        layoutChildWithMargin(r7, r6, r5, r22, r23, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04d8, code lost:
        if (r1.isItemRemoved() != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04de, code lost:
        if (r1.isItemChanged() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04e3, code lost:
        r36.mFocusable |= r7.isFocusable();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04e0, code lost:
        r36.mIgnoreConsumed = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04af, code lost:
        r6 = (((r37.getPaddingLeft() + r32.mMarginLeft) + r32.mPaddingLeft) + (r32.mSizePerSpan * r8)) + (r8 * r32.mHGap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x047c, code lost:
        if (r17 == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x047e, code lost:
        r5 = (r37.getPaddingTop() + r32.mMarginTop) + r32.mPaddingTop;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0489, code lost:
        if (r14 >= r8) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x048b, code lost:
        r5 = r5 + (r32.mSpanCols[r14] + r32.mVGap);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04a8, code lost:
        r23 = r10.getDecoratedMeasurementInOther(r7) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0496, code lost:
        r5 = (((r37.getPaddingTop() + r32.mMarginTop) + r32.mPaddingTop) + (r32.mSizePerSpan * r8)) + (r8 * r32.mVGap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x054d, code lost:
        r32.mLayoutWithAnchor = false;
        java.util.Arrays.fill(r32.mSet, (java.lang.Object) null);
        java.util.Arrays.fill(r32.mSpanIndices, 0);
        java.util.Arrays.fill(r32.mSpanCols, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0560, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04f0, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04f3, code lost:
        r1 = r35.getOffset() + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04fa, code lost:
        if (r32.mLayoutWithAnchor != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04fc, code lost:
        if (r19 != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04fe, code lost:
        r5 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0500, code lost:
        r5 = r5 + r1;
        r23 = r2 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0506, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x050d, code lost:
        if (r35.getLayoutDirection() != (-1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x050f, code lost:
        r22 = r35.getOffset() - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0517, code lost:
        if (r32.mLayoutWithAnchor != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0519, code lost:
        if (r18 != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x051b, code lost:
        r0 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x051d, code lost:
        r22 = r22 - r0;
        r6 = r22 - r2;
        r5 = 0;
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0526, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0528, code lost:
        r1 = r35.getOffset() + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x052f, code lost:
        if (r32.mLayoutWithAnchor != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0531, code lost:
        if (r19 != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0533, code lost:
        r6 = r32.mHGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0535, code lost:
        r6 = r6 + r1;
        r22 = r2 + r6;
        r23 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x053d, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0543, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0546, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0549, code lost:
        r4 = true;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02a5, code lost:
        r4 = r32.mSpanCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02a8, code lost:
        r2 = r32.mTotalSize;
        r1 = r3 - 1;
        r0 = r32.mVGap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02f1, code lost:
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02af, code lost:
        r32.mSizePerSpan = (r32.mTotalSize - ((r3 - 1) * r32.mVGap)) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02bb, code lost:
        if (r29 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02bd, code lost:
        if (r6 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02bf, code lost:
        if (r3 != r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02c3, code lost:
        if (r32.mIsAutoExpand == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02c5, code lost:
        if (r9 == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02c7, code lost:
        r32.mSizePerSpan = (r32.mTotalSize - ((r3 - 1) * r32.mHGap)) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02d3, code lost:
        r32.mSizePerSpan = (r32.mTotalSize - ((r3 - 1) * r32.mVGap)) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e4, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0230, code lost:
        assignSpans(r33, r34, r3, r2, r29, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023f, code lost:
        if (r6 <= 0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0241, code lost:
        if (r3 != r2) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0245, code lost:
        if (r32.mIsAutoExpand == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0247, code lost:
        if (r9 == false) goto L274;
     */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutViews(androidx.recyclerview.widget.RecyclerView.Recycler r33, androidx.recyclerview.widget.RecyclerView.State r34, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r35, com.alibaba.android.vlayout.layout.LayoutChunkResult r36, com.alibaba.android.vlayout.LayoutManagerHelper r37) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.GridLayoutHelper.layoutViews(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.layout.LayoutChunkResult, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, LayoutManagerHelper layoutManagerHelper) {
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
            int spanSize = getSpanSize(recycler, state, layoutManagerHelper.getPosition(this.mSet[i3]));
            if (i5 == -1 && spanSize > 1) {
                this.mSpanIndices[i3] = i6 - (spanSize - 1);
            } else {
                this.mSpanIndices[i3] = i6;
            }
            i6 += spanSize * i5;
            i3 += i4;
        }
    }
}
