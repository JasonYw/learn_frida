package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.amap.api.mapcore2d.eo */
/* loaded from: classes8.dex */
public class C1667eo implements Closeable {

    /* renamed from: a */
    public final InputStream f23528a;

    /* renamed from: b */
    public final Charset f23529b;

    /* renamed from: c */
    public byte[] f23530c;

    /* renamed from: d */
    public int f23531d;

    /* renamed from: e */
    public int f23532e;

    static {
        Covode.recordClassIndex(5215);
    }

    /* renamed from: b */
    private void m17618b() {
        InputStream inputStream = this.f23528a;
        byte[] bArr = this.f23530c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f23531d = 0;
            this.f23532e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f23528a) {
            if (this.f23530c != null) {
                this.f23530c = null;
                this.f23528a.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r8.f23530c[r5] == 13) goto L20;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17620a() {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.f23528a
            monitor-enter(r4)
            byte[] r0 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L91
            int r1 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f23532e     // Catch: java.lang.Throwable -> L99
            if (r1 < r0) goto L10
            r8.m17618b()     // Catch: java.lang.Throwable -> L99
        L10:
            int r7 = r8.f23531d     // Catch: java.lang.Throwable -> L99
        L12:
            int r0 = r8.f23532e     // Catch: java.lang.Throwable -> L99
            r6 = 10
            if (r7 == r0) goto L4a
            byte[] r0 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            r0 = r0[r7]     // Catch: java.lang.Throwable -> L99
            if (r0 != r6) goto L46
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            if (r7 == r0) goto L44
            byte[] r0 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            int r5 = r7 + (-1)
            r1 = r0[r5]     // Catch: java.lang.Throwable -> L99
            r0 = 13
            if (r1 != r0) goto L44
        L2c:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L99
            byte[] r2 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r5 = r5 - r0
            java.nio.charset.Charset r0 = r8.f23529b     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L99
            r3.<init>(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L99
            int r0 = r7 + 1
            r8.f23531d = r0     // Catch: java.lang.Throwable -> L99
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
            com.amap.api.mapcore2d.eo$1 r5 = new com.amap.api.mapcore2d.eo$1     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f23532e     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L99
        L56:
            byte[] r3 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            int r2 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f23532e     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r1 = r1 - r0
            r5.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L99
            r0 = -1
            r8.f23532e = r0     // Catch: java.lang.Throwable -> L99
            r8.m17618b()     // Catch: java.lang.Throwable -> L99
            int r3 = r8.f23531d     // Catch: java.lang.Throwable -> L99
        L6a:
            int r0 = r8.f23532e     // Catch: java.lang.Throwable -> L99
            if (r3 == r0) goto L56
            byte[] r0 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L99
            if (r0 != r6) goto L8d
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            if (r3 == r0) goto L83
            byte[] r2 = r8.f23530c     // Catch: java.lang.Throwable -> L99
            int r1 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r0 = r8.f23531d     // Catch: java.lang.Throwable -> L99
            int r0 = r3 - r0
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L99
        L83:
            int r0 = r3 + 1
            r8.f23531d = r0     // Catch: java.lang.Throwable -> L99
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1667eo.m17620a():java.lang.String");
    }

    public C1667eo(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C1667eo(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null && charset != null) {
            if (i >= 0) {
                if (charset.equals(C1669ep.f23534a)) {
                    this.f23528a = inputStream;
                    this.f23529b = charset;
                    this.f23530c = new byte[i];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
        throw new NullPointerException();
    }
}
