package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.persistence.SdkDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class UploadTaskRepositoryImpl_Factory implements K8J<UploadTaskRepositoryImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<SdkDatabase> dbProvider;

    static {
        Covode.recordClassIndex(2934);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UploadTaskRepositoryImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadTaskRepositoryImpl) proxy.result;
        }
        return provideInstance(this.dbProvider);
    }

    public UploadTaskRepositoryImpl_Factory(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        this.dbProvider = abstractC80193HjH;
    }

    public static UploadTaskRepositoryImpl_Factory create(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UploadTaskRepositoryImpl_Factory) proxy.result;
        }
        return new UploadTaskRepositoryImpl_Factory(abstractC80193HjH);
    }

    public static UploadTaskRepositoryImpl newUploadTaskRepositoryImpl(SdkDatabase sdkDatabase) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkDatabase}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UploadTaskRepositoryImpl) proxy.result;
        }
        return new UploadTaskRepositoryImpl(sdkDatabase);
    }

    public static UploadTaskRepositoryImpl provideInstance(AbstractC80193HjH<SdkDatabase> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadTaskRepositoryImpl) proxy.result;
        }
        return new UploadTaskRepositoryImpl(abstractC80193HjH.mo28680get());
    }
}
