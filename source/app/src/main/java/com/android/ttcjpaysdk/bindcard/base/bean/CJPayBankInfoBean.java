package com.android.ttcjpaysdk.bindcard.base.bean;

import android.content.Context;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayBankInfoBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean is_support_one_key;
    public String bank_name = "";
    public String bank_code = "";
    public String card_type = "DEBIT";
    public String icon_url = "";
    public String icon_background = "";
    public String perpay_limit = "";
    public String perday_limit = "";
    public String display_icon = "";
    public String display_desc = "";
    public String card_type_chosen = "";
    public String bank_rank = "";
    public String rank_type = "";
    public String bankCardNum = "";
    public String uid = "";
    public HashMap<String, CJPayVoucherInfo> voucherInfoMap = new HashMap<>();
    public transient JSONObject voucher_info_map = new JSONObject();

    static {
        Covode.recordClassIndex(7016);
    }

    public String getCreditVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return getVoucher("CREDIT");
    }

    public String getDebitVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return getVoucher("DEBIT");
    }

    public String getUnionPayVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return getVoucher("UPYSFBANK");
    }

    public String getVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return getVoucher(this.card_type);
    }

    public HashMap<String, CJPayVoucherInfo> getVoucherInfoMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        setVoucherInfoMap();
        return this.voucherInfoMap;
    }

    public boolean isUnionPay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals("UPYSFBANK", this.bank_code);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVoucherInfoMap() {
        JSONObject jSONObject;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported && this.voucherInfoMap.isEmpty() && (jSONObject = this.voucher_info_map) != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.voucherInfoMap.put(next, CJPayJsonParser.fromJson(this.voucher_info_map.optJSONObject(next), CJPayVoucherInfo.class));
            }
        }
    }

    public String getCardBinVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        setVoucherInfoMap();
        if (this.voucherInfoMap.get("CREDIT") != null && !TextUtils.isEmpty(this.voucherInfoMap.get("CREDIT").bin_voucher_msg)) {
            return this.voucherInfoMap.get("CREDIT").bin_voucher_msg;
        }
        if (this.voucherInfoMap.get("DEBIT") != null && !TextUtils.isEmpty(this.voucherInfoMap.get("DEBIT").bin_voucher_msg)) {
            return this.voucherInfoMap.get("DEBIT").bin_voucher_msg;
        }
        return "";
    }

    public String getFuseVoucher() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        setVoucherInfoMap();
        if (this.voucherInfoMap.get("DEBIT") != null) {
            if (!TextUtils.isEmpty(this.voucherInfoMap.get("DEBIT").home_page_voucher_msg)) {
                return this.voucherInfoMap.get("DEBIT").home_page_voucher_msg;
            }
            return "";
        } else if (this.voucherInfoMap.get("CREDIT") != null && !TextUtils.isEmpty(this.voucherInfoMap.get("CREDIT").home_page_voucher_msg)) {
            return this.voucherInfoMap.get("CREDIT").home_page_voucher_msg;
        } else {
            return "";
        }
    }

    public String getCardBinInfo(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.bank_name.concat(getCardTypeStr(context));
    }

    public String getVoucher(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        setVoucherInfoMap();
        if (this.voucherInfoMap.get(str) != null && !TextUtils.isEmpty(this.voucherInfoMap.get(str).voucher_msg)) {
            return this.voucherInfoMap.get(str).voucher_msg;
        }
        return "";
    }

    public String getCardTypeStr(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context != null) {
            if ("DEBIT".equalsIgnoreCase(this.card_type)) {
                return context.getResources().getString(2131561593);
            }
            if ("CREDIT".equalsIgnoreCase(this.card_type)) {
                return context.getResources().getString(2131561571);
            }
            if ("UPYSFBANK".equalsIgnoreCase(this.card_type)) {
                return context.getResources().getString(2131562004);
            }
            return "";
        }
        return "";
    }
}
