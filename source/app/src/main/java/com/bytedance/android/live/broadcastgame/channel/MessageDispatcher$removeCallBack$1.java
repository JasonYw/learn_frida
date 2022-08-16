package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MessageDispatcher$removeCallBack$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC3335e $callback;
    public final /* synthetic */ C3427ak this$0;

    static {
        Covode.recordClassIndex(19374);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDispatcher$removeCallBack$1(C3427ak c3427ak, AbstractC3335e abstractC3335e) {
        super(0);
        this.this$0 = c3427ak;
        this.$callback = abstractC3335e;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ().remove(this.$callback);
        }
        return Unit.INSTANCE;
    }
}
