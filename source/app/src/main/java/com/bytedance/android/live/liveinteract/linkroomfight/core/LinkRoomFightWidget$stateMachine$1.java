package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.AbstractC103391QnZ;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final /* synthetic */ class LinkRoomFightWidget$stateMachine$1 extends FunctionReferenceImpl implements Function1<AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27625);
    }

    public LinkRoomFightWidget$stateMachine$1(LinkRoomFightWidget linkRoomFightWidget) {
        super(1, linkRoomFightWidget, LinkRoomFightWidget.class, "listenState", "listenState(Lcom/bytedance/android/live/core/utils/StateMachine$Transition;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b> abstractC103391QnZ) {
        AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b> abstractC103391QnZ2 = abstractC103391QnZ;
        if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC103391QnZ2);
            ((LinkRoomFightWidget) this.receiver).LIZ(abstractC103391QnZ2);
        }
        return Unit.INSTANCE;
    }
}
