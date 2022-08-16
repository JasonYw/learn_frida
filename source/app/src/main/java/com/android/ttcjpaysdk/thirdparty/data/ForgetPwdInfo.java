package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class ForgetPwdInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String action = "";
    public String desc = "";
    public int times = -1;
    public String show_style = "";

    static {
        Covode.recordClassIndex(8370);
    }

    public boolean isNewStyle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!"next_to_tips".equals(this.show_style) && !"top_right".equals(this.show_style)) {
            return false;
        }
        return true;
    }
}
