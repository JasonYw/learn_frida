package com.android.ttcjpaysdk.base.p132h5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p132h5.xbridge.bridge.CJPayXBridge;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.service.bean.H5SchemeParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.ttcjpayapi.ICJPayXBridgeCallback;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNamePasswordCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridge;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC137114cc2;
import p003X.C0069car;
import p003X.C116129VnX;
import p003X.C116130VnY;
import p003X.C116131VnZ;
import p003X.C116971W2r;
import p003X.C135550cCn;
import p003X.C136058cKz;
import p003X.C136226cNh;
import p003X.C136228cNj;
import p003X.C137039cao;
import p003X.C137040cap;
import p003X.C137041caq;
import p003X.C137042cas;
import p003X.C137043cat;
import p003X.C137044cau;
import p003X.C137046caw;
import p003X.C137047cax;
import p003X.C137060cbA;
import p003X.C137072cbM;
import p003X.C137074cbO;
import p003X.C137079cbT;
import p003X.C137087cbb;
import p003X.C137113cc1;
import p003X.C76765GOh;
import p003X.C97T;
import p003X.FWS;

/* renamed from: com.android.ttcjpaysdk.base.h5.CJPayH5Provider */
/* loaded from: classes17.dex */
public class CJPayH5Provider implements ICJPayH5Service {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6109);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.base.h5";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public Map<String, Class> getXBridgeMethods() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("ttcjpay.authAlipay", C137043cat.class);
            hashMap.put("ttcjpay.bioPaymentShowState", C137040cap.class);
            hashMap.put("ttcjpay.switchBioPaymentState", C137039cao.class);
            hashMap.put("ttcjpay.encrypt", C136228cNj.class);
            hashMap.put("ttcjpay.ocr", C137041caq.class);
            hashMap.put("ttcjpay.openAppByScheme", C116130VnY.class);
            hashMap.put("ttcjpay.facepp", C135550cCn.class);
            hashMap.put("ttcjpay.faceVerification", C116129VnX.class);
            hashMap.put("ttcjpay.ttpay", C0069car.class);
            hashMap.put("ttcjpay.isAppInstalled", C137042cas.class);
            hashMap.put("ttcjpay.deviceInfo", C116131VnZ.class);
            hashMap.put("ttcjpay.closeCallback", C137044cau.class);
            hashMap.put("ttcjpay.goSettings", C137047cax.class);
            hashMap.put("ttcjpay.abTest", C136226cNh.class);
            hashMap.put("ttcjpay.sendDeviceInfo", C137046caw.class);
            hashMap.put("ttcjpay.signAlipay", C137060cbA.class);
            hashMap.put("ttcjpay.getPhoneInfo", C137072cbM.class);
            hashMap.put("ttcjpay.chooseMedia", C137087cbb.class);
            hashMap.put("ttcjpay.uploadMedia", C137079cbT.class);
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public void registerXBridgeMethods() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        try {
            XBridge.INSTANCE.registerMethod(C137043cat.class);
            XBridge.INSTANCE.registerMethod(C137040cap.class);
            XBridge.INSTANCE.registerMethod(C137039cao.class);
            XBridge.INSTANCE.registerMethod(C136228cNj.class);
            XBridge.INSTANCE.registerMethod(C137041caq.class);
            XBridge.INSTANCE.registerMethod(C116130VnY.class);
            XBridge.INSTANCE.registerMethod(C135550cCn.class);
            XBridge.INSTANCE.registerMethod(C116129VnX.class);
            XBridge.INSTANCE.registerMethod(C0069car.class);
            XBridge.INSTANCE.registerMethod(C137042cas.class);
            XBridge.INSTANCE.registerMethod(C116131VnZ.class);
            XBridge.INSTANCE.registerMethod(C137044cau.class);
            XBridge.INSTANCE.registerMethod(C137047cax.class);
            XBridge.INSTANCE.registerMethod(C136226cNh.class);
            XBridge.INSTANCE.registerMethod(C137046caw.class);
            XBridge.INSTANCE.registerMethod(C137060cbA.class);
            XBridge.INSTANCE.registerMethod(C137072cbM.class);
            XBridge.INSTANCE.registerMethod(C137087cbb.class);
            XBridge.INSTANCE.registerMethod(C137079cbT.class);
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public boolean isWhiteUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return FWS.LIZ(str);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void startH5(H5ParamBuilder h5ParamBuilder) {
        Intent LIZ2;
        if (!PatchProxy.proxy(new Object[]{h5ParamBuilder}, this, LIZ, false, 1).isSupported && (LIZ2 = CJPayH5Activity.LIZ(h5ParamBuilder)) != null && h5ParamBuilder.getContext() != null) {
            LIZ(h5ParamBuilder.getContext(), LIZ2);
            C116971W2r.LIZ(h5ParamBuilder.getContext(), LIZ2);
            if (h5ParamBuilder.getContext() instanceof Activity) {
                C136058cKz.LIZ((Activity) h5ParamBuilder.getContext());
            }
        }
    }

    private String LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            Context context = CJPayHostInfo.applicationContext;
            if (context != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("statusbar_height", (int) (C76765GOh.LIZ(context) / context.getResources().getDisplayMetrics().density));
                return CJPayBasicUtils.getSafeUrlBase64(Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void startH5ByScheme(H5SchemeParamBuilder h5SchemeParamBuilder) {
        if (PatchProxy.proxy(new Object[]{h5SchemeParamBuilder}, this, LIZ, false, 4).isSupported) {
            return;
        }
        try {
            C137074cbO c137074cbO = new C137074cbO();
            c137074cbO.LIZ(h5SchemeParamBuilder.getContext());
            c137074cbO.LIZ(h5SchemeParamBuilder.getUrl());
            c137074cbO.LIZ(h5SchemeParamBuilder.getHostInfo());
            c137074cbO.LIZ(h5SchemeParamBuilder.isFromBanner());
            c137074cbO.LIZJ = h5SchemeParamBuilder.getExtendParams();
            c137074cbO.f18127LJ = h5SchemeParamBuilder.getCallbackId();
            c137074cbO.LIZ().LIZ();
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void startH5CashDesk(H5ParamBuilder h5ParamBuilder) {
        String sb;
        if (PatchProxy.proxy(new Object[]{h5ParamBuilder}, this, LIZ, false, 2).isSupported || h5ParamBuilder == null) {
            return;
        }
        CJPayHostInfo LIZ2 = CJPayHostInfo.LIZ(h5ParamBuilder.getHostInfo());
        Context context = h5ParamBuilder.getContext();
        String url = h5ParamBuilder.getUrl();
        int screenType = h5ParamBuilder.getScreenType();
        if (context != null && LIZ2 != null && LIZ2.LIZIZ() != null) {
            if (CJPayBasicUtils.isNetworkAvailable(CJPayHostInfo.applicationContext)) {
                if (TextUtils.isEmpty(url)) {
                    url = CJPayParamsUtils.LIZ() + "/cashdesk_offline";
                }
                JSONObject orderInfo = h5ParamBuilder.getOrderInfo();
                JSONObject channelInfo = h5ParamBuilder.getChannelInfo();
                JSONObject riskInfo = h5ParamBuilder.getRiskInfo();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{url, orderInfo, channelInfo, riskInfo, Integer.valueOf(screenType)}, this, LIZ, false, 6);
                if (proxy.isSupported) {
                    sb = (String) proxy.result;
                } else {
                    StringBuilder LIZ3 = LIZ(url, screenType);
                    if (orderInfo != null) {
                        LIZ3.append("&order_info=");
                        LIZ3.append(CJPayBasicUtils.getSafeUrlBase64(Base64.encodeToString(orderInfo.toString().getBytes(), 2)));
                    }
                    if (channelInfo != null) {
                        LIZ3.append("&channel_info=");
                        LIZ3.append(CJPayBasicUtils.getSafeUrlBase64(Base64.encodeToString(channelInfo.toString().getBytes(), 2)));
                    }
                    if (riskInfo != null) {
                        LIZ3.append("&risk_info=");
                        LIZ3.append(CJPayBasicUtils.getSafeUrlBase64(Base64.encodeToString(riskInfo.toString().getBytes(), 2)));
                    }
                    sb = LIZ3.toString();
                }
                if (!TextUtils.isEmpty(h5ParamBuilder.getCashdeskScene())) {
                    sb = sb + "&cashdesk_scene=" + h5ParamBuilder.getCashdeskScene();
                }
                h5ParamBuilder.setUrl(sb);
                h5ParamBuilder.setNeedTransparentActivity(true);
                h5ParamBuilder.setHideWebView(Boolean.FALSE);
                h5ParamBuilder.setShowTitleBar(false);
                h5ParamBuilder.setFromDouPlus(true);
                Intent LIZ4 = CJPayH5Activity.LIZ(h5ParamBuilder);
                LIZ(context, LIZ4);
                C116971W2r.LIZ(context, LIZ4);
                if (context instanceof Activity) {
                    if (screenType != 0) {
                        if (screenType != 1) {
                            if (screenType != 2) {
                                return;
                            }
                        } else {
                            C136058cKz.LIZ((Activity) context);
                            return;
                        }
                    }
                    C136058cKz.LIZIZ((Activity) context);
                    return;
                }
                return;
            }
            C2118a.LIZ().LIZ(109).LIZIZ();
            return;
        }
        C2118a.LIZ().LIZ(112).LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void startH5ModalView(H5ParamBuilder h5ParamBuilder) {
        String sb;
        String str;
        if (!PatchProxy.proxy(new Object[]{h5ParamBuilder}, this, LIZ, false, 3).isSupported && h5ParamBuilder != null && h5ParamBuilder.getContext() != null && CJPayBasicUtils.isNetworkAvailable(h5ParamBuilder.getContext())) {
            String url = h5ParamBuilder.getUrl();
            int screenType = h5ParamBuilder.getScreenType();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{url, Integer.valueOf(screenType)}, this, LIZ, false, 9);
            if (proxy.isSupported) {
                sb = (String) proxy.result;
            } else {
                StringBuilder sb2 = new StringBuilder(url);
                if (!TextUtils.isEmpty(url)) {
                    Set<String> queryParameterNames = Uri.parse(url).getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        if (!queryParameterNames.contains("fullpage")) {
                            if (!url.contains("?")) {
                                str = "?fullpage=";
                            } else {
                                str = "&fullpage=";
                            }
                            sb2.append(str);
                            sb2.append(screenType);
                        }
                        if (!queryParameterNames.contains("device_info")) {
                            sb2.append("&device_info=");
                            sb2.append(LIZ(screenType));
                        }
                    } else {
                        sb2 = LIZ(url, screenType);
                    }
                }
                sb = sb2.toString();
            }
            h5ParamBuilder.setUrl(sb);
            h5ParamBuilder.setNeedTransparentActivity(true);
            h5ParamBuilder.setScreenType(h5ParamBuilder.getScreenType());
            h5ParamBuilder.setReferer(null);
            h5ParamBuilder.setHideWebView(Boolean.FALSE);
            h5ParamBuilder.setNavigationBarColor("");
            h5ParamBuilder.setFromDouPlus(false);
            h5ParamBuilder.setShowLoading(h5ParamBuilder.isShowLoading());
            h5ParamBuilder.setHostInfo(h5ParamBuilder.getHostInfo());
            Intent LIZ2 = CJPayH5Activity.LIZ(h5ParamBuilder);
            LIZ(h5ParamBuilder.getContext(), LIZ2);
            C116971W2r.LIZ(h5ParamBuilder.getContext(), LIZ2);
            if (h5ParamBuilder.isEnableAnim() && (h5ParamBuilder.getContext() instanceof Activity)) {
                int screenType2 = h5ParamBuilder.getScreenType();
                if (screenType2 != 0) {
                    if (screenType2 != 1) {
                        if (screenType2 != 2) {
                            return;
                        }
                    } else {
                        C136058cKz.LIZ((Activity) h5ParamBuilder.getContext());
                        return;
                    }
                }
                C136058cKz.LIZIZ((Activity) h5ParamBuilder.getContext());
            }
        }
    }

    private void LIZ(Context context, Intent intent) {
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 5).isSupported && !(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public void handleCloseCallback(Context context, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C97T.LIZ("rifleBridge", "handleCloseCallback");
        new CJPayXBridge().executeCloseAndCallback(context, jSONObject, null);
    }

    private StringBuilder LIZ(String str, int i) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (StringBuilder) proxy.result;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            str2 = "?fullpage=";
        } else {
            str2 = "&fullpage=";
        }
        sb.append(str2);
        sb.append(i);
        sb.append("&device_info=");
        sb.append(LIZ(i));
        return sb;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void openH5ForWXPay(Activity activity, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!PatchProxy.proxy(new Object[]{activity, jSONObject, jSONObject2}, this, LIZ, false, 10).isSupported && activity != null && jSONObject != null) {
            String optString = jSONObject.optString("mweb_url");
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString(PushConstants.WEB_URL);
            }
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(activity);
            new StringBuilder();
            h5ParamBuilder.setUrl(C0002O.m25085C(optString, "&redirect_url=", URLEncoder.encode("https://tp-pay.snssdk.com/ttcjpay/wxh5pay/result")));
            h5ParamBuilder.setNeedTransparentActivity(true);
            h5ParamBuilder.setScreenType(0);
            h5ParamBuilder.setReferer("https://tp-pay.snssdk.com");
            h5ParamBuilder.setHideWebView(Boolean.TRUE);
            h5ParamBuilder.setNavigationBarColor("");
            h5ParamBuilder.setFromDouPlus(true);
            h5ParamBuilder.setHostInfo(jSONObject2);
            startH5(h5ParamBuilder);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    @CJPayModuleEntryReport
    public void openH5ForWxIndependentSign(Activity activity, String str, String str2, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{activity, str, str2, jSONObject}, this, LIZ, false, 18).isSupported && activity != null && !TextUtils.isEmpty(str)) {
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(activity);
            h5ParamBuilder.setUrl(str);
            h5ParamBuilder.setNeedTransparentActivity(true);
            h5ParamBuilder.setScreenType(0);
            h5ParamBuilder.setHideWebView(Boolean.TRUE);
            h5ParamBuilder.setNavigationBarColor("");
            h5ParamBuilder.setFromWxIndependentSign(true);
            h5ParamBuilder.setHostInfo(jSONObject);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.startsWith("http:") && !str2.startsWith("https:")) {
                    str2 = C0002O.m25086C("https://", str2);
                }
                h5ParamBuilder.setReferer(str2);
            }
            startH5(h5ParamBuilder);
        }
    }

    private String LIZ(String str, String str2, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("?app_id=");
        sb.append(str3);
        sb.append("&merchant_id=");
        sb.append(str2);
        sb.append("&service=43&device_info=");
        sb.append(LIZ(1));
        try {
            sb.append("&channel_order_info=");
            sb.append(CJPayBasicUtils.getSafeUrlBase64(Base64.encodeToString(new JSONObject(str4).toString().getBytes(), 2)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public void handleXBridgeMethod(Context context, String str, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        boolean z;
        Method[] declaredMethods;
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, iCJPayXBridgeCallback}, this, LIZ, false, 12).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("methodname is ");
        sb.append(str);
        sb.append("callback is ");
        if (iCJPayXBridgeCallback == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C97T.LIZ("xbridge", sb.toString());
        if (context != null && !TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                CJPayXBridge cJPayXBridge = new CJPayXBridge();
                for (Method method : cJPayXBridge.getClass().getDeclaredMethods()) {
                    AbstractC137114cc2 abstractC137114cc2 = (AbstractC137114cc2) method.getAnnotation(AbstractC137114cc2.class);
                    if (abstractC137114cc2 != null) {
                        String LIZ2 = abstractC137114cc2.LIZ();
                        C97T.LIZ("xbridge", "cj cjPayXBridgeMethod annotation is " + LIZ2);
                        if (str.equals(LIZ2)) {
                            C97T.LIZ("xbridge", "invoke caijing xbridge method " + LIZ2);
                            Object[] objArr = {context, jSONObject, iCJPayXBridgeCallback};
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{method, cJPayXBridge, objArr}, null, LIZ, true, 19);
                            if (proxy.isSupported) {
                                Object obj = proxy.result;
                                return;
                            }
                            ActionInvokeEntrance.setEventUuid(110000);
                            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{cJPayXBridge, objArr}, 110000, "java.lang.Object", true, "com_android_ttcjpaysdk_base_h5_CJPayH5Provider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                            if (((Boolean) actionIntercept.first).booleanValue()) {
                                Object obj2 = actionIntercept.second;
                                return;
                            } else {
                                ActionInvokeEntrance.actionInvokeReflection(method.invoke(cJPayXBridge, objArr), method, new Object[]{cJPayXBridge, objArr}, "com_android_ttcjpaysdk_base_h5_CJPayH5Provider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                                return;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C97T.LIZ("xbridge", "invoke exception is " + e.getMessage());
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayH5Service
    public void openH5SetPassword(Activity activity, String str, String str2, String str3, TTCJPayRealNamePasswordCallback tTCJPayRealNamePasswordCallback, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{activity, str, str2, str3, tTCJPayRealNamePasswordCallback, jSONObject}, this, LIZ, false, 11).isSupported && activity != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            C137113cc1.LIZ = tTCJPayRealNamePasswordCallback;
            new StringBuilder();
            String LIZ2 = LIZ(C0002O.m25086C(CJPayParamsUtils.LIZ(), "/usercenter/setpass"), str, str2, str3);
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(activity);
            h5ParamBuilder.setUrl(LIZ2);
            h5ParamBuilder.setNeedTransparentActivity(true);
            h5ParamBuilder.setScreenType(1);
            h5ParamBuilder.setReferer(null);
            h5ParamBuilder.setHideWebView(Boolean.FALSE);
            h5ParamBuilder.setShowTitleBar(false);
            h5ParamBuilder.setNavigationBarColor("");
            h5ParamBuilder.setModalViewBgcolor("");
            h5ParamBuilder.setFromDouPlus(true);
            h5ParamBuilder.setShowLoading(true);
            h5ParamBuilder.setHostInfo(jSONObject);
            startH5(h5ParamBuilder);
        }
    }
}
