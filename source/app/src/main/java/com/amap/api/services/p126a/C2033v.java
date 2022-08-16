package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.NearbyInfo;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.v */
/* loaded from: classes19.dex */
public class C2033v extends AbstractC1843b<NearbySearch.NearbyQuery, NearbySearchResult> {

    /* renamed from: i */
    public Context f24865i;

    /* renamed from: j */
    public NearbySearch.NearbyQuery f24866j;

    static {
        Covode.recordClassIndex(5644);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16377c(), "/nearby/around");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24865i));
        LatLonPoint centerPoint = this.f24866j.getCenterPoint();
        if (centerPoint != null) {
            stringBuffer.append("&center=");
            stringBuffer.append(centerPoint.getLongitude());
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuffer.append(centerPoint.getLatitude());
        }
        stringBuffer.append("&radius=");
        stringBuffer.append(this.f24866j.getRadius());
        stringBuffer.append("&limit=30");
        stringBuffer.append("&searchtype=");
        stringBuffer.append(this.f24866j.getType());
        stringBuffer.append("&timerange=");
        stringBuffer.append(this.f24866j.getTimeRange());
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public NearbySearchResult mo16254a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = true;
            if (this.f24866j.getType() != 1) {
                z = false;
            }
            ArrayList<NearbyInfo> m16337a = C2014q.m16337a(jSONObject, z);
            NearbySearchResult nearbySearchResult = new NearbySearchResult();
            nearbySearchResult.setNearbyInfoList(m16337a);
            return nearbySearchResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "NearbySearchHandler", "paseJSON");
            return null;
        }
    }

    public C2033v(Context context, NearbySearch.NearbyQuery nearbyQuery) {
        super(context, nearbyQuery);
        this.f24865i = context;
        this.f24866j = nearbyQuery;
    }
}
