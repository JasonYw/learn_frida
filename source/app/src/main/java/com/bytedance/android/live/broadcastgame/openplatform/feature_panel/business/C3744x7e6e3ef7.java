package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C87911KkT;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.OpenFeatureListHandler$fetchOpenFeatureList$$inlined$reqGoGo$lambda$1 */
/* loaded from: classes5.dex */
public final class C3744x7e6e3ef7 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $hasReloaded$inlined;
    public final /* synthetic */ C3760e this$0;

    static {
        Covode.recordClassIndex(21315);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3744x7e6e3ef7(C3760e c3760e, Ref.BooleanRef booleanRef) {
        super(0);
        this.this$0 = c3760e;
        this.$hasReloaded$inlined = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$hasReloaded$inlined.element = this.this$0.LJFF();
            if (!this.$hasReloaded$inlined.element) {
                this.this$0.LIZ().LIZ(true);
                C87911KkT.LIZIZ.LIZ("no local cache, loading", "OpenFeatureListHandler");
            }
        }
        return Unit.INSTANCE;
    }
}
