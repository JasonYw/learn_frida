package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.channel.AAMManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class OpenSenderAdapter$onGameEntrance$1 extends Lambda implements Function1<AAMManager.AbstractC3405a, Unit> {
    public static final OpenSenderAdapter$onGameEntrance$1 INSTANCE = new OpenSenderAdapter$onGameEntrance$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19562);
    }

    public OpenSenderAdapter$onGameEntrance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AAMManager.AbstractC3405a abstractC3405a) {
        AAMManager.AbstractC3405a abstractC3405a2 = abstractC3405a;
        if (!PatchProxy.proxy(new Object[]{abstractC3405a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3405a2);
            abstractC3405a2.LIZLLL();
        }
        return Unit.INSTANCE;
    }
}
