package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.p039a.AbstractC0684f;
import cn.ever.cloud.network.auth.AbstractC0730a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class UserApiImpl_Factory implements K8J<UserApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0684f> repoProvider;
    public final AbstractC80193HjH<AbstractC0730a> tokenProvider;

    static {
        Covode.recordClassIndex(2830);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UserApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserApiImpl) proxy.result;
        }
        return provideInstance(this.repoProvider, this.tokenProvider);
    }

    public UserApiImpl_Factory(AbstractC80193HjH<AbstractC0684f> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2) {
        this.repoProvider = abstractC80193HjH;
        this.tokenProvider = abstractC80193HjH2;
    }

    public static UserApiImpl_Factory create(AbstractC80193HjH<AbstractC0684f> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UserApiImpl_Factory) proxy.result;
        }
        return new UserApiImpl_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static UserApiImpl newUserApiImpl(AbstractC0684f abstractC0684f, AbstractC0730a abstractC0730a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0684f, abstractC0730a}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UserApiImpl) proxy.result;
        }
        return new UserApiImpl(abstractC0684f, abstractC0730a);
    }

    public static UserApiImpl provideInstance(AbstractC80193HjH<AbstractC0684f> abstractC80193HjH, AbstractC80193HjH<AbstractC0730a> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserApiImpl) proxy.result;
        }
        return new UserApiImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get());
    }
}
