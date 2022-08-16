package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ad */
/* loaded from: classes19.dex */
public class C1803ad extends AbstractC1843b<RegeocodeQuery, RegeocodeAddress> {
    static {
        Covode.recordClassIndex(5414);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/geocode/regeo?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json&extensions=all");
        stringBuffer.append("&location=");
        stringBuffer.append(((RegeocodeQuery) this.f24221a).getPoint().getLongitude());
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        stringBuffer.append(((RegeocodeQuery) this.f24221a).getPoint().getLatitude());
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.f24221a).getPoiType())) {
            stringBuffer.append("&poitype=");
            stringBuffer.append(((RegeocodeQuery) this.f24221a).getPoiType());
        }
        stringBuffer.append("&radius=");
        stringBuffer.append((int) ((RegeocodeQuery) this.f24221a).getRadius());
        stringBuffer.append("&coordsys=");
        stringBuffer.append(((RegeocodeQuery) this.f24221a).getLatLonType());
        stringBuffer.append(C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public RegeocodeAddress mo16254a(String str) {
        JSONObject optJSONObject;
        RegeocodeAddress regeocodeAddress = new RegeocodeAddress();
        try {
            optJSONObject = new JSONObject(str).optJSONObject("regeocode");
        } catch (JSONException e) {
            C2007j.m16371a(e, "ReverseGeocodingHandler", "paseJSON");
        }
        if (optJSONObject == null) {
            return regeocodeAddress;
        }
        regeocodeAddress.setFormatAddress(C2014q.m16338a(optJSONObject, "formatted_address"));
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("addressComponent");
        if (optJSONObject2 != null) {
            C2014q.m16339a(optJSONObject2, regeocodeAddress);
        }
        regeocodeAddress.setPois(C2014q.m16328c(optJSONObject));
        JSONArray optJSONArray = optJSONObject.optJSONArray("roads");
        if (optJSONArray != null) {
            C2014q.m16333b(optJSONArray, regeocodeAddress);
        }
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("roadinters");
        if (optJSONArray2 != null) {
            C2014q.m16342a(optJSONArray2, regeocodeAddress);
        }
        JSONArray optJSONArray3 = optJSONObject.optJSONArray("aois");
        if (optJSONArray3 != null) {
            C2014q.m16329c(optJSONArray3, regeocodeAddress);
            return regeocodeAddress;
        }
        return regeocodeAddress;
    }

    public C1803ad(Context context, RegeocodeQuery regeocodeQuery) {
        super(context, regeocodeQuery);
    }
}
