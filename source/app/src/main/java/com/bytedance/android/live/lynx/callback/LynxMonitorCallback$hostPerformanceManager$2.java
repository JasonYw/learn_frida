package com.bytedance.android.live.lynx.callback;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LynxMonitorCallback$hostPerformanceManager$2 extends Lambda implements Function0<IPerformanceManager> {
    public static final LynxMonitorCallback$hostPerformanceManager$2 INSTANCE = new LynxMonitorCallback$hostPerformanceManager$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32168);
    }

    public LynxMonitorCallback$hostPerformanceManager$2() {
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
