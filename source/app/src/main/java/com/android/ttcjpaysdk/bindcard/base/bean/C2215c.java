package com.android.ttcjpaysdk.bindcard.base.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.bean.c */
/* loaded from: classes17.dex */
public final class C2215c implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int remain_lock_time;
    public int remain_retry_count;
    public String status = "";
    public String code = "";
    public String msg = "";
    public String remain_lock_desc = "";
    public com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo button_info = new com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo();

    static {
        Covode.recordClassIndex(7043);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("MP000000", this.code);
    }
}
