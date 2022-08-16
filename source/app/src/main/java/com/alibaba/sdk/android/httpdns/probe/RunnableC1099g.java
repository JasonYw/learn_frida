package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C1074i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.g */
/* loaded from: classes2.dex */
public class RunnableC1099g implements Runnable {

    /* renamed from: a */
    public CountDownLatch f21668a;

    /* renamed from: b */
    public ConcurrentHashMap<String, Long> f21669b;

    /* renamed from: o */
    public String f21670o;
    public int port;

    static {
        Covode.recordClassIndex(4508);
    }

    public RunnableC1099g(String str, int i, CountDownLatch countDownLatch, ConcurrentHashMap<String, Long> concurrentHashMap) {
        this.f21670o = str;
        this.port = i;
        this.f21668a = countDownLatch;
        this.f21669b = concurrentHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005b, code lost:
        if (r2 == null) goto L38;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long m19830a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.String r3 = "socket close failed:"
            long r7 = java.lang.System.currentTimeMillis()
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2 = 0
            java.net.Socket r4 = new java.net.Socket     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L5a
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r1.<init>(r10, r11)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r0 = 5000(0x1388, float:7.006E-42)
            r4.connect(r1, r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r4.close()     // Catch: java.io.IOException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = p002O.C0002O.m25086C(r3, r0)
            com.alibaba.sdk.android.httpdns.C1074i.m19880f(r0)
        L2d:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L59
            long r1 = r1 - r7
            return r1
        L33:
            r1 = move-exception
            r2 = r4
            goto L5d
        L36:
            r0 = move-exception
            r2 = r4
            goto L3a
        L39:
            r0 = move-exception
        L3a:
            java.lang.String r1 = "connect failed:"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = p002O.C0002O.m25086C(r1, r0)     // Catch: java.lang.Throwable -> L5a
            com.alibaba.sdk.android.httpdns.C1074i.m19880f(r0)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.io.IOException -> L4d
            return r5
        L4d:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = p002O.C0002O.m25086C(r3, r0)
            com.alibaba.sdk.android.httpdns.C1074i.m19880f(r0)
        L59:
            return r5
        L5a:
            r1 = move-exception
            if (r2 == 0) goto L6d
        L5d:
            r2.close()     // Catch: java.io.IOException -> L61
            throw r1
        L61:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = p002O.C0002O.m25086C(r3, r0)
            com.alibaba.sdk.android.httpdns.C1074i.m19880f(r0)
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.probe.RunnableC1099g.m19830a(java.lang.String, int):long");
    }

    /* renamed from: a */
    private boolean m19831a(int i) {
        return i > 0 && i <= 65535;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f21670o == null || !m19831a(this.port)) {
                C1074i.m19880f("invalid params, give up");
            } else {
                long m19830a = m19830a(this.f21670o, this.port);
                C1074i.m19882d("connect cost for ip:" + this.f21670o + " is " + m19830a);
                if (this.f21669b != null) {
                    this.f21669b.put(this.f21670o, Long.valueOf(m19830a));
                }
            }
            if (this.f21668a == null) {
                return;
            }
            this.f21668a.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
