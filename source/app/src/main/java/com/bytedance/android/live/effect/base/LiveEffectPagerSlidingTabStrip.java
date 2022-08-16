package com.bytedance.android.live.effect.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import p003X.AbstractC89415LKv;
import p003X.AbstractC89416LKw;
import p003X.C101486Pxw;
import p003X.C116971W2r;
import p003X.C453683ww;
import p003X.C89413LKt;
import p003X.C89414LKu;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes5.dex */
public class LiveEffectPagerSlidingTabStrip extends HorizontalScrollView {
    public static ChangeQuickRedirect LIZ;
    public static final int[] LJIIIZ = {16842901, 16842904};
    public ViewPager.OnPageChangeListener LIZIZ;
    public LinearLayout LIZJ;
    public ViewPager LIZLLL;

    /* renamed from: LJ */
    public int f26214LJ;
    public float LJFF;
    public int LJI;
    public double LJII;
    public boolean LJIIIIZZ;
    public LinearLayout.LayoutParams LJIIJ;
    public LinearLayout.LayoutParams LJIIJJI;
    public final C89413LKt LJIIL;
    public int LJIILIIL;
    public Paint LJIILJJIL;
    public Paint LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public ColorStateList LJJIIJZLJL;
    public Typeface LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public Locale LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public SparseArray<String> LJJIL;
    public SparseArray<String> LJJIZ;
    public SparseArray<String> LJJJ;
    public int LJJJI;
    public int LJJJIL;

    public int getDividerColor() {
        return this.LJIJJ;
    }

    public int getDividerPadding() {
        return this.LJJIFFI;
    }

    public int getIndicatorColor() {
        return this.LJIJ;
    }

    public int getIndicatorHeight() {
        return this.LJJ;
    }

    public int getIndicatorWidth() {
        return this.LJIILLIIL;
    }

    public ViewPager getPager() {
        return this.LIZLLL;
    }

    public int getScrollOffset() {
        return this.LJIL;
    }

    public boolean getShouldExpand() {
        return this.LJIJJLI;
    }

    public int getTabBackground() {
        return this.LJJIJIIJI;
    }

    public int getTabPaddingLeftRight() {
        return this.LJJII;
    }

    public ColorStateList getTextColor() {
        return this.LJJIIJZLJL;
    }

    public int getTextSize() {
        return this.LJJIIJ;
    }

    public int getUnderlineColor() {
        return this.LJIJI;
    }

