package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SelectBankCardType2Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class SelectBankCardType2Activity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6526);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        SelectBankCardType2Activity selectBankCardType2Activity = (SelectBankCardType2Activity) obj2;
        if (selectBankCardType2Activity.getIntent().getSerializableExtra("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = selectBankCardType2Activity.LJIJ;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) selectBankCardType2Activity.getIntent().getSerializableExtra("two_element_order_data");
        }
        selectBankCardType2Activity.LJIJ = cJPayNameAndIdentifyCodeBillBean;
    }

    public static void restoreData(Object obj, Object obj2) {
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        SelectBankCardType2Activity selectBankCardType2Activity = (SelectBankCardType2Activity) obj2;
        if (bundle.getSerializable("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = selectBankCardType2Activity.LJIJ;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) bundle.getSerializable("two_element_order_data");
        }
        selectBankCardType2Activity.LJIJ = cJPayNameAndIdentifyCodeBillBean;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ((Bundle) obj).putSerializable("twoElementOrderBean", ((SelectBankCardType2Activity) obj2).LJIJ);
    }
}
