package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ag */
/* loaded from: classes19.dex */
public class C1806ag extends AbstractC1843b<RoutePOISearchQuery, RoutePOISearchResult> {
    static {
        Covode.recordClassIndex(5417);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/place/route?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        stringBuffer.append("&range=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RoutePOISearchQuery) this.f24221a).getRange());
        stringBuffer.append(sb.toString());
        String str = "";
        try {
            switch (((RoutePOISearchQuery) this.f24221a).getSearchType()) {
                case TypeGasStation:
                    str = "0101";
                    break;
                case TypeMaintenanceStation:
                    str = "0300";
                    break;
                case TypeATM:
                    str = "1603";
                    break;
                case TypeToilet:
                    str = "2003";
                    break;
                case TypeFillingStation:
                    str = "0103";
                    break;
                case TypeServiceArea:
                    str = "180301";
                    break;
            }
        } catch (Exception unused) {
        }
        if (((RoutePOISearchQuery) this.f24221a).getPolylines() != null && ((RoutePOISearchQuery) this.f24221a).getPolylines().size() > 0) {
            stringBuffer.append("&polyline=");
            stringBuffer.append(C2007j.m16369a(((RoutePOISearchQuery) this.f24221a).getPolylines()));
        } else {
            stringBuffer.append("&origin=");
            stringBuffer.append(C2007j.m16373a(((RoutePOISearchQuery) this.f24221a).getFrom()));
            stringBuffer.append("&destination=");
            stringBuffer.append(C2007j.m16373a(((RoutePOISearchQuery) this.f24221a).getTo()));
            stringBuffer.append("&strategy=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((RoutePOISearchQuery) this.f24221a).getMode());
            stringBuffer.append(sb2.toString());
        }
        stringBuffer.append("&types=");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public RoutePOISearchResult mo16254a(String str) {
        ArrayList<RoutePOIItem> arrayList = new ArrayList<>();
        try {
            arrayList = C2014q.m16288w(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new RoutePOISearchResult(arrayList, (RoutePOISearchQuery) this.f24221a);
    }

    public C1806ag(Context context, RoutePOISearchQuery routePOISearchQuery) {
        super(context, routePOISearchQuery);
    }
}
