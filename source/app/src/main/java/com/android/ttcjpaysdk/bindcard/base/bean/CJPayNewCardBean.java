package com.android.ttcjpaysdk.bindcard.base.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayInsufficientBalanceHintInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CombineLimitInfo;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C135756cG7;

/* loaded from: classes17.dex */
public class CJPayNewCardBean extends CJPayBindCardBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mobile = "";
    public CJPayFaceVerifyInfo face_verify_info = new CJPayFaceVerifyInfo();
    public com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo button_info = new com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo();
    public String bank_card_id = "";
    public String pay_type = "";
    public String combine_type = "";
    public CombineLimitInfo combine_limit_button = new CombineLimitInfo();
    public CJPayInsufficientBalanceHintInfo hint_info = new CJPayInsufficientBalanceHintInfo();
    public C135756cG7 exts = new C135756cG7();
    public CJPayProcessInfo process_info = new CJPayProcessInfo();
    public String unavailable_pay_type_sub_title = "";
    public String biz_fail_reason = "";

    static {
        Covode.recordClassIndex(7029);
    }

    public boolean isCombinePay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("combinepay", this.pay_type);
    }

    public JSONObject getPayParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2521l.LJIIJ, this.code);
            jSONObject.put("msg", this.msg);
            jSONObject.put("pay_type", this.pay_type);
            jSONObject.put("combine_type", this.combine_type);
            jSONObject.put("bank_card_id", this.bank_card_id);
            jSONObject.put("unavailable_pay_type_sub_title", this.unavailable_pay_type_sub_title);
            jSONObject.put("combine_limit_button", CJPayJsonParser.toJsonObject(this.combine_limit_button));
            jSONObject.put("hint_info", CJPayJsonParser.toJsonObject(this.hint_info));
            jSONObject.put("exts", CJPayJsonParser.toJsonObject(this.exts));
            jSONObject.put("biz_fail_reason", this.biz_fail_reason);
            jSONObject.put("process_info", CJPayJsonParser.toJsonObject(this.process_info));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
