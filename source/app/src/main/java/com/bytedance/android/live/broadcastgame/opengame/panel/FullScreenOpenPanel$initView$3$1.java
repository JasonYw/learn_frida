package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.View$OnClickListenerC88038KmW;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$initView$3$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC88038KmW this$0;

    static {
        Covode.recordClassIndex(20757);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$initView$3$1(View$OnClickListenerC88038KmW view$OnClickListenerC88038KmW) {
        super(0);
        this.this$0 = view$OnClickListenerC88038KmW;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3610e LJIIL = this.this$0.LIZIZ.LJIIL();
            if (LJIIL != null) {
                LJIIL.LJIIJ();
            }
            this.this$0.LIZIZ.LJI = false;
        }
        return Unit.INSTANCE;
    }
}
