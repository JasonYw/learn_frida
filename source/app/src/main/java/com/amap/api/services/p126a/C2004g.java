package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.cloud.CloudItemDetail;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.g */
/* loaded from: classes19.dex */
public class C2004g extends AbstractC2003f<C1801ab, CloudItemDetail> {
    static {
        Covode.recordClassIndex(5615);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16377c(), "/datasearch/id?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        new StringBuilder();
        return C0002O.m25084C(C0002O.m25086C("key=", C1864bf.m16960f(this.f24224d)), C0002O.m25086C("&tableid=", ((C1801ab) this.f24221a).f24230a), "&output=json", C0002O.m25086C("&_id=", ((C1801ab) this.f24221a).f24231b));
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: f */
    public CloudItemDetail mo16254a(String str) {
        CloudItemDetail cloudItemDetail = null;
        if (str != null && !str.equals("")) {
            try {
                cloudItemDetail = m16386b(new JSONObject(str));
                return cloudItemDetail;
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
                return cloudItemDetail;
            }
        }
        return cloudItemDetail;
    }

    /* renamed from: b */
    private CloudItemDetail m16386b(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("datas")) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("datas");
        if (optJSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
        CloudItemDetail m16389a = m16389a(jSONObject2);
        m16390a(m16389a, jSONObject2);
        return m16389a;
    }

    public C2004g(Context context, C1801ab c1801ab) {
        super(context, c1801ab);
    }
}
