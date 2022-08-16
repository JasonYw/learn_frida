package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.PoiItem;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.y */
/* loaded from: classes19.dex */
public class C2036y extends AbstractC2035x<String, PoiItem> {
    static {
        Covode.recordClassIndex(5647);
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        return m16255j();
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/place/detail?");
    }

    /* renamed from: j */
    private String m16255j() {
        new StringBuilder();
        return C0002O.m25082C("id=", (String) this.f24221a, "&output=json", "&extensions=all", "&children=1", C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
    }

    /* renamed from: a */
    private PoiItem m16257a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("pois")) == null || optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return C2014q.m16325d(optJSONObject);
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: f */
    public PoiItem mo16254a(String str) {
        try {
            return m16257a(new JSONObject(str));
        } catch (JSONException e) {
            C2007j.m16371a(e, "PoiSearchIdHandler", "paseJSONJSONException");
            return null;
        } catch (Exception e2) {
            C2007j.m16371a(e2, "PoiSearchIdHandler", "paseJSONException");
            return null;
        }
    }

    public C2036y(Context context, String str) {
        super(context, str);
    }
}
