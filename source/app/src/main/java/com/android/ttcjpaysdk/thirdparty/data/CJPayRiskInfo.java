package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes25.dex */
public class CJPayRiskInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String identity_token;
    public RiskStrInfo risk_str;

    static {
        Covode.recordClassIndex(8346);
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.risk_str != null) {
                jSONObject.put("risk_str", this.risk_str.toJson());
            }
            if (!TextUtils.isEmpty(this.identity_token)) {
                jSONObject.put("identity_token", this.identity_token);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes25.dex */
    public static class RiskStrInfo implements CJPayObject, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, String> riskInfoParamsMap;

        static {
            Covode.recordClassIndex(8347);
        }

        public JSONObject toJson() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.riskInfoParamsMap != null && this.riskInfoParamsMap.size() > 0) {
                    for (Map.Entry<String, String> entry : this.riskInfoParamsMap.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
