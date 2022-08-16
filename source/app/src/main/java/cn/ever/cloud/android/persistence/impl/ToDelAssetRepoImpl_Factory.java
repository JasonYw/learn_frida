package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.persistence.SdkDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class ToDelAssetRepoImpl_Factory implements K8J<ToDelAssetRepoImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<SdkDatabase> dbProvider;

    static {
        Covode.recordClassIndex(2932);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final ToDelAssetRepoImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ToDelAssetRepoImpl) proxy.result;
        }
        return provideInstance(this.dbProvider);
    }

    public ToDelAssetRepoImpl_Factory(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        this.dbProvider = abstractC80193HjH;
    }

    public static ToDelAssetRepoImpl_Factory create(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (ToDelAssetRepoImpl_Factory) proxy.result;
        }
        return new ToDelAssetRepoImpl_Factory(abstractC80193HjH);
    }

    public static ToDelAssetRepoImpl newToDelAssetRepoImpl(SdkDatabase sdkDatabase) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkDatabase}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (ToDelAssetRepoImpl) proxy.result;
        }
        return new ToDelAssetRepoImpl(sdkDatabase);
    }

    public static ToDelAssetRepoImpl provideInstance(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ToDelAssetRepoImpl) proxy.result;
        }
        return new ToDelAssetRepoImpl(abstractC80193HjH.mo28680get());
    }
}
