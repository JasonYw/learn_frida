package com.android.ttcjpaysdk.thirdparty.front.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class FrontPaymentMethodInfo implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isChecked;
    public boolean isLoading;
    public boolean isShowLoading;
    public boolean is_hide_merge_guide_section;
    public boolean show_combine_pay;
    public int index = -1;
    public String icon_url = "";
    public String status = "";
    public String title = "";
    public String sub_title = "";
    public String sub_title_color = "";
    public String sub_title_icon = "";
    public String mark = "";
    public String card_no = "";
    public String bank_card_id = "";
    public String front_bank_code = "";
    public String front_bank_code_name = "";
    public String card_no_mask = "";
    public String paymentType = "";
    public String need_pwd = "";
    public String need_send_sms = "";
    public String mobile_mask = "";
    public int card_level = -1;
    public String tt_mark = "";
    public String tt_title = "";
    public String tt_sub_title = "";
    public String tt_sub_title_icon = "";
    public String tt_icon_url = "";
    public CJPayCard card = new CJPayCard();
    public ArrayList<CJPayUserAgreement> user_agreement = new ArrayList<>();
    public String account = "";
    public String card_type_name = "";
    public boolean is_hide_cards = false;
    public MergedTypeDetailSectionStatus mergedTypeDetailSectionStatus = MergedTypeDetailSectionStatus.INIT_STATUS;
    public ArrayList<String> voucher_msg_list = new ArrayList<>();
    public CJPayVoucherInfo voucher_info = new CJPayVoucherInfo();
    public String identity_verify_way = "";
    public ArrayList<FrontPaymentMethodInfo> subMethodInfo = new ArrayList<>();
    public String card_add_ext = "";

    static {
        Covode.recordClassIndex(8651);
    }

    public final boolean isCardInactive() {
        if (this.card_level == 2) {
            return true;
        }
        return false;
    }

    /* loaded from: classes17.dex */
    public enum MergedTypeDetailSectionStatus {
        INIT_STATUS,
        COLLAPSE_STATUS,
        EXPAND_STATUS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MergedTypeDetailSectionStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (MergedTypeDetailSectionStatus[]) proxy.result;
            }
            return (MergedTypeDetailSectionStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(8652);
        }

        public static MergedTypeDetailSectionStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (MergedTypeDetailSectionStatus) proxy.result;
            }
            return (MergedTypeDetailSectionStatus) Enum.valueOf(MergedTypeDetailSectionStatus.class, str);
        }
    }

    public final boolean isCardAvailable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.status);
    }
}
