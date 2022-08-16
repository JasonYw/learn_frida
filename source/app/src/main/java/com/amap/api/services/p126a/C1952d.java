package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.core.SuggestionCity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.d */
/* loaded from: classes19.dex */
public class C1952d<T> extends AbstractC1843b<T, Object> {

    /* renamed from: i */
    public int f24713i;

    /* renamed from: j */
    public List<String> f24714j = new ArrayList();

    /* renamed from: k */
    public List<SuggestionCity> f24715k = new ArrayList();

    static {
        Covode.recordClassIndex(5563);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        String str;
        if (this.f24221a instanceof BusLineQuery) {
            if (((BusLineQuery) this.f24221a).getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                str = "lineid";
            } else if (((BusLineQuery) this.f24221a).getCategory() == BusLineQuery.SearchType.BY_LINE_NAME) {
                str = "linename";
            } else {
                str = "";
            }
        } else {
            str = "stopname";
        }
        new StringBuilder();
        return C0002O.m25084C(C2006i.m16380a(), "/bus/", str, "?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (this.f24221a instanceof BusLineQuery) {
            BusLineQuery busLineQuery = (BusLineQuery) this.f24221a;
            sb.append("&extensions=all");
            if (busLineQuery.getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                sb.append("&id=");
                sb.append(m16997c(((BusLineQuery) this.f24221a).getQueryString()));
            } else {
                String city = busLineQuery.getCity();
                if (!C2014q.m16314i(city)) {
                    String m16997c = m16997c(city);
                    sb.append("&city=");
                    sb.append(m16997c);
                }
                sb.append("&keywords=" + m16997c(busLineQuery.getQueryString()));
                sb.append("&offset=" + busLineQuery.getPageSize());
                sb.append("&page=" + busLineQuery.getPageNumber());
            }
        } else {
            BusStationQuery busStationQuery = (BusStationQuery) this.f24221a;
            String city2 = busStationQuery.getCity();
            if (!C2014q.m16314i(city2)) {
                String m16997c2 = m16997c(city2);
                sb.append("&city=");
                sb.append(m16997c2);
            }
            sb.append("&keywords=" + m16997c(busStationQuery.getQueryString()));
            sb.append("&offset=" + busStationQuery.getPageSize());
            sb.append("&page=" + busStationQuery.getPageNumber());
        }
        sb.append("&key=" + C1864bf.m16960f(this.f24224d));
        return sb.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: a */
    public Object mo16254a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("suggestion");
            if (optJSONObject != null) {
                this.f24715k = C2014q.m16340a(optJSONObject);
                this.f24714j = C2014q.m16332b(optJSONObject);
            }
            this.f24713i = jSONObject.optInt("count");
            if (this.f24221a instanceof BusLineQuery) {
                return BusLineResult.createPagedResult((BusLineQuery) this.f24221a, this.f24713i, this.f24715k, this.f24714j, C2014q.m16313i(jSONObject));
            }
            return BusStationResult.createPagedResult((BusStationQuery) this.f24221a, this.f24713i, this.f24715k, this.f24714j, C2014q.m16322e(jSONObject));
        } catch (Exception e) {
            C2007j.m16371a(e, "BusSearchServerHandler", "paseJSON");
            return null;
        }
    }

    public C1952d(Context context, T t) {
        super(context, t);
    }
}
