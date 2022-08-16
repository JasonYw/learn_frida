package com.android.ttcjpaysdk.bindcard.quickbind.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayOneKeyQueryResponseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String status = "";
    public String code = "";
    public String msg = "";
    public String order_status = "";
    public String sign_no = "";
    public String token = "";
    public String bank_card_id = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();

    static {
        Covode.recordClassIndex(7243);
    }

    public boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.equals("MP000000", this.code) && !TextUtils.equals("CD000000", this.code)) {
            return false;
        }
        return true;
    }
}
