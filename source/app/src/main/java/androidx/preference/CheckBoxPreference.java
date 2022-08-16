package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import p003X.C138517cyn;
import p003X.C144766ebo;

/* loaded from: classes19.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final C144766ebo LIZ;

    static {
        Covode.recordClassIndex(1602);
    }

    @Override // androidx.preference.Preference
    public final void LIZ(View view) {
        super.LIZ(view);
        if (((AccessibilityManager) this.f20275LJ.getSystemService("accessibility")).isEnabled()) {
            View findViewById = view.findViewById(16908289);
            boolean z = findViewById instanceof CompoundButton;
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(((TwoStatePreference) this).LIZJ);
            }
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(this.LIZ);
            }
            LIZIZ(view.findViewById(16908304));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130772561, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.LIZ = new C144766ebo(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843247, 16843248, 16843249, 2130772926, 2130774604, 2130774605}, i, 0);
        LIZ((CharSequence) C138517cyn.LIZ(obtainStyledAttributes, 5, 0));
        LIZIZ((CharSequence) C138517cyn.LIZ(obtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).LJIJ = C138517cyn.LIZ(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }
}
