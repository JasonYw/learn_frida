package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService$queue$2 extends Lambda implements Function0<LinkedList<ScreenshotsAuditService.AbstractC3711a>> {
    public static final ScreenshotsAuditService$queue$2 INSTANCE = new ScreenshotsAuditService$queue$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21060);
    }

    public ScreenshotsAuditService$queue$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedList<com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LinkedList<ScreenshotsAuditService.AbstractC3711a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedList<>();
    }
}
