package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p003X.C116971W2r;

/* renamed from: anet.channel.strategy.m */
/* loaded from: classes2.dex */
public class C0574m {

    /* renamed from: a */
    public static File f20804a;

    /* renamed from: b */
    public static volatile boolean f20805b;

    /* renamed from: c */
    public static Comparator<File> f20806c = new C0575n();

    static {
        Covode.recordClassIndex(2342);
    }

    /* renamed from: b */
    public static synchronized File[] m20804b() {
        synchronized (C0574m.class) {
            MethodCollector.m14708i(87);
            if (f20804a == null) {
                MethodCollector.m14707o(87);
                return null;
            }
            File[] listFiles = f20804a.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, f20806c);
            }
            MethodCollector.m14707o(87);
            return listFiles;
        }
    }

    /* renamed from: a */
    public static synchronized void m20810a() {
        synchronized (C0574m.class) {
            MethodCollector.m14708i(86);
            ALog.m20785i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
            if (f20804a == null) {
                ALog.m20783w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
                f20805b = true;
                MethodCollector.m14707o(86);
                return;
            }
            File[] listFiles = f20804a.listFiles();
            if (listFiles == null) {
                MethodCollector.m14707o(86);
                return;
            }
            for (File file : listFiles) {
                if (file.isFile()) {
                    C116971W2r.LIZ(file);
                }
            }
            ALog.m20785i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
            MethodCollector.m14707o(86);
        }
    }

    /* renamed from: c */
    public static synchronized void m20803c() {
        synchronized (C0574m.class) {
            MethodCollector.m14708i(88);
            File[] m20804b = m20804b();
            if (m20804b == null) {
                MethodCollector.m14707o(88);
                return;
            }
            int i = 0;
            for (File file : m20804b) {
                if (!file.isDirectory()) {
                    if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                        C116971W2r.LIZ(file);
                    } else if (file.getName().startsWith("WIFI")) {
                        int i2 = i + 1;
                        if (i > 10) {
                            C116971W2r.LIZ(file);
                        }
                        i = i2;
                    }
                }
            }
            MethodCollector.m14707o(88);
        }
    }

    /* renamed from: a */
    public static File m20806a(String str) {
        m20808a(f20804a);
        return new File(f20804a, str);
    }

    /* renamed from: a */
    public static void m20809a(Context context) {
        if (context != null) {
            try {
                File file = new File(C116971W2r.LIZJ(context), "awcn_strategy");
                f20804a = file;
                if (!m20808a(file)) {
                    ALog.m20786e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f20804a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f20804a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f20804a = file2;
                    if (!m20808a(file2)) {
                        ALog.m20786e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f20804a.getAbsolutePath());
                    }
                }
                ALog.m20785i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f20804a.getAbsolutePath());
                if (f20805b) {
                    m20810a();
                    f20805b = false;
                    return;
                }
                m20803c();
            } catch (Throwable th) {
                ALog.m20787e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static boolean m20808a(File file) {
        if (file != null && !file.exists()) {
            return file.mkdir();
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized <T> T m20805a(String str, StrategyStatObject strategyStatObject) {
        T t;
        synchronized (C0574m.class) {
            MethodCollector.m14708i(90);
            t = (T) SerializeHelper.restore(m20806a(str), strategyStatObject);
            MethodCollector.m14707o(90);
        }
        return t;
    }

    /* renamed from: a */
    public static synchronized void m20807a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (C0574m.class) {
            MethodCollector.m14708i(89);
            SerializeHelper.persist(serializable, m20806a(str), strategyStatObject);
            MethodCollector.m14707o(89);
        }
    }
}
