package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3608c;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87953Kl9;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$switchScreen$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ PanelType $toType;
    public final /* synthetic */ SonicGamePlugin this$0;

    static {
        Covode.recordClassIndex(21117);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$switchScreen$1(SonicGamePlugin sonicGamePlugin, PanelType panelType, Function1 function1) {
        super(0);
        this.this$0 = sonicGamePlugin;
        this.$toType = panelType;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC87953Kl9.withPanel$default(this.this$0, null, new C37241(), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$switchScreen$1$1 */
    /* loaded from: classes5.dex */
    public static final class C37241 extends Lambda implements Function1<AbstractC3609d, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21118);
        }

        public C37241() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$switchScreen$1$1$1 */
        /* loaded from: classes5.dex */
        public static final class C37251 extends Lambda implements Function1<PanelType, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(21119);
            }

            public C37251() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(PanelType panelType) {
                if (!PatchProxy.proxy(new Object[]{panelType}, this, changeQuickRedirect, false, 1).isSupported) {
                    C106862S5w.LIZ(panelType);
                    Function1 function1 = SonicGamePlugin$switchScreen$1.this.$block;
                    if (function1 != null) {
                        function1.invoke(panelType);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
            AbstractC3609d abstractC3609d2 = abstractC3609d;
            if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC3609d2);
                if (!(abstractC3609d2 instanceof AbstractC3608c)) {
                    abstractC3609d2 = null;
                }
                AbstractC3608c abstractC3608c = (AbstractC3608c) abstractC3609d2;
                if (abstractC3608c != null) {
                    abstractC3608c.LIZ(SonicGamePlugin$switchScreen$1.this.$toType, new C37251());
                }
            }
            return Unit.INSTANCE;
        }
    }
}
