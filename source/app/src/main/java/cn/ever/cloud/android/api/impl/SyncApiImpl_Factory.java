package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.SyncService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class SyncApiImpl_Factory implements K8J<SyncApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<SyncService> syncServiceProvider;

    static {
        Covode.recordClassIndex(2802);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final SyncApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (SyncApiImpl) proxy.result;
        }
        return provideInstance(this.syncServiceProvider);
    }

    public SyncApiImpl_Factory(AbstractC80193HjH<SyncService> abstractC80193HjH) {
        this.syncServiceProvider = abstractC80193HjH;
    }

    public static SyncApiImpl_Factory create(AbstractC80193HjH<SyncService> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (SyncApiImpl_Factory) proxy.result;
        }
        return new SyncApiImpl_Factory(abstractC80193HjH);
    }

    public static SyncApiImpl newSyncApiImpl(SyncService syncService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{syncService}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (SyncApiImpl) proxy.result;
        }
        return new SyncApiImpl(syncService);
    }

    public static SyncApiImpl provideInstance(AbstractC80193HjH<SyncService> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (SyncApiImpl) proxy.result;
        }
        return new SyncApiImpl(abstractC80193HjH.mo28680get());
    }
}
