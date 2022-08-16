package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AudienceMiniCardHelper$showCard$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C8733af $cardInfo;
    public final /* synthetic */ boolean $fromHttp;
    public final /* synthetic */ C3795b this$0;

    static {
        Covode.recordClassIndex(21523);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardHelper$showCard$1(C3795b c3795b, C8733af c8733af, boolean z) {
        super(0);
        this.this$0 = c3795b;
        this.$cardInfo = c8733af;
        this.$fromHttp = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(this.$cardInfo, this.$fromHttp);
        }
        return Unit.INSTANCE;
    }
}
