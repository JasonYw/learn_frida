package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.NNT;

/* loaded from: classes6.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue LIZ;
    public TypedValue LIZIZ;
    public TypedValue LIZJ;
    public TypedValue LIZLLL;

    /* renamed from: LJ */
    public TypedValue f20231LJ;
    public TypedValue LJFF;
    public final Rect LJI;
    public NNT LJII;

    static {
        Covode.recordClassIndex(633);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f20231LJ == null) {
            this.f20231LJ = new TypedValue();
        }
        return this.f20231LJ;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.LJFF == null) {
            this.LJFF = new TypedValue();
        }
        return this.LJFF;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.LIZJ == null) {
            this.LIZJ = new TypedValue();
        }
        return this.LIZJ;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new TypedValue();
        }
        return this.LIZLLL;
    }

    public TypedValue getMinWidthMajor() {
        if (this.LIZ == null) {
            this.LIZ = new TypedValue();
        }
        return this.LIZ;
    }

    public TypedValue getMinWidthMinor() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new TypedValue();
        }
        return this.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NNT nnt = this.LJII;
        if (nnt != null) {
            nnt.gq_();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NNT nnt = this.LJII;
        if (nnt != null) {
            nnt.gp_();
        }
    }

    public final void LIZ(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(NNT nnt) {
        this.LJII = nnt;
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJI = new Rect();
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LJI.set(i, i2, i3, i4);
        if (ViewCompat.isLaidOut(this)) {
            requestLayout();
        }
    }
}
