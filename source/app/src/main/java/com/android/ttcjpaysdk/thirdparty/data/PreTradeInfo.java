package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class PreTradeInfo implements CJPayObject, Serializable {
    public String ext_param;
    public CJPayMerchantInfo merchant_info;
    public CJPayPayTypeInfo paytype_info;
    public CJPayProcessInfo promotion_process;
    public RetainInfo retain_info;
    public CJPayUserInfo user_info;

    static {
        Covode.recordClassIndex(8378);
    }

    public PreTradeInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public PreTradeInfo(CJPayMerchantInfo cJPayMerchantInfo, CJPayPayTypeInfo cJPayPayTypeInfo, CJPayUserInfo cJPayUserInfo, CJPayProcessInfo cJPayProcessInfo, RetainInfo retainInfo, String str) {
        C106862S5w.LIZ(cJPayMerchantInfo, cJPayPayTypeInfo, cJPayUserInfo, cJPayProcessInfo, retainInfo, str);
        this.merchant_info = cJPayMerchantInfo;
        this.paytype_info = cJPayPayTypeInfo;
        this.user_info = cJPayUserInfo;
        this.promotion_process = cJPayProcessInfo;
        this.retain_info = retainInfo;
        this.ext_param = str;
    }

    public /* synthetic */ PreTradeInfo(CJPayMerchantInfo cJPayMerchantInfo, CJPayPayTypeInfo cJPayPayTypeInfo, CJPayUserInfo cJPayUserInfo, CJPayProcessInfo cJPayProcessInfo, RetainInfo retainInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CJPayMerchantInfo() : cJPayMerchantInfo, (i & 2) != 0 ? new CJPayPayTypeInfo() : cJPayPayTypeInfo, (i & 4) != 0 ? new CJPayUserInfo() : cJPayUserInfo, (i & 8) != 0 ? new CJPayProcessInfo() : cJPayProcessInfo, (i & 16) != 0 ? new RetainInfo(null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, 65535, null) : retainInfo, (i & 32) != 0 ? "" : str);
    }
}
