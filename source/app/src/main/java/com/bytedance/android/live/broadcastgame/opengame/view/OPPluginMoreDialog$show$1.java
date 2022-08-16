package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.android.live.broadcastgame.opengame.p292b.C3483a;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public final class OPPluginMoreDialog$show$1 extends Lambda implements Function1<C3483a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC3738r this$0;

    static {
        Covode.recordClassIndex(21151);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPPluginMoreDialog$show$1(DialogC3738r dialogC3738r) {
        super(1);
        this.this$0 = dialogC3738r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3483a c3483a) {
        C3483a c3483a2 = c3483a;
        if (!PatchProxy.proxy(new Object[]{c3483a2}, this, changeQuickRedirect, false, 1).isSupported && PanelType.Companion.LIZ(c3483a2.LIZ, c3483a2.LIZIZ)) {
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
