package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService$screenshotsDir$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ScreenshotsAuditService this$0;

    static {
        Covode.recordClassIndex(21062);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotsAuditService$screenshotsDir$2(ScreenshotsAuditService screenshotsAuditService) {
        super(0);
        this.this$0 = screenshotsAuditService;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        Object mo27335getValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        new StringBuilder();
        ScreenshotsAuditService screenshotsAuditService = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], screenshotsAuditService, ScreenshotsAuditService.LIZ, false, 6);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = screenshotsAuditService.LIZIZ.mo27335getValue();
        }
        return C0002O.m25085C((String) mo27335getValue, File.separator, "ScreenshotsJpg");
    }
}
