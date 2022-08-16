package com.alipay.sdk.util;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class H5PayResultModel {
    public String resultCode;
    public String returnUrl;

    static {
        Covode.recordClassIndex(4953);
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }
}
