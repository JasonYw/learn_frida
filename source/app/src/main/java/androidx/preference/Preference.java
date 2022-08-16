package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import p003X.AbstractC144395eVp;
import p003X.AbstractC144762ebk;
import p003X.AbstractC144763ebl;
import p003X.AbstractC144764ebm;
import p003X.AbstractC144765ebn;
import p003X.C116971W2r;
import p003X.C138517cyn;
import p003X.C144761ebj;

/* loaded from: classes19.dex */
public class Preference implements Comparable<Preference> {
    public CharSequence LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public Context f20275LJ;
    public C144761ebj LJFF;
    public AbstractC144765ebn LJI;
    public AbstractC144762ebk LJII;
    public AbstractC144763ebl LJIIIIZZ;
    public int LJIIIZ;
    public CharSequence LJIIJ;
    public String LJIIJJI;
    public Intent LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public AbstractC144395eVp LJIILLIIL;
    public boolean LJIIZILJ;
    public List<Preference> LJIJ;

    static {
        Covode.recordClassIndex(1618);
    }

    public Object LIZ(TypedArray typedArray, int i) {
        return null;
    }

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    /* loaded from: classes19.dex */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            static {
                Covode.recordClassIndex(1621);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }
        };

        static {
            Covode.recordClassIndex(1620);
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: LJ */
    private AbstractC144765ebn m21125LJ() {
        AbstractC144765ebn abstractC144765ebn = this.LJI;
        if (abstractC144765ebn != null) {
            return abstractC144765ebn;
        }
        C144761ebj c144761ebj = this.LJFF;
        if (c144761ebj != null) {
            return c144761ebj.LIZIZ;
        }
        return null;
    }

    public boolean LIZJ() {
        if (!LJFF()) {
            return true;
        }
        return false;
    }

    public CharSequence LIZLLL() {
        AbstractC144395eVp abstractC144395eVp = this.LJIILLIIL;
        if (abstractC144395eVp != null) {
            return abstractC144395eVp.LIZ(this);
        }
        return this.LIZ;
    }

    public boolean LJFF() {
        if (this.LIZIZ && this.LIZJ && this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (!TextUtils.isEmpty(this.LJIIJJI)) {
            return true;
        }
        return false;
    }

    private boolean LJII() {
        if (this.LJFF != null && this.LJIILL && LJI()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.LJIIJ;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(LoggerUtil.BLANK_TAG);
        }
        CharSequence LIZLLL = LIZLLL();
        if (!TextUtils.isEmpty(LIZLLL)) {
            sb.append(LIZLLL);
            sb.append(LoggerUtil.BLANK_TAG);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private void LIZ(SharedPreferences.Editor editor) {
        if (!this.LJFF.LIZJ) {
            editor.apply();
        }
    }

    public final void LIZ(AbstractC144395eVp abstractC144395eVp) {
        this.LJIILLIIL = abstractC144395eVp;
        LIZIZ();
    }

    public final void LIZIZ(boolean z) {
        if (this.LIZLLL == z) {
            this.LIZLLL = !z;
            LIZ(LIZJ());
            LIZIZ();
        }
    }

    public void LIZ(View view) {
        Intent intent;
        AbstractC144764ebm abstractC144764ebm;
        if (LJFF() && this.LJIILJJIL) {
            LIZ();
            AbstractC144763ebl abstractC144763ebl = this.LJIIIIZZ;
            if (abstractC144763ebl == null || !abstractC144763ebl.LIZ()) {
                C144761ebj c144761ebj = this.LJFF;
                if ((c144761ebj == null || (abstractC144764ebm = c144761ebj.LJFF) == null || !abstractC144764ebm.LIZ()) && (intent = this.LJIIL) != null) {
                    C116971W2r.LIZ(this.f20275LJ, intent);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.LJIIIZ;
        int i2 = preference2.LJIIIZ;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.LJIIJ;
        CharSequence charSequence2 = preference2.LJIIJ;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.LJIIJ.toString());
    }

    public void LIZ(boolean z) {
        List<Preference> list = this.LJIJ;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = list.get(i);
            if (preference.LIZJ == z) {
                preference.LIZJ = !z;
                preference.LIZ(preference.LIZJ());
                preference.LIZIZ();
            }
        }
    }

    public final boolean LIZIZ(String str) {
        if (!LJII()) {
            return false;
        }
        String str2 = null;
        if (LJII() && m21125LJ() == null) {
            str2 = this.LJFF.LIZ().getString(this.LJIIJJI, null);
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (m21125LJ() == null) {
            SharedPreferences.Editor LIZIZ = this.LJFF.LIZIZ();
            LIZIZ.putString(this.LJIIJJI, str);
            LIZ(LIZIZ);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public final boolean LIZJ(boolean z) {
        if (!LJII()) {
            return false;
        }
        boolean z2 = !z;
        if (LJII() && m21125LJ() == null) {
            z2 = this.LJFF.LIZ().getBoolean(this.LJIIJJI, z2);
        }
        if (z == z2) {
            return true;
        }
        if (m21125LJ() == null) {
            SharedPreferences.Editor LIZIZ = this.LJFF.LIZIZ();
            LIZIZ.putBoolean(this.LJIIJJI, z);
            LIZ(LIZIZ);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public final boolean LIZ(int i) {
        if (!LJII()) {
            return false;
        }
        int i2 = ~i;
        if (LJII() && m21125LJ() == null) {
            i2 = this.LJFF.LIZ().getInt(this.LJIIJJI, i2);
        }
        if (i == i2) {
            return true;
        }
        if (m21125LJ() == null) {
            SharedPreferences.Editor LIZIZ = this.LJFF.LIZIZ();
            LIZIZ.putInt(this.LJIIJJI, i);
            LIZ(LIZIZ);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public final boolean LIZ(Object obj) {
        AbstractC144762ebk abstractC144762ebk = this.LJII;
        if (abstractC144762ebk != null && !abstractC144762ebk.LIZ()) {
            return false;
        }
        return true;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130773953, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LJIIIZ = Integer.MAX_VALUE;
        this.LIZIZ = true;
        this.LJIILJJIL = true;
        this.LJIILL = true;
        this.LIZJ = true;
        this.LIZLLL = true;
        new View.OnClickListener() { // from class: androidx.preference.Preference.1
            static {
                Covode.recordClassIndex(1619);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Preference.this.LIZ(view);
            }
        };
        this.f20275LJ = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, 2130772180, 2130772182, 2130772889, 2130772893, 2130773061, 2130773062, 2130773183, 2130773255, 2130773264, 2130773397, 2130773449, 2130773485, 2130773840, 2130773876, 2130774344, 2130774384, 2130774431, 2130774603, 2130774753, 2130775086}, i, i2);
        C138517cyn.LIZIZ(obtainStyledAttributes, 23, 0, 0);
        this.LJIIJJI = C138517cyn.LIZ(obtainStyledAttributes, 26, 6);
        this.LJIIJ = C138517cyn.LIZIZ(obtainStyledAttributes, 34, 4);
        this.LIZ = C138517cyn.LIZIZ(obtainStyledAttributes, 33, 7);
        this.LJIIIZ = C138517cyn.LIZ(obtainStyledAttributes, 28, 8, Integer.MAX_VALUE);
        this.LJIILIIL = C138517cyn.LIZ(obtainStyledAttributes, 22, 13);
        C138517cyn.LIZIZ(obtainStyledAttributes, 27, 3, 2131696010);
        C138517cyn.LIZIZ(obtainStyledAttributes, 35, 9, 0);
        this.LIZIZ = C138517cyn.LIZ(obtainStyledAttributes, 21, 2, true);
        this.LJIILJJIL = C138517cyn.LIZ(obtainStyledAttributes, 30, 5, true);
        this.LJIILL = C138517cyn.LIZ(obtainStyledAttributes, 29, 1, true);
        C138517cyn.LIZ(obtainStyledAttributes, 19, 10);
        C138517cyn.LIZ(obtainStyledAttributes, 16, 16, this.LJIILJJIL);
        C138517cyn.LIZ(obtainStyledAttributes, 17, 17, this.LJIILJJIL);
        if (obtainStyledAttributes.hasValue(18)) {
            LIZ(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            LIZ(obtainStyledAttributes, 11);
        }
        C138517cyn.LIZ(obtainStyledAttributes, 31, 12, true);
        this.LJIIZILJ = obtainStyledAttributes.hasValue(32);
        if (this.LJIIZILJ) {
            C138517cyn.LIZ(obtainStyledAttributes, 32, 14, true);
        }
        C138517cyn.LIZ(obtainStyledAttributes, 24, 15, false);
        C138517cyn.LIZ(obtainStyledAttributes, 25, 25, true);
        C138517cyn.LIZ(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
}
