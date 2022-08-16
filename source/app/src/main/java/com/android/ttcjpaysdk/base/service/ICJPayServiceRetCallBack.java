package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayServiceRetCallBack {
    static {
        Covode.recordClassIndex(6490);
    }

    void onResult(String str, byte[] bArr);
}
