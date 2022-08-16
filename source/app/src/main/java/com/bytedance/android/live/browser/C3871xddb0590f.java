package com.bytedance.android.live.browser;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.browser.AnnieInitHelper$createLynxConfig$1$providerFpsMonitor$1$hostPerformanceManager$2 */
/* loaded from: classes3.dex */
public final class C3871xddb0590f extends Lambda implements Function0<IPerformanceManager> {
    public static final C3871xddb0590f INSTANCE = new C3871xddb0590f();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21860);
    }

    public C3871xddb0590f() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdkapi.service.IPerformanceManager, com.bytedance.android.live.base.IService] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdkapi.service.IPerformanceManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IPerformanceManager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ServiceManager.getService(IPerformanceManager.class);
    }
}
