package com.alibaba.sdk.android.httpdns.probe;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class IPProbeItem {
    public String hostName;
    public int port;

    static {
        Covode.recordClassIndex(4498);
    }

    public IPProbeItem(String str, int i) {
        this.hostName = str;
        this.port = i;
    }

    public String getHostName() {
        return this.hostName;
    }

    public int getPort() {
        return this.port;
    }
}
