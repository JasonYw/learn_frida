package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean LIZ;
    public boolean LIZJ;
    public CharSequence LIZLLL;
    public CharSequence LJIIZILJ;
    public boolean LJIJ;

    static {
        Covode.recordClassIndex(1640);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            static {
                Covode.recordClassIndex(1642);
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
        public boolean LIZ;

        static {
            Covode.recordClassIndex(1641);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readInt() != 1 ? false : true;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ ? 1 : 0);
        }
    }

    @Override // androidx.preference.Preference
    public final void LIZ() {
        super.LIZ();
        boolean z = !this.LIZJ;
        if (LIZ(Boolean.valueOf(z))) {
            LIZLLL(z);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean LIZJ() {
        if (!this.LJIJ ? this.LIZJ : !this.LIZJ) {
            if (!super.LIZJ()) {
                return false;
            }
        }
        return true;
    }

    public final void LIZIZ(CharSequence charSequence) {
        this.LJIIZILJ = charSequence;
        if (!this.LIZJ) {
            LIZIZ();
        }
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (this.LIZJ != z) {
            z2 = true;
        } else {
            z2 = false;
            if (this.LIZ) {
                return;
            }
        }
        this.LIZJ = z;
        this.LIZ = true;
        LIZJ(z);
        if (z2) {
            LIZ(LIZJ());
            LIZIZ();
        }
    }

    public final void LIZ(CharSequence charSequence) {
        this.LIZLLL = charSequence;
        if (this.LIZJ) {
            LIZIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (1 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2 = 1
            boolean r1 = r3.LIZJ
            r0 = 0
            if (r1 == 0) goto L25
            java.lang.CharSequence r0 = r3.LIZLLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            java.lang.CharSequence r0 = r3.LIZLLL
            r4.setText(r0)
        L1a:
            r1 = 0
        L1b:
            int r0 = r4.getVisibility()
            if (r1 == r0) goto L24
            r4.setVisibility(r1)
        L24:
            return
        L25:
            boolean r0 = r3.LIZJ
            if (r0 != 0) goto L37
            java.lang.CharSequence r0 = r3.LJIIZILJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L37
            java.lang.CharSequence r0 = r3.LJIIZILJ
            r4.setText(r0)
            goto L1a
        L37:
            java.lang.CharSequence r1 = r3.LIZLLL()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L46
            r4.setText(r1)
            r0 = 0
            goto L1a
        L46:
            r1 = 8
            if (r2 != 0) goto L1b
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.LIZIZ(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final Object LIZ(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
