package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87993Kln;

/* loaded from: classes5.dex */
public final class PanelTopRightButtonView$setupAnchorPayFlowMsg$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87993Kln this$0;

    static {
        Covode.recordClassIndex(21155);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelTopRightButtonView$setupAnchorPayFlowMsg$1(C87993Kln c87993Kln) {
        super(0);
        this.this$0 = c87993Kln;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZIZ != null) {
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
