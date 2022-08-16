package android.support.wearable.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;
import p003X.DialogC144297eUF;

/* loaded from: classes19.dex */
public final class AcceptDenyDialogPreference extends Preference implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    public CharSequence LIZ;
    public CharSequence LIZIZ;
    public Drawable LIZJ;
    public DialogC144297eUF LIZLLL;

    /* renamed from: LJ */
    public boolean f20200LJ;
    public boolean LJFF;
    public int LJI;

    static {
        Covode.recordClassIndex(300);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.wearable.preference.AcceptDenyDialogPreference.SavedState.1
            static {
                Covode.recordClassIndex(302);
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
        public Bundle LIZIZ;

        static {
            Covode.recordClassIndex(301);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readInt() != 1 ? false : true;
            this.LIZIZ = parcel.readBundle();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ ? 1 : 0);
            parcel.writeBundle(this.LIZIZ);
        }
    }

    @Override // android.preference.Preference
    public final void onClick() {
        DialogC144297eUF dialogC144297eUF = this.LIZLLL;
        if (dialogC144297eUF != null && dialogC144297eUF.isShowing()) {
            return;
        }
        LIZ(null);
    }

    @Override // android.preference.Preference
    public final void onPrepareForRemoval() {
        DialogC144297eUF dialogC144297eUF = this.LIZLLL;
        if (dialogC144297eUF != null && dialogC144297eUF.isShowing()) {
            C116971W2r.LIZ(this.LIZLLL);
        }
    }

    @Override // android.preference.Preference
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        DialogC144297eUF dialogC144297eUF = this.LIZLLL;
        if (dialogC144297eUF != null && dialogC144297eUF.isShowing()) {
            SavedState savedState = new SavedState(onSaveInstanceState);
            savedState.LIZ = true;
            savedState.LIZIZ = this.LIZLLL.onSaveInstanceState();
            return savedState;
        }
        return onSaveInstanceState;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LIZLLL = null;
    }

    @Override // android.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.LIZ) {
                LIZ(savedState.LIZIZ);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private void LIZ(Bundle bundle) {
        Context context = getContext();
        this.LJI = -2;
        this.LIZLLL = new DialogC144297eUF(context);
        this.LIZLLL.setTitle(this.LIZ);
        this.LIZLLL.LIZ(this.LIZJ);
        this.LIZLLL.LIZ(this.LIZIZ);
        if (this.f20200LJ) {
            this.LIZLLL.LIZ(this);
        }
        if (this.LJFF) {
            this.LIZLLL.LIZIZ(this);
        }
        if (bundle != null) {
            this.LIZLLL.onRestoreInstanceState(bundle);
        }
        C116971W2r.LIZ(this.LIZLLL, this);
        C116971W2r.LIZJ(this.LIZLLL);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.LJI = i;
    }
}
