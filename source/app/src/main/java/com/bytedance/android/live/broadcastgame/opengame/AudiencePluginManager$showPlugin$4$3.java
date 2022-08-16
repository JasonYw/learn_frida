package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87746Kho;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$showPlugin$4$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87746Kho this$0;

    static {
        Covode.recordClassIndex(19899);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$showPlugin$4$3(C87746Kho c87746Kho) {
        super(0);
        this.this$0 = c87746Kho;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC3664m abstractC3664m;
        C3607p LJIIJ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (abstractC3664m = this.this$0.LIZIZ.LJII) != null && (LJIIJ = abstractC3664m.LJIIJ()) != null && LJIIJ.LJIIJ != null) {
            this.this$0.LIZIZ.LIZJ.LJFF = true;
            this.this$0.LIZIZ.LIZIZ(this.this$0.LIZJ, this.this$0.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
