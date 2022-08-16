package com.alipay.sdk.p082m.p090d0;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.d0.b */
/* loaded from: classes2.dex */
public class RunnableC1254b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DataReportRequest f22099a;

    /* renamed from: b */
    public final /* synthetic */ C1255c f22100b;

    static {
        Covode.recordClassIndex(4754);
    }

    public RunnableC1254b(C1255c c1255c, DataReportRequest dataReportRequest) {
        this.f22100b = c1255c;
        this.f22099a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        DataReportResult dataReportResult;
        DataReportResult dataReportResult2;
        DataReportService dataReportService;
        try {
            dataReportService = this.f22100b.f22105c;
            DataReportResult unused = C1255c.f22102e = dataReportService.reportData(this.f22099a);
        } catch (Throwable th) {
            DataReportResult unused2 = C1255c.f22102e = new DataReportResult();
            dataReportResult = C1255c.f22102e;
            dataReportResult.success = false;
            dataReportResult2 = C1255c.f22102e;
            dataReportResult2.resultCode = "static data rpc upload error, " + C1448a.m18663a(th);
            new StringBuilder("rpc failed:").append(C1448a.m18663a(th));
        }
    }
}
