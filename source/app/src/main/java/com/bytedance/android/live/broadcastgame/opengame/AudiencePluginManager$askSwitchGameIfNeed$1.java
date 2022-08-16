package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87733Khb;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$askSwitchGameIfNeed$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3516am $entrance;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19890);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$askSwitchGameIfNeed$1(C87733Khb c87733Khb, C3516am c3516am) {
        super(0);
        this.this$0 = c87733Khb;
        this.$entrance = c3516am;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    public final void LIZ() {
        C3607p LJIIJ;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.this$0.LJFF();
        this.this$0.LIZIZ(this.$entrance);
        AbstractC3664m abstractC3664m = this.this$0.LJII;
        if (abstractC3664m != null && (LJIIJ = abstractC3664m.LJIIJ()) != null) {
            if (this.$entrance.LJIL == 3) {
                z = true;
            }
            LJIIJ.f26076LJ = z;
        }
        this.this$0.LIZIZ(this.$entrance.LJI, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("location", "collection")));
    }
}
