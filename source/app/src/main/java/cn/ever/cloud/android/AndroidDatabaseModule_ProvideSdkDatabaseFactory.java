package cn.ever.cloud.android;

import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.network.auth.UserId;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.C101555Pz3;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AndroidDatabaseModule_ProvideSdkDatabaseFactory implements K8J<SdkDatabase> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AndroidDatabaseModule module;
    public final AbstractC80193HjH<UserId> userIdProvider;

    static {
        Covode.recordClassIndex(2734);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final SdkDatabase mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (SdkDatabase) proxy.result;
        }
        return provideInstance(this.module, this.userIdProvider);
    }

    public AndroidDatabaseModule_ProvideSdkDatabaseFactory(AndroidDatabaseModule androidDatabaseModule, AbstractC80193HjH<UserId> abstractC80193HjH) {
        this.module = androidDatabaseModule;
        this.userIdProvider = abstractC80193HjH;
    }

    public static AndroidDatabaseModule_ProvideSdkDatabaseFactory create(AndroidDatabaseModule androidDatabaseModule, AbstractC80193HjH<UserId> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidDatabaseModule, abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AndroidDatabaseModule_ProvideSdkDatabaseFactory) proxy.result;
        }
        return new AndroidDatabaseModule_ProvideSdkDatabaseFactory(androidDatabaseModule, abstractC80193HjH);
    }

    public static SdkDatabase provideInstance(AndroidDatabaseModule androidDatabaseModule, AbstractC80193HjH<UserId> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidDatabaseModule, abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (SdkDatabase) proxy.result;
        }
        return proxyProvideSdkDatabase(androidDatabaseModule, abstractC80193HjH.mo28680get());
    }

    public static SdkDatabase proxyProvideSdkDatabase(AndroidDatabaseModule androidDatabaseModule, UserId userId) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{androidDatabaseModule, userId}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (SdkDatabase) proxy.result;
        }
        SdkDatabase provideSdkDatabase = androidDatabaseModule.provideSdkDatabase(userId);
        C101555Pz3.LIZ(provideSdkDatabase, "Cannot return null from a non-@Nullable @Provides method");
        return provideSdkDatabase;
    }
}
