package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class BaseQuickBindView$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6383);
    }

    public static void restoreData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        BaseQuickBindView baseQuickBindView = (BaseQuickBindView) obj2;
        if (bundle.getSerializable("quick_bind_data") == null) {
            quickBindCardAdapterBean = baseQuickBindView.quickBindData;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) bundle.getSerializable("quick_bind_data");
        }
        baseQuickBindView.quickBindData = quickBindCardAdapterBean;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ((Bundle) obj).putSerializable("quickBindData", ((BaseQuickBindView) obj2).quickBindData);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        BaseQuickBindView baseQuickBindView = (BaseQuickBindView) obj2;
        baseQuickBindView.faceCheckService = (ICJPayFaceCheckService) CJPayServiceManager.getInstance().getIService(ICJPayFaceCheckService.class);
        baseQuickBindView.mIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class);
        baseQuickBindView.normalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
        baseQuickBindView.h5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (baseQuickBindView.getIntent().getSerializableExtra("quick_bind_data") == null) {
            quickBindCardAdapterBean = baseQuickBindView.quickBindData;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) baseQuickBindView.getIntent().getSerializableExtra("quick_bind_data");
        }
        baseQuickBindView.quickBindData = quickBindCardAdapterBean;
    }
}
