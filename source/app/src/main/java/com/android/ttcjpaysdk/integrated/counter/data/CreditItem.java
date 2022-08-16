package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public final class CreditItem implements CJPayObject, Serializable {
    public String credit_pay_installment = "";
    public String decision_id = "";

    static {
        Covode.recordClassIndex(7561);
    }
}
