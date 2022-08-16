package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87811Kir;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class AnchorMiniCardService$mount$2 extends Lambda implements Function1<Throwable, Unit> {
    public static final AnchorMiniCardService$mount$2 INSTANCE = new AnchorMiniCardService$mount$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21798);
    }

    public AnchorMiniCardService$mount$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
            C88440Kt0.LIZ(2131586340);
            C87811Kir.LIZ(C87811Kir.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
