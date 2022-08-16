package com.alibaba.sdk.android.httpdns.p071b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.alibaba.sdk.android.httpdns.b.e */
/* loaded from: classes19.dex */
public class C1038e {

    /* renamed from: a */
    public String f21539a;

    /* renamed from: a */
    public ArrayList<C1040g> f21540a;

    /* renamed from: b */
    public String f21541b;

    /* renamed from: b */
    public ArrayList<C1040g> f21542b;
    public String host;

    /* renamed from: id */
    public long f21543id;

    /* renamed from: m */
    public String f21544m;

    /* renamed from: n */
    public String f21545n;

    static {
        Covode.recordClassIndex(4444);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("[HostRecord] ");
        sb.append("id:");
        sb.append(this.f21543id);
        sb.append("|");
        sb.append("host:");
        sb.append(this.host);
        sb.append("|");
        sb.append("sp:");
        sb.append(this.f21544m);
        sb.append("|");
        sb.append("time:");
        sb.append(this.f21545n);
        sb.append("|");
        sb.append("ips:");
        ArrayList<C1040g> arrayList = this.f21540a;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<C1040g> it = this.f21540a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
        }
        sb.append("|");
        sb.append("ipsv6:");
        ArrayList<C1040g> arrayList2 = this.f21542b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<C1040g> it2 = this.f21542b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
            }
        }
        sb.append("|");
        sb.append("extra:");
        sb.append(this.f21539a);
        sb.append("|");
        sb.append("cacheKey:");
        sb.append(this.f21541b);
        sb.append("|");
        return sb.toString();
    }
}
