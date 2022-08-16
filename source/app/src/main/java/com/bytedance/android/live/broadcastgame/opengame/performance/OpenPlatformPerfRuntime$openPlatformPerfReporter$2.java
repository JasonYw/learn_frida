package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87421KcZ;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfRuntime$openPlatformPerfReporter$2 extends Lambda implements Function0<C3618b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87421KcZ this$0;

    static {
        Covode.recordClassIndex(20803);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformPerfRuntime$openPlatformPerfReporter$2(C87421KcZ c87421KcZ) {
        super(0);
        this.this$0 = c87421KcZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.opengame.performance.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3618b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C87421KcZ c87421KcZ = this.this$0;
        return new C3618b(c87421KcZ, c87421KcZ.LJIIIIZZ);
    }
}
