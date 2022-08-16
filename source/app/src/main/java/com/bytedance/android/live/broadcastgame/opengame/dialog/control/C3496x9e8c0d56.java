package com.bytedance.android.live.broadcastgame.opengame.dialog.control;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87784KiQ;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.dialog.control.OpenControlDialogManager$processPopBoxContentAndShow$$inlined$apply$lambda$2 */
/* loaded from: classes5.dex */
public final class C3496x9e8c0d56 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87784KiQ this$0;

    static {
        Covode.recordClassIndex(20162);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3496x9e8c0d56(C87784KiQ c87784KiQ) {
        super(0);
        this.this$0 = c87784KiQ;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
