package com.android.ttcjpaysdk.fastpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.service.ICJPayFastPayService;
import com.android.ttcjpaysdk.base.service.IFastPayFailureCallback;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.fastpay.activity.FastPayActivity;
import com.android.ttcjpaysdk.fastpay.data.ShareData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136994ca5;
import p003X.C137004caF;
import p003X.C137012caN;
import p003X.RunnableC136986cZx;

/* loaded from: classes17.dex */
public final class FastPayServiceImpl implements ICJPayFastPayService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7444);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.fastpay";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFastPayService
    public final void fastPayHideLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        EventManager.INSTANCE.notifyNow(new C137012caN());
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFastPayService
    public final void fastPayOnlySendRequest(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 4).isSupported) {
            return;
        }
        EventManager.INSTANCE.notifyNow(new C137004caF(map));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFastPayService
    public final void doSuperPay(Context context, String str, JSONObject jSONObject, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, str2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        CJPayHostInfo LIZ2 = CJPayHostInfo.Companion.LIZ(jSONObject);
        ShareData.LJFF();
        ShareData.LIZ(LIZ2);
        new RunnableC136986cZx(context, str, LIZ2, str2).LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFastPayService
    public final void fastPayShowLoading(Context context, Map<String, String> map, String str, int i, JSONObject jSONObject, IFastPayFailureCallback iFastPayFailureCallback) {
        if (PatchProxy.proxy(new Object[]{context, map, str, Integer.valueOf(i), jSONObject, iFastPayFailureCallback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str);
        CJPayHostInfo LIZ2 = CJPayHostInfo.Companion.LIZ(jSONObject);
        C2118a.LIZ().LIZ("wallet_cashier_fastpay_pull", CJPayParamsUtils.LIZ(LIZ2.merchantId, LIZ2.appId));
        C116971W2r.LIZ(context, FastPayActivity.LJIIIZ.LIZ(context, map, str, i, jSONObject, iFastPayFailureCallback, true));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFastPayService
    public final void fastPay(Context context, Map<String, String> map, String str, int i, JSONObject jSONObject, IFastPayFailureCallback iFastPayFailureCallback) {
        String str2;
        String str3;
        Intent LIZ2;
        if (PatchProxy.proxy(new Object[]{context, map, str, Integer.valueOf(i), jSONObject, iFastPayFailureCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str);
        if (map != null) {
            str2 = map.get("merchant_id");
            str3 = map.get(Constants.APP_ID);
        } else {
            str2 = null;
            str3 = null;
        }
        C2118a.LIZ().LIZ("wallet_cashier_fastpay_pull", CJPayParamsUtils.LIZ(str2, str3));
        C136994ca5 c136994ca5 = FastPayActivity.LJIIIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c136994ca5, context, map, str, Integer.valueOf(i), jSONObject, iFastPayFailureCallback, (byte) 0, 64, null}, null, C136994ca5.LIZ, true, 2);
        if (proxy.isSupported) {
            LIZ2 = (Intent) proxy.result;
        } else {
            LIZ2 = c136994ca5.LIZ(context, map, str, i, jSONObject, iFastPayFailureCallback, false);
        }
        C116971W2r.LIZ(context, LIZ2);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }
}
