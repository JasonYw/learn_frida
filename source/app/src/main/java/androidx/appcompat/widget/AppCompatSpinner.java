package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138262cuf;
import p003X.AbstractC138316cvY;
import p003X.AbstractView$OnAttachStateChangeListenerC138371cwR;
import p003X.C138253cuW;
import p003X.C138317cvZ;
import p003X.C138491cyN;

/* loaded from: classes17.dex */
public final class AppCompatSpinner extends Spinner implements AbstractC138262cuf {
    public static final int[] LIZJ = {16843505};
    public int LIZ;
    public final Rect LIZIZ;
    public final C138253cuW LIZLLL;

    /* renamed from: LJ */
    public final Context f20230LJ;
    public AbstractView$OnAttachStateChangeListenerC138371cwR LJFF;
    public SpinnerAdapter LJI;
    public final boolean LJII;
    public AbstractC138316cvY LJIIIIZZ;

    public final AbstractC138316cvY getInternalPopup() {
        return this.LJIIIIZZ;
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f20230LJ;
    }

    /* loaded from: classes17.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            static {
                Covode.recordClassIndex(623);
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
        public boolean LIZ;

        static {
            Covode.recordClassIndex(622);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZ = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.LIZ ? (byte) 1 : (byte) 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            c138253cuW.LIZLLL();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.LJIIIIZZ != null) {
            return this.LIZ;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            return abstractC138316cvY.LIZ();
        }
        return super.getPrompt();
    }

    @Override // p003X.AbstractC138262cuf
    public final ColorStateList getSupportBackgroundTintList() {
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            return c138253cuW.LIZIZ();
        }
        return null;
    }

    @Override // p003X.AbstractC138262cuf
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            return c138253cuW.LIZJ();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(619);
    }

    public final void LIZ() {
        int i = Build.VERSION.SDK_INT;
        this.LJIIIIZZ.LIZ(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            return abstractC138316cvY.LJFF();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            return abstractC138316cvY.mo21663LJ();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            return abstractC138316cvY.LIZLLL();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null && abstractC138316cvY.LIZJ()) {
            this.LJIIIIZZ.LIZIZ();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null && abstractC138316cvY.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        savedState.LIZ = z;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            if (!abstractC138316cvY.LIZJ()) {
                LIZ();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // p003X.AbstractC138262cuf
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            c138253cuW.LIZ(colorStateList);
        }
    }

    @Override // p003X.AbstractC138262cuf
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            c138253cuW.LIZ(mode);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            c138253cuW.LIZ();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C138253cuW c138253cuW = this.LIZLLL;
        if (c138253cuW != null) {
            c138253cuW.LIZ(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            abstractC138316cvY.LIZ(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownVerticalOffset(i);
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.LJIIIIZZ != null) {
            this.LIZ = i;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownWidth(i);
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            abstractC138316cvY.LIZ(drawable);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setPopupBackgroundDrawable(drawable);
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C138491cyN.LIZIZ(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            abstractC138316cvY.LIZ(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.LIZ && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
                static {
                    Covode.recordClassIndex(621);
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (!AppCompatSpinner.this.getInternalPopup().LIZJ()) {
                        AppCompatSpinner.this.LIZ();
                    }
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC138371cwR abstractView$OnAttachStateChangeListenerC138371cwR = this.LJFF;
        if (abstractView$OnAttachStateChangeListenerC138371cwR != null && abstractView$OnAttachStateChangeListenerC138371cwR.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        AbstractC138316cvY abstractC138316cvY = this.LJIIIIZZ;
        if (abstractC138316cvY != null) {
            abstractC138316cvY.LIZJ(i);
            this.LJIIIIZZ.LIZIZ(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.LJII) {
            this.LJI = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.LJIIIIZZ != null) {
            Context context = this.f20230LJ;
            if (context == null) {
                context = getContext();
            }
            this.LJIIIIZZ.LIZ(new C138317cvZ(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130774455);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJIIIIZZ != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), LIZ(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final int LIZ(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.LIZIZ);
            return i2 + this.LIZIZ.left + this.LIZIZ.right;
        }
        return i2;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r1 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, android.content.res.Resources.Theme r14) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.LIZIZ = r0
            android.content.Context r0 = r9.getContext()
            p003X.C138270cun.LIZ(r0)
            r8 = 5
            int[] r0 = new int[r8]
            r0 = {x00d0: FILL_ARRAY_DATA  , data: [16842930, 16843126, 16843131, 16843362, 2130773940} // fill-array
            r5 = 0
            X.cum r4 = p003X.C138269cum.LIZ(r10, r11, r0, r12, r5)
            X.cuW r0 = new X.cuW
            r0.<init>(r9)
            r9.LIZLLL = r0
            r0 = 4
            int r1 = r4.LJI(r0, r5)
            if (r1 == 0) goto L36
            androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
            r0.<init>(r10, r1)
            r9.f20230LJ = r0
        L31:
            r0 = -1
            r3 = 0
            if (r13 != r0) goto L58
            goto L39
        L36:
            r9.f20230LJ = r10
            goto L31
        L39:
            int[] r0 = androidx.appcompat.widget.AppCompatSpinner.LIZJ     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L58
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r0, r12, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L58
            boolean r0 = r1.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
            if (r0 == 0) goto L55
            int r13 = r1.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L53
            goto L55
        L4a:
            r0 = move-exception
            if (r1 == 0) goto L52
            r1.recycle()
            throw r0
        L51:
            r0 = move-exception
        L52:
            throw r0
        L53:
            if (r1 == 0) goto L58
        L55:
            r1.recycle()
        L58:
            r6 = 2
            r2 = 1
            if (r13 == 0) goto Lbf
            if (r13 != r2) goto L92
            X.cvc r7 = new X.cvc
            android.content.Context r0 = r9.f20230LJ
            r7.<init>(r9, r0, r11, r12)
            android.content.Context r1 = r9.f20230LJ
            int[] r0 = new int[r8]
            r0 = {x00de: FILL_ARRAY_DATA  , data: [16842930, 16843126, 16843131, 16843362, 2130773940} // fill-array
            X.cum r8 = p003X.C138269cum.LIZ(r1, r11, r0, r12, r5)
            r1 = 3
            r0 = -2
            int r0 = r8.LJFF(r1, r0)
            r9.LIZ = r0
            android.graphics.drawable.Drawable r0 = r8.LIZ(r2)
            r7.LIZ(r0)
            java.lang.String r0 = r4.LIZLLL(r6)
            r7.LIZ(r0)
            r8.LIZ()
            r9.LJIIIIZZ = r7
            androidx.appcompat.widget.AppCompatSpinner$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$1
            r0.<init>(r9)
            r9.LJFF = r0
        L92:
            android.content.res.TypedArray r0 = r4.LIZ
            java.lang.CharSequence[] r5 = r0.getTextArray(r5)
            if (r5 == 0) goto Lab
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r10, r0, r5)
            r0 = 2131697907(0x7f0f20f3, float:1.9025069E38)
            r1.setDropDownViewResource(r0)
            r9.setAdapter(r1)
        Lab:
            r4.LIZ()
            r9.LJII = r2
            android.widget.SpinnerAdapter r0 = r9.LJI
            if (r0 == 0) goto Lb9
            r9.setAdapter(r0)
            r9.LJI = r3
        Lb9:
            X.cuW r0 = r9.LIZLLL
            r0.LIZ(r11, r12)
            return
        Lbf:
            X.cva r0 = new X.cva
            r0.<init>(r9)
            r9.LJIIIIZZ = r0
            X.cvY r1 = r9.LJIIIIZZ
            java.lang.String r0 = r4.LIZLLL(r6)
            r1.LIZ(r0)
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
