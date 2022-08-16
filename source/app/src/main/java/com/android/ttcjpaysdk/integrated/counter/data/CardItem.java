package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CardItem implements CJPayObject, Serializable {
    public String bank_card_id;
    public String card_no;
    public String certificate_num;
    public String certificate_type;
    public String true_name;

    static {
        Covode.recordClassIndex(7560);
    }
}
