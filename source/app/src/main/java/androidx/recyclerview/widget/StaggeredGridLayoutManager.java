package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p003X.AbstractC113806UrA;
import p003X.AbstractC147106fDg;
import p003X.AbstractC147109fDj;
import p003X.C138210ctp;
import p003X.C139103d8F;
import p003X.C147105fDf;
import p003X.C147107fDh;
import p003X.C147108fDi;

/* loaded from: classes20.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements AbstractC113806UrA {
    public static final int GAP_HANDLING_LAZY = 1;
    public int mFullSizeSpec;
    public boolean mLastLayoutFromEnd;
    public boolean mLastLayoutRTL;
    public int mOrientation;
    public SavedState mPendingSavedState;
    public int[] mPrefetchDistances;
    public AbstractC147106fDg mPrimaryOrientation;
    public BitSet mRemainingSpans;
    public boolean mReverseLayout;
    public AbstractC147106fDg mSecondaryOrientation;
    public boolean mShouldReverseLayout;
    public int mSizePerSpan;
    public C147105fDf[] mSpans;
    public int mSpanCount = -1;
    public int mPendingScrollPosition = -1;
    public int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    public LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    public int mGapStrategy = 2;
    public final Rect mTmpRect = new Rect();
    public final C147108fDi mAnchorInfo = new C147108fDi(this);
    public boolean mLaidOutInvalidFullSpan = false;
    public boolean mSmoothScrollbarEnabled = true;
    public final Runnable mCheckForGapsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
        static {
            Covode.recordClassIndex(1731);
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };
    public final C147107fDh mLayoutState = new C147107fDh();

    /* loaded from: classes20.dex */
    public static class LazySpanLookup {
        public int[] LIZ;
        public List<FullSpanItem> LIZIZ;

        static {
            Covode.recordClassIndex(1733);
        }

        /* loaded from: classes20.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                static {
                    Covode.recordClassIndex(1735);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };
            public int LIZ;
            public int LIZIZ;
            public int[] LIZJ;
            public boolean LIZLLL;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public FullSpanItem() {
            }

            static {
                Covode.recordClassIndex(1734);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.LIZ + ", mGapDir=" + this.LIZIZ + ", mHasUnwantedGapAfter=" + this.LIZLLL + ", mGapPerSpan=" + Arrays.toString(this.LIZJ) + '}';
            }

            public final int LIZ(int i) {
                int[] iArr = this.LIZJ;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public FullSpanItem(Parcel parcel) {
                this.LIZ = parcel.readInt();
                this.LIZIZ = parcel.readInt();
                this.LIZLLL = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.LIZJ = new int[readInt];
                    parcel.readIntArray(this.LIZJ);
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LIZ);
                parcel.writeInt(this.LIZIZ);
                parcel.writeInt(this.LIZLLL ? 1 : 0);
                int[] iArr = this.LIZJ;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.LIZJ);
                    return;
                }
                parcel.writeInt(0);
            }
        }

        public final void LIZ() {
            int[] iArr = this.LIZ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.LIZIZ = null;
        }

        /* renamed from: LJ */
        private int m21105LJ(int i) {
            int length = this.LIZ.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public final FullSpanItem LIZLLL(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.LIZIZ.get(size);
                if (fullSpanItem.LIZ == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        private int LJFF(int i) {
            if (this.LIZIZ == null) {
                return -1;
            }
            FullSpanItem LIZLLL = LIZLLL(i);
            if (LIZLLL != null) {
                this.LIZIZ.remove(LIZLLL);
            }
            int size = this.LIZIZ.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.LIZIZ.get(i2).LIZ >= i) {
                    if (i2 != -1) {
                        this.LIZIZ.remove(i2);
                        return this.LIZIZ.get(i2).LIZ;
                    }
                } else {
                    i2++;
                }
            }
            return -1;
        }

        public final int LIZ(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.LIZIZ.get(size).LIZ >= i) {
                        this.LIZIZ.remove(size);
                    }
                }
            }
            return LIZIZ(i);
        }

        public final int LIZIZ(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int LJFF = LJFF(i);
            if (LJFF == -1) {
                int[] iArr2 = this.LIZ;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.LIZ.length;
            }
            int i2 = LJFF + 1;
            Arrays.fill(this.LIZ, i, i2, -1);
            return i2;
        }

        public final void LIZJ(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null) {
                this.LIZ = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.LIZ, -1);
            } else if (i >= iArr.length) {
                this.LIZ = new int[m21105LJ(i)];
                System.arraycopy(iArr, 0, this.LIZ, 0, iArr.length);
                int[] iArr2 = this.LIZ;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        public final void LIZ(FullSpanItem fullSpanItem) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList();
            }
            int size = this.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.LIZIZ.get(i);
                if (fullSpanItem2.LIZ == fullSpanItem.LIZ) {
                    this.LIZIZ.remove(i);
                }
                if (fullSpanItem2.LIZ >= fullSpanItem.LIZ) {
                    this.LIZIZ.add(i, fullSpanItem);
                    return;
                }
            }
            this.LIZIZ.add(fullSpanItem);
        }

        public final void LIZIZ(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                LIZJ(i3);
                int[] iArr2 = this.LIZ;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.LIZ, i, i3, -1);
                LIZLLL(i, i2);
            }
        }

        private void LIZJ(int i, int i2) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.LIZIZ.get(size);
                if (fullSpanItem.LIZ >= i) {
                    if (fullSpanItem.LIZ < i3) {
                        this.LIZIZ.remove(size);
                    } else {
                        fullSpanItem.LIZ -= i2;
                    }
                }
            }
        }

        private void LIZLLL(int i, int i2) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.LIZIZ.get(size);
                if (fullSpanItem.LIZ >= i) {
                    fullSpanItem.LIZ += i2;
                }
            }
        }

        public final void LIZ(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                LIZJ(i3);
                int[] iArr2 = this.LIZ;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.LIZ;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                LIZJ(i, i2);
            }
        }

        public final FullSpanItem LIZ(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.LIZIZ.get(i4);
                if (fullSpanItem.LIZ >= i2) {
                    return null;
                }
                if (fullSpanItem.LIZ >= i && (i3 == 0 || fullSpanItem.LIZIZ == i3 || fullSpanItem.LIZLLL)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(1730);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m21107x3a4fd490(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m21106x5a3580e2(this, i, recycler, state);
    }

    /* loaded from: classes20.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public boolean mFullSpan;
        public C147105fDf mSpan;

        static {
            Covode.recordClassIndex(1732);
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public final int getSpanIndex() {
            C147105fDf c147105fDf = this.mSpan;
            if (c147105fDf == null) {
                return -1;
            }
            return c147105fDf.f19634LJ;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes20.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            static {
                Covode.recordClassIndex(1737);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int[] LIZLLL;

        /* renamed from: LJ */
        public int f20280LJ;
        public int[] LJFF;
        public List<LazySpanLookup.FullSpanItem> LJI;
        public boolean LJII;
        public boolean LJIIIIZZ;
        public boolean LJIIIZ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        static {
            Covode.recordClassIndex(1736);
        }

        public final void LIZ() {
            this.LIZLLL = null;
            this.LIZJ = 0;
            this.LIZ = -1;
            this.LIZIZ = -1;
        }

        public SavedState(SavedState savedState) {
            this.LIZJ = savedState.LIZJ;
            this.LIZ = savedState.LIZ;
            this.LIZIZ = savedState.LIZIZ;
            this.LIZLLL = savedState.LIZLLL;
            this.f20280LJ = savedState.f20280LJ;
            this.LJFF = savedState.LJFF;
            this.LJII = savedState.LJII;
            this.LJIIIIZZ = savedState.LJIIIIZZ;
            this.LJIIIZ = savedState.LJIIIZ;
            this.LJI = savedState.LJI;
        }

        public SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readInt();
            int i = this.LIZJ;
            if (i > 0) {
                this.LIZLLL = new int[i];
                parcel.readIntArray(this.LIZLLL);
            }
            this.f20280LJ = parcel.readInt();
            int i2 = this.f20280LJ;
            if (i2 > 0) {
                this.LJFF = new int[i2];
                parcel.readIntArray(this.LJFF);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJIIIIZZ = z2;
            this.LJIIIZ = parcel.readInt() == 1 ? true : z3;
            this.LJI = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
            if (this.LIZJ > 0) {
                parcel.writeIntArray(this.LIZLLL);
            }
            parcel.writeInt(this.f20280LJ);
            if (this.f20280LJ > 0) {
                parcel.writeIntArray(this.LJFF);
            }
            parcel.writeInt(this.LJII ? 1 : 0);
            parcel.writeInt(this.LJIIIIZZ ? 1 : 0);
            parcel.writeInt(this.LJIIIZ ? 1 : 0);
            parcel.writeList(this.LJI);
        }
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        if (this.mGapStrategy != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null) {
            return true;
        }
        return false;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.LIZ();
        requestLayout();
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = AbstractC147106fDg.LIZ(this, this.mOrientation);
        this.mSecondaryOrientation = AbstractC147106fDg.LIZ(this, 1 - this.mOrientation);
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation != 1 && isLayoutRTL()) {
            if (this.mReverseLayout) {
                z = false;
            }
        } else {
            z = this.mReverseLayout;
        }
        this.mShouldReverseLayout = z;
    }

    public boolean areAllEndsEqual() {
        int LIZIZ = this.mSpans[0].LIZIZ(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].LIZIZ(Integer.MIN_VALUE) != LIZIZ) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllStartsEqual() {
        int LIZ = this.mSpans[0].LIZ(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].LIZ(Integer.MIN_VALUE) != LIZ) {
                return false;
            }
        }
        return true;
    }

    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToStart;
        if (this.mShouldReverseLayout) {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToEnd(true);
        } else {
            findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(true);
        }
        if (findFirstVisibleItemClosestToStart == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToStart);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        int i;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.LIZ();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.mLaidOutInvalidFullSpan) {
            return false;
        } else {
            if (this.mShouldReverseLayout) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = lastChildPosition + 1;
            LazySpanLookup.FullSpanItem LIZ = this.mLazySpanLookup.LIZ(firstChildPosition, i2, i, true);
            if (LIZ == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.LIZ(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem LIZ2 = this.mLazySpanLookup.LIZ(firstChildPosition, LIZ.LIZ, i * (-1), true);
            if (LIZ2 == null) {
                this.mLazySpanLookup.LIZ(LIZ.LIZ);
            } else {
                this.mLazySpanLookup.LIZ(LIZ2.LIZ + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.LJI() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float mo21354LJ = this.mSecondaryOrientation.mo21354LJ(childAt);
            if (mo21354LJ >= f) {
                if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                    mo21354LJ = (mo21354LJ * 1.0f) / this.mSpanCount;
                }
                f = Math.max(f, mo21354LJ);
            }
        }
        int i2 = this.mSizePerSpan;
        int round = Math.round(f * this.mSpanCount);
        if (this.mSecondaryOrientation.LJI() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.mo21355LJ());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.mFullSpan) {
                if (isLayoutRTL() && this.mOrientation == 1) {
                    childAt2.offsetLeftAndRight(((-((this.mSpanCount - 1) - layoutParams.mSpan.f19634LJ)) * this.mSizePerSpan) - ((-((this.mSpanCount - 1) - layoutParams.mSpan.f19634LJ)) * i2));
                } else {
                    int i4 = layoutParams.mSpan.f19634LJ * this.mSizePerSpan;
                    int i5 = layoutParams.mSpan.f19634LJ * i2;
                    if (this.mOrientation == 1) {
                        childAt2.offsetLeftAndRight(i4 - i5);
                    } else {
                        childAt2.offsetTopAndBottom(i4 - i5);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View hasGapsToFix() {
        /*
            r10 = this;
            int r6 = r10.getChildCount()
            r2 = 1
            int r6 = r6 - r2
            java.util.BitSet r5 = new java.util.BitSet
            int r0 = r10.mSpanCount
            r5.<init>(r0)
            int r1 = r10.mSpanCount
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r10.mOrientation
            r9 = -1
            if (r0 != r2) goto La2
            boolean r0 = r10.isLayoutRTL()
            if (r0 == 0) goto La2
            r8 = 1
        L1f:
            boolean r0 = r10.mShouldReverseLayout
            if (r0 == 0) goto L9e
            r0 = -1
        L24:
            if (r6 >= r0) goto L27
            r9 = 1
        L27:
            if (r6 == r0) goto La5
            android.view.View r4 = r10.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            X.fDf r1 = r7.mSpan
            int r1 = r1.f19634LJ
            boolean r1 = r5.get(r1)
            if (r1 == 0) goto L4d
            X.fDf r1 = r7.mSpan
            boolean r1 = r10.checkSpanForGap(r1)
            if (r1 == 0) goto L46
            return r4
        L46:
            X.fDf r1 = r7.mSpan
            int r1 = r1.f19634LJ
            r5.clear(r1)
        L4d:
            boolean r1 = r7.mFullSpan
            if (r1 != 0) goto L9c
            int r1 = r6 + r9
            if (r1 == r0) goto L9c
            android.view.View r3 = r10.getChildAt(r1)
            boolean r1 = r10.mShouldReverseLayout
            if (r1 == 0) goto L6f
            X.fDg r1 = r10.mPrimaryOrientation
            int r2 = r1.LIZIZ(r4)
            X.fDg r1 = r10.mPrimaryOrientation
            int r1 = r1.LIZIZ(r3)
            if (r2 >= r1) goto L6c
            return r4
        L6c:
            if (r2 != r1) goto L9c
            goto L80
        L6f:
            X.fDg r1 = r10.mPrimaryOrientation
            int r2 = r1.LIZ(r4)
            X.fDg r1 = r10.mPrimaryOrientation
            int r1 = r1.LIZ(r3)
            if (r2 <= r1) goto L7e
            return r4
        L7e:
            if (r2 != r1) goto L9c
        L80:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r3
            X.fDf r1 = r7.mSpan
            int r2 = r1.f19634LJ
            X.fDf r1 = r3.mSpan
            int r1 = r1.f19634LJ
            int r2 = r2 - r1
            if (r2 >= 0) goto L9a
            r2 = 1
        L92:
            if (r8 >= 0) goto L98
            r1 = 1
        L95:
            if (r2 == r1) goto L9c
            return r4
        L98:
            r1 = 0
            goto L95
        L9a:
            r2 = 0
            goto L92
        L9c:
            int r6 = r6 + r9
            goto L27
        L9e:
            int r0 = r6 + 1
            r6 = 0
            goto L24
        La2:
            r8 = -1
            goto L1f
        La5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int firstChildPosition;
        int LIZ;
        int LIZIZ;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.LJII = this.mReverseLayout;
        savedState2.LJIIIIZZ = this.mLastLayoutFromEnd;
        savedState2.LJIIIZ = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup != null && lazySpanLookup.LIZ != null) {
            savedState2.LJFF = this.mLazySpanLookup.LIZ;
            savedState2.f20280LJ = savedState2.LJFF.length;
            savedState2.LJI = this.mLazySpanLookup.LIZIZ;
        } else {
            savedState2.f20280LJ = 0;
        }
        if (getChildCount() > 0) {
            if (this.mLastLayoutFromEnd) {
                firstChildPosition = getLastChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
            }
            savedState2.LIZ = firstChildPosition;
            savedState2.LIZIZ = findFirstVisibleItemPositionInt();
            int i = this.mSpanCount;
            savedState2.LIZJ = i;
            savedState2.LIZLLL = new int[i];
            for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                if (this.mLastLayoutFromEnd) {
                    LIZ = this.mSpans[i2].LIZIZ(Integer.MIN_VALUE);
                    if (LIZ != Integer.MIN_VALUE) {
                        LIZIZ = this.mPrimaryOrientation.LIZJ();
                        LIZ -= LIZIZ;
                        savedState2.LIZLLL[i2] = LIZ;
                    } else {
                        savedState2.LIZLLL[i2] = LIZ;
                    }
                } else {
                    LIZ = this.mSpans[i2].LIZ(Integer.MIN_VALUE);
                    if (LIZ == Integer.MIN_VALUE) {
                        savedState2.LIZLLL[i2] = LIZ;
                    } else {
                        LIZIZ = this.mPrimaryOrientation.LIZIZ();
                        LIZ -= LIZIZ;
                        savedState2.LIZLLL[i2] = LIZ;
                    }
                }
            }
        } else {
            savedState2.LIZ = -1;
            savedState2.LIZIZ = -1;
            savedState2.LIZJ = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.LIZ();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].LIZIZ(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i) {
        boolean z;
        if (getChildCount() == 0) {
            if (!this.mShouldReverseLayout) {
                return -1;
            }
            return 1;
        }
        if (i < getFirstChildPosition()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.mShouldReverseLayout) {
            return -1;
        }
        return 1;
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int getMaxEnd(int i) {
        int LIZIZ = this.mSpans[0].LIZIZ(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int LIZIZ2 = this.mSpans[i2].LIZIZ(i);
            if (LIZIZ2 > LIZIZ) {
                LIZIZ = LIZIZ2;
            }
        }
        return LIZIZ;
    }

    private int getMaxStart(int i) {
        int LIZ = this.mSpans[0].LIZ(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int LIZ2 = this.mSpans[i2].LIZ(i);
            if (LIZ2 > LIZ) {
                LIZ = LIZ2;
            }
        }
        return LIZ;
    }

    private int getMinEnd(int i) {
        int LIZIZ = this.mSpans[0].LIZIZ(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int LIZIZ2 = this.mSpans[i2].LIZIZ(i);
            if (LIZIZ2 < LIZIZ) {
                LIZIZ = LIZIZ2;
            }
        }
        return LIZIZ;
    }

    private int getMinStart(int i) {
        int LIZ = this.mSpans[0].LIZ(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int LIZ2 = this.mSpans[i2].LIZ(i);
            if (LIZ2 < LIZ) {
                LIZ = LIZ2;
            }
        }
        return LIZ;
    }

    private void prependViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].LIZ(view);
        }
    }

    private void setLayoutStateDirection(int i) {
        boolean z;
        C147107fDh c147107fDh = this.mLayoutState;
        c147107fDh.f19635LJ = i;
        boolean z2 = this.mShouldReverseLayout;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c147107fDh.LIZLLL = i2;
    }

    @Override // p003X.AbstractC113806UrA
    public PointF computeScrollVectorForPosition(int i) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = calculateScrollDirectionForPosition;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = calculateScrollDirectionForPosition;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].LIZLLL(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].LIZLLL(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.LIZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.LIZ != i) {
            this.mPendingSavedState.LIZ();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.mGapStrategy) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.LJII != z) {
            this.mPendingSavedState.LJII = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.LJI());
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C138210ctp.LIZ(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C138210ctp.LIZ(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C138210ctp.LIZIZ(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.LIZJ = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.LIZJ[i2] = i - this.mSpans[i2].LIZIZ(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.LIZJ = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.LIZJ[i2] = this.mSpans[i2].LIZ(i) - i;
        }
        return fullSpanItem;
    }

    private boolean preferLastSpan(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mOrientation == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.mShouldReverseLayout) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.mShouldReverseLayout) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z) {
        int LIZIZ = this.mPrimaryOrientation.LIZIZ();
        int LIZJ = this.mPrimaryOrientation.LIZJ();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int LIZ = this.mPrimaryOrientation.LIZ(childAt);
            int LIZIZ2 = this.mPrimaryOrientation.LIZIZ(childAt);
            if (LIZIZ2 > LIZIZ && LIZ < LIZJ) {
                if (LIZIZ2 > LIZJ && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z) {
        int LIZIZ = this.mPrimaryOrientation.LIZIZ();
        int LIZJ = this.mPrimaryOrientation.LIZJ();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int LIZ = this.mPrimaryOrientation.LIZ(childAt);
            if (this.mPrimaryOrientation.LIZIZ(childAt) > LIZIZ && LIZ < LIZJ) {
                if (LIZ < LIZIZ && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart != null && findFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.mOrientation) {
            return;
        }
        this.mOrientation = i;
        AbstractC147106fDg abstractC147106fDg = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = abstractC147106fDg;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new C147105fDf[this.mSpanCount];
            for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                this.mSpans[i2] = new C147105fDf(this, i2);
            }
            requestLayout();
        }
    }

    private boolean checkSpanForGap(C147105fDf c147105fDf) {
        if (this.mShouldReverseLayout) {
            if (c147105fDf.LIZIZ() < this.mPrimaryOrientation.LIZJ() && !C147105fDf.LIZJ(c147105fDf.LIZ.get(c147105fDf.LIZ.size() - 1)).mFullSpan) {
                return true;
            }
            return false;
        } else if (c147105fDf.LIZ() > this.mPrimaryOrientation.LIZIZ() && !C147105fDf.LIZJ(c147105fDf.LIZ.get(0)).mFullSpan) {
            return true;
        }
        return false;
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.mOrientation == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.mOrientation == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.mOrientation == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    private C147105fDf getNextSpan(C147107fDh c147107fDh) {
        int i;
        int i2;
        int i3 = -1;
        if (preferLastSpan(c147107fDh.f19635LJ)) {
            i = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.mSpanCount;
            i2 = 1;
        }
        C147105fDf c147105fDf = null;
        if (c147107fDh.f19635LJ == 1) {
            int i4 = Integer.MAX_VALUE;
            int LIZIZ = this.mPrimaryOrientation.LIZIZ();
            while (i != i3) {
                C147105fDf c147105fDf2 = this.mSpans[i];
                int LIZIZ2 = c147105fDf2.LIZIZ(LIZIZ);
                if (LIZIZ2 < i4) {
                    c147105fDf = c147105fDf2;
                    i4 = LIZIZ2;
                }
                i += i2;
            }
            return c147105fDf;
        }
        int i5 = Integer.MIN_VALUE;
        int LIZJ = this.mPrimaryOrientation.LIZJ();
        while (i != i3) {
            C147105fDf c147105fDf3 = this.mSpans[i];
            int LIZ = c147105fDf3.LIZ(LIZJ);
            if (LIZ > i5) {
                c147105fDf = c147105fDf3;
                i5 = LIZ;
            }
            i += i2;
        }
        return c147105fDf;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        int LIZ;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            C147105fDf c147105fDf = this.mSpans[i];
            if (c147105fDf.LJFF.mReverseLayout) {
                LIZ = c147105fDf.LIZ(c147105fDf.LIZ.size() - 1, -1, true);
            } else {
                LIZ = c147105fDf.LIZ(0, c147105fDf.LIZ.size(), true);
            }
            iArr[i] = LIZ;
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        int LIZ;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            C147105fDf c147105fDf = this.mSpans[i];
            if (c147105fDf.LJFF.mReverseLayout) {
                LIZ = c147105fDf.LIZ(c147105fDf.LIZ.size() - 1, -1, false);
            } else {
                LIZ = c147105fDf.LIZ(0, c147105fDf.LIZ.size(), false);
            }
            iArr[i] = LIZ;
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        int LIZ;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            C147105fDf c147105fDf = this.mSpans[i];
            if (c147105fDf.LJFF.mReverseLayout) {
                LIZ = c147105fDf.LIZ(0, c147105fDf.LIZ.size(), true);
            } else {
                LIZ = c147105fDf.LIZ(c147105fDf.LIZ.size() - 1, -1, true);
            }
            iArr[i] = LIZ;
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        int LIZ;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            C147105fDf c147105fDf = this.mSpans[i];
            if (c147105fDf.LJFF.mReverseLayout) {
                LIZ = c147105fDf.LIZ(0, c147105fDf.LIZ.size(), false);
            } else {
                LIZ = c147105fDf.LIZ(c147105fDf.LIZ.size() - 1, -1, false);
            }
            iArr[i] = LIZ;
        }
        return iArr;
    }

    private void applyPendingSavedState(C147108fDi c147108fDi) {
        int LIZIZ;
        if (this.mPendingSavedState.LIZJ > 0) {
            if (this.mPendingSavedState.LIZJ != this.mSpanCount) {
                SavedState savedState = this.mPendingSavedState;
                savedState.LIZLLL = null;
                savedState.LIZJ = 0;
                savedState.f20280LJ = 0;
                savedState.LJFF = null;
                savedState.LJI = null;
                savedState.LIZ = savedState.LIZIZ;
            } else {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].LIZJ();
                    int i2 = this.mPendingSavedState.LIZLLL[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.mPendingSavedState.LJIIIIZZ) {
                            LIZIZ = this.mPrimaryOrientation.LIZJ();
                        } else {
                            LIZIZ = this.mPrimaryOrientation.LIZIZ();
                        }
                        i2 += LIZIZ;
                    }
                    this.mSpans[i].LIZJ(i2);
                }
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.LJIIIZ;
        setReverseLayout(this.mPendingSavedState.LJII);
        resolveShouldLayoutReverse();
        if (this.mPendingSavedState.LIZ != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.LIZ;
            c147108fDi.LIZJ = this.mPendingSavedState.LJIIIIZZ;
        } else {
            c147108fDi.LIZJ = this.mShouldReverseLayout;
        }
        if (this.mPendingSavedState.f20280LJ > 1) {
            this.mLazySpanLookup.LIZ = this.mPendingSavedState.LJFF;
            this.mLazySpanLookup.LIZIZ = this.mPendingSavedState.LJI;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        onLayoutChildren(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        return super.getRowCountForAccessibility(recycler, state);
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.LIZ();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        requestLayout();
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].LIZ.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, C147108fDi c147108fDi) {
        int findFirstReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findFirstReferenceChildPosition = findLastReferenceChildPosition(state.getItemCount());
        } else {
            findFirstReferenceChildPosition = findFirstReferenceChildPosition(state.getItemCount());
        }
        c147108fDi.LIZ = findFirstReferenceChildPosition;
        c147108fDi.LIZIZ = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].LIZJ();
        }
        recyclerView.requestLayout();
    }

    public void updateAnchorInfoForLayout(RecyclerView.State state, C147108fDi c147108fDi) {
        if (updateAnchorFromPendingData(state, c147108fDi) || updateAnchorFromChildren(state, c147108fDi)) {
            return;
        }
        c147108fDi.LIZIZ();
        c147108fDi.LIZ = 0;
    }

    public void prepareLayoutStateForDelta(int i, RecyclerView.State state) {
        int firstChildPosition;
        int i2;
        if (i > 0) {
            firstChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        this.mLayoutState.LIZ = true;
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(i2);
        C147107fDh c147107fDh = this.mLayoutState;
        c147107fDh.LIZJ = firstChildPosition + c147107fDh.LIZLLL;
        this.mLayoutState.LIZIZ = Math.abs(i);
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.mOrientation = i2;
        setSpanCount(i);
        createOrientationHelpers();
    }

    private void recycle(RecyclerView.Recycler recycler, C147107fDh c147107fDh) {
        int min;
        int min2;
        if (c147107fDh.LIZ && !c147107fDh.LJIIIIZZ) {
            if (c147107fDh.LIZIZ == 0) {
                if (c147107fDh.f19635LJ == -1) {
                    recycleFromEnd(recycler, c147107fDh.LJI);
                } else {
                    recycleFromStart(recycler, c147107fDh.LJFF);
                }
            } else if (c147107fDh.f19635LJ == -1) {
                int maxStart = c147107fDh.LJFF - getMaxStart(c147107fDh.LJFF);
                if (maxStart < 0) {
                    min2 = c147107fDh.LJI;
                } else {
                    min2 = c147107fDh.LJI - Math.min(maxStart, c147107fDh.LIZIZ);
                }
                recycleFromEnd(recycler, min2);
            } else {
                int minEnd = getMinEnd(c147107fDh.LJI) - c147107fDh.LJI;
                if (minEnd < 0) {
                    min = c147107fDh.LJFF;
                } else {
                    min = Math.min(minEnd, c147107fDh.LIZIZ) + c147107fDh.LJFF;
                }
                recycleFromStart(recycler, min);
            }
        }
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.LIZ(childAt) >= i && this.mPrimaryOrientation.LIZLLL(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                        if (this.mSpans[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                        this.mSpans[i3].LIZLLL();
                    }
                } else if (layoutParams.mSpan.LIZ.size() == 1) {
                    return;
                } else {
                    layoutParams.mSpan.LIZLLL();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.LIZIZ(childAt) <= i && this.mPrimaryOrientation.LIZJ(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                        if (this.mSpans[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                        this.mSpans[i3].m21356LJ();
                    }
                } else if (layoutParams.mSpan.LIZ.size() == 1) {
                    return;
                } else {
                    layoutParams.mSpan.m21356LJ();
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateLayoutState(int r7, androidx.recyclerview.widget.RecyclerView.State r8) {
        /*
            r6 = this;
            X.fDh r0 = r6.mLayoutState
            r3 = 0
            r0.LIZIZ = r3
            r0.LIZJ = r7
            boolean r0 = r6.isSmoothScrolling()
            r4 = 1
            if (r0 == 0) goto L74
            int r2 = r8.getTargetScrollPosition()
            r0 = -1
            if (r2 == r0) goto L74
            boolean r1 = r6.mShouldReverseLayout
            if (r2 >= r7) goto L72
            r0 = 1
        L1a:
            if (r1 != r0) goto L6a
            X.fDg r0 = r6.mPrimaryOrientation
            int r5 = r0.mo21355LJ()
        L22:
            r0 = 0
        L23:
            boolean r1 = r6.getClipToPadding()
            if (r1 == 0) goto L59
            X.fDh r2 = r6.mLayoutState
            X.fDg r1 = r6.mPrimaryOrientation
            int r1 = r1.LIZIZ()
            int r1 = r1 - r0
            r2.LJFF = r1
            X.fDh r1 = r6.mLayoutState
            X.fDg r0 = r6.mPrimaryOrientation
            int r0 = r0.LIZJ()
            int r0 = r0 + r5
            r1.LJI = r0
        L3f:
            X.fDh r1 = r6.mLayoutState
            r1.LJII = r3
            r1.LIZ = r4
            X.fDg r0 = r6.mPrimaryOrientation
            int r0 = r0.LJI()
            if (r0 != 0) goto L56
            X.fDg r0 = r6.mPrimaryOrientation
            int r0 = r0.LIZLLL()
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            r1.LJIIIIZZ = r3
            return
        L59:
            X.fDh r2 = r6.mLayoutState
            X.fDg r1 = r6.mPrimaryOrientation
            int r1 = r1.LIZLLL()
            int r1 = r1 + r5
            r2.LJI = r1
            X.fDh r1 = r6.mLayoutState
            int r0 = -r0
            r1.LJFF = r0
            goto L3f
        L6a:
            X.fDg r0 = r6.mPrimaryOrientation
            int r0 = r0.mo21355LJ()
            r5 = 0
            goto L23
        L72:
            r0 = 0
            goto L1a
        L74:
            r5 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.updateLayoutState(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public boolean updateAnchorFromPendingData(RecyclerView.State state, C147108fDi c147108fDi) {
        int i;
        int firstChildPosition;
        int LIZIZ;
        boolean z = false;
        if (!state.isPreLayout() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.LIZ != -1 && this.mPendingSavedState.LIZJ > 0) {
                    c147108fDi.LIZIZ = Integer.MIN_VALUE;
                    c147108fDi.LIZ = this.mPendingScrollPosition;
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (findViewByPosition != null) {
                    if (this.mShouldReverseLayout) {
                        firstChildPosition = getLastChildPosition();
                    } else {
                        firstChildPosition = getFirstChildPosition();
                    }
                    c147108fDi.LIZ = firstChildPosition;
                    if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                        if (c147108fDi.LIZJ) {
                            c147108fDi.LIZIZ = (this.mPrimaryOrientation.LIZJ() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.LIZIZ(findViewByPosition);
                            return true;
                        }
                        c147108fDi.LIZIZ = (this.mPrimaryOrientation.LIZIZ() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.LIZ(findViewByPosition);
                        return true;
                    } else if (this.mPrimaryOrientation.mo21354LJ(findViewByPosition) > this.mPrimaryOrientation.mo21355LJ()) {
                        if (c147108fDi.LIZJ) {
                            LIZIZ = this.mPrimaryOrientation.LIZJ();
                        } else {
                            LIZIZ = this.mPrimaryOrientation.LIZIZ();
                        }
                        c147108fDi.LIZIZ = LIZIZ;
                        return true;
                    } else {
                        int LIZ = this.mPrimaryOrientation.LIZ(findViewByPosition) - this.mPrimaryOrientation.LIZIZ();
                        if (LIZ < 0) {
                            c147108fDi.LIZIZ = -LIZ;
                            return true;
                        }
                        int LIZJ = this.mPrimaryOrientation.LIZJ() - this.mPrimaryOrientation.LIZIZ(findViewByPosition);
                        if (LIZJ < 0) {
                            c147108fDi.LIZIZ = LIZJ;
                            return true;
                        }
                        c147108fDi.LIZIZ = Integer.MIN_VALUE;
                        return true;
                    }
                }
                c147108fDi.LIZ = this.mPendingScrollPosition;
                int i2 = this.mPendingScrollPositionOffset;
                if (i2 == Integer.MIN_VALUE) {
                    if (calculateScrollDirectionForPosition(c147108fDi.LIZ) == 1) {
                        z = true;
                    }
                    c147108fDi.LIZJ = z;
                    c147108fDi.LIZIZ();
                } else if (c147108fDi.LIZJ) {
                    c147108fDi.LIZIZ = c147108fDi.LJI.mPrimaryOrientation.LIZJ() - i2;
                } else {
                    c147108fDi.LIZIZ = c147108fDi.LJI.mPrimaryOrientation.LIZIZ() + i2;
                }
                c147108fDi.LIZLLL = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: androidx_recyclerview_widget_StaggeredGridLayoutManager__scrollHorizontallyBy$___twin___ */
    public int m21109x171bd760(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i, recycler, state);
    }

    /* renamed from: androidx_recyclerview_widget_StaggeredGridLayoutManager__scrollVerticallyBy$___twin___ */
    public int m21108xb3a078ce(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, C147107fDh c147107fDh) {
        if (c147107fDh.f19635LJ == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.LIZIZ(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.LIZ(view);
        }
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int LIZJ;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (LIZJ = this.mPrimaryOrientation.LIZJ() - maxEnd) > 0) {
            int i = LIZJ - (-scrollBy(-LIZJ, recycler, state));
            if (z && i > 0) {
                this.mPrimaryOrientation.LIZ(i);
            }
        }
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int LIZIZ;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (LIZIZ = minStart - this.mPrimaryOrientation.LIZIZ()) > 0) {
            int scrollBy = LIZIZ - scrollBy(LIZIZ, recycler, state);
            if (z && scrollBy > 0) {
                this.mPrimaryOrientation.LIZ(-scrollBy);
            }
        }
    }

    private void updateRemainingSpans(C147105fDf c147105fDf, int i, int i2) {
        int i3 = c147105fDf.LIZLLL;
        if (i == -1) {
            if (c147105fDf.LIZ() + i3 <= i2) {
                this.mRemainingSpans.set(c147105fDf.f19634LJ, false);
            }
        } else if (c147105fDf.LIZIZ() - i3 >= i2) {
            this.mRemainingSpans.set(c147105fDf.f19634LJ, false);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    public int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.LIZIZ >= fill) {
            if (i < 0) {
                i = -fill;
            } else {
                i = fill;
            }
        }
        this.mPrimaryOrientation.LIZ(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        C147107fDh c147107fDh = this.mLayoutState;
        c147107fDh.LIZIZ = 0;
        recycle(recycler, c147107fDh);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleUpdate(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L3e
            int r5 = r6.getLastChildPosition()
        L8:
            r4 = 8
            if (r9 != r4) goto L3b
            if (r7 >= r8) goto L37
            int r3 = r8 + 1
        L10:
            r2 = r7
        L11:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.mLazySpanLookup
            r0.LIZIZ(r2)
            r1 = 1
            if (r9 == r1) goto L31
            r0 = 2
            if (r9 == r0) goto L2b
            if (r9 != r4) goto L28
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.mLazySpanLookup
            r0.LIZ(r7, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.mLazySpanLookup
            r0.LIZIZ(r8, r1)
        L28:
            if (r3 > r5) goto L43
            return
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.mLazySpanLookup
            r0.LIZ(r7, r8)
            goto L28
        L31:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.mLazySpanLookup
            r0.LIZIZ(r7, r8)
            goto L28
        L37:
            int r3 = r7 + 1
            r2 = r8
            goto L11
        L3b:
            int r3 = r7 + r8
            goto L10
        L3e:
            int r5 = r6.getFirstChildPosition()
            goto L8
        L43:
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L51
            int r0 = r6.getFirstChildPosition()
        L4b:
            if (r2 > r0) goto L50
            r6.requestLayout()
        L50:
            return
        L51:
            int r0 = r6.getLastChildPosition()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
        if (checkForGaps() != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r12, androidx.recyclerview.widget.RecyclerView.State r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int fill(androidx.recyclerview.widget.RecyclerView.Recycler r26, p003X.C147107fDh r27, androidx.recyclerview.widget.RecyclerView.State r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.fill(androidx.recyclerview.widget.RecyclerView$Recycler, X.fDh, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    /* renamed from: androidx_recyclerview_widget_StaggeredGridLayoutManager_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollHorizontallyBy */
    public static int m21107x3a4fd490(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return staggeredGridLayoutManager.m21109x171bd760(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    /* renamed from: androidx_recyclerview_widget_StaggeredGridLayoutManager_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollVerticallyBy */
    public static int m21106x5a3580e2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return staggeredGridLayoutManager.m21108xb3a078ce(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int updateSpecWithExtra = updateSpecWithExtra(i, layoutParams.leftMargin + this.mTmpRect.left, layoutParams.rightMargin + this.mTmpRect.right);
        int updateSpecWithExtra2 = updateSpecWithExtra(i2, layoutParams.topMargin + this.mTmpRect.top, layoutParams.bottomMargin + this.mTmpRect.bottom);
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int spanIndex;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i3 = 1;
        if (this.mOrientation == 0) {
            i = layoutParams2.getSpanIndex();
            if (layoutParams2.mFullSpan) {
                i3 = this.mSpanCount;
            }
            spanIndex = -1;
            i2 = -1;
        } else {
            spanIndex = layoutParams2.getSpanIndex();
            if (layoutParams2.mFullSpan) {
                i2 = this.mSpanCount;
                i = -1;
                i3 = -1;
            } else {
                i = -1;
                i3 = -1;
                i2 = 1;
            }
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(C139103d8F.LIZ(i, i3, spanIndex, i2, false, false));
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C0379b properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.LIZ);
        setSpanCount(properties.LIZIZ);
        setReverseLayout(properties.LIZJ);
        createOrientationHelpers();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, AbstractC147109fDj abstractC147109fDj) {
        int LIZIZ;
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            prepareLayoutStateForDelta(i, state);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                if (this.mLayoutState.LIZLLL == -1) {
                    LIZIZ = this.mLayoutState.LJFF;
                    i3 = this.mSpans[i5].LIZ(this.mLayoutState.LJFF);
                } else {
                    LIZIZ = this.mSpans[i5].LIZIZ(this.mLayoutState.LJI);
                    i3 = this.mLayoutState.LJI;
                }
                int i6 = LIZIZ - i3;
                if (i6 >= 0) {
                    this.mPrefetchDistances[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i4);
            for (int i7 = 0; i7 < i4 && this.mLayoutState.LIZ(state); i7++) {
                abstractC147109fDj.LIZ(this.mLayoutState.LIZJ, this.mPrefetchDistances[i7]);
                this.mLayoutState.LIZJ += this.mLayoutState.LIZLLL;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int firstChildPosition;
        boolean z;
        boolean z2;
        int LJI;
        int LJI2;
        int LJI3;
        View LIZ;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z3 = layoutParams.mFullSpan;
        C147105fDf c147105fDf = layoutParams.mSpan;
        if (convertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        C147107fDh c147107fDh = this.mLayoutState;
        c147107fDh.LIZJ = c147107fDh.LIZLLL + firstChildPosition;
        this.mLayoutState.LIZIZ = (int) (this.mPrimaryOrientation.mo21355LJ() * 0.33333334f);
        C147107fDh c147107fDh2 = this.mLayoutState;
        c147107fDh2.LJII = true;
        c147107fDh2.LIZ = false;
        fill(recycler, c147107fDh2, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z3 && (LIZ = c147105fDf.LIZ(firstChildPosition, convertFocusDirectionToLayoutDirection)) != null && LIZ != findContainingItemView) {
            return LIZ;
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.mSpanCount - 1; i2 >= 0; i2--) {
                View LIZ2 = this.mSpans[i2].LIZ(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (LIZ2 != null && LIZ2 != findContainingItemView) {
                    return LIZ2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                View LIZ3 = this.mSpans[i3].LIZ(firstChildPosition, convertFocusDirectionToLayoutDirection);
                if (LIZ3 != null && LIZ3 != findContainingItemView) {
                    return LIZ3;
                }
            }
        }
        boolean z4 = !this.mReverseLayout;
        if (convertFocusDirectionToLayoutDirection == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                LJI3 = c147105fDf.LJFF();
            } else {
                LJI3 = c147105fDf.LJI();
            }
            View findViewByPosition = findViewByPosition(LJI3);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.mSpanCount - 1; i4 >= 0; i4--) {
                if (i4 != c147105fDf.f19634LJ) {
                    if (z2) {
                        LJI2 = this.mSpans[i4].LJFF();
                    } else {
                        LJI2 = this.mSpans[i4].LJI();
                    }
                    View findViewByPosition2 = findViewByPosition(LJI2);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                if (z2) {
                    LJI = this.mSpans[i5].LJFF();
                } else {
                    LJI = this.mSpans[i5].LJI();
                }
                View findViewByPosition3 = findViewByPosition(LJI);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }
}
