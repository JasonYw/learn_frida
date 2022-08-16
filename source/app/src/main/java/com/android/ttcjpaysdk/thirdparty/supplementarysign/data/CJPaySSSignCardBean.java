package com.android.ttcjpaysdk.thirdparty.supplementarysign.data;

import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPaySSSignCardBean extends CJPaySSBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String sign_no = "";
    public String bank_card_id = "";
    public String pwd_token = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public CJPayCard card_info = new CJPayCard();

    static {
        Covode.recordClassIndex(8844);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "CJPaySmsSignResponse{, code='" + this.code + "', msg='" + this.msg + "', sign_no='" + this.sign_no + "', bank_card_id='" + this.bank_card_id + "', pwd_token='" + this.pwd_token + "'}";
    }
}
