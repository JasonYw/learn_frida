package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveBasePluginWithPanel$onStop$1 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static final LiveBasePluginWithPanel$onStop$1 INSTANCE = new LiveBasePluginWithPanel$onStop$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20847);
    }

    public LiveBasePluginWithPanel$onStop$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            abstractC3609d2.dismiss();
        }
        return Unit.INSTANCE;
    }
}