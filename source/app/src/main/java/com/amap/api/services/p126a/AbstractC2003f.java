package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.cloud.CloudImage;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34068l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.amap.api.services.a.f */
/* loaded from: classes19.dex */
public abstract class AbstractC2003f<T, V> extends AbstractC1843b<T, V> {
    static {
        Covode.recordClassIndex(5614);
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b, com.amap.api.services.p126a.AbstractC1799a, com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: e */
    public Map<String, String> mo16388e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 7.1.0");
        hashMap.put("X-INFO", C1875bi.m16936a(this.f24224d));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "7.1.0", "cloud"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    /* renamed from: e */
    public boolean m16387e(String str) {
        if (str != null && !str.equals("") && !str.equals("[]")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public CloudItemDetail m16389a(JSONObject jSONObject) {
        CloudItemDetail cloudItemDetail = new CloudItemDetail(C2014q.m16338a(jSONObject, C34068l.f43339g), C2014q.m16331b(jSONObject, "_location"), C2014q.m16338a(jSONObject, "_name"), C2014q.m16338a(jSONObject, "_address"));
        cloudItemDetail.setCreatetime(C2014q.m16338a(jSONObject, "_createtime"));
        cloudItemDetail.setUpdatetime(C2014q.m16338a(jSONObject, "_updatetime"));
        if (jSONObject.has("_distance")) {
            String optString = jSONObject.optString("_distance");
            if (!m16387e(optString)) {
                cloudItemDetail.setDistance(Integer.parseInt(optString));
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("_image");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                arrayList.add(new CloudImage(C2014q.m16338a(jSONObject2, C34068l.f43339g), C2014q.m16338a(jSONObject2, "_preurl"), C2014q.m16338a(jSONObject2, "_url")));
            }
            cloudItemDetail.setmCloudImage(arrayList);
            return cloudItemDetail;
        }
        cloudItemDetail.setmCloudImage(arrayList);
        return cloudItemDetail;
    }

    public AbstractC2003f(Context context, T t) {
        super(context, t);
    }

    /* renamed from: a */
    public void m16390a(CloudItem cloudItem, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap<String, String> hashMap = new HashMap<>();
        if (keys == null) {
            return;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && !next.toString().startsWith("_")) {
                hashMap.put(next.toString(), jSONObject.optString(next.toString()));
            }
        }
        cloudItem.setCustomfield(hashMap);
    }
}
