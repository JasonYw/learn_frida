package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import p003X.C109252Szu;

/* loaded from: classes10.dex */
public class NetworkResponse implements Parcelable {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new C109252Szu();
    public int LIZ;
    public String LIZIZ;
    public byte[] LIZJ;
    public Map<String, List<String>> LIZLLL;

    /* renamed from: LJ */
    public Throwable f20849LJ;
    public StatisticData LJFF;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NetworkResponse() {
    }

    static {
        Covode.recordClassIndex(2391);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkResponse [");
        sb.append("statusCode=");
        sb.append(this.LIZ);
        sb.append(", desc=");
        sb.append(this.LIZIZ);
        sb.append(", connHeadFields=");
        sb.append(this.LIZLLL);
        sb.append(", bytedata=");
        byte[] bArr = this.LIZJ;
        if (bArr != null) {
            str = new String(bArr);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.f20849LJ);
        sb.append(", statisticData=");
        sb.append(this.LJFF);
        sb.append("]");
        return sb.toString();
    }

    public NetworkResponse(int i) {
        this.LIZ = -201;
        this.LIZIZ = ErrorConstant.getErrMsg(-201);
    }

    public final void LIZ(int i) {
        this.LIZ = i;
        this.LIZIZ = ErrorConstant.getErrMsg(i);
    }

    public static NetworkResponse LIZ(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.LIZ = parcel.readInt();
            networkResponse.LIZIZ = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                networkResponse.LIZJ = new byte[readInt];
                parcel.readByteArray(networkResponse.LIZJ);
            }
            networkResponse.LIZLLL = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            networkResponse.LJFF = (StatisticData) parcel.readSerializable();
            return networkResponse;
        } catch (Exception e) {
            ALog.m20784w("anet.NetworkResponse", "[readFromParcel]", null, e, new Object[0]);
            return networkResponse;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.LIZ);
        parcel.writeString(this.LIZIZ);
        byte[] bArr = this.LIZJ;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(this.LIZJ);
        }
        parcel.writeMap(this.LIZLLL);
        StatisticData statisticData = this.LJFF;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }
}
