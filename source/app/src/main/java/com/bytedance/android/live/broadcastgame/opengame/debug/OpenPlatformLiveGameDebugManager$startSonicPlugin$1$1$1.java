package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class OpenPlatformLiveGameDebugManager$startSonicPlugin$1$1$1 extends Lambda implements Function0<Unit> {
    public static final OpenPlatformLiveGameDebugManager$startSonicPlugin$1$1$1 INSTANCE = new OpenPlatformLiveGameDebugManager$startSonicPlugin$1$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20077);
    }

    public OpenPlatformLiveGameDebugManager$startSonicPlugin$1$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(2131586602);
        }
        return Unit.INSTANCE;
    }
}
