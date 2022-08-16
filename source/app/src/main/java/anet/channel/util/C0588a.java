package anet.channel.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.io.InputStream;

/* renamed from: anet.channel.util.a */
/* loaded from: classes8.dex */
public class C0588a extends InputStream {

    /* renamed from: a */
    public InputStream f20825a;

    /* renamed from: b */
    public long f20826b;

    static {
        Covode.recordClassIndex(2372);
    }

    /* renamed from: a */
    public long m20776a() {
        return this.f20826b;
    }

    @Override // java.io.InputStream
    public int read() {
        MethodCollector.m14708i(102);
        this.f20826b++;
        int read = this.f20825a.read();
        MethodCollector.m14707o(102);
        return read;
    }

    public C0588a(InputStream inputStream) {
        MethodCollector.m14708i(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        if (inputStream != null) {
            this.f20825a = inputStream;
            MethodCollector.m14707o(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("input stream cannot be null");
        MethodCollector.m14707o(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS);
        throw nullPointerException;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        MethodCollector.m14708i(103);
        int read = this.f20825a.read(bArr, i, i2);
        if (read != -1) {
            this.f20826b += read;
        }
        MethodCollector.m14707o(103);
        return read;
    }
}
