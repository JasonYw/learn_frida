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
public class CJPayCard implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String status = "";
    public String msg = "";
    public String mark = "";
    public String bank_card_id = "";
    public String card_no_mask = "";
    public String card_type = "";
    public String card_type_name = "";
    public String bank_code = "";
    public String background_color = "";
    public String true_name_mask = "";
    public String bank_name = "";
    public String mobile_mask = "";
    public String certificate_code_mask = "";
    public String certificate_type = "";
    public String need_pwd = "";
    public String need_send_sms = "";
    public String need_repaire = "";
    public String icon_url = "";
    public int card_level = -1;
    public ArrayList<CJPayUserAgreement> user_agreement = new ArrayList<>();
    public boolean is_freeze_card = false;
    public String perday_limit = "";
    public String perpay_limit = "";
    public String start_color = "";
    public String end_color = "";
    public String quickpay_mark = "";
    public String route_id = "";
    public String withdraw_msg = "";
    public String identity_code_mask = "";
    public String identity_type = "";
    public String name_mask = "";
    public String sign_no = "";
    public String paymentType = "";
    public String card_show_name = "";
    public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();
    public String channel_icon_url = "";

    static {
        Covode.recordClassIndex(8324);
    }

    public boolean isCardInactive() {
        if (this.card_level == 2) {
            return true;
        }
        return false;
    }

    public boolean isCardAvailable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.status);
    }

    public boolean isFreezeCard() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "freeze".equals(this.status);
    }

    public String toJsonString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject json = toJson();
        if (json == null) {
            return "";
        }
        return json.toString();
    }

    public JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", this.status);
            jSONObject.put("msg", this.msg);
            jSONObject.put("mark", this.mark);
            jSONObject.put("bank_card_id", this.bank_card_id);
            jSONObject.put("card_no_mask", this.card_no_mask);
            jSONObject.put("card_type", this.card_type);
            jSONObject.put("card_type_name", this.card_type_name);
            jSONObject.put("bank_code", this.bank_code);
            jSONObject.put("true_name_mask", this.true_name_mask);
            jSONObject.put("bank_name", this.bank_name);
            jSONObject.put("mobile_mask", this.mobile_mask);
            jSONObject.put("certificate_code_mask", this.certificate_code_mask);
            jSONObject.put("certificate_type", this.certificate_type);
            jSONObject.put("need_pwd", this.need_pwd);
            jSONObject.put("need_send_sms", this.need_send_sms);
            jSONObject.put("need_repaire", this.need_repaire);
            jSONObject.put("icon_url", this.icon_url);
            jSONObject.put("card_level", this.card_level);
            if (this.user_agreement.size() > 0) {
                jSONObject.put("user_agreement", toJsonArray(this.user_agreement));
            }
            jSONObject.put("is_freeze_card", this.is_freeze_card);
            jSONObject.put("perday_limit", this.perday_limit);
            jSONObject.put("perpay_limit", this.perpay_limit);
            jSONObject.put("start_color", this.start_color);
            jSONObject.put("end_color", this.end_color);
            jSONObject.put("quickpay_mark", this.quickpay_mark);
            jSONObject.put("route_id", this.route_id);
            jSONObject.put("withdraw_msg", this.withdraw_msg);
            jSONObject.put("sign_no", this.sign_no);
            jSONObject.put("channel_icon_url", this.channel_icon_url);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private JSONArray toJsonArray(ArrayList<CJPayUserAgreement> arrayList) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i).toJson());
        }
        return jSONArray;
    }
}
