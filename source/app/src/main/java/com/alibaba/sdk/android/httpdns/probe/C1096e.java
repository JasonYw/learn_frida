package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C1041c;
import com.alibaba.sdk.android.httpdns.C1074i;
import com.alibaba.sdk.android.httpdns.p070a.C1030a;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.e */
/* loaded from: classes19.dex */
public class C1096e implements IPProbeService {

    /* renamed from: a */
    public AtomicLong f21664a = new AtomicLong(0);

    /* renamed from: c */
    public ConcurrentHashMap<String, Long> f21666c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public AbstractC1093b f21663a = null;

    /* renamed from: b */
    public AbstractC1098f f21665b = new AbstractC1098f() { // from class: com.alibaba.sdk.android.httpdns.probe.e.1
        static {
            Covode.recordClassIndex(4506);
        }

        @Override // com.alibaba.sdk.android.httpdns.probe.AbstractC1098f
        /* renamed from: a */
        public void mo19832a(long j, C1094c c1094c) {
            if (c1094c != null) {
                try {
                    if (!C1096e.this.f21666c.containsKey(c1094c.getHostName()) || ((Long) C1096e.this.f21666c.get(c1094c.getHostName())).longValue() != j) {
                        C1074i.m19882d("corresponding tasknumber not exists, drop the result");
                    } else if (c1094c.getIps() == null || c1094c.m19839j() == null || c1094c.m19838k() == null || c1094c.getHostName() == null) {
                    } else {
                        C1074i.m19881e(C0002O.m25082C("defultId:", c1094c.m19839j(), ", selectedIp:", c1094c.m19838k(), ", promote:", Long.valueOf(c1094c.m19841c() - c1094c.m19840d())));
                        C1096e.this.m19833a(c1094c.getHostName(), c1094c.m19839j(), c1094c.m19838k(), c1094c.m19841c(), c1094c.m19840d(), c1094c.getIps().length);
                        C1096e.this.f21663a.mo19842a(c1094c.getHostName(), c1094c.getIps());
                        C1096e.this.f21666c.remove(c1094c.getHostName());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(4505);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19833a(String str, String str2, String str3, long j, long j2, int i) {
        C1051b m19921a = C1051b.m19921a();
        if (m19921a != null) {
            m19921a.m19912a(str, str2, str3, j, j2, i);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public IPProbeService.EnumC1091a getProbeStatus(String str) {
        return this.f21666c.containsKey(str) ? IPProbeService.EnumC1091a.PROBING : IPProbeService.EnumC1091a.NO_PROBING;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void launchIPProbeTask(String str, int i, String[] strArr) {
        if (!C1030a.m19992a().m19986f()) {
            C1074i.m19880f("ip probe is forbidden");
        } else if (getProbeStatus(str) != IPProbeService.EnumC1091a.NO_PROBING) {
            C1074i.m19880f("already launch the same task, drop the task");
        } else {
            long addAndGet = this.f21664a.addAndGet(1L);
            this.f21666c.put(str, Long.valueOf(addAndGet));
            C1041c.m19946a().execute(new RunnableC1092a(addAndGet, str, strArr, i, this.f21665b));
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void setIPListUpdateCallback(AbstractC1093b abstractC1093b) {
        this.f21663a = abstractC1093b;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public boolean stopIPProbeTask(String str) {
        if (this.f21666c.containsKey(str)) {
            C1074i.m19882d(C0002O.m25086C("stop ip probe task for host:", str));
            this.f21666c.remove(str);
            return true;
        }
        return false;
    }
}
