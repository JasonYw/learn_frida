package com.alipay.tscenter.biz.rpc.vkeydfp.result;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes20.dex */
public class DeviceDataReportResult extends BaseResult implements Serializable {
    public String apdid;
    public String appListVer;
    public String bugTrackSwitch;
    public String currentTime;
    public String token;
    public String version;
    public String vkeySwitch;

    static {
        Covode.recordClassIndex(4963);
    }
}
