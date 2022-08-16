package com.bytedance.android.live.broadcastgame.common;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.common.GameConditionChecker$KTVChecker$handler$1;
import com.bytedance.android.live.broadcastgame.common.GameConditionChecker$KTVChecker$handler$2;
import com.bytedance.android.live.broadcastgame.common.a$b;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.ktvapi.KtvConflictScene;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C441653dX;
import p003X.C443303gC;
import p003X.C86742KGa;

/* loaded from: classes12.dex */
public final class GameConditionChecker$Chain$checkers$2 extends Lambda implements Function0<List<? extends a$b>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C443303gC this$0;

    static {
        Covode.recordClassIndex(19604);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$Chain$checkers$2(C443303gC c443303gC) {
        super(0);
        this.this$0 = c443303gC;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List<? extends com.bytedance.android.live.broadcastgame.common.a$b>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List<? extends com.bytedance.android.live.broadcastgame.common.a$b>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<? extends a$b> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C443303gC c443303gC = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c443303gC, C443303gC.LIZ, false, 2);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        final DataCenter dataCenter = c443303gC.LIZIZ;
        return CollectionsKt__CollectionsKt.arrayListOf(new a$b(dataCenter) { // from class: X.3dW
            public static ChangeQuickRedirect LIZIZ;
            public final DataCenter LIZJ;

            static {
                Covode.recordClassIndex(19630);
            }

            @Override // com.bytedance.android.live.broadcastgame.common.a$b
            public final String LIZ() {
                return "biz_ktv";
            }

            {
                C106862S5w.LIZ(dataCenter);
                this.LIZJ = dataCenter;
            }

            @Override // com.bytedance.android.live.broadcastgame.common.a$b
            public final void LIZ(Context context, C3384q c3384q, boolean z, Function1<? super w$a, Unit> function1) {
                if (PatchProxy.proxy(new Object[]{context, c3384q, Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, LIZIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(context, function1);
                if (!((IKtvService) ServiceManager.getService(IKtvService.class)).requestConflictCheck(KtvConflictScene.SCENE_ANCHOR_GAME)) {
                    String string = context.getString(2131584566);
                    String string2 = context.getString(2131584565);
                    String string3 = context.getString(2131584564);
                    C441573dP c441573dP = a$b.LIZ;
                    DataCenter dataCenter2 = this.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c441573dP.LIZ(context, dataCenter2, c3384q, 4, string2, string3, string, z, new GameConditionChecker$KTVChecker$handler$1(function1), new GameConditionChecker$KTVChecker$handler$2(c3384q));
                    return;
                }
                function1.invoke(null);
            }
        }, new C441653dX(c443303gC.LIZIZ), new C86742KGa(c443303gC.LIZIZ));
    }
}
