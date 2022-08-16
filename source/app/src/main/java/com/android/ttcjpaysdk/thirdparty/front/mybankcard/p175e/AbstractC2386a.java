package com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e;

import com.android.ttcjpaysdk.base.p128d.p129b.AbstractC2125c;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPayMarketingBean;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPayMyBankCardResponseBean;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.mybankcard.e.a */
/* loaded from: classes17.dex */
public interface AbstractC2386a extends AbstractC2125c {
    static {
        Covode.recordClassIndex(8748);
    }

    void LIZ(CJPayMarketingBean cJPayMarketingBean);

    void LIZ(CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean, boolean z);

    void LIZ(JSONObject jSONObject);

    void LIZ(JSONObject jSONObject, boolean z);

    void LIZIZ();

    void LIZIZ(JSONObject jSONObject);

    void LIZJ();
}
