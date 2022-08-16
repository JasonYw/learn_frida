package com.android.ttcjpaysdk.thirdparty.supplementarysign.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPaySSBaseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String status = "";
    public String code = "";
    public String msg = "";

    static {
        Covode.recordClassIndex(8842);
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
