package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
import com.bytedance.android.live.broadcastgame.channel.receiver.AbstractC3437f;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KYI;

/* loaded from: classes5.dex */
public final class MessageDispatcher$addCallBack$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC3335e $callback;
    public final /* synthetic */ C3427ak this$0;

    static {
        Covode.recordClassIndex(19371);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDispatcher$addCallBack$1(C3427ak c3427ak, AbstractC3335e abstractC3335e) {
        super(0);
        this.this$0 = c3427ak;
        this.$callback = abstractC3335e;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        List<AbstractC3337g.AbstractC3338a> LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ().add(this.$callback);
            AbstractC3437f abstractC3437f = this.this$0.LIZIZ;
            if (abstractC3437f != null && (LIZIZ = abstractC3437f.LIZIZ()) != null) {
                for (AbstractC3337g.AbstractC3338a abstractC3338a : LIZIZ) {
                    if ((abstractC3338a instanceof C3331a) && KYI.LIZIZ.LIZ((C3331a) abstractC3338a)) {
                        ALogger.m15797i("AAM.MessageDispatcher", "just drop by MessageIntercept: " + abstractC3338a);
                    } else {
                        this.this$0.LIZ(this.$callback, abstractC3338a, "Cache");
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
