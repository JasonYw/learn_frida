package com.android.ttcjpaysdk.bindcard.base.bean;

import android.content.Context;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayFrontBindCardInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bank_card_id = "";
    public String bank_code = "";
    public String bank_name = "";
    public String icon_url = "";
    public String card_type = "";
    public String card_no_mask = "";
    public String status = "";
    public String mobile_mask = "";
    public String name_mask = "";
    public String perday_limit = "";
    public String perpay_limit = "";

    static {
        Covode.recordClassIndex(7026);
    }

    public JSONObject toJSONObject() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bank_card_id", this.bank_card_id);
            jSONObject.put("bank_code", this.bank_code);
            jSONObject.put("bank_name", this.bank_name);
            jSONObject.put("icon_url", this.icon_url);
            jSONObject.put("card_type", this.card_type);
            jSONObject.put("card_no_mask", this.card_no_mask);
            jSONObject.put("status", this.status);
            jSONObject.put("mobile_mask", this.mobile_mask);
            jSONObject.put("name_mask", this.name_mask);
            jSONObject.put("perday_limit", this.perday_limit);
            jSONObject.put("perpay_limit", this.perpay_limit);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String getCardTypeStr(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.card_type.equalsIgnoreCase("DEBIT")) {
            return context.getString(2131561593);
        }
        return context.getString(2131561571);
    }
}
