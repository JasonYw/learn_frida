package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$hide$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20754);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$hide$1(FullScreenOpenPanel fullScreenOpenPanel) {
        super(0);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Unit mo30099invoke() {
        this.this$0.LJI = false;
        return Unit.INSTANCE;
    }
}
