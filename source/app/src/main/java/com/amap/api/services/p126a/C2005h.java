package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.h */
/* loaded from: classes19.dex */
public class C2005h extends AbstractC2003f<CloudSearch.Query, CloudResult> {

    /* renamed from: i */
    public int f24822i;

    static {
        Covode.recordClassIndex(5616);
    }

    /* renamed from: j */
    private String m16382j() {
        if (((CloudSearch.Query) this.f24221a).getSortingrules() != null) {
            return ((CloudSearch.Query) this.f24221a).getSortingrules().toString();
        }
        return "";
    }

    /* renamed from: k */
    private String m16381k() {
        StringBuffer stringBuffer = new StringBuffer();
        String filterString = ((CloudSearch.Query) this.f24221a).getFilterString();
        String filterNumString = ((CloudSearch.Query) this.f24221a).getFilterNumString();
        stringBuffer.append(filterString);
        if (!C2007j.m16372a(filterString) && !C2007j.m16372a(filterNumString)) {
            stringBuffer.append("+");
        }
        stringBuffer.append(filterNumString);
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        String m25086C = C0002O.m25086C(C2006i.m16377c(), "/datasearch");
        String shape = ((CloudSearch.Query) this.f24221a).getBound().getShape();
        if (shape.equals("Bound")) {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/around?");
        } else if (!shape.equals("Polygon") && !shape.equals("Rectangle")) {
            if (!shape.equals("Local")) {
                return m25086C;
            }
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/local?");
        } else {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "/polygon?");
        }
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (((CloudSearch.Query) this.f24221a).getBound() != null) {
            if (((CloudSearch.Query) this.f24221a).getBound().getShape().equals("Bound")) {
                double m16375a = C2007j.m16375a(((CloudSearch.Query) this.f24221a).getBound().getCenter().getLongitude());
                double m16375a2 = C2007j.m16375a(((CloudSearch.Query) this.f24221a).getBound().getCenter().getLatitude());
                sb.append("&center=");
                sb.append(m16375a + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a2);
                sb.append("&radius=");
                sb.append(((CloudSearch.Query) this.f24221a).getBound().getRange());
            } else if (((CloudSearch.Query) this.f24221a).getBound().getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((CloudSearch.Query) this.f24221a).getBound().getLowerLeft();
                LatLonPoint upperRight = ((CloudSearch.Query) this.f24221a).getBound().getUpperRight();
                double m16375a3 = C2007j.m16375a(lowerLeft.getLatitude());
                double m16375a4 = C2007j.m16375a(lowerLeft.getLongitude());
                double m16375a5 = C2007j.m16375a(upperRight.getLatitude());
                double m16375a6 = C2007j.m16375a(upperRight.getLongitude());
                sb.append("&polygon=" + m16375a4 + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a3 + ";" + m16375a6 + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a5);
            } else if (((CloudSearch.Query) this.f24221a).getBound().getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = ((CloudSearch.Query) this.f24221a).getBound().getPolyGonList();
                if (polyGonList != null && polyGonList.size() > 0) {
                    sb.append("&polygon=" + C2007j.m16368a(polyGonList, ";"));
                }
            } else if (((CloudSearch.Query) this.f24221a).getBound().getShape().equals("Local")) {
                String m16997c = m16997c(((CloudSearch.Query) this.f24221a).getBound().getCity());
                sb.append("&city=");
                sb.append(m16997c);
            }
        }
        sb.append("&tableid=" + ((CloudSearch.Query) this.f24221a).getTableID());
        if (!C2007j.m16372a(m16381k())) {
            m16381k();
            String m16997c2 = m16997c(m16381k());
            sb.append("&filter=");
            sb.append(m16997c2);
        }
        if (!C2007j.m16372a(m16382j())) {
            sb.append("&sortrule=");
            sb.append(m16382j());
        }
        String m16997c3 = m16997c(((CloudSearch.Query) this.f24221a).getQueryString());
        if (((CloudSearch.Query) this.f24221a).getQueryString() != null && !((CloudSearch.Query) this.f24221a).getQueryString().equals("")) {
            sb.append("&keywords=" + m16997c3);
        } else {
            sb.append("&keywords=");
        }
        sb.append("&limit=" + ((CloudSearch.Query) this.f24221a).getPageSize());
        sb.append("&page=" + ((CloudSearch.Query) this.f24221a).getPageNum());
        sb.append("&key=" + C1864bf.m16960f(this.f24224d));
        return sb.toString();
    }

    /* renamed from: b */
    private ArrayList<CloudItem> m16384b(JSONObject jSONObject) {
        ArrayList<CloudItem> arrayList = new ArrayList<>();
        if (jSONObject.has("datas")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("datas");
            this.f24822i = jSONObject.getInt("count");
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                CloudItemDetail m16389a = m16389a(optJSONObject);
                m16390a(m16389a, optJSONObject);
                arrayList.add(m16389a);
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: f */
    public CloudResult mo16254a(String str) {
        ArrayList<CloudItem> arrayList = null;
        if (str != null && !str.equals("")) {
            try {
                arrayList = m16384b(new JSONObject(str));
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return CloudResult.createPagedResult((CloudSearch.Query) this.f24221a, this.f24822i, ((CloudSearch.Query) this.f24221a).getBound(), ((CloudSearch.Query) this.f24221a).getPageSize(), arrayList);
        }
        return CloudResult.createPagedResult((CloudSearch.Query) this.f24221a, this.f24822i, ((CloudSearch.Query) this.f24221a).getBound(), ((CloudSearch.Query) this.f24221a).getPageSize(), null);
    }

    public C2005h(Context context, CloudSearch.Query query) {
        super(context, query);
    }
}
