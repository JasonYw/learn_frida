package com.alipay.sdk.p082m.p094f0;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.sdk.m.f0.b */
/* loaded from: classes2.dex */
public class C1272b {
    static {
        Covode.recordClassIndex(4772);
    }

    /* renamed from: a */
    public static C1273c m19302a(DataReportResult dataReportResult) {
        C1273c c1273c = new C1273c();
        if (dataReportResult == null) {
            return null;
        }
        c1273c.f22108a = dataReportResult.success;
        c1273c.f22109b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            c1273c.f22110c = map.get("apdid");
            c1273c.f22111d = map.get("apdidToken");
            c1273c.f22114g = map.get("dynamicKey");
            c1273c.f22115h = map.get("timeInterval");
            c1273c.f22116i = map.get("webrtcUrl");
            c1273c.f22117j = "";
            String str = map.get("drmSwitch");
            if (C1448a.m18661b(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    c1273c.f22112e = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    c1273c.f22113f = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                c1273c.f22118k = map.get("apse_degrade");
            }
        }
        return c1273c;
    }

    /* renamed from: a */
    public static DataReportRequest m19303a(C1274d c1274d) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (c1274d == null) {
            return null;
        }
        dataReportRequest.f22518os = c1274d.f22119a;
        dataReportRequest.rpcVersion = c1274d.f22128j;
        dataReportRequest.bizType = "1";
        HashMap hashMap = new HashMap();
        dataReportRequest.bizData = hashMap;
        hashMap.put("apdid", c1274d.f22120b);
        dataReportRequest.bizData.put("apdidToken", c1274d.f22121c);
        dataReportRequest.bizData.put("umidToken", c1274d.f22122d);
        dataReportRequest.bizData.put("dynamicKey", c1274d.f22123e);
        dataReportRequest.deviceData = c1274d.f22124f;
        return dataReportRequest;
    }
}
