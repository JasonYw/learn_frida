package com.alipay.sdk.app;

import com.alipay.sdk.util.H5PayResultModel;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface H5PayCallback {
    static {
        Covode.recordClassIndex(4699);
    }

    void onPayResult(H5PayResultModel h5PayResultModel);
}
