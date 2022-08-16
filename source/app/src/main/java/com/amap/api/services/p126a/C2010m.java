package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.m */
/* loaded from: classes19.dex */
public class C2010m extends AbstractC1843b<RouteSearch.DrivePlanQuery, DriveRoutePlanResult> {
    static {
        Covode.recordClassIndex(5621);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16378b(), "/etd/driving?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        if (((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getFrom()));
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(C2007j.m16373a(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getTo()));
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getDestinationPoiID());
            }
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getOriginType());
            }
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getDestinationType());
            }
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getPlateProvince());
            }
            if (!C2014q.m16314i(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFromAndTo().getPlateNumber());
            }
        }
        if (((RouteSearch.DrivePlanQuery) this.f24221a).getDestParentPoiID() != null) {
            stringBuffer.append("&parentid=");
            stringBuffer.append(((RouteSearch.DrivePlanQuery) this.f24221a).getDestParentPoiID());
        }
        stringBuffer.append("&strategy=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RouteSearch.DrivePlanQuery) this.f24221a).getMode());
        stringBuffer.append(sb.toString());
        stringBuffer.append("&cartype=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((RouteSearch.DrivePlanQuery) this.f24221a).getCarType());
        stringBuffer.append(sb2.toString());
        stringBuffer.append("&firsttime=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((RouteSearch.DrivePlanQuery) this.f24221a).getFirstTime());
        stringBuffer.append(sb3.toString());
        stringBuffer.append("&interval=");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(((RouteSearch.DrivePlanQuery) this.f24221a).getInterval());
        stringBuffer.append(sb4.toString());
        stringBuffer.append("&count=");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(((RouteSearch.DrivePlanQuery) this.f24221a).getCount());
        stringBuffer.append(sb5.toString());
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public DriveRoutePlanResult mo16254a(String str) {
        return C2014q.m16294s(str);
    }

    public C2010m(Context context, RouteSearch.DrivePlanQuery drivePlanQuery) {
        super(context, drivePlanQuery);
    }
}
