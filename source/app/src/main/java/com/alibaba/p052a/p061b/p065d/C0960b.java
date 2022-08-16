package com.alibaba.p052a.p061b.p065d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.p052a.p061b.C0941a;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.proguard.C34037f;
import p003X.G4Y;

/* renamed from: com.alibaba.a.b.d.b */
/* loaded from: classes13.dex */
public class C0960b {

    /* renamed from: a */
    public static String f21376a = "";

    /* renamed from: b */
    public static String f21377b;

    static {
        Covode.recordClassIndex(4270);
    }

    /* renamed from: a */
    public static String m20142a() {
        if (C0941a.m20233c() == null) {
            return "";
        }
        try {
            String string = G4Y.LIZ(C0941a.m20233c(), "UTCommon", 0).getString("_lun", "");
            if (!TextUtils.isEmpty(string)) {
                return new String(C0961c.m20132a(string.getBytes(), 2), C34037f.f43302f);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static void m20140a(String str) {
        C0974i.m20098a("AppInfoUtil", "[setChannle]", str);
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            if (indexOf == -1) {
                f21376a = str;
            } else {
                f21376a = str.substring(0, indexOf);
            }
        }
    }

    /* renamed from: a */
    public static boolean m20141a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.importance == 400) {
                        return false;
                    }
                    if (powerManager.isScreenOn()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static String m20139b() {
        if (C0941a.m20233c() == null) {
            return "";
        }
        try {
            String string = G4Y.LIZ(C0941a.m20233c(), "UTCommon", 0).getString("_luid", "");
            if (!TextUtils.isEmpty(string)) {
                return new String(C0961c.m20132a(string.getBytes(), 2), C34037f.f43302f);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: b */
    public static String m20138b(Context context) {
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m20137b(String str) {
        C0974i.m20098a("AppInfoUtil", "set Appkey:", str);
        f21377b = str;
    }

    /* renamed from: c */
    public static String m20136c() {
        return f21376a;
    }

    /* renamed from: d */
    public static String m20135d() {
        return "";
    }

    /* renamed from: e */
    public static String m20134e() {
        return "";
    }

    /* renamed from: f */
    public static String m20133f() {
        return f21377b;
    }
}
