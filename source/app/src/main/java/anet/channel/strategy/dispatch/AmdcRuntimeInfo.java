package anet.channel.strategy.dispatch;

import android.content.Context;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AmdcRuntimeInfo {
    public static volatile int amdcLimitLevel;
    public static volatile long amdcLimitTime;
    public static volatile String appChannel;
    public static volatile String appName;
    public static volatile String appVersion;
    public static volatile Context context;
    public static volatile boolean forceHttps;
    public static IAmdcSign iSign;
    public static volatile double latitude;
    public static volatile double longitude;
    public static Map<String, String> params;

    static {
        Covode.recordClassIndex(2316);
    }

    public static Context getContext() {
        return context;
    }

    public static IAmdcSign getSign() {
        return iSign;
    }

    public static boolean isForceHttps() {
        return forceHttps;
    }

    public static int getAmdcLimitLevel() {
        if (amdcLimitLevel > 0 && System.currentTimeMillis() - amdcLimitTime > 0) {
            amdcLimitTime = 0L;
            amdcLimitLevel = 0;
        }
        return amdcLimitLevel;
    }

    public static synchronized Map<String, String> getParams() {
        synchronized (AmdcRuntimeInfo.class) {
            MethodCollector.m14708i(76);
            if (params == null) {
                Map<String, String> map = Collections.EMPTY_MAP;
                MethodCollector.m14707o(76);
                return map;
            }
            HashMap hashMap = new HashMap(params);
            MethodCollector.m14707o(76);
            return hashMap;
        }
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static void setForceHttps(boolean z) {
        forceHttps = z;
    }

    public static void setSign(IAmdcSign iAmdcSign) {
        iSign = iAmdcSign;
    }

    public static void updateLocation(double d, double d2) {
        latitude = d;
        longitude = d2;
    }

    public static synchronized void setParam(String str, String str2) {
        synchronized (AmdcRuntimeInfo.class) {
            MethodCollector.m14708i(75);
            if (params == null) {
                params = new HashMap();
            }
            params.put(str, str2);
            MethodCollector.m14707o(75);
        }
    }

    public static void updateAmdcLimit(int i, int i2) {
        ALog.m20785i("awcn.AmdcRuntimeInfo", "set amdc limit", null, "level", Integer.valueOf(i), "time", Integer.valueOf(i2));
        if (i >= 0 && i <= 3) {
            amdcLimitLevel = i;
            amdcLimitTime = System.currentTimeMillis() + (i2 * 1000);
        }
    }

    public static void setAppInfo(String str, String str2, String str3) {
        appName = str;
        appVersion = str2;
        appChannel = str3;
    }
}
