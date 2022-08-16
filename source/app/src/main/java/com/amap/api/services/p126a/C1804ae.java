package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ae */
/* loaded from: classes19.dex */
public class C1804ae extends AbstractC1843b<RouteSearch.RideRouteQuery, RideRouteResult> {
    static {
        Covode.recordClassIndex(5415);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16378b(), "/direction/bicycling?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        stringBuffer.append("&origin=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.RideRouteQuery) this.f24221a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.RideRouteQuery) this.f24221a).getFromAndTo().getTo()));
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public RideRouteResult mo16254a(String str) {
        return C2014q.m16302o(str);
    }

    public C1804ae(Context context, RouteSearch.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }
}
