package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.C0228j;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import p003X.C146214ezI;
import p003X.C146239ezh;
import p003X.C146245ezn;
import p003X.C146248ezq;
import p003X.C146251ezt;
import p003X.C146254ezw;

/* loaded from: classes19.dex */
public class ConstraintLayout extends ViewGroup {
    public static final String VERSION = "ConstraintLayout-1.1.3";
    public C146254ezw mMetrics;
    public SparseArray<View> mChildrenByIds = new SparseArray<>();
    public ArrayList<AbstractC0230a> mConstraintHelpers = new ArrayList<>(4);
    public final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>(100);
    public C146245ezn mLayoutWidget = new C146245ezn();
    public int mMinWidth = 0;
    public int mMinHeight = 0;
    public int mMaxWidth = Integer.MAX_VALUE;
    public int mMaxHeight = Integer.MAX_VALUE;
    public boolean mDirtyHierarchy = true;
    public int mOptimizationLevel = 7;
    public C146239ezh mConstraintSet = null;
    public int mConstraintSetId = -1;
    public HashMap<String, Integer> mDesignIds = new HashMap<>();
    public int mLastMeasureWidth = -1;
    public int mLastMeasureHeight = -1;
    public int mLastMeasureWidthSize = -1;
    public int mLastMeasureHeightSize = -1;
    public int mLastMeasureWidthMode = 0;
    public int mLastMeasureHeightMode = 0;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(846);
        } else {
            Covode.recordClassIndex(846);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    /* loaded from: classes19.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        public int dimensionRatioSide;
        public float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        public boolean horizontalDimensionFixed;
        public float horizontalWeight;
        public boolean isGuideline;
        public boolean isHelper;
        public boolean isInPlaceholder;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public boolean needsBaseline;
        public int orientation;
        public int resolveGoneLeftMargin;
        public int resolveGoneRightMargin;
        public int resolvedGuideBegin;
        public int resolvedGuideEnd;
        public float resolvedGuidePercent;
        public float resolvedHorizontalBias;
        public int resolvedLeftToLeft;
        public int resolvedLeftToRight;
        public int resolvedRightToLeft;
        public int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public boolean verticalDimensionFixed;
        public float verticalWeight;
        public ConstraintWidget widget;

        static {
            Covode.recordClassIndex(847);
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.LJFF();
            }
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof C146248ezq)) {
                    this.widget = new C146248ezq();
                }
                ((C146248ezq) this.widget).LJII(this.orientation);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.widget = layoutParams.widget;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r8) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, 2130771969, 2130771970, 2130771971, 2130771973, 2130771974, 2130771975, 2130771976, 2130771977, 2130771978, 2130771979, 2130771980, 2130771981, 2130771982, 2130771984, 2130771985, 2130771986, 2130771988, 2130771989, 2130771990, 2130772038, 2130772042, 2130772045, 2130772055, 2130772056, 2130772057, 2130772296, 2130772551, 2130772783, 2130773497, 2130773498, 2130773499, 2130773500, 2130773501, 2130773502, 2130773503, 2130773504, 2130773505, 2130773506, 2130773507, 2130773508, 2130773509, 2130773510, 2130773511, 2130773512, 2130773513, 2130773514, 2130773521, 2130773522, 2130773526, 2130773527, 2130773528, 2130773529, 2130773530, 2130773531, 2130773554});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C146214ezI.LIZ.get(index);
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        this.circleConstraint = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        if (this.circleConstraint == -1) {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        float f = this.circleAngle;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        this.leftToLeft = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        if (this.leftToLeft == -1) {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.leftToRight = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        if (this.leftToRight == -1) {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        this.rightToLeft = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        if (this.rightToLeft == -1) {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        this.rightToRight = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        if (this.rightToRight == -1) {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.topToTop = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        if (this.topToTop == -1) {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        this.topToBottom = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        if (this.topToBottom == -1) {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        this.bottomToTop = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        if (this.bottomToTop == -1) {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.bottomToBottom = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        if (this.bottomToBottom == -1) {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        this.baselineToBaseline = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        if (this.baselineToBaseline == -1) {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        this.startToEnd = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        if (this.startToEnd == -1) {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        this.startToStart = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        if (this.startToStart == -1) {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        this.endToStart = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        if (this.endToStart == -1) {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        this.endToEnd = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        if (this.endToEnd == -1) {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.matchConstraintDefaultWidth;
                        break;
                    case 32:
                        this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                        int i5 = this.matchConstraintDefaultHeight;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        break;
                    default:
                        switch (i3) {
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                this.dimensionRatio = obtainStyledAttributes.getString(index);
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                String str = this.dimensionRatio;
                                if (str != null) {
                                    int length = str.length();
                                    int indexOf = this.dimensionRatio.indexOf(44);
                                    if (indexOf > 0 && indexOf < length - 1) {
                                        String substring = this.dimensionRatio.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = indexOf + 1;
                                    } else {
                                        i = 0;
                                    }
                                    int indexOf2 = this.dimensionRatio.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.dimensionRatio.substring(i, indexOf2);
                                        String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.dimensionRatioSide == 1) {
                                                        this.dimensionRatioValue = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.dimensionRatioValue = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.dimensionRatio.substring(i);
                                        if (substring4.length() > 0) {
                                            this.dimensionRatioValue = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                continue;
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                continue;
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                continue;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.LJLIIL;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private void updateHierarchy() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                this.mVariableDimensionsWidgets.clear();
                setChildrenConstraints();
                return;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt;
                if (placeholder.LIZIZ != null) {
                    LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                    LayoutParams layoutParams2 = (LayoutParams) placeholder.LIZIZ.getLayoutParams();
                    layoutParams2.widget.LJJJLIIL = 0;
                    layoutParams.widget.LIZJ(layoutParams2.widget.LJIIJ());
                    layoutParams.widget.LIZLLL(layoutParams2.widget.LJIIJJI());
                    layoutParams2.widget.LJJJLIIL = 8;
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            do {
                this.mConstraintHelpers.get(i);
                i++;
            } while (i < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setChildrenConstraints() {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setChildrenConstraints():void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C146239ezh c146239ezh) {
        this.mConstraintSet = c146239ezh;
    }

    public void fillMetrics(C146254ezw c146254ezw) {
        this.mMetrics = c146254ezw;
        C146245ezn c146245ezn = this.mLayoutWidget;
        C146251ezt.LJII = c146254ezw;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        int i = Build.VERSION.SDK_INT;
    }

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.LJLIIL = i;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void solveLinearSystem(String str) {
        this.mLayoutWidget.LJJII();
        C146254ezw c146254ezw = this.mMetrics;
        if (c146254ezw != null) {
            c146254ezw.LIZJ++;
        }
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null) {
            view = findViewById(i);
            if (view != null) {
                if (view != this && view.getParent() == this) {
                    onViewAdded(view);
                }
            } else {
                return null;
            }
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            return ((LayoutParams) view.getLayoutParams()).widget;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.LIZ(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C146248ezq)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.widget = new C146248ezq();
            layoutParams.isGuideline = true;
            ((C146248ezq) layoutParams.widget).LJII(layoutParams.orientation);
        }
        if (view instanceof AbstractC0230a) {
            AbstractC0230a abstractC0230a = (AbstractC0230a) view;
            abstractC0230a.LIZIZ();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(abstractC0230a)) {
                this.mConstraintHelpers.add(abstractC0230a);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas2.drawLine(f, f2, f3, f2, paint);
                        float f4 = i3 + ((int) ((parseInt4 / 1920.0f) * height));
                        canvas2.drawLine(f3, f2, f3, f4, paint);
                        canvas2.drawLine(f3, f4, f, f4, paint);
                        canvas2.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas2.drawLine(f, f2, f3, f4, paint);
                        canvas2 = canvas2;
                        canvas2.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    private void init(AttributeSet attributeSet) {
        this.mLayoutWidget.LJJJJZI = this;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, 2130771969, 2130771970, 2130771971, 2130771973, 2130771974, 2130771975, 2130771976, 2130771977, 2130771978, 2130771979, 2130771980, 2130771981, 2130771982, 2130771984, 2130771985, 2130771986, 2130771988, 2130771989, 2130771990, 2130772038, 2130772042, 2130772045, 2130772055, 2130772056, 2130772057, 2130772296, 2130772551, 2130772783, 2130773497, 2130773498, 2130773499, 2130773500, 2130773501, 2130773502, 2130773503, 2130773504, 2130773505, 2130773506, 2130773507, 2130773508, 2130773509, 2130773510, 2130773511, 2130773512, 2130773513, 2130773514, 2130773521, 2130773522, 2130773526, 2130773527, 2130773528, 2130773529, 2130773530, 2130773531, 2130773554});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 4) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 2) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 59) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 32) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.mConstraintSet = new C146239ezh();
                        this.mConstraintSet.LIZ(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.LJLIIL = this.mOptimizationLevel;
    }

    public Object getDesignInformation(int i, Object obj) {
        HashMap<String, Integer> hashMap;
        if (i == 0 && (obj instanceof String) && (hashMap = this.mDesignIds) != null && hashMap.containsKey(obj)) {
            return this.mDesignIds.get(obj);
        }
        return null;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    private void internalMeasureChildren(int i, int i2) {
        boolean z;
        int childMeasureSpec;
        int childMeasureSpec2;
        int baseline;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.widget;
                if (!layoutParams.isGuideline && !layoutParams.isHelper) {
                    constraintWidget.LJJJLIIL = childAt.getVisibility();
                    int i4 = layoutParams.width;
                    int i5 = layoutParams.height;
                    boolean z2 = true;
                    if (layoutParams.horizontalDimensionFixed || layoutParams.verticalDimensionFixed || ((!layoutParams.horizontalDimensionFixed && layoutParams.matchConstraintDefaultWidth == 1) || layoutParams.width == -1 || (!layoutParams.verticalDimensionFixed && (layoutParams.matchConstraintDefaultHeight == 1 || layoutParams.height == -1)))) {
                        if (i4 == 0) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else if (i4 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -1);
                            z = false;
                        } else {
                            if (i4 == -2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i4);
                        }
                        if (i5 == 0) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                        } else if (i5 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -1);
                            z2 = false;
                        } else {
                            if (i5 != -2) {
                                z2 = false;
                            }
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i5);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        C146254ezw c146254ezw = this.mMetrics;
                        if (c146254ezw != null) {
                            c146254ezw.LIZ++;
                        }
                        i4 = childAt.getMeasuredWidth();
                        i5 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    constraintWidget.LIZJ(i4);
                    constraintWidget.LIZLLL(i5);
                    if (z) {
                        constraintWidget.LJJJJJL = i4;
                    }
                    if (z2) {
                        constraintWidget.LJJJJL = i5;
                    }
                    if (layoutParams.needsBaseline && (baseline = childAt.getBaseline()) != -1) {
                        constraintWidget.LJJJJI = baseline;
                    }
                }
            }
        }
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    size = Math.min(this.mMaxWidth, size) - paddingLeft;
                }
            } else {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
            size = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    size2 = Math.min(this.mMaxHeight, size2) - paddingTop;
                }
            } else {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
            size2 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.m21189LJ(0);
        this.mLayoutWidget.LJFF(0);
        this.mLayoutWidget.LIZ(dimensionBehaviour);
        this.mLayoutWidget.LIZJ(size);
        this.mLayoutWidget.LIZIZ(dimensionBehaviour2);
        this.mLayoutWidget.LIZLLL(size2);
        this.mLayoutWidget.m21189LJ((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.LJFF((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    private void internalMeasureDimensions(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int childMeasureSpec;
        boolean z6;
        int childMeasureSpec2;
        int baseline;
        boolean z7;
        boolean z8;
        int baseline2;
        ConstraintLayout constraintLayout = this;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = 8;
            if (i4 >= childCount) {
                break;
            }
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.widget;
                if (!layoutParams.isGuideline && !layoutParams.isHelper) {
                    constraintWidget.LJJJLIIL = childAt.getVisibility();
                    int i5 = layoutParams.width;
                    int i6 = layoutParams.height;
                    if (i5 != 0 && i6 != 0) {
                        if (i5 == -2) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int childMeasureSpec3 = getChildMeasureSpec(i, paddingLeft, i5);
                        if (i6 == -2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        childAt.measure(childMeasureSpec3, getChildMeasureSpec(i2, paddingTop, i6));
                        C146254ezw c146254ezw = constraintLayout.mMetrics;
                        if (c146254ezw != null) {
                            c146254ezw.LIZ++;
                        }
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        constraintWidget.LIZJ(measuredWidth);
                        constraintWidget.LIZLLL(measuredHeight);
                        if (z7) {
                            constraintWidget.LJJJJJL = measuredWidth;
                        }
                        if (z8) {
                            constraintWidget.LJJJJL = measuredHeight;
                        }
                        if (layoutParams.needsBaseline && (baseline2 = childAt.getBaseline()) != -1) {
                            constraintWidget.LJJJJI = baseline2;
                        }
                        if (layoutParams.horizontalDimensionFixed && layoutParams.verticalDimensionFixed) {
                            constraintWidget.LJIIIIZZ().LIZ(measuredWidth);
                            constraintWidget.LJIIIZ().LIZ(measuredHeight);
                        }
                    } else {
                        constraintWidget.LJIIIIZZ().LIZLLL();
                        constraintWidget.LJIIIZ().LIZLLL();
                    }
                }
            }
            i4++;
        }
        constraintLayout.mLayoutWidget.LJJIIJ();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2.getVisibility() != i3) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                ConstraintWidget constraintWidget2 = layoutParams2.widget;
                if (!layoutParams2.isGuideline && !layoutParams2.isHelper) {
                    constraintWidget2.LJJJLIIL = childAt2.getVisibility();
                    int i8 = layoutParams2.width;
                    int i9 = layoutParams2.height;
                    if (i8 == 0 || i9 == 0) {
                        C0228j c0228j = constraintWidget2.LIZ(ConstraintAnchor.Type.LEFT).LIZ;
                        C0228j c0228j2 = constraintWidget2.LIZ(ConstraintAnchor.Type.RIGHT).LIZ;
                        if (constraintWidget2.LIZ(ConstraintAnchor.Type.LEFT).LIZLLL != null && constraintWidget2.LIZ(ConstraintAnchor.Type.RIGHT).LIZLLL != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C0228j c0228j3 = constraintWidget2.LIZ(ConstraintAnchor.Type.TOP).LIZ;
                        C0228j c0228j4 = constraintWidget2.LIZ(ConstraintAnchor.Type.BOTTOM).LIZ;
                        if (constraintWidget2.LIZ(ConstraintAnchor.Type.TOP).LIZLLL != null && constraintWidget2.LIZ(ConstraintAnchor.Type.BOTTOM).LIZLLL != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i8 != 0 || i9 != 0 || !z || !z2) {
                            if (constraintLayout.mLayoutWidget.LJJI() != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (constraintLayout.mLayoutWidget.LJJIFFI() != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z3) {
                                constraintWidget2.LJIIIIZZ().LIZLLL();
                            }
                            if (!z4) {
                                constraintWidget2.LJIIIZ().LIZLLL();
                            }
                            if (i8 == 0) {
                                if (z3 && constraintWidget2.LIZLLL() && z && c0228j.LJFF() && c0228j2.LJFF()) {
                                    i8 = (int) (c0228j2.f20238LJ - c0228j.f20238LJ);
                                    constraintWidget2.LJIIIIZZ().LIZ(i8);
                                    z5 = false;
                                    childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i8);
                                } else {
                                    childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -2);
                                    z5 = true;
                                    z3 = false;
                                }
                            } else if (i8 == -1) {
                                childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -1);
                                z5 = false;
                            } else {
                                if (i8 == -2) {
                                    z5 = true;
                                    childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i8);
                                }
                                z5 = false;
                                childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i8);
                            }
                            if (i9 == 0) {
                                if (z4 && constraintWidget2.m21190LJ() && z2 && c0228j3.LJFF() && c0228j4.LJFF()) {
                                    i9 = (int) (c0228j4.f20238LJ - c0228j3.f20238LJ);
                                    constraintWidget2.LJIIIZ().LIZ(i9);
                                    z6 = false;
                                    childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i9);
                                } else {
                                    childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                                    z6 = true;
                                    z4 = false;
                                }
                            } else if (i9 == -1) {
                                childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -1);
                                z6 = false;
                            } else {
                                if (i9 == -2) {
                                    z6 = true;
                                    childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i9);
                                }
                                z6 = false;
                                childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i9);
                            }
                            childAt2.measure(childMeasureSpec, childMeasureSpec2);
                            constraintLayout = this;
                            C146254ezw c146254ezw2 = constraintLayout.mMetrics;
                            if (c146254ezw2 != null) {
                                c146254ezw2.LIZ++;
                            }
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            constraintWidget2.LIZJ(measuredWidth2);
                            constraintWidget2.LIZLLL(measuredHeight2);
                            if (z5) {
                                constraintWidget2.LJJJJJL = measuredWidth2;
                            }
                            if (z6) {
                                constraintWidget2.LJJJJL = measuredHeight2;
                            }
                            if (z3) {
                                constraintWidget2.LJIIIIZZ().LIZ(measuredWidth2);
                            } else {
                                constraintWidget2.LJIIIIZZ().LIZJ();
                            }
                            if (z4) {
                                constraintWidget2.LJIIIZ().LIZ(measuredHeight2);
                            } else {
                                constraintWidget2.LJIIIZ().LIZJ();
                            }
                            if (layoutParams2.needsBaseline && (baseline = childAt2.getBaseline()) != -1) {
                                constraintWidget2.LJJJJI = baseline;
                            }
                        }
                        i7++;
                        i3 = 8;
                    }
                }
            }
            i7++;
            i3 = 8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x03fd, code lost:
        if (r1 != false) goto L181;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        int i2 = Build.VERSION.SDK_INT;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || isInEditMode) && !layoutParams.isInPlaceholder) {
                int LJIIL = constraintWidget.LJIIL();
                int LJIILIIL = constraintWidget.LJIILIIL();
                int LJIIJ = constraintWidget.LJIIJ() + LJIIL;
                int LJIIJJI = constraintWidget.LJIIJJI() + LJIILIIL;
                childAt.layout(LJIIL, LJIILIIL, LJIIJ, LJIIJJI);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(LJIIL, LJIILIIL, LJIIJ, LJIIJJI);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            do {
                this.mConstraintHelpers.get(i5).LIZJ();
                i5++;
            } while (i5 < size);
        }
    }
}
