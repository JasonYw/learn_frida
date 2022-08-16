package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearchQuery;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.l */
/* loaded from: classes19.dex */
public class C2009l extends AbstractC1843b<DistrictSearchQuery, DistrictResult> {
    static {
        Covode.recordClassIndex(5620);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/config/district?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        stringBuffer.append("&page=");
        stringBuffer.append(((DistrictSearchQuery) this.f24221a).getPageNum());
        stringBuffer.append("&offset=");
        stringBuffer.append(((DistrictSearchQuery) this.f24221a).getPageSize());
        if (((DistrictSearchQuery) this.f24221a).isShowBoundary()) {
            stringBuffer.append("&extensions=all");
        } else {
            stringBuffer.append("&extensions=base");
        }
        if (((DistrictSearchQuery) this.f24221a).checkKeyWords()) {
            String m16997c = m16997c(((DistrictSearchQuery) this.f24221a).getKeywords());
            stringBuffer.append("&keywords=");
            stringBuffer.append(m16997c);
        }
        stringBuffer.append(C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
        stringBuffer.append(C0002O.m25086C("&subdistrict=", String.valueOf(((DistrictSearchQuery) this.f24221a).getSubDistrict())));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public DistrictResult mo16254a(String str) {
        ArrayList arrayList = new ArrayList();
        DistrictResult districtResult = new DistrictResult((DistrictSearchQuery) this.f24221a, arrayList);
        try {
            JSONObject jSONObject = new JSONObject(str);
            districtResult.setPageCount(jSONObject.optInt("count"));
            JSONArray optJSONArray = jSONObject.optJSONArray("districts");
            if (optJSONArray == null) {
                return districtResult;
            }
            C2014q.m16341a(optJSONArray, arrayList, null);
            return districtResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "DistrictServerHandler", "paseJSONJSONException");
            return districtResult;
        } catch (Exception e2) {
            C2007j.m16371a(e2, "DistrictServerHandler", "paseJSONException");
            return districtResult;
        }
    }

    public C2009l(Context context, DistrictSearchQuery districtSearchQuery) {
        super(context, districtSearchQuery);
    }
}
