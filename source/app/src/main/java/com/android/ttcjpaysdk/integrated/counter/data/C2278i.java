package com.android.ttcjpaysdk.integrated.counter.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137134ccM;
import p003X.C137244ce8;
import p003X.C137361cg1;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.data.i */
/* loaded from: classes17.dex */
public final class C2278i implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public C137361cg1 error = new C137361cg1();
    public String typecnt = "";
    public String process = "";
    public C137134ccM data = new C137134ccM();
    public String source = "";

    static {
        Covode.recordClassIndex(7595);
    }

    public final int getPayItemsShowNum() {
        return this.data.show_num;
    }

    public final C137244ce8 getBalancePayInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C137244ce8) proxy.result;
        }
        for (int i = 0; i < this.data.paytype_items.size(); i++) {
            C2276ae c2276ae = this.data.paytype_items.get(i);
            if ("bytepay".equals(c2276ae.ptcode)) {
                return c2276ae.paytype_item.paytype_info.balance;
            }
        }
        return null;
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
