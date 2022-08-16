package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.C87850KjU;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$showChooserCoverDialog$1$onPicked$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87850KjU this$0;

    static {
        Covode.recordClassIndex(21577);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$showChooserCoverDialog$1$onPicked$2(C87850KjU c87850KjU) {
        super(1);
        this.this$0 = c87850KjU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C88440Kt0.LIZ(2131586712);
            C116971W2r.LIZ(this.this$0.LIZIZ.LIZIZ());
        }
        return Unit.INSTANCE;
    }
}
