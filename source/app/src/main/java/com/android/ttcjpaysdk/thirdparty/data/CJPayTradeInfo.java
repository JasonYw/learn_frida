package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayTradeInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long create_time;
    public long expire_time;
    public boolean is_pay_new_card;
    public long pay_amount;
    public long trade_amount;
    public long trade_time;
    public String out_trade_no = "";
    public String return_url = "";
    public String trade_desc = "";
    public String trade_name = "";
    public String trade_no = "";
    public String trade_status = "";
    public String trade_type = "";
    public String amount_can_change = "";
    public String trade_status_desc_msg = "";
    public String pay_type = "";
    public String balance_amount = "";
    public String bank_amount = "";
    public String discount_amount = "";
    public ArrayList<C2338a> combine_pay_fund_list = new ArrayList<>();
    public String bank_name = "";
    public String card_type = "";
    public String credit_pay_installment_desc = "";
    public String is_trade_create_again = "0";

    /* renamed from: com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo$a */
    /* loaded from: classes17.dex */
    public static class C2338a implements CJPayObject {
        public int fund_amount;
        public String fund_type_desc = "";
        public String fund_amount_desc = "";
        public String fund_type = "";

        static {
            Covode.recordClassIndex(8355);
        }
    }

    static {
        Covode.recordClassIndex(8354);
    }

    public boolean isTradeAgain() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.is_trade_create_again);
    }

    public String toJsonString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("create_time", this.create_time);
            jSONObject.put("expire_time", this.expire_time);
            jSONObject.put("out_trade_no", this.out_trade_no);
            jSONObject.put("return_url", this.return_url);
            jSONObject.put("trade_amount", this.trade_amount);
            jSONObject.put("trade_desc", this.trade_desc);
            jSONObject.put("trade_name", this.trade_name);
            jSONObject.put("trade_no", this.trade_no);
            jSONObject.put("trade_status", this.trade_status);
            jSONObject.put("trade_time", this.trade_time);
            jSONObject.put("trade_type", this.trade_type);
            jSONObject.put("pay_amount", this.pay_amount);
            jSONObject.put("amount_can_change", this.amount_can_change);
            jSONObject.put("trade_status_desc_msg", this.trade_status_desc_msg);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void setDataForRestricted(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.trade_no = jSONObject.optString("trade_no");
                this.trade_amount = jSONObject.optLong("trade_amount");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
