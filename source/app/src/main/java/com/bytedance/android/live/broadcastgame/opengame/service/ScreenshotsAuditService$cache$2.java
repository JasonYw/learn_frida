package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService$cache$2 extends Lambda implements Function0<C3720b> {
    public static final ScreenshotsAuditService$cache$2 INSTANCE = new ScreenshotsAuditService$cache$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21047);
    }

    public ScreenshotsAuditService$cache$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.opengame.service.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3720b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3720b();
    }
}
