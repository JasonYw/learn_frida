package com.android.ttcjpaysdk.thirdparty.balance.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeQueryResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class CJPayBalanceTradeQueryResponseBean extends CJPayTradeQueryResponseBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CJPayBalanceTradeInfo trade_info = new CJPayBalanceTradeInfo();

    static {
        Covode.recordClassIndex(7981);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("CD000000", this.code);
    }
}
