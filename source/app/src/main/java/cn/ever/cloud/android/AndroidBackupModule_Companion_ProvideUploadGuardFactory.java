package cn.ever.cloud.android;

import cn.ever.cloud.android.AndroidBackupModule;
import cn.ever.cloud.android.services.upload.UploadGuard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C101555Pz3;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AndroidBackupModule_Companion_ProvideUploadGuardFactory implements K8J<UploadGuard> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AndroidBackupModule.Companion module;

    static {
        Covode.recordClassIndex(2732);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UploadGuard mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        return provideInstance(this.module);
    }

    public AndroidBackupModule_Companion_ProvideUploadGuardFactory(AndroidBackupModule.Companion companion) {
        this.module = companion;
    }

    public static AndroidBackupModule_Companion_ProvideUploadGuardFactory create(AndroidBackupModule.Companion companion) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{companion}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AndroidBackupModule_Companion_ProvideUploadGuardFactory) proxy.result;
        }
        return new AndroidBackupModule_Companion_ProvideUploadGuardFactory(companion);
    }

    public static UploadGuard provideInstance(AndroidBackupModule.Companion companion) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{companion}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        return proxyProvideUploadGuard(companion);
    }

    public static UploadGuard proxyProvideUploadGuard(AndroidBackupModule.Companion companion) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{companion}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        UploadGuard provideUploadGuard = companion.provideUploadGuard();
        C101555Pz3.LIZ(provideUploadGuard, "Cannot return null from a non-@Nullable @Provides method");
        return provideUploadGuard;
    }
}
