package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.C0506a;
import anet.channel.fulltrace.C0508b;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.C0587Utils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class GlobalAppRuntimeInfo {

    /* renamed from: a */
    public static Context f20332a;

    /* renamed from: e */
    public static String f20336e;

    /* renamed from: f */
    public static String f20337f;

    /* renamed from: g */
    public static String f20338g;

    /* renamed from: i */
    public static SharedPreferences f20340i;

    /* renamed from: j */
    public static volatile CopyOnWriteArrayList<String> f20341j;

    /* renamed from: k */
    public static volatile long f20342k;

    /* renamed from: l */
    public static String f20343l;

    /* renamed from: b */
    public static ENV f20333b = ENV.ONLINE;

    /* renamed from: c */
    public static String f20334c = "";

    /* renamed from: d */
    public static String f20335d = "";

    /* renamed from: h */
    public static volatile boolean f20339h = true;

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f20341j;
    }

    public static Context getContext() {
        return f20332a;
    }

    public static String getCurrentProcess() {
        return f20335d;
    }

    public static ENV getEnv() {
        return f20333b;
    }

    public static long getInitTime() {
        return f20342k;
    }

    public static String getTtid() {
        return f20336e;
    }

    public static String getUserId() {
        return f20337f;
    }

    public static int getStartType() {
        C0508b sceneInfo = C0506a.m20987a().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.f20514a;
        }
        return -1;
    }

    public static boolean isAppBackground() {
        if (f20332a == null) {
            return true;
        }
        return f20339h;
    }

    static {
        Covode.recordClassIndex(2131);
    }

    public static String getUtdid() {
        Context context;
        if (f20338g == null && (context = f20332a) != null) {
            f20338g = C0587Utils.getDeviceId(context);
        }
        return f20338g;
    }

    public static boolean isTargetProcess() {
        if (!TextUtils.isEmpty(f20334c) && !TextUtils.isEmpty(f20335d)) {
            return f20334c.equalsIgnoreCase(f20335d);
        }
        return true;
    }

    public static void setBackground(boolean z) {
        f20339h = z;
    }

    public static void setCurrentProcess(String str) {
        f20335d = str;
    }

    public static void setEnv(ENV env) {
        f20333b = env;
    }

    public static void setInitTime(long j) {
        f20342k = j;
    }

    public static void setTargetProcess(String str) {
        f20334c = str;
    }

    public static void setUtdid(String str) {
        String str2 = f20338g;
        if (str2 == null || !str2.equals(str)) {
            f20338g = str;
        }
    }

    public static boolean isTargetProcess(String str) {
        if (!TextUtils.isEmpty(f20334c) && !TextUtils.isEmpty(str)) {
            return f20334c.equalsIgnoreCase(str);
        }
        return true;
    }

    public static void setTtid(String str) {
        String str2;
        f20336e = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("@");
                String str3 = null;
                if (indexOf != -1) {
                    str2 = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                String substring = str.substring(indexOf + 1);
                int lastIndexOf = substring.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring2 = substring.substring(0, lastIndexOf);
                    str3 = substring.substring(lastIndexOf + 1);
                    substring = substring2;
                }
                f20343l = str3;
                AmdcRuntimeInfo.setAppInfo(substring, str3, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f20337f;
        if (str2 == null || !str2.equals(str)) {
            f20337f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f20340i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setContext(Context context) {
        f20332a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f20335d)) {
                f20335d = C0587Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f20334c)) {
                f20334c = C0587Utils.getMainProcessName(context);
            }
            if (f20340i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f20340i = defaultSharedPreferences;
                f20337f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.m20786e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f20335d, "TargetProcess", f20334c);
        }
    }

    public static void addBucketInfo(String str, String str2) {
        MethodCollector.m14708i(6);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str.length() <= 32 && str2.length() <= 32) {
                synchronized (GlobalAppRuntimeInfo.class) {
                    try {
                        if (f20341j == null) {
                            f20341j = new CopyOnWriteArrayList<>();
                        }
                        f20341j.add(str);
                        f20341j.add(str2);
                    } catch (Throwable th) {
                        MethodCollector.m14707o(6);
                        throw th;
                    }
                }
                MethodCollector.m14707o(6);
                return;
            }
            MethodCollector.m14707o(6);
            return;
        }
        MethodCollector.m14707o(6);
    }
}
