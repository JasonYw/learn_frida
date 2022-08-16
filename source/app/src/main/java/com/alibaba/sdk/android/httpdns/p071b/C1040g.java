package com.alibaba.sdk.android.httpdns.p071b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.sdk.android.httpdns.b.g */
/* loaded from: classes19.dex */
public class C1040g {

    /* renamed from: i */
    public long f21546i;

    /* renamed from: id */
    public long f21547id;

    /* renamed from: o */
    public String f21548o;

    /* renamed from: p */
    public String f21549p;

    static {
        Covode.recordClassIndex(4446);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("[IpRecord] ");
        sb.append("id:");
        sb.append(this.f21547id);
        sb.append("|");
        sb.append("host_id:");
        sb.append(this.f21546i);
        sb.append("|");
        sb.append("ip:");
        sb.append(this.f21548o);
        sb.append("|");
        sb.append("ttl:");
        sb.append(this.f21549p);
        sb.append("|");
        return sb.toString();
    }
}
