package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayNewCardCallback {
    static {
        Covode.recordClassIndex(6471);
    }

    JSONObject getPayNewCardConfigs();

    void showLoading(boolean z);
}
