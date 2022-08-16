package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.TwoElementAuth2Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class TwoElementAuth2Activity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6529);
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        TwoElementAuth2Activity twoElementAuth2Activity = (TwoElementAuth2Activity) obj2;
        if (bundle.getString("selectedCardType") == null) {
            string = twoElementAuth2Activity.LJFF;
        } else {
            string = bundle.getString("selectedCardType");
        }
        twoElementAuth2Activity.LJFF = string;
        if (bundle.getSerializable("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = twoElementAuth2Activity.LJI;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) bundle.getSerializable("two_element_order_data");
        }
        twoElementAuth2Activity.LJI = cJPayNameAndIdentifyCodeBillBean;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        TwoElementAuth2Activity twoElementAuth2Activity = (TwoElementAuth2Activity) obj2;
        bundle.putString("selectedCardType", twoElementAuth2Activity.LJFF);
        bundle.putSerializable("orderBean", twoElementAuth2Activity.LJI);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        TwoElementAuth2Activity twoElementAuth2Activity = (TwoElementAuth2Activity) obj2;
        if (twoElementAuth2Activity.getIntent().getStringExtra("selectedCardType") == null) {
            stringExtra = twoElementAuth2Activity.LJFF;
        } else {
            stringExtra = twoElementAuth2Activity.getIntent().getStringExtra("selectedCardType");
        }
        twoElementAuth2Activity.LJFF = stringExtra;
        if (twoElementAuth2Activity.getIntent().getSerializableExtra("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = twoElementAuth2Activity.LJI;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) twoElementAuth2Activity.getIntent().getSerializableExtra("two_element_order_data");
        }
        twoElementAuth2Activity.LJI = cJPayNameAndIdentifyCodeBillBean;
    }
}
