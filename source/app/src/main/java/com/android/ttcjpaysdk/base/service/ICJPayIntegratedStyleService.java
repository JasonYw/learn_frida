package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayIntegratedStyleService extends ICJPayService {
    static {
        Covode.recordClassIndex(6467);
    }

    Object getConfirmAdapter(Context context);

    Object getConfirmWrapper(View view);

    Object getMethodAdapter(Context context);

    Object getMethodWrapper(View view);
}
