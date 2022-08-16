package cn.ever.cloud.network_impl.api;

import cn.ever.cloud.network.auth.AbstractC0730a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class ApiExecutor_Factory implements K8J<ApiExecutor> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0730a> tokenProvider;

    static {
        Covode.recordClassIndex(3273);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final ApiExecutor mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ApiExecutor) proxy.result;
        }
        return provideInstance(this.tokenProvider);
    }

    public ApiExecutor_Factory(AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        this.tokenProvider = abstractC80193HjH;
    }

    public static ApiExecutor_Factory create(AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (ApiExecutor_Factory) proxy.result;
        }
        return new ApiExecutor_Factory(abstractC80193HjH);
    }

    public static ApiExecutor newApiExecutor(AbstractC0730a abstractC0730a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0730a}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (ApiExecutor) proxy.result;
        }
        return new ApiExecutor(abstractC0730a);
    }

    public static ApiExecutor provideInstance(AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ApiExecutor) proxy.result;
        }
        return new ApiExecutor(abstractC80193HjH.mo28680get());
    }
}
