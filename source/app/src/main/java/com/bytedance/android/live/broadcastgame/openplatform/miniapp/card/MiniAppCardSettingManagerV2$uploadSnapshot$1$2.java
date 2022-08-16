package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.CallableC87822Kj2;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$uploadSnapshot$1$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CallableC87822Kj2 this$0;

    static {
        Covode.recordClassIndex(21582);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingManagerV2$uploadSnapshot$1$2(CallableC87822Kj2 callableC87822Kj2) {
        super(1);
        this.this$0 = callableC87822Kj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
