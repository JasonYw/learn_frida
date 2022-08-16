package com.android.ttcjpaysdk.ttcjpayapi;

import android.app.Activity;
import android.content.Intent;
import com.android.ttcjpaysdk.base.paymentbasis.AbstractC2164f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.tencent.p3013mm.opensdk.modelbase.BaseResp;
import com.tencent.p3013mm.opensdk.modelpay.PayResp;
import com.tencent.p3013mm.opensdk.openapi.IWXAPI;
import com.tencent.p3013mm.opensdk.openapi.IWXAPIEventHandler;
import p003X.C137434chC;
import p003X.C137435chD;

/* loaded from: classes15.dex */
public class TTCJPayWXUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9327);
    }

    public static boolean isFromTTCJPay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C137434chC.LIZ().LIZJ == null) {
            return false;
        }
        return true;
    }

    public static void handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler) {
        AbstractC2164f abstractC2164f;
        IWXAPI iwxapi;
        if (!PatchProxy.proxy(new Object[]{intent, iWXAPIEventHandler}, null, changeQuickRedirect, true, 2).isSupported && (abstractC2164f = C137434chC.LIZ().LIZJ) != null && (abstractC2164f instanceof C137435chD) && (iwxapi = ((C137435chD) abstractC2164f).LIZIZ) != null) {
            iwxapi.handleIntent(intent, iWXAPIEventHandler);
        }
    }

    public static void handleResp(Activity activity, BaseResp baseResp) {
        if (!PatchProxy.proxy(new Object[]{activity, baseResp}, null, changeQuickRedirect, true, 1).isSupported && activity != null && baseResp.getType() == 5) {
            AbstractC2164f abstractC2164f = C137434chC.LIZ().LIZJ;
            if (baseResp instanceof PayResp) {
                abstractC2164f = C137434chC.LIZ().LIZ(((PayResp) baseResp).prepayId);
            }
            if (abstractC2164f != null) {
                abstractC2164f.LIZ(String.valueOf(baseResp.errCode));
            }
        }
    }
}
