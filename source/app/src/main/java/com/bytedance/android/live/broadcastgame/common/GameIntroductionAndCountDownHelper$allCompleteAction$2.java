package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87146KVo;
import p003X.KQR;

/* loaded from: classes5.dex */
public final class GameIntroductionAndCountDownHelper$allCompleteAction$2 extends Lambda implements Function0<Runnable> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87146KVo this$0;

    static {
        Covode.recordClassIndex(19613);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroductionAndCountDownHelper$allCompleteAction$2(C87146KVo c87146KVo) {
        super(0);
        this.this$0 = c87146KVo;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Runnable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Runnable() { // from class: com.bytedance.android.live.broadcastgame.common.GameIntroductionAndCountDownHelper$allCompleteAction$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(19614);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                KQR.LIZIZ.LIZ(GameIntroductionAndCountDownHelper$allCompleteAction$2.this.this$0.LIZJ);
                Runnable runnable = GameIntroductionAndCountDownHelper$allCompleteAction$2.this.this$0.LJIIJ;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
    }
}
