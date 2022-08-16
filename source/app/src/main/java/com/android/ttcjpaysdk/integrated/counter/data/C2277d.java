package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.VoucherInfo;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.data.d */
/* loaded from: classes17.dex */
public final class C2277d implements CJPayObject {
    public boolean route_available;
    public String status = "";
    public String msg = "";
    public String mark = "";
    public String card_no = "";
    public String bank_code = "";
    public String card_no_tail = "";
    public String route_id = "";
    public String bank_name = "";
    public String sign_no = "";
    public String bank_card_id = "";
    public String card_no_mask = "";
    public String card_type = "";
    public String card_type_name = "";
    public String front_bank_code = "";
    public String true_name_mask = "";
    public String front_bank_code_name = "";
    public String mobile_mask = "";
    public String certificate_code_mask = "";
    public String certificate_num_mask = "";
    public String certificate_type = "";
    public String need_pwd = "";
    public String need_send_sms = "";
    public String need_repaire = "";
    public String icon_url = "";
    public int card_level = -1;
    public ArrayList<UserAgreement> user_agreement = new ArrayList<>();
    public boolean is_freeze_card = false;
    public String perday_limit = "";
    public String perpay_limit = "";
    public String start_color = "";
    public String end_color = "";
    public String quickpay_mark = "";
    public String identity_verify_way = "";
    public VoucherInfo voucher_info = new VoucherInfo();

    static {
        Covode.recordClassIndex(7587);
    }

    public final boolean isCardInactive() {
        if (this.card_level == 2) {
            return true;
        }
        return false;
    }
}
