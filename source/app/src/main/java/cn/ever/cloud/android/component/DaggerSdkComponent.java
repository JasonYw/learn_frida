package cn.ever.cloud.android.component;

import cn.ever.cloud.android.AndroidDatabaseModule;
import cn.ever.cloud.android.AndroidDatabaseModule_ProvideSdkDatabaseFactory;
import cn.ever.cloud.android.AndroidNetworkModule;
import cn.ever.cloud.android.AndroidNetworkModule_BindApiClientFactory;
import cn.ever.cloud.android.AndroidUserModule;
import cn.ever.cloud.android.AndroidUserModule_ProvideUserIdFactory;
import cn.ever.cloud.android.MediaUploadCompleterImpl_Factory;
import cn.ever.cloud.android.api.AlbumApi;
import cn.ever.cloud.android.api.DownloadApi;
import cn.ever.cloud.android.api.UploadApi;
import cn.ever.cloud.android.api.UserApi;
import cn.ever.cloud.android.api.impl.AlbumApiImpl;
import cn.ever.cloud.android.api.impl.AssetApiImpl;
import cn.ever.cloud.android.api.impl.DownloadApiImpl;
import cn.ever.cloud.android.api.impl.SyncApiImpl;
import cn.ever.cloud.android.api.impl.UploadApiImpl;
import cn.ever.cloud.android.api.impl.UserApiImpl;
import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.impl.AlbumRepositoryImpl_Factory;
import cn.ever.cloud.android.persistence.impl.AssetRepositoryImpl;
import cn.ever.cloud.android.persistence.impl.AssetRepositoryImpl_Factory;
import cn.ever.cloud.android.persistence.impl.KeyValueRepositoryImpl;
import cn.ever.cloud.android.persistence.impl.ToDelAssetRepoImpl;
import cn.ever.cloud.android.persistence.impl.ToDelAssetRepoImpl_Factory;
import cn.ever.cloud.android.persistence.impl.UploadTaskRepositoryImpl_Factory;
import cn.ever.cloud.android.persistence.impl.UserRepositoryImpl;
import cn.ever.cloud.android.remote.SyncRemoteRepo;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.runtime.SandboxManager;
import cn.ever.cloud.android.services.AlbumChangeEventBus;
import cn.ever.cloud.android.services.AlbumChangeEventBus_Factory;
import cn.ever.cloud.android.services.AlbumService;
import cn.ever.cloud.android.services.AlbumService_Factory;
import cn.ever.cloud.android.services.AssetService;
import cn.ever.cloud.android.services.AssetService_Factory;
import cn.ever.cloud.android.services.CheckStateService;
import cn.ever.cloud.android.services.SyncService;
import cn.ever.cloud.android.services.download.DownloadService;
import cn.ever.cloud.android.services.download.DownloadService_Factory;
import cn.ever.cloud.android.services.download.Downloader_Factory;
import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.task.TaskService_Factory;
import cn.ever.cloud.android.services.upload.UploadGuard_Factory;
import cn.ever.cloud.android.services.upload.UploadService;
import cn.ever.cloud.android.services.upload.UploadService_Factory;
import cn.ever.cloud.android.services.upload.Uploader_Factory;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.api.ApiBundle;
import cn.ever.cloud.network.auth.AbstractC0730a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Retrofit;
import p002O.C0002O;
import p003X.AbstractC521106iO;
import p003X.AbstractC521156iT;
import p003X.AbstractC521356in;
import p003X.AbstractC521566j8;
import p003X.AbstractC80193HjH;
import p003X.C101275PuX;
import p003X.C101522PyW;
import p003X.C101555Pz3;

