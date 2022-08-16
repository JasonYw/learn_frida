package com.android.ttcjpaysdk.thirdparty.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPaySendSmsBizContentParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String merchant_id;
    public CJPayProcessInfo process_info;
    public CJPayRiskInfo risk_info;
    public CJPaySecureRequestParams secure_request_params;
    public String method = "cashdesk.wap.user.sendsms";
    public String pwd_level = "2";
    public String service = "pay";

    static {
        Covode.recordClassIndex(8349);
    }

    public String toJsonString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.method);
            jSONObject.put("pwd_level", this.pwd_level);
            jSONObject.put("service", this.service);
            if (this.merchant_id != null) {
                jSONObject.put("merchant_id", this.merchant_id);
            }
            if (this.process_info != null) {
                jSONObject.put("process_info", this.process_info.toJson());
            }
            if (this.risk_info != null) {
                jSONObject.put("risk_info", this.risk_info.toJson());
            }
            if (this.secure_request_params != null) {
                jSONObject.put("secure_request_params", this.secure_request_params.toJson());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
