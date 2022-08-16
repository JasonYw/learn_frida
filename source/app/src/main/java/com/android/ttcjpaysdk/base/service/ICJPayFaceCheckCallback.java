package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayFaceCheckCallback {

    /* loaded from: classes17.dex */
    public interface ICJFaceDialogCallback extends ICJPayFaceCheckCallback {
        static {
            Covode.recordClassIndex(6428);
        }

        void onClickTryAgain();
    }

    static {
        Covode.recordClassIndex(6427);
    }

    void onGetTicket();
}
