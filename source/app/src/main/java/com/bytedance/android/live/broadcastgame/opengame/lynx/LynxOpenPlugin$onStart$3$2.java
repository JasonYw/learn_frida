package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87965KlL;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$onStart$3$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87965KlL this$0;

    static {
        Covode.recordClassIndex(20223);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$onStart$3$2(C87965KlL c87965KlL) {
        super(0);
        this.this$0 = c87965KlL;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.startFail("resource not found");
        }
        return Unit.INSTANCE;
    }
}
