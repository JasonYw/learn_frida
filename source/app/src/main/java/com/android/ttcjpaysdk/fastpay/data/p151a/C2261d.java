package com.android.ttcjpaysdk.fastpay.data.p151a;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C136991ca2;
import p003X.C137003caE;

/* renamed from: com.android.ttcjpaysdk.fastpay.data.a.d */
/* loaded from: classes17.dex */
public final class C2261d implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public C136991ca2 error = new C136991ca2();
    public C137003caE data = new C137003caE();
    public String process = "";

    static {
        Covode.recordClassIndex(7470);
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
