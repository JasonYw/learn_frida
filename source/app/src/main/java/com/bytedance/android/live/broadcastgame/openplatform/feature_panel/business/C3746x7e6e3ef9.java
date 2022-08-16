package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3382n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;
import p003X.C87911KkT;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$fetchOpenFeatureList$$inlined$reqGoGo$lambda$3 */
/* loaded from: classes5.dex */
public final class C3746x7e6e3ef9 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $hasReloaded$inlined;
    public final /* synthetic */ C3760e this$0;

    static {
        Covode.recordClassIndex(21317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3746x7e6e3ef9(C3760e c3760e, Ref.BooleanRef booleanRef) {
        super(1);
        this.this$0 = c3760e;
        this.$hasReloaded$inlined = booleanRef;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$fetchOpenFeatureList$$inlined$reqGoGo$lambda$3$2 */
    /* loaded from: classes5.dex */
    public static final class C37482 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21319);
        }

        public C37482() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                C3746x7e6e3ef9.this.this$0.LIZ().LJIIJ();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$fetchOpenFeatureList$$inlined$reqGoGo$lambda$3$1 */
    /* loaded from: classes5.dex */
    public static final class C37471 extends Lambda implements Function1<C3382n, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21318);
        }

        public C37471() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3382n c3382n) {
            C3382n c3382n2 = c3382n;
            if (!PatchProxy.proxy(new Object[]{c3382n2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3382n2);
                C3746x7e6e3ef9.this.this$0.LJFF();
                C3746x7e6e3ef9.this.this$0.LIZ(c3382n2.LIZIZ);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
            if (this.this$0.LIZIZ() && !this.$hasReloaded$inlined.element) {
                C87911KkT.LIZIZ.LIZ("interact_entrance 接口预请求失败，使用本地缓存", "OpenFeatureListHandler");
                C3760e c3760e = this.this$0;
                c3760e.LIZ(c3760e.LJIIIZ(), new C37471(), new C37482());
            } else {
                this.this$0.LIZ().LJIIJ();
            }
        }
        return Unit.INSTANCE;
    }
}
