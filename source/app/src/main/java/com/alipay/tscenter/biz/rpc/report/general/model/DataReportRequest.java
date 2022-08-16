package com.alipay.tscenter.biz.rpc.report.general.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class DataReportRequest implements Serializable {
    public Map<String, String> bizData;
    public String bizType;
    public Map<String, String> deviceData;

    /* renamed from: os */
    public String f22518os;
    public String rpcVersion;

    static {
        Covode.recordClassIndex(4956);
    }
}
