package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;

/* loaded from: classes3.dex */
public final class OpenPlatformPerfRuntime$stopPerfCollectAndReport$1 extends Lambda implements Function0<Unit> {
    public static final OpenPlatformPerfRuntime$stopPerfCollectAndReport$1 INSTANCE = new OpenPlatformPerfRuntime$stopPerfCollectAndReport$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20809);
    }

    public OpenPlatformPerfRuntime$stopPerfCollectAndReport$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ("性能测试时间已达标，自动结束性能测试");
        }
        return Unit.INSTANCE;
    }
}
