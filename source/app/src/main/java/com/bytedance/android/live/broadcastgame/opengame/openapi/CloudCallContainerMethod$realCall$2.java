package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87690Kgu;

/* loaded from: classes3.dex */
public final class CloudCallContainerMethod$realCall$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $startTime;
    public final /* synthetic */ C87690Kgu this$0;

    static {
        Covode.recordClassIndex(20506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudCallContainerMethod$realCall$2(C87690Kgu c87690Kgu, long j) {
        super(1);
        this.this$0 = c87690Kgu;
        this.$startTime = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            ALogger.m15797i("CloudCallContainerMethod_realCall", "call container error, duration = " + (System.currentTimeMillis() - this.$startTime));
            this.this$0.LIZIZ(th2);
        }
        return Unit.INSTANCE;
    }
}
