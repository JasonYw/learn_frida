package com.alipay.sdk.p082m.p121u;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;

/* renamed from: com.alipay.sdk.m.u.b */
/* loaded from: classes2.dex */
public class C1382b {

    /* renamed from: b */
    public static long f22387b = -1;

    static {
        Covode.recordClassIndex(4882);
    }

    /* renamed from: a */
    public static synchronized boolean m18880a() {
        boolean z;
        synchronized (C1382b.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f22387b >= JsBridgeDelegate.GET_URL_OUT_TIME) {
                f22387b = elapsedRealtime;
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }
}
