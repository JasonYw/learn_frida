package com.bytedance.android.live.broadcastgame.opengame.service;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.AnonymousClass425;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService$mainDir$2 extends Lambda implements Function0<String> {
    public static final ScreenshotsAuditService$mainDir$2 INSTANCE = new ScreenshotsAuditService$mainDir$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21058);
    }

    public ScreenshotsAuditService$mainDir$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        new StringBuilder();
        Application LIZ = AnonymousClass425.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        File cacheDir = LIZ.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        return C0002O.m25085C(cacheDir.getPath(), File.separator, "Screenshots");
    }
}
