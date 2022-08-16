package com.bytedance.android.live.broadcast.utils.flexlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC145500enj;
import p003X.C145499eni;

/* loaded from: classes19.dex */
public final class FlexboxLayout extends ViewGroup implements AbstractC145500enj {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f25946LJ;
    public int LJFF;
    public int LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int[] LJIILIIL;
    public SparseIntArray LJIILJJIL;
    public C145499eni LJIILL;
    public List<C3248b> LJIILLIIL;
    public c$a LJIIZILJ;

    static {
        Covode.recordClassIndex(18017);
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(View view) {
        return 0;
    }

    @Override // p003X.AbstractC145500enj
    public final void LIZ(int i, View view) {
    }

    /* loaded from: classes19.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayout.LayoutParams.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18019);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayout$LayoutParams, java.lang.Object] */
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
        public int LIZIZ;
        public float LIZJ;
        public float LIZLLL;

        /* renamed from: LJ */
        public int f25947LJ;
        public float LJFF;
        public int LJI;
        public int LJII;
        public int LJIIIIZZ;
        public int LJIIIZ;
        public boolean LJIIJ;

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
        public final int LIZJ() {
            return this.LIZIZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final float LIZLLL() {
            return this.LIZJ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        /* renamed from: LJ */
        public final float mo15878LJ() {
            return this.LIZLLL;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJFF() {
            return this.f25947LJ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJI() {
            return this.LJI;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJII() {
            return this.LJII;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIIIIZZ() {
            return this.LJIIIIZZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final int LJIIIZ() {
            return this.LJIIIZ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final boolean LJIIJ() {
            return this.LJIIJ;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final float LJIIJJI() {
            return this.LJFF;
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
            Covode.recordClassIndex(18018);
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final void LIZ(int i) {
            this.LJI = i;
        }

        @Override // com.bytedance.android.live.broadcast.utils.flexlayout.FlexItem
        public final void LIZIZ(int i) {
            this.LJII = i;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.LIZIZ = 1;
            this.LIZLLL = 1.0f;
            this.f25947LJ = -1;
            this.LJFF = -1.0f;
            this.LJI = -1;
            this.LJII = -1;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIZ = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.LIZIZ = 1;
            this.LIZLLL = 1.0f;
            this.f25947LJ = -1;
            this.LJFF = -1.0f;
            this.LJI = -1;
            this.LJII = -1;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIZ = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.LIZIZ = 1;
            this.LIZLLL = 1.0f;
            this.f25947LJ = -1;
            this.LJFF = -1.0f;
            this.LJI = -1;
            this.LJII = -1;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LIZIZ = layoutParams.LIZIZ;
            this.LIZJ = layoutParams.LIZJ;
            this.LIZLLL = layoutParams.LIZLLL;
            this.f25947LJ = layoutParams.f25947LJ;
            this.LJFF = layoutParams.LJFF;
            this.LJI = layoutParams.LJI;
            this.LJII = layoutParams.LJII;
            this.LJIIIIZZ = layoutParams.LJIIIIZZ;
            this.LJIIIZ = layoutParams.LJIIIZ;
            this.LJIIJ = layoutParams.LJIIJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.LIZIZ = 1;
            this.LIZLLL = 1.0f;
            this.f25947LJ = -1;
            this.LJFF = -1.0f;
            this.LJI = -1;
            this.LJII = -1;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readFloat();
            this.LIZLLL = parcel.readFloat();
            this.f25947LJ = parcel.readInt();
            this.LJFF = parcel.readFloat();
            this.LJI = parcel.readInt();
            this.LJII = parcel.readInt();
            this.LJIIIIZZ = parcel.readInt();
            this.LJIIIZ = parcel.readInt();
            this.LJIIJ = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            parcel.writeInt(this.LIZIZ);
            parcel.writeFloat(this.LIZJ);
            parcel.writeFloat(this.LIZLLL);
            parcel.writeInt(this.f25947LJ);
            parcel.writeFloat(this.LJFF);
            parcel.writeInt(this.LJI);
            parcel.writeInt(this.LJII);
            parcel.writeInt(this.LJIIIIZZ);
            parcel.writeInt(this.LJIIIZ);
            parcel.writeByte(this.LJIIJ ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.LIZIZ = 1;
            this.LIZLLL = 1.0f;
            this.f25947LJ = -1;
            this.LJFF = -1.0f;
            this.LJI = -1;
            this.LJII = -1;
            this.LJIIIIZZ = ViewCompat.MEASURED_SIZE_MASK;
            this.LJIIIZ = ViewCompat.MEASURED_SIZE_MASK;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130773488, 2130773523, 2130773524, 2130773525, 2130773550, 2130773551, 2130773552, 2130773553, 2130773555, 2130773566});
            this.LIZIZ = obtainStyledAttributes.getInt(8, 1);
            this.LIZJ = obtainStyledAttributes.getFloat(2, 0.0f);
            this.LIZLLL = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f25947LJ = obtainStyledAttributes.getInt(0, -1);
            this.LJFF = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.LJI = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.LJII = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.LJIIIIZZ = obtainStyledAttributes.getDimensionPixelSize(5, ViewCompat.MEASURED_SIZE_MASK);
            this.LJIIIZ = obtainStyledAttributes.getDimensionPixelSize(4, ViewCompat.MEASURED_SIZE_MASK);
            this.LJIIJ = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // p003X.AbstractC145500enj
    public final int getAlignContent() {
        return this.LJFF;
    }

    @Override // p003X.AbstractC145500enj
    public final int getAlignItems() {
        return this.f25946LJ;
    }

    public final Drawable getDividerDrawableHorizontal() {
        return this.LJII;
    }

    public final Drawable getDividerDrawableVertical() {
        return this.LJIIIIZZ;
    }

    @Override // p003X.AbstractC145500enj
    public final int getFlexDirection() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC145500enj
    public final List<C3248b> getFlexLinesInternal() {
        return this.LJIILLIIL;
    }

    @Override // p003X.AbstractC145500enj
    public final int getFlexWrap() {
        return this.LIZJ;
    }

    public final int getJustifyContent() {
        return this.LIZLLL;
    }

    @Override // p003X.AbstractC145500enj
    public final int getMaxLine() {
        return this.LJI;
    }

    public final int getShowDividerHorizontal() {
        return this.LJIIIZ;
    }

    public final int getShowDividerVertical() {
        return this.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(boolean r32, boolean r33, int r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayout.LIZ(boolean, boolean, int, int, int, int):void");
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 29);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ()) {
            if (LIZIZ(i, i2)) {
                i4 = 0 + this.LJIIL;
            }
            if ((this.LJIIJ & 4) <= 0) {
                return i4;
            }
            i3 = this.LJIIL;
        } else {
            if (LIZIZ(i, i2)) {
                i4 = 0 + this.LJIIJJI;
            }
            if ((this.LJIIIZ & 4) <= 0) {
                return i4;
            }
            i3 = this.LJIIJJI;
        }
        return i4 + i3;
    }

    @Override // p003X.AbstractC145500enj
    public final void LIZ(C3248b c3248b) {
        if (PatchProxy.proxy(new Object[]{c3248b}, this, LIZ, false, 30).isSupported) {
            return;
        }
        if (LIZ()) {
            if ((this.LJIIJ & 4) <= 0) {
                return;
            }
            c3248b.LJFF += this.LJIIL;
            c3248b.LJI += this.LJIIL;
        } else if ((this.LJIIIZ & 4) <= 0) {
        } else {
            c3248b.LJFF += this.LJIIJJI;
            c3248b.LJI += this.LJIIJJI;
        }
    }

    @Override // p003X.AbstractC145500enj
    public final void LIZ(View view, int i, int i2, C3248b c3248b) {
        if (!PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), c3248b}, this, LIZ, false, 33).isSupported && LIZIZ(i, i2)) {
            if (LIZ()) {
                c3248b.LJFF += this.LJIIL;
                c3248b.LJI += this.LJIIL;
                return;
            }
            c3248b.LJFF += this.LJIIJJI;
            c3248b.LJI += this.LJIIJJI;
        }
    }

    @Override // p003X.AbstractC145500enj
    public final boolean LIZ() {
        int i = this.LIZIZ;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // p003X.AbstractC145500enj
    public final int getFlexItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getChildCount();
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported) {
            return;
        }
        if (this.LJII == null && this.LJIIIIZZ == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    public final List<C3248b> getFlexLines() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(this.LJIILLIIL.size());
        for (C3248b c3248b : this.LJIILLIIL) {
            if (c3248b.LIZ() != 0) {
                arrayList.add(c3248b);
            }
        }
        return arrayList;
    }

    @Override // p003X.AbstractC145500enj
    public final int getLargestMainSize() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = Integer.MIN_VALUE;
        for (C3248b c3248b : this.LJIILLIIL) {
            i = Math.max(i, c3248b.LJFF);
        }
        return i;
    }

    @Override // p003X.AbstractC145500enj
    public final int getSumOfCrossSize() {
        int i;
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int size = this.LJIILLIIL.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3248b c3248b = this.LJIILLIIL.get(i4);
            if (LIZLLL(i4)) {
                if (LIZ()) {
                    i2 = this.LJIIJJI;
                } else {
                    i2 = this.LJIIL;
                }
                i3 += i2;
            }
            if (LJFF(i4)) {
                if (LIZ()) {
                    i = this.LJIIJJI;
                } else {
                    i = this.LJIIL;
                }
                i3 += i;
            }
            i3 += c3248b.LJII;
        }
        return i3;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p003X.AbstractC145500enj
    public final void setFlexLines(List<C3248b> list) {
        this.LJIILLIIL = list;
    }

    @Override // p003X.AbstractC145500enj
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        return getChildAt(i);
    }

    @Override // p003X.AbstractC145500enj
    public final View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        return LIZJ(i);
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 34).isSupported) {
            return;
        }
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public final void setShowDivider(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 37).isSupported) {
            return;
        }
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    private View LIZJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (i >= 0) {
            int[] iArr = this.LJIILIIL;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: LJ */
    private boolean m15881LJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 44);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LJIILLIIL.get(i2).LIZ() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{attributeSet}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (ViewGroup.LayoutParams) proxy.result;
        }
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void setAlignContent(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 26).isSupported && this.LJFF != i) {
            this.LJFF = i;
            requestLayout();
        }
    }

    public final void setAlignItems(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 25).isSupported && this.f25946LJ != i) {
            this.f25946LJ = i;
            requestLayout();
        }
    }

    public final void setDividerDrawableHorizontal(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 35).isSupported || drawable == this.LJII) {
            return;
        }
        this.LJII = drawable;
        if (drawable != null) {
            this.LJIIJJI = drawable.getIntrinsicHeight();
        } else {
            this.LJIIJJI = 0;
        }
        LIZIZ();
        requestLayout();
    }

    public final void setDividerDrawableVertical(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 36).isSupported || drawable == this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = drawable;
        if (drawable != null) {
            this.LJIIL = drawable.getIntrinsicWidth();
        } else {
            this.LJIIL = 0;
        }
        LIZIZ();
        requestLayout();
    }

    public final void setFlexDirection(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22).isSupported && this.LIZIZ != i) {
            this.LIZIZ = i;
            requestLayout();
        }
    }

    public final void setFlexWrap(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 23).isSupported && this.LIZJ != i) {
            this.LIZJ = i;
            requestLayout();
        }
    }

    public final void setJustifyContent(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 24).isSupported && this.LIZLLL != i) {
            this.LIZLLL = i;
            requestLayout();
        }
    }

    public final void setMaxLine(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 27).isSupported && this.LJI != i) {
            this.LJI = i;
            requestLayout();
        }
    }

    public final void setShowDividerHorizontal(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 39).isSupported && i != this.LJIIIZ) {
            this.LJIIIZ = i;
            requestLayout();
        }
    }

    public final void setShowDividerVertical(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 38).isSupported && i != this.LJIIJ) {
            this.LJIIJ = i;
            requestLayout();
        }
    }

    private boolean LIZLLL(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i >= 0 && i < this.LJIILLIIL.size()) {
            if (m15881LJ(i)) {
                if (LIZ()) {
                    if ((this.LJIIIZ & 1) != 0) {
                        return true;
                    }
                    return false;
                } else if ((this.LJIIJ & 1) != 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (LIZ()) {
                if ((this.LJIIIZ & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.LJIIJ & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean LJFF(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i >= 0 && i < this.LJIILLIIL.size()) {
            for (int i2 = i + 1; i2 < this.LJIILLIIL.size(); i2++) {
                if (this.LJIILLIIL.get(i2).LIZ() > 0) {
                    return false;
                }
            }
            if (LIZ()) {
                if ((this.LJIIIZ & 4) != 0) {
                    return true;
                }
                return false;
            } else if ((this.LJIIJ & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutParams}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (ViewGroup.LayoutParams) proxy.result;
        }
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 15).isSupported) {
            return;
        }
        if (this.LJIIIIZZ == null && this.LJII == null) {
            return;
        }
        if (this.LJIIIZ == 0 && this.LJIIJ == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (layoutDirection == 1) {
                            z4 = true;
                        }
                        if (this.LIZJ == 2) {
                            z4 = !z4;
                        }
                        LIZIZ(canvas, z4, true);
                        return;
                    }
                    return;
                }
                if (layoutDirection != 1) {
                    z3 = false;
                }
                if (this.LIZJ == 2) {
                    z3 = !z3;
                }
                LIZIZ(canvas, z3, false);
                return;
            }
            if (layoutDirection != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LIZJ != 2) {
                z3 = false;
            }
            LIZ(canvas, z2, z3);
            return;
        }
        if (layoutDirection == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZJ != 2) {
            z3 = false;
        }
        LIZ(canvas, z, z3);
    }

    private boolean LIZJ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 42);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (int i3 = 1; i3 <= i2; i3++) {
            View LIZJ = LIZJ(i - i3);
            if (LIZJ != null && LIZJ.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIILLIIL.clear();
        this.LJIIZILJ.LIZ();
        C145499eni c145499eni = this.LJIILL;
        c$a c_a = this.LJIIZILJ;
        if (!PatchProxy.proxy(new Object[]{c_a, Integer.valueOf(i), Integer.valueOf(i2)}, c145499eni, C145499eni.LIZ, false, 6).isSupported) {
            c145499eni.LIZ(c_a, i, i2, Integer.MAX_VALUE, 0, -1, (List<C3248b>) null);
        }
        this.LJIILLIIL = this.LJIIZILJ.LIZ;
        this.LJIILL.LIZ(i, i2);
        if (this.f25946LJ == 3) {
            for (C3248b c3248b : this.LJIILLIIL) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < c3248b.LJIIIIZZ; i4++) {
                    View LIZJ = LIZJ(c3248b.LJIILL + i4);
                    if (LIZJ != null && LIZJ.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) LIZJ.getLayoutParams();
                        if (this.LIZJ != 2) {
                            i3 = Math.max(i3, LIZJ.getMeasuredHeight() + Math.max(c3248b.LJIIL - LIZJ.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, LIZJ.getMeasuredHeight() + layoutParams.topMargin + Math.max((c3248b.LJIIL - LIZJ.getMeasuredHeight()) + LIZJ.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                c3248b.LJII = i3;
            }
        }
        this.LJIILL.LIZIZ(i, i2, getPaddingTop() + getPaddingBottom());
        this.LJIILL.LIZ();
        LIZ(this.LIZIZ, i, i2, this.LJIIZILJ.LIZIZ);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new SparseIntArray(getChildCount());
        }
        if (this.LJIILL.LIZIZ(this.LJIILJJIL)) {
            this.LJIILIIL = this.LJIILL.LIZ(this.LJIILJJIL);
        }
        int i3 = this.LIZIZ;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.LIZIZ);
            } else if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 8).isSupported) {
                this.LJIILLIIL.clear();
                this.LJIIZILJ.LIZ();
                C145499eni c145499eni = this.LJIILL;
                c$a c_a = this.LJIIZILJ;
                if (!PatchProxy.proxy(new Object[]{c_a, Integer.valueOf(i), Integer.valueOf(i2)}, c145499eni, C145499eni.LIZ, false, 9).isSupported) {
                    c145499eni.LIZ(c_a, i2, i, Integer.MAX_VALUE, 0, -1, (List<C3248b>) null);
                }
                this.LJIILLIIL = this.LJIIZILJ.LIZ;
                this.LJIILL.LIZ(i, i2);
                this.LJIILL.LIZIZ(i, i2, getPaddingLeft() + getPaddingRight());
                this.LJIILL.LIZ();
                LIZ(this.LIZIZ, i, i2, this.LJIIZILJ.LIZIZ);
                return;
            } else {
                return;
            }
        }
        LIZ(i, i2);
    }

    private boolean LIZIZ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 41);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LIZJ(i, i2)) {
            if (LIZ()) {
                if ((this.LJIIJ & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.LJIIIZ & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (LIZ()) {
            if ((this.LJIIJ & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.LJIIIZ & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZ(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m14708i(1337);
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), layoutParams}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(1337);
            return;
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new SparseIntArray(getChildCount());
        }
        this.LJIILIIL = this.LJIILL.LIZ(view, i, layoutParams, this.LJIILJJIL);
        super.addView(view, i, layoutParams);
        MethodCollector.m14707o(1337);
    }

    private void LIZIZ(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        if (PatchProxy.proxy(new Object[]{canvas, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.LJIILLIIL.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3248b c3248b = this.LJIILLIIL.get(i3);
            for (int i4 = 0; i4 < c3248b.LJIIIIZZ; i4++) {
                int i5 = c3248b.LJIILL + i4;
                View LIZJ = LIZJ(i5);
                if (LIZJ != null && LIZJ.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) LIZJ.getLayoutParams();
                    if (LIZIZ(i5, i4)) {
                        if (z2) {
                            top = LIZJ.getBottom() + layoutParams.bottomMargin;
                        } else {
                            top = (LIZJ.getTop() - layoutParams.topMargin) - this.LJIIJJI;
                        }
                        LIZIZ(canvas, c3248b.LIZIZ, top, c3248b.LJII);
                    }
                    if (i4 == c3248b.LJIIIIZZ - 1 && (this.LJIIIZ & 4) > 0) {
                        if (z2) {
                            bottom = (LIZJ.getTop() - layoutParams.topMargin) - this.LJIIJJI;
                        } else {
                            bottom = LIZJ.getBottom() + layoutParams.bottomMargin;
                        }
                        LIZIZ(canvas, c3248b.LIZIZ, bottom, c3248b.LJII);
                    }
                }
            }
            if (LIZLLL(i3)) {
                if (z) {
                    i2 = c3248b.LIZLLL;
                } else {
                    i2 = c3248b.LIZIZ - this.LJIIL;
                }
                LIZ(canvas, i2, paddingTop, max);
            }
            if (LJFF(i3) && (this.LJIIJ & 4) > 0) {
                if (z) {
                    i = c3248b.LIZIZ - this.LJIIL;
                } else {
                    i = c3248b.LIZLLL;
                }
                LIZ(canvas, i, paddingTop, max);
            }
        }
    }

    private void LIZ(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        if (PatchProxy.proxy(new Object[]{canvas, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.LJIILLIIL.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3248b c3248b = this.LJIILLIIL.get(i3);
            for (int i4 = 0; i4 < c3248b.LJIIIIZZ; i4++) {
                int i5 = c3248b.LJIILL + i4;
                View LIZJ = LIZJ(i5);
                if (LIZJ != null && LIZJ.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) LIZJ.getLayoutParams();
                    if (LIZIZ(i5, i4)) {
                        if (z) {
                            left = LIZJ.getRight() + layoutParams.rightMargin;
                        } else {
                            left = (LIZJ.getLeft() - layoutParams.leftMargin) - this.LJIIL;
                        }
                        LIZ(canvas, left, c3248b.LIZJ, c3248b.LJII);
                    }
                    if (i4 == c3248b.LJIIIIZZ - 1 && (this.LJIIJ & 4) > 0) {
                        if (z) {
                            right = (LIZJ.getLeft() - layoutParams.leftMargin) - this.LJIIL;
                        } else {
                            right = LIZJ.getRight() + layoutParams.rightMargin;
                        }
                        LIZ(canvas, right, c3248b.LIZJ, c3248b.LJII);
                    }
                }
            }
            if (LIZLLL(i3)) {
                if (z2) {
                    i2 = c3248b.f25950LJ;
                } else {
                    i2 = c3248b.LIZJ - this.LJIIJJI;
                }
                LIZIZ(canvas, paddingLeft, i2, max);
            }
            if (LJFF(i3) && (this.LJIIIZ & 4) > 0) {
                if (z2) {
                    i = c3248b.LIZJ - this.LJIIJJI;
                } else {
                    i = c3248b.f25950LJ;
                }
                LIZIZ(canvas, paddingLeft, i, max);
            }
        }
    }

    @Override // p003X.AbstractC145500enj
    public final int LIZIZ(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getChildMeasureSpec(i, i2, i3);
    }

    private void LIZ(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[]{canvas, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 18).isSupported || (drawable = this.LJIIIIZZ) == null) {
            return;
        }
        drawable.setBounds(i, i2, this.LJIIL + i, i3 + i2);
        this.LJIIIIZZ.draw(canvas);
    }

    private void LIZIZ(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[]{canvas, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 19).isSupported || (drawable = this.LJII) == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.LJIIJJI + i2);
        this.LJII.draw(canvas);
    }

    private void LIZ(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, ViewCompat.MEASURED_STATE_TOO_SMALL);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, ViewCompat.MEASURED_STATE_TOO_SMALL);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
                sumOfCrossSize = size2;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.LIZIZ;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (layoutDirection == 1) {
                            z4 = true;
                        }
                        if (this.LIZJ == 2) {
                            z4 = !z4;
                        }
                        LIZ(z4, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.LIZIZ);
                }
                if (layoutDirection == 1) {
                    z4 = true;
                }
                if (this.LIZJ == 2) {
                    z4 = !z4;
                }
                LIZ(z4, false, i, i2, i3, i4);
                return;
            }
            if (layoutDirection != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZ(z3, i, i2, i3, i4);
            return;
        }
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ(z2, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayout.LIZ(boolean, int, int, int, int):void");
    }
}
