package com.android.ttcjpaysdk.bindcard.base.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayButtonInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public int left_button_action;
    public int right_button_action;
    public String page_desc = "";
    public String button_desc = "";
    public String button_type = "";
    public String left_button_desc = "";
    public String right_button_desc = "";
    public String button_status = "";
    public String find_pwd_url = "";
    public String error_code = "";
    public String main_title = "";

    static {
        Covode.recordClassIndex(7023);
    }

    public boolean isGoCustomerServiceDialog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return hasAction(13);
    }

    public boolean isShow() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.button_status);
    }

    public com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo toStandardCJPayButtonInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo) proxy.result;
        }
        com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo cJPayButtonInfo = new com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo();
        cJPayButtonInfo.page_desc = this.page_desc;
        cJPayButtonInfo.button_desc = this.button_desc;
        cJPayButtonInfo.button_type = this.button_type;
        cJPayButtonInfo.action = this.action;
        cJPayButtonInfo.left_button_action = this.left_button_action;
        cJPayButtonInfo.left_button_desc = this.left_button_desc;
        cJPayButtonInfo.right_button_action = this.right_button_action;
        cJPayButtonInfo.right_button_desc = this.right_button_desc;
        cJPayButtonInfo.button_status = this.button_status;
        cJPayButtonInfo.error_code = this.error_code;
        cJPayButtonInfo.find_pwd_url = this.find_pwd_url;
        cJPayButtonInfo.main_title = this.main_title;
        return cJPayButtonInfo;
    }

    private boolean hasAction(int i) {
        if (this.action != i && this.left_button_action != i && this.right_button_action != i) {
            return false;
        }
        return true;
    }
}
