package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.AbstractC103391QnZ;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.HTW;
import p003X.ITL;
import p003X.ITM;
import p003X.ITN;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayViewModel$stateMachine$1 */
/* loaded from: classes3.dex */
public final class PkOperationalPlayViewModel$stateMachine$1 extends Lambda implements Function1<AbstractC103391QnZ<? extends AbstractC4702i, ? extends AbstractC4697g, ? extends AbstractC4701h>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HTW this$0;

    static {
        Covode.recordClassIndex(28543);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkOperationalPlayViewModel$stateMachine$1(HTW htw) {
        super(1);
        this.this$0 = htw;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends AbstractC4702i, ? extends AbstractC4697g, ? extends AbstractC4701h> abstractC103391QnZ) {
        AbstractC103391QnZ<? extends AbstractC4702i, ? extends AbstractC4697g, ? extends AbstractC4701h> abstractC103391QnZ2;
        AbstractC103391QnZ<? extends AbstractC4702i, ? extends AbstractC4697g, ? extends AbstractC4701h> abstractC103391QnZ3 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ3);
            if (!(abstractC103391QnZ3 instanceof C103385QnT)) {
                abstractC103391QnZ2 = null;
            } else {
                abstractC103391QnZ2 = abstractC103391QnZ3;
            }
            C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
            if (c103385QnT != null) {
                C103385QnT c103385QnT2 = (C103385QnT) abstractC103391QnZ3;
                this.this$0.f6821LJ.setValue(c103385QnT2.LIZIZ);
                SIDE_EFFECT side_effect = c103385QnT.LIZJ;
                if (Intrinsics.areEqual(side_effect, ITM.LIZ)) {
                    this.this$0.LIZJ();
                } else if (Intrinsics.areEqual(side_effect, ITL.LIZ)) {
                    this.this$0.LIZJ();
                } else if (Intrinsics.areEqual(side_effect, ITN.LIZ)) {
                    this.this$0.LIZJ();
                }
                ALogger.m15801d("PkOperationalPlayViewModel", C0002O.m25084C("pk operational play state from ", abstractC103391QnZ3.LIZ().LIZ, " to ", ((AbstractC4702i) c103385QnT2.LIZIZ).LIZ));
            }
        }
        return Unit.INSTANCE;
    }
}
