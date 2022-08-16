package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.RunnableC87940Kkw;

/* loaded from: classes5.dex */
public final class OpenPlatformMiniAppDebugger$Companion$getDeepLink$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $realUrl;
    public final /* synthetic */ RunnableC87940Kkw this$0;

    static {
        Covode.recordClassIndex(20078);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMiniAppDebugger$Companion$getDeepLink$1$1(RunnableC87940Kkw runnableC87940Kkw, Ref.ObjectRef objectRef) {
        super(0);
        this.this$0 = runnableC87940Kkw;
        this.$realUrl = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.LIZ((String) this.$realUrl.element);
        }
        return Unit.INSTANCE;
    }
}
