package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;

/* loaded from: classes20.dex */
public class ByteArrayEntry implements BodyEntry {
    public static final Parcelable.Creator<ByteArrayEntry> CREATOR = new C0525a();
    public byte[] bytes;
    public String contentType;
    public int count;
    public int offset;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ByteArrayEntry() {
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return this.contentType;
    }

    static {
        Covode.recordClassIndex(2233);
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public /* synthetic */ ByteArrayEntry(C0525a c0525a) {
        this();
    }

    public ByteArrayEntry(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) {
        MethodCollector.m14708i(45);
        outputStream.write(this.bytes, this.offset, this.count);
        int i = this.count;
        MethodCollector.m14707o(45);
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bytes.length);
        parcel.writeByteArray(this.bytes);
        parcel.writeInt(this.offset);
        parcel.writeInt(this.count);
        parcel.writeString(this.contentType);
    }

    public ByteArrayEntry(byte[] bArr, int i, int i2) {
        this.bytes = bArr;
        this.offset = i;
        this.count = i2;
    }
}
