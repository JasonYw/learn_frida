package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import p003X.C138517cyn;

/* loaded from: classes19.dex */
public class PreferenceCategory extends PreferenceGroup {
    static {
        Covode.recordClassIndex(1625);
    }

    @Override // androidx.preference.Preference
    public final boolean LJFF() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final boolean LIZJ() {
        if (!super.LJFF()) {
            return true;
        }
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130773946, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
    }
}
