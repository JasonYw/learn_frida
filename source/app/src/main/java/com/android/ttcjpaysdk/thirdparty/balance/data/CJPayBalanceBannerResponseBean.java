package com.android.ttcjpaysdk.thirdparty.balance.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class CJPayBalanceBannerResponseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code = "";
    public String place_no = "";
    public ArrayList<CJPayBalanceUrlResourceInfo> resource_info_list = new ArrayList<>();

    static {
        Covode.recordClassIndex(7979);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("PP000000", this.code);
    }
}
