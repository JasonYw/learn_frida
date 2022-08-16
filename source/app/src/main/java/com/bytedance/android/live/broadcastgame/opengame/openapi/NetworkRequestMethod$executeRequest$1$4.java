package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87610Kfc;

/* loaded from: classes5.dex */
public final class NetworkRequestMethod$executeRequest$1$4 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87610Kfc this$0;

    static {
        Covode.recordClassIndex(20517);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestMethod$executeRequest$1$4(C87610Kfc c87610Kfc) {
        super(1);
        this.this$0 = c87610Kfc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            this.this$0.LIZIZ.LIZIZ(th2);
        }
        return Unit.INSTANCE;
    }
}
