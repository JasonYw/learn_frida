package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amap.api.services.p126a.C1928cq;
import com.amap.api.services.p126a.C1932cs;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.services.a.cn */
/* loaded from: classes19.dex */
public class C1923cn {
    static {
        Covode.recordClassIndex(5534);
    }

    /* renamed from: a */
    public static void m16645a(C1914cf c1914cf, Context context, String str) {
        List<C1928cq> m16636a = C1925a.m16636a(c1914cf, str, "used");
        if (m16636a == null || m16636a.size() <= 0) {
            return;
        }
        for (C1928cq c1928cq : m16636a) {
            if (c1928cq != null && c1928cq.m16621c().equals(str)) {
                m16650a(context, c1914cf, c1928cq.m16628a());
                List m16677b = c1914cf.m16677b(C1928cq.m16626a(str, c1928cq.m16618e()), C1928cq.class);
                if (m16677b != null && m16677b.size() > 0) {
                    C1928cq c1928cq2 = (C1928cq) m16677b.get(0);
                    c1928cq2.m16620c("errorstatus");
                    C1925a.m16638a(c1914cf, c1928cq2, C1928cq.m16623b(c1928cq2.m16628a()));
                    File file = new File(m16647a(context, c1928cq2.m16628a()));
                    if (file.exists()) {
                        C116971W2r.LIZ(file);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16649a(Context context, File file, C1889bo c1889bo) {
        File parentFile = file.getParentFile();
        if (file.exists() || parentFile == null || !parentFile.exists()) {
            return;
        }
        m16639c(context, c1889bo.m16818a(), c1889bo.m16814b());
    }

    /* renamed from: a */
    public static void m16648a(Context context, File file, String str, C1889bo c1889bo) {
        C1914cf c1914cf = new C1914cf(context, C1927cp.m16629c());
        C1928cq m16637a = C1925a.m16637a(c1914cf, file.getName());
        String m16618e = m16637a != null ? m16637a.m16618e() : null;
        File file2 = new File(str);
        if (TextUtils.isEmpty(m16618e) || !file2.exists()) {
            return;
        }
        String m16835a = C1887bm.m16835a(str);
        String name = file2.getName();
        C1928cq.C1929a c1929a = new C1928cq.C1929a(name, m16835a, c1889bo.m16818a(), c1889bo.m16814b(), m16618e);
        c1929a.m16614a("useod");
        C1925a.m16638a(c1914cf, c1929a.m16616a(), C1928cq.m16623b(name));
    }

    /* renamed from: a */
    public static String m16654a(Context context) {
        new StringBuilder();
        return C0002O.m25085C(C116971W2r.LIZJ(context).getAbsolutePath(), File.separator, "pngex");
    }

    /* renamed from: a */
    public static String m16644a(String str) {
        new StringBuilder();
        return C0002O.m25086C(str, ".o");
    }

    /* renamed from: a */
    public static String m16647a(Context context, String str) {
        new StringBuilder();
        return C0002O.m25085C(m16654a(context), File.separator, str);
    }

    /* renamed from: com.amap.api.services.a.cn$a */
    /* loaded from: classes19.dex */
    public static class C1925a {
        static {
            Covode.recordClassIndex(5536);
        }

        /* renamed from: a */
        public static C1928cq m16637a(C1914cf c1914cf, String str) {
            List m16677b = c1914cf.m16677b(C1928cq.m16623b(str), C1928cq.class);
            if (m16677b != null && m16677b.size() > 0) {
                return (C1928cq) m16677b.get(0);
            }
            return null;
        }

        /* renamed from: a */
        public static void m16638a(C1914cf c1914cf, C1928cq c1928cq, String str) {
            c1914cf.m16688a(c1928cq, str);
        }

        /* renamed from: a */
        public static List<C1928cq> m16636a(C1914cf c1914cf, String str, String str2) {
            return c1914cf.m16677b(C1928cq.m16622b(str, str2), C1928cq.class);
        }
    }

    /* renamed from: b */
    public static void m16642b(Context context, String str) {
        C1914cf c1914cf = new C1914cf(context, C1927cp.m16629c());
        List<C1928cq> m16636a = C1925a.m16636a(c1914cf, str, "copy");
        C1935ct.m16580a(m16636a);
        if (m16636a != null) {
            if (m16636a.size() > 1) {
                int size = m16636a.size();
                for (int i = 1; i < size; i++) {
                    m16640c(context, c1914cf, m16636a.get(i).m16628a());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16653a(Context context, C1889bo c1889bo) {
        try {
            C1932cs.C1933a m16598a = C1932cs.m16597b().m16598a(c1889bo);
            if (m16598a != null && m16598a.f24649a) {
                synchronized (m16598a) {
                    m16598a.wait();
                }
            }
            m16598a.f24650b = true;
            String m16641b = m16641b(context, c1889bo.m16818a(), c1889bo.m16814b());
            if (TextUtils.isEmpty(m16641b)) {
                return;
            }
            File file = new File(m16641b);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && parentFile.exists()) {
                    m16639c(context, c1889bo.m16818a(), c1889bo.m16814b());
                    return;
                }
                return;
            }
            String m16647a = m16647a(context, m16644a(file.getName()));
            DexFile loadDex = DexFile.loadDex(m16641b, m16647a, 0);
            if (loadDex != null) {
                loadDex.close();
                m16648a(context, file, m16647a, c1889bo);
            }
            m16598a.f24650b = false;
        } catch (Throwable th) {
            C1935ct.m16581a(th, "BaseLoader", "getInstanceByThread()");
        }
    }

    /* renamed from: b */
    public static String m16641b(Context context, String str, String str2) {
        return m16647a(context, m16646a(context, str, str2));
    }

    /* renamed from: c */
    public static void m16640c(Context context, C1914cf c1914cf, String str) {
        File file = new File(m16647a(context, str));
        if (file.exists()) {
            C116971W2r.LIZ(file);
        }
        c1914cf.m16685a(C1928cq.m16623b(str), C1928cq.class);
    }

    /* renamed from: a */
    public static String m16646a(Context context, String str, String str2) {
        String m16869w = C1878bj.m16869w(context);
        new StringBuilder();
        new StringBuilder();
        return C0002O.m25086C(C1887bm.m16832b(C0002O.m25085C(str, str2, m16869w)), ".jar");
    }

    /* renamed from: c */
    public static void m16639c(final Context context, final String str, final String str2) {
        try {
            C1932cs.m16597b().m16600a().submit(new Runnable() { // from class: com.amap.api.services.a.cn.1
                static {
                    Covode.recordClassIndex(5535);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1914cf c1914cf = new C1914cf(context, C1927cp.m16629c());
                        List<C1928cq> m16677b = c1914cf.m16677b(C1928cq.m16627a(str), C1928cq.class);
                        if (m16677b != null && m16677b.size() > 0) {
                            for (C1928cq c1928cq : m16677b) {
                                if (!str2.equalsIgnoreCase(c1928cq.m16619d())) {
                                    C1923cn.m16640c(context, c1914cf, c1928cq.m16628a());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        C1935ct.m16581a(th, "FileManager", "clearUnSuitableV");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m16652a(Context context, C1914cf c1914cf, C1889bo c1889bo) {
        List m16677b = c1914cf.m16677b(C1928cq.m16622b(c1889bo.m16818a(), "copy"), C1928cq.class);
        String str = null;
        if (m16677b != null && m16677b.size() != 0) {
            C1935ct.m16580a(m16677b);
            for (int i = 0; i < m16677b.size(); i++) {
                C1928cq c1928cq = (C1928cq) m16677b.get(i);
                if (C1935ct.m16590a(context, c1914cf, c1928cq.m16628a(), c1889bo)) {
                    try {
                        m16651a(context, c1914cf, c1889bo, m16647a(context, c1928cq.m16628a()), c1928cq.m16618e());
                        str = c1928cq.m16618e();
                        return str;
                    } catch (Throwable th) {
                        C1935ct.m16581a(th, "FileManager", "loadAvailableD");
                    }
                } else {
                    m16640c(context, c1914cf, c1928cq.m16628a());
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m16650a(Context context, C1914cf c1914cf, String str) {
        m16640c(context, c1914cf, m16644a(str));
        m16640c(context, c1914cf, str);
    }

    /* renamed from: a */
    public static void m16651a(Context context, C1914cf c1914cf, C1889bo c1889bo, String str, String str2) {
        C1932cs.C1933a c1933a;
        FileInputStream fileInputStream;
        RandomAccessFile randomAccessFile = null;
        try {
            String m16818a = c1889bo.m16818a();
            c1933a = C1932cs.m16597b().m16598a(c1889bo);
            if (c1933a != null) {
                try {
                    if (c1933a.f24649a) {
                        synchronized (c1933a) {
                            c1933a.wait();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = null;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            C1935ct.m16583a(fileInputStream);
                        } catch (Throwable unused) {
                        }
                        try {
                            C1935ct.m16583a(randomAccessFile);
                        } catch (Throwable unused2) {
                        }
                        if (c1933a != null) {
                            try {
                                c1933a.f24650b = false;
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            }
            c1933a.f24650b = true;
            String m16646a = m16646a(context, m16818a, c1889bo.m16814b());
            m16650a(context, c1914cf, m16646a);
            fileInputStream = new FileInputStream(new File(str));
            try {
                fileInputStream.read(new byte[32]);
                File file = new File(m16641b(context, m16818a, c1889bo.m16814b()));
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
                    int i = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        if (read == 1024) {
                            randomAccessFile2.seek(i);
                            randomAccessFile2.write(bArr);
                        } else {
                            byte[] bArr2 = new byte[read];
                            System.arraycopy(bArr, 0, bArr2, 0, read);
                            randomAccessFile2.seek(i);
                            randomAccessFile2.write(bArr2);
                        }
                        i += read;
                    }
                    C1928cq.C1929a c1929a = new C1928cq.C1929a(m16646a, C1887bm.m16835a(file.getAbsolutePath()), m16818a, c1889bo.m16814b(), str2);
                    c1929a.m16614a("used");
                    C1928cq m16616a = c1929a.m16616a();
                    C1925a.m16638a(c1914cf, m16616a, C1928cq.m16623b(m16616a.m16628a()));
                    try {
                        C1935ct.m16583a(fileInputStream);
                    } catch (Throwable unused4) {
                    }
                    try {
                        C1935ct.m16583a(randomAccessFile2);
                    } catch (Throwable unused5) {
                    }
                    try {
                        c1933a.f24650b = false;
                    } catch (Throwable unused6) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = randomAccessFile2;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            c1933a = null;
            fileInputStream = null;
        }
    }
}
