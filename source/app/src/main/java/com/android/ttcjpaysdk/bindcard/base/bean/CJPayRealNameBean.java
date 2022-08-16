package com.android.ttcjpaysdk.bindcard.base.bean;

import android.content.Context;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayRealNameBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isAuth;
    public boolean is_need_card_info;
    public String user_name = "";
    public String id_no = "";
    public String card_no = "";
    public String bank_mobile_no = "";
    public String bank_name = "";
    public String card_type = "";
    public String country = "";
    public CJPayBindCardCommonBean commonBean = new CJPayBindCardCommonBean();
    public String payUid = "";
    public boolean goSetPwd = false;
    public CJPaySecureRequestParams secure_request_params = new CJPaySecureRequestParams();
    public CJPayIdType id_type = CJPayIdType.MAINLAND;
    public String encryptedMobileNumber = "";
    public String activity_info = "";
    public boolean isUnionPay = false;
    public String end_page_url = "";

    static {
        Covode.recordClassIndex(7032);
    }

    public final String LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.card_type.equalsIgnoreCase("DEBIT")) {
            return context.getString(2131561593);
        }
        return context.getString(2131561571);
    }

    public final boolean LIZ(CJPayRealNameBean cJPayRealNameBean) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayRealNameBean}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayRealNameBean != null && this.user_name.equals(cJPayRealNameBean.user_name) && this.id_no.equals(cJPayRealNameBean.id_no) && this.card_no.equals(cJPayRealNameBean.card_no) && this.bank_mobile_no.equals(cJPayRealNameBean.bank_mobile_no) && this.bank_name.equals(cJPayRealNameBean.bank_name) && this.card_type.equals(cJPayRealNameBean.card_type) && this.country.equals(cJPayRealNameBean.country) && this.is_need_card_info == cJPayRealNameBean.is_need_card_info && this.payUid.equals(cJPayRealNameBean.payUid) && this.goSetPwd == cJPayRealNameBean.goSetPwd && this.isAuth == cJPayRealNameBean.isAuth) {
            return true;
        }
        return false;
    }
}
