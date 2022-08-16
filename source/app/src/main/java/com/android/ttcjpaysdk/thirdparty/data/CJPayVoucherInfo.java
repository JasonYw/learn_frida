package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes17.dex */
public class CJPayVoucherInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int vouchers_amount;
    public int vouchers_channel_num;
    public int vouchers_max_amount;
    public int vouchers_plat_num;
    public int vouchers_random_num;
    public int vouchers_used_amount;
    public String vouchers_label = "";
    public ArrayList<Voucher> vouchers = new ArrayList<>();
    public String voucher_msg = "";
    public String bin_voucher_msg = "";
    public String home_page_voucher_msg = "";

    /* loaded from: classes17.dex */
    public static class Voucher implements CJPayObject, Serializable {
        public int reduce_amount;
        public String voucher_no = "";
        public String voucher_type = "";
        public String label = "";
        public String batch_no = "";
        public String promotion_product_code = "";
        public String voucher_name = "";
        public String random_max_reduct_amount = "";
        public String used_amount = "";
        public String reached_amount = "";
        public String front_bank_code = "";

        static {
            Covode.recordClassIndex(8368);
        }
    }

    static {
        Covode.recordClassIndex(8367);
    }

    public JSONArray getVoucherNoList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONArray) proxy.result;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Voucher> it = this.vouchers.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().voucher_no);
        }
        return jSONArray;
    }
}
