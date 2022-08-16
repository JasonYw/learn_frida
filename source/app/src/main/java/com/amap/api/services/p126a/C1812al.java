package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkRouteResult;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.al */
/* loaded from: classes19.dex */
public class C1812al extends AbstractC1843b<RouteSearch.WalkRouteQuery, WalkRouteResult> {
    static {
        Covode.recordClassIndex(5423);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/direction/walking?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        stringBuffer.append("&origin=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.WalkRouteQuery) this.f24221a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(C2007j.m16373a(((RouteSearch.WalkRouteQuery) this.f24221a).getFromAndTo().getTo()));
        stringBuffer.append("&multipath=0");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public WalkRouteResult mo16254a(String str) {
        return C2014q.m16330c(str);
    }

    public C1812al(Context context, RouteSearch.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }
}
