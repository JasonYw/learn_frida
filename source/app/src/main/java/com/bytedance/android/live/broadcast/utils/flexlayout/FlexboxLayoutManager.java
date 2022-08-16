package com.bytedance.android.live.broadcast.utils.flexlayout;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC113806UrA;
import p003X.AbstractC145500enj;
import p003X.AbstractC147106fDg;
import p003X.C145499eni;
import p003X.C147110fDk;
import p003X.C147112fDm;

/* loaded from: classes20.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements AbstractC113806UrA, AbstractC145500enj {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ boolean LJIIIZ = !FlexboxLayoutManager.class.desiredAssertionStatus();
    public static final Rect LJIIJ = new Rect();
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public List<C3248b> f25948LJ;
    public final C145499eni LJFF;
    public AbstractC147106fDg LJI;
    public AbstractC147106fDg LJII;
    public boolean LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public RecyclerView.Recycler LJIILL;
    public RecyclerView.State LJIILLIIL;
    public C147112fDm LJIIZILJ;
    public C147110fDk LJIJ;
    public SavedState LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public SparseArray<View> LJJI;
    public final Context LJJIFFI;
    public View LJJII;
    public int LJJIII;
    public c$a LJJIIJ;

    @Override // p003X.AbstractC145500enj
    public final void LIZ(C3248b c3248b) {
    }

    @Override // p003X.AbstractC145500enj
    public int getAlignContent() {
        return 5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, this, LIZ, false, 66);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : LIZ(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, this, LIZ, false, 69);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : LIZIZ(this, i, recycler, state);
    }

    /* loaded from: classes20.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LayoutParams.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18022);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager$LayoutParams] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                return new LayoutParams(parcel);
            }
        };
        public static ChangeQuickRedirect LIZ;
        public float LIZIZ;
        public float LIZJ;
        public int LIZLLL;

        /* renamed from: LJ */
        public float f25949LJ;
        public int LJFF;
        public int LJI;
        public int LJII;
        public int LJIIIIZZ;
        public boolean LJIIIZ;

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LIZJ() {
            return 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LIZ() {
            return this.width;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LIZIZ() {
            return this.height;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final float LIZLLL() {
            return this.LIZIZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        /* renamed from: LJ */
        public final float mo15878LJ() {
            return this.LIZJ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJFF() {
            return this.LIZLLL;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJI() {
            return this.LJFF;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJII() {
            return this.LJI;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIIIIZZ() {
            return this.LJII;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIIIZ() {
            return this.LJIIIIZZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final boolean LJIIJ() {
            return this.LJIIIZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final float LJIIJJI() {
            return this.f25949LJ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIIL() {
            return this.leftMargin;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIILIIL() {
            return this.topMargin;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIILJJIL() {
            return this.rightMargin;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIILL() {
            return this.bottomMargin;
        }

        static {
            Covode.recordClassIndex(18021);
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final void LIZ(int i) {
            this.LJFF = i;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final void LIZIZ(int i) {
            this.LJI = i;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            boolean z;
            this.LIZJ = 1.0f;
            this.LIZLLL = -1;
            this.f25949LJ = -1.0f;
            this.LJII = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LIZIZ = parcel.readFloat();
            this.LIZJ = parcel.readFloat();
            this.LIZLLL = parcel.readInt();
            this.f25949LJ = parcel.readFloat();
            this.LJFF = parcel.readInt();
            this.LJI = parcel.readInt();
            this.LJII = parcel.readInt();
            this.LJIIIIZZ = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIIZ = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.LIZJ = 1.0f;
            this.LIZLLL = -1;
            this.f25949LJ = -1.0f;
            this.LJII = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.LIZJ = 1.0f;
            this.LIZLLL = -1;
            this.f25949LJ = -1.0f;
            this.LJII = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                return;
            }
            parcel.writeFloat(this.LIZIZ);
            parcel.writeFloat(this.LIZJ);
            parcel.writeInt(this.LIZLLL);
            parcel.writeFloat(this.f25949LJ);
            parcel.writeInt(this.LJFF);
            parcel.writeInt(this.LJI);
            parcel.writeInt(this.LJII);
            parcel.writeInt(this.LJIIIIZZ);
            parcel.writeByte(this.LJIIIZ ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* loaded from: classes20.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.SavedState.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18024);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parcel}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                return new SavedState(parcel, (byte) 0);
            }
        };
        public static ChangeQuickRedirect LIZ;
        public int LIZIZ;
        public int LIZJ;

        public final void LIZ() {
            this.LIZIZ = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        static {
            Covode.recordClassIndex(18023);
        }

        public String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return "SavedState{mAnchorPosition=" + this.LIZIZ + ", mAnchorOffset=" + this.LIZJ + '}';
        }

        public SavedState(Parcel parcel) {
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readInt();
        }

        public final boolean LIZ(int i) {
            int i2 = this.LIZIZ;
            if (i2 >= 0 && i2 < i) {
                return true;
            }
            return false;
        }

        public SavedState(SavedState savedState) {
            this.LIZIZ = savedState.LIZIZ;
            this.LIZJ = savedState.LIZJ;
        }

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public /* synthetic */ SavedState(SavedState savedState, byte b) {
            this(savedState);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
        }
    }

    @Override // p003X.AbstractC145500enj
    public int getAlignItems() {
        return this.LJIIL;
    }

    @Override // p003X.AbstractC145500enj
    public int getFlexDirection() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC145500enj
    public List<C3248b> getFlexLinesInternal() {
        return this.f25948LJ;
    }

    @Override // p003X.AbstractC145500enj
    public int getFlexWrap() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC145500enj
    public int getMaxLine() {
        return this.LJIILIIL;
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // p003X.AbstractC145500enj
    public final void LIZ(View view, int i, int i2, C3248b c3248b) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), c3248b}, this, LIZ, false, 10).isSupported) {
            return;
        }
        calculateItemDecorationsForChild(view, LJIIJ);
        if (LIZ()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            c3248b.LJFF += leftDecorationWidth;
            c3248b.LJI += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        c3248b.LJFF += topDecorationHeight;
        c3248b.LJI += topDecorationHeight;
    }

    @Override // p003X.AbstractC145500enj
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJJI.get(i);
        return view != null ? view : this.LJIILL.getViewForPosition(i);
    }

    @Override // p003X.AbstractC145500enj
    public final View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        return proxy.isSupported ? (View) proxy.result : LIZ(i);
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 14);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    private void LIZ(RecyclerView.Recycler recycler, C147112fDm c147112fDm) {
        if (!PatchProxy.proxy(new Object[]{recycler, c147112fDm}, this, LIZ, false, 45).isSupported && c147112fDm.LJIIJ) {
            if (c147112fDm.LJIIIZ == -1) {
                LIZJ(recycler, c147112fDm);
            } else {
                LIZIZ(recycler, c147112fDm);
            }
        }
    }

    private void LIZIZ(RecyclerView.Recycler recycler, C147112fDm c147112fDm) {
        View childAt;
        int i;
        if (!PatchProxy.proxy(new Object[]{recycler, c147112fDm}, this, LIZ, false, 46).isSupported && c147112fDm.LJI >= 0) {
            if (!LJIIIZ && this.LJFF.LIZIZ == null) {
                throw new AssertionError();
            }
            int childCount = getChildCount();
            if (childCount == 0 || (childAt = getChildAt(0)) == null || (i = this.LJFF.LIZIZ[getPosition(childAt)]) == -1) {
                return;
            }
            C3248b c3248b = this.f25948LJ.get(i);
            int i2 = 0;
            int i3 = -1;
            while (i2 < childCount) {
                View childAt2 = getChildAt(i2);
                if (childAt2 != null) {
                    if (!LIZ(childAt2, c147112fDm.LJI)) {
                        break;
                    } else if (c3248b.LJIILLIIL == getPosition(childAt2)) {
                        if (i >= this.f25948LJ.size() - 1) {
                            break;
                        }
                        i += c147112fDm.LJIIIZ;
                        c3248b = this.f25948LJ.get(i);
                        i3 = i2;
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            i2 = i3;
            LIZ(recycler, 0, i2);
        }
    }

    private boolean LIZ(View view, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 47);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : (LIZ() || !this.LIZLLL) ? this.LJI.LIZIZ(view) <= i : this.LJI.LIZLLL() - this.LJI.LIZ(view) <= i;
    }

    private boolean LIZIZ(View view, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 49);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : (LIZ() || !this.LIZLLL) ? this.LJI.LIZ(view) >= this.LJI.LIZLLL() - i : this.LJI.LIZIZ(view) <= i;
    }

    private void LIZ(RecyclerView.Recycler recycler, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{recycler, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 50).isSupported) {
            return;
        }
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, recycler);
            i2--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int LIZ(com.bytedance.android.live.broadcast.utils.flexlayout.C3248b r28, p003X.C147112fDm r29) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LIZ(com.bytedance.android.live.broadcast.utils.flexlayout.b, X.fDm):int");
    }

    private void LIZ(C147110fDk c147110fDk, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{c147110fDk, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 54).isSupported) {
            return;
        }
        if (z2) {
            LIZJ();
        } else {
            this.LJIIZILJ.LIZJ = false;
        }
        if (!LIZ() && this.LIZLLL) {
            this.LJIIZILJ.LIZIZ = c147110fDk.LIZLLL - getPaddingRight();
        } else {
            this.LJIIZILJ.LIZIZ = this.LJI.LIZJ() - c147110fDk.LIZLLL;
        }
        this.LJIIZILJ.f19639LJ = c147110fDk.LIZIZ;
        C147112fDm c147112fDm = this.LJIIZILJ;
        c147112fDm.LJIIIIZZ = 1;
        c147112fDm.LJIIIZ = 1;
        c147112fDm.LJFF = c147110fDk.LIZLLL;
        C147112fDm c147112fDm2 = this.LJIIZILJ;
        c147112fDm2.LJI = Integer.MIN_VALUE;
        c147112fDm2.LIZLLL = c147110fDk.LIZJ;
        if (!z || this.f25948LJ.size() <= 1 || c147110fDk.LIZJ < 0 || c147110fDk.LIZJ >= this.f25948LJ.size() - 1) {
            return;
        }
        this.LJIIZILJ.LIZLLL++;
        this.LJIIZILJ.f19639LJ += this.f25948LJ.get(c147110fDk.LIZJ).LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LIZ(int, int):void");
    }

    private View LIZ(View view, C3248b c3248b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, c3248b}, this, LIZ, false, 74);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        boolean LIZ2 = LIZ();
        int i = c3248b.LJIIIIZZ;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.LIZLLL && !LIZ2) {
                    if (this.LJI.LIZIZ(view) >= this.LJI.LIZIZ(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.LJI.LIZ(view) <= this.LJI.LIZ(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private boolean LIZ(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), layoutParams}, this, LIZ, false, 85);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : view.isLayoutRequested() || !isMeasurementCacheEnabled() || !LIZLLL(view.getWidth(), i, layoutParams.width) || !LIZLLL(view.getHeight(), i2, layoutParams.height);
    }

    private boolean LIZ(View view, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 92);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 88);
        int intValue = proxy2.isSupported ? ((Integer) proxy2.result).intValue() : getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 90);
        int intValue2 = proxy3.isSupported ? ((Integer) proxy3.result).intValue() : getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 89);
        int intValue3 = proxy4.isSupported ? ((Integer) proxy4.result).intValue() : ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin + getDecoratedRight(view);
        PatchProxyResult proxy5 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 91);
        int intValue4 = proxy5.isSupported ? ((Integer) proxy5.result).intValue() : getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        return z ? (paddingLeft <= intValue && width >= intValue3) && (paddingTop <= intValue2 && height >= intValue4) : (intValue >= width || intValue3 >= paddingLeft) && (intValue2 >= height || intValue4 >= paddingTop);
    }

    @Override // p003X.AbstractC145500enj
    public final boolean LIZ() {
        int i = this.LIZIZ;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(18020);
    }

    private View LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        return getChildAt(0);
    }

    /* renamed from: LJ */
    private void m15880LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported && this.LJIIZILJ == null) {
            this.LJIIZILJ = new C147112fDm((byte) 0);
        }
    }

    private void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 87).isSupported) {
            return;
        }
        this.f25948LJ.clear();
        this.LJIJ.LIZ();
        this.LJIJ.f19637LJ = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new LayoutParams(-2, -2);
    }

    @Override // p003X.AbstractC145500enj
    public int getFlexItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LJIILLIIL.getItemCount();
    }

    private void LIZJ() {
        int widthMode;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported) {
            return;
        }
        if (LIZ()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        C147112fDm c147112fDm = this.LJIIZILJ;
        if (widthMode == 0 || widthMode == Integer.MIN_VALUE) {
            z = true;
        }
        c147112fDm.LIZJ = z;
    }

    private int LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 93);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        View LIZ2 = LIZ(0, getChildCount(), false);
        if (LIZ2 == null) {
            return -1;
        }
        return getPosition(LIZ2);
    }

    private int LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 95);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        View LIZ2 = LIZ(getChildCount() - 1, -1, false);
        if (LIZ2 == null) {
            return -1;
        }
        return getPosition(LIZ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 63);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZJ == 0) {
            return LIZ();
        }
        if (LIZ()) {
            int width = getWidth();
            View view = this.LJJII;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (width <= i) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 64);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZJ == 0) {
            if (LIZ()) {
                return false;
            }
            return true;
        }
        if (!LIZ()) {
            int height = getHeight();
            View view = this.LJJII;
            if (view != null) {
                i = view.getHeight();
            } else {
                i = 0;
            }
            if (height <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // p003X.AbstractC145500enj
    public int getLargestMainSize() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.f25948LJ.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f25948LJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f25948LJ.get(i2).LJFF);
        }
        return i;
    }

    @Override // p003X.AbstractC145500enj
    public int getSumOfCrossSize() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int size = this.f25948LJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f25948LJ.get(i2).LJII;
        }
        return i;
    }

    private void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 57).isSupported || this.LJI != null) {
            return;
        }
        if (LIZ()) {
            if (this.LIZJ != 0) {
                this.LJI = AbstractC147106fDg.LIZIZ(this);
                this.LJII = AbstractC147106fDg.LIZ(this);
                return;
            }
        } else if (this.LIZJ == 0) {
            this.LJI = AbstractC147106fDg.LIZIZ(this);
            this.LJII = AbstractC147106fDg.LIZ(this);
            return;
        }
        this.LJI = AbstractC147106fDg.LIZ(this);
        this.LJII = AbstractC147106fDg.LIZIZ(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (Parcelable) proxy.result;
        }
        SavedState savedState = this.LJIJI;
        if (savedState != null) {
            return new SavedState(savedState, (byte) 0);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View LIZIZ = LIZIZ();
            savedState2.LIZIZ = getPosition(LIZIZ);
            savedState2.LIZJ = this.LJI.LIZ(LIZIZ) - this.LJI.LIZIZ();
            return savedState2;
        }
        savedState2.LIZ();
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p003X.AbstractC145500enj
    public void setFlexLines(List<C3248b> list) {
        this.f25948LJ = list;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 76);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 79);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZIZ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 82);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZJ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 77);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 80);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZIZ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 83);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZJ(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, LIZ, false, 61).isSupported) {
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.LJJII = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!PatchProxy.proxy(new Object[]{parcelable}, this, LIZ, false, 24).isSupported && (parcelable instanceof SavedState)) {
            this.LJIJI = (SavedState) parcelable;
            requestLayout();
        }
    }

    public final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (i != 2) {
            int i2 = this.LIZJ;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    LJFF();
                }
                this.LIZJ = i;
                this.LJI = null;
                this.LJII = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    /* renamed from: LJ */
    public final void m15879LJ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && this.LJIIJJI != i) {
            this.LJIIJJI = i;
            requestLayout();
        }
    }

    public final void LJFF(int i) {
        int i2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported && (i2 = this.LJIIL) != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                LJFF();
            }
            this.LJIIL = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 35).isSupported) {
            return;
        }
        super.onLayoutCompleted(state);
        this.LJIJI = null;
        this.LJIJJ = -1;
        this.LJIJJLI = Integer.MIN_VALUE;
        this.LJJIII = -1;
        this.LJIJ.LIZ();
        this.LJJI.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 59).isSupported) {
            return;
        }
        this.LJIJJ = i;
        this.LJIJJLI = Integer.MIN_VALUE;
        SavedState savedState = this.LJIJI;
        if (savedState != null) {
            savedState.LIZ();
        }
        requestLayout();
    }

    private int LIZJ(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 84);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View LJII = LJII(itemCount);
        View LJIIIIZZ = LJIIIIZZ(itemCount);
        if (state.getItemCount() == 0 || LJII == null || LJIIIIZZ == null) {
            return 0;
        }
        if (!LJIIIZ && this.LJFF.LIZIZ == null) {
            throw new AssertionError();
        }
        return (int) ((Math.abs(this.LJI.LIZIZ(LJIIIIZZ) - this.LJI.LIZ(LJII)) / ((LJII() - LJI()) + 1)) * state.getItemCount());
    }

    private View LJII(int i) {
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 40);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (!LJIIIZ && this.LJFF.LIZIZ == null) {
            throw new AssertionError();
        }
        View LIZJ = LIZJ(0, getChildCount(), i);
        if (LIZJ == null || (i2 = this.LJFF.LIZIZ[getPosition(LIZJ)]) == -1) {
            return null;
        }
        return LIZ(LIZJ, this.f25948LJ.get(i2));
    }

    private View LJIIIIZZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 41);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (!LJIIIZ && this.LJFF.LIZIZ == null) {
            throw new AssertionError();
        }
        View LIZJ = LIZJ(getChildCount() - 1, -1, i);
        if (LIZJ == null) {
            return null;
        }
        return LIZIZ(LIZJ, this.f25948LJ.get(this.LJFF.LIZIZ[getPosition(LIZJ)]));
    }

    @Override // p003X.AbstractC113806UrA
    public PointF computeScrollVectorForPosition(int i) {
        View childAt;
        int i2 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        if (i < getPosition(childAt)) {
            i2 = -1;
        }
        if (LIZ()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    private int LIZIZ(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 81);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View LJII = LJII(itemCount);
        View LJIIIIZZ = LJIIIIZZ(itemCount);
        if (state.getItemCount() != 0 && LJII != null && LJIIIIZZ != null) {
            if (!LJIIIZ && this.LJFF.LIZIZ == null) {
                throw new AssertionError();
            }
            int position = getPosition(LJII);
            int position2 = getPosition(LJIIIIZZ);
            int abs = Math.abs(this.LJI.LIZIZ(LJIIIIZZ) - this.LJI.LIZ(LJII));
            int i = this.LJFF.LIZIZ[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((this.LJFF.LIZIZ[position2] - i) + 1))) + (this.LJI.LIZIZ() - this.LJI.LIZ(LJII)));
            }
        }
        return 0;
    }

    private void LJI(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 30).isSupported || i >= LJII()) {
            return;
        }
        int childCount = getChildCount();
        this.LJFF.LIZJ(childCount);
        this.LJFF.LIZIZ(childCount);
        this.LJFF.LIZLLL(childCount);
        if (!LJIIIZ && this.LJFF.LIZIZ == null) {
            throw new AssertionError();
        }
        if (i >= this.LJFF.LIZIZ.length) {
            return;
        }
        this.LJJIII = i;
        View LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        this.LJIJJ = getPosition(LIZIZ);
        if (!LIZ() && this.LIZLLL) {
            this.LJIJJLI = this.LJI.LIZIZ(LIZIZ) + this.LJI.LJFF();
        } else {
            this.LJIJJLI = this.LJI.LIZ(LIZIZ) - this.LJI.LIZIZ();
        }
    }

    private int LJIIIZ(int i) {
        int height;
        int height2;
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 72);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        LIZLLL();
        boolean LIZ2 = LIZ();
        View view = this.LJJII;
        if (LIZ2) {
            height = view.getWidth();
            height2 = getWidth();
        } else {
            height = view.getHeight();
            height2 = getHeight();
        }
        if (getLayoutDirection() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((height2 + this.LJIJ.f19637LJ) - height, abs);
            } else if (this.LJIJ.f19637LJ + i <= 0) {
                return i;
            } else {
                i2 = this.LJIJ.f19637LJ;
            }
        } else if (i > 0) {
            return Math.min((height2 - this.LJIJ.f19637LJ) - height, i);
        } else {
            if (this.LJIJ.f19637LJ + i >= 0) {
                return i;
            }
            i2 = this.LJIJ.f19637LJ;
        }
        return -i2;
    }

    private int LIZ(RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, LIZ, false, 78);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        LIZLLL();
        View LJII = LJII(itemCount);
        View LJIIIIZZ = LJIIIIZZ(itemCount);
        if (state.getItemCount() == 0 || LJII == null || LJIIIIZZ == null) {
            return 0;
        }
        return Math.min(this.LJI.mo21355LJ(), this.LJI.LIZIZ(LJIIIIZZ) - this.LJI.LIZ(LJII));
    }

    public final void LIZJ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported && this.LIZIZ != i) {
            removeAllViews();
            this.LIZIZ = i;
            this.LJI = null;
            this.LJII = null;
            LJFF();
            requestLayout();
        }
    }

    @Override // p003X.AbstractC145500enj
    public final void LIZ(int i, View view) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), view}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJJI.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        if (PatchProxy.proxy(new Object[]{adapter, adapter2}, this, LIZ, false, 22).isSupported) {
            return;
        }
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        if (PatchProxy.proxy(new Object[]{recyclerView, recycler}, this, LIZ, false, 62).isSupported) {
            return;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.LJIIIIZZ) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    private void LIZJ(RecyclerView.Recycler recycler, C147112fDm c147112fDm) {
        int i;
        View childAt;
        int i2;
        if (PatchProxy.proxy(new Object[]{recycler, c147112fDm}, this, LIZ, false, 48).isSupported || c147112fDm.LJI < 0) {
            return;
        }
        if (!LJIIIZ && this.LJFF.LIZIZ == null) {
            throw new AssertionError();
        }
        int childCount = getChildCount();
        if (childCount == 0 || (childAt = getChildAt(childCount - 1)) == null || (i2 = this.LJFF.LIZIZ[getPosition(childAt)]) == -1) {
            return;
        }
        C3248b c3248b = this.f25948LJ.get(i2);
        int i3 = i;
        while (i3 >= 0) {
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!LIZIZ(childAt2, c147112fDm.LJI)) {
                    break;
                } else if (c3248b.LJIILL == getPosition(childAt2)) {
                    if (i2 <= 0) {
                        break;
                    }
                    i2 += c147112fDm.LJIIIZ;
                    c3248b = this.f25948LJ.get(i2);
                    childCount = i3;
                } else {
                    continue;
                }
            }
            i3--;
        }
        i3 = childCount;
        LIZ(recycler, i3, i);
    }

    private View LIZIZ(View view, C3248b c3248b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, c3248b}, this, LIZ, false, 75);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        boolean LIZ2 = LIZ();
        int childCount = (getChildCount() - c3248b.LJIIIIZZ) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.LIZLLL && !LIZ2) {
                    if (this.LJI.LIZ(view) <= this.LJI.LIZ(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.LJI.LIZIZ(view) >= this.LJI.LIZIZ(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x00c0, code lost:
        if (((java.lang.Boolean) r2.result).booleanValue() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00dc, code lost:
        if (((java.lang.Boolean) r2.result).booleanValue() == false) goto L145;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r21, androidx.recyclerview.widget.RecyclerView.State r22) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    private View LIZ(int i, int i2, boolean z) {
        int i3 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, this, LIZ, false, 97);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (i2 <= i) {
            i3 = -1;
        }
        while (i != i2) {
            View childAt = getChildAt(i);
            if (LIZ(childAt, false)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZIZ(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 25).isSupported) {
            return;
        }
        super.onItemsAdded(recyclerView, i, i2);
        LJI(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        super.onItemsRemoved(recyclerView, i, i2);
        LJI(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 27).isSupported) {
            return;
        }
        super.onItemsUpdated(recyclerView, i, i2);
        LJI(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.proxy(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, LIZ, false, 60).isSupported) {
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.LJIILIIL = -1;
        this.f25948LJ = new ArrayList();
        this.LJFF = new C145499eni(this);
        this.LJIJ = new C147110fDk(this, (byte) 0);
        this.LJIJJ = -1;
        this.LJIJJLI = Integer.MIN_VALUE;
        this.LJIL = Integer.MIN_VALUE;
        this.LJJ = Integer.MIN_VALUE;
        this.LJJI = new SparseArray<>();
        this.LJJIII = -1;
        this.LJJIIJ = new c$a();
        LIZJ(0);
        LIZLLL(1);
        LJFF(4);
        this.LJJIFFI = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r7 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r7 > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int LIZ(int r7, androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9) {
        /*
            r6 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r2[r5] = r0
            r4 = 1
            r2[r4] = r8
            r0 = 2
            r2[r0] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LIZ
            r0 = 71
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L25:
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L72
            if (r7 == 0) goto L72
            r6.LIZLLL()
            X.fDm r0 = r6.LJIIZILJ
            r0.LJIIJ = r4
            boolean r0 = r6.LIZ()
            if (r0 != 0) goto L56
            boolean r0 = r6.LIZLLL
            if (r0 == 0) goto L56
            r3 = 1
            if (r7 >= 0) goto L5a
        L41:
            int r2 = java.lang.Math.abs(r7)
            r6.LIZ(r4, r2)
            X.fDm r0 = r6.LJIIZILJ
            int r1 = r0.LJI
            X.fDm r0 = r6.LJIIZILJ
            int r0 = r6.LIZ(r8, r9, r0)
            int r1 = r1 + r0
            if (r1 >= 0) goto L5c
            return r5
        L56:
            r3 = 0
            if (r7 <= 0) goto L5a
            goto L41
        L5a:
            r4 = -1
            goto L41
        L5c:
            if (r3 == 0) goto L6d
            if (r2 <= r1) goto L62
            int r7 = -r4
            int r7 = r7 * r1
        L62:
            X.fDg r1 = r6.LJI
            int r0 = -r7
            r1.LIZ(r0)
            X.fDm r0 = r6.LJIIZILJ
            r0.LJII = r7
            return r7
        L6d:
            if (r2 <= r1) goto L62
            int r7 = r4 * r1
            goto L62
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LIZ(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    private View LIZJ(int i, int i2, int i3) {
        int position;
        int i4 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 42);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        LIZLLL();
        m15880LJ();
        int LIZIZ = this.LJI.LIZIZ();
        int LIZJ = this.LJI.LIZJ();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.LJI.LIZ(childAt) >= LIZIZ && this.LJI.LIZIZ(childAt) <= LIZJ) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public static boolean LIZLLL(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, LIZ, true, 86);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int LIZ(androidx.recyclerview.widget.RecyclerView.Recycler r30, androidx.recyclerview.widget.RecyclerView.State r31, p003X.C147112fDm r32) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager.LIZ(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, X.fDm):int");
    }

    private void LIZIZ(C147110fDk c147110fDk, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{c147110fDk, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 55).isSupported) {
            return;
        }
        if (z2) {
            LIZJ();
        } else {
            this.LJIIZILJ.LIZJ = false;
        }
        if (!LIZ() && this.LIZLLL) {
            this.LJIIZILJ.LIZIZ = (this.LJJII.getWidth() - c147110fDk.LIZLLL) - this.LJI.LIZIZ();
        } else {
            this.LJIIZILJ.LIZIZ = c147110fDk.LIZLLL - this.LJI.LIZIZ();
        }
        this.LJIIZILJ.f19639LJ = c147110fDk.LIZIZ;
        C147112fDm c147112fDm = this.LJIIZILJ;
        c147112fDm.LJIIIIZZ = 1;
        c147112fDm.LJIIIZ = -1;
        c147112fDm.LJFF = c147110fDk.LIZLLL;
        C147112fDm c147112fDm2 = this.LJIIZILJ;
        c147112fDm2.LJI = Integer.MIN_VALUE;
        c147112fDm2.LIZLLL = c147110fDk.LIZJ;
        if (z && c147110fDk.LIZJ > 0 && this.f25948LJ.size() > c147110fDk.LIZJ) {
            this.LJIIZILJ.LIZLLL--;
            this.LJIIZILJ.f19639LJ -= this.f25948LJ.get(c147110fDk.LIZJ).LJIIIIZZ;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        super.onItemsMoved(recyclerView, i, i2, i3);
        LJI(Math.min(i, i2));
    }

    private int LIZIZ(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 33);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!LIZ() && this.LIZLLL) {
            int LIZIZ = i - this.LJI.LIZIZ();
            if (LIZIZ <= 0) {
                return 0;
            }
            i2 = LIZ(LIZIZ, recycler, state);
        } else {
            int LIZJ2 = this.LJI.LIZJ() - i;
            if (LIZJ2 <= 0) {
                return 0;
            }
            i2 = -LIZ(-LIZJ2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (LIZJ = this.LJI.LIZJ() - i3) > 0) {
            this.LJI.LIZ(LIZJ);
            return LIZJ + i2;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2), obj}, this, LIZ, false, 26).isSupported) {
            return;
        }
        super.onItemsUpdated(recyclerView, i, i2, obj);
        LJI(i);
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LJIILIIL = -1;
        this.f25948LJ = new ArrayList();
        this.LJFF = new C145499eni(this);
        this.LJIJ = new C147110fDk(this, (byte) 0);
        this.LJIJJ = -1;
        this.LJIJJLI = Integer.MIN_VALUE;
        this.LJIL = Integer.MIN_VALUE;
        this.LJJ = Integer.MIN_VALUE;
        this.LJJI = new SparseArray<>();
        this.LJJIII = -1;
        this.LJJIIJ = new c$a();
        RecyclerView.LayoutManager.C0379b properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.LIZ;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.LIZJ) {
                    LIZJ(3);
                } else {
                    LIZJ(2);
                }
            }
        } else if (properties.LIZJ) {
            LIZJ(1);
        } else {
            LIZJ(0);
        }
        LIZLLL(1);
        LJFF(4);
        this.LJJIFFI = context;
    }

    private int LIZ(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!LIZ() && this.LIZLLL) {
            int LIZJ = this.LJI.LIZJ() - i;
            if (LIZJ <= 0) {
                return 0;
            }
            i2 = LIZ(-LIZJ, recycler, state);
        } else {
            int LIZIZ2 = i - this.LJI.LIZIZ();
            if (LIZIZ2 <= 0) {
                return 0;
            }
            i2 = -LIZ(LIZIZ2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (LIZIZ = i3 - this.LJI.LIZIZ()) > 0) {
            this.LJI.LIZ(-LIZIZ);
            return i2 - LIZIZ;
        }
        return i2;
    }

    public static int LIZIZ(FlexboxLayoutManager flexboxLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{flexboxLayoutManager, Integer.valueOf(i), recycler, state}, null, LIZ, true, 68);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, flexboxLayoutManager, LIZ, false, 70);
            if (proxy2.isSupported) {
                return ((Integer) proxy2.result).intValue();
            }
            if (flexboxLayoutManager.LIZ() || (flexboxLayoutManager.LIZJ == 0 && !flexboxLayoutManager.LIZ())) {
                int LIZ2 = flexboxLayoutManager.LIZ(i, recycler, state);
                flexboxLayoutManager.LJJI.clear();
                return LIZ2;
            }
            int LJIIIZ2 = flexboxLayoutManager.LJIIIZ(i);
            flexboxLayoutManager.LJIJ.f19637LJ += LJIIIZ2;
            flexboxLayoutManager.LJII.LIZ(-LJIIIZ2);
            return LJIIIZ2;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static int LIZ(FlexboxLayoutManager flexboxLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{flexboxLayoutManager, Integer.valueOf(i), recycler, state}, null, LIZ, true, 65);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), recycler, state}, flexboxLayoutManager, LIZ, false, 67);
            if (proxy2.isSupported) {
                return ((Integer) proxy2.result).intValue();
            }
            if (flexboxLayoutManager.LIZ() && flexboxLayoutManager.LIZJ != 0) {
                int LJIIIZ2 = flexboxLayoutManager.LJIIIZ(i);
                flexboxLayoutManager.LJIJ.f19637LJ += LJIIIZ2;
                flexboxLayoutManager.LJII.LIZ(-LJIIIZ2);
                return LJIIIZ2;
            }
            int LIZ2 = flexboxLayoutManager.LIZ(i, recycler, state);
            flexboxLayoutManager.LJJI.clear();
            return LIZ2;
        } catch (NullPointerException unused) {
            return 0;
        }
    }
}
