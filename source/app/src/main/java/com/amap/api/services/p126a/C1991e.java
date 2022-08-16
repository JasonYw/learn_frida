package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.traffic.AbstractC2114a;
import com.amap.api.services.traffic.CircleTrafficQuery;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.e */
/* loaded from: classes19.dex */
public class C1991e extends AbstractC1843b<CircleTrafficQuery, TrafficStatusResult> {
    static {
        Covode.recordClassIndex(5602);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/traffic/status/circle?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        if (((CircleTrafficQuery) this.f24221a).getCenterPoint() != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(C2007j.m16373a(((CircleTrafficQuery) this.f24221a).getCenterPoint()));
        }
        stringBuffer.append("&radius=");
        stringBuffer.append(((CircleTrafficQuery) this.f24221a).getRadius());
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

    public C1991e(Context context, CircleTrafficQuery circleTrafficQuery) {
        super(context, circleTrafficQuery);
    }
}
