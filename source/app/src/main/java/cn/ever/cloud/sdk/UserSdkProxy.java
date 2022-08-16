package cn.ever.cloud.sdk;

import android.os.SystemClock;
import cn.ever.cloud.android.component.DaggerSdkComponent;
import cn.ever.cloud.android.config.NetworkDomain;
import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.monitor.SdkMonitor;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.runtime.SandboxManager;
import cn.ever.cloud.android.services.task.entity.Context;
import cn.ever.cloud.android.services.task.entity.Resource;
import cn.ever.cloud.network.api.ApiBundle;
import cn.ever.cloud.network.auth.SessionTokenProvider;
import cn.ever.cloud.network.auth.UserId;
import cn.ever.cloud.network.auth.UserInconsistentEvent;
import cn.ever.cloud.sdk.api.AlbumApi;
import cn.ever.cloud.sdk.api.AssetApi;
import cn.ever.cloud.sdk.api.DownloadApi;
import cn.ever.cloud.sdk.api.SyncApi;
import cn.ever.cloud.sdk.api.UploadApi;
import cn.ever.cloud.sdk.api.UserApi;
import cn.ever.cloud.sdk.mapper.MapperKt;
import cn.ever.cloud.utils.CtxUtil;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.base.AppInfo;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC521356in;
import p003X.AbstractC521426iu;
import p003X.AbstractC521446iw;
import p003X.AbstractC521496j1;
import p003X.AbstractC521566j8;
import p003X.AbstractC521616jD;
import p003X.AbstractC521626jE;
import p003X.AbstractC521636jF;
import p003X.AbstractC521786jU;
import p003X.C102564QaE;
import p003X.C106862S5w;
import p003X.C521606jC;

/* loaded from: classes23.dex */
public final class UserSdkProxy implements AbstractC521426iu {
    public static final C521606jC Companion = new C521606jC((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public CommonConfig commonConfig;
    public DependConfig dependConfig;
    public StrategyConfig strategyConfig;
    public Job userInconsistentJob;
    public final SdkScope independentScope = new SdkScope(1, null, null, 6, null);
    public final MutableSharedFlow<UserInconsistentEvent> userInconsistentFlow = SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
    public final SharedFlow<UserInconsistentEvent> userInconsistentEvent = FlowKt.asSharedFlow(this.userInconsistentFlow);
    public AbstractC521356in sdkComponent = buildSdkComponent();
    public final AssetApi assetApi = new AssetApi(this.sdkComponent);
    public final UploadApi uploadApi = new UploadApi(this.sdkComponent);
    public final SyncApi syncApi = new SyncApi(this.sdkComponent);
    public final AlbumApi albumApi = new AlbumApi(this.sdkComponent);
    public final DownloadApi downloadApi = new DownloadApi(this.sdkComponent);
    public final UserApi userApi = new UserApi(this.sdkComponent, this);

    static {
        Covode.recordClassIndex(3308);
    }

    public final AlbumApi getAlbumApi$sdk_douyin_release() {
        return this.albumApi;
    }

    public final AssetApi getAssetApi$sdk_douyin_release() {
        return this.assetApi;
    }

    public final DownloadApi getDownloadApi$sdk_douyin_release() {
        return this.downloadApi;
    }

    public final SyncApi getSyncApi$sdk_douyin_release() {
        return this.syncApi;
    }

    public final UploadApi getUploadApi$sdk_douyin_release() {
        return this.uploadApi;
    }

    public final UserApi getUserApi$sdk_douyin_release() {
        return this.userApi;
    }

    @Override // p003X.AbstractC521426iu
    public final Flow<UserInconsistentEvent> userInconsistent() {
        return this.userInconsistentEvent;
    }

    private final void clearDb() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        SdkDatabase.Companion.clear(this.sdkComponent.database());
    }

    public final void teardown() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        Job job = this.userInconsistentJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.sdkComponent.sdkScope().tearDown();
        MonitorKit.INSTANCE.clearMonitorDelegate();
    }

