package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayCreditPay implements CJPayObject, Serializable {
    public ArrayList<String> voucher_msg_list = new ArrayList<>();
    public ArrayList<CJPayCreditPayMethods> credit_pay_methods = new ArrayList<>();

    /* loaded from: classes17.dex */
    public static class CJPayCreditPayMethods implements CJPayObject, Serializable {
        public int fee;
        public int pay_amount_per_installment;
        public int total_amount_per_installment;
        public String status = "";
        public String msg = "";
        public String installment = "";
        public String voucher_fee_msg = "";
        public String voucher_platform_msg = "";
        public String icon_url = "";
        public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();

        static {
            Covode.recordClassIndex(8329);
        }
    }

    static {
        Covode.recordClassIndex(8328);
    }
}
