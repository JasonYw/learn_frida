package com.bytedance.android.live.broadcastgame.opengame.behavior;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes12.dex */
public final class MiniGameToolbarBehavior$runAnimation$4 extends Lambda implements Function2<Integer, Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $callBack;

    static {
        Covode.recordClassIndex(19934);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGameToolbarBehavior$runAnimation$4(Ref.ObjectRef objectRef) {
        super(2);
        this.$callBack = objectRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, this, changeQuickRedirect, false, 1).isSupported && intValue / intValue2 >= 0.5d) {
            Function0 function0 = (Function0) this.$callBack.element;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            this.$callBack.element = null;
        }
        return Unit.INSTANCE;
    }
}
