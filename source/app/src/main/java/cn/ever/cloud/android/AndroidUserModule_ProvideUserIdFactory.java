package cn.ever.cloud.android;

import cn.ever.cloud.network.auth.AbstractC0730a;
import cn.ever.cloud.network.auth.UserId;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.C101555Pz3;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AndroidUserModule_ProvideUserIdFactory implements K8J<UserId> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AndroidUserModule module;
    public final AbstractC80193HjH<AbstractC0730a> tokenProvider;

    static {
        Covode.recordClassIndex(2738);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UserId mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        return provideInstance(this.module, this.tokenProvider);
    }

    public AndroidUserModule_ProvideUserIdFactory(AndroidUserModule androidUserModule, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        this.module = androidUserModule;
        this.tokenProvider = abstractC80193HjH;
    }

    public static AndroidUserModule_ProvideUserIdFactory create(AndroidUserModule androidUserModule, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidUserModule, abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AndroidUserModule_ProvideUserIdFactory) proxy.result;
        }
        return new AndroidUserModule_ProvideUserIdFactory(androidUserModule, abstractC80193HjH);
    }

    public static UserId provideInstance(AndroidUserModule androidUserModule, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidUserModule, abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        return proxyProvideUserId(androidUserModule, abstractC80193HjH.mo28680get());
    }

    public static UserId proxyProvideUserId(AndroidUserModule androidUserModule, AbstractC0730a abstractC0730a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidUserModule, abstractC0730a}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        UserId provideUserId = androidUserModule.provideUserId(abstractC0730a);
        C101555Pz3.LIZ(provideUserId, "Cannot return null from a non-@Nullable @Provides method");
        return provideUserId;
    }
}
