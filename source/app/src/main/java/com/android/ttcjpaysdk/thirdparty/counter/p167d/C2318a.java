package com.android.ttcjpaysdk.thirdparty.counter.p167d;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2322a;
import com.android.ttcjpaysdk.thirdparty.counter.data.C2326f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C136353cPk;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.d.a */
/* loaded from: classes17.dex */
public final class C2318a extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8217);
    }

    public final <T> void LIZ(AbstractC137673cl3<C2326f> abstractC137673cl3) {
        String str;
        HashMap<String, String> hashMap;
        if (!PatchProxy.proxy(new Object[]{abstractC137673cl3}, this, LIZIZ, false, 4).isSupported && CJPayHostInfo.applicationContext != null && CJPayCheckoutCounterActivity.LJIIIZ != null) {
            HashMap hashMap2 = new HashMap();
            try {
                hashMap2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "cashdesk.sdk.user.open_one_key_pay");
                hashMap2.put("process_info", CJPayCheckoutCounterActivity.LJIIIZ.process_info.toJson());
                hashMap2.put("trade_no", CJPayCheckoutCounterActivity.LJIIIZ.trade_info.trade_no);
                hashMap2.put("risk_info", C136353cPk.LIZ(CJPayHostInfo.applicationContext, false).toJson());
            } catch (Exception unused) {
            }
            String str2 = "";
            if (CJPayCheckoutCounterActivity.LJIIJ != null) {
                str = CJPayCheckoutCounterActivity.LJIIJ.merchantId;
            } else {
                str = str2;
            }
            if (CJPayCheckoutCounterActivity.LJIIJ != null) {
                str2 = CJPayCheckoutCounterActivity.LJIIJ.appId;
            }
            if (CJPayCheckoutCounterActivity.LJIIJ != null) {
                hashMap = CJPayCheckoutCounterActivity.LJIIJ.extraHeaderMap;
            } else {
                hashMap = null;
            }
            String LIZ = CJPayParamsUtils.LIZ("bytepay.cashdesk.open_one_key_pay", CJPayParamsUtils.HostAPI.BDPAY);
            LIZ(CJPayNetworkManager.postForm(LIZ, CJPayParamsUtils.LIZ("bytepay.cashdesk.open_one_key_pay", new JSONObject(hashMap2).toString(), str2, str), CJPayParamsUtils.LIZ(LIZ, "bytepay.cashdesk.open_one_key_pay", hashMap), abstractC137673cl3));
        }
    }

    public final void LIZ(HashMap<String, String> hashMap, AbstractC137673cl3<C2322a> abstractC137673cl3) {
        ICJPayIntegratedCounterService iCJPayIntegratedCounterService;
        if (PatchProxy.proxy(new Object[]{hashMap, abstractC137673cl3}, this, LIZIZ, false, 1).isSupported || (iCJPayIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class)) == null) {
            return;
        }
        String integratedCounterUrl = iCJPayIntegratedCounterService.getIntegratedCounterUrl("gateway-u", "tp.promotion_put.QueryPaySuccessPagePutResource");
        LIZ(CJPayNetworkManager.postForm(integratedCounterUrl, iCJPayIntegratedCounterService.getIntegratedCounterHttpData(hashMap, "tp.promotion_put.QueryPaySuccessPagePutResource", null, null), iCJPayIntegratedCounterService.getIntegratedCounterHttpHeader(integratedCounterUrl, "tp.promotion_put.QueryPaySuccessPagePutResource"), abstractC137673cl3));
    }
}
