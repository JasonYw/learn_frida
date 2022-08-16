package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class RewardMsgContainer$newItem$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3682x $pluginContext;

    static {
        Covode.recordClassIndex(21165);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMsgContainer$newItem$1(C3682x c3682x) {
        super(0);
        this.$pluginContext = c3682x;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$pluginContext.LJI.LIZJ();
        }
        return Unit.INSTANCE;
    }
}
