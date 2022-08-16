package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public final class CJPayTradeQueryBizContentParams {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ = "cashdesk.sdk.pay.query";
    public CJPayProcessInfo LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public CJPayRiskInfo f25523LJ;
    public UserRetainInfo LJFF;

    static {
        Covode.recordClassIndex(8356);
    }

    /* loaded from: classes17.dex */
    public static class UserRetainInfo implements CJPayObject, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean is_retained = Boolean.FALSE;
        public String retain_type = "";
        public String position = "";

        static {
            Covode.recordClassIndex(8357);
        }

        public String toJson() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.is_retained != null) {
                    jSONObject.put("is_retained", this.is_retained);
                }
                if (this.retain_type != null) {
                    jSONObject.put("retain_type", this.retain_type);
                }
                if (this.position != null) {
                    jSONObject.put("position", this.position);
                }
                return jSONObject.toString();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.LIZIZ);
            if (this.LIZJ != null) {
                jSONObject.put("process_info", this.LIZJ.toJson());
            }
            if (this.LIZLLL != null) {
                jSONObject.put("trade_no", this.LIZLLL);
            }
            if (this.f25523LJ != null) {
                jSONObject.put("risk_info", this.f25523LJ.toJson());
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.LJFF != null) {
                jSONObject2.put("user_retain_info", this.LJFF.toJson());
            }
            jSONObject.put("exts", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
