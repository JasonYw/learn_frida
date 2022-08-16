package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C1041c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.a */
/* loaded from: classes2.dex */
public class RunnableC1092a implements Runnable {

    /* renamed from: a */
    public AbstractC1098f f21655a;

    /* renamed from: b */
    public ConcurrentHashMap<String, Long> f21656b = new ConcurrentHashMap<>();
    public String host;
    public String[] ips;

    /* renamed from: j */
    public long f21657j;
    public int port;

    static {
        Covode.recordClassIndex(4501);
    }

    public RunnableC1092a(long j, String str, String[] strArr, int i, AbstractC1098f abstractC1098f) {
        this.f21655a = null;
        this.f21657j = j;
        this.host = str;
        this.ips = strArr;
        this.port = i;
        this.f21655a = abstractC1098f;
    }

    /* renamed from: a */
    private C1094c m19843a(String[] strArr) {
        String[] strArr2 = this.ips;
        if (strArr2 == null || strArr2.length == 0 || strArr == null || strArr.length == 0) {
            return null;
        }
        String str = strArr2[0];
        String str2 = strArr[0];
        return new C1094c(this.host, strArr, str, str2, this.f21656b.containsKey(str) ? this.f21656b.get(str).longValue() : 2147483647L, this.f21656b.containsKey(str2) ? this.f21656b.get(str2).longValue() : 2147483647L);
    }

    /* renamed from: a */
    private String[] m19844a(ConcurrentHashMap<String, Long> concurrentHashMap) {
        if (concurrentHashMap == null) {
            return null;
        }
        String[] strArr = new String[concurrentHashMap.size()];
        int i = 0;
        for (String str : concurrentHashMap.keySet()) {
            strArr[i] = new String(str);
            i++;
        }
        for (int i2 = 0; i2 < strArr.length - 1; i2++) {
            int i3 = 0;
            while (i3 < (strArr.length - i2) - 1) {
                int i4 = i3 + 1;
                if (concurrentHashMap.get(strArr[i3]).longValue() > concurrentHashMap.get(strArr[i4]).longValue()) {
                    String str2 = strArr[i3];
                    strArr[i3] = strArr[i4];
                    strArr[i4] = str2;
                }
                i3 = i4;
            }
        }
        return strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] m19844a;
        String[] strArr = this.ips;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(strArr.length);
        for (int i = 0; i < this.ips.length; i++) {
            C1041c.m19946a().execute(new RunnableC1099g(this.ips[i], this.port, countDownLatch, this.f21656b));
        }
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            if (this.f21655a == null || (m19844a = m19844a(this.f21656b)) == null || m19844a.length == 0) {
                return;
            }
            this.f21655a.mo19832a(this.f21657j, m19843a(m19844a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
