package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayInsufficientBalanceHintInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String msg = "";
    public String icon_url = "";
    public String status_msg = "";
    public FrontSubPayTypeInfo rec_pay_type = new FrontSubPayTypeInfo();
    public ArrayList<String> voucher_bank_icons = new ArrayList<>();
    public String button_text = "";
    public String sub_button_text = "";
    public String sub_status_msg = "";
    public RetainInfo retain_info = new RetainInfo();
    public String style = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();

    static {
        Covode.recordClassIndex(8334);
    }

    public Boolean isServerControl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(this.style));
    }

    public boolean hasCombinePay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.rec_pay_type.pay_type_data.combine_show_info.size() <= 0) {
            return false;
        }
        return true;
    }
}
