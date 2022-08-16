package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88172Kog;

/* loaded from: classes5.dex */
public final class OpenFeatureChooseListFragment$processGroupListVisibleScroll$1 extends Lambda implements Function1<d$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88172Kog this$0;

    static {
        Covode.recordClassIndex(21370);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFeatureChooseListFragment$processGroupListVisibleScroll$1(C88172Kog c88172Kog) {
        super(1);
        this.this$0 = c88172Kog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(d$b d_b) {
        d$b d_b2 = d_b;
        if (!PatchProxy.proxy(new Object[]{d_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(d_b2);
            this.this$0.LJIIL.LIZIZ = d_b2.LIZIZ;
            this.this$0.LJIIL.LIZJ = d_b2.LIZJ;
        }
        return Unit.INSTANCE;
    }
}
