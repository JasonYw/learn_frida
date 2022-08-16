package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.p126a.C1923cn;
import com.amap.api.services.p126a.C1928cq;
import com.amap.api.services.p126a.C1932cs;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.cw */
/* loaded from: classes19.dex */
public class C1940cw extends AbstractC1938cu {

    /* renamed from: i */
    public PublicKey f24669i;

    static {
        Covode.recordClassIndex(5551);
    }

    /* renamed from: a */
    public void m16570a(String str, String str2) {
        C1932cs.C1933a c1933a = null;
        try {
            if (this.f24662c != null) {
                return;
            }
            C1932cs.C1933a m16598a = C1932cs.m16597b().m16598a(this.f24664e);
            if (m16598a != null) {
                m16598a.f24649a = true;
            }
            m16577b();
            if (m16598a.f24650b) {
                throw new Exception("file is downloading");
            }
            this.f24662c = DexFile.loadDex(str, str2, 0);
            try {
                m16598a.f24649a = false;
                synchronized (m16598a) {
                    m16598a.notify();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            try {
                C1935ct.m16581a(th, "dLoader", "loadFile");
                throw new Exception("load file fail");
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        c1933a.f24649a = false;
                        synchronized (c1933a) {
                            c1933a.notify();
                            throw th2;
                        }
                    } catch (Throwable unused2) {
                        throw th2;
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: c */
    private void m16565c() {
        if (this.f24669i != null) {
            return;
        }
        this.f24669i = C1935ct.m16595a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0016 -> B:49:0x0017). Please submit an issue!!! */
    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) {
        Class<?> cls;
        Class<?> cls2;
        try {
            try {
                if (this.f24662c != null) {
                    try {
                    } catch (Throwable th) {
                        cls = cls2;
                        C1935ct.m16581a(th, "dLoader", "findCl");
                    }
                    synchronized (this.f24661b) {
                        try {
                            cls = this.f24661b.get(str);
                            try {
                                if (cls != null) {
                                    this.f24667h = false;
                                    return cls;
                                } else if (!this.f24666g) {
                                    this.f24667h = true;
                                    Class<?> loadClass = this.f24662c.loadClass(str, this);
                                    synchronized (this.f24662c) {
                                        this.f24662c.notify();
                                    }
                                    this.f24667h = false;
                                    if (loadClass != null) {
                                        try {
                                            synchronized (this.f24661b) {
                                                this.f24661b.put(str, loadClass);
                                            }
                                        } catch (Throwable th2) {
                                            C1935ct.m16581a(th2, "dLoader", "findCl");
                                        }
                                        this.f24667h = false;
                                        return loadClass;
                                    }
                                    throw new ClassNotFoundException(str);
                                } else {
                                    throw new ClassNotFoundException(str);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cls2 = cls;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } else {
                    throw new ClassNotFoundException(str);
                }
            }
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private boolean m16572a(File file) {
        JarFile jarFile;
        try {
            m16565c();
            jarFile = new JarFile(file);
            try {
                JarEntry jarEntry = jarFile.getJarEntry("classes.dex");
                if (jarEntry == null) {
                    try {
                        jarFile.close();
                    } catch (Throwable unused) {
                    }
                    return false;
                }
                m16569a(jarFile, jarEntry);
                Certificate[] certificates = jarEntry.getCertificates();
                if (certificates == null) {
                    try {
                        jarFile.close();
                    } catch (Throwable unused2) {
                    }
                    return false;
                }
                boolean m16571a = m16571a(file, certificates);
                try {
                    jarFile.close();
                } catch (Throwable unused3) {
                }
                return m16571a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1935ct.m16581a(th, "DyLoader", "verify");
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            jarFile = null;
        }
    }

    /* renamed from: a */
    private void m16574a(C1914cf c1914cf, File file) {
        C1928cq m16637a = C1923cn.C1925a.m16637a(c1914cf, file.getName());
        if (m16637a != null) {
            this.f24665f = m16637a.m16618e();
        }
    }

    /* renamed from: a */
    private void m16569a(JarFile jarFile, JarEntry jarEntry) {
        InputStream inputStream;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream.read(new byte[8192]) > 0);
            } catch (Throwable th) {
                th = th;
                try {
                    C1935ct.m16581a(th, "DyLoader", "loadJa");
                    try {
                        C1935ct.m16583a(inputStream);
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        C1935ct.m16583a(inputStream);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: b */
    private void m16567b(C1914cf c1914cf, File file) {
        this.f24663d = false;
        C1923cn.m16650a(this.f24660a, c1914cf, file.getName());
        String m16652a = C1923cn.m16652a(this.f24660a, c1914cf, this.f24664e);
        if (!TextUtils.isEmpty(m16652a)) {
            this.f24665f = m16652a;
            C1923cn.m16653a(this.f24660a, this.f24664e);
        }
    }

    /* renamed from: b */
    private void m16566b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return;
        }
        throw new Exception("dexPath or dexOutputDir is null.");
    }

    /* renamed from: a */
    private boolean m16571a(File file, Certificate[] certificateArr) {
        int length;
        try {
            if (certificateArr.length > 0 && (length = certificateArr.length - 1) >= 0) {
                certificateArr[length].verify(this.f24669i);
                return true;
            }
            return false;
        } catch (Exception e) {
            C1935ct.m16581a(e, "DyLoader", "check");
            return false;
        }
    }

    /* renamed from: b */
    private void m16568b(final Context context, final String str, final String str2) {
        try {
            C1932cs.m16597b().m16600a().submit(new Runnable() { // from class: com.amap.api.services.a.cw.1
                static {
                    Covode.recordClassIndex(5552);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1940cw.this.m16576a(context, str, str2);
                    } catch (Throwable th) {
                        C1935ct.m16581a(th, "dLoader", "run()");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public C1940cw(Context context, C1889bo c1889bo, boolean z) {
        super(context, c1889bo, z);
        String m16641b = C1923cn.m16641b(context, c1889bo.m16818a(), c1889bo.m16814b());
        String m16654a = C1923cn.m16654a(context);
        m16566b(m16641b, m16654a);
        File file = new File(m16641b);
        if (!C1932cs.m16597b().m16598a(this.f24664e).f24650b) {
            if (z) {
                new StringBuilder();
                m16570a(m16641b, C0002O.m25085C(m16654a, File.separator, C1923cn.m16644a(file.getName())));
                m16568b(context, m16641b, m16654a);
                return;
            }
            return;
        }
        throw new Exception("file is downloading");
    }

    /* renamed from: a */
    private boolean m16575a(C1914cf c1914cf, C1889bo c1889bo, String str) {
        if (m16572a(new File(str))) {
            return C1935ct.m16585a(c1914cf, C1923cn.m16646a(this.f24660a, c1889bo.m16818a(), c1889bo.m16814b()), str, c1889bo);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m16573a(C1914cf c1914cf, String str, String str2) {
        String m16647a = C1923cn.m16647a(this.f24660a, str);
        if (C1935ct.m16585a(c1914cf, str, m16647a, this.f24664e)) {
            return true;
        }
        if (C1923cn.C1925a.m16637a(c1914cf, str) != null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f24665f)) {
            C1928cq.C1929a c1929a = new C1928cq.C1929a(str, C1887bm.m16835a(m16647a), this.f24664e.m16818a(), this.f24664e.m16814b(), str2);
            c1929a.m16614a("useod");
            C1923cn.C1925a.m16638a(c1914cf, c1929a.m16616a(), C1928cq.m16623b(str));
        }
        return true;
    }

    /* renamed from: a */
    public void m16576a(Context context, String str, String str2) {
        C1914cf c1914cf;
        File file;
        new Date().getTime();
        try {
            c1914cf = new C1914cf(context, C1927cp.m16629c());
            file = new File(str);
            m16574a(c1914cf, file);
            if (!m16575a(c1914cf, this.f24664e, file.getAbsolutePath())) {
                m16567b(c1914cf, file);
            }
        } catch (Throwable th) {
            C1935ct.m16581a(th, "dLoader", "verifyD()");
        }
        if (!file.exists()) {
            return;
        }
        new StringBuilder();
        if (new File(C0002O.m25085C(str2, File.separator, C1923cn.m16644a(file.getName()))).exists() && !m16573a(c1914cf, C1923cn.m16644a(file.getName()), this.f24665f)) {
            C1923cn.m16653a(this.f24660a, this.f24664e);
        }
        new Date().getTime();
    }
}
