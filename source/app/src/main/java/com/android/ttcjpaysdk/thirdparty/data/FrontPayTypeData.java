package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCreditPayMethods;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayPayInfo;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class FrontPayTypeData implements CJPayObject, Serializable {
    public int balance_amount;
    public int freezed_amount;
    public boolean show_combine_pay;
    public String bank_card_id = "";
    public String card_no = "";
    public String card_no_mask = "";
    public String card_type = "";
    public String card_type_name = "";
    public String true_name_mask = "";
    public String certificate_num_mask = "";
    public String certificate_type = "";
    public String mobile_mask = "";
    public String icon_url = "";
    public int card_level = -1;
    public String perday_limit = "";
    public String perpay_limit = "";
    public String bank_code = "";
    public String sign_no = "";
    public String bank_name = "";
    public String card_show_name = "";
    public String card_add_ext = "";
    public ArrayList<String> voucher_msg_list = new ArrayList<>();
    public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();
    public ArrayList<CJPayCreditPayMethods> credit_pay_methods = new ArrayList<>();
    public boolean is_credit_activate = false;
    public int recommend_type = 0;
    public ArrayList<CJPayPayInfo.CombineShowInfo> combine_show_info = new ArrayList<>();
    public CombinePayInfo combine_pay_info = new CombinePayInfo();

    /* loaded from: classes17.dex */
    public static class CombinePayInfo implements CJPayObject, Serializable {
        public ArrayList<String> voucher_msg_list = new ArrayList<>();
        public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();

        static {
            Covode.recordClassIndex(8372);
        }
    }

    static {
        Covode.recordClassIndex(8371);
    }

    public boolean isCardInactive() {
        if (this.card_level == 2) {
            return true;
        }
        return false;
    }
}
