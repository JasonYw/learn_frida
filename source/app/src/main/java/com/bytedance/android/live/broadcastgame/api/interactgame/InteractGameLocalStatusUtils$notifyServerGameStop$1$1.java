package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class InteractGameLocalStatusUtils$notifyServerGameStop$1$1 extends Lambda implements Function0<Unit> {
    public static final InteractGameLocalStatusUtils$notifyServerGameStop$1$1 INSTANCE = new InteractGameLocalStatusUtils$notifyServerGameStop$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19106);
    }

    public InteractGameLocalStatusUtils$notifyServerGameStop$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).sendGameCastStatusSEI(false);
        }
        return Unit.INSTANCE;
    }
}
