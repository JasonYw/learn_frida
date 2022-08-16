package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.C137833cne;
import p003X.C138269cum;
import p003X.C138389cwj;

/* loaded from: classes17.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    static {
        Covode.recordClassIndex(638);
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    @Override // android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    public LayoutParams mo25200generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.mBaselineAlignedChildIndex == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.mBaselineChildTop;
            if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                }
            }
            return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    /* loaded from: classes17.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;
        public float weight;

        static {
            Covode.recordClassIndex(639);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997, 16843137});
            this.weight = obtainStyledAttributes.getFloat(3, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public LayoutParams mo25201generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public LayoutParams mo25202generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & 1) == 0) {
                return false;
            }
            return true;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        boolean z = false;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean LIZ = C137833cne.LIZ(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (LIZ) {
                    left2 = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                if (LIZ) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.mDividerWidth;
                    right = left - i;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (LIZ) {
                    left = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x024d, code lost:
        if (r12.width == (-1)) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03da, code lost:
        if (r14 < 0) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mGravity = 8388659;
        C138269cum LIZ = C138269cum.LIZ(context, attributeSet, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, 2130772930, 2130772939, 2130773761, 2130774403}, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, 2130772930, 2130772939, 2130773761, 2130774403}, attributeSet, LIZ.LIZ, i, 0);
        int LIZ2 = LIZ.LIZ(1, -1);
        if (LIZ2 >= 0) {
            setOrientation(LIZ2);
        }
        int LIZ3 = LIZ.LIZ(0, -1);
        if (LIZ3 >= 0) {
            setGravity(LIZ3);
        }
        boolean LIZ4 = LIZ.LIZ(2, true);
        if (!LIZ4) {
            setBaselineAligned(LIZ4);
        }
        this.mWeightSum = LIZ.LIZ(4, -1.0f);
        this.mBaselineAlignedChildIndex = LIZ.LIZ(3, -1);
        this.mUseLargestChild = LIZ.LIZ(7, false);
        setDividerDrawable(LIZ.LIZ(5));
        this.mShowDividers = LIZ.LIZ(8, 0);
        this.mDividerPadding = LIZ.m21664LJ(6, 0);
        LIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r3 = r17
            int r10 = r17.getPaddingLeft()
            int r20 = r20 - r18
            int r0 = r17.getPaddingRight()
            int r9 = r20 - r0
            int r20 = r20 - r10
            int r0 = r17.getPaddingRight()
            int r20 = r20 - r0
            int r4 = r17.getVirtualChildCount()
            int r2 = r3.mGravity
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r0
            r0 = 16
            if (r1 == r0) goto Lb5
            r0 = 80
            if (r1 == r0) goto La8
            int r1 = r17.getPaddingTop()
        L2e:
            r0 = 0
            r5 = 0
        L30:
            if (r5 >= r4) goto Lc4
            android.view.View r12 = r3.getVirtualChildAt(r5)
            r8 = 1
            if (r12 != 0) goto L41
            int r0 = r3.measureNullChild(r5)
            int r1 = r1 + r0
        L3e:
            r0 = 1
            int r5 = r5 + r0
            goto L30
        L41:
            int r6 = r12.getVisibility()
            r0 = 8
            if (r6 == r0) goto L3e
            int r15 = r12.getMeasuredWidth()
            int r16 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r12.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L5c
            r7 = r2
        L5c:
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r17)
            int r0 = p003X.C138389cwj.LIZ(r7, r0)
            r7 = r0 & 7
            if (r7 == r8) goto L97
            r0 = 5
            if (r7 == r0) goto La2
            int r13 = r6.leftMargin
            int r13 = r13 + r10
        L6e:
            boolean r0 = r3.hasDividerBeforeChildAt(r5)
            if (r0 == 0) goto L77
            int r0 = r3.mDividerHeight
            int r1 = r1 + r0
        L77:
            int r0 = r6.topMargin
            int r1 = r1 + r0
            int r0 = r3.getLocationOffset(r12)
            int r14 = r1 + r0
            r11 = r17
            r11.setChildFrame(r12, r13, r14, r15, r16)
            int r0 = r6.bottomMargin
            int r16 = r16 + r0
            int r0 = r3.getNextLocationOffset(r12)
            int r16 = r16 + r0
            int r1 = r1 + r16
            int r0 = r3.getChildrenSkipCount(r12, r5)
            int r5 = r5 + r0
            goto L3e
        L97:
            int r0 = r20 - r15
            int r13 = r0 / 2
            int r13 = r13 + r10
            int r0 = r6.leftMargin
            int r13 = r13 + r0
            int r0 = r6.rightMargin
            goto La6
        La2:
            int r13 = r9 - r15
            int r0 = r6.rightMargin
        La6:
            int r13 = r13 - r0
            goto L6e
        La8:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r21
            int r1 = r1 - r19
            int r0 = r3.mTotalLength
            int r1 = r1 - r0
            goto L2e
        Lb5:
            int r1 = r17.getPaddingTop()
            int r21 = r21 - r19
            int r0 = r3.mTotalLength
            int r21 = r21 - r0
            int r0 = r21 / 2
            int r1 = r1 + r0
            goto L2e
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean LIZ = C137833cne.LIZ(this);
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.mGravity;
        int i11 = i10 & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int LIZ2 = C138389cwj.LIZ(8388615 & i10, ViewCompat.getLayoutDirection(this));
        if (LIZ2 != 1) {
            if (LIZ2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        }
        if (LIZ) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i12 = 0;
        while (i12 < virtualChildCount) {
            int i13 = i5 + (i6 * i12);
            View virtualChildAt = getVirtualChildAt(i13);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i13);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (z && layoutParams.height != -1) {
                    i7 = virtualChildAt.getBaseline();
                } else {
                    i7 = -1;
                }
                int i14 = layoutParams.gravity;
                if (i14 < 0) {
                    i14 = i11;
                }
                int i15 = i14 & 112;
                if (i15 != 16) {
                    if (i15 != 48) {
                        if (i15 != 80) {
                            i8 = paddingTop;
                        } else {
                            i8 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                            if (i7 != -1) {
                                i8 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - i7);
                            }
                        }
                    } else {
                        i8 = layoutParams.topMargin + paddingTop;
                        if (i7 != -1) {
                            i8 += iArr[1] - i7;
                        }
                    }
                } else {
                    i8 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                }
                if (hasDividerBeforeChildAt(i13)) {
                    paddingLeft += this.mDividerWidth;
                }
                int i16 = layoutParams.leftMargin + paddingLeft;
                setChildFrame(virtualChildAt, i16 + getLocationOffset(virtualChildAt), i8, measuredWidth, measuredHeight);
                i12 += getChildrenSkipCount(virtualChildAt, i13);
                paddingLeft = i16 + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(virtualChildAt);
                i12++;
            }
            i12++;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
