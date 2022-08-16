package com.alipay.tscenter.biz.rpc.vkeydfp.request;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class DeviceDataReportRequest implements Serializable {
    public String apdid;
    public Map<String, String> dataMap;
    public String lastTime;

    /* renamed from: os */
    public String f22520os;
    public String priApdid;
    public String pubApdid;
    public String token;
    public String umidToken;
    public String version;

    static {
        Covode.recordClassIndex(4959);
    }
}
