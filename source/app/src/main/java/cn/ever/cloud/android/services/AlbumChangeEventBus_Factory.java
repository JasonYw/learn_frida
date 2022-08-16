package cn.ever.cloud.android.services;

import cn.ever.cloud.android.coroutine.SdkScope;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AlbumChangeEventBus_Factory implements K8J<AlbumChangeEventBus> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<SdkScope> scopeProvider;

    static {
        Covode.recordClassIndex(2963);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AlbumChangeEventBus mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AlbumChangeEventBus) proxy.result;
        }
        return provideInstance(this.scopeProvider);
    }

    public AlbumChangeEventBus_Factory(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        this.scopeProvider = abstractC80193HjH;
    }

    public static AlbumChangeEventBus_Factory create(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AlbumChangeEventBus_Factory) proxy.result;
        }
        return new AlbumChangeEventBus_Factory(abstractC80193HjH);
    }

    public static AlbumChangeEventBus newAlbumChangeEventBus(SdkScope sdkScope) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkScope}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AlbumChangeEventBus) proxy.result;
        }
        return new AlbumChangeEventBus(sdkScope);
    }

    public static AlbumChangeEventBus provideInstance(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AlbumChangeEventBus) proxy.result;
        }
        return new AlbumChangeEventBus(abstractC80193HjH.mo28680get());
    }
}
