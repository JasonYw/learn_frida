package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.collection.SimpleArrayMap;
import androidx.preference.Preference;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.C138517cyn;

/* loaded from: classes19.dex */
public abstract class PreferenceGroup extends Preference {
    public final SimpleArrayMap<String, Long> LIZ;
    public List<Preference> LIZIZ;

    static {
        Covode.recordClassIndex(1626);
    }

    /* renamed from: LJ */
    public final int m21124LJ() {
        return this.LIZIZ.size();
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            static {
                Covode.recordClassIndex(1629);
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
        public int LIZ;

        static {
            Covode.recordClassIndex(1628);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ);
        }
    }

    @Override // androidx.preference.Preference
    public final void LIZ(boolean z) {
        super.LIZ(z);
        int m21124LJ = m21124LJ();
        for (int i = 0; i < m21124LJ; i++) {
            this.LIZIZ.get(i).LIZIZ(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LIZ = new SimpleArrayMap<>();
        new Handler();
        new Runnable() { // from class: androidx.preference.PreferenceGroup.1
            static {
                Covode.recordClassIndex(1627);
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    PreferenceGroup.this.LIZ.clear();
                }
            }
        };
        this.LIZIZ = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843239, 2130773359, 2130773841}, i, i2);
        C138517cyn.LIZ(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1) && C138517cyn.LIZ(obtainStyledAttributes, 1, 1, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            LJI();
        }
        obtainStyledAttributes.recycle();
    }
}
