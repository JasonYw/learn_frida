package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayTwoAuthVerifyBean extends CJPayBindCardBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String additional_verify_type;
    public com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo button_info;
    public CJPayFaceVerifyInfo face_verify_info;
    public String sign_order_no;

    static {
        Covode.recordClassIndex(7038);
    }

    public CJPayTwoAuthVerifyBean() {
        this(null, null, null, null, 15, null);
    }

    public final boolean needFaceCheck() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.additional_verify_type, "live_detection");
    }

    public CJPayTwoAuthVerifyBean(com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo cJPayButtonInfo, String str, CJPayFaceVerifyInfo cJPayFaceVerifyInfo, String str2) {
        C106862S5w.LIZ(cJPayButtonInfo, cJPayFaceVerifyInfo, str2);
        this.button_info = cJPayButtonInfo;
        this.sign_order_no = str;
        this.face_verify_info = cJPayFaceVerifyInfo;
        this.additional_verify_type = str2;
    }

    public /* synthetic */ CJPayTwoAuthVerifyBean(com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo cJPayButtonInfo, String str, CJPayFaceVerifyInfo cJPayFaceVerifyInfo, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CJPayTwoAuthVerifyBean cJPayTwoAuthVerifyBean;
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo2 = cJPayFaceVerifyInfo;
        String str3 = str;
        com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo cJPayButtonInfo2 = (i & 1) != 0 ? new com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo() : cJPayButtonInfo;
        String str4 = "";
        str3 = (i & 2) != 0 ? str4 : str3;
        cJPayFaceVerifyInfo2 = (i & 4) != 0 ? new CJPayFaceVerifyInfo(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null) : cJPayFaceVerifyInfo2;
        if ((i & 8) != 0) {
            cJPayTwoAuthVerifyBean = this;
        } else {
            cJPayTwoAuthVerifyBean = this;
            str4 = str2;
        }
        new CJPayTwoAuthVerifyBean(cJPayButtonInfo2, str3, cJPayFaceVerifyInfo2, str4);
    }
}
