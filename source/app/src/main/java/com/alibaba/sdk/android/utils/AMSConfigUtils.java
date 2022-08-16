package com.alibaba.sdk.android.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class AMSConfigUtils {
    static {
        Covode.recordClassIndex(4515);
    }

    public static String getAccountId(Context context) {
        return getStringStr(context, "ams_accountId");
    }

    public static String getAppKey(Context context) {
        return getStringStr(context, "ams_appKey");
    }

    public static String getAppSecret(Context context) {
        return getStringStr(context, "ams_appSecret");
    }

    public static String getHttpdnsSecretKey(Context context) {
        return getStringStr(context, "ams_httpdns_secretKey");
    }

    public static String getPackageName(Context context) {
        return getStringStr(context, "ams_packageName");
    }

    public static int getResourceString(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static String getStringStr(Context context, String str) {
        try {
            return context.getResources().getString(getResourceString(context, str));
        } catch (Exception unused) {
            return null;
        }
    }
}
