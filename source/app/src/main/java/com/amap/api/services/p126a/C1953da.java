package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.amap.api.services.a.da */
/* loaded from: classes8.dex */
public class C1953da implements Closeable {

    /* renamed from: a */
    public final InputStream f24716a;

    /* renamed from: b */
    public final Charset f24717b;

    /* renamed from: c */
    public byte[] f24718c;

    /* renamed from: d */
    public int f24719d;

    /* renamed from: e */
    public int f24720e;

    static {
        Covode.recordClassIndex(5564);
    }

    /* renamed from: b */
    private void m16506b() {
        InputStream inputStream = this.f24716a;
        byte[] bArr = this.f24718c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f24719d = 0;
            this.f24720e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f24716a) {
            if (this.f24718c != null) {
                this.f24718c = null;
                this.f24716a.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r8.f24718c[r5] == 13) goto L20;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m16508a() {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.f24716a
            monitor-enter(r4)
            byte[] r0 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L91
            int r1 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f24720e     // Catch: java.lang.Throwable -> L99
            if (r1 < r0) goto L10
            r8.m16506b()     // Catch: java.lang.Throwable -> L99
        L10:
            int r7 = r8.f24719d     // Catch: java.lang.Throwable -> L99
        L12:
            int r0 = r8.f24720e     // Catch: java.lang.Throwable -> L99
            r6 = 10
            if (r7 == r0) goto L4a
            byte[] r0 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            r0 = r0[r7]     // Catch: java.lang.Throwable -> L99
            if (r0 != r6) goto L46
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            if (r7 == r0) goto L44
            byte[] r0 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            int r5 = r7 + (-1)
            r1 = r0[r5]     // Catch: java.lang.Throwable -> L99
            r0 = 13
            if (r1 != r0) goto L44
        L2c:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L99
            byte[] r2 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r5 = r5 - r0
            java.nio.charset.Charset r0 = r8.f24717b     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L99
            r3.<init>(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L99
            int r0 = r7 + 1
            r8.f24719d = r0     // Catch: java.lang.Throwable -> L99
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L99
            goto L49
        L44:
            r5 = r7
            goto L2c
        L46:
            int r7 = r7 + 1
            goto L12
        L49:
            return r3
        L4a:
            com.amap.api.services.a.da$1 r5 = new com.amap.api.services.a.da$1     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f24720e     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L99
        L56:
            byte[] r3 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            int r2 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f24720e     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r1 = r1 - r0
            r5.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L99
            r0 = -1
            r8.f24720e = r0     // Catch: java.lang.Throwable -> L99
            r8.m16506b()     // Catch: java.lang.Throwable -> L99
            int r3 = r8.f24719d     // Catch: java.lang.Throwable -> L99
        L6a:
            int r0 = r8.f24720e     // Catch: java.lang.Throwable -> L99
            if (r3 == r0) goto L56
            byte[] r0 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L99
            if (r0 != r6) goto L8d
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            if (r3 == r0) goto L83
            byte[] r2 = r8.f24718c     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f24719d     // Catch: java.lang.Throwable -> L99
            int r0 = r3 - r0
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L99
        L83:
            int r0 = r3 + 1
            r8.f24719d = r0     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L99
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L99
            goto L90
        L8d:
            int r3 = r3 + 1
            goto L6a
        L90:
            return r0
        L91:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L99
            throw r1     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L99
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1953da.m16508a():java.lang.String");
    }

    public C1953da(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C1953da(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null && charset != null) {
            if (i >= 0) {
                if (charset.equals(C1955db.f24722a)) {
                    this.f24716a = inputStream;
                    this.f24717b = charset;
                    this.f24718c = new byte[i];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
        throw new NullPointerException();
    }
}
