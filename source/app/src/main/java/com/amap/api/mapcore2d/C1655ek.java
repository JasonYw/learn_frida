package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore2d.C1638eb;
import com.amap.api.mapcore2d.C1643ee;
import com.amap.api.mapcore2d.C1647eg;
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

/* renamed from: com.amap.api.mapcore2d.ek */
/* loaded from: classes19.dex */
public class C1655ek extends AbstractC1653ei {

    /* renamed from: i */
    public PublicKey f23484i;

    static {
        Covode.recordClassIndex(5203);
    }

    /* renamed from: a */
    public void m17683a(String str, String str2) {
        C1647eg.C1648a c1648a = null;
        try {
            if (this.f23477c != null) {
                return;
            }
            C1647eg.C1648a m17711a = C1647eg.m17710b().m17711a(this.f23479e);
            if (m17711a != null) {
                m17711a.f23464a = true;
            }
            m17690b();
            if (m17711a.f23465b) {
                throw new Exception("file is downloading");
            }
            this.f23477c = DexFile.loadDex(str, str2, 0);
            try {
                m17711a.f23464a = false;
                synchronized (m17711a) {
                    m17711a.notify();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            try {
                C1650eh.m17694a(th, "dLoader", "loadFile");
                throw new Exception("load file fail");
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        c1648a.f23464a = false;
                        synchronized (c1648a) {
                            c1648a.notify();
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
    private void m17678c() {
        if (this.f23484i != null) {
            return;
        }
        this.f23484i = C1650eh.m17708a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0016 -> B:49:0x0017). Please submit an issue!!! */
    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) {
        Class<?> cls;
        Class<?> cls2;
        try {
            try {
                if (this.f23477c != null) {
                    try {
                    } catch (Throwable th) {
                        cls = cls2;
                        C1650eh.m17694a(th, "dLoader", "findCl");
                    }
                    synchronized (this.f23476b) {
                        try {
                            cls = this.f23476b.get(str);
                            try {
                                if (cls != null) {
                                    this.f23482h = false;
                                    return cls;
                                } else if (!this.f23481g) {
                                    this.f23482h = true;
                                    Class<?> loadClass = this.f23477c.loadClass(str, this);
                                    synchronized (this.f23477c) {
                                        this.f23477c.notify();
                                    }
                                    this.f23482h = false;
                                    if (loadClass != null) {
                                        try {
                                            synchronized (this.f23476b) {
                                                this.f23476b.put(str, loadClass);
                                            }
                                        } catch (Throwable th2) {
                                            C1650eh.m17694a(th2, "dLoader", "findCl");
                                        }
                                        this.f23482h = false;
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
    private boolean m17685a(File file) {
        JarFile jarFile;
        try {
            m17678c();
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
                m17682a(jarFile, jarEntry);
                Certificate[] certificates = jarEntry.getCertificates();
                if (certificates == null) {
                    try {
                        jarFile.close();
                    } catch (Throwable unused2) {
                    }
                    return false;
                }
                boolean m17684a = m17684a(file, certificates);
                try {
                    jarFile.close();
                } catch (Throwable unused3) {
                }
                return m17684a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1650eh.m17694a(th, "DyLoader", "verify");
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
    private void m17687a(C1627dt c1627dt, File file) {
        C1643ee m17750a = C1638eb.C1640a.m17750a(c1627dt, file.getName());
        if (m17750a != null) {
            this.f23480f = m17750a.m17731e();
        }
    }

    /* renamed from: a */
    private void m17682a(JarFile jarFile, JarEntry jarEntry) {
        InputStream inputStream;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream.read(new byte[8192]) > 0);
            } catch (Throwable th) {
                th = th;
                try {
                    C1650eh.m17694a(th, "DyLoader", "loadJa");
                    try {
                        C1650eh.m17696a(inputStream);
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        C1650eh.m17696a(inputStream);
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
    private void m17680b(C1627dt c1627dt, File file) {
        this.f23478d = false;
        C1638eb.m17763a(this.f23475a, c1627dt, file.getName());
        String m17765a = C1638eb.m17765a(this.f23475a, c1627dt, this.f23479e);
        if (!TextUtils.isEmpty(m17765a)) {
            this.f23480f = m17765a;
            C1638eb.m17766a(this.f23475a, this.f23479e);
        }
    }

    /* renamed from: b */
    private void m17679b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return;
        }
        throw new Exception("dexPath or dexOutputDir is null.");
    }

    /* renamed from: a */
    private boolean m17684a(File file, Certificate[] certificateArr) {
        int length;
        try {
            if (certificateArr.length > 0 && (length = certificateArr.length - 1) >= 0) {
                certificateArr[length].verify(this.f23484i);
                return true;
            }
            return false;
        } catch (Exception e) {
            C1650eh.m17694a(e, "DyLoader", "check");
            return false;
        }
    }

    /* renamed from: b */
    private void m17681b(final Context context, final String str, final String str2) {
        try {
            C1647eg.m17710b().m17713a().submit(new Runnable() { // from class: com.amap.api.mapcore2d.ek.1
                static {
                    Covode.recordClassIndex(5204);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1655ek.this.m17689a(context, str, str2);
                    } catch (Throwable th) {
                        C1650eh.m17694a(th, "dLoader", "run()");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public C1655ek(Context context, C1599da c1599da, boolean z) {
        super(context, c1599da, z);
        String m17754b = C1638eb.m17754b(context, c1599da.m17972a(), c1599da.m17968b());
        String m17767a = C1638eb.m17767a(context);
        m17679b(m17754b, m17767a);
        File file = new File(m17754b);
        if (!C1647eg.m17710b().m17711a(this.f23479e).f23465b) {
            if (z) {
                new StringBuilder();
                m17683a(m17754b, C0002O.m25085C(m17767a, File.separator, C1638eb.m17757a(file.getName())));
                m17681b(context, m17754b, m17767a);
                return;
            }
            return;
        }
        throw new Exception("file is downloading");
    }

    /* renamed from: a */
    private boolean m17688a(C1627dt c1627dt, C1599da c1599da, String str) {
        if (m17685a(new File(str))) {
            return C1650eh.m17698a(c1627dt, C1638eb.m17759a(this.f23475a, c1599da.m17972a(), c1599da.m17968b()), str, c1599da);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m17686a(C1627dt c1627dt, String str, String str2) {
        String m17760a = C1638eb.m17760a(this.f23475a, str);
        if (C1650eh.m17698a(c1627dt, str, m17760a, this.f23479e)) {
            return true;
        }
        if (C1638eb.C1640a.m17750a(c1627dt, str) != null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f23480f)) {
            C1643ee.C1644a c1644a = new C1643ee.C1644a(str, C1594cx.m17993a(m17760a), this.f23479e.m17972a(), this.f23479e.m17968b(), str2);
            c1644a.m17727a("useod");
            C1638eb.C1640a.m17751a(c1627dt, c1644a.m17729a(), C1643ee.m17736b(str));
        }
        return true;
    }

    /* renamed from: a */
    public void m17689a(Context context, String str, String str2) {
        C1627dt c1627dt;
        File file;
        new Date().getTime();
        try {
            c1627dt = new C1627dt(context, C1642ed.m17742c());
            file = new File(str);
            m17687a(c1627dt, file);
            if (!m17688a(c1627dt, this.f23479e, file.getAbsolutePath())) {
                m17680b(c1627dt, file);
            }
        } catch (Throwable th) {
            C1650eh.m17694a(th, "dLoader", "verifyD()");
        }
        if (!file.exists()) {
            return;
        }
        new StringBuilder();
        if (new File(C0002O.m25085C(str2, File.separator, C1638eb.m17757a(file.getName()))).exists() && !m17686a(c1627dt, C1638eb.m17757a(file.getName()), this.f23480f)) {
            C1638eb.m17766a(this.f23475a, this.f23479e);
        }
        new Date().getTime();
    }
}
