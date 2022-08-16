package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C136356cPn;

/* loaded from: classes17.dex */
public class CJPayTradeConfirmBizContentParams implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CJPayAccountInfo account_info;
    public CJPayCardItem card_item;
    public String cert_code;
    public String cert_type;
    public String channel_pay_type;
    public C136356cPn credit_item;
    public JSONObject exts;
    public C2341h face_verify_params;
    public String merchant_id;
    public boolean nonblock_anti_laundering_canceled;
    public CJPayOneTimePwd one_time_pwd;
    public Map<String, String> params;
    public long pay_amount;
    public String pay_type;
    public PreParams pre_params;
    public CJPayProcessInfo process_info;
    public String pwd;
    public String pwd_type;
    public String req_type;
    public CJPayRiskInfo risk_info;
    public CJPaySecureRequestParams secure_request_params;
    public boolean selected_open_nopwd;
    public boolean selected_tips_checkbox;
    public String sms;
    public long trade_amount;
    public String trade_no;
    public ArrayList<String> voucher_no_list;
    public String method = "cashdesk.sdk.pay.confirm";
    public String out_trade_no = "";
    public String no_pwd_confirm_hide_period = "";
    public String combine_type = "";
    public String token = "";

    static {
        Covode.recordClassIndex(8350);
    }

    /* loaded from: classes17.dex */
    public static class PreParams implements CJPayObject {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String currency;
        public String sign_no;
        public String token;
        public long total_amount;

        static {
            Covode.recordClassIndex(8351);
        }

        public JSONObject toJson() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("total_amount", this.total_amount);
                jSONObject.put("currency", this.currency);
                jSONObject.put("sign_no", this.sign_no);
                jSONObject.put("token", this.token);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public String toJsonString() {
        JSONObject mapToJSONObj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.method);
            if (this.trade_no != null) {
                jSONObject.put("trade_no", this.trade_no);
            }
            if (this.trade_amount > 0) {
                jSONObject.put("trade_amount", this.trade_amount);
            }
            if (this.pay_amount > 0) {
                jSONObject.put("pay_amount", this.pay_amount);
            }
            if (this.merchant_id != null) {
                jSONObject.put("merchant_id", this.merchant_id);
            }
            if (this.pay_type != null) {
                jSONObject.put("pay_type", this.pay_type);
            }
            if (this.channel_pay_type != null) {
                jSONObject.put("channel_pay_type", this.channel_pay_type);
            }
            if (this.process_info != null) {
                jSONObject.put("process_info", this.process_info.toJson());
            }
            if (this.account_info != null) {
                jSONObject.put("account_info", this.account_info.toJson());
            }
            if (this.risk_info != null) {
                jSONObject.put("risk_info", this.risk_info.toJson());
            }
            if (this.pwd != null) {
                jSONObject.put("pwd", this.pwd);
            }
            if (this.pwd_type != null) {
                jSONObject.put("pwd_type", this.pwd_type);
            }
            if (this.card_item != null) {
                jSONObject.put("card_item", this.card_item.toJson());
            }
            if (this.credit_item != null) {
                jSONObject.put("credit_item", this.credit_item.toJson());
            }
            if (this.sms != null) {
                jSONObject.put("sms", this.sms);
            }
            if (this.req_type != null) {
                jSONObject.put("req_type", this.req_type);
            }
            if (this.secure_request_params != null) {
                jSONObject.put("secure_request_params", this.secure_request_params.toJson());
            }
            if (this.pre_params != null) {
                jSONObject.put("pre_params", this.pre_params.toJson());
            }
            if (!TextUtils.isEmpty(this.token)) {
                jSONObject.put("token", this.token);
            }
            if (this.params != null && (mapToJSONObj = mapToJSONObj(this.params)) != null) {
                jSONObject.put("params", mapToJSONObj);
            }
            if (this.cert_code != null) {
                jSONObject.put("cert_code", this.cert_code);
            }
            if (this.cert_type != null) {
                jSONObject.put("cert_type", this.cert_type);
            }
            if (this.one_time_pwd != null) {
                jSONObject.put("one_time_pwd", this.one_time_pwd.toJson());
            }
            if (this.combine_type != null) {
                jSONObject.put("combine_type", this.combine_type);
            }
            jSONObject.put("nonblock_anti_laundering_canceled", this.nonblock_anti_laundering_canceled);
            jSONObject.put("selected_open_nopwd", this.selected_open_nopwd);
            jSONObject.put("selected_tips_checkbox", this.selected_tips_checkbox);
            jSONObject.put("no_pwd_confirm_hide_period", this.no_pwd_confirm_hide_period);
            if (this.face_verify_params != null) {
                jSONObject.put("face_verify_params", this.face_verify_params.toJson());
            }
            if (this.voucher_no_list != null && !this.voucher_no_list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.voucher_no_list.iterator();
                while (it.hasNext()) {
                    try {
                        jSONArray.put(it.next());
                    } catch (Exception unused) {
                    }
                }
                jSONObject.put("voucher_no_list", jSONArray);
            }
            if (this.exts != null) {
                jSONObject.put("exts", this.exts);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private JSONObject mapToJSONObj(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
