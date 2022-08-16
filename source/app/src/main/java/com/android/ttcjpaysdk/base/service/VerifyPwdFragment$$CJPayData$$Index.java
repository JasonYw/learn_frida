package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.p142ui.VerifyPwdFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class VerifyPwdFragment$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6534);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        VerifyPwdFragment verifyPwdFragment;
        Bundle arguments;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported || (arguments = (verifyPwdFragment = (VerifyPwdFragment) obj2).getArguments()) == null) {
            return;
        }
        verifyPwdFragment.isQuickBind = arguments.getBoolean("isQuickBind", verifyPwdFragment.isQuickBind);
        if (arguments.getString("voucher_info_str") == null) {
            string = verifyPwdFragment.voucherInfoStr;
        } else {
            string = arguments.getString("voucher_info_str");
        }
        verifyPwdFragment.voucherInfoStr = string;
        if (arguments.getString("title") == null) {
            string2 = verifyPwdFragment.title;
        } else {
            string2 = arguments.getString("title");
        }
        verifyPwdFragment.title = string2;
        if (arguments.getString("subTitle") == null) {
            string3 = verifyPwdFragment.subTitle;
        } else {
            string3 = arguments.getString("subTitle");
        }
        verifyPwdFragment.subTitle = string3;
        if (arguments.getString("smchId") == null) {
            string4 = verifyPwdFragment.smchId;
        } else {
            string4 = arguments.getString("smchId");
        }
        verifyPwdFragment.smchId = string4;
        if (arguments.getString("orderNo") == null) {
            string5 = verifyPwdFragment.orderNo;
        } else {
            string5 = arguments.getString("orderNo");
        }
        verifyPwdFragment.orderNo = string5;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        VerifyPwdFragment verifyPwdFragment = (VerifyPwdFragment) obj2;
        verifyPwdFragment.isQuickBind = bundle.getBoolean("isQuickBind");
        if (bundle.getString("voucher_info_str") == null) {
            string = verifyPwdFragment.voucherInfoStr;
        } else {
            string = bundle.getString("voucher_info_str");
        }
        verifyPwdFragment.voucherInfoStr = string;
        if (bundle.getString("title") == null) {
            string2 = verifyPwdFragment.title;
        } else {
            string2 = bundle.getString("title");
        }
        verifyPwdFragment.title = string2;
        if (bundle.getString("subTitle") == null) {
            string3 = verifyPwdFragment.subTitle;
        } else {
            string3 = bundle.getString("subTitle");
        }
        verifyPwdFragment.subTitle = string3;
        if (bundle.getString("smchId") == null) {
            string4 = verifyPwdFragment.smchId;
        } else {
            string4 = bundle.getString("smchId");
        }
        verifyPwdFragment.smchId = string4;
        if (bundle.getString("orderNo") == null) {
            string5 = verifyPwdFragment.orderNo;
        } else {
            string5 = bundle.getString("orderNo");
        }
        verifyPwdFragment.orderNo = string5;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        VerifyPwdFragment verifyPwdFragment = (VerifyPwdFragment) obj2;
        bundle.putBoolean("isQuickBind", verifyPwdFragment.isQuickBind);
        bundle.putString("voucher_info_str", verifyPwdFragment.voucherInfoStr);
        bundle.putString("title", verifyPwdFragment.title);
        bundle.putString("subTitle", verifyPwdFragment.subTitle);
        bundle.putString("smchId", verifyPwdFragment.smchId);
        bundle.putString("orderNo", verifyPwdFragment.orderNo);
    }
}
