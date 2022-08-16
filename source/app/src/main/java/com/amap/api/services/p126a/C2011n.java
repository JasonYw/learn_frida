package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.n */
/* loaded from: classes19.dex */
public class C2011n extends AbstractC1843b<RouteSearch.DriveRouteQuery, DriveRouteResult> {
    static {
        Covode.recordClassIndex(5622);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/direction/driving?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        if (((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getFrom()));
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getTo()));
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getDestinationPoiID());
            }
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getOriginType());
            }
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getDestinationType());
            }
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getPlateProvince());
            }
            if (!C2014q.m16314i(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DriveRouteQuery) this.f24221a).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&ferry=");
        stringBuffer.append(!((RouteSearch.DriveRouteQuery) this.f24221a).isUseFerry());
        stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DriveRouteQuery) this.f24221a).getCarType());
        stringBuffer.append(sb2.toString());
        if (((RouteSearch.DriveRouteQuery) this.f24221a).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getPassedPointStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f24221a).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f24221a).getAvoidpolygonsStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f24221a).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=");
            stringBuffer.append(m16997c(((RouteSearch.DriveRouteQuery) this.f24221a).getAvoidRoad()));
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public DriveRouteResult mo16254a(String str) {
        return C2014q.m16334b(str);
    }

    public C2011n(Context context, RouteSearch.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }
}
