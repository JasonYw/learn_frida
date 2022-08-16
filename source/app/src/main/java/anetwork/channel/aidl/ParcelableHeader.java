package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import p003X.C109150SyG;

/* loaded from: classes10.dex */
public class ParcelableHeader implements Parcelable {
    public static Parcelable.Creator<ParcelableHeader> CREATOR = new C109150SyG();
    public int LIZ;
    public Map<String, List<String>> LIZIZ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableHeader() {
    }

    static {
        Covode.recordClassIndex(2393);
    }

    public String toString() {
        return "ParcelableResponseHeader [responseCode=" + this.LIZ + ", header=" + this.LIZIZ + "]";
    }

    public static ParcelableHeader LIZ(Parcel parcel) {
        ParcelableHeader parcelableHeader = new ParcelableHeader();
        try {
            if (parcel.readInt() == 1) {
                parcelableHeader.LIZIZ = parcel.readHashMap(ParcelableHeader.class.getClassLoader());
            }
            parcelableHeader.LIZ = parcel.readInt();
            return parcelableHeader;
        } catch (Throwable th) {
            ALog.m20787e("anet.ParcelableHeader", "[readFromParcel]", null, th, new Object[0]);
            return parcelableHeader;
        }
    }

    public ParcelableHeader(int i, Map<String, List<String>> map) {
        this.LIZIZ = map;
        this.LIZ = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.LIZIZ != null) {
            parcel.writeInt(1);
            parcel.writeMap(this.LIZIZ);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.LIZ);
    }
}
