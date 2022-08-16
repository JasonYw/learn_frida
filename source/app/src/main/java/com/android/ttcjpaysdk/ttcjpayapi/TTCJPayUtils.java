package com.android.ttcjpaysdk.ttcjpayapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.event.ErrorNetworkRefresh;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayAlipayAuthService;
import com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayCounterService;
import com.android.ttcjpaysdk.base.service.ICJPayFastPayService;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCounterService;
import com.android.ttcjpaysdk.base.service.ICJPayFrontMyBankCardService;
import com.android.ttcjpaysdk.base.service.ICJPayGeckoService;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService;
import com.android.ttcjpaysdk.base.service.ICJPayMultiProcessService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.ICJPayOCRService;
import com.android.ttcjpaysdk.base.service.ICJPayRealNameAuthService;
import com.android.ttcjpaysdk.base.service.ICJPayRechargeService;
import com.android.ttcjpaysdk.base.service.ICJPayServiceRetCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayWXIndependentSignService;
import com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayWithdrawService;
import com.android.ttcjpaysdk.base.service.IFastPayFailureCallback;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.service.bean.H5SchemeParamBuilder;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.ttcjpayapi.IGeneralPay;
import com.android.ttcjpaysdk.util.C2423d;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppContextManager;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.ugc.aweme.local_test.LocalTest;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC135508cC7;
import p003X.AbstractC135665cEe;
import p003X.AbstractC137059cb9;
import p003X.C106862S5w;
import p003X.C116125VnT;
import p003X.C116971W2r;
import p003X.C126771Zun;
import p003X.C135465cBQ;
import p003X.C135930cIv;
import p003X.C135931cIw;
import p003X.C136229cNk;
import p003X.C136458cRR;
import p003X.C136467cRa;
import p003X.C136757cWG;
import p003X.C136992ca3;
import p003X.C137038can;
import p003X.C137048cay;
import p003X.C137049caz;
import p003X.C137054cb4;
import p003X.C64859BiX;
import p003X.C74873Fff;
import p003X.C75322Fmu;
import p003X.DialogC137460chc;
import p003X.FWT;

