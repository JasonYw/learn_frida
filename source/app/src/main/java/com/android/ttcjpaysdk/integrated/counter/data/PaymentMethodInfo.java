package com.android.ttcjpaysdk.integrated.counter.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.C2176e;
import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.android.ttcjpaysdk.base.p135ui.data.VoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import p003X.C137205cdV;

/* loaded from: classes17.dex */
public class PaymentMethodInfo implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public C2176e icon_tips;
    public boolean isShowLoading;
    public RetainInfo retainInfo;
    public boolean show_combine_pay;
    public int index = -1;
    public String icon_url = "";
    public String status = "";
    public String title = "";
    public String sub_title = "";
    public String sub_title_color = "";
    public String sub_title_icon = "";
    public String mark = "";
    public ArrayList<String> mark_array = new ArrayList<>();
    public String tips_msg = "";
    public String card_no = "";
    public String bank_card_id = "";
    public String front_bank_code = "";
    public String front_bank_code_name = "";
    public String card_no_mask = "";
    public boolean isChecked = false;
    public boolean isLoading = false;
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
    public boolean is_hide_merge_guide_section = false;
    public C2277d card = new C2277d();
    public ArrayList<UserAgreement> user_agreement = new ArrayList<>();
    public String account = "";
    public String card_type_name = "";
    public boolean is_hide_cards = false;
    public MergedTypeDetailSectionStatus mergedTypeDetailSectionStatus = MergedTypeDetailSectionStatus.INIT_STATUS;
    public VoucherInfo voucher_info = new VoucherInfo();
    public ArrayList<String> voucher_msg_list = new ArrayList<>();
    public String identity_verify_way = "";
    public ArrayList<PaymentMethodInfo> subMethodInfo = new ArrayList<>();
    public String card_add_ext = "";
    public C137205cdV pay_type_data = new C137205cdV();
    public String split_Line_text = "";
    public String standardRecDesc = "";
    public String standardShowAmount = "";

    static {
        Covode.recordClassIndex(7563);
    }

    public boolean isCardInactive() {
        if (this.card_level == 2) {
            return true;
        }
        return false;
    }

    /* loaded from: classes17.dex */
    public enum IdentityVerifyType {
        NoPwd(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, "免密支付");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String desc;
        public String value;

        static {
            Covode.recordClassIndex(7564);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static IdentityVerifyType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (IdentityVerifyType[]) proxy.result;
            }
            return (IdentityVerifyType[]) values().clone();
        }

        public static IdentityVerifyType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (IdentityVerifyType) proxy.result;
            }
            return (IdentityVerifyType) Enum.valueOf(IdentityVerifyType.class, str);
        }

        IdentityVerifyType(String str, String str2) {
            this.value = str;
            this.desc = str2;
        }
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
            Covode.recordClassIndex(7565);
        }

        public static MergedTypeDetailSectionStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (MergedTypeDetailSectionStatus) proxy.result;
            }
            return (MergedTypeDetailSectionStatus) Enum.valueOf(MergedTypeDetailSectionStatus.class, str);
        }
    }

    public boolean isCardAvailable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.status);
    }

    public boolean isUnionPay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("UPYSFBANK", this.card_type_name);
    }

    public void disableUnionPayBindCard(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        this.status = "0";
        this.sub_title = str;
        this.voucher_msg_list.clear();
        this.voucher_info.vouchers_label = "";
    }
}
