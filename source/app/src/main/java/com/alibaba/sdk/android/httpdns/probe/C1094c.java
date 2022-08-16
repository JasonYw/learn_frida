package com.alibaba.sdk.android.httpdns.probe;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.c */
/* loaded from: classes19.dex */
public class C1094c {
    public String hostName;
    public String[] ips;

    /* renamed from: k */
    public long f21658k;

    /* renamed from: l */
    public long f21659l;

    /* renamed from: r */
    public String f21660r;

    /* renamed from: s */
    public String f21661s;

    static {
        Covode.recordClassIndex(4503);
    }

    public C1094c(String str, String[] strArr, String str2, String str3, long j, long j2) {
        this.hostName = str;
        this.ips = strArr;
        this.f21660r = str2;
        this.f21661s = str3;
        this.f21658k = j;
        this.f21659l = j2;
    }

    /* renamed from: c */
    public long m19841c() {
        return this.f21658k;
    }

    /* renamed from: d */
    public long m19840d() {
        return this.f21659l;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String[] getIps() {
        return this.ips;
    }

    /* renamed from: j */
    public String m19839j() {
        return this.f21660r;
    }

    /* renamed from: k */
    public String m19838k() {
        return this.f21661s;
    }
}
