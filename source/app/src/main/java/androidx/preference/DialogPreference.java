package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import p003X.C138517cyn;

/* loaded from: classes17.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence LIZ;

    static {
        Covode.recordClassIndex(1604);
    }

    @Override // androidx.preference.Preference
    public void LIZ() {
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130772919, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843250, 16843251, 16843252, 16843253, 16843254, 16843255, 2130772915, 2130772916, 2130772917, 2130772922, 2130773810, 2130773945}, i, i2);
        this.LIZ = C138517cyn.LIZ(obtainStyledAttributes, 9, 0);
        if (this.LIZ == null) {
            this.LIZ = this.LJIIJ;
        }
        C138517cyn.LIZ(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        C138517cyn.LIZ(obtainStyledAttributes, 11, 3);
        C138517cyn.LIZ(obtainStyledAttributes, 10, 4);
        C138517cyn.LIZIZ(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
