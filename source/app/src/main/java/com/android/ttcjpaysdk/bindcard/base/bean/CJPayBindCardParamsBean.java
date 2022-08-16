package com.android.ttcjpaysdk.bindcard.base.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayBindCardParamsBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String allow_trans_card_type = "1";
    public String sign_order_no = "";
    public String pay_uid = "";
    public String smch_id = "";
    public String is_set_pwd = "";
    public String is_authed = "";
    public String id_name_mask = "";
    public String mobile_mask = "";
    public String id_type = "";
    public String id_code_mask = "";
    public String app_id = "";
    public String merchant_id = "";
    public String sign = "";
    public String uid_mobile_mask = "";
    public String skip_pwd = "";
    public String jump_one_key_sign = "";
    public CJPayOneKeyCopyWritingInfo card_copywriting_info = new CJPayOneKeyCopyWritingInfo();
    public CJPayBankInfoBean one_key_bank_info = new CJPayBankInfoBean();
    public String ab_version = "";

    static {
        Covode.recordClassIndex(7019);
    }

    public boolean isAuth() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.is_authed);
    }

    public boolean isSetPwd() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.is_set_pwd);
    }
}
