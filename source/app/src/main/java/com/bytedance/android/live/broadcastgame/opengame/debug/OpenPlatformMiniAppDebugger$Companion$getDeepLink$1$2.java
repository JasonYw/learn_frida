package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.net.MalformedURLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.RunnableC87940Kkw;

/* loaded from: classes5.dex */
public final class OpenPlatformMiniAppDebugger$Companion$getDeepLink$1$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: $e */
    public final /* synthetic */ MalformedURLException f26054$e;
    public final /* synthetic */ RunnableC87940Kkw this$0;

    static {
        Covode.recordClassIndex(20079);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMiniAppDebugger$Companion$getDeepLink$1$2(RunnableC87940Kkw runnableC87940Kkw, MalformedURLException malformedURLException) {
        super(0);
        this.this$0 = runnableC87940Kkw;
        this.f26054$e = malformedURLException;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.LIZ(this.f26054$e);
        }
        return Unit.INSTANCE;
    }
}
