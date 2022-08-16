package com.android.ttcjpaysdk.thirdparty.supplementarysign.data;

import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CJPaySSUpdateCardInfoBean implements Serializable {
    public boolean is_need_card_info;
    public String card_no = "";
    public String bank_mobile_no = "";
    public String bank_name = "";
    public String sign_order_no = "";
    public String smch_id = "";
    public String pay_uid = "";
    public String bank_card_id = "";
    public String pay_route_id = "";
    public CJPaySecureRequestParams secure_request_params = new CJPaySecureRequestParams();

    static {
        Covode.recordClassIndex(8845);
    }
}
