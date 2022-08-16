package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.AbstractC103391QnZ;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C80354Hls;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkLynxInfoViewModel$stateMachine$1 */
/* loaded from: classes3.dex */
public final class PkLynxInfoViewModel$stateMachine$1 extends Lambda implements Function1<AbstractC103391QnZ<? extends AbstractC4675a, ? extends AbstractC4707o, ? extends AbstractC4719p>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80354Hls this$0;

    static {
        Covode.recordClassIndex(28524);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkLynxInfoViewModel$stateMachine$1(C80354Hls c80354Hls) {
        super(1);
        this.this$0 = c80354Hls;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends AbstractC4675a, ? extends AbstractC4707o, ? extends AbstractC4719p> abstractC103391QnZ) {
        AbstractC103391QnZ<? extends AbstractC4675a, ? extends AbstractC4707o, ? extends AbstractC4719p> abstractC103391QnZ2;
        AbstractC103391QnZ<? extends AbstractC4675a, ? extends AbstractC4707o, ? extends AbstractC4719p> abstractC103391QnZ3 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ3);
            if (!(abstractC103391QnZ3 instanceof C103385QnT)) {
                abstractC103391QnZ2 = null;
            } else {
                abstractC103391QnZ2 = abstractC103391QnZ3;
            }
            if (abstractC103391QnZ2 != null) {
                C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ3;
                this.this$0.LIZIZ.setValue(c103385QnT.LIZIZ);
                ALogger.m15801d("PkLynxInfoViewModel", C0002O.m25084C("pk team task state from ", abstractC103391QnZ3.LIZ().LIZ, " to ", ((AbstractC4675a) c103385QnT.LIZIZ).LIZ));
            }
        }
        return Unit.INSTANCE;
    }
}
