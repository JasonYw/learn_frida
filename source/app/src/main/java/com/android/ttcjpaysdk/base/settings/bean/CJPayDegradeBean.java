package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class CJPayDegradeBean implements CJPayObject, Serializable {
    public ArrayList<MerchantMapping> degrade_infos = new ArrayList<>();

    /* loaded from: classes17.dex */
    public static final class MerchantMapping implements CJPayObject, Serializable {
        public String bdpay_app_id;
        public String bdpay_merchant_id;
        public String cjpay_app_id;
        public String cjpay_merchant_id;
        public boolean is_balance_recharge_use_h5;
        public boolean is_balance_withdraw_use_h5;
        public boolean is_bdpay_use_h5;
        public boolean is_card_list_use_h5;
        public boolean is_pay_use_h5;

        static {
            Covode.recordClassIndex(6567);
        }
    }

    static {
        Covode.recordClassIndex(6566);
    }
}