    private final synchronized void setup() {
        int i;
        MethodCollector.m14708i(220);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(220);
            return;
        }
        Integer uploadConcurrent = this.strategyConfig.getUploadConcurrent();
        int i2 = 3;
        if (uploadConcurrent != null) {
            i = uploadConcurrent.intValue();
        } else {
            i = 3;
        }
        Integer downloadConcurrent = this.strategyConfig.getDownloadConcurrent();
        if (downloadConcurrent != null) {
            i2 = downloadConcurrent.intValue();
        }
        this.sdkComponent.taskService().startCommandLoop(new Context(Resource.Companion.m20559io(i, i2)));
        SdkScope.launch$default(this.sdkComponent.sdkScope(), null, new UserSdkProxy$setup$1(this, null), 1, null);
        SdkScope.launch$default(this.sdkComponent.sdkScope(), null, new UserSdkProxy$setup$2(this, null), 1, null);
        this.userInconsistentJob = SdkScope.launch$default(this.independentScope, null, new UserSdkProxy$setup$3(this, null), 1, null);
        MethodCollector.m14707o(220);
    }

    private final synchronized void updateApi() {
        MethodCollector.m14708i(221);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            MethodCollector.m14707o(221);
            return;
        }
        this.assetApi.setComponent$sdk_douyin_release(this.sdkComponent);
        this.uploadApi.setComponent$sdk_douyin_release(this.sdkComponent);
        this.syncApi.setComponent$sdk_douyin_release(this.sdkComponent);
        this.albumApi.setComponent$sdk_douyin_release(this.sdkComponent);
        this.downloadApi.setComponent$sdk_douyin_release(this.sdkComponent);
        this.userApi.setComponent$sdk_douyin_release(this.sdkComponent);
        MethodCollector.m14707o(221);
    }

    private final synchronized AbstractC521356in buildSdkComponent() {
        AbstractC521446iw networkConfig;
        int i;
        MethodCollector.m14708i(219);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            AbstractC521356in abstractC521356in = (AbstractC521356in) proxy.result;
            MethodCollector.m14707o(219);
            return abstractC521356in;
        }
        AppInfo.INSTANCE.setup(this.commonConfig.getEpUid(), String.valueOf(this.commonConfig.getDeviceId()), "4.6.2", String.valueOf(this.commonConfig.getISF().LIZ().getIntVal()));
        final AbstractC521636jF loggerDelegate = this.dependConfig.getLoggerDelegate();
        if (loggerDelegate != null) {
            LogHelper.INSTANCE.setLogger(new AbstractC521786jU() { // from class: cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(3310);
                }

                @Override // p003X.AbstractC521786jU
                public final void print(int i2, String str, String str2) {
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i2), str, str2}, this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(str, str2);
                    AbstractC521636jF.this.LIZ(i2, str, str2);
                }
            });
        }
        LogHelper.INSTANCE.setLogLevel(this.commonConfig.getLogLevel());
        LogHelper.INSTANCE.m20553i("EverCloudSdk", "init EverCloudSdk");
        AbstractC521496j1 networkConfig2 = this.commonConfig.getNetworkConfig();
        if (networkConfig2 != null && (networkConfig = MapperKt.toNetworkConfig(networkConfig2)) != null) {
            AbstractC521626jE abstractC521626jE = new AbstractC521626jE() { // from class: cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$eventDepend$1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(3311);
                }

                @Override // p003X.AbstractC521626jE
                public final void onAppLopEventV3(String str, JSONObject jSONObject) {
                    if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(str, jSONObject);
                    AbstractC521616jD eventDelegate = UserSdkProxy.this.dependConfig.getEventDelegate();
                    if (eventDelegate != null) {
                        eventDelegate.LIZ(str, jSONObject);
                    }
                }
            };
            android.content.Context appContext = CtxUtil.INSTANCE.appContext();
            Intrinsics.checkNotNull(appContext);
            SdkMonitor sdkMonitor = new SdkMonitor(appContext, abstractC521626jE);
            MonitorKit.INSTANCE.clearMonitorDelegate();
            MonitorKit.INSTANCE.addMonitorDelegate(sdkMonitor);
            RuntimeExtManager runtimeExtManager = new RuntimeExtManager(new UserSdkProxy$buildSdkComponent$extDepend$1(this));
            NetworkDomain domain = networkConfig.domain();
            if (domain != null) {
                ApiBundle apiBundle = new ApiBundle(domain.getHost(), domain.isHttps(), String.valueOf(this.commonConfig.getISF().LIZ().getIntVal()));
                Retrofit createRetrofit = RetrofitUtils.createRetrofit(apiBundle.getBaseUrl(), CollectionsKt__CollectionsJVMKt.listOf(new Interceptor() { // from class: cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$interceptor$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(3314);
                    }

                    @Override // com.bytedance.retrofit2.intercept.Interceptor
                    public final SsResponse intercept(Interceptor.Chain chain) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 2);
                        return proxy2.isSupported ? (SsResponse) proxy2.result : m20556x451dcfa(this, chain);
                    }

                    /* renamed from: cn_ever_cloud_sdk_UserSdkProxy$buildSdkComponent$interceptor$1__intercept$___twin___ */
                    public final SsResponse<Object> m20557xe367af10(Interceptor.Chain chain) {
                        Request request;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 3);
                        if (proxy2.isSupported) {
                            return (SsResponse) proxy2.result;
                        }
                        if (chain != null && (request = chain.request()) != null) {
                            List<Header> headers = request.getHeaders();
                            Set<Map.Entry<String, String>> entrySet = UserSdkProxy.this.sdkComponent.tokenProvider().getTokenMap().entrySet();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
                            Iterator<T> it = entrySet.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                            }
                            Request.Builder newBuilder = chain.request().newBuilder();
                            Intrinsics.checkNotNullExpressionValue(headers, "");
                            newBuilder.headers(CollectionsKt___CollectionsKt.plus((Collection) headers, (Iterable) arrayList));
                            return chain.proceed(newBuilder.build());
                        }
                        throw new IllegalArgumentException("chain cannot be null");
                    }

                    /* renamed from: cn_ever_cloud_sdk_UserSdkProxy$buildSdkComponent$interceptor$1_com_ss_android_ugc_aweme_lancet_network_ApiTimeLancet_intercept */
                    public static SsResponse m20556x451dcfa(UserSdkProxy$buildSdkComponent$interceptor$1 userSdkProxy$buildSdkComponent$interceptor$1, Interceptor.Chain chain) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{userSdkProxy$buildSdkComponent$interceptor$1, chain}, null, changeQuickRedirect, true, 1);
                        if (proxy2.isSupported) {
                            return (SsResponse) proxy2.result;
                        }
                        if (chain.metrics() instanceof C102564QaE) {
                            C102564QaE c102564QaE = (C102564QaE) chain.metrics();
                            if (c102564QaE.f11152LJ > 0) {
                                c102564QaE.requestInterceptDuration.put(c102564QaE.LJI, Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.f11152LJ));
                            }
                            c102564QaE.LIZ(userSdkProxy$buildSdkComponent$interceptor$1.getClass().getSimpleName());
                            c102564QaE.f11152LJ = SystemClock.uptimeMillis();
                            SsResponse<Object> m20557xe367af10 = userSdkProxy$buildSdkComponent$interceptor$1.m20557xe367af10(chain);
                            if (c102564QaE.LJFF > 0) {
                                c102564QaE.responseInterceptDuration.put(userSdkProxy$buildSdkComponent$interceptor$1.getClass().getSimpleName(), Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.LJFF));
                            }
                            c102564QaE.LJFF = SystemClock.uptimeMillis();
                            return m20557xe367af10;
                        }
                        return userSdkProxy$buildSdkComponent$interceptor$1.m20557xe367af10(chain);
                    }
                }), GsonConverterFactory.create(), (CallAdapter.Factory) null, (Client.Provider) null);
                Integer commonThreadPoolNThread = this.commonConfig.getCommonThreadPoolNThread();
                if (commonThreadPoolNThread != null) {
                    i = commonThreadPoolNThread.intValue();
                } else {
                    i = 20;
                }
                SdkScope sdkScope = new SdkScope(i, null, null, 6, null);
                SessionTokenProvider sessionTokenProvider = new SessionTokenProvider(new UserId(this.commonConfig.getBizUid(), this.commonConfig.getBizSecUid(), this.commonConfig.getEpUid()), new UserSdkProxy$buildSdkComponent$tokenProvider$1(this), sdkScope.newScope(), this.commonConfig.getToken());
                android.content.Context appContext2 = CtxUtil.INSTANCE.appContext();
                Intrinsics.checkNotNull(appContext2);
                DigestHasher digestHasher = new DigestHasher(appContext2);
                AbstractC521566j8 builder = DaggerSdkComponent.builder();
                Intrinsics.checkNotNullExpressionValue(createRetrofit, "");
                AbstractC521566j8 mo25228digestHasher = builder.mo25229retrofit(createRetrofit).mo25228digestHasher(digestHasher);
                android.content.Context appContext3 = CtxUtil.INSTANCE.appContext();
                Intrinsics.checkNotNull(appContext3);
                AbstractC521356in build = mo25228digestHasher.mo25231sandboxManager(new SandboxManager(appContext3, this.commonConfig.getCacheFolderPath(), digestHasher)).mo25232sdkScope(sdkScope).mo25233tokenProvider(sessionTokenProvider).mo25227apiBundle(apiBundle).mo25230runtimeExtManager(runtimeExtManager).build();
                MethodCollector.m14707o(219);
                return build;
            }
            NullPointerException nullPointerException = new NullPointerException("domain is required");
            MethodCollector.m14707o(219);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("network config is required");
        MethodCollector.m14707o(219);
        throw nullPointerException2;
    }

    public final void clearOldDbAndUpdateSdkConfig(UserId userId) {
        if (PatchProxy.proxy(new Object[]{userId}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("UserSdkProxy", "rebuild sdk, " + userId);
        clearDb();
        teardown();
        updateConfig(CommonConfig.copy$default(this.commonConfig, null, userId.getThirdPartyUid(), userId.getThirdPartySecUid(), userId.getEpUid(), null, null, 0L, 0L, 0, null, null, null, null, 8177, null), this.strategyConfig, this.dependConfig);
    }

    private final void updateConfig(CommonConfig commonConfig, StrategyConfig strategyConfig, DependConfig dependConfig) {
        if (PatchProxy.proxy(new Object[]{commonConfig, strategyConfig, dependConfig}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.commonConfig = commonConfig;
        this.strategyConfig = strategyConfig;
        this.dependConfig = dependConfig;
        this.sdkComponent = buildSdkComponent();
        updateApi();
        setup();
    }

    public UserSdkProxy(CommonConfig commonConfig, StrategyConfig strategyConfig, DependConfig dependConfig) {
        C106862S5w.LIZ(commonConfig, strategyConfig, dependConfig);
        this.commonConfig = commonConfig;
        this.strategyConfig = strategyConfig;
        this.dependConfig = dependConfig;
        CtxUtil.INSTANCE.setAppContext(this.commonConfig.getContext());
        setup();
        LogHelper.INSTANCE.m20553i("UserSdkProxy", C0002O.m25082C("init UserSdkProxy: epUid = ", Long.valueOf(this.commonConfig.getEpUid()), ", bizUid = ", this.commonConfig.getBizUid(), ", bizSec = ", this.commonConfig.getBizSecUid()));
    }
}
