package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ContinuousTimeTicker$stop$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3431f this$0;

    static {
        Covode.recordClassIndex(19354);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuousTimeTicker$stop$1(C3431f c3431f) {
        super(0);
        this.this$0 = c3431f;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ();
        }
        return Unit.INSTANCE;
    }
}
