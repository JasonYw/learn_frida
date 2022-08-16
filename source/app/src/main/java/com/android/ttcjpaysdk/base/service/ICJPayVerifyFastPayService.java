package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyFastPayService extends ICJPayService {
    static {
        Covode.recordClassIndex(6502);
    }

    String getCheckList();

    boolean hasShownKeepDialog();

    void initVerifyComponents(Context context, int i, ICJPayVerifyFastPayParamsCallBack iCJPayVerifyFastPayParamsCallBack, ICJPayVerifyFastPayResultCallBack iCJPayVerifyFastPayResultCallBack);

    boolean isEmpty();

    boolean onBackPressed();

    void release();

    void setHashShownKeepDialog();

    void setPayMethod(String str);

    void start(String str, int i, int i2, boolean z);

    boolean whenBackPressedExit();
}
