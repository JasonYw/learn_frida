package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPaySupportBankBean extends CJPayBindCardBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<CJPayBankInfoBean> debit_banks = new ArrayList<>();
    public ArrayList<CJPayBankInfoBean> credit_banks = new ArrayList<>();
    public ArrayList<CJPayBankInfoBean> one_key_banks = new ArrayList<>();
    public CJPayKeepDialogBean retention_msg = new CJPayKeepDialogBean();
    public CJPayOneKeyCopyWritingInfo one_key_copywriting_info = new CJPayOneKeyCopyWritingInfo();
    public CJPayOneKeyCopyWritingInfo card_bind_copywriting_info = new CJPayOneKeyCopyWritingInfo();
    public ArrayList<String> card_bin_vouchers = new ArrayList<>();
    public String voucher_msg = "";
    public String voucher_bank = "";
    public String platform_voucher_msg = "";
    public int one_key_banks_lenth = 6;
    public ArrayList<CJPayBankInfoBean> recommend_banks = new ArrayList<>();
    public CJPayBankInfoBean voucher_bank_info = new CJPayBankInfoBean();
    public CJPayOneKeyCopyWritingInfo card_no_input_copywriting_info = new CJPayOneKeyCopyWritingInfo();
    public SupportBankExts exts = new SupportBankExts();

    /* loaded from: classes17.dex */
    public static class SupportBankExts implements CJPayObject, Serializable {
        public String search_card_no = "";
        public String use_order_info_test = "0";
        public String one_key_bank_order_test = "0";

        static {
            Covode.recordClassIndex(7037);
        }
    }

    static {
        Covode.recordClassIndex(7036);
    }

    public boolean isSupportDebitAndCreditCards() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.credit_banks.isEmpty() || this.debit_banks.isEmpty()) {
            return false;
        }
        return true;
    }
}
