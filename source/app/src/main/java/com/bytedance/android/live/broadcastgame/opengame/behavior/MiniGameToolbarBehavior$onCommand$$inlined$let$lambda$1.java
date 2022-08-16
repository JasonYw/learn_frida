package com.bytedance.android.live.broadcastgame.opengame.behavior;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import p003X.C2TD;
import p003X.C4317436i;
import p003X.C4317536j;

/* loaded from: classes12.dex */
public final class MiniGameToolbarBehavior$onCommand$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2TD $command$inlined;
    public final /* synthetic */ C4317536j this$0;

    static {
        Covode.recordClassIndex(19930);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGameToolbarBehavior$onCommand$$inlined$let$lambda$1(C4317536j c4317536j, C2TD c2td) {
        super(0);
        this.this$0 = c4317536j;
        this.$command$inlined = c2td;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Object obj = ((C4317436i) this.$command$inlined).LIZ;
            if (obj != null) {
                Object second = ((Pair) obj).getSecond();
                if (!TypeIntrinsics.isFunctionOfArity(second, 0)) {
                    second = null;
                }
                Function0 function0 = (Function0) second;
                if (function0 != null) {
                    function0.mo30099invoke();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
            }
        }
        return Unit.INSTANCE;
    }
}
