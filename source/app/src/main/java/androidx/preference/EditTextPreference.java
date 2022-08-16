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
import p003X.C144759ebh;

/* loaded from: classes19.dex */
public class EditTextPreference extends DialogPreference {
    public String LIZIZ;

    static {
        Covode.recordClassIndex(1607);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
            static {
                Covode.recordClassIndex(1609);
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
            Covode.recordClassIndex(1608);
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

    @Override // androidx.preference.Preference
    public final boolean LIZJ() {
        if (!TextUtils.isEmpty(this.LIZIZ) && !super.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // androidx.preference.Preference
    public final Object LIZ(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C138517cyn.LIZ(context, 2130773055, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774999}, i, 0);
        if (C138517cyn.LIZ(obtainStyledAttributes, 0, 0, false)) {
            if (C144759ebh.LIZ == null) {
                C144759ebh.LIZ = new C144759ebh();
            }
            LIZ((AbstractC144395eVp) C144759ebh.LIZ);
        }
        obtainStyledAttributes.recycle();
    }
}
