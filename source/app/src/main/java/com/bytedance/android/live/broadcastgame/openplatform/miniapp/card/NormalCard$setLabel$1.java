package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87886Kk4;
import p003X.C87889Kk7;

/* loaded from: classes5.dex */
public final class NormalCard$setLabel$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87889Kk7 this$0;

    static {
        Covode.recordClassIndex(21596);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCard$setLabel$1(C87889Kk7 c87889Kk7) {
        super(0);
        this.this$0 = c87889Kk7;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((NormalCardBtn) this.this$0.LIZ(2131192811)).setInfo(new C87886Kk4(100, null, null, 6));
        }
        return Unit.INSTANCE;
    }
}
