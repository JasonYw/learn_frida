package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SelectBankCardTypeActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class SelectBankCardTypeActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6527);
    }

    public static void restoreData(Object obj, Object obj2) {
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        SelectBankCardTypeActivity selectBankCardTypeActivity = (SelectBankCardTypeActivity) obj2;
        if (bundle.getSerializable("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = selectBankCardTypeActivity.LJIJI;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) bundle.getSerializable("two_element_order_data");
        }
        selectBankCardTypeActivity.LJIJI = cJPayNameAndIdentifyCodeBillBean;
        selectBankCardTypeActivity.LJIJJ = bundle.getBoolean("close_notify");
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        SelectBankCardTypeActivity selectBankCardTypeActivity = (SelectBankCardTypeActivity) obj2;
        bundle.putSerializable("twoElementOrderBean", selectBankCardTypeActivity.LJIJI);
        bundle.putBoolean("close_notify", selectBankCardTypeActivity.LJIJJ);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        SelectBankCardTypeActivity selectBankCardTypeActivity = (SelectBankCardTypeActivity) obj2;
        if (selectBankCardTypeActivity.getIntent().getSerializableExtra("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = selectBankCardTypeActivity.LJIJI;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) selectBankCardTypeActivity.getIntent().getSerializableExtra("two_element_order_data");
        }
        selectBankCardTypeActivity.LJIJI = cJPayNameAndIdentifyCodeBillBean;
        selectBankCardTypeActivity.LJIJJ = selectBankCardTypeActivity.getIntent().getBooleanExtra("close_notify", selectBankCardTypeActivity.LJIJJ);
    }
}
