package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.VoucherInfo */
/* loaded from: classes17.dex */
public class VoucherInfo implements CJPayObject, Serializable {
    public long order_sub_fixed_voucher_amount;
    public String vouchers_label = "";
    public ArrayList<Voucher> vouchers = new ArrayList<>();
    public int vouchers_amount = 0;
    public int vouchers_max_amount = 0;
    public int vouchers_used_amount = 0;
    public int vouchers_channel_num = 0;
    public int vouchers_plat_num = 0;
    public int vouchers_random_num = 0;

    /* renamed from: com.android.ttcjpaysdk.base.ui.data.VoucherInfo$Voucher */
    /* loaded from: classes17.dex */
    public static class Voucher implements CJPayObject, Serializable {
        public int random_max_reduct_amount;
        public int reached_amount;
        public int reduce_amount;
        public int used_amount;
        public String voucher_no = "";
        public String batch_no = "";
        public String promotion_product_code = "";
        public String voucher_type = "";
        public String voucher_name = "";
        public String label = "";

        static {
            Covode.recordClassIndex(6652);
        }
    }

    static {
        Covode.recordClassIndex(6651);
    }
}
