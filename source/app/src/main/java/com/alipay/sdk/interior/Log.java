package com.alipay.sdk.interior;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class Log {

    /* renamed from: a */
    public static long f22051a;

    /* loaded from: classes2.dex */
    public interface ISdkLogCallback {
        static {
            Covode.recordClassIndex(4713);
        }

        void onLogLine(String str);
    }

    static {
        Covode.recordClassIndex(4712);
    }

    public static void setupLogCallback(ISdkLogCallback iSdkLogCallback) {
        C1385e.m18870a(iSdkLogCallback);
    }

    public static boolean forcedLogReport(Context context) {
        try {
            C1378b.m18915d().m18918a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (elapsedRealtime - f22051a < 600) {
                return false;
            }
            f22051a = elapsedRealtime;
            C1301a.m19219a(context);
            return true;
        } catch (Exception e) {
            C1385e.m18866a(e);
            return false;
        }
    }
}
