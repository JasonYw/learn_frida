package com.alibaba.alibclinkpartner.simple.p069a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.alibclinkpartner.simple.a.b */
/* loaded from: classes26.dex */
public class C1010b {
    static {
        Covode.recordClassIndex(4322);
    }

    /* renamed from: a */
    public static String m20009a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m20006a(Map<String, Object> map) {
        return m20004b(map).toString();
    }

    /* renamed from: a */
    public static JSONArray m20007a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = m20004b((Map) obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m20005a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            if (obj instanceof Map) {
                obj = m20004b((Map) obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static boolean m20008a(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 0) != null;
    }

    /* renamed from: b */
    public static JSONObject m20004b(Map<String, ? extends Object> map) {
        String key;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Map) {
                        key = entry.getKey();
                        value = m20004b((Map) value);
                    } else if (value instanceof List) {
                        key = entry.getKey();
                        value = m20007a((List) value);
                    } else if (value.getClass().isArray()) {
                        key = entry.getKey();
                        value = m20005a((Object[]) value);
                    } else {
                        key = entry.getKey();
                    }
                    jSONObject.put(key, value);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
