package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayMyBankCardResponseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public String msg = "";
    public String status = "";
    public String auth_action_url = "";
    public CJPayButtonInfo button_info = new CJPayButtonInfo();
    public boolean need_auth_guide = false;
    public boolean need_show_unbind = false;
    public CJPayMember member = new CJPayMember();
    public String unbind_url = "";
    public String bind_top_page_url = "";

    static {
        Covode.recordClassIndex(8745);
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
