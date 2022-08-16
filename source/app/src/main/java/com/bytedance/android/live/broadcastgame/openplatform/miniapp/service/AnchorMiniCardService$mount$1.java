package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87811Kir;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class AnchorMiniCardService$mount$1 extends Lambda implements Function0<Unit> {
    public static final AnchorMiniCardService$mount$1 INSTANCE = new AnchorMiniCardService$mount$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21797);
    }

    public AnchorMiniCardService$mount$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PageDataV2 LIZ = C87811Kir.LIZ();
            if (LIZ != null && LIZ.LJFF) {
                C88440Kt0.LIZ(2131586342);
            } else {
                C88440Kt0.LIZ(2131586343);
            }
        }
        return Unit.INSTANCE;
    }
}
