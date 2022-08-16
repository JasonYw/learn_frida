package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Group extends AbstractC0230a {
    static {
        Covode.recordClassIndex(849);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0230a
    public final void LIZJ() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.widget.LIZJ(0);
        layoutParams.widget.LIZLLL(0);
    }

    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0230a
    public final void LIZ(AttributeSet attributeSet) {
        super.LIZ(attributeSet);
        this.f20240LJ = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0230a
    public void LIZ(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        int i = Build.VERSION.SDK_INT;
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.LIZIZ; i2++) {
            View viewById = constraintLayout.getViewById(this.LIZ[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    int i3 = Build.VERSION.SDK_INT;
                    viewById.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
