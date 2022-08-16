package anet.channel.bytes;

import anet.channel.bytes.C0470a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public class ByteArray implements Comparable<ByteArray> {
    public final byte[] buffer;
    public int bufferLength;
    public int dataLength;

    static {
        Covode.recordClassIndex(2161);
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getBufferLength() {
        return this.bufferLength;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public void recycle() {
        if (this.bufferLength == 0) {
            return;
        }
        C0470a.C0471a.f20427a.m21050a(this);
    }

    public void setDataLength(int i) {
        this.dataLength = i;
    }

    public static ByteArray create(int i) {
        return new ByteArray(null, i);
    }

    public static ByteArray wrap(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return wrap(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteArray byteArray) {
        int i = this.bufferLength;
        int i2 = byteArray.bufferLength;
        if (i == i2) {
            if (this.buffer == null) {
                return -1;
            }
            if (byteArray.buffer == null) {
                return 1;
            }
            return hashCode() - byteArray.hashCode();
        }
        return i - i2;
    }

    public int readFrom(InputStream inputStream) {
        MethodCollector.m14708i(27);
        int i = 0;
        int read = inputStream.read(this.buffer, 0, this.bufferLength);
        if (read != -1) {
            i = read;
        }
        this.dataLength = i;
        MethodCollector.m14707o(27);
        return read;
    }

    public void writeTo(OutputStream outputStream) {
        MethodCollector.m14708i(28);
        outputStream.write(this.buffer, 0, this.dataLength);
        MethodCollector.m14707o(28);
    }

    public ByteArray(byte[] bArr, int i) {
        this.buffer = bArr == null ? new byte[i] : bArr;
        this.bufferLength = this.buffer.length;
        this.dataLength = i;
    }

    public static ByteArray wrap(byte[] bArr, int i) {
        if (bArr != null && i >= 0 && i <= bArr.length) {
            return new ByteArray(bArr, i);
        }
        return null;
    }
}
