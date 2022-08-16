package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.covode.number.Covode;
import p003X.C138517cyn;
import p003X.C144768ebq;

/* loaded from: classes19.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence LIZ;
    public CharSequence LIZIZ;
    public final C144768ebq LJIJI;

    static {
        Covode.recordClassIndex(1638);
    }

    @Override // androidx.preference.Preference
    public final void LIZ(View view) {
        super.LIZ(view);
        if (((AccessibilityManager) this.f20275LJ.getSystemService("accessibility")).isEnabled()) {
            View findViewById = view.findViewById(2131191154);
            boolean z = findViewById instanceof SwitchCompat;
            if (z) {
                ((SwitchCompat) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(((TwoStatePreference) this).LIZJ);
            }
            if (z) {
                SwitchCompat switchCompat = (SwitchCompat) findViewById;
                switchCompat.setTextOn(this.LIZ);
                switchCompat.setTextOff(this.LIZIZ);
                switchCompat.setOnCheckedChangeListener(this.LJIJI);
            }
            LIZIZ(view.findViewById(16908304));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130774610);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, 2130774610, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.LJIJI = new C144768ebq(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843247, 16843248, 16843249, 16843627, 16843628, 2130772926, 2130774604, 2130774605, 2130774614, 2130774615}, i, 0);
        LIZ((CharSequence) C138517cyn.LIZ(obtainStyledAttributes, 7, 0));
        LIZIZ((CharSequence) C138517cyn.LIZ(obtainStyledAttributes, 6, 1));
        this.LIZ = C138517cyn.LIZ(obtainStyledAttributes, 9, 3);
        LIZIZ();
        this.LIZIZ = C138517cyn.LIZ(obtainStyledAttributes, 8, 4);
        LIZIZ();
        ((TwoStatePreference) this).LJIJ = C138517cyn.LIZ(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
