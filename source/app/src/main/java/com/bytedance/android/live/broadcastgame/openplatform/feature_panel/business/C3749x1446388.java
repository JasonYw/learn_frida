package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC100834PnQ;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$preloadOpenFeatureList$$inlined$reqGoGo$lambda$1 */
/* loaded from: classes5.dex */
public final class C3749x1446388 extends Lambda implements Function1<AbstractC100834PnQ<C3382n>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3760e this$0;

    static {
        Covode.recordClassIndex(21322);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3749x1446388(C3760e c3760e) {
        super(1);
        this.this$0 = c3760e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC100834PnQ<C3382n> abstractC100834PnQ) {
        AbstractC100834PnQ<C3382n> abstractC100834PnQ2 = abstractC100834PnQ;
        if (!PatchProxy.proxy(new Object[]{abstractC100834PnQ2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC100834PnQ2);
            if (!abstractC100834PnQ2.LIZIZ.LJFF) {
                this.this$0.LIZ(abstractC100834PnQ2.LIZIZ.LIZIZ, abstractC100834PnQ2.LIZIZ.LIZJ, abstractC100834PnQ2.LIZIZ.LIZLLL, abstractC100834PnQ2.LIZIZ.f26025LJ, false, true);
            }
            this.this$0.LIZ(abstractC100834PnQ2.LIZIZ.LIZIZ);
            this.this$0.LIZIZ = abstractC100834PnQ2.LIZIZ;
        }
        return Unit.INSTANCE;
    }
}
