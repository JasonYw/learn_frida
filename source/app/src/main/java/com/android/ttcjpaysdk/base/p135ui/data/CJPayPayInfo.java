package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayPayInfo */
/* loaded from: classes17.dex */
public class CJPayPayInfo implements CJPayObject {
    public String combine_type;
    public boolean is_credit_activate;
    public String primary_pay_type;
    public RetainInfo retain_info;
    public String business_scene = "";
    public String bank_card_id = "";
    public String credit_pay_installment = "";
    public String pay_amount_per_installment = "";
    public String origin_fee_per_installment = "";
    public String real_fee_per_installment = "";
    public ArrayList<String> voucher_no_list = new ArrayList<>();
    public String decision_id = "";
    public String real_trade_amount = "";
    public int real_trade_amount_raw = 0;
    public String origin_trade_amount = "";
    public String voucher_msg = "";
    public String credit_activate_url = "";
    public String voucher_type = "";
    public String pay_name = "";
    public String verify_type = "";
    public String verify_desc = "";
    public int verify_desc_type = 0;
    public String trade_desc = "";
    public String currency = "";
    public String pay_icon = "";
    public boolean has_random_discount = false;
    public ArrayList<CombineShowInfo> combine_show_info = new ArrayList<>();

    /* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayPayInfo$CombineShowInfo */
    /* loaded from: classes17.dex */
    public static class CombineShowInfo implements CJPayObject, Serializable {
        public String combine_type = "";
        public String combine_msg = "";

        static {
            Covode.recordClassIndex(6640);
        }
    }

    static {
        Covode.recordClassIndex(6639);
    }
}
