package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.TwoElementAuthActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class TwoElementAuthActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6530);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        TwoElementAuthActivity twoElementAuthActivity = (TwoElementAuthActivity) obj2;
        bundle.putSerializable("quickBindData", twoElementAuthActivity.LJIIIIZZ);
        bundle.putSerializable("orderBean", twoElementAuthActivity.LJIIIZ);
        bundle.putBoolean("isShowRealNameAuth", twoElementAuthActivity.LJIIJ);
        bundle.putBoolean("close_notify", twoElementAuthActivity.LJIIJJI);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        TwoElementAuthActivity twoElementAuthActivity = (TwoElementAuthActivity) obj2;
        twoElementAuthActivity.LJII = (ICJPayRealNameAuthService) CJPayServiceManager.getInstance().getIService(ICJPayRealNameAuthService.class);
        if (twoElementAuthActivity.getIntent().getSerializableExtra("quick_bind_data") == null) {
            quickBindCardAdapterBean = twoElementAuthActivity.LJIIIIZZ;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) twoElementAuthActivity.getIntent().getSerializableExtra("quick_bind_data");
        }
        twoElementAuthActivity.LJIIIIZZ = quickBindCardAdapterBean;
        if (twoElementAuthActivity.getIntent().getSerializableExtra("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = twoElementAuthActivity.LJIIIZ;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) twoElementAuthActivity.getIntent().getSerializableExtra("two_element_order_data");
        }
        twoElementAuthActivity.LJIIIZ = cJPayNameAndIdentifyCodeBillBean;
        twoElementAuthActivity.LJIIJ = twoElementAuthActivity.getIntent().getBooleanExtra("isShowRealNameAuth", twoElementAuthActivity.LJIIJ);
        twoElementAuthActivity.LJIIJJI = twoElementAuthActivity.getIntent().getBooleanExtra("close_notify", twoElementAuthActivity.LJIIJJI);
    }

    public static void restoreData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        TwoElementAuthActivity twoElementAuthActivity = (TwoElementAuthActivity) obj2;
        if (bundle.getSerializable("quick_bind_data") == null) {
            quickBindCardAdapterBean = twoElementAuthActivity.LJIIIIZZ;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) bundle.getSerializable("quick_bind_data");
        }
        twoElementAuthActivity.LJIIIIZZ = quickBindCardAdapterBean;
        if (bundle.getSerializable("two_element_order_data") == null) {
            cJPayNameAndIdentifyCodeBillBean = twoElementAuthActivity.LJIIIZ;
        } else {
            cJPayNameAndIdentifyCodeBillBean = (CJPayNameAndIdentifyCodeBillBean) bundle.getSerializable("two_element_order_data");
        }
        twoElementAuthActivity.LJIIIZ = cJPayNameAndIdentifyCodeBillBean;
        twoElementAuthActivity.LJIIJ = bundle.getBoolean("isShowRealNameAuth");
        twoElementAuthActivity.LJIIJJI = bundle.getBoolean("close_notify");
    }
}
