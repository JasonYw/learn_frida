package com.android.ttcjpaysdk.bindcard.base.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPaySmsSignBean extends CJPayBindCardBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String sign_no = "";
    public String bank_card_id = "";
    public String pwd_token = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public CJPayFrontBindCardInfo card_info = new CJPayFrontBindCardInfo();
    public String payUid = "";
    public CJPayBindCardCommonBean commonBean = new CJPayBindCardCommonBean();
    public boolean isNeedCardInfo = false;
    public String activity_info = "";
    public boolean isUnionPay = false;

    static {
        Covode.recordClassIndex(7034);
    }

    public JSONObject getPayParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sign_no", this.sign_no);
            jSONObject.put("pwd_token", this.pwd_token);
            jSONObject.put("process_info", this.commonBean.processInfo);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "CJPaySmsSignResponse{, code='" + this.code + "', msg='" + this.msg + "', sign_no='" + this.sign_no + "', bank_card_id='" + this.bank_card_id + "', pwd_token='" + this.pwd_token + "'}";
    }
}
