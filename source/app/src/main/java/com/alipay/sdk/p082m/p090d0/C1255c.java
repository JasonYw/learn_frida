package com.alipay.sdk.p082m.p090d0;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.AbstractC1176w;
import com.alipay.android.phone.mrpc.core.C1148aa;
import com.alipay.android.phone.mrpc.core.C1160h;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.d0.c */
/* loaded from: classes2.dex */
public class C1255c implements AbstractC1253a {

    /* renamed from: d */
    public static C1255c f22101d;

    /* renamed from: e */
    public static DataReportResult f22102e;

    /* renamed from: a */
    public AbstractC1176w f22103a;

    /* renamed from: b */
    public BugTrackMessageService f22104b;

    /* renamed from: c */
    public DataReportService f22105c;

    static {
        Covode.recordClassIndex(4755);
    }

    public C1255c(Context context, String str) {
        this.f22103a = null;
        this.f22104b = null;
        this.f22105c = null;
        C1148aa c1148aa = new C1148aa();
        c1148aa.m19664a(str);
        C1160h c1160h = new C1160h(context);
        this.f22103a = c1160h;
        this.f22104b = (BugTrackMessageService) c1160h.mo19593a(BugTrackMessageService.class, c1148aa);
        this.f22105c = (DataReportService) this.f22103a.mo19593a(DataReportService.class, c1148aa);
    }

    /* renamed from: a */
    public static synchronized C1255c m19321a(Context context, String str) {
        C1255c c1255c;
        synchronized (C1255c.class) {
            if (f22101d == null) {
                f22101d = new C1255c(context, str);
            }
            c1255c = f22101d;
        }
        return c1255c;
    }

    @Override // com.alipay.sdk.p082m.p090d0.AbstractC1253a
    /* renamed from: a */
    public DataReportResult mo19319a(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f22105c != null) {
            f22102e = null;
            new Thread(new RunnableC1254b(this, dataReportRequest)).start();
            for (int i = 300000; f22102e == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return f22102e;
    }

    @Override // com.alipay.sdk.p082m.p090d0.AbstractC1253a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        if (!C1448a.m18665a(str) && (bugTrackMessageService = this.f22104b) != null) {
            String str2 = null;
            try {
                str2 = bugTrackMessageService.logCollect(C1448a.m18656f(str));
            } catch (Throwable unused) {
            }
            if (C1448a.m18665a(str2)) {
                return false;
            }
            return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
        }
        return false;
    }
}
