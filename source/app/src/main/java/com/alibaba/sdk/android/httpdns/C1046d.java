package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p071b.C1035b;
import com.alibaba.sdk.android.httpdns.p071b.C1036c;
import com.alibaba.sdk.android.httpdns.p071b.C1038e;
import com.alibaba.sdk.android.httpdns.probe.AbstractC1093b;
import com.alibaba.sdk.android.httpdns.probe.C1095d;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.alibaba.sdk.android.httpdns.d */
/* loaded from: classes19.dex */
public class C1046d {

    /* renamed from: a */
    public static C1046d f21556a = new C1046d();

    /* renamed from: a */
    public static IPProbeService f21557a = C1095d.m19837a(new AbstractC1093b() { // from class: com.alibaba.sdk.android.httpdns.d.1
        static {
            Covode.recordClassIndex(4453);
        }

        @Override // com.alibaba.sdk.android.httpdns.probe.AbstractC1093b
        /* renamed from: a */
        public final void mo19842a(String str, String[] strArr) {
            C1067e c1067e;
            if (str == null || strArr == null || strArr.length == 0 || (c1067e = (C1067e) C1046d.f21558a.get(str)) == null) {
                return;
            }
            C1067e c1067e2 = new C1067e(str, strArr, c1067e.m19898a(), c1067e.m19894b(), c1067e.m19896a(), c1067e.getCacheKey());
            C1046d.f21558a.put(str, c1067e2);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c1067e2.getIps().length; i++) {
                sb.append(c1067e2.getIps()[i] + Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            C1074i.m19880f("optimized host:" + str + ", ip:" + sb.toString());
        }
    });

    /* renamed from: a */
    public static ConcurrentMap<String, C1067e> f21558a;

    /* renamed from: a */
    public static ConcurrentSkipListSet<String> f21559a;

    static {
        Covode.recordClassIndex(4452);
    }

    public C1046d() {
        f21558a = new ConcurrentHashMap();
        f21559a = new ConcurrentSkipListSet<>();
    }

    /* renamed from: a */
    public static C1046d m19936a() {
        return f21556a;
    }

    /* renamed from: a */
    private IPProbeItem m19929a(String str) {
        List<IPProbeItem> list = C1071f.f21604a;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).getHostName())) {
                    return list.get(i);
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m19932a(C1038e c1038e) {
        return (System.currentTimeMillis() / 1000) - C1036c.m19968a(c1038e.f21545n) > 604800;
    }

    /* renamed from: a */
    private boolean m19925a(String str, C1067e c1067e) {
        IPProbeItem m19929a;
        if (c1067e == null || c1067e.getIps() == null || c1067e.getIps().length <= 1 || f21557a == null || (m19929a = m19929a(str)) == null) {
            return false;
        }
        if (f21557a.getProbeStatus(str) == IPProbeService.EnumC1091a.PROBING) {
            f21557a.stopIPProbeTask(str);
        }
        C1074i.m19880f("START PROBE");
        f21557a.launchIPProbeTask(str, m19929a.getPort(), c1067e.getIps());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m19924b() {
        List<C1038e> m19978a = C1035b.m19978a();
        String m19969i = C1035b.m19969i();
        for (C1038e c1038e : m19978a) {
            if (m19932a(c1038e)) {
                C1035b.m19971b(c1038e);
            } else if (m19969i.equals(c1038e.f21544m)) {
                c1038e.f21545n = String.valueOf(System.currentTimeMillis() / 1000);
                C1067e c1067e = new C1067e(c1038e);
                f21558a.put(c1038e.host, c1067e);
                if (C1035b.m19970g()) {
                    C1035b.m19971b(c1038e);
                }
                m19925a(c1038e.host, c1067e);
            }
        }
    }

    /* renamed from: a */
    public C1067e m19930a(String str) {
        return f21558a.get(str);
    }

    /* renamed from: a */
    public ArrayList<String> m19935a() {
        return new ArrayList<>(f21558a.keySet());
    }

    /* renamed from: a */
    public void m19933a() {
        if (!C1035b.m19977a()) {
            return;
        }
        C1041c.m19946a().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.2
            static {
                Covode.recordClassIndex(4454);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1046d.this.m19924b();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public void m19928a(String str) {
        f21559a.add(str);
    }

    /* renamed from: a */
    public void m19926a(String str, C1067e c1067e) {
        f21558a.put(str, c1067e);
        if (C1035b.m19977a()) {
            C1038e m19897a = c1067e.m19897a();
            if ((m19897a.f21540a == null || m19897a.f21540a.size() <= 0) && (m19897a.f21542b == null || m19897a.f21542b.size() <= 0)) {
                C1035b.m19971b(m19897a);
            } else {
                C1035b.m19974a(m19897a);
            }
        }
        m19925a(str, c1067e);
    }

    /* renamed from: a */
    public boolean m19927a(String str) {
        return f21559a.contains(str);
    }

    /* renamed from: b */
    public void m19923b(String str) {
        f21559a.remove(str);
    }

    public void clear() {
        f21558a.clear();
        f21559a.clear();
    }

    public int count() {
        return f21558a.size();
    }
}
