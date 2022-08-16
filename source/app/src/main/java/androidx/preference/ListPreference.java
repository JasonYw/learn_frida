package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC144395eVp;
import p003X.C138517cyn;
import p003X.C144760ebi;

/* loaded from: classes19.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] LIZIZ;
    public CharSequence[] LIZJ;
    public String LIZLLL;
    public String LJIIZILJ;
    public boolean LJIJ;

    static {
        Covode.recordClassIndex(1611);
    }

    private int LJII() {
        return LIZJ(this.LIZLLL);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
            static {
                Covode.recordClassIndex(1613);
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
        public String LIZ;

        static {
            Covode.recordClassIndex(1612);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.LIZ);
        }
    }

    /* renamed from: LJ */
    public final CharSequence m21126LJ() {
        CharSequence[] charSequenceArr;
        int LJII = LJII();
        if (LJII >= 0 && (charSequenceArr = this.LIZIZ) != null) {
            return charSequenceArr[LJII];
        }
        return null;
    }

    @Override // androidx.preference.Preference
    public final CharSequence LIZLLL() {
        if (this.LJIILLIIL != null) {
            return this.LJIILLIIL.LIZ(this);
        }
        CharSequence m21126LJ = m21126LJ();
        CharSequence LIZLLL = super.LIZLLL();
        String str = this.LJIIZILJ;
        if (str == null) {
            return LIZLLL;
        }
        Object[] objArr = new Object[1];
        if (m21126LJ == null) {
            m21126LJ = "";
        }
        objArr[0] = m21126LJ;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, LIZLLL)) {
            return LIZLLL;
        }
        return format;
    }

    private int LIZJ(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.LIZJ) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (this.LIZJ[length].equals(str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void LIZ(String str) {
        boolean z = !TextUtils.equals(this.LIZLLL, str);
        if (z || !this.LJIJ) {
            this.LIZLLL = str;
            this.LJIJ = true;
            LIZIZ(str);
            if (z) {
                LIZIZ();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final Object LIZ(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130772919, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842930, 16843256, 2130773082, 2130773083, 2130774999}, i, i2);
        this.LIZIZ = C138517cyn.LIZJ(obtainStyledAttributes, 2, 0);
        this.LIZJ = C138517cyn.LIZJ(obtainStyledAttributes, 3, 1);
        if (C138517cyn.LIZ(obtainStyledAttributes, 4, 4, false)) {
            if (C144760ebi.LIZ == null) {
                C144760ebi.LIZ = new C144760ebi();
            }
            LIZ((AbstractC144395eVp) C144760ebi.LIZ);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, 2130772180, 2130772182, 2130772889, 2130772893, 2130773061, 2130773062, 2130773183, 2130773255, 2130773264, 2130773397, 2130773449, 2130773485, 2130773840, 2130773876, 2130774344, 2130774384, 2130774431, 2130774603, 2130774753, 2130775086}, i, i2);
        this.LJIIZILJ = C138517cyn.LIZ(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
