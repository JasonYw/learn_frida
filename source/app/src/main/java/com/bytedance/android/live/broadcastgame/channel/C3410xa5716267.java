package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KY0;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.AnchorAudienceMsgChannel$createMessageChannel$$inlined$apply$lambda$4 */
/* loaded from: classes5.dex */
public final class C3410xa5716267 extends Lambda implements Function1<AbstractC3337g.AbstractC3339b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KY0 this$0;

    static {
        Covode.recordClassIndex(19326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3410xa5716267(KY0 ky0) {
        super(1);
        this.this$0 = ky0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3337g.AbstractC3339b abstractC3339b) {
        if (!PatchProxy.proxy(new Object[]{abstractC3339b}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3339b);
            this.this$0.LIZJ().add(abstractC3339b);
        }
        return Unit.INSTANCE;
    }
}
