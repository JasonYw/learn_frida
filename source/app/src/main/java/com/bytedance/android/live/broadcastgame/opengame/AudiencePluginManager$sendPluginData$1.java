package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87733Khb;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$sendPluginData$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $params;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19896);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$sendPluginData$1(C87733Khb c87733Khb, String str) {
        super(0);
        this.this$0 = c87733Khb;
        this.$params = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ(this.$params);
        }
        return Unit.INSTANCE;
    }
}
