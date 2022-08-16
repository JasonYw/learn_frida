package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C136292cOl;
import p003X.VBJ;

/* renamed from: com.android.ttcjpaysdk.thirdparty.data.n */
/* loaded from: classes17.dex */
public final class C2342n implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public String msg = "";
    public C136292cOl cashdesk_show_conf = new C136292cOl();
    public VBJ discount_info = new VBJ();
    public CJPayMerchantInfo merchant_info = new CJPayMerchantInfo();
    public CJPayPayTypeInfo paytype_info = new CJPayPayTypeInfo();
    public CJPayProcessInfo process_info = new CJPayProcessInfo();
    public CJPayUserInfo user_info = new CJPayUserInfo();
    public CJPayResultPageShowConf result_page_show_conf = new CJPayResultPageShowConf();

    static {
        Covode.recordClassIndex(8398);
    }

    public final boolean isAuth() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("1", this.user_info.auth_status);
    }
}
