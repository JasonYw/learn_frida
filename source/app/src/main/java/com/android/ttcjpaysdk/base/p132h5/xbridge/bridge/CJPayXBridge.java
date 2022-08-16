package com.android.ttcjpaysdk.base.p132h5.xbridge.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p132h5.bean.CJWebviewInfoBean;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayAlipayAuthService;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintStateCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintSwitchCallback;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayOCRService;
import com.android.ttcjpaysdk.base.service.ICJPayServiceRetCallBack;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.ttcjpayapi.ICJPayXBridgeCallback;
import com.android.ttcjpaysdk.ttcjpayapi.IGeneralPay;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayAlipayAuthCallback;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayDoFaceLive;
import com.bdcaijing.tfccsmsdk.Tfcc;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.analytics.pro.C33764r;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137071cbL;
import p003X.AbstractC137114cc2;
import p003X.C116971W2r;
import p003X.C135549cCm;
import p003X.C135754cG5;
import p003X.C136035cKc;
import p003X.C136036cKd;
import p003X.C137064cbE;
import p003X.C1P9;
import p003X.C64859BiX;
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge */
/* loaded from: classes17.dex */
public class CJPayXBridge implements AbstractC2126a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<String, ICJPayXBridgeCallback> callbackMap = new HashMap<>();

    static {
        Covode.recordClassIndex(6199);
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135549cCm.class, C135754cG5.class};
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if ((baseEvent instanceof C135754cG5) && ((C135754cG5) baseEvent).isFromBullet()) {
            HashMap hashMap = new HashMap();
            hashMap.put(C2521l.LJIIJ, 0);
            this.callbackMap.get("ttcjpay.facepp").success(hashMap);
            EventManager.INSTANCE.unregister(this);
        }
        if ((baseEvent instanceof C135549cCm) && ((C135549cCm) baseEvent).LIZ()) {
            this.callbackMap.get("ttcjpay.facepp").fail(new HashMap());
            EventManager.INSTANCE.unregister(this);
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.encrypt")
    public void encrypt(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        final String optString = jSONObject.optString(C2521l.LJIIL);
        final String optString2 = jSONObject.optString("public_key");
        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6200);
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                int i = 0;
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported || TextUtils.isEmpty(optString)) {
                    return;
                }
                int[] iArr = new int[1];
                String encodeToString = Base64.encodeToString(optString.getBytes(), 2);
                if (TextUtils.isEmpty(encodeToString)) {
                    return;
                }
                Tfcc tfcc = new Tfcc();
                if (TextUtils.isEmpty(optString2)) {
                    str = new String(CJPayBasicUtils.getTfccKey());
                } else {
                    str = optString2;
                }
                String LIZ2 = tfcc.LIZ(str, encodeToString, iArr);
                if (TextUtils.isEmpty(LIZ2)) {
                    return;
                }
                String replaceAll = LIZ2.replace('+', '-').replace('/', '_').replaceAll("=", "");
                HashMap hashMap = new HashMap();
                try {
                    if (iArr[0] != Tfcc.VXErrorCode.VXERR_OK.mCode) {
                        i = iArr[0];
                    }
                    hashMap.put(C2521l.LJIIJ, Integer.valueOf(i));
                    HashMap hashMap2 = new HashMap();
                    if (TextUtils.isEmpty(replaceAll)) {
                        replaceAll = "";
                    }
                    hashMap2.put("value", replaceAll);
                    hashMap.put(C2521l.LJIIL, hashMap2);
                    iCJPayXBridgeCallback.success(hashMap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.goSettings")
    public void goSettings(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C116971W2r.LIZ(context, new Intent("android.settings.SETTINGS"));
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.openAppByScheme")
    public void openAppBySchema(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        try {
            String optString = jSONObject.optString("app_scheme");
            Intent intent = new Intent();
            intent.setData(Uri.parse(optString));
            intent.setAction("android.intent.action.VIEW");
            C116971W2r.LIZ(context, intent);
        } catch (Exception unused) {
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.sendDeviceInfo")
    public void sendDeviceInfo(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        FWT.LIZ(jSONObject.optString("scene"));
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.authAlipay")
    public void authAlipay(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        String optString = jSONObject.optString("infoStr");
        final HashMap hashMap = new HashMap();
        if (CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class) != null && !TextUtils.isEmpty(optString)) {
            ((ICJPayAlipayAuthService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class)).authAlipay((Activity) context, optString, true, new TTCJPayAlipayAuthCallback(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.8
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6207);
                }

                @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayAlipayAuthCallback
                public final void onAuthResult(Map<String, String> map) {
                    if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                        hashMap.put(C2521l.LJIIL, jSONObject2);
                        iCJPayXBridgeCallback.success(hashMap);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        iCJPayXBridgeCallback.fail(hashMap);
                    }
                }
            });
        } else {
            iCJPayXBridgeCallback.fail(hashMap);
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.isAppInstalled")
    public void checkAppInstall(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        String str;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        String optString = jSONObject.optString("open_url");
        if (!TextUtils.isEmpty(optString)) {
            if (TextUtils.equals("weixin://", optString)) {
                str = "com.tencent.mm";
            } else if (TextUtils.equals("cmbmobilebank://", optString)) {
                str = "cmb.pb";
            } else {
                str = "com.eg.android.AlipayGphone";
            }
            boolean checkAppInstalled = CJPayBasicUtils.checkAppInstalled(context, str);
            HashMap hashMap = new HashMap();
            if (checkAppInstalled) {
                i = 1;
            }
            try {
                hashMap.put("installed", Integer.valueOf(i));
                iCJPayXBridgeCallback.success(hashMap);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        HashMap hashMap2 = new HashMap();
        try {
            hashMap2.put("errorMsg", "open_url is required");
            hashMap2.put("errorCode", C33764r.f42396f);
            iCJPayXBridgeCallback.fail(hashMap2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.faceVerification")
    public void checkFaceByAILab(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene", jSONObject.optString("scene"));
        hashMap.put("ticket", jSONObject.optString("ticket"));
        hashMap.put("mode", jSONObject.optString("mode"));
        hashMap.put("cert_app_id", jSONObject.optString("cert_app_id"));
        C2118a.LIZ().LIZ((Activity) context, hashMap, new TTCJPayDoFaceLive.TTCJPayFaceLiveCallback(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6203);
            }

            @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayDoFaceLive.TTCJPayFaceLiveCallback
            public final void onResult(JSONObject jSONObject2) {
                String str;
                if (PatchProxy.proxy(new Object[]{jSONObject2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int optInt = jSONObject2.optInt("errorCode");
                    String optString = jSONObject2.optString("errorMsg");
                    jSONObject3.put(C2521l.LJIIJ, optInt);
                    jSONObject3.put("errMsg", optString);
                    jSONObject3.put("ticket", jSONObject2.optString("ticket"));
                    if (jSONObject2.has("jsonData")) {
                        str = jSONObject2.optJSONObject("jsonData").optString("sdk_data");
                    } else {
                        str = "";
                    }
                    jSONObject3.put("faceData", str);
                } catch (Exception unused) {
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(C2521l.LJIIL, jSONObject3);
                iCJPayXBridgeCallback.success(hashMap2);
            }
        });
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.closeCallback")
    public void executeCloseAndCallback(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        try {
            String optString = jSONObject.optString("service", "");
            String optString2 = jSONObject.optString(C2521l.LJIIJ, "");
            String optString3 = jSONObject.optString(C2521l.LJIIL, "");
            String optString4 = jSONObject.optString("amount", "");
            String optString5 = jSONObject.optString("success_desc", "");
            String optString6 = jSONObject.optString("fail_desc", "");
            String optString7 = jSONObject.optString("callback_id", "");
            String optString8 = jSONObject.optString("ext", "");
            if (context instanceof Activity) {
                new C137064cbE((Activity) context, new AbstractC137071cbL(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.3
                    static {
                        Covode.recordClassIndex(6202);
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final Intent LIZ(CJWebviewInfoBean cJWebviewInfoBean, CJPayHostInfo cJPayHostInfo) {
                        return null;
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final Map<String, String> LIZ(String str, String str2) {
                        return null;
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(int i) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(int i, String str, String str2) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(CJWebviewInfoBean cJWebviewInfoBean) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(IBridgeContext iBridgeContext) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(String str, String str2, int i, String str3, String str4, String str5) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZ(List<String> list) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZIZ(int i) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LIZJ(String str) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final boolean LIZLLL(String str) {
                        return false;
                    }

                    @Override // p003X.AbstractC137071cbL
                    /* renamed from: LJ */
                    public final void mo16066LJ() {
                    }

                    @Override // p003X.AbstractC137071cbL
                    /* renamed from: LJ */
                    public final void mo16065LJ(String str) {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LJFF() {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LJI() {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final CJPayHostInfo LJII() {
                        return null;
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final String LJIIIIZZ() {
                        return null;
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final String LJIIIZ() {
                        return null;
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LJIIJ() {
                    }

                    @Override // p003X.AbstractC137071cbL
                    public final void LJIIJJI() {
                    }
                }).executeCloseAndCallback(optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8);
            }
        } catch (Exception unused) {
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.abTest")
    public void getABTest(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        String optString = jSONObject.optString("ab_setting_key");
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Map<String, Object> LJIIIZ = C136035cKc.LIZLLL.LJIIIZ();
            if (LJIIIZ != null && LJIIIZ.size() > 0 && !TextUtils.isEmpty(optString) && (obj = LJIIIZ.get(optString)) != null) {
                C136036cKd.LIZ(optString);
                jSONObject2.put("ab_setting_value", obj);
            }
            hashMap.put(C2521l.LJIIL, jSONObject2);
            iCJPayXBridgeCallback.success(hashMap);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.bioPaymentShowState")
    public void bioShowState(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("merchantId");
        String optString3 = jSONObject.optString("did");
        String optString4 = jSONObject.optString("uid");
        String optString5 = jSONObject.optString(C64859BiX.LIZIZ);
        jSONObject.optString("timestamp");
        jSONObject.optString("signType");
        jSONObject.optString("sign");
        boolean optBoolean = jSONObject.optBoolean("onlyReturnDeviceType");
        HashMap<String, String> LIZ = C1P9.LIZ(jSONObject.optJSONObject("riskInfoParams"));
        final HashMap hashMap = new HashMap();
        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
        if (iCJPayFingerprintService != null) {
            CJPayHostInfo cJPayHostInfo = new CJPayHostInfo();
            cJPayHostInfo.merchantId = optString2;
            cJPayHostInfo.appId = optString;
            cJPayHostInfo.LIZIZ(LIZ);
            if (!TextUtils.isEmpty(optString4)) {
                CJPayHostInfo.uid = optString4;
            }
            if (!TextUtils.isEmpty(optString3)) {
                CJPayHostInfo.did = optString3;
            }
            if (!TextUtils.isEmpty(optString5)) {
                CJPayHostInfo.aid = optString5;
            }
            final JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("show", "1");
                jSONObject2.put("bioType", "2");
                if (!CJPayBasicUtils.isSupportFingerPrint(context)) {
                    jSONObject2.put("msg", context.getString(2131561685));
                    jSONObject2.put("style", "2");
                } else {
                    jSONObject2.put("msg", "");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (optBoolean) {
                hashMap.put(C2521l.LJIIL, jSONObject2);
                iCJPayXBridgeCallback.success(hashMap);
                return;
            }
            iCJPayFingerprintService.queryFingerprintState(context, optString4, new ICJPayFingerprintStateCallback(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.6
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6205);
                }

                @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintStateCallback
                public final void onGetState(boolean z) {
                    String str;
                    if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    try {
                        JSONObject jSONObject3 = jSONObject2;
                        if (z) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject3.put("open", str);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    hashMap.put(C2521l.LJIIL, jSONObject2);
                    iCJPayXBridgeCallback.success(hashMap);
                }
            }, CJPayHostInfo.LIZIZ(cJPayHostInfo));
            return;
        }
        iCJPayXBridgeCallback.fail(hashMap);
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.switchBioPaymentState")
    public void bioSwitchState(final Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("merchantId");
        String optString3 = jSONObject.optString("did");
        String optString4 = jSONObject.optString("uid");
        String optString5 = jSONObject.optString("open");
        jSONObject.optString("signType");
        jSONObject.optString("sign");
        jSONObject.optString("timestamp");
        String optString6 = jSONObject.optString("member_biz_order_no");
        String optString7 = jSONObject.optString("verify_type");
        String optString8 = jSONObject.optString("verify_info");
        HashMap<String, String> LIZ = C1P9.LIZ(jSONObject.optJSONObject("riskInfoParams"));
        final HashMap hashMap = new HashMap();
        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
        if (iCJPayFingerprintService != null) {
            CJPayHostInfo cJPayHostInfo = new CJPayHostInfo();
            cJPayHostInfo.merchantId = optString2;
            cJPayHostInfo.appId = optString;
            cJPayHostInfo.LIZIZ(LIZ);
            if (!TextUtils.isEmpty(optString4)) {
                CJPayHostInfo.uid = optString4;
            }
            if (!TextUtils.isEmpty(optString3)) {
                CJPayHostInfo.did = optString3;
            }
            JSONObject jSONObject2 = null;
            if (!TextUtils.isEmpty(optString8)) {
                try {
                    jSONObject2 = new JSONObject(optString8);
                } catch (JSONException unused) {
                }
            }
            ICJPayFingerprintSwitchCallback iCJPayFingerprintSwitchCallback = new ICJPayFingerprintSwitchCallback(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.7
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6206);
                }

                @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintSwitchCallback
                public final void onResult(boolean z, boolean z2, String str, int i) {
                    String str2;
                    if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    String str3 = "0";
                    if (!z) {
                        str2 = "1";
                    } else {
                        str2 = str3;
                    }
                    try {
                        jSONObject3.put(C2521l.LJIIJ, str2);
                        if (z2) {
                            str3 = "1";
                        }
                        jSONObject3.put("bioPaymentState", str3);
                        jSONObject3.put("style", i);
                        if (z) {
                            if (z2) {
                                jSONObject3.put("msg", context.getString(2131561644));
                            } else {
                                jSONObject3.put("msg", context.getString(2131561638));
                            }
                        } else if (TextUtils.isEmpty(str)) {
                            if (!z2) {
                                jSONObject3.put("msg", context.getString(2131561639));
                            } else {
                                jSONObject3.put("msg", context.getString(2131561637));
                            }
                        } else {
                            jSONObject3.put("msg", str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    hashMap.put(C2521l.LJIIL, jSONObject3);
                    iCJPayXBridgeCallback.success(hashMap);
                }
            };
            if ("1".equals(optString5)) {
                iCJPayFingerprintService.openFingerprint(context, optString4, iCJPayFingerprintSwitchCallback, CJPayHostInfo.LIZIZ(cJPayHostInfo), optString6, optString7, jSONObject2);
                return;
            } else {
                iCJPayFingerprintService.closeFingerprint(context, optString4, iCJPayFingerprintSwitchCallback);
                return;
            }
        }
        iCJPayXBridgeCallback.fail(hashMap);
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.facepp")
    public void checkFaceByFacePP(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        this.callbackMap.put("ttcjpay.facepp", iCJPayXBridgeCallback);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        String optString = jSONObject.optString(PushConstants.WEB_URL);
        String optString2 = jSONObject.optString("returnUrl");
        if (iCJPayH5Service != null && !TextUtils.isEmpty(optString)) {
            EventManager.INSTANCE.register(this);
            HashMap hashMap = new HashMap();
            hashMap.put("return_url", optString2);
            hashMap.put("clientSource", "1003");
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(context);
            h5ParamBuilder.setUrl(optString);
            h5ParamBuilder.setTitle(context.getString(2131561610));
            h5ParamBuilder.setDisableH5History(true);
            h5ParamBuilder.setEnterFrom("face_plus_from_bullet");
            h5ParamBuilder.setExtendParams(hashMap);
            iCJPayH5Service.startH5(h5ParamBuilder);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errorMsg", "loadUrl is null");
        iCJPayXBridgeCallback.fail(hashMap2);
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.deviceInfo")
    public void deviceInfo(Context context, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        String optString = jSONObject.optString("did");
        String optString2 = jSONObject.optString(C64859BiX.LIZIZ);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("device_id", optString);
            jSONObject2.put("device_platform", "android");
            jSONObject2.put("device_type", Build.MODEL);
            jSONObject2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("ac", CJPayBasicUtils.getNetworkState(CJPayHostInfo.applicationContext));
            jSONObject2.put(Constants.PHONE_BRAND, Build.MANUFACTURER);
            jSONObject2.put("resolution", CJPayBasicUtils.getScreenHeight(context) + "*" + CJPayBasicUtils.getScreenWidth(context));
            jSONObject2.put("platform", PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START);
            jSONObject2.put("app_name", CJPayBasicUtils.getAppName(context));
            jSONObject2.put(C64859BiX.LIZIZ, optString2);
            jSONObject2.put("version_name", CJPayBasicUtils.getAppVersionName(context));
            jSONObject2.put("version_code", String.valueOf(CJPayBasicUtils.getAppVersionCode(context)));
            jSONObject2.put("sdk_version", CJPayBasicUtils.getRealVersion());
            jSONObject2.put(C1315c.f22208f, CJPayParamsUtils.LJII());
            hashMap.put(C2521l.LJIIL, jSONObject2);
            iCJPayXBridgeCallback.success(hashMap);
        } catch (JSONException e) {
            e.printStackTrace();
            iCJPayXBridgeCallback.fail(hashMap);
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.ocr")
    public void ocrService(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        ICJPayOCRService iCJPayOCRService;
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 4).isSupported || (iCJPayOCRService = (ICJPayOCRService) CJPayServiceManager.getInstance().getIService(ICJPayOCRService.class)) == null) {
            return;
        }
        String optString = jSONObject.optString("merchantId");
        String optString2 = jSONObject.optString("appId");
        String optString3 = jSONObject.optString("did");
        String optString4 = jSONObject.optString(C64859BiX.LIZIZ);
        String optString5 = jSONObject.optString("rule");
        String optString6 = jSONObject.optString("track_base_param");
        HashMap<String, String> LIZ = C1P9.LIZ(jSONObject.optJSONObject("riskInfoParams"));
        CJPayHostInfo cJPayHostInfo = new CJPayHostInfo();
        cJPayHostInfo.merchantId = optString;
        cJPayHostInfo.appId = optString2;
        CJPayHostInfo.did = optString3;
        CJPayHostInfo.aid = optString4;
        cJPayHostInfo.LIZIZ(LIZ);
        Map<String, String> LIZIZ = cJPayHostInfo.LIZIZ();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("risk_str", new JSONObject(LIZIZ));
            iCJPayOCRService.startOCR(context, optString, optString2, optString5, optString6, jSONObject2.toString(), CJPayHostInfo.LIZIZ(cJPayHostInfo), new ICJPayServiceRetCallBack(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6201);
                }

                @Override // com.android.ttcjpaysdk.base.service.ICJPayServiceRetCallBack
                public final void onResult(String str, byte[] bArr) {
                    if (PatchProxy.proxy(new Object[]{str, bArr}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject(str);
                        String optString7 = jSONObject3.optString("type");
                        String optString8 = jSONObject3.optString("result");
                        String optString9 = jSONObject3.optString("cropped_img");
                        HashMap hashMap = new HashMap();
                        if ("0".equals(optString7)) {
                            hashMap.put(C2521l.LJIIJ, 0);
                            hashMap.put(C2521l.LJIIL, optString8);
                            hashMap.put("cropped_img", optString9);
                            iCJPayXBridgeCallback.success(hashMap);
                        } else if ("1".equals(optString7)) {
                            hashMap.put(C2521l.LJIIJ, 1);
                            iCJPayXBridgeCallback.success(hashMap);
                        } else if ("2".equals(optString7)) {
                            hashMap.put(C2521l.LJIIJ, 2);
                            iCJPayXBridgeCallback.success(hashMap);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @AbstractC137114cc2(LIZ = "ttcjpay.ttpay")
    public void ttpay(Context context, JSONObject jSONObject, final ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        String optString = jSONObject.optString("sdk_info");
        int optInt = jSONObject.optInt("service", -1);
        String optString2 = jSONObject.optString("sub_way", "");
        String optString3 = jSONObject.optString("ext", "{}");
        String optString4 = jSONObject.optString("referer", "");
        String optString5 = jSONObject.optString("did");
        String optString6 = jSONObject.optString(C64859BiX.LIZIZ);
        HashMap<String, String> LIZ = C1P9.LIZ(jSONObject.optJSONObject("riskInfoParams"));
        final HashMap hashMap = new HashMap();
        if (C2118a.LIZ().LJIILJJIL != null) {
            CJPayHostInfo cJPayHostInfo = new CJPayHostInfo();
            cJPayHostInfo.LIZ(context);
            cJPayHostInfo.LIZIZ(LIZ);
            CJPayHostInfo.did = optString5;
            CJPayHostInfo.aid = optString6;
            C2118a.LIZ().LJIILJJIL.pay((Activity) context, optString, optInt, optString2, optString4, optString3, "from_h5", CJPayHostInfo.LIZ(cJPayHostInfo), new IGeneralPay.IGeneralPayCallback(this) { // from class: com.android.ttcjpaysdk.base.h5.xbridge.bridge.CJPayXBridge.5
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6204);
                }

                @Override // com.android.ttcjpaysdk.ttcjpayapi.IGeneralPay.IGeneralPayCallback
                public final void onResult(int i, String str) {
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    try {
                        hashMap.put(C2521l.LJIIJ, Integer.valueOf(i));
                        hashMap.put("msg", str);
                        iCJPayXBridgeCallback.success(hashMap);
                    } catch (Exception unused) {
                        iCJPayXBridgeCallback.fail(hashMap);
                    }
                    C2118a.LIZ().LIZLLL();
                }
            });
            return;
        }
        iCJPayXBridgeCallback.fail(hashMap);
    }
}
