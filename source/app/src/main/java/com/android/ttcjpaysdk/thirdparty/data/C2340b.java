package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.thirdparty.data.b */
/* loaded from: classes17.dex */
public final class C2340b implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long after_reduce_order_amount;
    public int campaign_type;
    public long reduce;
    public String campaign_no = "";
    public String front_bank_code = "";
    public String card_type = "";
    public String label = "";
    public String new_card_label = "";

    static {
        Covode.recordClassIndex(8382);
    }

    public final String getDiscountYuan() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return BigDecimal.valueOf(this.reduce).divide(new BigDecimal(100)).setScale(2, 4).toString();
    }

    public final JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaign_no", this.campaign_no);
            jSONObject.put("campaign_type", this.campaign_type);
            jSONObject.put("front_bank_code", this.front_bank_code);
            jSONObject.put("card_type", this.card_type);
            jSONObject.put("reduce", this.reduce);
            jSONObject.put("after_reduce_order_amount", this.after_reduce_order_amount);
            jSONObject.put("label", this.label);
            jSONObject.put("new_card_label", this.new_card_label);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
