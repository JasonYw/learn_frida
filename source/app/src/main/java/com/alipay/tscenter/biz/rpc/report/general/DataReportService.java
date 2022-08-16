package com.alipay.tscenter.biz.rpc.report.general;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface DataReportService {
    static {
        Covode.recordClassIndex(4955);
    }

    @OperationType("alipay.security.device.data.report")
    DataReportResult reportData(DataReportRequest dataReportRequest);
}
