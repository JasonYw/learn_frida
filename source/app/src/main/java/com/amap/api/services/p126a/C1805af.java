package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.traffic.AbstractC2114a;
import com.amap.api.services.traffic.RoadTrafficQuery;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.af */
/* loaded from: classes19.dex */
public class C1805af extends AbstractC1843b<RoadTrafficQuery, TrafficStatusResult> {
    static {
        Covode.recordClassIndex(5416);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/traffic/status/road?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        if (!TextUtils.isEmpty(((RoadTrafficQuery) this.f24221a).getName())) {
            stringBuffer.append("&name=");
            stringBuffer.append(((RoadTrafficQuery) this.f24221a).getName());
        }
        if (!TextUtils.isEmpty(((RoadTrafficQuery) this.f24221a).getAdCode())) {
            stringBuffer.append("&adcode=");
            stringBuffer.append(((RoadTrafficQuery) this.f24221a).getAdCode());
        }
        stringBuffer.append("&level=");
        stringBuffer.append(((AbstractC2114a) this.f24221a).getLevel());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public TrafficStatusResult mo16254a(String str) {
        return C2014q.m16300p(str);
    }

    public C1805af(Context context, RoadTrafficQuery roadTrafficQuery) {
        super(context, roadTrafficQuery);
    }
}
