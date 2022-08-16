package com.android.ttcjpaysdk.base.paymentbasis.common;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public class CJPayException extends Exception {
    public static final long serialVersionUID = 2553530176596096710L;
    public int mErrResId;

    static {
        Covode.recordClassIndex(6352);
    }

    public CJPayException(int i) {
        this.mErrResId = i;
    }
}
