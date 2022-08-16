package androidx.percentlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC146072ewy;
import p003X.C146068ewu;
import p003X.C146069ewv;
import p003X.C146070eww;
import p003X.NVW;

/* loaded from: classes19.dex */
public class PercentRelativeLayout extends RelativeLayout {
    public final C146070eww LIZ = new C146070eww(this);

    static {
        Covode.recordClassIndex(1596);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C146068ewu(-1, -1);
    }

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: LIZ */
    public C146068ewu mo25214generateLayoutParams(AttributeSet attributeSet) {
        return new C146068ewu(getContext(), attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C146069ewv LIZ;
        C146069ewv LIZ2;
        boolean z;
        C146070eww c146070eww = this.LIZ;
        int size = (View.MeasureSpec.getSize(i) - c146070eww.LIZ.getPaddingLeft()) - c146070eww.LIZ.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - c146070eww.LIZ.getPaddingTop()) - c146070eww.LIZ.getPaddingBottom();
        int childCount = c146070eww.LIZ.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c146070eww.LIZ.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof AbstractC146072ewy) && (LIZ2 = ((AbstractC146072ewy) layoutParams).LIZ()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    LIZ2.LIZ(marginLayoutParams, size, size2);
                    LIZ2.LJIIIZ.leftMargin = marginLayoutParams.leftMargin;
                    LIZ2.LJIIIZ.topMargin = marginLayoutParams.topMargin;
                    LIZ2.LJIIIZ.rightMargin = marginLayoutParams.rightMargin;
                    LIZ2.LJIIIZ.bottomMargin = marginLayoutParams.bottomMargin;
                    NVW.LIZ(LIZ2.LJIIIZ, NVW.LIZ(marginLayoutParams));
                    NVW.LIZIZ(LIZ2.LJIIIZ, NVW.LIZIZ(marginLayoutParams));
                    if (LIZ2.LIZJ >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(size * LIZ2.LIZJ);
                    }
                    if (LIZ2.LIZLLL >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * LIZ2.LIZLLL);
                    }
                    if (LIZ2.f19495LJ >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(size * LIZ2.f19495LJ);
                    }
                    if (LIZ2.LJFF >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * LIZ2.LJFF);
                    }
                    if (LIZ2.LJI >= 0.0f) {
                        NVW.LIZ(marginLayoutParams, Math.round(size * LIZ2.LJI));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LIZ2.LJII >= 0.0f) {
                        NVW.LIZIZ(marginLayoutParams, Math.round(size * LIZ2.LJII));
                    } else if (!z) {
                    }
                    int layoutDirection = ViewCompat.getLayoutDirection(childAt);
                    int i4 = Build.VERSION.SDK_INT;
                    marginLayoutParams.resolveLayoutDirection(layoutDirection);
                } else {
                    LIZ2.LIZ(layoutParams, size, size2);
                }
            }
        }
        super.onMeasure(i, i2);
        C146070eww c146070eww2 = this.LIZ;
        int childCount2 = c146070eww2.LIZ.getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = c146070eww2.LIZ.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof AbstractC146072ewy) && (LIZ = ((AbstractC146072ewy) layoutParams2).LIZ()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216 && LIZ.LIZ >= 0.0f && LIZ.LJIIIZ.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216 && LIZ.LIZIZ >= 0.0f && LIZ.LJIIIZ.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C146069ewv LIZ;
        super.onLayout(z, i, i2, i3, i4);
        C146070eww c146070eww = this.LIZ;
        int childCount = c146070eww.LIZ.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = c146070eww.LIZ.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof AbstractC146072ewy) && (LIZ = ((AbstractC146072ewy) layoutParams).LIZ()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    LIZ.LIZ(marginLayoutParams);
                    marginLayoutParams.leftMargin = LIZ.LJIIIZ.leftMargin;
                    marginLayoutParams.topMargin = LIZ.LJIIIZ.topMargin;
                    marginLayoutParams.rightMargin = LIZ.LJIIIZ.rightMargin;
                    marginLayoutParams.bottomMargin = LIZ.LJIIIZ.bottomMargin;
                    NVW.LIZ(marginLayoutParams, NVW.LIZ(LIZ.LJIIIZ));
                    NVW.LIZIZ(marginLayoutParams, NVW.LIZIZ(LIZ.LJIIIZ));
                } else {
                    LIZ.LIZ(layoutParams);
                }
            }
        }
    }
}