/* loaded from: classes17.dex */
public final class TTCJPayUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public IGeneralPay generalPayCallback;
    public CJPayHostInfo hostInfo;
    public final ICJPayReleaseAll mReleaseAllCallBack;
    public volatile boolean remoteDataHasInit;
    public static final Companion Companion = new Companion(null);
    public static final Lazy singleInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) TTCJPayUtils$Companion$singleInstance$2.INSTANCE);

    @JvmStatic
    /* renamed from: com_android_ttcjpaysdk_ttcjpayapi_TTCJPayUtils__getInstance$___twin___ */
    public static final TTCJPayUtils m16022xaf3f1def() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 96);
        return proxy.isSupported ? (TTCJPayUtils) proxy.result : Companion.getInstance();
    }

    public static final TTCJPayUtils getInstance() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 95);
        return proxy.isSupported ? (TTCJPayUtils) proxy.result : m16021x1d173758();
    }

    public static final TTCJPayUtils getSingleInstance() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 93);
        return proxy.isSupported ? (TTCJPayUtils) proxy.result : Companion.getSingleInstance();
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils preLoadCheckoutCounterData(String str, String str2, String str3, String str4) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils preLoadCheckoutCounterData(String str, String str2, String str3, String str4, String str5) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils preLoadCheckoutCounterDataForH5(String str, String str2, String str3, String str4, String str5) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils privateFetchSettings() {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setCustomUA(String str) {
        C106862S5w.LIZ(str);
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setIsAggregatePayment(boolean z) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setIsBalancePaymentExposed(boolean z) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setIsHideStatusBar(boolean z) {
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils updateLoginStatus(int i) {
        return this;
    }

    /* loaded from: classes28.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9313);
        }

        @JvmStatic
        public static /* synthetic */ void getSingleInstance$annotations() {
        }

        public final TTCJPayUtils getSingleInstance() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            return (TTCJPayUtils) (proxy.isSupported ? proxy.result : TTCJPayUtils.singleInstance$delegate.mo27335getValue());
        }

        public Companion() {
        }

        @JvmStatic
        public final TTCJPayUtils getInstance() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (TTCJPayUtils) proxy.result;
            }
            return getSingleInstance();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ICJPayReleaseAll getReleaseAllCallBack() {
        return this.mReleaseAllCallBack;
    }

    public final boolean getRemoteDataHasInit() {
        return this.remoteDataHasInit;
    }

    static {
        Covode.recordClassIndex(9312);
    }

    public TTCJPayUtils() {
        this.hostInfo = new CJPayHostInfo();
        this.generalPayCallback = new IGeneralPay() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$generalPayCallback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9320);
            }

            @Override // com.android.ttcjpaysdk.ttcjpayapi.IGeneralPay
            public final void pay(Activity activity, String str, int i, String str2, String str3, String str4, String str5, CJPayHostInfo cJPayHostInfo, final IGeneralPay.IGeneralPayCallback iGeneralPayCallback) {
                if (PatchProxy.proxy(new Object[]{activity, str, Integer.valueOf(i), str2, str3, str4, str5, cJPayHostInfo, iGeneralPayCallback}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                IH5PayCallback iH5PayCallback = new IH5PayCallback() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$generalPayCallback$1$payCallback$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9321);
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback
                    public final void onResult(int i2, String str6) {
                        IGeneralPay.IGeneralPayCallback iGeneralPayCallback2;
                        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2), str6}, this, changeQuickRedirect, false, 1).isSupported && (iGeneralPayCallback2 = IGeneralPay.IGeneralPayCallback.this) != null) {
                            iGeneralPayCallback2.onResult(i2, str6);
                        }
                    }
                };
                TTCJPayUtils tTCJPayUtils = TTCJPayUtils.this;
                tTCJPayUtils.hostInfo = cJPayHostInfo;
                tTCJPayUtils.setContext(activity);
                TTCJPayUtils.this.pay(str, i, str2, str3, str4, str5, iH5PayCallback);
            }
        };
        this.mReleaseAllCallBack = TTCJPayUtils$mReleaseAllCallBack$1.INSTANCE;
    }

    public final void closeSDK() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        releaseAll();
        C136467cRa.LIZ();
    }

    public final void doRefreshOnNetworkError() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        EventManager.INSTANCE.notify(new ErrorNetworkRefresh());
    }

    public final void execute() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35).isSupported) {
            return;
        }
        execute("from_native");
    }

    public final String getBioType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String bioTypeInfo = CJPayBasicUtils.getBioTypeInfo();
        Intrinsics.checkNotNullExpressionValue(bioTypeInfo, "");
        return bioTypeInfo;
    }

    public final String getJailBreak() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String jailBreakInfo = CJPayBasicUtils.getJailBreakInfo();
        Intrinsics.checkNotNullExpressionValue(jailBreakInfo, "");
        return jailBreakInfo;
    }

    public final String getSDKVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String realVersion = CJPayBasicUtils.getRealVersion();
        Intrinsics.checkNotNullExpressionValue(realVersion, "");
        return realVersion;
    }

    public final void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        C116125VnT.LIZ().LIZ(new Runnable() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$init$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9323);
            }

            /* renamed from: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$init$1$1 */
            /* loaded from: classes11.dex */
            public static final class C24221 extends Lambda implements Function0<Unit> {
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9324);
                }

                public C24221() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final /* bridge */ /* synthetic */ Unit mo30099invoke() {
                    mo30099invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: collision with other method in class */
                public final void mo30099invoke() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    C74873Fff.LIZ(MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("cj_pay_sdk_version", TTCJPayUtils.this.getSDKVersion())));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Object mo27335getValue;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported || (context = CJPayHostInfo.applicationContext) == null) {
                    return;
                }
                CJPayPerformance.LIZ().LIZ(context);
                CJPayPerformance.LIZ().LIZ(BuildConfig.APPLICATION_ID);
                if (ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    C2118a.LIZ().LIZIZ = TTCJPayUtils.Companion.getInstance().getReleaseAllCallBack();
                    if (!TTCJPayUtils.this.getRemoteDataHasInit()) {
                        TTCJPayUtils.this.setRemoteDataHasInit(true);
                        C136992ca3.LIZ().LIZ("newcjpaysdk", CJPayBasicUtils.getSettingsVersion(), (Map<String, String>) null);
                        ICJPayGeckoService iCJPayGeckoService = (ICJPayGeckoService) CJPayServiceManager.getInstance().getIService(ICJPayGeckoService.class);
                        if (iCJPayGeckoService != null) {
                            iCJPayGeckoService.initWebOffline(CJPayHostInfo.aid, CJPayHostInfo.did, context);
                        }
                    }
                    C75322Fmu.LIZ(new C24221());
                    C137054cb4 c137054cb4 = C2423d.LIZJ;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c137054cb4, C137054cb4.LIZ, false, 2);
                    if (proxy.isSupported) {
                        mo27335getValue = proxy.result;
                    } else {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c137054cb4, C137054cb4.LIZ, false, 1);
                        if (proxy2.isSupported) {
                            mo27335getValue = proxy2.result;
                        } else {
                            mo27335getValue = C2423d.LIZIZ.mo27335getValue();
                        }
                    }
                    if (!PatchProxy.proxy(new Object[0], mo27335getValue, C2423d.LIZ, false, 1).isSupported) {
                        try {
                            ICJPayIntegratedCounterService iCJPayIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class);
                            if (iCJPayIntegratedCounterService != null) {
                                iCJPayIntegratedCounterService.preLoad();
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            ICJPayFrontCounterService iCJPayFrontCounterService = (ICJPayFrontCounterService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCounterService.class);
                            if (iCJPayFrontCounterService != null) {
                                iCJPayFrontCounterService.preLoad();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    FWT.LIZ("caijing_initialization");
                }
            }
        });
    }

    @Deprecated(message = "this function is deprecated!")
    public final void releaseAll() {
        releaseHostInfo();
        CJPayHostInfo.titleBitmap = null;
        C2118a.LIZ().LIZJ();
        C136458cRR.LIZJ();
        releaseService();
    }

    public final void releaseHostInfo() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 90).isSupported) {
            return;
        }
        this.hostInfo = new CJPayHostInfo();
    }

    private final HashMap<String, String> getRequestParamsMap() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 75);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        String str2 = null;
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.appId;
        } else {
            str = null;
        }
        hashMap.put(Constants.APP_ID, str);
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        if (cJPayHostInfo2 != null) {
            str2 = cJPayHostInfo2.merchantId;
        }
        hashMap.put("merchant_id", str2);
        return hashMap;
    }

    private final void releaseService() {
        ICJPayFingerprintService iCJPayFingerprintService;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27).isSupported && (iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class)) != null) {
            iCJPayFingerprintService.release();
        }
    }

    public final void fastPayHideLoading() {
        ICJPayFastPayService iCJPayFastPayService;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 88).isSupported && (iCJPayFastPayService = (ICJPayFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayFastPayService.class)) != null) {
            iCJPayFastPayService.fastPayHideLoading();
        }
    }

    public final Map<String, Class<? extends Object>> getCJPayXBridgeMethods() {
        Map<String, Class> xBridgeMethods;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 73);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service != null && (xBridgeMethods = iCJPayH5Service.getXBridgeMethods()) != null && (!xBridgeMethods.isEmpty())) {
            linkedHashMap.putAll(xBridgeMethods);
        }
        return linkedHashMap;
    }

    public final void initMini() {
        Context context;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25).isSupported && (context = CJPayHostInfo.applicationContext) != null && ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            C136992ca3.LIZ().LIZ("newcjpaysdk", CJPayBasicUtils.getSettingsVersion(), (Map<String, String>) null);
        }
    }

    public final void registerCJPayXbridge() {
        ICJPayH5Service iCJPayH5Service;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 72).isSupported || (iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class)) == null) {
            return;
        }
        iCJPayH5Service.registerXBridgeMethods();
    }

    public final void releaseAllFromSubProcess() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34).isSupported) {
            return;
        }
        ((ICJPayMultiProcessService) CJPayServiceManager.getInstance().getIService(ICJPayMultiProcessService.class)).stop(CJPayHostInfo.applicationContext);
        releaseAll();
    }

    /* renamed from: com_android_ttcjpaysdk_ttcjpayapi_TTCJPayUtils_com_ss_android_ugc_aweme_lancet_TTCJPayUtilLancet_getInstance */
    public static TTCJPayUtils m16021x1d173758() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 94);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        TTCJPayUtils m16022xaf3f1def = m16022xaf3f1def();
        if (LocalTest.get().enableBoe() && TextUtils.equals(AppContextManager.INSTANCE.getChannel(), "local_test")) {
            m16022xaf3f1def.setServerType(2);
            m16022xaf3f1def.setBoeEnv(LocalTest.get().getBoeLane());
        }
        return m16022xaf3f1def;
    }

    public final void fastPayOnlySendRequest() {
        Context context;
        CJPayHostInfo cJPayHostInfo;
        CJPayHostInfo cJPayHostInfo2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 89).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        Map<String, String> map2 = null;
        if (cJPayHostInfo3 != null) {
            context = cJPayHostInfo3.LIZ();
        } else {
            context = null;
        }
        if (context != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.payRequestParams != null && (cJPayHostInfo2 = this.hostInfo) != null && cJPayHostInfo2.LIZIZ() != null) {
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null && (map = cJPayHostInfo4.payRequestParams) != null && !(!map.isEmpty())) {
                C137049caz.LIZIZ.LIZ();
                C2118a LIZ = C2118a.LIZ().LIZ(112);
                if (LIZ != null) {
                    LIZ.LIZIZ();
                    return;
                }
                return;
            }
            ICJPayFastPayService iCJPayFastPayService = (ICJPayFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayFastPayService.class);
            if (iCJPayFastPayService != null) {
                CJPayHostInfo cJPayHostInfo5 = this.hostInfo;
                if (cJPayHostInfo5 != null) {
                    map2 = cJPayHostInfo5.payRequestParams;
                }
                iCJPayFastPayService.fastPayOnlySendRequest(map2);
                return;
            }
            return;
        }
        C2118a LIZ2 = C2118a.LIZ().LIZ(112);
        if (LIZ2 != null) {
            LIZ2.LIZIZ();
        }
    }

    public final void myBankCard() {
        String str;
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 77).isSupported) {
            return;
        }
        C137048cay LIZ2 = C137048cay.LIZ();
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        String str2 = null;
        if (cJPayHostInfo2 != null) {
            str = cJPayHostInfo2.merchantId;
        } else {
            str = null;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            str2 = cJPayHostInfo3.appId;
        }
        if (LIZ2.LIZJ(str, str2)) {
            C137048cay.LIZ().LIZIZ(this.hostInfo);
        } else {
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null && (LIZ = cJPayHostInfo4.LIZ()) != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
                CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.MY_CARD, CJPayPageLoadTrace.Section.START);
                ICJPayFrontMyBankCardService iCJPayFrontMyBankCardService = (ICJPayFrontMyBankCardService) CJPayServiceManager.getInstance().getIService(ICJPayFrontMyBankCardService.class);
                if (iCJPayFrontMyBankCardService != null) {
                    iCJPayFrontMyBankCardService.startFrontMyBankCard(LIZ, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                }
            } else {
                C2118a.LIZ().LIZ(112).LIZIZ();
            }
        }
        releaseHostInfo();
    }

    public final void bdPay() {
        String str;
        String str2;
        String str3;
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        CJPayHostInfo cJPayHostInfo2;
        String str4;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40).isSupported) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.BD_COUNTER, CJPayPageLoadTrace.Section.START);
        String str5 = CJPayHostInfo.aid;
        String str6 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        String str7 = null;
        if (cJPayHostInfo3 != null) {
            str = cJPayHostInfo3.merchantId;
        } else {
            str = null;
        }
        monitorCounterParams("追光收银台", str5, str6, str);
        C137048cay LIZ2 = C137048cay.LIZ();
        CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
        if (cJPayHostInfo4 != null) {
            str2 = cJPayHostInfo4.merchantId;
        } else {
            str2 = null;
        }
        CJPayHostInfo cJPayHostInfo5 = this.hostInfo;
        if (cJPayHostInfo5 != null) {
            str3 = cJPayHostInfo5.appId;
        } else {
            str3 = null;
        }
        if (!LIZ2.LIZIZ(str2, str3)) {
            FWT.LIZ("caijing_cashdesk_request");
        }
        CJPayHostInfo cJPayHostInfo6 = this.hostInfo;
        if (cJPayHostInfo6 != null && (LIZ = cJPayHostInfo6.LIZ()) != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.payRequestParams != null && (cJPayHostInfo2 = this.hostInfo) != null && cJPayHostInfo2.LIZIZ() != null) {
            CJPayHostInfo cJPayHostInfo7 = this.hostInfo;
            if (cJPayHostInfo7 != null && cJPayHostInfo7.payRequestParams != null) {
                CJPayHostInfo cJPayHostInfo8 = this.hostInfo;
                if (cJPayHostInfo8 != null && (map = cJPayHostInfo8.payRequestParams) != null && map.isEmpty()) {
                    return;
                }
                C137048cay LIZ3 = C137048cay.LIZ();
                CJPayHostInfo cJPayHostInfo9 = this.hostInfo;
                if (cJPayHostInfo9 != null) {
                    str4 = cJPayHostInfo9.merchantId;
                } else {
                    str4 = null;
                }
                CJPayHostInfo cJPayHostInfo10 = this.hostInfo;
                if (cJPayHostInfo10 != null) {
                    str7 = cJPayHostInfo10.appId;
                }
                if (LIZ3.LIZIZ(str4, str7)) {
                    C137048cay.LIZ().LIZ(this.hostInfo);
                } else {
                    ICJPayCounterService iCJPayCounterService = (ICJPayCounterService) CJPayServiceManager.getInstance().getIService(ICJPayCounterService.class);
                    if (iCJPayCounterService != null) {
                        iCJPayCounterService.startCJPayCheckoutCounterActivity(LIZ, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                    }
                }
            } else {
                return;
            }
        } else {
            C2118a.LIZ().LIZ(112).LIZIZ();
        }
        releaseHostInfo();
    }

    public final void executeWithdraw() {
        String str;
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 65).isSupported) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.WITHDRAW, CJPayPageLoadTrace.Section.START);
        C137048cay LIZ2 = C137048cay.LIZ();
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        String str2 = null;
        if (cJPayHostInfo2 != null) {
            str = cJPayHostInfo2.merchantId;
        } else {
            str = null;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            str2 = cJPayHostInfo3.appId;
        }
        if (LIZ2.LIZLLL(str, str2)) {
            C137048cay.LIZ().LIZJ(this.hostInfo);
        } else {
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null && (LIZ = cJPayHostInfo4.LIZ()) != null && !TextUtils.isEmpty(CJPayHostInfo.did) && !TextUtils.isEmpty(CJPayHostInfo.aid) && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
                ICJPayWithdrawService iCJPayWithdrawService = (ICJPayWithdrawService) CJPayServiceManager.getInstance().getIService(ICJPayWithdrawService.class);
                if (iCJPayWithdrawService != null) {
                    iCJPayWithdrawService.startCJPayWithdrawActivity(LIZ, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                }
            } else {
                C2118a.LIZ().LIZ(112).LIZIZ();
            }
            FWT.LIZ("caijing_cashdesk_request");
        }
        releaseHostInfo();
    }

    public final void recharge() {
        String str;
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 76).isSupported) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.RECHARGE, CJPayPageLoadTrace.Section.START);
        C137048cay LIZ2 = C137048cay.LIZ();
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        String str2 = null;
        if (cJPayHostInfo2 != null) {
            str = cJPayHostInfo2.merchantId;
        } else {
            str = null;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            str2 = cJPayHostInfo3.appId;
        }
        if (LIZ2.m21715LJ(str, str2)) {
            C137048cay.LIZ().LIZLLL(this.hostInfo);
        } else {
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null && (LIZ = cJPayHostInfo4.LIZ()) != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
                ICJPayRechargeService iCJPayRechargeService = (ICJPayRechargeService) CJPayServiceManager.getInstance().getIService(ICJPayRechargeService.class);
                if (iCJPayRechargeService != null) {
                    iCJPayRechargeService.startCJPayRechargeActivity(LIZ, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                }
            } else {
                C2118a.LIZ().LIZ(112).LIZIZ();
            }
            FWT.LIZ("caijing_cashdesk_request");
        }
        releaseHostInfo();
    }

    public /* synthetic */ TTCJPayUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final TTCJPayUtils setAid(String str) {
        CJPayHostInfo.aid = str;
        return this;
    }

    public final TTCJPayUtils setAnimationResourceMap(Map<String, Integer> map) {
        CJPayHostInfo.animationResourceMap = map;
        return this;
    }

    public final TTCJPayUtils setAppUpdateVersion(String str) {
        CJPayHostInfo.appUpdateVersion = str;
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setBoeEnv(String str) {
        CJPayHostInfo.boeEnv = str;
        return this;
    }

    public final TTCJPayUtils setDid(String str) {
        CJPayHostInfo.did = str;
        return this;
    }

    public final void setFollowSystemTheme(boolean z) {
        CJPayHostInfo.isFollowSystemTheme = z;
    }

    public final TTCJPayUtils setHostInfo(CJPayHostInfo cJPayHostInfo) {
        this.hostInfo = cJPayHostInfo;
        return this;
    }

    public final void setInheritTheme(String str) {
        CJPayHostInfo.inheritTheme = str;
    }

    public final TTCJPayUtils setIsUsingGecko(boolean z) {
        CJPayHostInfo.isUsingGecko = z;
        return this;
    }

    public final TTCJPayUtils setLanguageTypeStr(String str) {
        CJPayHostInfo.languageTypeStr = str;
        return this;
    }

    public final void setRemoteDataHasInit(boolean z) {
        this.remoteDataHasInit = z;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setServerType(int i) {
        CJPayHostInfo.serverType = i;
        return this;
    }

    public final TTCJPayUtils setUid(String str) {
        CJPayHostInfo.uid = str;
        return this;
    }

    public final TTCJPayUtils setAppId(String str) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.appId = str;
        }
        return this;
    }

    public final TTCJPayUtils setExtraHeaderMap(HashMap<String, String> hashMap) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.extraHeaderMap = hashMap;
        }
        return this;
    }

    public final TTCJPayUtils setGameNewStyle(boolean z) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.isGameNewStyle = z;
        }
        return this;
    }

    public final TTCJPayUtils setIsTransCheckoutCounterActivityWhenLoading(boolean z) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.isTransCheckoutCounterActivityWhenLoading = z;
        }
        return this;
    }

    public final TTCJPayUtils setMerchantId(String str) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.merchantId = str;
        }
        return this;
    }

    public final TTCJPayUtils setNeedLoading(boolean z) {
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.needLoading = z;
        }
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setCustomActionListener(ICustomActionListener iCustomActionListener) {
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIIZILJ = iCustomActionListener;
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setEvent(TTCJPayEvent tTCJPayEvent) {
        Intrinsics.checkNotNullExpressionValue(C2118a.LIZ(), "");
        return this;
    }

    @Deprecated(message = "this function is deprecated!")
    public final TTCJPayUtils setOpenSchemeCallback(TTCJPayOpenSchemeInterface tTCJPayOpenSchemeInterface) {
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LIZLLL = tTCJPayOpenSchemeInterface;
        return this;
    }

    private final ICJPayBasisPaymentService.OnPayResultCallback getOnPayResultCallback(final String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 57);
        if (proxy.isSupported) {
            return (ICJPayBasisPaymentService.OnPayResultCallback) proxy.result;
        }
        return new ICJPayBasisPaymentService.OnPayResultCallback() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$getOnPayResultCallback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9322);
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onDisplayCMBEnterToast(Context context, String str2) {
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onCancel(int i) {
                C2118a LIZ;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported && (LIZ = C2118a.LIZ().LIZ(i)) != null) {
                    LIZ.LIZIZ();
                }
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onFailure(int i) {
                C2118a LIZ;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported && (LIZ = C2118a.LIZ().LIZ(i)) != null) {
                    LIZ.LIZIZ();
                }
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onSuccess(int i) {
                C2118a LIZ;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported && (LIZ = C2118a.LIZ().LIZ(i)) != null) {
                    LIZ.LIZIZ();
                }
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onShowErrorInfo(Context context, String str2) {
                C2118a LIZ;
                if (!PatchProxy.proxy(new Object[]{context, str2}, this, changeQuickRedirect, false, 4).isSupported && (LIZ = C2118a.LIZ().LIZ(102)) != null) {
                    LIZ.LIZIZ();
                }
            }

            @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService.OnPayResultCallback
            public final void onEvent(String str2, String str3) {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObject3;
                if (PatchProxy.proxy(new Object[]{str2, str3}, this, changeQuickRedirect, false, 5).isSupported) {
                    return;
                }
                C106862S5w.LIZ(str2);
                C137049caz c137049caz = C137049caz.LIZIZ;
                String str4 = str;
                if (!PatchProxy.proxy(new Object[]{str2, str3, str4}, c137049caz, C137049caz.LIZ, false, 9).isSupported) {
                    C106862S5w.LIZ(str2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject = CJPayParamsUtils.LIZ("", "");
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    } catch (Exception unused) {
                        jSONObject = jSONObject4;
                    }
                    try {
                        jSONObject2 = new JSONObject(str4).getJSONObject("track_info");
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                        try {
                            jSONObject3 = new JSONObject(str3);
                        } catch (Exception unused2) {
                            jSONObject3 = jSONObject6;
                            C2118a.LIZ().LIZ(str2, jSONObject, jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused3) {
                        jSONObject2 = jSONObject5;
                        jSONObject3 = jSONObject6;
                        C2118a.LIZ().LIZ(str2, jSONObject, jSONObject2, jSONObject3);
                    }
                    C2118a.LIZ().LIZ(str2, jSONObject, jSONObject2, jSONObject3);
                }
            }
        };
    }

    public final void openH5ByScheme(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 70).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        openH5ByScheme(str, -1);
    }

    public final TTCJPayUtils setIsUsingTTNet(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo.isUsingTTNet = z;
        CJPayNetworkManager.setUsingTTNet(z);
        return this;
    }

    public final void setNetworkInterceptor(Interceptor interceptor) {
        if (PatchProxy.proxy(new Object[]{interceptor}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        CJPayNetworkManager.addTTNetInterceptor(interceptor);
    }

    public final TTCJPayUtils setRequestParams(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.LIZ(map);
        }
        return this;
    }

    public final TTCJPayUtils setRiskInfoParams(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.LIZIZ(map);
        }
        return this;
    }

    public final TTCJPayUtils setTitleBitmap(Bitmap bitmap) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(bitmap);
        CJPayHostInfo.titleBitmap = bitmap;
        return this;
    }

    public final TTCJPayUtils setTitleStr(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(str);
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.titleStr = str;
        }
        return this;
    }

    private final void addTrackInfo(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42).isSupported && str != null) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("track_info");
                C2118a LIZ = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                LIZ.LJIJI = optJSONObject;
            } catch (Exception unused) {
            }
        }
    }

    public final void openOCR(ICJPayServiceRetCallBack iCJPayServiceRetCallBack) {
        if (PatchProxy.proxy(new Object[]{iCJPayServiceRetCallBack}, this, changeQuickRedirect, false, 84).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("min_length", 13);
            jSONObject.put("max_length", 23);
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        openOCR(jSONObject2, iCJPayServiceRetCallBack);
    }

    public final TTCJPayUtils setBlockDialog(IBlockDialog iBlockDialog) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iBlockDialog}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(iBlockDialog);
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIILL = iBlockDialog;
        return this;
    }

    public final TTCJPayUtils setContext(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.LIZ(context);
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIILJJIL = this.generalPayCallback;
        return this;
    }

    public final TTCJPayUtils setCustomerServiceCallback(ICustomerServiceCallback iCustomerServiceCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iCustomerServiceCallback}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(iCustomerServiceCallback);
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIJ = iCustomerServiceCallback;
        return this;
    }

    public final TTCJPayUtils setFaceLive(TTCJPayDoFaceLive tTCJPayDoFaceLive) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tTCJPayDoFaceLive}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIIJJI = tTCJPayDoFaceLive;
        return this;
    }

    public final TTCJPayUtils setFontScale(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        if (this.hostInfo != null) {
            CJPayHostInfo.fontScale = f;
        }
        return this;
    }

    public final TTCJPayUtils setFromFastPay(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.fromFastPayType = Integer.valueOf(i);
        }
        return this;
    }

    public final TTCJPayUtils setH5NotificationCallback(IH5NotificationCallback iH5NotificationCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iH5NotificationCallback}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(iH5NotificationCallback);
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIILLIIL = iH5NotificationCallback;
        return this;
    }

    public final TTCJPayUtils setIntegratedHostDomain(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 92);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        if (str != null && str.length() != 0 && (true ^ StringsKt__StringsJVMKt.isBlank(str)) && StringsKt__StringsJVMKt.startsWith$default(str, "https:", false, 2, null)) {
            CJPayHostInfo.integratedHostDomain = str;
        }
        return this;
    }

    public final <T> TTCJPayUtils setLoadingAdapter(AbstractC135508cC7<T> abstractC135508cC7) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC135508cC7}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJI = abstractC135508cC7;
        return this;
    }

    public final TTCJPayUtils setMonitor(TTCJPayMonitor tTCJPayMonitor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tTCJPayMonitor}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIIIZ = tTCJPayMonitor;
        return this;
    }

    public final TTCJPayUtils setNetworkErrorAdapter(AbstractC135665cEe abstractC135665cEe) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC135665cEe}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJII = abstractC135665cEe;
        return this;
    }

    public final TTCJPayUtils setObserver(TTCJPayObserver tTCJPayObserver) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tTCJPayObserver}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIIIIZZ = tTCJPayObserver;
        return this;
    }

    public final TTCJPayUtils setOpenSchemeWithContextCallback(TTCJPayOpenSchemeWithContextInterface tTCJPayOpenSchemeWithContextInterface) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tTCJPayOpenSchemeWithContextInterface}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.f25443LJ = tTCJPayOpenSchemeWithContextInterface;
        return this;
    }

    public final TTCJPayUtils setPhoneCarrierService(ITTCJPayPhoneCarrierService iTTCJPayPhoneCarrierService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iTTCJPayPhoneCarrierService}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C106862S5w.LIZ(iTTCJPayPhoneCarrierService);
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIIL = iTTCJPayPhoneCarrierService;
        return this;
    }

    public final TTCJPayUtils setScreenOrientationType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            cJPayHostInfo.mScreenOrientationType = Integer.valueOf(i);
        }
        CJPayHostInfo.screenOrientationType = Integer.valueOf(i);
        return this;
    }

    public final TTCJPayUtils setToastAdapter(AbstractC137059cb9 abstractC137059cb9) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC137059cb9}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJFF = abstractC137059cb9;
        return this;
    }

    public final TTCJPayUtils setTrackInfo(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIJI = jSONObject;
        return this;
    }

    private final TTCJPayUtils setOuterPayCallback(CJOuterPayCallback cJOuterPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJOuterPayCallback}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.LJIIJ != null) {
            C2118a LIZ2 = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            CJOuterPayCallback cJOuterPayCallback2 = LIZ2.LJIIJ;
            JSONObject jSONObject = new JSONObject();
            C135465cBQ.LIZ(jSONObject, C2521l.LJIIJ, "1");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            cJOuterPayCallback2.onPayResult(jSONObject2);
        }
        C2118a LIZ3 = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        LIZ3.LJIIJ = cJOuterPayCallback;
        return this;
    }

    public final void fastPayShowLoading(int i) {
        Context LIZ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 87).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        Map<String, String> map = null;
        if (cJPayHostInfo != null && (LIZ = cJPayHostInfo.LIZ()) != null) {
            ICJPayFastPayService iCJPayFastPayService = (ICJPayFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayFastPayService.class);
            if (iCJPayFastPayService != null) {
                CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
                if (cJPayHostInfo2 != null) {
                    map = cJPayHostInfo2.payRequestParams;
                }
                iCJPayFastPayService.fastPayShowLoading(LIZ, map, "bytepay", i, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), new IFastPayFailureCallback() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$fastPayShowLoading$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9319);
                    }

                    @Override // com.android.ttcjpaysdk.base.service.IFastPayFailureCallback
                    public final void openCommonCashier(int i2) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        TTCJPayUtils.this.setFromFastPay(i2);
                        TTCJPayUtils.this.execute();
                    }
                });
                return;
            }
            return;
        }
        C2118a LIZ2 = C2118a.LIZ().LIZ(112);
        if (LIZ2 != null) {
            LIZ2.LIZIZ();
        }
    }

    public final void tradeManager(String str) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 79).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        new StringBuilder();
        String LIZJ = CJPayParamsUtils.LIZJ();
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        Context context = null;
        if (cJPayHostInfo != null) {
            str2 = cJPayHostInfo.merchantId;
        } else {
            str2 = null;
        }
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        if (cJPayHostInfo2 != null) {
            str3 = cJPayHostInfo2.appId;
        } else {
            str3 = null;
        }
        String m25081C = C0002O.m25081C(LIZJ, "/usercenter/paymng?merchant_id=", str2, "&app_id=", str3, "&smch_id=", str);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            context = cJPayHostInfo3.LIZ();
        }
        h5ParamBuilder.setContext(context);
        h5ParamBuilder.setUrl(m25081C);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        if (iCJPayH5Service != null) {
            iCJPayH5Service.startH5(h5ParamBuilder);
        }
        releaseHostInfo();
    }

    public final void tradeRecord(String str) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 78).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        new StringBuilder();
        String LIZJ = CJPayParamsUtils.LIZJ();
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        Context context = null;
        if (cJPayHostInfo != null) {
            str2 = cJPayHostInfo.merchantId;
        } else {
            str2 = null;
        }
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        if (cJPayHostInfo2 != null) {
            str3 = cJPayHostInfo2.appId;
        } else {
            str3 = null;
        }
        String m25081C = C0002O.m25081C(LIZJ, "/usercenter/transaction/list?merchant_id=", str2, "&app_id=", str3, "&smch_id=", str);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            context = cJPayHostInfo3.LIZ();
        }
        h5ParamBuilder.setContext(context);
        h5ParamBuilder.setUrl(m25081C);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        if (iCJPayH5Service != null) {
            iCJPayH5Service.startH5(h5ParamBuilder);
        }
        releaseHostInfo();
    }

    private final void payCallLoading(String str) {
        Context context;
        Context context2;
        Boolean bool;
        C136229cNk c136229cNk;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 52).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("loading_status");
            String optString2 = jSONObject.optString("loading_text");
            if (optString.equals("1")) {
                C136757cWG c136757cWG = C136757cWG.f18084LJ;
                CJPayHostInfo cJPayHostInfo = this.hostInfo;
                if (cJPayHostInfo != null) {
                    context = cJPayHostInfo.LIZ();
                } else {
                    context = null;
                }
                if (!c136757cWG.LIZ(context, optString2)) {
                    C136757cWG c136757cWG2 = C136757cWG.f18084LJ;
                    CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
                    if (cJPayHostInfo2 != null) {
                        context2 = cJPayHostInfo2.LIZ();
                    } else {
                        context2 = null;
                    }
                    if (!PatchProxy.proxy(new Object[]{context2}, c136757cWG2, C136757cWG.LIZ, false, 3).isSupported && context2 != null && (context2 instanceof Activity) && C136757cWG.LIZJ) {
                        if (C136757cWG.LIZIZ != null) {
                            C136229cNk c136229cNk2 = C136757cWG.LIZIZ;
                            if (c136229cNk2 != null) {
                                bool = c136229cNk2.LIZJ();
                            } else {
                                bool = null;
                            }
                            if (Intrinsics.areEqual(bool, Boolean.TRUE) && (c136229cNk = C136757cWG.LIZIZ) != null) {
                                c136229cNk.LIZIZ();
                            }
                            C136757cWG.LIZIZ = null;
                        }
                        C136229cNk c136229cNk3 = new C136229cNk(context2);
                        C136757cWG.LIZIZ = c136229cNk3;
                        if (!PatchProxy.proxy(new Object[0], c136229cNk3, C136229cNk.LIZ, false, 3).isSupported) {
                            DialogC137460chc dialogC137460chc = c136229cNk3.LIZJ;
                            if (dialogC137460chc != null) {
                                C116971W2r.LIZJ(dialogC137460chc);
                            }
                            LinearLayout linearLayout = c136229cNk3.LIZLLL;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            CJPayTextLoadingView cJPayTextLoadingView = c136229cNk3.f18000LJ;
                            if (cJPayTextLoadingView != null) {
                                cJPayTextLoadingView.setVisibility(0);
                            }
                            CJPayTextLoadingView cJPayTextLoadingView2 = c136229cNk3.f18000LJ;
                            if (cJPayTextLoadingView2 != null) {
                                cJPayTextLoadingView2.show();
                            }
                        }
                        C136757cWG.LIZLLL.start();
                        return;
                    }
                    return;
                }
                return;
            }
            C136757cWG.f18084LJ.LIZ();
        } catch (Exception unused) {
        }
    }

    public final void fastPay(int i) {
        Context context;
        CJPayHostInfo cJPayHostInfo;
        CJPayHostInfo cJPayHostInfo2;
        Map<String, String> map;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 86).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        Map<String, String> map2 = null;
        if (cJPayHostInfo3 != null) {
            context = cJPayHostInfo3.LIZ();
        } else {
            context = null;
        }
        if (context != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.payRequestParams != null && (cJPayHostInfo2 = this.hostInfo) != null && cJPayHostInfo2.LIZIZ() != null) {
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null && (map = cJPayHostInfo4.payRequestParams) != null && !(true ^ map.isEmpty())) {
                C137049caz.LIZIZ.LIZ();
                C2118a LIZ = C2118a.LIZ().LIZ(112);
                if (LIZ != null) {
                    LIZ.LIZIZ();
                    return;
                }
                return;
            }
            ICJPayFastPayService iCJPayFastPayService = (ICJPayFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayFastPayService.class);
            if (iCJPayFastPayService != null) {
                CJPayHostInfo cJPayHostInfo5 = this.hostInfo;
                if (cJPayHostInfo5 != null) {
                    map2 = cJPayHostInfo5.payRequestParams;
                }
                iCJPayFastPayService.fastPay(context, map2, "bytepay", i, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), new IFastPayFailureCallback() { // from class: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils$fastPay$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9318);
                    }

                    @Override // com.android.ttcjpaysdk.base.service.IFastPayFailureCallback
                    public final void openCommonCashier(int i2) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        TTCJPayUtils.this.setFromFastPay(i2);
                        TTCJPayUtils.this.execute();
                    }
                });
                return;
            }
            return;
        }
        C2118a LIZ2 = C2118a.LIZ().LIZ(112);
        if (LIZ2 != null) {
            LIZ2.LIZIZ();
        }
    }

    public final TTCJPayUtils setLoginToken(Map<String, String> map) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        if (!PatchProxy.proxy(new Object[]{map}, CJPayHostInfo.Companion, C137038can.LIZ, false, 6).isSupported && map != null) {
            String str = "";
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                i++;
                if (i == map.size()) {
                    str = str + key + '=' + value;
                } else {
                    str = str + key + '=' + value + ';';
                }
            }
            CJPayHostInfo.loginTokenMap = map;
        }
        return this;
    }

    private final void execute(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Context context;
        CJPayHostInfo cJPayHostInfo;
        CJPayHostInfo cJPayHostInfo2;
        String str7;
        String str8;
        Map<String, String> map;
        String str9;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        Map<String, String> map5;
        Map<String, String> map6;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36).isSupported) {
            return;
        }
        C137049caz c137049caz = C137049caz.LIZIZ;
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        String str10 = null;
        if (cJPayHostInfo3 != null && (map6 = cJPayHostInfo3.payRequestParams) != null) {
            str2 = map6.get("merchant_id");
        } else {
            str2 = null;
        }
        CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
        if (cJPayHostInfo4 != null && (map5 = cJPayHostInfo4.payRequestParams) != null) {
            str3 = map5.get(Constants.APP_ID);
        } else {
            str3 = null;
        }
        c137049caz.LIZ("wallet_rd_cashier_call_execute", str2, str3);
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.INTEGRATED_COUNTER, CJPayPageLoadTrace.Section.START);
        new StringBuilder();
        String m25086C = C0002O.m25086C(str, "_聚合收银台");
        String str11 = CJPayHostInfo.aid;
        String str12 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo5 = this.hostInfo;
        if (cJPayHostInfo5 != null) {
            str4 = cJPayHostInfo5.merchantId;
        } else {
            str4 = null;
        }
        monitorCounterParams(m25086C, str11, str12, str4);
        C137048cay LIZ = C137048cay.LIZ();
        CJPayHostInfo cJPayHostInfo6 = this.hostInfo;
        if (cJPayHostInfo6 != null) {
            str5 = cJPayHostInfo6.merchantId;
        } else {
            str5 = null;
        }
        CJPayHostInfo cJPayHostInfo7 = this.hostInfo;
        if (cJPayHostInfo7 != null) {
            str6 = cJPayHostInfo7.appId;
        } else {
            str6 = null;
        }
        if (!LIZ.LIZ(str5, str6)) {
            FWT.LIZ("caijing_cashdesk_request");
        }
        CJPayHostInfo cJPayHostInfo8 = this.hostInfo;
        if (cJPayHostInfo8 != null) {
            context = cJPayHostInfo8.LIZ();
        } else {
            context = null;
        }
        if (context != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.payRequestParams != null && (cJPayHostInfo2 = this.hostInfo) != null && cJPayHostInfo2.LIZIZ() != null) {
            CJPayHostInfo cJPayHostInfo9 = this.hostInfo;
            if (cJPayHostInfo9 != null && (map4 = cJPayHostInfo9.payRequestParams) != null && !(true ^ map4.isEmpty())) {
                C137049caz.LIZIZ.LIZIZ("wallet_rd_illegal_execute_params", "112", "request params is null");
                C137049caz.LIZIZ.LIZIZ("wallet_cashier_imp_failed", "112", "request params is null");
                C2118a LIZ2 = C2118a.LIZ().LIZ(112);
                if (LIZ2 != null) {
                    LIZ2.LIZIZ();
                    return;
                }
                return;
            }
            C137049caz c137049caz2 = C137049caz.LIZIZ;
            CJPayHostInfo cJPayHostInfo10 = this.hostInfo;
            if (cJPayHostInfo10 != null && (map3 = cJPayHostInfo10.payRequestParams) != null) {
                str7 = map3.get("merchant_id");
            } else {
                str7 = null;
            }
            CJPayHostInfo cJPayHostInfo11 = this.hostInfo;
            if (cJPayHostInfo11 != null && (map2 = cJPayHostInfo11.payRequestParams) != null) {
                str8 = map2.get(Constants.APP_ID);
            } else {
                str8 = null;
            }
            c137049caz2.LIZ("wallet_rd_cashier_call_execute_successfully", str7, str8);
            CJPayHostInfo cJPayHostInfo12 = this.hostInfo;
            if (cJPayHostInfo12 != null) {
                map = cJPayHostInfo12.payRequestParams;
            } else {
                map = null;
            }
            C137048cay LIZ3 = C137048cay.LIZ();
            CJPayHostInfo cJPayHostInfo13 = this.hostInfo;
            if (cJPayHostInfo13 != null) {
                str9 = cJPayHostInfo13.merchantId;
            } else {
                str9 = null;
            }
            CJPayHostInfo cJPayHostInfo14 = this.hostInfo;
            if (cJPayHostInfo14 != null) {
                str10 = cJPayHostInfo14.appId;
            }
            if (LIZ3.LIZ(str9, str10)) {
                CJPayHostInfo cJPayHostInfo15 = this.hostInfo;
                if (cJPayHostInfo15 != null) {
                    cJPayHostInfo15.mScreenOrientationType = 0;
                }
                C137048cay.LIZ().LIZ(this.hostInfo, map);
            } else {
                ICJPayIntegratedCounterService iCJPayIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class);
                if (iCJPayIntegratedCounterService != null) {
                    iCJPayIntegratedCounterService.startCounterActivity(context, str, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                }
            }
        } else {
            C137049caz.LIZIZ.LIZIZ("wallet_cashier_imp_failed", "112", "params illegal");
            C2118a LIZ4 = C2118a.LIZ().LIZ(112);
            if (LIZ4 != null) {
                LIZ4.LIZIZ();
            }
        }
        releaseHostInfo();
    }

    private final void payCallCJPayWebView(String str, IH5PayCallback iH5PayCallback) {
        if (PatchProxy.proxy(new Object[]{str, iH5PayCallback}, this, changeQuickRedirect, false, 50).isSupported) {
            return;
        }
        try {
            int LIZ = C2118a.LIZ().LIZ(iH5PayCallback);
            String optString = new JSONObject(str).optString("schema");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            if (optString.length() > 0) {
                openH5ByScheme(optString, LIZ);
            }
        } catch (Exception unused) {
        }
    }

    private final void aliPayIndependentSign(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.proxy(new Object[]{context2, str}, this, changeQuickRedirect, false, 55).isSupported) {
            return;
        }
        ICJPayAliPaymentService iCJPayAliPaymentService = (ICJPayAliPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appId");
            String optString2 = jSONObject.optString("merchantId");
            String optString3 = jSONObject.optString("sign_params");
            if (iCJPayAliPaymentService != null) {
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                iCJPayAliPaymentService.independentSign((Activity) context2, optString3, optString, optString2, TTCJPayUtils$aliPayIndependentSign$2$1.INSTANCE);
                if (Unit.INSTANCE != null) {
                    return;
                }
            }
        }
        C2118a LIZ = C2118a.LIZ().LIZ(112);
        if (LIZ != null) {
            LIZ.LIZIZ();
        }
    }

    public final void openOCR(String str, ICJPayServiceRetCallBack iCJPayServiceRetCallBack) {
        String str2;
        Context context;
        String str3;
        Map<String, String> LIZIZ;
        if (PatchProxy.proxy(new Object[]{str, iCJPayServiceRetCallBack}, this, changeQuickRedirect, false, 83).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ICJPayOCRService iCJPayOCRService = (ICJPayOCRService) CJPayServiceManager.getInstance().getIService(ICJPayOCRService.class);
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        String str4 = null;
        if (cJPayHostInfo != null && (LIZIZ = cJPayHostInfo.LIZIZ()) != null) {
            str2 = LIZIZ.toString();
        } else {
            str2 = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (iCJPayOCRService != null) {
            CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
            if (cJPayHostInfo2 != null) {
                context = cJPayHostInfo2.LIZ();
            } else {
                context = null;
            }
            CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
            if (cJPayHostInfo3 != null) {
                str3 = cJPayHostInfo3.merchantId;
            } else {
                str3 = null;
            }
            CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
            if (cJPayHostInfo4 != null) {
                str4 = cJPayHostInfo4.appId;
            }
            iCJPayOCRService.startOCR(context, str3, str4, str, jSONObject.toString(), str2, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), iCJPayServiceRetCallBack);
        }
    }

    private final void independentBindCard(String str, String str2) {
        Context context;
        CJPayHostInfo cJPayHostInfo;
        CJPayHostInfo cJPayHostInfo2;
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 37).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
        if (cJPayHostInfo3 != null) {
            context = cJPayHostInfo3.LIZ();
        } else {
            context = null;
        }
        FWT.LIZ("caijing_cashdesk_request");
        if (context != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.payRequestParams != null && (cJPayHostInfo2 = this.hostInfo) != null && cJPayHostInfo2.LIZIZ() != null) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null && (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) != null) {
                ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_INDEPENDENT;
                NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
                normalBindCardBean.setNeedAuthGuide(Boolean.FALSE);
                normalBindCardBean.setBizOrderType("card_sign");
                normalBindCardBean.setBindSourceType(9);
                normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.IndependentBindCard);
                normalBindCardBean.setHostInfoJSON(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                normalBindCardBean.setSource(str);
                normalBindCardBean.setBindCardInfo(str2);
                iCJPayNormalBindCardService.startBindCardProcess(activity, bindCardType, normalBindCardBean, null);
            }
        } else {
            C2118a LIZ = C2118a.LIZ().LIZ(4111);
            if (LIZ != null) {
                LIZ.LIZIZ();
            }
        }
        releaseHostInfo();
    }

    private final void payOpenHostScheme(String str, IH5PayCallback iH5PayCallback) {
        String str2;
        Context LIZ;
        if (PatchProxy.proxy(new Object[]{str, iH5PayCallback}, this, changeQuickRedirect, false, 49).isSupported) {
            return;
        }
        try {
            int LIZ2 = C2118a.LIZ().LIZ(iH5PayCallback);
            String optString = new JSONObject(str).optString("schema");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            if (optString.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(optString);
                Context context = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) optString, (CharSequence) "?", false, 2, (Object) null)) {
                    str2 = "&callback_id=" + LIZ2;
                } else {
                    str2 = "?callback_id=" + LIZ2;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                C2118a LIZ3 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.f25443LJ != null) {
                    C2118a LIZ4 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    TTCJPayOpenSchemeWithContextInterface tTCJPayOpenSchemeWithContextInterface = LIZ4.f25443LJ;
                    CJPayHostInfo cJPayHostInfo = this.hostInfo;
                    if (cJPayHostInfo != null) {
                        context = cJPayHostInfo.LIZ();
                    }
                    tTCJPayOpenSchemeWithContextInterface.openScheme(context, sb2);
                    return;
                }
                C2118a LIZ5 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                if (LIZ5.LIZLLL != null) {
                    C2118a LIZ6 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                    LIZ6.LIZLLL.openScheme(sb2);
                    return;
                }
                CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
                if (cJPayHostInfo2 != null) {
                    context = cJPayHostInfo2.LIZ();
                }
                if (context instanceof Activity) {
                    C126771Zun LIZIZ = C126771Zun.LIZIZ();
                    CJPayHostInfo cJPayHostInfo3 = this.hostInfo;
                    if (cJPayHostInfo3 != null && (LIZ = cJPayHostInfo3.LIZ()) != null) {
                        LIZIZ.LIZ((Activity) LIZ, sb2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                C126771Zun.LIZIZ().LIZ(sb2);
            }
        } catch (Throwable unused) {
        }
    }

    private final void openH5ByScheme(String str, int i) {
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        String str2;
        String str3;
        CJPayHostInfo cJPayHostInfo2;
        CJPayHostInfo cJPayHostInfo3;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 69).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo4 = this.hostInfo;
        String str4 = null;
        if (cJPayHostInfo4 != null && (LIZ = cJPayHostInfo4.LIZ()) != null && !TextUtils.isEmpty(str) && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
            Uri parse = Uri.parse(str);
            String str5 = "";
            if (parse != null) {
                str5 = parse.getQueryParameter("merchant_id");
                str2 = parse.getQueryParameter(Constants.APP_ID);
                String queryParameter = parse.getQueryParameter("inherit_theme");
                if (!TextUtils.isEmpty(str5) && (cJPayHostInfo3 = this.hostInfo) != null) {
                    cJPayHostInfo3.merchantId = str5;
                }
                if (!TextUtils.isEmpty(str2) && (cJPayHostInfo2 = this.hostInfo) != null) {
                    cJPayHostInfo2.appId = str2;
                }
                setInheritTheme(queryParameter);
            } else {
                str2 = str5;
            }
            if (StringsKt__StringsJVMKt.startsWith$default(str, "sslocal://cjpay/bankcardlist", false, 2, null)) {
                if (parse != null) {
                    myBankCard();
                }
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "sslocal://cjpay/bdtopupdesk", false, 2, null)) {
                if (parse != null) {
                    setRequestParams(getRequestParamsMap());
                    recharge();
                }
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "sslocal://cjpay/bdwithdrawaldesk", false, 2, null)) {
                if (parse != null) {
                    setRequestParams(getRequestParamsMap());
                    executeWithdraw();
                }
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "sslocal://cjpay/quickbindsign", false, 2, null)) {
                EventManager.INSTANCE.notify(new C135930cIv(C135931cIw.LIZ(), str));
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "sslocal://cjpay/bindcardpage", false, 2, null)) {
                EventManager.INSTANCE.notify(new C135930cIv(C135931cIw.LIZIZ(), str));
            } else {
                if (parse != null) {
                    str3 = parse.getQueryParameter("enter_from");
                } else {
                    str3 = null;
                }
                if (parse != null) {
                    str4 = parse.getQueryParameter(PushConstants.WEB_URL);
                }
                ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
                if (Intrinsics.areEqual("deeplink", str3) && iCJPayH5Service != null && !iCJPayH5Service.isWhiteUrl(str4)) {
                    if (!PatchProxy.proxy(new Object[]{str5, str2, str4}, C137049caz.LIZIZ, C137049caz.LIZ, false, 5).isSupported) {
                        try {
                            JSONObject LIZ2 = CJPayParamsUtils.LIZ(str5, str2);
                            LIZ2.put(PushConstants.WEB_URL, str4);
                            C2118a.LIZ().LIZ("wallet_rd_h5_illegal_from_deep_link", LIZ2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                H5SchemeParamBuilder h5SchemeParamBuilder = new H5SchemeParamBuilder();
                h5SchemeParamBuilder.setCallbackId(i);
                h5SchemeParamBuilder.setContext(LIZ);
                h5SchemeParamBuilder.setUrl(str);
                h5SchemeParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                if (iCJPayH5Service != null) {
                    iCJPayH5Service.startH5ByScheme(h5SchemeParamBuilder);
                }
            }
        } else {
            C2118a LIZ3 = C2118a.LIZ().LIZ(107);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
        releaseHostInfo();
    }

    public final void aliPay(Context context, String str, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, onPayResultCallback}, this, changeQuickRedirect, false, 64).isSupported) {
            return;
        }
        ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
        if (iCJPayBasisPaymentService != null) {
            iCJPayBasisPaymentService.pay(context, str, "", onPayResultCallback, null, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    public final void executeCloseAndCallback(Context context, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject}, this, changeQuickRedirect, false, 74).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str, jSONObject);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service == null) {
            return;
        }
        iCJPayH5Service.handleCloseCallback(context, jSONObject);
    }

    private final void payCallAliPay(String str, String str2, IH5PayCallback iH5PayCallback) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback}, this, changeQuickRedirect, false, 44).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            if (!TextUtils.isEmpty(str)) {
                addTrackInfo(str2);
                CJPayHostInfo cJPayHostInfo = this.hostInfo;
                if (cJPayHostInfo != null) {
                    context = cJPayHostInfo.LIZ();
                } else {
                    context = null;
                }
                aliPay(context, str, getOnPayResultCallback(str2));
                return;
            }
            C2118a LIZ2 = C2118a.LIZ().LIZ(112);
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    private final void payCallWxSign(String str, String str2, IH5PayCallback iH5PayCallback) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback}, this, changeQuickRedirect, false, 51).isSupported) {
            return;
        }
        try {
            String optString = new JSONObject(str).optString("MwebUrl");
            if (optString != null && optString.length() != 0) {
                C2118a LIZ = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                LIZ.LJIILIIL = iH5PayCallback;
                ICJPayWXIndependentSignService iCJPayWXIndependentSignService = (ICJPayWXIndependentSignService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
                if (iCJPayWXIndependentSignService != null) {
                    CJPayHostInfo cJPayHostInfo = this.hostInfo;
                    if (cJPayHostInfo != null) {
                        context = cJPayHostInfo.LIZ();
                    } else {
                        context = null;
                    }
                    iCJPayWXIndependentSignService.independentSign(context, optString, str2, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
                    return;
                }
                return;
            }
            C2118a LIZ2 = C2118a.LIZ().LIZ(112);
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    public final boolean startOuterPay(Activity activity, Intent intent, CJOuterPayCallback cJOuterPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, intent, cJOuterPayCallback}, this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(activity, intent, cJOuterPayCallback);
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo == null || cJPayHostInfo.LIZ() == null) {
            return false;
        }
        setOuterPayCallback(cJOuterPayCallback);
        ICJPayIntegratedCounterService iCJPayIntegratedCounterService = (ICJPayIntegratedCounterService) CJPayServiceManager.getInstance().getIService(ICJPayIntegratedCounterService.class);
        if (iCJPayIntegratedCounterService != null) {
            iCJPayIntegratedCounterService.startOuterPayActivity(activity, intent, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        FWT.LIZ("caijing_cashdesk_request");
        return true;
    }

    private final void payCallDyCounter(String str, String str2, IH5PayCallback iH5PayCallback) {
        int i;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback}, this, changeQuickRedirect, false, 46).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.has("show_loading")) {
                    i = jSONObject2.optInt("show_loading");
                } else {
                    i = 0;
                }
                addTrackInfo(str2);
            } else {
                i = 0;
            }
            JSONArray names = jSONObject.names();
            if (names != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = names.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = names.get(i2);
                    if (obj != null) {
                        String str3 = (String) obj;
                        Object obj2 = names.get(i2);
                        if (obj2 != null) {
                            String string = jSONObject.getString((String) obj2);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            linkedHashMap.put(str3, string);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                if (i == 1) {
                    z = true;
                }
                setNeedLoading(z);
                setRequestParams(linkedHashMap);
                bdPay();
                return;
            }
            C2118a LIZ2 = C2118a.LIZ().LIZ(112);
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    private final void payCallIndependentBindCard(String str, String str2, IH5PayCallback iH5PayCallback) {
        String str3;
        String str4;
        int i;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback}, this, changeQuickRedirect, false, 48).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
                str4 = str3;
                i = 0;
            } else {
                JSONObject jSONObject2 = new JSONObject(str2);
                JSONObject optJSONObject = jSONObject2.optJSONObject("track_info");
                C2118a LIZ2 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                LIZ2.LJIJI = optJSONObject;
                if (jSONObject2.has("show_loading")) {
                    i = jSONObject2.optInt("show_loading");
                } else {
                    i = 0;
                }
                if (optJSONObject == null || !optJSONObject.has("source")) {
                    str4 = "";
                } else {
                    str4 = optJSONObject.optString("source");
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("bind_card_info");
                if (optJSONObject2 == null || (str3 = optJSONObject2.toString()) == null) {
                    str3 = "";
                }
            }
            JSONArray names = jSONObject.names();
            if (names != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = names.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = names.get(i2);
                    if (obj != null) {
                        String str5 = (String) obj;
                        Object obj2 = names.get(i2);
                        if (obj2 != null) {
                            String string = jSONObject.getString((String) obj2);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            linkedHashMap.put(str5, string);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                if (i == 1) {
                    z = true;
                }
                setNeedLoading(z);
                setRequestParams(linkedHashMap);
                setMerchantId(linkedHashMap.get("merchant_id"));
                setAppId(linkedHashMap.get(Constants.APP_ID));
                independentBindCard(str4, str3);
                return;
            }
            C2118a LIZ3 = C2118a.LIZ().LIZ(4111);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ4 = C2118a.LIZ().LIZ(4111);
            if (LIZ4 != null) {
                LIZ4.LIZIZ();
            }
        }
    }

    private final void payCallInnerDyPay(String str, String str2, IH5PayCallback iH5PayCallback) {
        String str3;
        String str4;
        boolean z;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback}, this, changeQuickRedirect, false, 47).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            String optString = new JSONObject(str).optString("zg_info");
            if (optString != null) {
                JSONObject jSONObject = new JSONObject();
                if (TextUtils.isEmpty(str2)) {
                    str3 = "";
                    str4 = str3;
                    z = true;
                } else {
                    jSONObject = new JSONObject(str2);
                    JSONObject optJSONObject = jSONObject.optJSONObject("track_info");
                    C2118a LIZ2 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    LIZ2.LJIJI = optJSONObject;
                    if (optJSONObject == null || !optJSONObject.has("source")) {
                        str3 = "";
                    } else {
                        str3 = optJSONObject.optString("source");
                        Intrinsics.checkNotNullExpressionValue(str3, "");
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("bind_card_info");
                    if (optJSONObject2 == null || (str4 = optJSONObject2.toString()) == null) {
                        str4 = "";
                    }
                    z = jSONObject.optBoolean("closeWebview", true);
                }
                frontPay(optString, str3, str4, z, jSONObject);
                return;
            }
            C137049caz.LIZIZ.LIZ("112", "zgInfo is null");
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        } catch (Exception e) {
            C137049caz c137049caz = C137049caz.LIZIZ;
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            c137049caz.LIZ("112", stackTraceString);
            C2118a LIZ4 = C2118a.LIZ().LIZ(112);
            if (LIZ4 != null) {
                LIZ4.LIZIZ();
            }
        }
    }

    @Deprecated(message = "this function is deprecated!", replaceWith = @ReplaceWith(expression = "execute()", imports = {}))
    public final void executeAggregatePayment(int i, String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        execute();
    }

    public final void authAlipay(Activity activity, String str, boolean z, TTCJPayAlipayAuthCallback tTCJPayAlipayAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), tTCJPayAlipayAuthCallback}, this, changeQuickRedirect, false, 85).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, str, tTCJPayAlipayAuthCallback);
        ICJPayAlipayAuthService iCJPayAlipayAuthService = (ICJPayAlipayAuthService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
        if (!TextUtils.isEmpty(str) && iCJPayAlipayAuthService != null) {
            iCJPayAlipayAuthService.authAlipay(activity, str, z, tTCJPayAlipayAuthCallback);
        }
        releaseHostInfo();
    }

    public final void handleXBridgeMethod(Context context, String str, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, iCJPayXBridgeCallback}, this, changeQuickRedirect, false, 71).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str, jSONObject, iCJPayXBridgeCallback);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service == null) {
            return;
        }
        iCJPayH5Service.handleXBridgeMethod(context, str, jSONObject, iCJPayXBridgeCallback);
    }

    public final void openH5(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 66).isSupported) {
            return;
        }
        openH5(str, str2, str3, str4, null);
    }

    private final void payCallWxPay(String str, String str2, String str3, IH5PayCallback iH5PayCallback) {
        String str4;
        Context context;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, iH5PayCallback}, this, changeQuickRedirect, false, 43).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            if (Intrinsics.areEqual(str2, "1")) {
                str4 = "MWEB";
            } else {
                str4 = "APP";
            }
            if (!TextUtils.isEmpty(str)) {
                addTrackInfo(str3);
                CJPayHostInfo cJPayHostInfo = this.hostInfo;
                if (cJPayHostInfo != null) {
                    context = cJPayHostInfo.LIZ();
                } else {
                    context = null;
                }
                wxPay(context, str, str4, getOnPayResultCallback(str3));
                return;
            }
            C2118a LIZ2 = C2118a.LIZ().LIZ(112);
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    public final void aliPay(Context context, String str, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, onPayResultCallback, onResultCallback}, this, changeQuickRedirect, false, 62).isSupported) {
            return;
        }
        ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class);
        if (iCJPayBasisPaymentService != null) {
            iCJPayBasisPaymentService.pay(context, str, "", onPayResultCallback, onResultCallback, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    public final void wxPay(Context context, String str, String str2, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onPayResultCallback}, this, changeQuickRedirect, false, 63).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
        if (iCJPayBasisPaymentService != null) {
            iCJPayBasisPaymentService.pay(context, str, str2, onPayResultCallback, null, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    private final void doSuperPay(String str, CJPayHostInfo cJPayHostInfo, IH5PayCallback iH5PayCallback, String str2) {
        Context context;
        JSONObject optJSONObject;
        if (PatchProxy.proxy(new Object[]{str, cJPayHostInfo, iH5PayCallback, str2}, this, changeQuickRedirect, false, 54).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            if (cJPayHostInfo != null) {
                context = cJPayHostInfo.LIZ();
            } else {
                context = null;
            }
            if (str != null && str.length() > 0) {
                if (context != null) {
                    if (str2 != null && (optJSONObject = new JSONObject(str2).optJSONObject("track_info")) != null) {
                        C2118a LIZ2 = C2118a.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        LIZ2.LJIJI = optJSONObject;
                    }
                    ICJPayFastPayService iCJPayFastPayService = (ICJPayFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayFastPayService.class);
                    if (iCJPayFastPayService != null) {
                        iCJPayFastPayService.doSuperPay(context, str, CJPayHostInfo.Companion.LIZIZ(cJPayHostInfo), str2);
                        return;
                    }
                    return;
                }
            } else if (context != null) {
                C137049caz.LIZIZ.LIZ("112", "sdkInfo is empty");
                C2118a.LIZ().LIZ(112).LIZIZ();
            }
            C137049caz.LIZIZ.LIZ("112", "context is null");
            C2118a.LIZ().LIZ(112).LIZIZ();
        } catch (Exception e) {
            C137049caz c137049caz = C137049caz.LIZIZ;
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            c137049caz.LIZ("112", stackTraceString);
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    private final void monitorCounterParams(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 91).isSupported) {
            return;
        }
        if (str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && str4 != null && str4.length() > 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str2.length() == 0) {
            arrayList.add(C64859BiX.LIZIZ);
        }
        if (str3 == null || str3.length() == 0) {
            arrayList.add("did");
        }
        if (str4 == null || str4.length() == 0) {
            arrayList.add("merchantId");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("counter_type", str);
            jSONObject.put("missing_params", CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
            C2118a.LIZ().LIZ("wallet_rd_checkout_counter_params_verify", jSONObject);
        } catch (Exception unused) {
        }
    }

    private final void payCallIntegratedCounter(String str, String str2, IH5PayCallback iH5PayCallback, String str3) {
        int i;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{str, str2, iH5PayCallback, str3}, this, changeQuickRedirect, false, 45).isSupported) {
            return;
        }
        try {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ.LJIILIIL = iH5PayCallback;
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.has("show_loading")) {
                    i = jSONObject2.optInt("show_loading");
                } else {
                    i = 0;
                }
                addTrackInfo(str2);
            } else {
                i = 0;
            }
            JSONArray names = jSONObject.names();
            if (names != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = names.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = names.get(i2);
                    if (obj != null) {
                        String str4 = (String) obj;
                        Object obj2 = names.get(i2);
                        if (obj2 != null) {
                            String string = jSONObject.getString((String) obj2);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            linkedHashMap.put(str4, string);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                if (i == 1) {
                    z = true;
                }
                setNeedLoading(z);
                setRequestParams(linkedHashMap);
                execute(str3);
                return;
            }
            C2118a LIZ2 = C2118a.LIZ().LIZ(112);
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }

    public final void openRealNameAuth(Activity activity, String str, String str2, String str3, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, str, str2, str3, tTCJPayRealNameAuthCallback}, this, changeQuickRedirect, false, 80).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, str, str2, str3, tTCJPayRealNameAuthCallback);
        openRealNameAuth(activity, str, str2, str3, "auth", "", "", tTCJPayRealNameAuthCallback);
    }

    @Deprecated(message = "this function is deprecated!")
    public final void openRealNameSetPassword(Activity activity, String str, String str2, String str3, TTCJPayRealNamePasswordCallback tTCJPayRealNamePasswordCallback) {
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service != null) {
            iCJPayH5Service.openH5SetPassword(activity, str, str2, str3, tTCJPayRealNamePasswordCallback, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    public final void openH5(String str, String str2, String str3, String str4, String str5) {
        Context LIZ;
        CJPayHostInfo cJPayHostInfo;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 67).isSupported) {
            return;
        }
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        if (cJPayHostInfo2 != null && (LIZ = cJPayHostInfo2.LIZ()) != null && !TextUtils.isEmpty(str) && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
            ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(LIZ);
            h5ParamBuilder.setUrl(str);
            h5ParamBuilder.setTitle(str2);
            h5ParamBuilder.setIsTransTitleBar(str3);
            h5ParamBuilder.setStatusBarColor(str4);
            h5ParamBuilder.setBackButtonColor(str5);
            h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
            if (iCJPayH5Service != null) {
                iCJPayH5Service.startH5(h5ParamBuilder);
            }
        } else {
            C2118a.LIZ().LIZ(107).LIZIZ();
        }
        releaseHostInfo();
    }

    public final void openH5CashDesk(String str, JSONObject jSONObject, JSONObject jSONObject2, int i, String str2) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 39).isSupported) {
            return;
        }
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            context = cJPayHostInfo.LIZ();
        } else {
            context = null;
        }
        h5ParamBuilder.setContext(context);
        h5ParamBuilder.setUrl(str);
        h5ParamBuilder.setOrderInfo(jSONObject);
        h5ParamBuilder.setChannelInfo(jSONObject2);
        h5ParamBuilder.setScreenType(i);
        h5ParamBuilder.setNavigationBarColor(str2);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        if (iCJPayH5Service != null) {
            iCJPayH5Service.startH5CashDesk(h5ParamBuilder);
        }
        releaseHostInfo();
    }

    public final void openH5ModalView(String str, int i, boolean z, String str2, int i2) {
        Context context;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 68).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            context = cJPayHostInfo.LIZ();
        } else {
            context = null;
        }
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        h5ParamBuilder.setContext(context);
        h5ParamBuilder.setUrl(str);
        h5ParamBuilder.setScreenType(i);
        h5ParamBuilder.setEnableAnim(z);
        h5ParamBuilder.setModalViewBgcolor(str2);
        if (i2 == 1) {
            z2 = true;
        }
        h5ParamBuilder.setShowLoading(z2);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        if (iCJPayH5Service != null) {
            iCJPayH5Service.startH5ModalView(h5ParamBuilder);
        }
        releaseHostInfo();
    }

    private final void frontPay(String str, String str2, String str3, boolean z, JSONObject jSONObject) {
        CJPayHostInfo cJPayHostInfo;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject}, this, changeQuickRedirect, false, 41).isSupported) {
            return;
        }
        CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.EC_COUNTER, CJPayPageLoadTrace.Section.START);
        FWT.LIZ("caijing_cashdesk_request");
        CJPayHostInfo cJPayHostInfo2 = this.hostInfo;
        Context context = null;
        if (cJPayHostInfo2 != null && (context = cJPayHostInfo2.LIZ()) != null && (cJPayHostInfo = this.hostInfo) != null && cJPayHostInfo.LIZIZ() != null) {
            ICJPayFrontCounterService iCJPayFrontCounterService = (ICJPayFrontCounterService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCounterService.class);
            if (Intrinsics.areEqual("standard", jSONObject.optString("cashier_scene"))) {
                if (iCJPayFrontCounterService != null) {
                    iCJPayFrontCounterService.startFrontStandardCounterActivity(context, str, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), str2, str3, z, jSONObject);
                }
            } else if (iCJPayFrontCounterService != null) {
                iCJPayFrontCounterService.startFrontETCounterActivity(context, str, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), str2, str3, z);
            }
        } else {
            if (context == null) {
                C137049caz.LIZIZ.LIZ("112", "context is null");
            } else {
                C137049caz.LIZIZ.LIZ("112", "RiskInfo is null");
            }
            C2118a.LIZ().LIZ(112).LIZIZ();
        }
        releaseHostInfo();
    }

    public final void wxPay(Context context, String str, String str2, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onPayResultCallback, onResultCallback}, this, changeQuickRedirect, false, 61).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        ICJPayBasisPaymentService iCJPayBasisPaymentService = (ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class);
        if (iCJPayBasisPaymentService != null) {
            iCJPayBasisPaymentService.pay(context, str, str2, onPayResultCallback, onResultCallback, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    @Deprecated(message = "this function is deprecated!")
    public final void openH5ModalView(Context context, String str, int i, boolean z, String str2, int i2) {
        C106862S5w.LIZ(str, str2);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
        h5ParamBuilder.setContext(context);
        h5ParamBuilder.setUrl(str);
        h5ParamBuilder.setScreenType(i);
        h5ParamBuilder.setEnableAnim(z);
        h5ParamBuilder.setModalViewBgcolor(str2);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        h5ParamBuilder.setShowLoading(z2);
        h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        if (iCJPayH5Service != null) {
            iCJPayH5Service.startH5ModalView(h5ParamBuilder);
        }
        releaseHostInfo();
    }

    public final void pay(String str, int i, String str2, String str3, String str4, IH5PayCallback iH5PayCallback) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, str4, iH5PayCallback}, this, changeQuickRedirect, false, 58).isSupported && antiFraudBeforePay(str, i, str2, str3, str4, "from_native", iH5PayCallback)) {
            pay(str, i, str2, str3, str4, "from_native", iH5PayCallback);
            releaseHostInfo();
        }
    }

    public final void payFromSubProcess(String str, int i, String str2, String str3, String str4, IH5PayCallback iH5PayCallback) {
        Context context;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, str4, iH5PayCallback}, this, changeQuickRedirect, false, 33).isSupported) {
            return;
        }
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIILIIL = iH5PayCallback;
        CJPayHostInfo cJPayHostInfo = this.hostInfo;
        if (cJPayHostInfo != null) {
            context = cJPayHostInfo.LIZ();
        } else {
            context = null;
        }
        ICJPayMultiProcessService iCJPayMultiProcessService = (ICJPayMultiProcessService) CJPayServiceManager.getInstance().getIService(ICJPayMultiProcessService.class);
        if (iCJPayMultiProcessService != null) {
            iCJPayMultiProcessService.pay(context, CJPayHostInfo.Companion.LIZIZ(this.hostInfo), str, i, str2, str3, str4);
        }
        releaseHostInfo();
    }

    public final void pay(String str, int i, String str2, String str3, String str4, Boolean bool, IH5PayCallback iH5PayCallback) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, str4, bool, iH5PayCallback}, this, changeQuickRedirect, false, 60).isSupported) {
            return;
        }
        pay(str, i, str2, str3, str4, "from_native", bool, iH5PayCallback);
        releaseHostInfo();
    }

    public final void openRealNameAuth(Activity activity, String str, String str2, String str3, String str4, String str5, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, str, str2, str3, str4, str5, tTCJPayRealNameAuthCallback}, this, changeQuickRedirect, false, 81).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, str, str2, str3, str4, str5, tTCJPayRealNameAuthCallback);
        openRealNameAuth(activity, str, str2, str3, str4, str5, "", tTCJPayRealNameAuthCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019d  */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, X.chc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean antiFraudBeforePay(final java.lang.String r23, final int r24, final java.lang.String r25, final java.lang.String r26, final java.lang.String r27, java.lang.String r28, final com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback r29) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils.antiFraudBeforePay(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[Catch: ClassNotFoundException | Exception -> 0x007f, TryCatch #0 {ClassNotFoundException | Exception -> 0x007f, blocks: (B:46:0x00c9, B:48:0x00d0, B:50:0x00d6, B:52:0x00f2, B:55:0x00fb, B:57:0x00ff, B:58:0x0103, B:62:0x010b), top: B:45:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void pay(java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils.pay(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback):void");
    }

    public final void openRealNameAuth(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, str, str2, str3, str4, str5, str6, tTCJPayRealNameAuthCallback}, this, changeQuickRedirect, false, 82).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, str, str2, str3, str4, str5, str6, tTCJPayRealNameAuthCallback);
        ICJPayRealNameAuthService iCJPayRealNameAuthService = (ICJPayRealNameAuthService) CJPayServiceManager.getInstance().getIService(ICJPayRealNameAuthService.class);
        if (iCJPayRealNameAuthService != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("merchantId", str).put("appId", str2).put("theme", str4).put("scene", str5).put("style", str6);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            iCJPayRealNameAuthService.startCJPayRealNameAuthActivity(activity, jSONObject.toString(), str3, tTCJPayRealNameAuthCallback, CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
        }
        releaseHostInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x028b A[Catch: Exception -> 0x02e1, TryCatch #6 {Exception -> 0x02e1, blocks: (B:113:0x0262, B:115:0x0276, B:117:0x0281, B:118:0x0285, B:120:0x028b, B:122:0x029a, B:124:0x02a0, B:126:0x02a8, B:128:0x02b7, B:129:0x02bc, B:131:0x02bd, B:132:0x02c2, B:137:0x02c7, B:138:0x02d2, B:140:0x02dc), top: B:112:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d2 A[Catch: Exception -> 0x02e1, TryCatch #6 {Exception -> 0x02e1, blocks: (B:113:0x0262, B:115:0x0276, B:117:0x0281, B:118:0x0285, B:120:0x028b, B:122:0x029a, B:124:0x02a0, B:126:0x02a8, B:128:0x02b7, B:129:0x02bc, B:131:0x02bd, B:132:0x02c2, B:137:0x02c7, B:138:0x02d2, B:140:0x02dc), top: B:112:0x0262 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void pay(java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Boolean r25, final com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback r26) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils.pay(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback):void");
    }
}
