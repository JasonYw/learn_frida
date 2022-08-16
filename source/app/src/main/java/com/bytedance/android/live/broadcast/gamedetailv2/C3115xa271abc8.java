package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L5M;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.GameDetailLoadingWidget$errorView$2$$special$$inlined$apply$lambda$1 */
/* loaded from: classes5.dex */
public final class C3115xa271abc8 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailLoadingWidget$errorView$2 this$0;

    static {
        Covode.recordClassIndex(16585);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115xa271abc8(GameDetailLoadingWidget$errorView$2 gameDetailLoadingWidget$errorView$2) {
        super(0);
        this.this$0 = gameDetailLoadingWidget$errorView$2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.this$0.LIZJ(new L5M());
        }
        return Unit.INSTANCE;
    }
}