    public int getUnderlineHeight() {
        return this.LJJI;
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.bytedance.android.live.effect.base.LiveEffectPagerSlidingTabStrip.SavedState.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24348);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.effect.base.LiveEffectPagerSlidingTabStrip$SavedState] */
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

        static {
            Covode.recordClassIndex(24347);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZIZ = parcel.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZIZ);
        }
    }

    static {
        Covode.recordClassIndex(24344);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (Parcelable) proxy.result;
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZIZ = this.f26214LJ;
        return savedState;
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        for (int i = 0; i < this.LJIILIIL; i++) {
            View childAt = this.LIZJ.getChildAt(i);
            childAt.setBackgroundResource(this.LJJIJIIJI);
            Object tag = childAt.getTag();
            if (tag instanceof C89414LKu) {
                C89414LKu c89414LKu = (C89414LKu) tag;
                c89414LKu.LIZ.setTextSize(0, this.LJJIIJ);
                c89414LKu.LIZ.setTypeface(this.LJJIIZ, this.LJJIIZI);
                c89414LKu.LIZ.setTextColor(this.LJJIIJZLJL);
                if (this.LJIIIIZZ) {
                    int i2 = Build.VERSION.SDK_INT;
                    c89414LKu.LIZ.setAllCaps(true);
                }
            }
        }
    }

    private void LIZ() {
        View LIZ2;
        MethodCollector.m14708i(1646);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1646);
            return;
        }
        this.LIZJ.removeAllViews();
        this.LJIILIIL = this.LIZLLL.getAdapter().getCount();
        for (int i = 0; i < this.LJIILIIL; i++) {
            if (this.LIZLLL.getAdapter() instanceof AbstractC89415LKv) {
                getContext();
                LIZ(i, ((AbstractC89415LKv) this.LIZLLL.getAdapter()).LIZ());
            } else if (this.LIZLLL.getAdapter() instanceof AbstractC89416LKw) {
                int LIZ3 = ((AbstractC89416LKw) this.LIZLLL.getAdapter()).LIZ();
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(LIZ3)}, this, LIZ, false, 6).isSupported) {
                    ImageButton imageButton = new ImageButton(getContext());
                    imageButton.setImageResource(LIZ3);
                    LIZ(i, imageButton);
                }
            } else {
                CharSequence pageTitle = this.LIZLLL.getAdapter().getPageTitle(i);
                if (pageTitle != null) {
                    String charSequence = pageTitle.toString();
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), charSequence}, this, LIZ, false, 3).isSupported) {
                        C89414LKu c89414LKu = new C89414LKu();
                        if (this.LJJIJIL > 0 && this.LJJIJL > 0) {
                            LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), this.LJJIJIL, (ViewGroup) null, false);
                            c89414LKu.LIZ = (TextView) LIZ2.findViewById(this.LJJIJL);
                            c89414LKu.LIZJ = LIZ2.findViewById(this.LJJIJLIJ);
                        } else {
                            if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                                LIZ2 = new C453683ww(getContext());
                                c89414LKu.LIZIZ = LIZ2.findViewById(2131191369);
                            } else {
                                LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131699098, (ViewGroup) null, false);
                                c89414LKu.LIZIZ = LIZ2.findViewById(2131172719);
                            }
                            c89414LKu.LIZIZ.setVisibility(8);
                            c89414LKu.LIZJ = LIZ2.findViewById(2131167533);
                            c89414LKu.LIZJ.setVisibility(8);
                            c89414LKu.LIZ = (TextView) LIZ2.findViewById(2131171162);
                        }
                        c89414LKu.LIZ.setText(charSequence);
                        c89414LKu.LIZ.setGravity(17);
                        c89414LKu.LIZ.setSingleLine();
                        LIZ2.setTag(c89414LKu);
                        LIZ(i, LIZ2);
                    }
                }
            }
        }
        LIZIZ();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.live.effect.base.LiveEffectPagerSlidingTabStrip.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24345);
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                LiveEffectPagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LiveEffectPagerSlidingTabStrip liveEffectPagerSlidingTabStrip = LiveEffectPagerSlidingTabStrip.this;
                liveEffectPagerSlidingTabStrip.f26214LJ = liveEffectPagerSlidingTabStrip.LIZLLL.getCurrentItem();
                LiveEffectPagerSlidingTabStrip liveEffectPagerSlidingTabStrip2 = LiveEffectPagerSlidingTabStrip.this;
                liveEffectPagerSlidingTabStrip2.LIZ(liveEffectPagerSlidingTabStrip2.f26214LJ, true);
                LiveEffectPagerSlidingTabStrip liveEffectPagerSlidingTabStrip3 = LiveEffectPagerSlidingTabStrip.this;
                liveEffectPagerSlidingTabStrip3.LIZ(liveEffectPagerSlidingTabStrip3.f26214LJ, 0);
            }
        });
        MethodCollector.m14707o(1646);
    }

    public void setAllCaps(boolean z) {
        this.LJIIIIZZ = z;
    }

    public void setIconResId(int i) {
        this.LJJIJLIJ = i;
    }

    public void setIndicatorBottomMargin(int i) {
        this.LJJJI = i;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.LIZIZ = onPageChangeListener;
    }

    public void setTabBackground(int i) {
        this.LJJIJIIJI = i;
    }

    public void setTextSelectedStyle(int i) {
        this.LJJJIL = i;
    }

    public LiveEffectPagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJIJJ = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJJIFFI = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIJ = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJJ = i;
        invalidate();
    }

    public void setIndicatorRadius(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 32).isSupported) {
            return;
        }
        this.LJIIZILJ = i;
        LIZIZ();
    }

    public void setIndicatorWidth(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        this.LJIILLIIL = i;
        LIZIZ();
    }

    public void setScrollOffset(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        this.LJIL = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        this.LJIJJLI = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        this.LJJII = i;
        LIZIZ();
    }

    public void setTextSize(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 26).isSupported) {
            return;
        }
        this.LJJIIJ = i;
        LIZIZ();
    }

    public void setUnderlineColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJIJI = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        this.LJJI = i;
        invalidate();
    }

    public final void LIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 24).isSupported && this.LIZJ.getChildCount() > i) {
            Object tag = this.LIZJ.getChildAt(i).getTag();
            if (tag instanceof C89414LKu) {
                ((C89414LKu) tag).LIZIZ.setVisibility(0);
            }
        }
    }

    public final void LIZIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 25).isSupported && this.LIZJ.getChildCount() > i) {
            Object tag = this.LIZJ.getChildAt(i).getTag();
            if (tag instanceof C89414LKu) {
                ((C89414LKu) tag).LIZIZ.setVisibility(8);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, LIZ, false, 33).isSupported) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f26214LJ = savedState.LIZIZ;
        requestLayout();
    }

    public void setDividerColorResource(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        this.LJIJJ = C116971W2r.LIZ(getResources(), i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJIJ = C116971W2r.LIZ(getResources(), i);
        invalidate();
    }

    public void setTextColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 27).isSupported) {
            return;
        }
        this.LJJIIJZLJL = ColorStateList.valueOf(i);
        LIZIZ();
    }

    public void setTextColorResource(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        this.LJJIIJZLJL = getResources().getColorStateList(i);
        LIZIZ();
    }

    public void setUnderlineColorResource(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJIJI = C116971W2r.LIZ(getResources(), i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (PatchProxy.proxy(new Object[]{viewPager}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZLLL = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.LJIIL);
            LIZ();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter INSTANCE.");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        MethodCollector.m14708i(1648);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(1648);
            return;
        }
        super.onDraw(canvas);
        if (!isInEditMode() && this.LJIILIIL != 0) {
            int height = getHeight();
            if (!TextUtils.isEmpty(this.LJJJ.get(this.f26214LJ))) {
                this.LJIILJJIL.setColor(LK5.LIZ(this.LJJJ.get(this.f26214LJ), this.LJIJ));
            } else {
                this.LJIILJJIL.setColor(this.LJIJ);
            }
            View childAt = this.LIZJ.getChildAt(this.f26214LJ);
            float left = childAt.getLeft();
            float right = childAt.getRight();
            if (this.LJFF > 0.0f && (i2 = this.f26214LJ) < this.LJIILIIL - 1) {
                View childAt2 = this.LIZJ.getChildAt(i2 + 1);
                float left2 = childAt2.getLeft();
                float right2 = childAt2.getRight();
                float f = this.LJFF;
                left = (left2 * f) + ((1.0f - f) * left);
                right = (right2 * f) + ((1.0f - f) * right);
            }
            int i3 = this.LJIILLIIL;
            if (i3 != 0) {
                float f2 = ((right - left) - i3) / 2.0f;
                left += f2;
                right -= f2;
            }
            if (this.LJIIZILJ > 0 && Build.VERSION.SDK_INT > 21) {
                int i4 = height - this.LJJ;
                float f3 = height - this.LJJJI;
                int i5 = this.LJIIZILJ;
                canvas.drawRoundRect(left, i4 - i, right, f3, i5, i5, this.LJIILJJIL);
            } else {
                int i6 = height - this.LJJ;
                int i7 = this.LJJJI;
                canvas.drawRect(left, i6 - i7, right, height - i7, this.LJIILJJIL);
            }
            this.LJIILJJIL.setColor(this.LJIJI);
            canvas.drawRect(0.0f, height - this.LJJI, this.LIZJ.getWidth(), height, this.LJIILJJIL);
            this.LJIILL.setColor(this.LJIJJ);
            for (int i8 = 0; i8 < this.LJIILIIL - 1; i8++) {
                View childAt3 = this.LIZJ.getChildAt(i8);
                canvas.drawLine(childAt3.getRight(), this.LJJIFFI, childAt3.getRight(), height - this.LJJIFFI, this.LJIILL);
            }
            MethodCollector.m14707o(1648);
            return;
        }
        MethodCollector.m14707o(1648);
    }

    public LiveEffectPagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void LIZ(final int i, View view) {
        LinearLayout.LayoutParams layoutParams;
        MethodCollector.m14708i(1647);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), view}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1647);
            return;
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.effect.base.LiveEffectPagerSlidingTabStrip.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24346);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LiveEffectPagerSlidingTabStrip.this.LIZLLL.setCurrentItem(i);
            }
        });
        if (this.LJIJJLI) {
            layoutParams = this.LJIIJJI;
        } else {
            layoutParams = this.LJIIJ;
        }
        if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
            int i2 = this.LJJII;
            view.setPadding(i2, 0, i2, 0);
        } else {
            int i3 = this.LJJII;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        this.LIZJ.addView(view, i, layoutParams);
        MethodCollector.m14707o(1647);
    }

    public final void LIZ(int i, int i2) {
        int left;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported || this.LJIILIIL == 0) {
            return;
        }
        if (C101486Pxw.LIZ(getContext())) {
            left = this.LIZJ.getChildAt(i).getLeft() - i2;
        } else {
            left = this.LIZJ.getChildAt(i).getLeft() + i2;
        }
        if (i > 0 || i2 > 0) {
            left -= this.LJIL;
        }
        if (left != this.LJJIJ) {
            this.LJJIJ = left;
            scrollTo(left, 0);
        }
    }

    public final void LIZ(int i, boolean z) {
        int childCount;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported && (childCount = this.LIZJ.getChildCount()) != 0 && i >= 0 && i < childCount) {
            View childAt = this.LIZJ.getChildAt(i);
            childAt.setSelected(z);
            Object tag = childAt.getTag();
            if (tag instanceof C89414LKu) {
                C89414LKu c89414LKu = (C89414LKu) tag;
                if (z) {
                    String str = this.LJJIL.get(i);
                    if (!TextUtils.isEmpty(str) && (c89414LKu.LIZJ instanceof SimpleDraweeView)) {
                        c89414LKu.LIZJ.setVisibility(0);
                        M0Q.LIZ((SimpleDraweeView) c89414LKu.LIZJ, str);
                    }
                    if (!TextUtils.isEmpty(this.LJJJ.get(i))) {
                        c89414LKu.LIZ.setTextColor(LK5.LIZ(this.LJJJ.get(i), this.LJIJ));
                    }
                } else {
                    String str2 = this.LJJIZ.get(i);
                    if (!TextUtils.isEmpty(str2) && (c89414LKu.LIZJ instanceof SimpleDraweeView)) {
                        c89414LKu.LIZJ.setVisibility(0);
                        M0Q.LIZ((SimpleDraweeView) c89414LKu.LIZJ, str2);
                    }
                    c89414LKu.LIZ.setTextColor(this.LJJIIJZLJL);
                }
                if (this.LJJJIL == 1) {
                    if (z) {
                        c89414LKu.LIZ.setTypeface(Typeface.DEFAULT_BOLD);
                    } else {
                        c89414LKu.LIZ.setTypeface(Typeface.DEFAULT);
                    }
                }
            }
        }
    }

    public LiveEffectPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1645);
        this.LJIIL = new C89413LKt(this, (byte) 0);
        this.f26214LJ = 0;
        this.LJFF = 0.0f;
        this.LJI = 0;
        this.LJII = 0.5d;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJIJ = 16737894;
        this.LJIJI = 436207616;
        this.LJIJJ = 436207616;
        this.LJIJJLI = false;
        this.LJIIIIZZ = true;
        this.LJIL = 52;
        this.LJJ = 8;
        this.LJJI = 2;
        this.LJJIFFI = 12;
        this.LJJII = 24;
        this.LJJIII = 1;
        this.LJJIIJ = 12;
        this.LJJIIJZLJL = ColorStateList.valueOf(16737894);
        this.LJJIIZ = null;
        this.LJJIIZI = 1;
        this.LJJIJ = 0;
        this.LJJIJIIJI = 2130855695;
        this.LJJIL = new SparseArray<>();
        this.LJJIZ = new SparseArray<>();
        this.LJJJ = new SparseArray<>();
        this.LJJJI = 0;
        this.LJJJIL = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        this.LIZJ = new LinearLayout(context);
        this.LIZJ.setOrientation(0);
        this.LIZJ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.LIZJ);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.LJIL = (int) TypedValue.applyDimension(1, this.LJIL, displayMetrics);
        this.LJJ = (int) TypedValue.applyDimension(1, this.LJJ, displayMetrics);
        this.LJJI = (int) TypedValue.applyDimension(1, this.LJJI, displayMetrics);
        this.LJJIFFI = (int) TypedValue.applyDimension(1, this.LJJIFFI, displayMetrics);
        this.LJJII = (int) TypedValue.applyDimension(1, this.LJJII, displayMetrics);
        this.LJJIII = (int) TypedValue.applyDimension(1, this.LJJIII, displayMetrics);
        this.LJJIIJ = (int) TypedValue.applyDimension(1, this.LJJIIJ, displayMetrics);
        this.LJIILLIIL = (int) TypedValue.applyDimension(1, this.LJIILLIIL, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LJIIIZ);
        this.LJJIIJ = obtainStyledAttributes.getDimensionPixelSize(0, this.LJJIIJ);
        this.LJJIIJZLJL = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{2130774889, 2130774890, 2130774891, 2130774892, 2130774893, 2130774894, 2130774895, 2130774896, 2130774897, 2130774898, 2130774899, 2130774900, 2130774901, 2130774902, 2130774903, 2130774904});
        this.LJIJ = obtainStyledAttributes2.getColor(3, this.LJIJ);
        this.LJIJI = obtainStyledAttributes2.getColor(14, this.LJIJI);
        this.LJIJJ = obtainStyledAttributes2.getColor(1, this.LJIJJ);
        this.LJJ = obtainStyledAttributes2.getDimensionPixelSize(4, this.LJJ);
        this.LJJI = obtainStyledAttributes2.getDimensionPixelSize(15, this.LJJI);
        this.LJJIFFI = obtainStyledAttributes2.getDimensionPixelSize(2, this.LJJIFFI);
        this.LJJII = obtainStyledAttributes2.getDimensionPixelSize(7, this.LJJII);
        this.LJJIJIIJI = obtainStyledAttributes2.getResourceId(0, this.LJJIJIIJI);
        this.LJIJJLI = obtainStyledAttributes2.getBoolean(9, this.LJIJJLI);
        this.LJIL = obtainStyledAttributes2.getDimensionPixelSize(8, this.LJIL);
        this.LJIIIIZZ = obtainStyledAttributes2.getBoolean(10, this.LJIIIIZZ);
        this.LJJIIJ = obtainStyledAttributes2.getDimensionPixelSize(12, this.LJJIIJ);
        this.LJJIIJZLJL = obtainStyledAttributes2.getColorStateList(11);
        this.LJIILLIIL = obtainStyledAttributes2.getDimensionPixelSize(6, this.LJIILLIIL);
        this.LJIIZILJ = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        this.LJJIIZI = obtainStyledAttributes2.getInt(13, 1);
        obtainStyledAttributes2.recycle();
        this.LJIILJJIL = new Paint();
        this.LJIILJJIL.setAntiAlias(true);
        this.LJIILJJIL.setStyle(Paint.Style.FILL);
        this.LJIILL = new Paint();
        this.LJIILL.setAntiAlias(true);
        this.LJIILL.setStrokeWidth(this.LJJIII);
        this.LJIIJ = new LinearLayout.LayoutParams(-2, -1);
        this.LJIIJJI = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.LJJIJIIJIL == null) {
            this.LJJIJIIJIL = getResources().getConfiguration().locale;
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = ColorStateList.valueOf(16737894);
        }
        MethodCollector.m14707o(1645);
    }
}