/* loaded from: classes20.dex */
public final class DaggerSdkComponent implements AbstractC521356in {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC80193HjH<AlbumChangeEventBus> albumChangeEventBusProvider;
    public AlbumRepositoryImpl_Factory albumRepositoryImplProvider;
    public AbstractC80193HjH<AlbumService> albumServiceProvider;
    public AndroidNetworkModule androidNetworkModule;
    public ApiBundle apiBundle;
    public AbstractC80193HjH<ApiBundle> apiBundleProvider;
    public AssetRepositoryImpl_Factory assetRepositoryImplProvider;
    public AssetService_Factory assetServiceProvider;
    public AndroidNetworkModule_BindApiClientFactory bindApiClientProvider;
    public AbstractC80193HjH<DigestHasher> digestHasherProvider;
    public AbstractC80193HjH<DownloadService> downloadServiceProvider;
    public Downloader_Factory downloaderProvider;
    public MediaUploadCompleterImpl_Factory mediaUploadCompleterImplProvider;
    public AbstractC80193HjH<SdkDatabase> provideSdkDatabaseProvider;
    public AndroidUserModule_ProvideUserIdFactory provideUserIdProvider;
    public Retrofit retrofit;
    public AbstractC80193HjH<Retrofit> retrofitProvider;
    public AbstractC80193HjH<RuntimeExtManager> runtimeExtManagerProvider;
    public AbstractC80193HjH<SandboxManager> sandboxManagerProvider;
    public SdkScope sdkScope;
    public AbstractC80193HjH<SdkScope> sdkScopeProvider;
    public AbstractC80193HjH<TaskService> taskServiceProvider;
    public ToDelAssetRepoImpl_Factory toDelAssetRepoImplProvider;
    public AbstractC80193HjH<AbstractC0730a> tokenProvider;
    public AbstractC0730a tokenProvider2;
    public AbstractC80193HjH<UploadService> uploadServiceProvider;
    public UploadTaskRepositoryImpl_Factory uploadTaskRepositoryImplProvider;
    public Uploader_Factory uploaderProvider;

    /* renamed from: cn.ever.cloud.android.component.DaggerSdkComponent$1 */
    /* loaded from: classes20.dex */
    public static /* synthetic */ class C07071 {
        static {
            Covode.recordClassIndex(2832);
        }
    }

    static {
        Covode.recordClassIndex(2831);
    }

    /* loaded from: classes20.dex */
    public static final class Builder implements AbstractC521566j8 {
        public static ChangeQuickRedirect changeQuickRedirect;
        public AndroidDatabaseModule androidDatabaseModule;
        public AndroidNetworkModule androidNetworkModule;
        public AndroidUserModule androidUserModule;
        public ApiBundle apiBundle;
        public DigestHasher digestHasher;
        public Retrofit retrofit;
        public RuntimeExtManager runtimeExtManager;
        public SandboxManager sandboxManager;
        public SdkScope sdkScope;
        public AbstractC0730a tokenProvider;

        static {
            Covode.recordClassIndex(2833);
        }

        public Builder() {
        }

