package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.t */
/* loaded from: classes19.dex */
public class C1103t {

    /* renamed from: a */
    public static volatile C1103t f21686a;

    /* renamed from: h */
    public long f21687h;
    public String hostName;

    /* renamed from: k */
    public boolean f21688k = true;

    static {
        Covode.recordClassIndex(4512);
    }

    /* renamed from: a */
    public static C1103t m19825a() {
        if (f21686a == null) {
            synchronized (C1103t.class) {
                if (f21686a == null) {
                    f21686a = new C1103t();
                }
            }
        }
        return f21686a;
    }

    /* renamed from: a */
    private void m19824a(String str, String str2) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19915a(str, C1104u.m19818a(EnumC1102s.SNIFF_HOST), str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private boolean m19822d() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f21687h;
        if (j == 0 || currentTimeMillis - j >= 30000) {
            this.f21687h = currentTimeMillis;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void m19823c(boolean z) {
        this.f21688k = z;
    }

    /* renamed from: g */
    public synchronized void m19821g() {
        this.f21687h = 0L;
    }

    /* renamed from: g */
    public synchronized void m19820g(String str) {
        String str2;
        if (str != null) {
            try {
                this.hostName = str;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!this.f21688k) {
            str2 = "sniffer is turned off";
        } else if (!m19822d()) {
            str2 = "sniff too often";
        } else if (!TextUtils.isEmpty(this.hostName)) {
            C1074i.m19882d("launch a sniff task");
            CallableC1100q callableC1100q = new CallableC1100q(this.hostName, EnumC1102s.SNIFF_HOST);
            callableC1100q.m19828a(0);
            C1041c.m19946a().submit(callableC1100q);
            m19824a(str, C1104u.m19818a(EnumC1102s.SNIFF_HOST));
            this.hostName = null;
            return;
        } else {
            str2 = "hostname is null";
        }
        C1074i.m19882d(C0002O.m25086C("launch sniffer failed due to ", str2));
    }
}
