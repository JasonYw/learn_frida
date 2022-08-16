package com.android.ttcjpaysdk.integrated.counter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.service.bean.CJPayProcessInfoBean;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.integrated.counter.activity.CJPayCounterActivity;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.outerpay.CJOuterPayManager;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136058cKz;
import p003X.C137115cc3;
import p003X.C137117cc5;
import p003X.C137118cc6;
import p003X.C137130ccI;
import p003X.C137134ccM;
import p003X.C137356cfw;

/* loaded from: classes17.dex */
public final class CJPayCounterProvider implements ICJPayIntegratedCounterService {
    public static ChangeQuickRedirect LIZ;
    public Map<String, String> LIZIZ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(7489);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.integrated.counter";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final String getIntegratedCounterAppId() {
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            return cJPayHostInfo.appId;
        }
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final String getIntegratedCounterMerchantId() {
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            return cJPayHostInfo.merchantId;
        }
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final Object getIntegratedObserver() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2118a LIZ2 = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2.LJIIIIZZ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final String getPromotionSource() {
        Map<String, String> map;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo == null || (map = cJPayHostInfo.payRequestParams) == null || (str = map.get("promotion_source")) == null) {
            return "";
        }
        return str;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final void preLoad() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        Map<String, String> map = this.LIZIZ;
        map.put(C137117cc5.LIZ(), C137117cc5.LIZ());
        map.put(C137118cc6.LIZ(), C137118cc6.LIZ());
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final CJPayProcessInfoBean getProcessInfo() {
        long j;
        C137134ccM c137134ccM;
        C137130ccI c137130ccI;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (CJPayProcessInfoBean) proxy.result;
        }
        CJPayProcessInfoBean cJPayProcessInfoBean = new CJPayProcessInfoBean();
        if (!TextUtils.isEmpty(C2272a.LIZIZ.process)) {
            JSONObject jSONObject = new JSONObject(C2272a.LIZIZ.process);
            cJPayProcessInfoBean.processId = jSONObject.optString(C2521l.LJIIL);
            cJPayProcessInfoBean.processInfo = jSONObject.optString("process_info");
            C2278i c2278i = C2272a.LIZIZ;
            if (c2278i != null && (c137134ccM = c2278i.data) != null && (c137130ccI = c137134ccM.trade_info) != null) {
                j = c137130ccI.create_time;
            } else {
                j = 0;
            }
            cJPayProcessInfoBean.createTime = j;
        }
        return cJPayProcessInfoBean;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final void setIntegratedObserver(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C2118a.LIZ().LJIIIIZZ = (TTCJPayObserver) obj;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final Map<String, String> getIntegratedCounterHttpHeader(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return C137356cfw.LIZIZ.LIZ(str, str2);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final String getIntegratedCounterUrl(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return C137356cfw.LIZIZ.LIZ(true, C0002O.m25084C("/", str, "/", str2));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    @CJPayModuleEntryReport
    public final void startCounterActivity(Context context, String str, JSONObject jSONObject) {
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        C2272a.LIZJ = CJPayHostInfo.Companion.LIZ(jSONObject);
        Intent intent = new Intent(context, CJPayCounterActivity.class);
        intent.putExtra("invoke_from", str);
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported && !(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        C116971W2r.LIZ(context, intent);
        if (context instanceof Activity) {
            C136058cKz.LIZIZ((Activity) context);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
            String str3 = null;
            if (cJPayHostInfo != null && (map2 = cJPayHostInfo.payRequestParams) != null) {
                str2 = map2.get("merchant_id");
            } else {
                str2 = null;
            }
            CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
            if (cJPayHostInfo2 != null && (map = cJPayHostInfo2.payRequestParams) != null) {
                str3 = map.get(Constants.APP_ID);
            }
            C2118a.LIZ().LIZ("wallet_rd_cashier_start_activity", CJPayParamsUtils.LIZ(str2, str3));
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    @CJPayModuleEntryReport
    public final void startOuterPayActivity(Activity activity, Intent intent, JSONObject jSONObject) {
        Uri data;
        Class<CJPayCounterActivity> cls;
        if (!PatchProxy.proxy(new Object[]{activity, intent, jSONObject}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{activity, intent, jSONObject}, CJOuterPayManager.LIZIZ, CJOuterPayManager.LIZ, false, 1).isSupported && activity != null && intent != null && (data = intent.getData()) != null) {
            C2272a.LIZJ = CJPayHostInfo.Companion.LIZ(jSONObject);
            Map<String, String> LIZ2 = CJOuterPayManager.LIZIZ.LIZ(data);
            int i = C137115cc3.LIZ[CJOuterPayManager.LIZIZ.LIZ(LIZ2).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                cls = CJPayCounterActivity.class;
            } else {
                cls = CJPayCounterActivity.class;
            }
            Intent intent2 = new Intent(activity, cls);
            intent2.putExtra("param_checkout_counter_enter_from_dy_outer", true);
            intent2.putExtra("param_dy_outer_type", CJOuterPayManager.LIZIZ.LIZ(LIZ2));
            System.currentTimeMillis();
            intent2.putExtra("tt_cj_pay_data_from_dy", data);
            intent2.putExtra("hide_loading_callback", intent.getParcelableExtra("hide_loading_callback"));
            C116971W2r.LIZIZ(activity, intent2);
            C136058cKz.LIZIZ(activity);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService
    public final Map<String, String> getIntegratedCounterHttpData(Map<String, String> map, String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map, str, str2, str3}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return C137356cfw.LIZIZ.LIZ(str, new JSONObject(map).toString(), str2, str3);
    }
}
