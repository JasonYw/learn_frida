package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.opengame.message.C3516am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87733Khb;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$check$1 extends Lambda implements Function1<C3516am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $loadButton;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19891);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$check$1(C87733Khb c87733Khb, Function0 function0) {
        super(1);
        this.this$0 = c87733Khb;
        this.$loadButton = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3516am c3516am) {
        C3516am c3516am2 = c3516am;
        if (!PatchProxy.proxy(new Object[]{c3516am2}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(c3516am2, 1, this.$loadButton);
        }
        return Unit.INSTANCE;
    }
}
