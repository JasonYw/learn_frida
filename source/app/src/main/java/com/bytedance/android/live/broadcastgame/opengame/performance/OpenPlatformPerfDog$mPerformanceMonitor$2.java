package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.android.livehostapi.platform.IHostPerformanceMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C95452Nio;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfDog$mPerformanceMonitor$2 extends Lambda implements Function0<IHostPerformanceMonitor> {
    public static final OpenPlatformPerfDog$mPerformanceMonitor$2 INSTANCE = new OpenPlatformPerfDog$mPerformanceMonitor$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20800);
    }

    public OpenPlatformPerfDog$mPerformanceMonitor$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livehostapi.platform.IHostPerformanceMonitor, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IHostPerformanceMonitor mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C95452Nio.m23163LJ().LJJIJ();
    }
}
