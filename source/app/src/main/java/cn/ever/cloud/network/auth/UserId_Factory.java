package cn.ever.cloud.network.auth;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes5.dex */
public final class UserId_Factory implements K8J<UserId> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<Long> epUidProvider;
    public final AbstractC80193HjH<String> thirdPartySecUidAndThirdPartyUidProvider;

    static {
        Covode.recordClassIndex(3182);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UserId mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        return provideInstance(this.thirdPartySecUidAndThirdPartyUidProvider, this.epUidProvider);
    }

    public UserId_Factory(AbstractC80193HjH<String> abstractC80193HjH, AbstractC80193HjH<Long> abstractC80193HjH2) {
        this.thirdPartySecUidAndThirdPartyUidProvider = abstractC80193HjH;
        this.epUidProvider = abstractC80193HjH2;
    }

    public static UserId_Factory create(AbstractC80193HjH<String> abstractC80193HjH, AbstractC80193HjH<Long> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UserId_Factory) proxy.result;
        }
        return new UserId_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static UserId provideInstance(AbstractC80193HjH<String> abstractC80193HjH, AbstractC80193HjH<Long> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        return new UserId(abstractC80193HjH.mo28680get(), abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get().longValue());
    }

    public static UserId newUserId(String str, String str2, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, new Long(j)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        return new UserId(str, str2, j);
    }
}
