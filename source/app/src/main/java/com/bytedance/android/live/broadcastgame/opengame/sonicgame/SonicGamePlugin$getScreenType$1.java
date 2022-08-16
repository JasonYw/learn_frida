package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3608c;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$getScreenType$1 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $block;

    static {
        Covode.recordClassIndex(21106);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$getScreenType$1(Function1 function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        PanelType mo15844LJ;
        Function1 function1;
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            if (!(abstractC3609d2 instanceof AbstractC3608c)) {
                abstractC3609d2 = null;
            }
            if (abstractC3609d2 != null && (mo15844LJ = abstractC3609d2.mo15844LJ()) != null && (function1 = this.$block) != null) {
                function1.invoke(mo15844LJ);
            }
        }
        return Unit.INSTANCE;
    }
}
