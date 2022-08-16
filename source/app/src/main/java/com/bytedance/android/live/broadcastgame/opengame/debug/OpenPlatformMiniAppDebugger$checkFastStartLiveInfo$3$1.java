package com.bytedance.android.live.broadcastgame.opengame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87916KkY;

/* loaded from: classes5.dex */
public final class OpenPlatformMiniAppDebugger$checkFastStartLiveInfo$3$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87916KkY this$0;

    static {
        Covode.recordClassIndex(20082);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMiniAppDebugger$checkFastStartLiveInfo$3$1(C87916KkY c87916KkY) {
        super(0);
        this.this$0 = c87916KkY;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(this.this$0.LIZIZ.getContextWeakRef().get(), "无法唤起调试工具, 请尝试重新开播");
        }
        return Unit.INSTANCE;
    }
}
