package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amap.api.mapcore2d.C1643ee;
import com.amap.api.mapcore2d.C1647eg;
import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.eb */
/* loaded from: classes19.dex */
public class C1638eb {
    static {
        Covode.recordClassIndex(5186);
    }

    /* renamed from: a */
    public static void m17758a(C1627dt c1627dt, Context context, String str) {
        List<C1643ee> m17749a = C1640a.m17749a(c1627dt, str, "used");
        if (m17749a == null || m17749a.size() <= 0) {
            return;
        }
        for (C1643ee c1643ee : m17749a) {
            if (c1643ee != null && c1643ee.m17734c().equals(str)) {
                m17763a(context, c1627dt, c1643ee.m17741a());
                List m17806b = c1627dt.m17806b(C1643ee.m17739a(str, c1643ee.m17731e()), C1643ee.class);
                if (m17806b != null && m17806b.size() > 0) {
                    C1643ee c1643ee2 = (C1643ee) m17806b.get(0);
                    c1643ee2.m17733c("errorstatus");
                    C1640a.m17751a(c1627dt, c1643ee2, C1643ee.m17736b(c1643ee2.m17741a()));
                    File file = new File(m17760a(context, c1643ee2.m17741a()));
                    if (file.exists()) {
                        C116971W2r.LIZ(file);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17762a(Context context, File file, C1599da c1599da) {
        File parentFile = file.getParentFile();
        if (file.exists() || parentFile == null || !parentFile.exists()) {
            return;
        }
        m17752c(context, c1599da.m17972a(), c1599da.m17968b());
    }

    /* renamed from: a */
    public static void m17761a(Context context, File file, String str, C1599da c1599da) {
        C1627dt c1627dt = new C1627dt(context, C1642ed.m17742c());
        C1643ee m17750a = C1640a.m17750a(c1627dt, file.getName());
        String m17731e = m17750a != null ? m17750a.m17731e() : null;
        File file2 = new File(str);
        if (TextUtils.isEmpty(m17731e) || !file2.exists()) {
            return;
        }
        String m17993a = C1594cx.m17993a(str);
        String name = file2.getName();
        C1643ee.C1644a c1644a = new C1643ee.C1644a(name, m17993a, c1599da.m17972a(), c1599da.m17968b(), m17731e);
        c1644a.m17727a("useod");
        C1640a.m17751a(c1627dt, c1644a.m17729a(), C1643ee.m17736b(name));
    }

    /* renamed from: a */
    public static String m17767a(Context context) {
        new StringBuilder();
        return C0002O.m25085C(C116971W2r.LIZJ(context).getAbsolutePath(), File.separator, "pngex");
    }

    /* renamed from: a */
    public static String m17757a(String str) {
        new StringBuilder();
        return C0002O.m25086C(str, ".o");
    }

    /* renamed from: a */
    public static String m17760a(Context context, String str) {
        new StringBuilder();
        return C0002O.m25085C(m17767a(context), File.separator, str);
    }

    /* renamed from: com.amap.api.mapcore2d.eb$a */
    /* loaded from: classes19.dex */
    public static class C1640a {
        static {
            Covode.recordClassIndex(5188);
        }

        /* renamed from: a */
        public static C1643ee m17750a(C1627dt c1627dt, String str) {
            List m17806b = c1627dt.m17806b(C1643ee.m17736b(str), C1643ee.class);
            if (m17806b != null && m17806b.size() > 0) {
                return (C1643ee) m17806b.get(0);
            }
            return null;
        }

        /* renamed from: a */
        public static void m17751a(C1627dt c1627dt, C1643ee c1643ee, String str) {
            c1627dt.m17817a(c1643ee, str);
        }

        /* renamed from: a */
        public static List<C1643ee> m17749a(C1627dt c1627dt, String str, String str2) {
            return c1627dt.m17806b(C1643ee.m17735b(str, str2), C1643ee.class);
        }
    }

    /* renamed from: b */
    public static void m17755b(Context context, String str) {
        C1627dt c1627dt = new C1627dt(context, C1642ed.m17742c());
        List<C1643ee> m17749a = C1640a.m17749a(c1627dt, str, "copy");
        C1650eh.m17693a(m17749a);
        if (m17749a != null) {
            if (m17749a.size() > 1) {
                int size = m17749a.size();
                for (int i = 1; i < size; i++) {
                    m17753c(context, c1627dt, m17749a.get(i).m17741a());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17766a(Context context, C1599da c1599da) {
        try {
            C1647eg.C1648a m17711a = C1647eg.m17710b().m17711a(c1599da);
            if (m17711a != null && m17711a.f23464a) {
                synchronized (m17711a) {
                    m17711a.wait();
                }
            }
            m17711a.f23465b = true;
            String m17754b = m17754b(context, c1599da.m17972a(), c1599da.m17968b());
            if (TextUtils.isEmpty(m17754b)) {
                return;
            }
            File file = new File(m17754b);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && parentFile.exists()) {
                    m17752c(context, c1599da.m17972a(), c1599da.m17968b());
                    return;
                }
                return;
            }
            String m17760a = m17760a(context, m17757a(file.getName()));
            DexFile loadDex = DexFile.loadDex(m17754b, m17760a, 0);
            if (loadDex != null) {
                loadDex.close();
                m17761a(context, file, m17760a, c1599da);
            }
            m17711a.f23465b = false;
        } catch (Throwable th) {
            C1650eh.m17694a(th, "BaseLoader", "getInstanceByThread()");
        }
    }

    /* renamed from: b */
    public static String m17754b(Context context, String str, String str2) {
        return m17760a(context, m17759a(context, str, str2));
    }

    /* renamed from: c */
    public static void m17753c(Context context, C1627dt c1627dt, String str) {
        File file = new File(m17760a(context, str));
        if (file.exists()) {
            C116971W2r.LIZ(file);
        }
        c1627dt.m17814a(C1643ee.m17736b(str), C1643ee.class);
    }

    /* renamed from: a */
    public static String m17759a(Context context, String str, String str2) {
        String m18031v = C1587cu.m18031v(context);
        new StringBuilder();
        new StringBuilder();
        return C0002O.m25086C(C1594cx.m17990b(C0002O.m25085C(str, str2, m18031v)), ".jar");
    }

    /* renamed from: c */
    public static void m17752c(final Context context, final String str, final String str2) {
        try {
            C1647eg.m17710b().m17713a().submit(new Runnable() { // from class: com.amap.api.mapcore2d.eb.1
                static {
                    Covode.recordClassIndex(5187);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1627dt c1627dt = new C1627dt(context, C1642ed.m17742c());
                        List<C1643ee> m17806b = c1627dt.m17806b(C1643ee.m17740a(str), C1643ee.class);
                        if (m17806b != null && m17806b.size() > 0) {
                            for (C1643ee c1643ee : m17806b) {
                                if (!str2.equalsIgnoreCase(c1643ee.m17732d())) {
                                    C1638eb.m17753c(context, c1627dt, c1643ee.m17741a());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        C1650eh.m17694a(th, "FileManager", "clearUnSuitableV");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m17765a(Context context, C1627dt c1627dt, C1599da c1599da) {
        List m17806b = c1627dt.m17806b(C1643ee.m17735b(c1599da.m17972a(), "copy"), C1643ee.class);
        String str = null;
        if (m17806b != null && m17806b.size() != 0) {
            C1650eh.m17693a(m17806b);
            for (int i = 0; i < m17806b.size(); i++) {
                C1643ee c1643ee = (C1643ee) m17806b.get(i);
                if (C1650eh.m17703a(context, c1627dt, c1643ee.m17741a(), c1599da)) {
                    try {
                        m17764a(context, c1627dt, c1599da, m17760a(context, c1643ee.m17741a()), c1643ee.m17731e());
                        str = c1643ee.m17731e();
                        return str;
                    } catch (Throwable th) {
                        C1650eh.m17694a(th, "FileManager", "loadAvailableD");
                    }
                } else {
                    m17753c(context, c1627dt, c1643ee.m17741a());
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m17763a(Context context, C1627dt c1627dt, String str) {
        m17753c(context, c1627dt, m17757a(str));
        m17753c(context, c1627dt, str);
    }

    /* renamed from: a */
    public static void m17764a(Context context, C1627dt c1627dt, C1599da c1599da, String str, String str2) {
        C1647eg.C1648a c1648a;
        FileInputStream fileInputStream;
        RandomAccessFile randomAccessFile = null;
        try {
            String m17972a = c1599da.m17972a();
            c1648a = C1647eg.m17710b().m17711a(c1599da);
            if (c1648a != null) {
                try {
                    if (c1648a.f23464a) {
                        synchronized (c1648a) {
                            c1648a.wait();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = null;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            C1650eh.m17696a(fileInputStream);
                        } catch (Throwable unused) {
                        }
                        try {
                            C1650eh.m17696a(randomAccessFile);
                        } catch (Throwable unused2) {
                        }
                        if (c1648a != null) {
                            try {
                                c1648a.f23465b = false;
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            }
            c1648a.f23465b = true;
            String m17759a = m17759a(context, m17972a, c1599da.m17968b());
            m17763a(context, c1627dt, m17759a);
            fileInputStream = new FileInputStream(new File(str));
            try {
                fileInputStream.read(new byte[32]);
                File file = new File(m17754b(context, m17972a, c1599da.m17968b()));
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
                    C1643ee.C1644a c1644a = new C1643ee.C1644a(m17759a, C1594cx.m17993a(file.getAbsolutePath()), m17972a, c1599da.m17968b(), str2);
                    c1644a.m17727a("used");
                    C1643ee m17729a = c1644a.m17729a();
                    C1640a.m17751a(c1627dt, m17729a, C1643ee.m17736b(m17729a.m17741a()));
                    try {
                        C1650eh.m17696a(fileInputStream);
                    } catch (Throwable unused4) {
                    }
                    try {
                        C1650eh.m17696a(randomAccessFile2);
                    } catch (Throwable unused5) {
                    }
                    try {
                        c1648a.f23465b = false;
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
            c1648a = null;
            fileInputStream = null;
        }
    }
}
