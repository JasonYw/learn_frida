package com.alipay.sdk.p082m.p121u;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.u.d */
/* loaded from: classes2.dex */
public class C1384d {
    static {
        Covode.recordClassIndex(4884);
    }

    /* renamed from: a */
    public static JSONObject m18871a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject4 = jSONObjectArr[i];
                if (jSONObject4 != null) {
                    Iterator<String> keys = jSONObject4.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e) {
            C1385e.m18866a(e);
        }
        return jSONObject3;
    }
}
