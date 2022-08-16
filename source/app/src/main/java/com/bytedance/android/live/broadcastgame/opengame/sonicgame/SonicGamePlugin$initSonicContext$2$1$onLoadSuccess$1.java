package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$initSonicContext$2$1$onLoadSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SonicGamePlugin$initSonicContext$2.C37221 this$0;

    static {
        Covode.recordClassIndex(21110);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$initSonicContext$2$1$onLoadSuccess$1(SonicGamePlugin$initSonicContext$2.C37221 c37221) {
        super(0);
        this.this$0 = c37221;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.LJIIIIZZ();
            this.this$0.LIZJ.LIZIZ(true);
            SonicGamePlugin$initSonicContext$2.this.this$0.onStartSucceed();
        }
        return Unit.INSTANCE;
    }
}
