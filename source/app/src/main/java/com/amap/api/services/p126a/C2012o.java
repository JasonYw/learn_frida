package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.o */
/* loaded from: classes19.dex */
public class C2012o extends AbstractC1843b<GeocodeQuery, ArrayList<GeocodeAddress>> {
    static {
        Covode.recordClassIndex(5623);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/geocode/geo?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json&address=");
        stringBuffer.append(m16997c(((GeocodeQuery) this.f24221a).getLocationName()));
        String city = ((GeocodeQuery) this.f24221a).getCity();
        if (!C2014q.m16314i(city)) {
            String m16997c = m16997c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(m16997c);
        }
        stringBuffer.append(C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public ArrayList<GeocodeAddress> mo16254a(String str) {
        JSONObject jSONObject;
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            C2007j.m16371a(e, "GeocodingHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            C2007j.m16371a(e2, "GeocodingHandler", "paseJSONException");
            return arrayList;
        }
        if (!jSONObject.has("count")) {
            return arrayList;
        }
        if (jSONObject.getInt("count") > 0) {
            arrayList = C2014q.m16307l(jSONObject);
            return arrayList;
        }
        return arrayList;
    }

    public C2012o(Context context, GeocodeQuery geocodeQuery) {
        super(context, geocodeQuery);
    }
}
