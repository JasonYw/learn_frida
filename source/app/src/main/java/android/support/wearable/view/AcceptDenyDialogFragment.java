package android.support.wearable.view;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC144294eUC;
import p003X.AbstractC144295eUD;
import p003X.AbstractC144296eUE;
import p003X.DialogC144297eUF;

/* loaded from: classes19.dex */
public final class AcceptDenyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    static {
        Covode.recordClassIndex(306);
    }

    /* loaded from: classes19.dex */
    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() { // from class: android.support.wearable.view.AcceptDenyDialogFragment.Builder.1
            static {
                Covode.recordClassIndex(308);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Builder[] newArray(int i) {
                return new Builder[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Builder createFromParcel(Parcel parcel) {
                return new Builder(parcel, (byte) 0);
            }
        };
        public String LIZ;
        public String LIZIZ;
        public int LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public boolean f20202LJ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder() {
        }

        static {
            Covode.recordClassIndex(307);
        }

        public Builder(Parcel parcel) {
            this.LIZ = parcel.readString();
            this.LIZIZ = parcel.readString();
            this.LIZJ = parcel.readInt();
            this.LIZLLL = ((Boolean) parcel.readValue(null)).booleanValue();
            this.f20202LJ = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public /* synthetic */ Builder(Parcel parcel, byte b) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.LIZ);
            parcel.writeString(this.LIZIZ);
            parcel.writeInt(this.LIZJ);
            parcel.writeValue(Boolean.valueOf(this.LIZLLL));
            parcel.writeValue(Boolean.valueOf(this.f20202LJ));
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getActivity() instanceof AbstractC144294eUC) {
            getActivity();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (getActivity() instanceof AbstractC144296eUE) {
            getActivity();
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        DialogC144297eUF dialogC144297eUF = new DialogC144297eUF(getActivity());
        Builder builder = (Builder) getArguments().getParcelable("extra_dialog_builder");
        if (builder != null) {
            dialogC144297eUF.setTitle(builder.LIZ);
            dialogC144297eUF.LIZ(builder.LIZIZ);
            if (builder.LIZJ != 0) {
                dialogC144297eUF.LIZ(dialogC144297eUF.getContext().getDrawable(builder.LIZJ));
            }
            if (builder.LIZLLL) {
                dialogC144297eUF.LIZ(this);
            }
            if (builder.f20202LJ) {
                dialogC144297eUF.LIZIZ(this);
            }
        }
        dialogC144297eUF.findViewById(16908310).getRootView().requestFocus();
        return dialogC144297eUF;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (getActivity() instanceof AbstractC144295eUD) {
            getActivity();
        }
    }
}
