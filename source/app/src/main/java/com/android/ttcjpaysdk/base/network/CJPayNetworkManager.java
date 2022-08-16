package com.android.ttcjpaysdk.base.network;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.network.p133a.AbstractC2161f;
import com.android.ttcjpaysdk.base.network.p133a.d$a;
import com.android.ttcjpaysdk.base.network.ttnet.CJPayTTNetApi;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedString;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.common.applog.NetUtil;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC137673cl3;
import p003X.C102564QaE;
import p003X.C103118QjA;
import p003X.C103119QjB;
import p003X.C137681clB;
import p003X.C137682clC;
import p003X.C137685clF;
import p003X.C137686clG;
import p003X.C137687clH;
import p003X.C137688clI;
import p003X.C137689clJ;
import p003X.C137696clQ;
import p003X.C137697clR;
import p003X.C137698clS;
import p003X.C521886je;
import p003X.C521896jf;
import p003X.NBU;
import p003X.NC8;
import p003X.QWM;
import p003X.QWP;
import p003X.RunnableC137679cl9;
import p003X.RunnableC137680clA;

/* loaded from: classes17.dex */
public class CJPayNetworkManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Handler handler;
    public static HandlerThread handlerThread;
    public static boolean isUsingTTNet;
    public static Handler workerHandler;

    static {
        if (ReDexClinitStringAb.abTest >= 2) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(6277);
        handler = new Handler(Looper.getMainLooper());
        isUsingTTNet = true;
        HandlerThread handlerThread2 = new HandlerThread("CJPayNetworkManager");
        handlerThread = handlerThread2;
        handlerThread2.start();
        workerHandler = new Handler(handlerThread.getLooper());
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(6277);
        handler = new Handler(Looper.getMainLooper());
        isUsingTTNet = true;
        HandlerThread handlerThread2 = new HandlerThread("CJPayNetworkManager");
        handlerThread = handlerThread2;
        handlerThread2.start();
        workerHandler = new Handler(handlerThread.getLooper());
    }

    public static void setUsingTTNet(boolean z) {
        isUsingTTNet = z;
    }

    public static void addTTNetInterceptor(Interceptor interceptor) {
        if (PatchProxy.proxy(new Object[]{interceptor}, null, changeQuickRedirect, true, 23).isSupported) {
            return;
        }
        C521896jf.LIZ("from_app", interceptor);
    }

    public static okhttp3.Interceptor generateOKHttpInterceptor(NBU nbu) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nbu}, null, changeQuickRedirect, true, 25);
        if (proxy.isSupported) {
            return (okhttp3.Interceptor) proxy.result;
        }
        return new NC8(nbu);
    }

    public static Interceptor generateTTNetInterceptor(final NBU nbu) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nbu}, null, changeQuickRedirect, true, 24);
        if (proxy.isSupported) {
            return (Interceptor) proxy.result;
        }
        return new Interceptor() { // from class: com.android.ttcjpaysdk.base.network.CJPayNetworkManager.12
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6286);
            }

            private SsResponse LIZ(Interceptor.Chain chain) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 3);
                if (proxy2.isSupported) {
                    return (SsResponse) proxy2.result;
                }
                return chain.proceed(chain.request());
            }

            @Override // com.bytedance.retrofit2.intercept.Interceptor
            public final SsResponse intercept(Interceptor.Chain chain) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 2);
                if (proxy2.isSupported) {
                    return (SsResponse) proxy2.result;
                }
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{this, chain}, null, LIZ, true, 1);
                if (proxy3.isSupported) {
                    return (SsResponse) proxy3.result;
                }
                if (chain.metrics() instanceof C102564QaE) {
                    C102564QaE c102564QaE = (C102564QaE) chain.metrics();
                    if (c102564QaE.f11152LJ > 0) {
                        c102564QaE.requestInterceptDuration.put(c102564QaE.LJI, Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.f11152LJ));
                    }
                    c102564QaE.LIZ(getClass().getSimpleName());
                    c102564QaE.f11152LJ = SystemClock.uptimeMillis();
                    SsResponse LIZ2 = LIZ(chain);
                    if (c102564QaE.LJFF > 0) {
                        c102564QaE.responseInterceptDuration.put(getClass().getSimpleName(), Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.LJFF));
                    }
                    c102564QaE.LJFF = SystemClock.uptimeMillis();
                    return LIZ2;
                }
                return LIZ(chain);
            }
        };
    }

    public static String getUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            return NetUtil.addCommonParams(str, false);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void handleDownloadFailure(ICJPayDownloadFileCallback iCJPayDownloadFileCallback) {
        if (PatchProxy.proxy(new Object[]{iCJPayDownloadFileCallback}, null, changeQuickRedirect, true, 13).isSupported) {
            return;
        }
        handler.post(new RunnableC137680clA(iCJPayDownloadFileCallback));
    }

    /* renamed from: com.android.ttcjpaysdk.base.network.CJPayNetworkManager$1 */
    /* loaded from: classes17.dex */
    public static class C21541 implements ICJPayCallback {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ AbstractC137673cl3 LIZIZ;
        public final /* synthetic */ AbstractC2162d LIZJ;
        public final /* synthetic */ String LIZLLL;

        static {
            Covode.recordClassIndex(6278);
        }

        @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
        public final void onFailure(JSONObject jSONObject) {
            String str;
            if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported) {
                return;
            }
            AbstractC137673cl3 abstractC137673cl3 = this.LIZIZ;
            if (CJPayHostInfo.applicationContext != null) {
                str = CJPayHostInfo.applicationContext.getResources().getString(2131561782);
            } else {
                str = "Weak connection, please check";
            }
            abstractC137673cl3.LIZ("-99", str);
        }

        @Override // com.android.ttcjpaysdk.base.network.ICJPayCallback
        public final void onResponse(final JSONObject jSONObject) {
            String str;
            String str2 = "Weak connection, please check";
            if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
                return;
            }
            try {
                if (jSONObject.has("error_code")) {
                    AbstractC137673cl3 abstractC137673cl3 = this.LIZIZ;
                    if (CJPayHostInfo.applicationContext != null) {
                        str = CJPayHostInfo.applicationContext.getResources().getString(2131561782);
                    } else {
                        str = str2;
                    }
                    abstractC137673cl3.LIZ("-99", str);
                    return;
                }
                final JSONObject optJSONObject = jSONObject.optJSONObject("response");
                if (optJSONObject == null) {
                    final Class cls = (Class) ((ParameterizedType) this.LIZIZ.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
                    if (this.LIZJ != null) {
                        this.LIZJ.LIZ();
                    }
                    CJPayNetworkManager.workerHandler.post(new Runnable() { // from class: com.android.ttcjpaysdk.base.network.CJPayNetworkManager.1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(6279);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            CJPayNetworkManager.setJSONFlag(jSONObject, C21541.this.LIZLLL);
                            final CJPayObject fromJson = CJPayJsonParser.fromJson(jSONObject, cls);
                            CJPayNetworkManager.handler.post(new Runnable() { // from class: com.android.ttcjpaysdk.base.network.CJPayNetworkManager.1.1.1
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(6280);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    C21541.this.LIZIZ.LIZ(fromJson);
                                }
                            });
                        }
                    });
                    return;
                }
                final Class cls2 = (Class) ((ParameterizedType) this.LIZIZ.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
                if (this.LIZJ != null) {
                    this.LIZJ.LIZ();
                }
                CJPayNetworkManager.workerHandler.post(new Runnable() { // from class: com.android.ttcjpaysdk.base.network.CJPayNetworkManager.1.2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(6281);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        CJPayNetworkManager.setJSONFlag(optJSONObject, C21541.this.LIZLLL);
                        final CJPayObject fromJson = CJPayJsonParser.fromJson(optJSONObject, cls2);
                        CJPayNetworkManager.handler.post(new Runnable() { // from class: com.android.ttcjpaysdk.base.network.CJPayNetworkManager.1.2.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(6282);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                C21541.this.LIZIZ.LIZ(fromJson);
                            }
                        });
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                AbstractC137673cl3 abstractC137673cl32 = this.LIZIZ;
                if (CJPayHostInfo.applicationContext != null) {
                    str2 = CJPayHostInfo.applicationContext.getResources().getString(2131561782);
                }
                abstractC137673cl32.LIZ("-99", str2);
            }
        }

        public C21541(AbstractC137673cl3 abstractC137673cl3, AbstractC2162d abstractC2162d, String str) {
            this.LIZIZ = abstractC137673cl3;
            this.LIZJ = abstractC2162d;
            this.LIZLLL = str;
        }
    }

    public static void addCommonHeaderParams(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 26).isSupported || map == null) {
            return;
        }
        map.put("x-native-devinfo", CJPayParamsUtils.LJFF());
        map.put("X-Cjpay-Sdk-Info", CJPayParamsUtils.LJI());
        if (!TextUtils.isEmpty(CJPayHostInfo.boeEnv)) {
            map.put("X-TT-ENV", CJPayHostInfo.boeEnv);
        }
    }

    public static JSONObject generateFailureInfo(String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (CJPayHostInfo.applicationContext != null) {
            str2 = CJPayHostInfo.applicationContext.getResources().getString(2131561782);
        } else {
            str2 = "Weak connection, please check";
        }
        return generateFailureInfo(str, -99, str2);
    }

    public static int getTTNetErrorCode(Throwable th) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{th}, null, changeQuickRedirect, true, 32);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            if (!(th instanceof CronetIOException)) {
                return -1;
            }
            return ((CronetIOException) th).getStatusCode();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean isNeedNoSenseLogin(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ("PP0010".equals(str)) {
            return true;
        }
        return false;
    }

    public static List<Header> generateHeaderList(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Header(entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(new Header("CJPAY_NETWORK", "TTNet"));
        return arrayList;
    }

    public static void downloadFile(String str, ICJPayDownloadFileCallback iCJPayDownloadFileCallback) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayDownloadFileCallback}, null, changeQuickRedirect, true, 6).isSupported) {
            return;
        }
        downloadFile(str, iCJPayDownloadFileCallback, false);
    }

    public static void addInterceptor(String str, NBU nbu) {
        if (PatchProxy.proxy(new Object[]{str, nbu}, null, changeQuickRedirect, true, 22).isSupported) {
            return;
        }
        try {
            if (isUsingTTNet) {
                C521896jf.LIZ(str, generateTTNetInterceptor(nbu));
                return;
            }
            okhttp3.Interceptor generateOKHttpInterceptor = generateOKHttpInterceptor(nbu);
            if (!PatchProxy.proxy(new Object[]{str, generateOKHttpInterceptor}, null, QWP.LIZ, true, 1).isSupported) {
                QWP.LIZIZ.put(str, generateOKHttpInterceptor);
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void setJSONFlag(JSONObject jSONObject, String str) {
        synchronized (CJPayNetworkManager.class) {
            MethodCollector.m14708i(378);
            if (PatchProxy.proxy(new Object[]{jSONObject, str}, null, changeQuickRedirect, true, 33).isSupported) {
                MethodCollector.m14707o(378);
                return;
            }
            jSONObject.put("cj_pay_network_api_to_json_url", str);
            MethodCollector.m14707o(378);
        }
    }

    public static void sendMonitor(SsResponse ssResponse, long j) {
        if (!PatchProxy.proxy(new Object[]{ssResponse, new Long(j)}, null, changeQuickRedirect, true, 31).isSupported && ssResponse != null && ssResponse.raw() != null) {
            try {
                JSONObject LIZ = CJPayParamsUtils.LIZ("", "");
                Uri parse = Uri.parse(ssResponse.raw().getUrl());
                new StringBuilder();
                LIZ.put(PushConstants.WEB_URL, C0002O.m25084C(parse.getScheme(), "://", parse.getHost(), parse.getPath()));
                LIZ.put("status", ssResponse.raw().getStatus());
                LIZ.put(MiPushCommandMessage.KEY_REASON, ssResponse.raw().getReason());
                LIZ.put("length", ssResponse.raw().getBody().length());
                LIZ.put("time", j);
                LIZ.put("server_type", CJPayHostInfo.serverType);
                C2118a.LIZ().LIZ("wallet_rd_network_success_info", LIZ);
                C2118a.LIZ().LIZ("wallet_rd_network_success_info", LIZ);
            } catch (Throwable unused) {
            }
        }
    }

    public static void checkInMainThread(String str, ICJPayCallback iCJPayCallback, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayCallback, jSONObject}, null, changeQuickRedirect, true, 27).isSupported) {
            return;
        }
        checkInMainThread(str, iCJPayCallback, jSONObject, null);
    }

    public static void downloadFile(String str, ICJPayDownloadFileCallback iCJPayDownloadFileCallback, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayDownloadFileCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.network");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (isUsingTTNet) {
                downloadFileTTNet(str, iCJPayDownloadFileCallback, z);
            } else {
                downloadFileOKHttp(str, iCJPayDownloadFileCallback, z);
            }
        } catch (Exception unused) {
            if (iCJPayDownloadFileCallback != null) {
                iCJPayDownloadFileCallback.LIZ();
            }
        }
    }

    public static void downloadFileOKHttp(String str, ICJPayDownloadFileCallback iCJPayDownloadFileCallback, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayDownloadFileCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            handleDownloadFailure(iCJPayDownloadFileCallback);
            return;
        }
        OkHttpClient okHttpClient = QWM.LIZ().LIZIZ;
        if (okHttpClient != null) {
            try {
                Request.Builder builder = new Request.Builder();
                builder.url(str);
                okHttpClient.newCall(builder.build()).enqueue(new C137682clC(iCJPayDownloadFileCallback, z));
                return;
            } catch (Exception unused) {
            }
        }
        handleDownloadFailure(iCJPayDownloadFileCallback);
    }

    public static void downloadFileTTNet(String str, ICJPayDownloadFileCallback iCJPayDownloadFileCallback, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayDownloadFileCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 11).isSupported) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            if (iCJPayDownloadFileCallback != null) {
                iCJPayDownloadFileCallback.LIZ();
                return;
            }
            return;
        }
        new StringBuilder();
        CJPayTTNetApi cJPayTTNetApi = (CJPayTTNetApi) C521886je.LIZ(C0002O.m25085C(parse.getScheme(), "://", parse.getHost()), CJPayTTNetApi.class);
        if (cJPayTTNetApi != null) {
            cJPayTTNetApi.downloadFile(str).enqueue(new C137685clF(System.currentTimeMillis(), z, iCJPayDownloadFileCallback));
        }
    }

    public static JSONObject generateFailureInfo(String str, int i, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 21);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i);
            jSONObject.put("error_msg", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        logNetworkError(str, i, str2);
        return jSONObject;
    }

    public static ICJPayRequest get(String str, Map<String, String> map, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, iCJPayCallback}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        try {
            CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.network");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            addCommonHeaderParams(map);
            String url = getUrl(str);
            if (isUsingTTNet) {
                return getTTNet(url, map, iCJPayCallback);
            }
            return getOKHttp(url, map, iCJPayCallback);
        } catch (Exception unused) {
            if (iCJPayCallback != null) {
                iCJPayCallback.onFailure(generateFailureInfo(str));
            }
            return null;
        }
    }

    public static ICJPayRequest getOKHttp(String str, Map<String, String> map, ICJPayCallback iCJPayCallback) {
        AbstractC2161f LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, iCJPayCallback}, null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        C137698clS c137698clS = new C137698clS(iCJPayCallback, str, map);
        d$a LIZ2 = C137681clB.LIZ();
        LIZ2.LIZ(c137698clS);
        LIZ2.LIZ(str);
        LIZ2.LIZ(map);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], LIZ2, d$a.LIZ, false, 5);
        if (proxy2.isSupported) {
            LIZ = (AbstractC2161f) proxy2.result;
        } else {
            LIZ = LIZ2.LIZ();
            LIZ.LIZ(LIZ2.LIZIZ);
            LIZ.LIZ(LIZ2.LJFF);
            LIZ.LIZ(LIZ2.LIZJ);
            LIZ.LIZIZ(LIZ2.LJI);
        }
        LIZ.mo16064LJ();
        return new C103118QjA(LIZ.LJFF());
    }

    public static ICJPayRequest getTTNet(String str, Map<String, String> map, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, iCJPayCallback}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        CJPayTTNetApi cJPayTTNetApi = (CJPayTTNetApi) C521886je.LIZ(str, CJPayTTNetApi.class);
        if (cJPayTTNetApi == null) {
            return null;
        }
        Call<String> doGet = cJPayTTNetApi.doGet(1048576, false, str, null, generateHeaderList(map));
        doGet.enqueue(new C137688clI(System.currentTimeMillis(), iCJPayCallback, str, map, cJPayTTNetApi));
        return new C103119QjB(doGet);
    }

    public static void logNetworkError(String str, int i, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2}, null, changeQuickRedirect, true, 30).isSupported) {
            return;
        }
        JSONObject LIZ = CJPayParamsUtils.LIZ("", "");
        try {
            Uri parse = Uri.parse(str);
            new StringBuilder();
            LIZ.put(PushConstants.WEB_URL, C0002O.m25084C(parse.getScheme(), "://", parse.getHost(), parse.getPath()));
            LIZ.put("error_code", i);
            LIZ.put("error_msg", str2);
            C2118a.LIZ().LIZ("wallet_rd_network_error", LIZ);
            C2118a.LIZ().LIZ("wallet_rd_network_error", LIZ);
        } catch (Exception unused) {
        }
    }

    public static void checkInMainThread(String str, ICJPayCallback iCJPayCallback, JSONObject jSONObject, Response response) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayCallback, jSONObject, response}, null, changeQuickRedirect, true, 28).isSupported) {
            return;
        }
        handler.post(new RunnableC137679cl9(jSONObject, response, iCJPayCallback, str));
    }

    public static <T> ICJPayRequest postForm(String str, Map<String, String> map, Map<String, String> map2, AbstractC137673cl3<T> abstractC137673cl3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, abstractC137673cl3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        return postForm(str, map, map2, abstractC137673cl3, null);
    }

    public static ICJPayRequest postFormOKHttp(String str, Map<String, String> map, Map<String, String> map2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, iCJPayCallback}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        C137696clQ c137696clQ = new C137696clQ(iCJPayCallback, map, map2, str);
        d$a LIZ = C137681clB.LIZ();
        LIZ.LIZ(c137696clQ);
        LIZ.LIZ(false);
        LIZ.LIZLLL = map;
        LIZ.LIZ(str);
        LIZ.LIZ(map2);
        AbstractC2161f LIZIZ = LIZ.LIZIZ();
        LIZIZ.LIZ(false);
        return new C103118QjA(LIZIZ.LJFF());
    }

    public static ICJPayRequest postFormTTNet(String str, Map<String, String> map, Map<String, String> map2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, iCJPayCallback}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        CJPayTTNetApi cJPayTTNetApi = (CJPayTTNetApi) C521886je.LIZ(str, CJPayTTNetApi.class);
        if (cJPayTTNetApi == null) {
            return null;
        }
        Call<String> doPost = cJPayTTNetApi.doPost(1048576, str, null, map, generateHeaderList(map2));
        doPost.enqueue(new C137689clJ(System.currentTimeMillis(), iCJPayCallback, map, map2, cJPayTTNetApi, str));
        return new C103119QjB(doPost);
    }

    public static ICJPayRequest postJsonOKHttp(String str, Map<String, String> map, String str2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, str2, iCJPayCallback}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        C137697clR c137697clR = new C137697clR(iCJPayCallback, str2, map, str);
        try {
            d$a LIZ = C137681clB.LIZ();
            LIZ.LIZ(c137697clR);
            LIZ.LIZ(false);
            LIZ.f25450LJ = new JSONObject(str2);
            LIZ.LIZ(map);
            LIZ.LIZ(str);
            LIZ.LIZIZ().LIZ(false, true);
            return null;
        } catch (JSONException unused) {
            if (iCJPayCallback != null) {
                iCJPayCallback.onFailure(generateFailureInfo(str));
            }
            return null;
        }
    }

    public static ICJPayRequest postForm(String str, Map<String, String> map, Map<String, String> map2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, iCJPayCallback}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        try {
            CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.network");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            addCommonHeaderParams(map2);
            String url = getUrl(str);
            if (isUsingTTNet) {
                return postFormTTNet(url, map, map2, iCJPayCallback);
            }
            return postFormOKHttp(url, map, map2, iCJPayCallback);
        } catch (Exception unused) {
            if (iCJPayCallback != null) {
                iCJPayCallback.onFailure(generateFailureInfo(str));
            }
            return null;
        }
    }

    public static <T> ICJPayRequest postForm(String str, Map<String, String> map, Map<String, String> map2, AbstractC137673cl3<T> abstractC137673cl3, AbstractC2162d abstractC2162d) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, abstractC137673cl3, abstractC2162d}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        try {
            CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.network");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            addCommonHeaderParams(map2);
            String url = getUrl(str);
            C21541 c21541 = new C21541(abstractC137673cl3, abstractC2162d, str);
            if (isUsingTTNet) {
                return postFormTTNet(url, map, map2, c21541);
            }
            return postFormOKHttp(url, map, map2, c21541);
        } catch (Exception unused) {
            if (abstractC137673cl3 != null) {
                if (CJPayHostInfo.applicationContext != null) {
                    str2 = CJPayHostInfo.applicationContext.getResources().getString(2131561782);
                } else {
                    str2 = "Weak connection, please check";
                }
                abstractC137673cl3.LIZ("-99", str2);
            }
            return null;
        }
    }

    public static ICJPayRequest postJson(String str, Map<String, String> map, Map<String, String> map2, String str2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, str2, iCJPayCallback}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        try {
            CJPayPerformance.LIZ().LIZ("com.android.ttcjpaysdk.base.network");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            addCommonHeaderParams(map2);
            String url = getUrl(str);
            if (isUsingTTNet) {
                return postJsonTTNet(url, map, map2, new TypedString(str2), str2, iCJPayCallback);
            }
            return postJsonOKHttp(url, map2, str2, iCJPayCallback);
        } catch (Exception unused) {
            if (iCJPayCallback != null) {
                iCJPayCallback.onFailure(generateFailureInfo(str));
            }
            return null;
        }
    }

    public static ICJPayRequest postMultipartTTNet(String str, Map<String, String> map, Map<String, String> map2, byte[] bArr, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, bArr, iCJPayCallback}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        CJPayTTNetApi cJPayTTNetApi = (CJPayTTNetApi) C521886je.LIZ(str, CJPayTTNetApi.class);
        addCommonHeaderParams(map2);
        if (cJPayTTNetApi == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("img_data", new TypedByteArray("application/octet-stream", bArr, new String[0]));
        Call<String> postMultiPart = cJPayTTNetApi.postMultiPart(1048576, str, map, generateHeaderList(map2), linkedHashMap);
        postMultiPart.enqueue(new C137686clG(System.currentTimeMillis(), iCJPayCallback, str));
        return new C103119QjB(postMultiPart);
    }

    public static ICJPayRequest postJsonTTNet(String str, Map<String, String> map, Map<String, String> map2, TypedString typedString, String str2, ICJPayCallback iCJPayCallback) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, map2, typedString, str2, iCJPayCallback}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (ICJPayRequest) proxy.result;
        }
        CJPayTTNetApi cJPayTTNetApi = (CJPayTTNetApi) C521886je.LIZ(str, CJPayTTNetApi.class);
        if (cJPayTTNetApi == null) {
            return null;
        }
        if (map2 != null) {
            map2.put("Content-Type", "application/json");
        }
        Call<String> postBody = cJPayTTNetApi.postBody(1048576, str, map, typedString, generateHeaderList(map2));
        postBody.enqueue(new C137687clH(System.currentTimeMillis(), iCJPayCallback, str2, map2, cJPayTTNetApi, str, map, typedString));
        return new C103119QjB(postBody);
    }
}
