package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.c */
/* loaded from: classes19.dex */
public class C1904c extends AbstractC1843b<RouteSearch.BusRouteQuery, BusRouteResult> {
    static {
        Covode.recordClassIndex(5515);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/direction/transit/integrated?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        stringBuffer.append("&origin=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.BusRouteQuery) this.f24221a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.BusRouteQuery) this.f24221a).getFromAndTo().getTo()));
        String city = ((RouteSearch.BusRouteQuery) this.f24221a).getCity();
        if (!C2014q.m16314i(city)) {
            city = m16997c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(city);
        }
        if (!C2014q.m16314i(((RouteSearch.BusRouteQuery) this.f24221a).getCity())) {
            String m16997c = m16997c(city);
            stringBuffer.append("&cityd=");
            stringBuffer.append(m16997c);
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.BusRouteQuery) this.f24221a).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&nightflag=");
        stringBuffer.append(((RouteSearch.BusRouteQuery) this.f24221a).getNightFlag());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public BusRouteResult mo16254a(String str) {
        return C2014q.m16344a(str);
    }

    public C1904c(Context context, RouteSearch.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }
}
