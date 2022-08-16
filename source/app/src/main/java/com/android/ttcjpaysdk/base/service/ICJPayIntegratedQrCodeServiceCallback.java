package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayIntegratedQrCodeServiceCallback {
    static {
        Covode.recordClassIndex(6466);
    }

    void closeAll();

    void gotoCompleteFragment();
}
