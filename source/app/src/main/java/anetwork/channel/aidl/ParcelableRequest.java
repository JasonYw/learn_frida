package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p003X.AbstractC148894fgW;
import p003X.C148895fgX;

/* loaded from: classes20.dex */
public class ParcelableRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequest> CREATOR = new C148895fgX();
    public AbstractC148894fgW LIZ;
    public BodyEntry LIZIZ;
    public int LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f20850LJ;
    public boolean LJFF;
    public String LJI;
    public Map<String, String> LJII;
    public Map<String, String> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Map<String, String> LJIILIIL;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(2394);
    }

    public final String LIZ(String str) {
        Map<String, String> map = this.LJIILIIL;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public static ParcelableRequest LIZ(Parcel parcel) {
        ParcelableRequest parcelableRequest = new ParcelableRequest();
        try {
            parcelableRequest.LIZJ = parcel.readInt();
            parcelableRequest.LIZLLL = parcel.readString();
            parcelableRequest.f20850LJ = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            parcelableRequest.LJFF = z;
            parcelableRequest.LJI = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.LJII = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                parcelableRequest.LJIIIIZZ = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            parcelableRequest.LIZIZ = (BodyEntry) parcel.readParcelable(ParcelableRequest.class.getClassLoader());
            parcelableRequest.LJIIIZ = parcel.readInt();
            parcelableRequest.LJIIJ = parcel.readInt();
            parcelableRequest.LJIIJJI = parcel.readString();
            parcelableRequest.LJIIL = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.LJIILIIL = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
                return parcelableRequest;
            }
        } catch (Throwable th) {
            ALog.m20784w("anet.ParcelableRequest", "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableRequest;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4;
        AbstractC148894fgW abstractC148894fgW = this.LIZ;
        if (abstractC148894fgW == null) {
            return;
        }
        try {
            parcel.writeInt(abstractC148894fgW.LIZJ());
            parcel.writeString(this.LIZLLL);
            parcel.writeString(this.LIZ.LIZLLL());
            int i5 = 1;
            if (this.LIZ.LIZ()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.LIZ.LIZIZ());
            if (this.LJII == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            parcel.writeInt(i3);
            if (this.LJII != null) {
                parcel.writeMap(this.LJII);
            }
            if (this.LJIIIIZZ == null) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            parcel.writeInt(i4);
            if (this.LJIIIIZZ != null) {
                parcel.writeMap(this.LJIIIIZZ);
            }
            parcel.writeParcelable(this.LIZIZ, 0);
            parcel.writeInt(this.LIZ.m21265LJ());
            parcel.writeInt(this.LIZ.LJFF());
            parcel.writeString(this.LIZ.LJI());
            parcel.writeString(this.LIZ.LJII());
            Map<String, String> LJIIIIZZ = this.LIZ.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                i5 = 0;
            }
            parcel.writeInt(i5);
            if (LJIIIIZZ != null) {
                parcel.writeMap(LJIIIIZZ);
            }
        } catch (Throwable th) {
            ALog.m20784w("anet.ParcelableRequest", "[writeToParcel]", null, th, new Object[0]);
        }
    }
}
