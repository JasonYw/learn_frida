package cn.ever.cloud.android;

import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.api.ApiBundle;
import cn.ever.cloud.network.auth.AbstractC0730a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Retrofit;
import p003X.AbstractC80193HjH;
import p003X.C101555Pz3;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AndroidNetworkModule_BindApiClientFactory implements K8J<AbstractC0729a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<ApiBundle> apiBundleProvider;
    public final AndroidNetworkModule module;
    public final AbstractC80193HjH<Retrofit> retrofitProvider;
    public final AbstractC80193HjH<AbstractC0730a> tokenProvider;

    static {
        Covode.recordClassIndex(2736);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AbstractC0729a mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC0729a) proxy.result;
        }
        return provideInstance(this.module, this.retrofitProvider, this.tokenProvider, this.apiBundleProvider);
    }

    public AndroidNetworkModule_BindApiClientFactory(AndroidNetworkModule androidNetworkModule, AbstractC80193HjH<Retrofit> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2, AbstractC80193HjH<ApiBundle> abstractC80193HjH3) {
        this.module = androidNetworkModule;
        this.retrofitProvider = abstractC80193HjH;
        this.tokenProvider = abstractC80193HjH2;
        this.apiBundleProvider = abstractC80193HjH3;
    }

    public static AndroidNetworkModule_BindApiClientFactory create(AndroidNetworkModule androidNetworkModule, AbstractC80193HjH<Retrofit> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2, AbstractC80193HjH<ApiBundle> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidNetworkModule, abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AndroidNetworkModule_BindApiClientFactory) proxy.result;
        }
        return new AndroidNetworkModule_BindApiClientFactory(androidNetworkModule, abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static AbstractC0729a provideInstance(AndroidNetworkModule androidNetworkModule, AbstractC80193HjH<Retrofit> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2, AbstractC80193HjH<ApiBundle> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidNetworkModule, abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AbstractC0729a) proxy.result;
        }
        return proxyBindApiClient(androidNetworkModule, abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }

    public static AbstractC0729a proxyBindApiClient(AndroidNetworkModule androidNetworkModule, Retrofit retrofit, AbstractC0730a abstractC0730a, ApiBundle apiBundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidNetworkModule, retrofit, abstractC0730a, apiBundle}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AbstractC0729a) proxy.result;
        }
        AbstractC0729a bindApiClient = androidNetworkModule.bindApiClient(retrofit, abstractC0730a, apiBundle);
        C101555Pz3.LIZ(bindApiClient, "Cannot return null from a non-@Nullable @Provides method");
        return bindApiClient;
    }
}
