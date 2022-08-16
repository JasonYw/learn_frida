package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.w$b;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88224KpW;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceMiniCardHelper$doShowCard$1 extends Lambda implements Function1<AbstractC88224KpW<C6532d>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3795b this$0;

    static {
        Covode.recordClassIndex(21503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardHelper$doShowCard$1(C3795b c3795b) {
        super(1);
        this.this$0 = c3795b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC88224KpW<C6532d> abstractC88224KpW) {
        AbstractC88224KpW<C6532d> abstractC88224KpW2 = abstractC88224KpW;
        if (!PatchProxy.proxy(new Object[]{abstractC88224KpW2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC88224KpW2);
            abstractC88224KpW2.LIZ(this.this$0.getClass());
            abstractC88224KpW2.LIZ((w$b) null);
        }
        return Unit.INSTANCE;
    }
}
