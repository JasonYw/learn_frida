package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$onResume$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20760);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$onResume$1(FullScreenOpenPanel fullScreenOpenPanel) {
        super(0);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3610e LJIIL = this.this$0.LJIIL();
            if (LJIIL != null) {
                LJIIL.LJIIL();
            }
            this.this$0.LJI = true;
        }
        return Unit.INSTANCE;
    }
}
