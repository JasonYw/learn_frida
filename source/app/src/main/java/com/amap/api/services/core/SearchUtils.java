package com.amap.api.services.core;

import android.content.Context;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SearchUtils {
    static {
        Covode.recordClassIndex(5681);
    }

    public static String getVersion() {
        return "7.1.0";
    }

    public static String getPkgName(Context context) {
        try {
            return context.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            C2007j.m16371a(th, "SearchUtils", "getPkgName");
            return null;
        }
    }

    public static String getSHA1(Context context) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(Constants.COLON_SEPARATOR);
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            C2007j.m16371a(th, "SearchUtils", "getSHA1");
            return null;
        }
    }
}