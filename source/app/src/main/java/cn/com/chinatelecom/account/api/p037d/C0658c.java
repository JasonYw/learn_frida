package cn.com.chinatelecom.account.api.p037d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import cn.com.chinatelecom.account.api.p036c.C0651l;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.InetAddress;

/* renamed from: cn.com.chinatelecom.account.api.d.c */
/* loaded from: classes2.dex */
public class C0658c {

    /* renamed from: a */
    public static String f20957a = null;

    /* renamed from: b */
    public static long f20958b = 0;

    /* renamed from: c */
    public static long f20959c = 1800000;

    static {
        Covode.recordClassIndex(2709);
        C0658c.class.getSimpleName();
    }

    /* renamed from: a */
    public static synchronized String m20691a() {
        synchronized (C0658c.class) {
            MethodCollector.m14708i(179);
            if (System.currentTimeMillis() >= f20958b || !C0669d.m20634a(f20957a)) {
                MethodCollector.m14707o(179);
                return null;
            }
            String str = f20957a;
            MethodCollector.m14707o(179);
            return str;
        }
    }

    /* renamed from: a */
    public static void m20689a(Context context) {
        if (m20685b(context) && f20957a == null && C0673h.m20598a() == null) {
            new C0651l().execute(new C0659d(context));
        }
    }

    /* renamed from: b */
    public static String m20684b(String str, String str2, int i) {
        try {
            C0671f.m20603a(str2).m20613b(i);
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception e) {
            StringBuilder sb = i == 0 ? new StringBuilder("first exception: ") : new StringBuilder("retry exception: ");
            sb.append(e.getMessage());
            C0671f.m20603a(str2).m20606g(sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m20685b(Context context) {
        try {
            String packageName = context.getPackageName();
            String str = "";
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                }
            }
            return packageName.equals(str);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
