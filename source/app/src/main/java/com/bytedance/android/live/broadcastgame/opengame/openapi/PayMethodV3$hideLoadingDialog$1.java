package com.bytedance.android.live.broadcastgame.opengame.openapi;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.C87558Kem;

/* loaded from: classes5.dex */
public final class PayMethodV3$hideLoadingDialog$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87558Kem this$0;

    static {
        Covode.recordClassIndex(20523);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayMethodV3$hideLoadingDialog$1(C87558Kem c87558Kem) {
        super(0);
        this.this$0 = c87558Kem;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Dialog dialog;
        Dialog dialog2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (dialog = this.this$0.LJIIJ) != null && dialog.isShowing() && (dialog2 = this.this$0.LJIIJ) != null) {
            C116971W2r.LIZ(dialog2);
        }
        return Unit.INSTANCE;
    }
}
