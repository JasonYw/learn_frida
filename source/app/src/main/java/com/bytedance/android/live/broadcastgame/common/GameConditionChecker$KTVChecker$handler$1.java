package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class GameConditionChecker$KTVChecker$handler$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onSuccess;

    static {
        Covode.recordClassIndex(19609);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$KTVChecker$handler$1(Function1 function1) {
        super(1);
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$onSuccess.invoke(new w$a() { // from class: X.3de
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(19649);
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final String LIZJ() {
                    return "ktv";
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final void LIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    ((IKtvService) ServiceManager.getService(IKtvService.class)).pauseAndHide();
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final void LIZIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    ((IKtvService) ServiceManager.getService(IKtvService.class)).resumeAndShow();
                }
            });
        }
        return Unit.INSTANCE;
    }
}
