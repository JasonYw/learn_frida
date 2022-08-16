package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.k */
/* loaded from: classes19.dex */
public class C2008k extends AbstractC1843b<DistanceSearch.DistanceQuery, DistanceResult> {

    /* renamed from: i */
    public final String f24824i = "/distance?";

    /* renamed from: j */
    public final String f24825j = "|";

    /* renamed from: k */
    public final String f24826k = Constants.ACCEPT_TIME_SEPARATOR_SP;

    static {
        Covode.recordClassIndex(5619);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/distance?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        List<LatLonPoint> origins = ((DistanceSearch.DistanceQuery) this.f24221a).getOrigins();
        if (origins != null && origins.size() > 0) {
            stringBuffer.append("&origins=");
            int size = origins.size();
            for (int i = 0; i < size; i++) {
                LatLonPoint latLonPoint = origins.get(i);
                if (latLonPoint != null) {
                    double m16375a = C2007j.m16375a(latLonPoint.getLatitude());
                    stringBuffer.append(C2007j.m16375a(latLonPoint.getLongitude()));
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    stringBuffer.append(m16375a);
                    if (i < size) {
                        stringBuffer.append("|");
                    }
                }
            }
        }
        LatLonPoint destination = ((DistanceSearch.DistanceQuery) this.f24221a).getDestination();
        if (destination != null) {
            double m16375a2 = C2007j.m16375a(destination.getLatitude());
            double m16375a3 = C2007j.m16375a(destination.getLongitude());
            stringBuffer.append("&destination=");
            stringBuffer.append(m16375a3);
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuffer.append(m16375a2);
        }
        stringBuffer.append("&type=");
        stringBuffer.append(((DistanceSearch.DistanceQuery) this.f24221a).getType());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public DistanceResult mo16254a(String str) {
        return C2014q.m16298q(str);
    }

    public C2008k(Context context, DistanceSearch.DistanceQuery distanceQuery) {
        super(context, distanceQuery);
    }
}
