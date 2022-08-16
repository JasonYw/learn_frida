package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p003X.C109141Sy7;

/* loaded from: classes10.dex */
public class DefaultProgressEvent implements Parcelable {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new C109141Sy7();
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public byte[] LIZLLL;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DefaultProgressEvent() {
    }

    static {
        Covode.recordClassIndex(2390);
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.LIZ + ", size=" + this.LIZIZ + ", total=" + this.LIZJ + "]";
    }

    public static DefaultProgressEvent LIZ(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.LIZ = parcel.readInt();
            defaultProgressEvent.LIZIZ = parcel.readInt();
            defaultProgressEvent.LIZJ = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                defaultProgressEvent.LIZLLL = bArr;
            }
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.LIZ);
        parcel.writeInt(this.LIZIZ);
        parcel.writeInt(this.LIZJ);
        byte[] bArr = this.LIZLLL;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeByteArray(this.LIZLLL);
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = bArr;
    }
}
