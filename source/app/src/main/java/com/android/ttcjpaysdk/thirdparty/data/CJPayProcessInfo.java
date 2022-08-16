package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayProcessInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long create_time;
    public String process_id = "";
    public String process_info = "";

    static {
        Covode.recordClassIndex(8341);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", this.process_id);
            jSONObject.put("create_time", this.create_time);
            jSONObject.put("process_info", this.process_info);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void parseProcessInfo(JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 2).isSupported && jSONObject != null) {
            this.process_id = jSONObject.optString("process_id");
            this.create_time = jSONObject.optLong("create_time");
            this.process_info = jSONObject.optString("process_info");
        }
    }
}
