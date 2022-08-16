package com.alibaba.sdk.android.httpdns.probe;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.d */
/* loaded from: classes19.dex */
public final class C1095d {

    /* renamed from: a */
    public static IPProbeService f21662a;

    static {
        Covode.recordClassIndex(4504);
    }

    /* renamed from: a */
    public static synchronized IPProbeService m19837a(AbstractC1093b abstractC1093b) {
        IPProbeService iPProbeService;
        synchronized (C1095d.class) {
            if (f21662a == null) {
                C1096e c1096e = new C1096e();
                f21662a = c1096e;
                c1096e.setIPListUpdateCallback(abstractC1093b);
            }
            iPProbeService = f21662a;
        }
        return iPProbeService;
    }
}
