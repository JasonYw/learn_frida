package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC100834PnQ;
import p003X.C106862S5w;
import p003X.C87911KkT;
import p003X.C88166Koa;
import p003X.C88199Kp7;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$fetchOpenFeatureList$$inlined$reqGoGo$lambda$2 */
/* loaded from: classes5.dex */
public final class C3745x7e6e3ef8 extends Lambda implements Function1<AbstractC100834PnQ<C3382n>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $hasReloaded$inlined;
    public final /* synthetic */ C3760e this$0;

    static {
        Covode.recordClassIndex(21316);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3745x7e6e3ef8(C3760e c3760e, Ref.BooleanRef booleanRef) {
        super(1);
        this.this$0 = c3760e;
        this.$hasReloaded$inlined = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC100834PnQ<C3382n> abstractC100834PnQ) {
        Disposable subscribe;
        AbstractC100834PnQ<C3382n> abstractC100834PnQ2 = abstractC100834PnQ;
        if (!PatchProxy.proxy(new Object[]{abstractC100834PnQ2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC100834PnQ2);
            if (abstractC100834PnQ2.LIZIZ.LJFF) {
                C87911KkT.LIZIZ.LIZ("interact entrance no update", "OpenFeatureListHandler");
                this.this$0.LIZ().LIZ(false);
            } else {
                C87911KkT c87911KkT = C87911KkT.LIZIZ;
                C87911KkT.LIZ(c87911KkT, "interact entrance update. list size " + abstractC100834PnQ2.LIZIZ.LIZIZ.size(), null, 2, null);
                this.this$0.LIZ().LIZ(false);
                C3760e.LIZ(this.this$0, abstractC100834PnQ2.LIZIZ.LIZIZ, abstractC100834PnQ2.LIZIZ.LIZJ, abstractC100834PnQ2.LIZIZ.LIZLLL, abstractC100834PnQ2.LIZIZ.f26025LJ, false, false, 32, null);
                this.this$0.LIZ(abstractC100834PnQ2.LIZIZ.LIZIZ);
                this.this$0.LIZIZ = abstractC100834PnQ2.LIZIZ;
            }
            C3760e c3760e = this.this$0;
            C3382n c3382n = abstractC100834PnQ2.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c3382n}, c3760e, C3760e.LIZ, false, 6).isSupported && c3760e.LIZIZ() && !c3760e.LIZJ.getAndSet(true)) {
                C87911KkT.LIZIZ.LIZ("save open feature list 2 local", "OpenFeatureListHandler");
                Observable<Unit> LIZ = c3760e.LJIIIIZZ().LIZ(c3382n, c3760e.LJII());
                if (LIZ != null && (subscribe = LIZ.subscribe(C88199Kp7.LIZ, C88166Koa.LIZIZ)) != null) {
                    c3760e.LIZ(subscribe);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
