package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes19.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        static {
            Covode.recordClassIndex(219);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f20193LJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(218);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.LIZ = parcel.readInt();
        this.LIZJ = parcel.readInt();
        this.LIZLLL = parcel.readInt();
        this.f20193LJ = parcel.readInt();
        this.LIZIZ = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LIZ);
        parcel.writeInt(this.LIZJ);
        parcel.writeInt(this.LIZLLL);
        parcel.writeInt(this.f20193LJ);
        parcel.writeInt(this.LIZIZ);
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.f20193LJ = i5;
    }
}
