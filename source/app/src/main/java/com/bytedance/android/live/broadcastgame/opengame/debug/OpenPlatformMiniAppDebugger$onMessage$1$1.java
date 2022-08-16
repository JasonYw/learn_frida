package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class OpenPlatformMiniAppDebugger$onMessage$1$1 extends Lambda implements Function0<Unit> {
    public static final OpenPlatformMiniAppDebugger$onMessage$1$1 INSTANCE = new OpenPlatformMiniAppDebugger$onMessage$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20083);
    }

    public OpenPlatformMiniAppDebugger$onMessage$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(LK5.LIZ(2131586594));
        }
        return Unit.INSTANCE;
    }
}
