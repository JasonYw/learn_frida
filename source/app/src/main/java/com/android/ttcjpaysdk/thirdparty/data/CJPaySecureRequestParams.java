package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPaySecureRequestParams implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int check;
    public ArrayList<String> fields = new ArrayList<>();
    public int type1;
    public int type2;
    public int version;

    static {
        Covode.recordClassIndex(8348);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.version);
            jSONObject.put("type1", this.type1);
            jSONObject.put("type2", this.type2);
            jSONObject.put("check", this.check);
            jSONObject.put("fields", toJsonArray(this.fields));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private JSONArray toJsonArray(ArrayList<String> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i));
        }
        return jSONArray;
    }
}
