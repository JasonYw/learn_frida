package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPaySupplementarySignService extends ICJPayService {
    static {
        Covode.recordClassIndex(6494);
    }

    ICJPaySupplementarySignCallBack getCallBack();

    Fragment getFragment(int i, Bundle bundle, ICJPaySupplementarySignCallBack iCJPaySupplementarySignCallBack);

    boolean getIsQueryConnecting(Fragment fragment);

    void inOrOutWithAnimation(Fragment fragment, boolean z, boolean z2);

    void release();

    void startUpdateCardInfoActivity(Context context, JSONObject jSONObject, JSONObject jSONObject2, ICJPaySupplementarySignCallBack iCJPaySupplementarySignCallBack);
}
