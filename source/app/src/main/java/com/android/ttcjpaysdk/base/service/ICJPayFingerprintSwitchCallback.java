package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayFingerprintSwitchCallback {
    static {
        Covode.recordClassIndex(6440);
    }

    void onResult(boolean z, boolean z2, String str, int i);
}