        @Override // p003X.AbstractC521566j8
        public final AbstractC521356in build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (AbstractC521356in) proxy.result;
            }
            if (this.androidDatabaseModule == null) {
                this.androidDatabaseModule = new AndroidDatabaseModule();
            }
            if (this.androidUserModule == null) {
                this.androidUserModule = new AndroidUserModule();
            }
            if (this.androidNetworkModule == null) {
                this.androidNetworkModule = new AndroidNetworkModule();
            }
            if (this.retrofit != null) {
                if (this.digestHasher != null) {
                    if (this.sandboxManager != null) {
                        if (this.sdkScope != null) {
                            if (this.tokenProvider != null) {
                                if (this.apiBundle != null) {
                                    if (this.runtimeExtManager != null) {
                                        return new DaggerSdkComponent(this, null);
                                    }
                                    new StringBuilder();
                                    throw new IllegalStateException(C0002O.m25086C(RuntimeExtManager.class.getCanonicalName(), " must be set"));
                                }
                                new StringBuilder();
                                throw new IllegalStateException(C0002O.m25086C(ApiBundle.class.getCanonicalName(), " must be set"));
                            }
                            new StringBuilder();
                            throw new IllegalStateException(C0002O.m25086C(AbstractC0730a.class.getCanonicalName(), " must be set"));
                        }
                        new StringBuilder();
                        throw new IllegalStateException(C0002O.m25086C(SdkScope.class.getCanonicalName(), " must be set"));
                    }
                    new StringBuilder();
                    throw new IllegalStateException(C0002O.m25086C(SandboxManager.class.getCanonicalName(), " must be set"));
                }
                new StringBuilder();
                throw new IllegalStateException(C0002O.m25086C(DigestHasher.class.getCanonicalName(), " must be set"));
            }
            new StringBuilder();
            throw new IllegalStateException(C0002O.m25086C(Retrofit.class.getCanonicalName(), " must be set"));
        }

        public /* synthetic */ Builder(C07071 c07071) {
            this();
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: apiBundle  reason: collision with other method in class */
        public final Builder mo25227apiBundle(ApiBundle apiBundle) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{apiBundle}, this, changeQuickRedirect, false, 7);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(apiBundle);
            this.apiBundle = apiBundle;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: digestHasher  reason: collision with other method in class */
        public final Builder mo25228digestHasher(DigestHasher digestHasher) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{digestHasher}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(digestHasher);
            this.digestHasher = digestHasher;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: retrofit  reason: collision with other method in class */
        public final Builder mo25229retrofit(Retrofit retrofit) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{retrofit}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(retrofit);
            this.retrofit = retrofit;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: runtimeExtManager  reason: collision with other method in class */
        public final Builder mo25230runtimeExtManager(RuntimeExtManager runtimeExtManager) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runtimeExtManager}, this, changeQuickRedirect, false, 8);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(runtimeExtManager);
            this.runtimeExtManager = runtimeExtManager;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: sandboxManager  reason: collision with other method in class */
        public final Builder mo25231sandboxManager(SandboxManager sandboxManager) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sandboxManager}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(sandboxManager);
            this.sandboxManager = sandboxManager;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: sdkScope  reason: collision with other method in class */
        public final Builder mo25232sdkScope(SdkScope sdkScope) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkScope}, this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(sdkScope);
            this.sdkScope = sdkScope;
            return this;
        }

        @Override // p003X.AbstractC521566j8
        /* renamed from: tokenProvider  reason: collision with other method in class */
        public final Builder mo25233tokenProvider(AbstractC0730a abstractC0730a) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0730a}, this, changeQuickRedirect, false, 6);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C101555Pz3.LIZ(abstractC0730a);
            this.tokenProvider = abstractC0730a;
            return this;
        }
    }

    @Override // p003X.AbstractC521356in
    public final SdkScope sdkScope() {
        return this.sdkScope;
    }

    @Override // p003X.AbstractC521356in
    public final AbstractC0730a tokenProvider() {
        return this.tokenProvider2;
    }

    public static AbstractC521566j8 builder() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AbstractC521566j8) proxy.result;
        }
        return new Builder(null);
    }

    private AbstractC0729a getApiClient() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AbstractC0729a) proxy.result;
        }
        return AndroidNetworkModule_BindApiClientFactory.proxyBindApiClient(this.androidNetworkModule, this.retrofit, this.tokenProvider2, this.apiBundle);
    }

    private AssetApiImpl getAssetApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (AssetApiImpl) proxy.result;
        }
        return new AssetApiImpl(getAssetService());
    }

    private SyncApiImpl getSyncApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (SyncApiImpl) proxy.result;
        }
        return new SyncApiImpl(getSyncService());
    }

    private UserApiImpl getUserApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (UserApiImpl) proxy.result;
        }
        return new UserApiImpl(getUserRepositoryImpl(), this.tokenProvider2);
    }

    @Override // p003X.AbstractC521356in
    public final AlbumApi albumApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (AlbumApi) proxy.result;
        }
        return getAlbumApiImpl();
    }

    public final AlbumService albumService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (AlbumService) proxy.result;
        }
        return this.albumServiceProvider.mo28680get();
    }

    @Override // p003X.AbstractC521356in
    public final AbstractC521156iT assetApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (AbstractC521156iT) proxy.result;
        }
        return getAssetApiImpl();
    }

    @Override // p003X.AbstractC521356in
    public final SdkDatabase database() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (SdkDatabase) proxy.result;
        }
        return this.provideSdkDatabaseProvider.mo28680get();
    }

    @Override // p003X.AbstractC521356in
    public final DownloadApi downloadApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (DownloadApi) proxy.result;
        }
        return getDownloadApiImpl();
    }

    @Override // p003X.AbstractC521356in
    public final DownloadService downloadService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (DownloadService) proxy.result;
        }
        return this.downloadServiceProvider.mo28680get();
    }

    @Override // p003X.AbstractC521356in
    public final AbstractC521106iO syncApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (AbstractC521106iO) proxy.result;
        }
        return getSyncApiImpl();
    }

    @Override // p003X.AbstractC521356in
    public final TaskService taskService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (TaskService) proxy.result;
        }
        return this.taskServiceProvider.mo28680get();
    }

    @Override // p003X.AbstractC521356in
    public final UploadApi uploadApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (UploadApi) proxy.result;
        }
        return getUploadApiImpl();
    }

    @Override // p003X.AbstractC521356in
    public final UploadService uploadService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (UploadService) proxy.result;
        }
        return this.uploadServiceProvider.mo28680get();
    }

    @Override // p003X.AbstractC521356in
    public final UserApi userApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (UserApi) proxy.result;
        }
        return getUserApiImpl();
    }

    private AlbumApiImpl getAlbumApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (AlbumApiImpl) proxy.result;
        }
        return new AlbumApiImpl(this.albumServiceProvider.mo28680get(), this.taskServiceProvider.mo28680get(), getAssetService());
    }

    private AssetRepositoryImpl getAssetRepositoryImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AssetRepositoryImpl) proxy.result;
        }
        return new AssetRepositoryImpl(this.provideSdkDatabaseProvider.mo28680get(), this.albumChangeEventBusProvider.mo28680get());
    }

    private AssetService getAssetService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (AssetService) proxy.result;
        }
        return new AssetService(getAssetRepositoryImpl(), getApiClient());
    }

    private DownloadApiImpl getDownloadApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (DownloadApiImpl) proxy.result;
        }
        return new DownloadApiImpl(this.downloadServiceProvider.mo28680get(), getAssetRepositoryImpl(), this.taskServiceProvider.mo28680get());
    }

    private KeyValueRepositoryImpl getKeyValueRepositoryImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (KeyValueRepositoryImpl) proxy.result;
        }
        return new KeyValueRepositoryImpl(this.provideSdkDatabaseProvider.mo28680get());
    }

    private SyncRemoteRepo getSyncRemoteRepo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (SyncRemoteRepo) proxy.result;
        }
        return new SyncRemoteRepo(getApiClient(), getAssetRepositoryImpl());
    }

    private SyncService getSyncService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (SyncService) proxy.result;
        }
        return new SyncService(getAssetRepositoryImpl(), this.albumServiceProvider.mo28680get(), getSyncRemoteRepo(), getKeyValueRepositoryImpl(), getUserRepositoryImpl());
    }

    private ToDelAssetRepoImpl getToDelAssetRepoImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (ToDelAssetRepoImpl) proxy.result;
        }
        return new ToDelAssetRepoImpl(this.provideSdkDatabaseProvider.mo28680get());
    }

    private UploadApiImpl getUploadApiImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (UploadApiImpl) proxy.result;
        }
        return new UploadApiImpl(this.uploadServiceProvider.mo28680get(), this.taskServiceProvider.mo28680get());
    }

    private UserRepositoryImpl getUserRepositoryImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (UserRepositoryImpl) proxy.result;
        }
        return new UserRepositoryImpl(this.provideSdkDatabaseProvider.mo28680get());
    }

    @Override // p003X.AbstractC521356in
    public final CheckStateService checkStateService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return (CheckStateService) proxy.result;
        }
        return new CheckStateService(getApiClient(), getAssetService(), getToDelAssetRepoImpl());
    }

    public DaggerSdkComponent(Builder builder) {
        initialize(builder);
    }

    private void initialize(Builder builder) {
        if (PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        this.tokenProvider = C101275PuX.LIZ(builder.tokenProvider);
        this.provideUserIdProvider = AndroidUserModule_ProvideUserIdFactory.create(builder.androidUserModule, this.tokenProvider);
        this.provideSdkDatabaseProvider = C101522PyW.LIZ(AndroidDatabaseModule_ProvideSdkDatabaseFactory.create(builder.androidDatabaseModule, this.provideUserIdProvider));
        this.sdkScopeProvider = C101275PuX.LIZ(builder.sdkScope);
        this.albumChangeEventBusProvider = C101522PyW.LIZ(AlbumChangeEventBus_Factory.create(this.sdkScopeProvider));
        this.androidNetworkModule = builder.androidNetworkModule;
        this.retrofit = builder.retrofit;
        this.tokenProvider2 = builder.tokenProvider;
        this.apiBundle = builder.apiBundle;
        this.albumRepositoryImplProvider = AlbumRepositoryImpl_Factory.create(this.provideSdkDatabaseProvider);
        this.assetRepositoryImplProvider = AssetRepositoryImpl_Factory.create(this.provideSdkDatabaseProvider, this.albumChangeEventBusProvider);
        this.retrofitProvider = C101275PuX.LIZ(builder.retrofit);
        this.apiBundleProvider = C101275PuX.LIZ(builder.apiBundle);
        this.bindApiClientProvider = AndroidNetworkModule_BindApiClientFactory.create(builder.androidNetworkModule, this.retrofitProvider, this.tokenProvider, this.apiBundleProvider);
        this.assetServiceProvider = AssetService_Factory.create(this.assetRepositoryImplProvider, this.bindApiClientProvider);
        this.digestHasherProvider = C101275PuX.LIZ(builder.digestHasher);
        this.sandboxManagerProvider = C101275PuX.LIZ(builder.sandboxManager);
        this.runtimeExtManagerProvider = C101275PuX.LIZ(builder.runtimeExtManager);
        this.mediaUploadCompleterImplProvider = MediaUploadCompleterImpl_Factory.create(this.assetRepositoryImplProvider, this.assetServiceProvider, this.runtimeExtManagerProvider);
        this.toDelAssetRepoImplProvider = ToDelAssetRepoImpl_Factory.create(this.provideSdkDatabaseProvider);
        this.uploaderProvider = Uploader_Factory.create(this.bindApiClientProvider, this.digestHasherProvider, this.sandboxManagerProvider, this.mediaUploadCompleterImplProvider, this.sdkScopeProvider, UploadGuard_Factory.create(), this.runtimeExtManagerProvider, this.toDelAssetRepoImplProvider);
        this.uploadTaskRepositoryImplProvider = UploadTaskRepositoryImpl_Factory.create(this.provideSdkDatabaseProvider);
        this.uploadServiceProvider = C101522PyW.LIZ(UploadService_Factory.create(this.uploaderProvider, this.uploadTaskRepositoryImplProvider, this.sdkScopeProvider));
        this.taskServiceProvider = C101522PyW.LIZ(TaskService_Factory.create(this.sdkScopeProvider));
        this.albumServiceProvider = C101522PyW.LIZ(AlbumService_Factory.create(this.albumRepositoryImplProvider, this.assetRepositoryImplProvider, this.assetServiceProvider, this.uploadServiceProvider, this.taskServiceProvider, this.bindApiClientProvider, this.albumChangeEventBusProvider));
        this.downloaderProvider = Downloader_Factory.create(this.digestHasherProvider, this.bindApiClientProvider, this.sdkScopeProvider);
        this.downloadServiceProvider = C101522PyW.LIZ(DownloadService_Factory.create(this.sdkScopeProvider, this.downloaderProvider));
        this.sdkScope = builder.sdkScope;
    }

    public /* synthetic */ DaggerSdkComponent(Builder builder, C07071 c07071) {
        this(builder);
    }
}
