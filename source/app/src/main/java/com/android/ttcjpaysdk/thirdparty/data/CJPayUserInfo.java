package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayUserInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String auth_status;
    public long balance_amount;
    public boolean has_signed_cards;
    public boolean is_new_user;
    public int member_pay_id_state;
    public boolean need_auth_guide;
    public boolean need_complete_user_info;
    public boolean pay_after_use_active;
    public String auth_url = "";
    public String lynx_auth_url = "";
    public String certificate_num = "";
    public String certificate_type = "";
    public String m_name = "";
    public String mobile = "";
    public String mid = "";
    public String uid = "";
    public String find_pwd_url = "";
    public String declive_url = "";
    public String pwd_check_way = "";
    public String pay_uid = "";
    public String complete_hint_title = "";
    public String complete_url = "";
    public String real_check_type = "";

    static {
        Covode.recordClassIndex(8366);
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
            jSONObject.put("auth_url", this.auth_url);
            jSONObject.put("certificate_num", this.certificate_num);
            jSONObject.put("certificate_type", this.certificate_type);
            jSONObject.put("m_name", this.m_name);
            jSONObject.put("mobile", this.mobile);
            jSONObject.put("mid", this.mid);
            jSONObject.put("uid", this.uid);
            jSONObject.put("find_pwd_url", this.find_pwd_url);
            jSONObject.put("declive_url", this.declive_url);
            jSONObject.put("pwd_check_way", this.pwd_check_way);
            jSONObject.put("balance_amount", this.balance_amount);
            jSONObject.put("pay_uid", this.pay_uid);
            jSONObject.put("pay_after_use_active", this.pay_after_use_active);
            jSONObject.put("has_signed_cards", this.has_signed_cards);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
