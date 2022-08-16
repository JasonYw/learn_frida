package com.android.ttcjpaysdk.base.service;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayIntegratedQrCodeService extends ICJPayService {
    static {
        Covode.recordClassIndex(6465);
    }

    Fragment getFragment();

    void release();

    void setCallBack(ICJPayIntegratedQrCodeServiceCallback iCJPayIntegratedQrCodeServiceCallback);

    void setOutAnim(int i);
}
