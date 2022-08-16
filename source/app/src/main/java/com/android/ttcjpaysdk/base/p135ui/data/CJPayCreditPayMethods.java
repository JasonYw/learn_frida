package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayCreditPayMethods */
/* loaded from: classes17.dex */
public class CJPayCreditPayMethods implements CJPayObject, Serializable {
    public boolean choose;
    public int fee;
    public int pay_amount_per_installment;
    public int total_amount_per_installment;
    public String status = "";
    public String msg = "";
    public String installment = "";
    public ArrayList<String> voucher_msg = new ArrayList<>();
    public String pay_type_desc = "";
    public String fee_desc = "";
    public String icon_url = "";
    public VoucherInfo voucher_info = new VoucherInfo();
    public String standard_show_amount = "";
    public String standard_rec_desc = "";

    static {
        Covode.recordClassIndex(6638);
    }
}
