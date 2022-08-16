package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiResult;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.z */
/* loaded from: classes19.dex */
public class C2037z extends AbstractC2035x<C1802ac, PoiResult> {

    /* renamed from: i */
    public int f24869i;

    /* renamed from: j */
    public List<String> f24870j = new ArrayList();

    /* renamed from: k */
    public List<SuggestionCity> f24871k = new ArrayList();

    static {
        Covode.recordClassIndex(5648);
    }

    /* renamed from: a */
    private String m16253a(boolean z) {
        return z ? "distance" : "weight";
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        String m25086C = C0002O.m25086C(C2006i.m16380a(), "/place");
        if (((C1802ac) this.f24221a).f24233b == null) {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/text?");
        } else if (((C1802ac) this.f24221a).f24233b.getShape().equals("Bound")) {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/around?");
        } else if (!((C1802ac) this.f24221a).f24233b.getShape().equals("Rectangle") && !((C1802ac) this.f24221a).f24233b.getShape().equals("Polygon")) {
            return m25086C;
        } else {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/polygon?");
        }
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        List<LatLonPoint> polyGonList;
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (((C1802ac) this.f24221a).f24233b != null) {
            if (((C1802ac) this.f24221a).f24233b.getShape().equals("Bound")) {
                double m16375a = C2007j.m16375a(((C1802ac) this.f24221a).f24233b.getCenter().getLongitude());
                double m16375a2 = C2007j.m16375a(((C1802ac) this.f24221a).f24233b.getCenter().getLatitude());
                sb.append("&location=");
                sb.append(m16375a + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a2);
                sb.append("&radius=");
                sb.append(((C1802ac) this.f24221a).f24233b.getRange());
                sb.append("&sortrule=");
                sb.append(m16253a(((C1802ac) this.f24221a).f24233b.isDistanceSort()));
            } else if (((C1802ac) this.f24221a).f24233b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((C1802ac) this.f24221a).f24233b.getLowerLeft();
                LatLonPoint upperRight = ((C1802ac) this.f24221a).f24233b.getUpperRight();
                double m16375a3 = C2007j.m16375a(lowerLeft.getLatitude());
                double m16375a4 = C2007j.m16375a(lowerLeft.getLongitude());
                double m16375a5 = C2007j.m16375a(upperRight.getLatitude());
                double m16375a6 = C2007j.m16375a(upperRight.getLongitude());
                sb.append("&polygon=" + m16375a4 + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a3 + ";" + m16375a6 + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a5);
            } else if (((C1802ac) this.f24221a).f24233b.getShape().equals("Polygon") && (polyGonList = ((C1802ac) this.f24221a).f24233b.getPolyGonList()) != null && polyGonList.size() > 0) {
                sb.append("&polygon=" + C2007j.m16369a(polyGonList));
            }
        }
        String city = ((C1802ac) this.f24221a).f24232a.getCity();
        if (!m16258e(city)) {
            String m16997c = m16997c(city);
            sb.append("&city=");
            sb.append(m16997c);
        }
        String m16997c2 = m16997c(((C1802ac) this.f24221a).f24232a.getQueryString());
        if (!m16258e(m16997c2)) {
            sb.append("&keywords=" + m16997c2);
        }
        sb.append("&offset=" + ((C1802ac) this.f24221a).f24232a.getPageSize());
        sb.append("&page=" + ((C1802ac) this.f24221a).f24232a.getPageNum());
        String building = ((C1802ac) this.f24221a).f24232a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=" + ((C1802ac) this.f24221a).f24232a.getBuilding());
        }
        String m16997c3 = m16997c(((C1802ac) this.f24221a).f24232a.getCategory());
        if (!m16258e(m16997c3)) {
            sb.append("&types=" + m16997c3);
        }
        sb.append("&extensions=all");
        sb.append("&key=" + C1864bf.m16960f(this.f24224d));
        if (((C1802ac) this.f24221a).f24232a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (((C1802ac) this.f24221a).f24232a.isRequireSubPois()) {
            sb.append("&children=1");
        } else {
            sb.append("&children=0");
        }
        if (((C1802ac) this.f24221a).f24233b == null && ((C1802ac) this.f24221a).f24232a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(m16253a(((C1802ac) this.f24221a).f24232a.isDistanceSort()));
            double m16375a7 = C2007j.m16375a(((C1802ac) this.f24221a).f24232a.getLocation().getLongitude());
            double m16375a8 = C2007j.m16375a(((C1802ac) this.f24221a).f24232a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(m16375a7 + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a8);
        }
        return sb.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: f */
    public PoiResult mo16254a(String str) {
        JSONObject jSONObject;
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (str == null) {
            return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
        }
        try {
            jSONObject = new JSONObject(str);
            this.f24869i = jSONObject.optInt("count");
            arrayList = C2014q.m16328c(jSONObject);
        } catch (JSONException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
        try {
        } catch (JSONException e3) {
            e = e3;
            C2007j.m16371a(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
            return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
        } catch (Exception e4) {
            e = e4;
            C2007j.m16371a(e, "PoiSearchKeywordHandler", "paseJSONException");
            return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
        }
        if (!jSONObject.has("suggestion")) {
            return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("suggestion");
        if (optJSONObject == null) {
            return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
        }
        this.f24871k = C2014q.m16340a(optJSONObject);
        this.f24870j = C2014q.m16332b(optJSONObject);
        return PoiResult.createPagedResult(((C1802ac) this.f24221a).f24232a, ((C1802ac) this.f24221a).f24233b, this.f24870j, this.f24871k, ((C1802ac) this.f24221a).f24232a.getPageSize(), this.f24869i, arrayList);
    }

    public C2037z(Context context, C1802ac c1802ac) {
        super(context, c1802ac);
    }
}
