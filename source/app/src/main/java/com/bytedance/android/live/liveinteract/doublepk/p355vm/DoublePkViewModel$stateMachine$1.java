package com.bytedance.android.live.liveinteract.doublepk.p355vm;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4399b;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4403c;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4404d;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC78459GwP;
import p003X.C103385QnT;
import p003X.C103387QnV;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C78453GwJ;
import p003X.C78460GwQ;
import p003X.C78461GwR;

/* renamed from: com.bytedance.android.live.liveinteract.doublepk.vm.DoublePkViewModel$stateMachine$1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class DoublePkViewModel$stateMachine$1 extends FunctionReferenceImpl implements Function1<AbstractC103391QnZ<? extends AbstractC4404d, ? extends AbstractC4399b, ? extends AbstractC4403c>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26832);
    }

    public DoublePkViewModel$stateMachine$1(C78453GwJ c78453GwJ) {
        super(1, c78453GwJ, C78453GwJ.class, "handleState", "handleState(Lcom/bytedance/android/live/core/utils/StateMachine$Transition;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends AbstractC4404d, ? extends AbstractC4399b, ? extends AbstractC4403c> abstractC103391QnZ) {
        String str;
        AbstractC4404d abstractC4404d;
        C2WD<AbstractC4404d> LIZLLL;
        AbstractC103391QnZ<? extends AbstractC4404d, ? extends AbstractC4399b, ? extends AbstractC4403c> abstractC103391QnZ2 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ2);
            C78453GwJ c78453GwJ = (C78453GwJ) this.receiver;
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, c78453GwJ, C78453GwJ.LIZ, false, 3).isSupported) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, C78460GwQ.LIZIZ, C78461GwR.LIZ, false, 1);
                if (proxy.isSupported) {
                    str = (String) proxy.result;
                } else {
                    C106862S5w.LIZ(abstractC103391QnZ2);
                    if (abstractC103391QnZ2 instanceof C103385QnT) {
                        str = "valid:toState:" + abstractC103391QnZ2.LIZ() + ", fromState:" + abstractC103391QnZ2.LIZ() + ", event:" + abstractC103391QnZ2.LIZIZ() + ", sideEffect: " + ((C103385QnT) abstractC103391QnZ2).LIZJ;
                    } else if (abstractC103391QnZ2 instanceof C103387QnV) {
                        str = "invalid:fromState:" + abstractC103391QnZ2.LIZ() + ", event:" + abstractC103391QnZ2.LIZIZ();
                    } else {
                        str = "error Transition";
                    }
                }
                ALogger.m15801d("DoublePk_DoublePKViewModel", str);
                C4398a LIZ = C4398a.LIZJ.LIZ();
                if ((abstractC103391QnZ2 instanceof C103385QnT) && (abstractC4404d = (AbstractC4404d) ((C103385QnT) abstractC103391QnZ2).LIZIZ) != null) {
                    if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null) {
                        LIZLLL.LIZ(abstractC4404d);
                    }
                    if (abstractC4404d instanceof AbstractC4404d.C4407c) {
                        AbstractC78459GwP abstractC78459GwP = c78453GwJ.LJIIJJI;
                        if (abstractC78459GwP != null) {
                            abstractC78459GwP.LIZ();
                        }
                    } else if (abstractC4404d instanceof AbstractC4404d.C4406b) {
                        AbstractC78459GwP abstractC78459GwP2 = c78453GwJ.LJIIJJI;
                        if (abstractC78459GwP2 != null) {
                            abstractC78459GwP2.LIZ(((AbstractC4404d.C4406b) abstractC4404d).LIZIZ);
                        }
                        c78453GwJ.LIZLLL.setValue(((AbstractC4404d.C4406b) abstractC4404d).LIZIZ);
                    } else if (abstractC4404d instanceof AbstractC4404d.C4405a) {
                        AbstractC78459GwP abstractC78459GwP3 = c78453GwJ.LJIIJJI;
                        if (abstractC78459GwP3 != null) {
                            abstractC78459GwP3.LIZIZ(((AbstractC4404d.C4405a) abstractC4404d).LIZIZ);
                        }
                        c78453GwJ.LIZLLL.setValue(((AbstractC4404d.C4405a) abstractC4404d).LIZIZ);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
