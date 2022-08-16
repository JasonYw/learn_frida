package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.request.a */
/* loaded from: classes20.dex */
public final class C0525a implements Parcelable.Creator<ByteArrayEntry> {
    static {
        Covode.recordClassIndex(2239);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public final ByteArrayEntry[] newArray(int i) {
        return new ByteArrayEntry[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public final ByteArrayEntry createFromParcel(Parcel parcel) {
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry((C0525a) null);
        byteArrayEntry.bytes = new byte[parcel.readInt()];
        parcel.readByteArray(byteArrayEntry.bytes);
        byteArrayEntry.offset = parcel.readInt();
        byteArrayEntry.count = parcel.readInt();
        byteArrayEntry.contentType = parcel.readString();
        return byteArrayEntry;
    }
}
