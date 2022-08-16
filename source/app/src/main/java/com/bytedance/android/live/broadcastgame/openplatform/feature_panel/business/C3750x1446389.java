package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$preloadOpenFeatureList$$inlined$reqGoGo$lambda$2 */
/* loaded from: classes5.dex */
public final class C3750x1446389 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3760e this$0;

    static {
        Covode.recordClassIndex(21323);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3750x1446389(C3760e c3760e) {
        super(1);
        this.this$0 = c3760e;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$preloadOpenFeatureList$$inlined$reqGoGo$lambda$2$1 */
    /* loaded from: classes5.dex */
    public static final class C37511 extends Lambda implements Function1<C3382n, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21324);
        }

        public C37511() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3382n c3382n) {
            C3382n c3382n2 = c3382n;
            if (!PatchProxy.proxy(new Object[]{c3382n2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3382n2);
                if (!c3382n2.LJFF) {
                    C3750x1446389.this.this$0.LIZ(c3382n2.LIZIZ, c3382n2.LIZJ, c3382n2.LIZLLL, c3382n2.f26025LJ, false, true);
                }
                C3750x1446389.this.this$0.LIZ(c3382n2.LIZIZ);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
            C3760e c3760e = this.this$0;
            long LJIIIZ = c3760e.LJIIIZ();
            C37511 c37511 = new C37511();
            if (!PatchProxy.proxy(new Object[]{c3760e, new Long(LJIIIZ), c37511, null, 4, null}, null, C3760e.LIZ, true, 8).isSupported) {
                c3760e.LIZ(LJIIIZ, c37511, OpenFeatureListHandler$loadOpenFeatureListFromLocal$2.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }
}
