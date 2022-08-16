package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPayMerchantInfo implements CJPayObject, Serializable {
    public int ext_uid_type;
    public String merchant_id = "";
    public String merchant_name = "";
    public String app_id = "";
    public String jh_merchant_id = "";
    public String jh_app_id = "";

    static {
        Covode.recordClassIndex(8337);
    }
}
