package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87421KcZ;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfRuntime$stopPerfTestBySwitch$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87421KcZ this$0;

    static {
        Covode.recordClassIndex(20810);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformPerfRuntime$stopPerfTestBySwitch$1(C87421KcZ c87421KcZ) {
        super(1);
        this.this$0 = c87421KcZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL();
            if (intValue == 1) {
                this.this$0.LIZIZ().LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
