package com.android.ttcjpaysdk.bindcard.base.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class QuickBindCardAdapterBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean authorizeClicked;
    public String bankCode;
    public String bankIconUrl;
    public String bankName;
    public String bank_rank;
    public String cardBinVoucher;
    public String cardType;
    public CJPayOneKeyCopyWritingInfo card_copywriting_info;
    public String card_type_chosen;
    public String creditVoucher;
    public String debitVoucher;
    public String descLable;
    public String display_desc;
    public String display_icon;
    public String fuseVoucher;
    public boolean hasPassword;
    public String iconBackground;
    public boolean isAuth;
    public Boolean isJumpOneKeySign;
    public boolean isLoading;
    public boolean isNeedCardInfo;
    public boolean isNeedShowAuth;
    public boolean is_support_one_key;
    public String mobileMask;
    public boolean needAuthGuide;
    public String rank_type;
    public String smchId;
    public String unionPayVoucher;
    public String use_order_info_test;
    public HashMap<String, CJPayVoucherInfo> voucher_info_map;

    static {
        Covode.recordClassIndex(7040);
    }

    public boolean isBindCardNotPay() {
        return this.isNeedCardInfo;
    }

    public boolean isBindCardThenPay() {
        if (!this.isNeedCardInfo) {
            return true;
        }
        return false;
    }

    public boolean isUnionPay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("UPYSFBANK", this.bankCode);
    }

    public QuickBindCardAdapterBean() {
        this.bankIconUrl = "";
        this.bankName = "";
        this.bankCode = "";
        this.cardType = "";
        this.iconBackground = "";
        this.descLable = "";
        this.smchId = "";
        this.mobileMask = "";
        this.isNeedShowAuth = true;
        this.debitVoucher = "";
        this.creditVoucher = "";
        this.unionPayVoucher = "";
        this.fuseVoucher = "";
        this.cardBinVoucher = "";
        this.display_icon = "";
        this.display_desc = "";
        this.voucher_info_map = new HashMap<>();
        this.card_copywriting_info = new CJPayOneKeyCopyWritingInfo();
        this.card_type_chosen = "";
        this.bank_rank = "";
        this.rank_type = "";
        this.isJumpOneKeySign = Boolean.FALSE;
        this.is_support_one_key = false;
        this.use_order_info_test = "0";
    }

    public boolean hasVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.debitVoucher) && TextUtils.isEmpty(this.creditVoucher) && TextUtils.isEmpty(this.unionPayVoucher) && TextUtils.isEmpty(this.fuseVoucher) && TextUtils.isEmpty(this.cardBinVoucher)) {
            return false;
        }
        return true;
    }

    public QuickBindCardAdapterBean(CJPayCardAddBean cJPayCardAddBean) {
        this.bankIconUrl = "";
        this.bankName = "";
        this.bankCode = "";
        this.cardType = "";
        this.iconBackground = "";
        this.descLable = "";
        this.smchId = "";
        this.mobileMask = "";
        this.isNeedShowAuth = true;
        this.debitVoucher = "";
        this.creditVoucher = "";
        this.unionPayVoucher = "";
        this.fuseVoucher = "";
        this.cardBinVoucher = "";
        this.display_icon = "";
        this.display_desc = "";
        this.voucher_info_map = new HashMap<>();
        this.card_copywriting_info = new CJPayOneKeyCopyWritingInfo();
        this.card_type_chosen = "";
        this.bank_rank = "";
        this.rank_type = "";
        this.isJumpOneKeySign = Boolean.FALSE;
        this.is_support_one_key = false;
        this.use_order_info_test = "0";
        this.bankName = cJPayCardAddBean.url_params.one_key_bank_info.bank_name;
        this.bankCode = cJPayCardAddBean.url_params.one_key_bank_info.bank_code;
        this.bankIconUrl = cJPayCardAddBean.url_params.one_key_bank_info.icon_url;
        this.iconBackground = cJPayCardAddBean.url_params.one_key_bank_info.icon_background;
        this.cardType = cJPayCardAddBean.url_params.one_key_bank_info.card_type;
        this.debitVoucher = cJPayCardAddBean.url_params.one_key_bank_info.getDebitVoucher();
        this.creditVoucher = cJPayCardAddBean.url_params.one_key_bank_info.getCreditVoucher();
        this.fuseVoucher = cJPayCardAddBean.url_params.one_key_bank_info.getFuseVoucher();
        this.cardBinVoucher = cJPayCardAddBean.url_params.one_key_bank_info.getCardBinVoucher();
        this.voucher_info_map = cJPayCardAddBean.url_params.one_key_bank_info.getVoucherInfoMap();
        this.hasPassword = cJPayCardAddBean.url_params.isSetPwd();
        this.smchId = cJPayCardAddBean.url_params.smch_id;
        this.isNeedCardInfo = cJPayCardAddBean.isNeedCardInfo;
        this.isAuth = cJPayCardAddBean.url_params.isAuth();
        this.card_type_chosen = cJPayCardAddBean.url_params.one_key_bank_info.card_type_chosen;
        this.isJumpOneKeySign = Boolean.valueOf(cJPayCardAddBean.url_params.jump_one_key_sign.equals("1"));
        this.display_icon = cJPayCardAddBean.url_params.one_key_bank_info.display_icon;
        this.display_desc = cJPayCardAddBean.url_params.one_key_bank_info.display_desc;
    }
}
