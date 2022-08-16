package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class NormalCardLabel$startCountDown$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ NormalCardLabel this$0;

    static {
        Covode.recordClassIndex(21602);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCardLabel$startCountDown$1(NormalCardLabel normalCardLabel) {
        super(0);
        this.this$0 = normalCardLabel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.invoke("countdown_time_out");
        }
        return Unit.INSTANCE;
    }
}
