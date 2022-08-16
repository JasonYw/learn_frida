package com.alipay.android.app.helper;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class TidHelper extends com.alipay.sdk.tid.TidHelper {
    static {
        Covode.recordClassIndex(4608);
    }

    public static void clearTID(Context context) {
        com.alipay.sdk.tid.TidHelper.clearTID(context);
    }

    public static String getIMEI(Context context) {
        return com.alipay.sdk.tid.TidHelper.getIMEI(context);
    }

    public static String getIMSI(Context context) {
        return com.alipay.sdk.tid.TidHelper.getIMSI(context);
    }

    public static String getVirtualImei(Context context) {
        return com.alipay.sdk.tid.TidHelper.getVirtualImei(context);
    }

    public static String getVirtualImsi(Context context) {
        return com.alipay.sdk.tid.TidHelper.getVirtualImsi(context);
    }

    public static boolean resetTID(Context context) {
        return com.alipay.sdk.tid.TidHelper.resetTID(context);
    }

    public static synchronized String getTIDValue(Context context) {
        String tIDValue;
        synchronized (TidHelper.class) {
            tIDValue = com.alipay.sdk.tid.TidHelper.getTIDValue(context);
        }
        return tIDValue;
    }

    public static Tid loadLocalTid(Context context) {
        return Tid.fromRealTidModel(com.alipay.sdk.tid.TidHelper.loadLocalTid(context));
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        Tid fromRealTidModel;
        synchronized (TidHelper.class) {
            fromRealTidModel = Tid.fromRealTidModel(com.alipay.sdk.tid.TidHelper.loadOrCreateTID(context));
        }
        return fromRealTidModel;
    }

    public static Tid loadTID(Context context) {
        return Tid.fromRealTidModel(com.alipay.sdk.tid.TidHelper.loadTID(context));
    }
}
