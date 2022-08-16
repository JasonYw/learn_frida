package com.bytedance.android.live.broadcastgame.opengame.behavior;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes12.dex */
public final class MiniGameToolbarBehavior$runAnimation$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $callBack;

    static {
        Covode.recordClassIndex(19932);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGameToolbarBehavior$runAnimation$2(Ref.ObjectRef objectRef) {
        super(0);
        this.$callBack = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Function0 function0 = (Function0) this.$callBack.element;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            this.$callBack.element = null;
        }
        return Unit.INSTANCE;
    }
}
