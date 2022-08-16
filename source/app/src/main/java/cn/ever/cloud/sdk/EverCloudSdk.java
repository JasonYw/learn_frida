package cn.ever.cloud.sdk;

import cn.ever.cloud.sdk.api.AlbumApi;
import cn.ever.cloud.sdk.api.AssetApi;
import cn.ever.cloud.sdk.api.DownloadApi;
import cn.ever.cloud.sdk.api.SyncApi;
import cn.ever.cloud.sdk.api.UploadApi;
import cn.ever.cloud.sdk.api.UserApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EverCloudSdk {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final CommonConfig commonConfig;
    public final DependConfig dependConfig;
    public final StrategyConfig strategyConfig;
    public final UserSdkProxy userSdkProxy;

    static {
        Covode.recordClassIndex(3288);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3289);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EverCloudSdk create(CommonConfig commonConfig, StrategyConfig strategyConfig, DependConfig dependConfig) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{commonConfig, strategyConfig, dependConfig}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EverCloudSdk) proxy.result;
            }
            C106862S5w.LIZ(commonConfig, strategyConfig, dependConfig);
            return new EverCloudSdk(commonConfig, strategyConfig, dependConfig, null);
        }
    }

    public final boolean destroy() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        this.userSdkProxy.teardown();
        return true;
    }

    public final AlbumApi getAlbumApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (AlbumApi) proxy.result;
        }
        return this.userSdkProxy.getAlbumApi$sdk_douyin_release();
    }

    public final AssetApi getAssetApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AssetApi) proxy.result;
        }
        return this.userSdkProxy.getAssetApi$sdk_douyin_release();
    }

    public final DownloadApi getDownloadApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (DownloadApi) proxy.result;
        }
        return this.userSdkProxy.getDownloadApi$sdk_douyin_release();
    }

    public final SyncApi getSyncApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (SyncApi) proxy.result;
        }
        return this.userSdkProxy.getSyncApi$sdk_douyin_release();
    }

    public final UploadApi getUploadApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (UploadApi) proxy.result;
        }
        return this.userSdkProxy.getUploadApi$sdk_douyin_release();
    }

    public final UserApi getUserApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (UserApi) proxy.result;
        }
        return this.userSdkProxy.getUserApi$sdk_douyin_release();
    }

    public EverCloudSdk(CommonConfig commonConfig, StrategyConfig strategyConfig, DependConfig dependConfig) {
        this.commonConfig = commonConfig;
        this.strategyConfig = strategyConfig;
        this.dependConfig = dependConfig;
        this.userSdkProxy = new UserSdkProxy(this.commonConfig, this.strategyConfig, this.dependConfig);
    }

    public /* synthetic */ EverCloudSdk(CommonConfig commonConfig, StrategyConfig strategyConfig, DependConfig dependConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonConfig, strategyConfig, dependConfig);
    }
}
