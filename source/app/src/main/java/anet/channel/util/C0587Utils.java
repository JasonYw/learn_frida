package anet.channel.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.C0518b;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p2995ta.utdid2.device.UTDevice;
import java.lang.reflect.Method;
import java.util.List;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: anet.channel.util.Utils */
/* loaded from: classes2.dex */
public class C0587Utils {
    public static Context context;

    static {
        Covode.recordClassIndex(2371);
    }

    public static Object anet_channel_util_Utils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "anet_channel_util_Utils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "anet_channel_util_Utils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    public static float getNetworkTimeFactor() {
        float f;
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status != NetworkStatusHelper.NetworkStatus.G4 && status != NetworkStatusHelper.NetworkStatus.WIFI) {
            f = 1.0f;
        } else {
            f = 0.8f;
        }
        if (C0518b.m20978a().m20974b() == NetworkSpeed.Fast.getCode()) {
            return f * 0.75f;
        }
        return f;
    }

    public static Context getAppContext() {
        MethodCollector.m14708i(100);
        Context context2 = context;
        if (context2 != null) {
            MethodCollector.m14707o(100);
            return context2;
        }
        synchronized (C0587Utils.class) {
            try {
                if (context != null) {
                    Context context3 = context;
                    MethodCollector.m14707o(100);
                    return context3;
                }
                try {
                    Class LIZ = C116971W2r.LIZ("android.app.ActivityThread");
                    Object invoke = LIZ.getMethod("currentActivityThread", new Class[0]).invoke(LIZ, new Object[0]);
                    context = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception e) {
                    ALog.m20784w("awcn.Utils", "getAppContext", null, e, new Object[0]);
                }
                Context context4 = context;
                MethodCollector.m14707o(100);
                return context4;
            } catch (Throwable th) {
                MethodCollector.m14707o(100);
                throw th;
            }
        }
    }

    public static String getDeviceId(Context context2) {
        return UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getStackMsg(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    new StringBuilder();
                    stringBuffer.append(C0002O.m25086C(stackTraceElement.toString(), "\n"));
                }
            }
        } catch (Exception e) {
            ALog.m20787e("awcn.Utils", "getStackMsg", null, e, new Object[0]);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
        r2 = r2[8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        r8.close();
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        anet.channel.util.ALog.m20787e("awcn.Utils", "getProcessNameNew ", null, r1, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if (r8 == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessNameNew(int r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.C0587Utils.getProcessNameNew(int):java.lang.String");
    }

    public static String getProcessName(Context context2, int i) {
        String str = "";
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            } else {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-108, ErrorConstant.formatMsg(-108, C0002O.m25086C("BuildVersion=", String.valueOf(Build.VERSION.SDK_INT))), "rt"));
            }
        } catch (Exception e) {
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-108, e.toString(), "rt"));
        }
        if (TextUtils.isEmpty(str)) {
            return getProcessNameNew(i);
        }
        return str;
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method declaredMethod;
        if (str == null || str2 == null) {
            return null;
        }
        Class LIZ = C116971W2r.LIZ(str);
        if (clsArr != null) {
            declaredMethod = LIZ.getDeclaredMethod(str2, clsArr);
        } else {
            declaredMethod = LIZ.getDeclaredMethod(str2, new Class[0]);
        }
        if (declaredMethod == null) {
            return null;
        }
        declaredMethod.setAccessible(true);
        if (objArr != null) {
            return anet_channel_util_Utils_java_lang_reflect_Method_invoke(declaredMethod, LIZ, objArr);
        }
        return anet_channel_util_Utils_java_lang_reflect_Method_invoke(declaredMethod, LIZ, new Object[0]);
    }
}
