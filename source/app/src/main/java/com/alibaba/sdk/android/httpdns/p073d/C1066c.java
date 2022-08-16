package com.alibaba.sdk.android.httpdns.p073d;

import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.C1073h;
import com.bytedance.covode.number.Covode;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.d.c */
/* loaded from: classes19.dex */
public class C1066c {
    static {
        Covode.recordClassIndex(4472);
    }

    /* renamed from: a */
    public static int m19901a() {
        return 0;
    }

    /* renamed from: a */
    public static int m19900a(Throwable th) {
        return th instanceof C1073h ? ((C1073h) th).getErrorCode() : th instanceof SocketTimeoutException ? 10001 : 10000;
    }

    /* renamed from: a */
    public static String m19899a(Throwable th) {
        return (th == null || TextUtils.isEmpty(th.getMessage())) ? th instanceof SocketTimeoutException ? "time out exception" : "default error" : th.getMessage();
    }
}
