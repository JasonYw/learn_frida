package cn.com.chinatelecom.account.api;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Pair;
import cn.com.chinatelecom.account.api.p034a.C0630b;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import p002O.C0002O;

/* loaded from: classes2.dex */
public final class ClientUtils {
    public static final String TAG = ClientUtils.class.getSimpleName();
    public static int sdkType = 0;

    static {
        Covode.recordClassIndex(2672);
    }

    /* renamed from: cn_com_chinatelecom_account_api_ClientUtils_android_app_ActivityManager_getRunningTasks */
    public static List m20742x12b54b59(ActivityManager activityManager, int i) {
        ActionInvokeEntrance.setEventUuid(101301);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(activityManager, new Object[]{Integer.valueOf(i)}, 101301, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(i);
        ActionInvokeEntrance.actionInvoke(runningTasks, activityManager, new Object[]{Integer.valueOf(i)}, 101301, "cn_com_chinatelecom_account_api_ClientUtils_android_app_ActivityManager_getRunningTasks(Landroid/app/ActivityManager;I)Ljava/util/List;");
        return runningTasks;
    }

    public static String enrdata(String str, String str2) {
        try {
            return C0630b.m20739a(str, (RSAPublicKey) C0630b.m20740a(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAT(Context context) {
        try {
            return ((ActivityManager.RunningTaskInfo) m20742x12b54b59((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME), 1).get(0)).topActivity.getClassName();
        } catch (Throwable th) {
            th.printStackTrace();
            return "error";
        }
    }

    public static String getApiVersion() {
        return "3.0";
    }

    public static String getCurrentNetworkType(Context context) {
        return C0673h.m20590e(context);
    }

    public static boolean getHealthy(Context context) {
        try {
            return C0669d.m20623d(context);
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("getHealthy error ：", th.getMessage()), th);
            return false;
        }
    }

    public static boolean getMacData() {
        try {
            return C0669d.m20630c();
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("getMacData error ：", th.getMessage()), th);
            return false;
        }
    }

    public static String getMobileBrand() {
        return Build.BRAND;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static boolean getNetSafe(Context context) {
        try {
            return C0669d.m20629c(context);
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("getNetSafe error ：", th.getMessage()), th);
            return false;
        }
    }

    public static String getOnlineType(Context context) {
        return C0673h.m20589f(context);
    }

    public static String getOperatorType(Context context) {
        return C0673h.m20588g(context);
    }

    public static String getOs() {
        new StringBuilder();
        return C0002O.m25083C(getMobileBrand(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, getModel(), "-A:", Build.VERSION.RELEASE);
    }

    public static String getPID() {
        String str = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getId());
            sb.append(Process.myPid());
            String sb2 = sb.toString();
            if (sb2.length() <= 6) {
                return "ctacco";
            }
            str = sb2.substring(0, 6);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static int getSdkType() {
        return sdkType;
    }

    public static String getSdkVersion() {
        int i = sdkType;
        return i == 1 ? "SDK-HY-v3.8.7" : i == 2 ? "SDK-BIOM-v3.8.7" : "SDK-API-v3.8.7";
    }

    public static boolean getTimePass(Context context) {
        try {
            if (C0669d.m20632b(context)) {
                return true;
            }
            return C0669d.m20624d();
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("getTimePass error ：", th.getMessage()), th);
            return false;
        }
    }

    public static long getTp() {
        return System.currentTimeMillis();
    }

    public static boolean isAT(Context context, String str) {
        byte[] bArr = {105, 100, 36, 105, 101, 103, 36, 105, 98, 99, 100, 107, 126, 111, 102, 111, 105, 101, 103, 36, 107, 105, 105, 101, Byte.MAX_VALUE, 100, 126, 36, 121, 110, 97, 36, Byte.MAX_VALUE, 99, 36, 71, 99, 100, 99, 75, Byte.MAX_VALUE, 126, 98, 75, 105, 126, 99, 124, 99, 126, 115};
        byte[] bArr2 = {105, 100, 36, 105, 101, 103, 36, 105, 98, 99, 100, 107, 126, 111, 102, 111, 105, 101, 103, 36, 107, 105, 105, 101, Byte.MAX_VALUE, 100, 126, 36, 104, 99, 101, 103, 111, 126, 120, 99, 105, 121, 36, Byte.MAX_VALUE, 99, 36, 72, 99, 101, 103, 75, Byte.MAX_VALUE, 126, 98, 75, 105, 126, 99, 124, 99, 126, 115};
        try {
            String className = ((ActivityManager.RunningTaskInfo) m20742x12b54b59((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME), 1).get(0)).topActivity.getClassName();
            if (!className.equals(str) && !className.equals(C0632d.m20735a(bArr))) {
                if (!className.equals(C0632d.m20735a(bArr2))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean isJY() {
        return true;
    }

    public static boolean objChange(Object obj, String str) {
        try {
            return C0669d.m20635a(obj, str);
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("objChange error ：", th.getMessage()), th);
            return false;
        }
    }

    public static void setSdkType(int i) {
        sdkType = i;
    }

    public static String strBuf() {
        try {
            return C0669d.m20633b().toString();
        } catch (Throwable th) {
            CtAuth.warn(TAG, C0002O.m25086C("strBuf error ：", th.getMessage()), th);
            return "";
        }
    }
}
