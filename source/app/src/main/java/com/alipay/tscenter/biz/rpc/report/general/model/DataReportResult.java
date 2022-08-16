package com.alipay.tscenter.biz.rpc.report.general.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class DataReportResult implements Serializable {
    public String resultCode;
    public Map<String, String> resultData;
    public boolean success;

    static {
        Covode.recordClassIndex(4957);
    }
}
