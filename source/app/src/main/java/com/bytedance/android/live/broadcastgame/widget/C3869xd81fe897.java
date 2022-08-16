package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KUU;

/* renamed from: com.bytedance.android.live.broadcastgame.widget.InteractGameStartupWidget$onProcessAnchorAudienceInteractGame$$inlined$let$lambda$1$2$1 */
/* loaded from: classes5.dex */
public final class C3869xd81fe897 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KUU this$0;

    static {
        Covode.recordClassIndex(21835);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3869xd81fe897(KUU kuu) {
        super(0);
        this.this$0 = kuu;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.run();
        }
        return Unit.INSTANCE;
    }
}
