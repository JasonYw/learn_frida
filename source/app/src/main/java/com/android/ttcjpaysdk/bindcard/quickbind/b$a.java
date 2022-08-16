package com.android.ttcjpaysdk.bindcard.quickbind;

import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayVerifyLiveDetectBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeyQueryResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignBankUrlResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignOrderResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.C2341h;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface b$a extends AbstractC2125c {
    static {
        Covode.recordClassIndex(7235);
    }

    void onCreateQuickBindOrderFail(String str, String str2);

    void onCreateQuickBindOrderSuccess(CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean);

    void onFaceVerifyFail(String str, String str2, C2341h c2341h);

    void onFaceVerifySuccess(CJPayVerifyLiveDetectBean cJPayVerifyLiveDetectBean, C2341h c2341h);

    void onGetQuickBindBankUrlFail(String str, String str2);

    void onGetQuickBindBankUrlSuccess(CJPayOneKeySignBankUrlResponseBean cJPayOneKeySignBankUrlResponseBean);

    void onQueryQuickBindResultFail(CJPayOneKeyQueryResponseBean cJPayOneKeyQueryResponseBean);

    void onQueryQuickBindResultSuccess(CJPayOneKeyQueryResponseBean cJPayOneKeyQueryResponseBean);
}
