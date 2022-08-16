package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ak */
/* loaded from: classes19.dex */
public class C1811ak extends AbstractC1843b<RouteSearch.TruckRouteQuery, TruckRouteRestult> {

    /* renamed from: i */
    public final String f24240i = "/direction/truck?";

    /* renamed from: j */
    public final String f24241j = "|";

    /* renamed from: k */
    public final String f24242k = Constants.ACCEPT_TIME_SEPARATOR_SP;

    static {
        Covode.recordClassIndex(5422);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16378b(), "/direction/truck?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        if (((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getFrom()));
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getTo()));
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getDestinationPoiID());
            }
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getOriginType());
            }
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getDestinationType());
            }
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getPlateProvince());
            }
            if (!C2014q.m16314i(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getMode());
        if (((RouteSearch.TruckRouteQuery) this.f24221a).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getPassedPointStr());
        }
        stringBuffer.append("&size=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckSize());
        stringBuffer.append("&height=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckHeight());
        stringBuffer.append("&width=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckWidth());
        stringBuffer.append("&load=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckLoad());
        stringBuffer.append("&weight=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckWeight());
        stringBuffer.append("&axis=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f24221a).getTruckAxis());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public TruckRouteRestult mo16254a(String str) {
        return C2014q.m16296r(str);
    }

    public C1811ak(Context context, RouteSearch.TruckRouteQuery truckRouteQuery) {
        super(context, truckRouteQuery);
    }
}
