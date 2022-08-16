package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        static {
            Covode.recordClassIndex(1283);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };
    public ArrayList<FragmentState> LIZ;
    public ArrayList<String> LIZIZ;
    public BackStackState[] LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public int f20258LJ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    static {
        Covode.recordClassIndex(1282);
    }

    public FragmentManagerState(Parcel parcel) {
        this.LIZ = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.LIZIZ = parcel.createStringArrayList();
        this.LIZJ = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.LIZLLL = parcel.readString();
        this.f20258LJ = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.LIZ);
        parcel.writeStringList(this.LIZIZ);
        parcel.writeTypedArray(this.LIZJ, i);
        parcel.writeString(this.LIZLLL);
        parcel.writeInt(this.f20258LJ);
    }
}
