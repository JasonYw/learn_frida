package com.bytedance.android.live.broadcastgame.channel;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.KYV;

/* loaded from: classes5.dex */
public final class RequestServerMethod$invoke$$inlined$let$lambda$2$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Throwable $it$inlined;
    public final /* synthetic */ C3384q $this_run;
    public final /* synthetic */ KYV this$0;

    static {
        Covode.recordClassIndex(19382);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestServerMethod$invoke$$inlined$let$lambda$2$1(C3384q c3384q, KYV kyv, Throwable th) {
        super(0);
        this.$this_run = c3384q;
        this.this$0 = kyv;
        this.$it$inlined = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Context context = this.this$0.LIZIZ.LJFF;
            DataCenter dataCenter = this.this$0.LIZIZ.LIZLLL;
            C3384q c3384q = this.$this_run;
            boolean z = this.this$0.LIZIZ.f8531LJ;
            Throwable th = this.$it$inlined;
            Intrinsics.checkNotNullExpressionValue(th, "");
            ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).confirmGameException(context, dataCenter, c3384q, z, th);
        }
        return Unit.INSTANCE;
    }
}
