package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayAgreementService extends ICJPayService {
    static {
        Covode.recordClassIndex(6403);
    }

    void startCJPayAgreementActivity(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback);

    void startCJPayAgreementActivity(Context context, ArrayList<JSONObject> arrayList, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback);

    void startCJPayAgreementActivityWithHeight(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, ICJPayAgreementCallback iCJPayAgreementCallback);

    void startCJPayAgreementActivityWithHeight(Context context, ArrayList<JSONObject> arrayList, int i, boolean z, boolean z2, ICJPayAgreementCallback iCJPayAgreementCallback);
}
