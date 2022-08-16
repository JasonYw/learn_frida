package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class HTTPDNSResult {
    public Map<String, String> extra;
    public String host;
    public String[] ips;

    static {
        Covode.recordClassIndex(4428);
    }

    public HTTPDNSResult(String str, String[] strArr, Map<String, String> map) {
        this.host = str;
        this.ips = strArr;
        this.extra = map;
    }

    public Map<String, String> getExtras() {
        return this.extra;
    }

    public String getHost() {
        return this.host;
    }

    public String[] getIps() {
        return this.ips;
    }

    public String toString() {
        return "host:" + this.host + ", ips:" + Arrays.toString(this.ips) + ", extras:" + this.extra;
    }
}
