package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3802l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppAudiencePluginManager$receiveEntranceFromAnchor$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3802l $event;

    static {
        Covode.recordClassIndex(21749);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppAudiencePluginManager$receiveEntranceFromAnchor$1(C3802l c3802l) {
        super(0);
        this.$event = c3802l;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3802l.LIZ(this.$event, false, 1, null);
            C3802l.f26111LJ.LIZIZ(this.$event.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
