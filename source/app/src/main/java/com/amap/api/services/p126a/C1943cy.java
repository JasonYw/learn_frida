package com.amap.api.services.p126a;

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

/* renamed from: com.amap.api.services.a.cy */
/* loaded from: classes8.dex */
public final class C1943cy implements Closeable {

    /* renamed from: c */
    public final File f24679c;

    /* renamed from: d */
    public final File f24680d;

    /* renamed from: e */
    public final File f24681e;

    /* renamed from: f */
    public final File f24682f;

    /* renamed from: g */
    public final int f24683g;

    /* renamed from: h */
    public long f24684h;

    /* renamed from: i */
    public final int f24685i;

    /* renamed from: j */
    public long f24686j;

    /* renamed from: k */
    public Writer f24687k;

    /* renamed from: n */
    public int f24690n;

    /* renamed from: o */
    public AbstractC1951cz f24691o;

    /* renamed from: a */
    public static final Pattern f24675a = C116971W2r.LIZJ("[a-z0-9_-]{1,120}");

    /* renamed from: q */
    public static final ThreadFactory f24677q = new ThreadFactory() { // from class: com.amap.api.services.a.cy.1

        /* renamed from: a */
        public final AtomicInteger f24694a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5555);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f24694a.getAndIncrement());
        }
    };

    /* renamed from: b */
    public static ThreadPoolExecutor f24676b = new PThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), f24677q);

    /* renamed from: s */
    public static final OutputStream f24678s = new OutputStream() { // from class: com.amap.api.services.a.cy.3
        static {
            Covode.recordClassIndex(5557);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    };

    /* renamed from: l */
    public int f24688l = 1000;

    /* renamed from: m */
    public final LinkedHashMap<String, C1950c> f24689m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: p */
    public long f24692p = 0;

    /* renamed from: r */
    public final Callable<Void> f24693r = new Callable<Void>() { // from class: com.amap.api.services.a.cy.2
        static {
            Covode.recordClassIndex(5556);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C1943cy.this) {
                if (C1943cy.this.f24687k == null) {
                    return null;
                }
                C1943cy.this.m16532k();
                if (C1943cy.this.m16534i()) {
                    C1943cy.this.m16535h();
                    C1943cy.this.f24690n = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: com.amap.api.services.a.cy$a */
    /* loaded from: classes8.dex */
    public final class C1947a {

        /* renamed from: b */
        public final C1950c f24697b;

        /* renamed from: c */
        public final boolean[] f24698c;

        /* renamed from: d */
        public boolean f24699d;

        /* renamed from: e */
        public boolean f24700e;

        static {
            Covode.recordClassIndex(5558);
        }

        /* renamed from: b */
        public final void m16526b() {
            C1943cy.this.m16559a(this, false);
        }

        /* renamed from: com.amap.api.services.a.cy$a$a */
        /* loaded from: classes8.dex */
        public class C1948a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(5559);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C1947a.this.f24699d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C1947a.this.f24699d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C1947a.this.f24699d = true;
                }
            }

            public C1948a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C1947a.this.f24699d = true;
                }
            }
        }

        /* renamed from: a */
        public final void m16530a() {
            if (this.f24699d) {
                C1943cy.this.m16559a(this, false);
                C1943cy.this.m16545c(this.f24697b.f24708b);
            } else {
                C1943cy.this.m16559a(this, true);
            }
            this.f24700e = true;
        }

        /* renamed from: a */
        public final OutputStream m16529a(int i) {
            FileOutputStream fileOutputStream;
            C1948a c1948a;
            if (i >= 0 && i < C1943cy.this.f24685i) {
                synchronized (C1943cy.this) {
                    if (this.f24697b.f24711e == this) {
                        if (!this.f24697b.f24710d) {
                            this.f24698c[i] = true;
                        }
                        File m16515b = this.f24697b.m16515b(i);
                        try {
                            fileOutputStream = new FileOutputStream(m16515b);
                        } catch (FileNotFoundException unused) {
                            C1943cy.this.f24679c.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(m16515b);
                            } catch (FileNotFoundException unused2) {
                                return C1943cy.f24678s;
                            }
                        }
                        c1948a = new C1948a(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return c1948a;
            }
            throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C1943cy.this.f24685i);
        }

        public C1947a(C1950c c1950c) {
            boolean[] zArr;
            this.f24697b = c1950c;
            if (c1950c.f24710d) {
                zArr = null;
            } else {
                zArr = new boolean[C1943cy.this.f24685i];
            }
            this.f24698c = zArr;
        }
    }

    /* renamed from: com.amap.api.services.a.cy$b */
    /* loaded from: classes8.dex */
    public final class C1949b implements Closeable {

        /* renamed from: b */
        public final String f24703b;

        /* renamed from: c */
        public final long f24704c;

        /* renamed from: d */
        public final InputStream[] f24705d;

        /* renamed from: e */
        public final long[] f24706e;

        static {
            Covode.recordClassIndex(5560);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f24705d) {
                C1955db.m16505a(inputStream);
            }
        }

        /* renamed from: a */
        public final InputStream m16524a(int i) {
            return this.f24705d[i];
        }

        public C1949b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f24703b = str;
            this.f24704c = j;
            this.f24705d = inputStreamArr;
            this.f24706e = jArr;
        }
    }

    /* renamed from: j */
    private void m16533j() {
        if (this.f24687k != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: b */
    public final File m16550b() {
        return this.f24679c;
    }

    /* renamed from: d */
    public final void m16544d() {
        close();
        C1955db.m16504a(this.f24679c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public boolean m16534i() {
        int i = this.f24690n;
        if (i >= 2000 && i >= this.f24689m.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized void m16547c() {
        m16533j();
        m16532k();
        this.f24687k.flush();
    }

    static {
        Covode.recordClassIndex(5554);
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m16561a() {
        try {
            if (f24676b == null || f24676b.isShutdown()) {
                f24676b = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), f24677q);
            }
        } catch (Throwable unused) {
        }
        return f24676b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m16532k() {
        while (true) {
            if (this.f24686j <= this.f24684h && this.f24689m.size() <= this.f24688l) {
                return;
            }
            String key = this.f24689m.entrySet().iterator().next().getKey();
            m16545c(key);
            AbstractC1951cz abstractC1951cz = this.f24691o;
            if (abstractC1951cz != null) {
                abstractC1951cz.m16509a(key);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f24687k == null) {
            return;
        }
        Iterator it = new ArrayList(this.f24689m.values()).iterator();
        while (it.hasNext()) {
            C1950c c1950c = (C1950c) it.next();
            if (c1950c.f24711e != null) {
                c1950c.f24711e.m16526b();
            }
        }
        m16532k();
        this.f24687k.close();
        this.f24687k = null;
    }

    /* renamed from: g */
    private void m16536g() {
        m16555a(this.f24681e);
        Iterator<C1950c> it = this.f24689m.values().iterator();
        while (it.hasNext()) {
            C1950c next = it.next();
            int i = 0;
            if (next.f24711e == null) {
                while (i < this.f24685i) {
                    this.f24686j += next.f24709c[i];
                    i++;
                }
            } else {
                next.f24711e = null;
                while (i < this.f24685i) {
                    m16555a(next.m16522a(i));
                    m16555a(next.m16515b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m16538f() {
        C1953da c1953da = new C1953da(new FileInputStream(this.f24680d), C1955db.f24722a);
        try {
            String m16508a = c1953da.m16508a();
            String m16508a2 = c1953da.m16508a();
            String m16508a3 = c1953da.m16508a();
            String m16508a4 = c1953da.m16508a();
            String m16508a5 = c1953da.m16508a();
            if ("libcore.io.DiskLruCache".equals(m16508a) && "1".equals(m16508a2) && Integer.toString(this.f24683g).equals(m16508a3) && Integer.toString(this.f24685i).equals(m16508a4) && "".equals(m16508a5)) {
                int i = 0;
                while (true) {
                    try {
                        m16542d(c1953da.m16508a());
                        i++;
                    } catch (EOFException unused) {
                        this.f24690n = i - this.f24689m.size();
                        C1955db.m16505a(c1953da);
                        return;
                    }
                }
            } else {
                throw new IOException(C0002O.m25080C("unexpected journal header: [", m16508a, ", ", m16508a2, ", ", m16508a4, ", ", m16508a5, "]"));
            }
        } catch (Throwable th) {
            C1955db.m16505a(c1953da);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m16535h() {
        if (this.f24687k != null) {
            this.f24687k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24681e), C1955db.f24722a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f24683g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f24685i));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C1950c c1950c : this.f24689m.values()) {
            if (c1950c.f24711e != null) {
                bufferedWriter.write("DIRTY " + c1950c.f24708b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c1950c.f24708b + c1950c.m16523a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f24680d.exists()) {
            m16553a(this.f24680d, this.f24682f, true);
        }
        m16553a(this.f24681e, this.f24680d, false);
        C116971W2r.LIZ(this.f24682f);
        this.f24687k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24680d, true), C1955db.f24722a));
    }

    /* renamed from: com.amap.api.services.a.cy$c */
    /* loaded from: classes8.dex */
    public final class C1950c {

        /* renamed from: b */
        public final String f24708b;

        /* renamed from: c */
        public final long[] f24709c;

        /* renamed from: d */
        public boolean f24710d;

        /* renamed from: e */
        public C1947a f24711e;

        /* renamed from: f */
        public long f24712f;

        static {
            Covode.recordClassIndex(5561);
        }

        /* renamed from: a */
        public final String m16523a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f24709c) {
                sb.append(LoggerUtil.BLANK_TAG);
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m16513b(String[] strArr) {
            throw new IOException(C0002O.m25086C("unexpected journal line: ", Arrays.toString(strArr)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m16516a(String[] strArr) {
            if (strArr.length == C1943cy.this.f24685i) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f24709c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m16513b(strArr);
                    }
                }
                return;
            }
            throw m16513b(strArr);
        }

        /* renamed from: b */
        public final File m16515b(int i) {
            File file = C1943cy.this.f24679c;
            return new File(file, this.f24708b + "." + i + ".tmp");
        }

        /* renamed from: a */
        public final File m16522a(int i) {
            File file = C1943cy.this.f24679c;
            return new File(file, this.f24708b + "." + i);
        }

        public C1950c(String str) {
            this.f24708b = str;
            this.f24709c = new long[C1943cy.this.f24685i];
        }
    }

    /* renamed from: b */
    public final C1947a m16548b(String str) {
        return m16551a(str, -1L);
    }

    /* renamed from: a */
    public static void m16555a(File file) {
        if (file.exists() && !C116971W2r.LIZ(file)) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    private void m16539e(String str) {
        if (f24675a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(C0002O.m25085C("keys must match regex [a-z0-9_-]{1,120}: \"", str, C1394i.f22426f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r5 == (-1)) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16542d(java.lang.String r9) {
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
            java.util.LinkedHashMap<java.lang.String, com.amap.api.services.a.cy$c> r0 = r8.f24689m
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r9.substring(r0, r5)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.services.a.cy$c> r0 = r8.f24689m
            java.lang.Object r4 = r0.get(r1)
            com.amap.api.services.a.cy$c r4 = (com.amap.api.services.p126a.C1943cy.C1950c) r4
            r3 = 0
            if (r4 != 0) goto L41
            com.amap.api.services.a.cy$c r4 = new com.amap.api.services.a.cy$c
            r4.<init>(r1)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.services.a.cy$c> r0 = r8.f24689m
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
            com.amap.api.services.p126a.C1943cy.C1950c.m16518a(r4, r2)
            com.amap.api.services.p126a.C1943cy.C1950c.m16519a(r4, r3)
            com.amap.api.services.p126a.C1943cy.C1950c.m16517a(r4, r0)
            return
        L64:
            if (r6 != r1) goto L7b
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L87
            com.amap.api.services.a.cy$a r0 = new com.amap.api.services.a.cy$a
            r0.<init>(r4)
            com.amap.api.services.p126a.C1943cy.C1950c.m16519a(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1943cy.m16542d(java.lang.String):void");
    }

    /* renamed from: c */
    public final synchronized boolean m16545c(String str) {
        m16533j();
        m16539e(str);
        C1950c c1950c = this.f24689m.get(str);
        if (c1950c != null && c1950c.f24711e == null) {
            for (int i = 0; i < this.f24685i; i++) {
                File m16522a = c1950c.m16522a(i);
                if (m16522a.exists() && !C116971W2r.LIZ(m16522a)) {
                    throw new IOException("failed to delete " + m16522a);
                }
                this.f24686j -= c1950c.f24709c[i];
                c1950c.f24709c[i] = 0;
            }
            this.f24690n++;
            this.f24687k.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f24689m.remove(str);
            if (m16534i()) {
                m16561a().submit(this.f24693r);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized C1949b m16552a(String str) {
        m16533j();
        m16539e(str);
        C1950c c1950c = this.f24689m.get(str);
        if (c1950c == null) {
            return null;
        }
        if (!c1950c.f24710d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f24685i];
        for (int i = 0; i < this.f24685i; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(c1950c.m16522a(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.f24685i && inputStreamArr[i2] != null; i2++) {
                    C1955db.m16505a(inputStreamArr[i2]);
                }
                return null;
            }
        }
        this.f24690n++;
        this.f24687k.append((CharSequence) ("READ " + str + '\n'));
        if (m16534i()) {
            m16561a().submit(this.f24693r);
        }
        return new C1949b(str, c1950c.f24712f, inputStreamArr, c1950c.f24709c);
    }

    /* renamed from: a */
    public final void m16560a(int i) {
        if (i < 10) {
            i = 10;
        } else if (i > 10000) {
            i = 10000;
        }
        this.f24688l = i;
    }

    /* renamed from: a */
    private synchronized C1947a m16551a(String str, long j) {
        m16533j();
        m16539e(str);
        C1950c c1950c = this.f24689m.get(str);
        if (j != -1) {
            if (c1950c == null || c1950c.f24712f != j) {
                return null;
            }
        } else if (c1950c == null) {
            c1950c = new C1950c(str);
            this.f24689m.put(str, c1950c);
            C1947a c1947a = new C1947a(c1950c);
            c1950c.f24711e = c1947a;
            Writer writer = this.f24687k;
            writer.write("DIRTY " + str + '\n');
            this.f24687k.flush();
            return c1947a;
        }
        if (c1950c.f24711e != null) {
            return null;
        }
        C1947a c1947a2 = new C1947a(c1950c);
        c1950c.f24711e = c1947a2;
        Writer writer2 = this.f24687k;
        writer2.write("DIRTY " + str + '\n');
        this.f24687k.flush();
        return c1947a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m16559a(C1947a c1947a, boolean z) {
        C1950c c1950c = c1947a.f24697b;
        if (c1950c.f24711e == c1947a) {
            if (z && !c1950c.f24710d) {
                for (int i = 0; i < this.f24685i; i++) {
                    if (c1947a.f24698c[i]) {
                        if (!c1950c.m16515b(i).exists()) {
                            c1947a.m16526b();
                            return;
                        }
                    } else {
                        c1947a.m16526b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f24685i; i2++) {
                File m16515b = c1950c.m16515b(i2);
                if (z) {
                    if (m16515b.exists()) {
                        File m16522a = c1950c.m16522a(i2);
                        m16515b.renameTo(m16522a);
                        long j = c1950c.f24709c[i2];
                        long length = m16522a.length();
                        c1950c.f24709c[i2] = length;
                        this.f24686j = (this.f24686j - j) + length;
                    }
                } else {
                    m16555a(m16515b);
                }
            }
            this.f24690n++;
            c1950c.f24711e = null;
            if (c1950c.f24710d | z) {
                c1950c.f24710d = true;
                this.f24687k.write("CLEAN " + c1950c.f24708b + c1950c.m16523a() + '\n');
                if (z) {
                    long j2 = this.f24692p;
                    this.f24692p = 1 + j2;
                    c1950c.f24712f = j2;
                }
            } else {
                this.f24689m.remove(c1950c.f24708b);
                this.f24687k.write("REMOVE " + c1950c.f24708b + '\n');
            }
            this.f24687k.flush();
            if (this.f24686j > this.f24684h || m16534i()) {
                m16561a().submit(this.f24693r);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m16553a(File file, File file2, boolean z) {
        if (z) {
            m16555a(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public C1943cy(File file, int i, int i2, long j) {
        this.f24679c = file;
        this.f24683g = i;
        this.f24680d = new File(file, "journal");
        this.f24681e = new File(file, "journal.tmp");
        this.f24682f = new File(file, "journal.bkp");
        this.f24685i = i2;
        this.f24684h = j;
    }

    /* renamed from: a */
    public static C1943cy m16554a(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        C116971W2r.LIZ(file2);
                    } else {
                        m16553a(file2, file3, false);
                    }
                }
                C1943cy c1943cy = new C1943cy(file, i, i2, j);
                if (c1943cy.f24680d.exists()) {
                    try {
                        c1943cy.m16538f();
                        c1943cy.m16536g();
                        c1943cy.f24687k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c1943cy.f24680d, true), C1955db.f24722a));
                        return c1943cy;
                    } catch (Throwable unused) {
                        c1943cy.m16544d();
                    }
                }
                file.mkdirs();
                C1943cy c1943cy2 = new C1943cy(file, i, i2, j);
                c1943cy2.m16535h();
                return c1943cy2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
