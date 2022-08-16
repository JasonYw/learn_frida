package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayTradeQueryResponseBean implements CJPayObject, Serializable {
    public String code = "";
    public String msg = "";
    public ArrayList<PayInfo> pay_info = new ArrayList<>();
    public CJPayMerchantInfo merchant_info = new CJPayMerchantInfo();
    public CJPayUserInfo user_info = new CJPayUserInfo();
    public CJPayResultPageShowConf result_page_show_conf = new CJPayResultPageShowConf();
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public ArrayList<Voucher> voucher_details = new ArrayList<>();

    /* loaded from: classes17.dex */
    public static class Voucher implements CJPayObject, Serializable {
        public int used_amount;
        public String voucher_no = "";
        public String voucher_type = "";
        public String front_bank_code = "";
        public String label = "";
        public String voucher_name = "";
        public String credit_pay_installment = "";

        static {
            Covode.recordClassIndex(8361);
        }
    }

    static {
        Covode.recordClassIndex(8358);
    }

    /* loaded from: classes17.dex */
    public static class AccountInfo implements CJPayObject, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String account_type = "";
        public String account = "";
        public String account_name = "";

        static {
            Covode.recordClassIndex(8359);
        }

        public JSONObject toJson() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("account_type", this.account_type);
                jSONObject.put("account", this.account);
                jSONObject.put("account_name", this.account_name);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes17.dex */
    public static class PayInfo implements CJPayObject, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int amount;
        public String paytype = "";
        public AccountInfo account_info = new AccountInfo();
        public String name = "";
        public String desc = "";
        public String color_type = "";
        public String type_mark = "";
        public String half_screen_desc = "";

        static {
            Covode.recordClassIndex(8360);
        }

        public String toJsonString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.amount > 0) {
                    jSONObject.put("amount", this.amount);
                }
                if (!TextUtils.isEmpty(this.paytype)) {
                    jSONObject.put("paytype", this.paytype);
                }
                if (this.account_info != null) {
                    jSONObject.put("process_info", this.account_info.toJson());
                }
                if (!TextUtils.isEmpty(this.name)) {
                    jSONObject.put("name", this.name);
                }
                if (!TextUtils.isEmpty(this.desc)) {
                    jSONObject.put("desc", this.desc);
                }
                if (!TextUtils.isEmpty(this.color_type)) {
                    jSONObject.put("color_type", this.color_type);
                }
                if (!TextUtils.isEmpty(this.type_mark)) {
                    jSONObject.put("type_mark", this.type_mark);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
