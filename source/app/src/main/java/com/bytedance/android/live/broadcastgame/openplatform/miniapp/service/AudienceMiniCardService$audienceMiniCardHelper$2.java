package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3795b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AudienceMiniCardService$audienceMiniCardHelper$2 extends Lambda implements Function0<C3795b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceMiniCardService this$0;

    static {
        Covode.recordClassIndex(21808);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardService$audienceMiniCardHelper$2(AudienceMiniCardService audienceMiniCardService) {
        super(0);
        this.this$0 = audienceMiniCardService;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3795b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3795b(this.this$0.LIZIZ, this.this$0.LIZJ, this.this$0.LJIIJJI());
    }
}
