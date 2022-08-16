package com.bytedance.android.live.broadcastgame.opengame.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.View$OnClickListenerC88053Kml;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialogV1$addData$onClickListener$1$$special$$inlined$apply$lambda$2 */
/* loaded from: classes5.dex */
public final class C3492x48f8c79d extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC88053Kml this$0;

    static {
        Covode.recordClassIndex(20141);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3492x48f8c79d(View$OnClickListenerC88053Kml view$OnClickListenerC88053Kml) {
        super(0);
        this.this$0 = view$OnClickListenerC88053Kml;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C116971W2r.LIZJ(this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
