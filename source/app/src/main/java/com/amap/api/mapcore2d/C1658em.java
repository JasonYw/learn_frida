package com.amap.api.mapcore2d;

import com.alipay.sdk.p082m.p121u.C1394i;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.em */
/* loaded from: classes8.dex */
public final class C1658em implements Closeable {

    /* renamed from: c */
    public final File f23494c;

    /* renamed from: d */
    public final File f23495d;

    /* renamed from: e */
    public final File f23496e;

    /* renamed from: f */
    public final File f23497f;

    /* renamed from: g */
    public final int f23498g;

    /* renamed from: h */
    public long f23499h;

    /* renamed from: i */
    public final int f23500i;

    /* renamed from: j */
    public long f23501j;

    /* renamed from: k */
    public Writer f23502k;

    /* renamed from: n */
    public int f23505n;

    /* renamed from: o */
    public AbstractC1666en f23506o;

    /* renamed from: a */
    public static final Pattern f23490a = C116971W2r.LIZJ("[a-z0-9_-]{1,120}");

    /* renamed from: q */
    public static final ThreadFactory f23492q = new ThreadFactory() { // from class: com.amap.api.mapcore2d.em.1

        /* renamed from: a */
        public final AtomicInteger f23509a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5207);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f23509a.getAndIncrement());
        }
    };

    /* renamed from: b */
    public static ThreadPoolExecutor f23491b = new PThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23492q);

    /* renamed from: s */
    public static final OutputStream f23493s = new OutputStream() { // from class: com.amap.api.mapcore2d.em.3
        static {
            Covode.recordClassIndex(5209);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    };

    /* renamed from: l */
    public int f23503l = 1000;

    /* renamed from: m */
    public final LinkedHashMap<String, C1665c> f23504m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: p */
    public long f23507p = 0;

    /* renamed from: r */
    public final Callable<Void> f23508r = new Callable<Void>() { // from class: com.amap.api.mapcore2d.em.2
        static {
            Covode.recordClassIndex(5208);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C1658em.this) {
                if (C1658em.this.f23502k == null) {
                    return null;
                }
                C1658em.this.m17644l();
                if (C1658em.this.m17646j()) {
                    C1658em.this.m17647i();
                    C1658em.this.f23505n = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: c */
    public final File m17660c() {
        return this.f23494c;
    }

    /* renamed from: com.amap.api.mapcore2d.em$a */
    /* loaded from: classes8.dex */
    public final class C1662a {

        /* renamed from: b */
        public final C1665c f23512b;

        /* renamed from: c */
        public final boolean[] f23513c;

        /* renamed from: d */
        public boolean f23514d;

        /* renamed from: e */
        public boolean f23515e;

        static {
            Covode.recordClassIndex(5210);
        }

        /* renamed from: b */
        public final void m17638b() {
            C1658em.this.m17672a(this, false);
        }

        /* renamed from: com.amap.api.mapcore2d.em$a$a */
        /* loaded from: classes8.dex */
        public class C1663a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(5211);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C1662a.this.f23514d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C1662a.this.f23514d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C1662a.this.f23514d = true;
                }
            }

            public C1663a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C1662a.this.f23514d = true;
                }
            }
        }

        /* renamed from: a */
        public final void m17642a() {
            if (this.f23514d) {
                C1658em.this.m17672a(this, false);
                C1658em.this.m17658c(this.f23512b.f23523b);
            } else {
                C1658em.this.m17672a(this, true);
            }
            this.f23515e = true;
        }

        /* renamed from: a */
        public final OutputStream m17641a(int i) {
            FileOutputStream fileOutputStream;
            C1663a c1663a;
            if (i >= 0 && i < C1658em.this.f23500i) {
                synchronized (C1658em.this) {
                    if (this.f23512b.f23526e == this) {
                        if (!this.f23512b.f23525d) {
                            this.f23513c[i] = true;
                        }
                        File m17627b = this.f23512b.m17627b(i);
                        try {
                            fileOutputStream = new FileOutputStream(m17627b);
                        } catch (FileNotFoundException unused) {
                            C1658em.this.f23494c.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(m17627b);
                            } catch (FileNotFoundException unused2) {
                                return C1658em.f23493s;
                            }
                        }
                        c1663a = new C1663a(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return c1663a;
            }
            throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C1658em.this.f23500i);
        }

        public C1662a(C1665c c1665c) {
            boolean[] zArr;
            this.f23512b = c1665c;
            if (c1665c.f23525d) {
                zArr = null;
            } else {
                zArr = new boolean[C1658em.this.f23500i];
            }
            this.f23513c = zArr;
        }
    }

    /* renamed from: com.amap.api.mapcore2d.em$b */
    /* loaded from: classes8.dex */
    public final class C1664b implements Closeable {

        /* renamed from: b */
        public final String f23518b;

        /* renamed from: c */
        public final long f23519c;

        /* renamed from: d */
        public final InputStream[] f23520d;

        /* renamed from: e */
        public final long[] f23521e;

        static {
            Covode.recordClassIndex(5212);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f23520d) {
                C1669ep.m17617a(inputStream);
            }
        }

        /* renamed from: a */
        public final InputStream m17636a(int i) {
            return this.f23520d[i];
        }

        public C1664b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f23518b = str;
            this.f23519c = j;
            this.f23520d = inputStreamArr;
            this.f23521e = jArr;
        }
    }

    /* renamed from: a */
    public static void m17674a() {
        ThreadPoolExecutor threadPoolExecutor = f23491b;
        if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
            f23491b.shutdown();
        }
    }

    /* renamed from: k */
    private void m17645k() {
        if (this.f23502k != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: e */
    public final void m17654e() {
        close();
        C1669ep.m17616a(this.f23494c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public boolean m17646j() {
        int i = this.f23505n;
        if (i >= 2000 && i >= this.f23504m.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized void m17657d() {
        m17645k();
        m17644l();
        this.f23502k.flush();
    }

    static {
        Covode.recordClassIndex(5206);
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m17663b() {
        try {
            if (f23491b == null || f23491b.isShutdown()) {
                f23491b = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), f23492q);
            }
        } catch (Throwable unused) {
        }
        return f23491b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m17644l() {
        while (true) {
            if (this.f23501j <= this.f23499h && this.f23504m.size() <= this.f23503l) {
                return;
            }
            String key = this.f23504m.entrySet().iterator().next().getKey();
            m17658c(key);
            AbstractC1666en abstractC1666en = this.f23506o;
            if (abstractC1666en != null) {
                abstractC1666en.m17621a(key);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23502k == null) {
            return;
        }
        Iterator it = new ArrayList(this.f23504m.values()).iterator();
        while (it.hasNext()) {
            C1665c c1665c = (C1665c) it.next();
            if (c1665c.f23526e != null) {
                c1665c.f23526e.m17638b();
            }
        }
        m17644l();
        this.f23502k.close();
        this.f23502k = null;
    }

    /* renamed from: h */
    private void m17648h() {
        m17668a(this.f23496e);
        Iterator<C1665c> it = this.f23504m.values().iterator();
        while (it.hasNext()) {
            C1665c next = it.next();
            int i = 0;
            if (next.f23526e == null) {
                while (i < this.f23500i) {
                    this.f23501j += next.f23524c[i];
                    i++;
                }
            } else {
                next.f23526e = null;
                while (i < this.f23500i) {
                    m17668a(next.m17634a(i));
                    m17668a(next.m17627b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: g */
    private void m17649g() {
        C1667eo c1667eo = new C1667eo(new FileInputStream(this.f23495d), C1669ep.f23534a);
        try {
            String m17620a = c1667eo.m17620a();
            String m17620a2 = c1667eo.m17620a();
            String m17620a3 = c1667eo.m17620a();
            String m17620a4 = c1667eo.m17620a();
            String m17620a5 = c1667eo.m17620a();
            if ("libcore.io.DiskLruCache".equals(m17620a) && "1".equals(m17620a2) && Integer.toString(this.f23498g).equals(m17620a3) && Integer.toString(this.f23500i).equals(m17620a4) && "".equals(m17620a5)) {
                int i = 0;
                while (true) {
                    try {
                        m17655d(c1667eo.m17620a());
                        i++;
                    } catch (EOFException unused) {
                        this.f23505n = i - this.f23504m.size();
                        C1669ep.m17617a(c1667eo);
                        return;
                    }
                }
            } else {
                throw new IOException(C0002O.m25080C("unexpected journal header: [", m17620a, ", ", m17620a2, ", ", m17620a4, ", ", m17620a5, "]"));
            }
        } catch (Throwable th) {
            C1669ep.m17617a(c1667eo);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m17647i() {
        if (this.f23502k != null) {
            this.f23502k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23496e), C1669ep.f23534a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f23498g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f23500i));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C1665c c1665c : this.f23504m.values()) {
            if (c1665c.f23526e != null) {
                bufferedWriter.write("DIRTY " + c1665c.f23523b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c1665c.f23523b + c1665c.m17635a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f23495d.exists()) {
            m17666a(this.f23495d, this.f23497f, true);
        }
        m17666a(this.f23496e, this.f23495d, false);
        C116971W2r.LIZ(this.f23497f);
        this.f23502k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23495d, true), C1669ep.f23534a));
    }

    /* renamed from: com.amap.api.mapcore2d.em$c */
    /* loaded from: classes8.dex */
    public final class C1665c {

        /* renamed from: b */
        public final String f23523b;

        /* renamed from: c */
        public final long[] f23524c;

        /* renamed from: d */
        public boolean f23525d;

        /* renamed from: e */
        public C1662a f23526e;

        /* renamed from: f */
        public long f23527f;

        static {
            Covode.recordClassIndex(5213);
        }

        /* renamed from: a */
        public final String m17635a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f23524c) {
                sb.append(LoggerUtil.BLANK_TAG);
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m17625b(String[] strArr) {
            throw new IOException(C0002O.m25086C("unexpected journal line: ", Arrays.toString(strArr)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m17628a(String[] strArr) {
            if (strArr.length == C1658em.this.f23500i) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f23524c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m17625b(strArr);
                    }
                }
                return;
            }
            throw m17625b(strArr);
        }

        /* renamed from: b */
        public final File m17627b(int i) {
            File file = C1658em.this.f23494c;
            return new File(file, this.f23523b + "." + i + ".tmp");
        }

        /* renamed from: a */
        public final File m17634a(int i) {
            File file = C1658em.this.f23494c;
            return new File(file, this.f23523b + "." + i);
        }

        public C1665c(String str) {
            this.f23523b = str;
            this.f23524c = new long[C1658em.this.f23500i];
        }
    }

    /* renamed from: b */
    public final C1662a m17661b(String str) {
        return m17664a(str, -1L);
    }

    /* renamed from: e */
    private void m17652e(String str) {
        if (f23490a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(C0002O.m25085C("keys must match regex [a-z0-9_-]{1,120}: \"", str, C1394i.f22426f));
    }

    /* renamed from: a */
    public static void m17668a(File file) {
        if (file.exists() && !C116971W2r.LIZ(file)) {
            throw new IOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r5 == (-1)) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m17655d(java.lang.String r9) {
        /*
            r8 = this;
            r1 = 32
            int r6 = r9.indexOf(r1)
            java.lang.String r2 = "unexpected journal line: "
            r7 = -1
            if (r6 == r7) goto L91
            int r0 = r6 + 1
            int r5 = r9.indexOf(r1, r0)
            if (r5 != r7) goto L28
            java.lang.String r1 = r9.substring(r0)
            r0 = 6
            if (r6 != r0) goto L2c
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.em$c> r0 = r8.f23504m
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r9.substring(r0, r5)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.em$c> r0 = r8.f23504m
            java.lang.Object r4 = r0.get(r1)
            com.amap.api.mapcore2d.em$c r4 = (com.amap.api.mapcore2d.C1658em.C1665c) r4
            r3 = 0
            if (r4 != 0) goto L41
            com.amap.api.mapcore2d.em$c r4 = new com.amap.api.mapcore2d.em$c
            r4.<init>(r1)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.em$c> r0 = r8.f23504m
            r0.put(r1, r4)
        L41:
            r1 = 5
            if (r5 == r7) goto L64
            if (r6 != r1) goto L77
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L77
            r2 = 1
            int r5 = r5 + r2
            java.lang.String r1 = r9.substring(r5)
            java.lang.String r0 = " "
            java.lang.String[] r0 = r1.split(r0)
            com.amap.api.mapcore2d.C1658em.C1665c.m17630a(r4, r2)
            com.amap.api.mapcore2d.C1658em.C1665c.m17631a(r4, r3)
            com.amap.api.mapcore2d.C1658em.C1665c.m17629a(r4, r0)
            return
        L64:
            if (r6 != r1) goto L7b
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L87
            com.amap.api.mapcore2d.em$a r0 = new com.amap.api.mapcore2d.em$a
            r0.<init>(r4)
            com.amap.api.mapcore2d.C1658em.C1665c.m17631a(r4, r0)
            return
        L77:
            if (r5 == r7) goto L64
            if (r5 != r7) goto L87
        L7b:
            r0 = 4
            if (r6 != r0) goto L87
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L87
            return
        L87:
            java.lang.String r1 = p002O.C0002O.m25086C(r2, r9)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L91:
            java.lang.String r1 = p002O.C0002O.m25086C(r2, r9)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1658em.m17655d(java.lang.String):void");
    }

    /* renamed from: c */
    public final synchronized boolean m17658c(String str) {
        m17645k();
        m17652e(str);
        C1665c c1665c = this.f23504m.get(str);
        if (c1665c != null && c1665c.f23526e == null) {
            for (int i = 0; i < this.f23500i; i++) {
                File m17634a = c1665c.m17634a(i);
                if (m17634a.exists() && !C116971W2r.LIZ(m17634a)) {
                    throw new IOException("failed to delete " + m17634a);
                }
                this.f23501j -= c1665c.f23524c[i];
                c1665c.f23524c[i] = 0;
            }
            this.f23505n++;
            this.f23502k.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f23504m.remove(str);
            if (m17646j()) {
                m17663b().submit(this.f23508r);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized C1664b m17665a(String str) {
        m17645k();
        m17652e(str);
        C1665c c1665c = this.f23504m.get(str);
        if (c1665c == null) {
            return null;
        }
        if (!c1665c.f23525d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f23500i];
        for (int i = 0; i < this.f23500i; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(c1665c.m17634a(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.f23500i && inputStreamArr[i2] != null; i2++) {
                    C1669ep.m17617a(inputStreamArr[i2]);
                }
                return null;
            }
        }
        this.f23505n++;
        this.f23502k.append((CharSequence) ("READ " + str + '\n'));
        if (m17646j()) {
            m17663b().submit(this.f23508r);
        }
        return new C1664b(str, c1665c.f23527f, inputStreamArr, c1665c.f23524c);
    }

    /* renamed from: a */
    public final void m17673a(int i) {
        if (i < 10) {
            i = 10;
        } else if (i > 10000) {
            i = 10000;
        }
        this.f23503l = i;
    }

    /* renamed from: a */
    private synchronized C1662a m17664a(String str, long j) {
        m17645k();
        m17652e(str);
        C1665c c1665c = this.f23504m.get(str);
        if (j != -1) {
            if (c1665c == null || c1665c.f23527f != j) {
                return null;
            }
        } else if (c1665c == null) {
            c1665c = new C1665c(str);
            this.f23504m.put(str, c1665c);
            C1662a c1662a = new C1662a(c1665c);
            c1665c.f23526e = c1662a;
            Writer writer = this.f23502k;
            writer.write("DIRTY " + str + '\n');
            this.f23502k.flush();
            return c1662a;
        }
        if (c1665c.f23526e != null) {
            return null;
        }
        C1662a c1662a2 = new C1662a(c1665c);
        c1665c.f23526e = c1662a2;
        Writer writer2 = this.f23502k;
        writer2.write("DIRTY " + str + '\n');
        this.f23502k.flush();
        return c1662a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17672a(C1662a c1662a, boolean z) {
        C1665c c1665c = c1662a.f23512b;
        if (c1665c.f23526e == c1662a) {
            if (z && !c1665c.f23525d) {
                for (int i = 0; i < this.f23500i; i++) {
                    if (c1662a.f23513c[i]) {
                        if (!c1665c.m17627b(i).exists()) {
                            c1662a.m17638b();
                            return;
                        }
                    } else {
                        c1662a.m17638b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f23500i; i2++) {
                File m17627b = c1665c.m17627b(i2);
                if (z) {
                    if (m17627b.exists()) {
                        File m17634a = c1665c.m17634a(i2);
                        m17627b.renameTo(m17634a);
                        long j = c1665c.f23524c[i2];
                        long length = m17634a.length();
                        c1665c.f23524c[i2] = length;
                        this.f23501j = (this.f23501j - j) + length;
                    }
                } else {
                    m17668a(m17627b);
                }
            }
            this.f23505n++;
            c1665c.f23526e = null;
            if (c1665c.f23525d | z) {
                c1665c.f23525d = true;
                this.f23502k.write("CLEAN " + c1665c.f23523b + c1665c.m17635a() + '\n');
                if (z) {
                    long j2 = this.f23507p;
                    this.f23507p = 1 + j2;
                    c1665c.f23527f = j2;
                }
            } else {
                this.f23504m.remove(c1665c.f23523b);
                this.f23502k.write("REMOVE " + c1665c.f23523b + '\n');
            }
            this.f23502k.flush();
            if (this.f23501j > this.f23499h || m17646j()) {
                m17663b().submit(this.f23508r);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m17666a(File file, File file2, boolean z) {
        if (z) {
            m17668a(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public C1658em(File file, int i, int i2, long j) {
        this.f23494c = file;
        this.f23498g = i;
        this.f23495d = new File(file, "journal");
        this.f23496e = new File(file, "journal.tmp");
        this.f23497f = new File(file, "journal.bkp");
        this.f23500i = i2;
        this.f23499h = j;
    }

    /* renamed from: a */
    public static C1658em m17667a(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        C116971W2r.LIZ(file2);
                    } else {
                        m17666a(file2, file3, false);
                    }
                }
                C1658em c1658em = new C1658em(file, i, i2, j);
                if (c1658em.f23495d.exists()) {
                    try {
                        c1658em.m17649g();
                        c1658em.m17648h();
                        c1658em.f23502k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c1658em.f23495d, true), C1669ep.f23534a));
                        return c1658em;
                    } catch (Throwable unused) {
                        c1658em.m17654e();
                    }
                }
                file.mkdirs();
                C1658em c1658em2 = new C1658em(file, i, i2, j);
                c1658em2.m17647i();
                return c1658em2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
