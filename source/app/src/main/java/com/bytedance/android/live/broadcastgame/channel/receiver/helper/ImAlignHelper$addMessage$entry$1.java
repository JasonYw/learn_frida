package com.bytedance.android.live.broadcastgame.channel.receiver.helper;

import com.bytedance.android.live.broadcastgame.channel.receiver.helper.C3438a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class ImAlignHelper$addMessage$entry$1 extends Lambda implements Function1<C3438a.RunnableC3439a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3438a this$0;

    static {
        Covode.recordClassIndex(19549);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImAlignHelper$addMessage$entry$1(C3438a c3438a) {
        super(1);
        this.this$0 = c3438a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3438a.RunnableC3439a runnableC3439a) {
        C3438a.RunnableC3439a runnableC3439a2 = runnableC3439a;
        if (!PatchProxy.proxy(new Object[]{runnableC3439a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(runnableC3439a2);
            this.this$0.LIZ(runnableC3439a2);
        }
        return Unit.INSTANCE;
    }
}
