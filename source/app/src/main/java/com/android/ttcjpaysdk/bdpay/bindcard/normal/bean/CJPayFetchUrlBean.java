package com.android.ttcjpaysdk.bdpay.bindcard.normal.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBusiAuthorizeInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySignCardMapInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayFetchUrlBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public String msg = "";
    public CJPaySignCardMapInfo sign_card_map = new CJPaySignCardMapInfo();
    public CJPayBusiAuthorizeInfo busi_authorize_info = new CJPayBusiAuthorizeInfo();
    public String busi_authorize_info_str = "";
    public String end_page_url = "";

    static {
        Covode.recordClassIndex(6759);
    }

    public final String getBusi_authorize_info_str() {
        return this.busi_authorize_info_str;
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("UM0000", this.code);
    }

    public final CJPayCardAddBean toCardAddBean() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (CJPayCardAddBean) proxy.result;
        }
        CJPayCardAddBean cJPayCardAddBean = new CJPayCardAddBean();
        cJPayCardAddBean.busi_authorize_info = this.busi_authorize_info;
        if (!TextUtils.isEmpty(this.busi_authorize_info_str)) {
            cJPayCardAddBean.busi_authorize_info_str = this.busi_authorize_info_str;
        } else {
            JSONObject jsonObject = CJPayJsonParser.toJsonObject(this.busi_authorize_info);
            if (jsonObject != null) {
                cJPayCardAddBean.busi_authorize_info_str = jsonObject.toString();
            }
        }
        cJPayCardAddBean.url_params.is_authed = this.sign_card_map.is_authed;
        cJPayCardAddBean.url_params.is_set_pwd = this.sign_card_map.is_set_pwd;
        cJPayCardAddBean.url_params.sign_order_no = this.sign_card_map.member_biz_order_no;
        cJPayCardAddBean.url_params.id_name_mask = this.sign_card_map.id_name_mask;
        cJPayCardAddBean.url_params.mobile_mask = this.sign_card_map.mobile_mask;
        cJPayCardAddBean.url_params.smch_id = this.sign_card_map.smch_id;
        cJPayCardAddBean.url_params.one_key_bank_info = this.sign_card_map.one_key_bank_info;
        cJPayCardAddBean.url_params.uid_mobile_mask = this.sign_card_map.uid_mobile_mask;
        cJPayCardAddBean.url_params.mobile_mask = this.sign_card_map.mobile_mask;
        cJPayCardAddBean.url_params.skip_pwd = this.sign_card_map.skip_pwd;
        cJPayCardAddBean.url_params.id_type = this.sign_card_map.id_type;
        cJPayCardAddBean.goSetPwd = !Intrinsics.areEqual("1", this.sign_card_map.is_set_pwd);
        cJPayCardAddBean.url_params.allow_trans_card_type = this.sign_card_map.allow_trans_card_type;
        cJPayCardAddBean.end_page_url = this.end_page_url;
        return cJPayCardAddBean;
    }

    public final void setBusi_authorize_info_str(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.busi_authorize_info_str = str;
    }
}
