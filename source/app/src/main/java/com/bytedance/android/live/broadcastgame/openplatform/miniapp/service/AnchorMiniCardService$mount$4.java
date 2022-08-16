package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;

/* loaded from: classes3.dex */
public final class AnchorMiniCardService$mount$4 extends Lambda implements Function0<Unit> {
    public static final AnchorMiniCardService$mount$4 INSTANCE = new AnchorMiniCardService$mount$4();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21800);
    }

    public AnchorMiniCardService$mount$4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(2131586340);
        }
        return Unit.INSTANCE;
    }
}
