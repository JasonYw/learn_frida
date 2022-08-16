package com.android.ttcjpaysdk.integrated.counter.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137354cfu;
import p003X.C137361cg1;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.data.k */
/* loaded from: classes17.dex */
public final class C2279k implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public C137361cg1 error = new C137361cg1();
    public String typecnt = "";
    public String process = "";
    public C137354cfu data = new C137354cfu();

    static {
        Covode.recordClassIndex(7597);
    }

    public final boolean isResponseOk() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.code) || !"CA0000".equals(this.code)) {
            return false;
        }
        return true;
    }
}
