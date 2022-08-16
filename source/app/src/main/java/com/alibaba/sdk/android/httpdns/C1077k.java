package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.bytedance.covode.number.Covode;
import java.lang.Thread;

/* renamed from: com.alibaba.sdk.android.httpdns.k */
/* loaded from: classes19.dex */
public class C1077k implements Thread.UncaughtExceptionHandler {
    static {
        Covode.recordClassIndex(4483);
    }

    /* renamed from: b */
    private void m19878b(Throwable th) {
        C1051b m19921a = C1051b.m19921a();
        if (m19921a != null) {
            m19921a.m19903k(th.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            m19878b(th);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
