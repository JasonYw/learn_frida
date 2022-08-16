package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class AAMManager$dispatch$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $action;
    public final /* synthetic */ AAMManager this$0;

    static {
        Covode.recordClassIndex(19316);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAMManager$dispatch$1(AAMManager aAMManager, Function1 function1) {
        super(0);
        this.this$0 = aAMManager;
        this.$action = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            for (Object obj : this.this$0.LIZ()) {
                this.$action.invoke(obj);
            }
        }
        return Unit.INSTANCE;
    }
}
