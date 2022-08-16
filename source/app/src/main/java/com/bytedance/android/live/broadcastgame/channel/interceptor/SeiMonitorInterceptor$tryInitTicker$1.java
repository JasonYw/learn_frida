package com.bytedance.android.live.broadcastgame.channel.interceptor;

import com.bytedance.android.live.broadcastgame.channel.C3431f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87177KWt;

/* loaded from: classes5.dex */
public final class SeiMonitorInterceptor$tryInitTicker$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87177KWt this$0;

    static {
        Covode.recordClassIndex(19501);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeiMonitorInterceptor$tryInitTicker$1(C87177KWt c87177KWt) {
        super(0);
        this.this$0 = c87177KWt;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZIZ == null) {
            C87177KWt c87177KWt = this.this$0;
            C3431f c3431f = new C3431f("sei-beat");
            c3431f.LIZ(10000L, new C3432x945cb19c(this));
            c87177KWt.LIZIZ = c3431f;
        }
        return Unit.INSTANCE;
    }
}
