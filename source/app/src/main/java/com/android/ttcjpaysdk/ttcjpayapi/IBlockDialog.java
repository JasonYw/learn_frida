package com.android.ttcjpaysdk.ttcjpayapi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface IBlockDialog {

    /* loaded from: classes17.dex */
    public interface IDialogCallback {
        static {
            Covode.recordClassIndex(9285);
        }

        void onClose();
    }

    static {
        Covode.recordClassIndex(9284);
    }

    void showBlockDialog(Activity activity, boolean z, IDialogCallback iDialogCallback);
}
