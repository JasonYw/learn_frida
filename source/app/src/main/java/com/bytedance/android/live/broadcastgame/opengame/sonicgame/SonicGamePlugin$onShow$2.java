package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$onShow$2 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SonicGamePlugin this$0;

    static {
        Covode.recordClassIndex(21113);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$onShow$2(SonicGamePlugin sonicGamePlugin) {
        super(1);
        this.this$0 = sonicGamePlugin;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            abstractC3609d2.LIZ(0);
            this.this$0.LIZ(SonicGamePlugin.SonicState.RESUME, true);
        }
        return Unit.INSTANCE;
    }
}
