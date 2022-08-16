package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138414cx8;
import p003X.C138269cum;
import p003X.C138324cvg;
import p003X.C138386cwg;
import p003X.C138405cwz;
import p003X.View$OnClickListenerC138385cwf;

/* loaded from: classes17.dex */
public final class ActivityChooserView extends ViewGroup {
    public final C138386cwg LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public AbstractC138414cx8 LIZLLL;

    /* renamed from: LJ */
    public final DataSetObserver f20228LJ;
    public PopupWindow.OnDismissListener LJFF;
    public boolean LJI;
    public int LJII;
    public final View$OnClickListenerC138385cwf LJIIIIZZ;
    public final View LJIIIZ;
    public final ImageView LJIIJ;
    public final int LJIIJJI;
    public final ViewTreeObserver.OnGlobalLayoutListener LJIIL;
    public C138324cvg LJIILIIL;
    public boolean LJIILJJIL;

    static {
        Covode.recordClassIndex(605);
    }

    public final void setDefaultActionButtonContentDescription(int i) {
    }

    public final C138405cwz getDataModel() {
        return this.LIZ.LIZ;
    }

    private boolean LIZIZ() {
        return getListPopupWindow().LIZJ();
    }

    /* loaded from: classes17.dex */
    public static class InnerLayout extends LinearLayout {
        public static final int[] LIZ = {16842964};

        static {
            Covode.recordClassIndex(606);
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C138269cum LIZ2 = C138269cum.LIZ(context, attributeSet, LIZ);
            setBackgroundDrawable(LIZ2.LIZ(0));
            LIZ2.LIZ();
        }
    }

    public final boolean LIZ() {
        if (LIZIZ()) {
            getListPopupWindow().LIZIZ();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.LJIIL);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C138405cwz c138405cwz = this.LIZ.LIZ;
        if (c138405cwz != null) {
            c138405cwz.registerObserver(this.f20228LJ);
        }
        this.LJIILJJIL = true;
    }

    public final C138324cvg getListPopupWindow() {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new C138324cvg(getContext());
            this.LJIILIIL.LIZ(this.LIZ);
            C138324cvg c138324cvg = this.LJIILIIL;
            c138324cvg.LJIIL = this;
            c138324cvg.LIZ(true);
            C138324cvg c138324cvg2 = this.LJIILIIL;
            View$OnClickListenerC138385cwf view$OnClickListenerC138385cwf = this.LJIIIIZZ;
            c138324cvg2.LJIILJJIL = view$OnClickListenerC138385cwf;
            c138324cvg2.LIZ(view$OnClickListenerC138385cwf);
        }
        return this.LJIILIIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C138405cwz c138405cwz = this.LIZ.LIZ;
        if (c138405cwz != null) {
            c138405cwz.unregisterObserver(this.f20228LJ);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.LJIIL);
        }
        if (LIZIZ()) {
            LIZ();
        }
        this.LJIILJJIL = false;
    }

    public final void setInitialActivityCount(int i) {
        this.LJII = i;
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.LJFF = onDismissListener;
    }

    public final void setProvider(AbstractC138414cx8 abstractC138414cx8) {
        this.LIZLLL = abstractC138414cx8;
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.LJIIJ.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.LJIIJ.setContentDescription(getContext().getString(i));
    }

    public final void setActivityChooserModel(C138405cwz c138405cwz) {
        C138386cwg c138386cwg = this.LIZ;
        C138405cwz c138405cwz2 = c138386cwg.LIZJ.LIZ.LIZ;
        if (c138405cwz2 != null && c138386cwg.LIZJ.isShown()) {
            c138405cwz2.unregisterObserver(c138386cwg.LIZJ.f20228LJ);
        }
        c138386cwg.LIZ = c138405cwz;
        if (c138405cwz != null && c138386cwg.LIZJ.isShown()) {
            c138405cwz.registerObserver(c138386cwg.LIZJ.f20228LJ);
        }
        c138386cwg.notifyDataSetChanged();
        if (LIZIZ()) {
            LIZ();
            if (!LIZIZ() && this.LJIILJJIL) {
                this.LJI = false;
                LIZ(this.LJII);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r7) {
        /*
            r6 = this;
            X.cwg r0 = r6.LIZ
            X.cwz r0 = r0.LIZ
            if (r0 == 0) goto L94
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r6.LJIIL
            r1.addOnGlobalLayoutListener(r0)
            android.widget.FrameLayout r0 = r6.LIZJ
            int r0 = r0.getVisibility()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L92
            r5 = 1
        L1a:
            X.cwg r0 = r6.LIZ
            int r1 = r0.LIZIZ()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r0) goto L87
            int r0 = r7 + r5
            if (r1 <= r0) goto L87
            X.cwg r0 = r6.LIZ
            r0.LIZ(r2)
            X.cwg r0 = r6.LIZ
            int r7 = r7 - r2
            r0.LIZ(r7)
        L34:
            X.cvg r4 = r6.getListPopupWindow()
            boolean r0 = r4.LIZJ()
            if (r0 != 0) goto L80
            boolean r0 = r6.LJI
            if (r0 != 0) goto L81
            if (r5 == 0) goto L81
            X.cwg r0 = r6.LIZ
            r0.LIZ(r3, r3)
        L49:
            X.cwg r0 = r6.LIZ
            int r1 = r0.LIZ()
            int r0 = r6.LJIIJJI
            int r0 = java.lang.Math.min(r1, r0)
            r4.LIZLLL(r0)
            r4.mo21659c_()
            X.cx8 r0 = r6.LIZLLL
            if (r0 == 0) goto L62
            r0.subUiVisibilityChanged(r2)
        L62:
            android.widget.ListView r2 = r4.mo21658d_()
            android.content.Context r1 = r6.getContext()
            r0 = 2131558650(0x7f0d00fa, float:1.8742622E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            android.widget.ListView r1 = r4.mo21658d_()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r3)
            r1.setSelector(r0)
        L80:
            return
        L81:
            X.cwg r0 = r6.LIZ
            r0.LIZ(r2, r5)
            goto L49
        L87:
            X.cwg r0 = r6.LIZ
            r0.LIZ(r3)
            X.cwg r0 = r6.LIZ
            r0.LIZ(r7)
            goto L34
        L92:
            r5 = 0
            goto L1a
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data model. Did you call #setDataModel?"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.LIZ(int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.LJIIIZ;
        if (this.LIZJ.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LJIIIZ.layout(0, 0, i3 - i, i4 - i2);
        if (!LIZIZ()) {
            LIZ();
        }
    }
}
