package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ITTCJPayPhoneCarrierService {
    static {
        Covode.recordClassIndex(9295);
    }

    void getAuthToken(OnTTCJPayAuthTokenResult onTTCJPayAuthTokenResult);

    String getCurrentPhoneCarrier();

    void getMaskedPhoneInfo(OnTTCJPayMaskedPhoneResult onTTCJPayMaskedPhoneResult);
}
