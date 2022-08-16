package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87975KlV;

/* loaded from: classes5.dex */
public final class LynxOpenPlugin$createLynxView$1$onLoadFailed$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87975KlV this$0;

    static {
        Covode.recordClassIndex(20214);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOpenPlugin$createLynxView$1$onLoadFailed$1(C87975KlV c87975KlV) {
        super(0);
        this.this$0 = c87975KlV;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC3609d abstractC3609d;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (abstractC3609d = this.this$0.LIZIZ.gameInteractPanel) != null) {
            abstractC3609d.LJIIIIZZ();
        }
        return Unit.INSTANCE;
    }
}
