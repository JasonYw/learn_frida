package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88440Kt0;

/* loaded from: classes.dex */
public final class AnchorMiniCardService$showOrHide$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $callLoadingFinish;

    static {
        Covode.recordClassIndex(21802);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniCardService$showOrHide$2(Function1 function1) {
        super(1);
        this.$callLoadingFinish = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
            this.$callLoadingFinish.invoke(Boolean.FALSE);
            C88440Kt0.LIZ(2131586712);
        }
        return Unit.INSTANCE;
    }
}
