package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class AudienceMiniCardHelper$hideCard$4 extends Lambda implements Function1<C3799p, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88098KnU $widget;

    static {
        Covode.recordClassIndex(21521);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardHelper$hideCard$4(C88098KnU c88098KnU) {
        super(1);
        this.$widget = c88098KnU;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$hideCard$4$1 */
    /* loaded from: classes5.dex */
    public static final class C37931 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ C3799p $this_addTask;

        static {
            Covode.recordClassIndex(21522);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37931(C3799p c3799p) {
            super(0);
            this.$this_addTask = c3799p;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                this.$this_addTask.LIZ();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3799p c3799p) {
        C3799p c3799p2 = c3799p;
        if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3799p2);
            C88098KnU c88098KnU = this.$widget;
            if (c88098KnU != null) {
                c88098KnU.LJIIIZ();
            }
            C88098KnU c88098KnU2 = this.$widget;
            if (c88098KnU2 != null) {
                C88098KnU.LIZ(c88098KnU2, 0L, new C37931(c3799p2), 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}
