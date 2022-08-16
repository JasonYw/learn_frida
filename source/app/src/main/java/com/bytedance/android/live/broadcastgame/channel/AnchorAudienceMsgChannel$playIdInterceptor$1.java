package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.KY0;

/* loaded from: classes25.dex */
public final class AnchorAudienceMsgChannel$playIdInterceptor$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KY0 this$0;

    static {
        Covode.recordClassIndex(19335);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorAudienceMsgChannel$playIdInterceptor$1(KY0 ky0) {
        super(1);
        this.this$0 = ky0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.setCurrentPlayId(longValue);
        }
        return Unit.INSTANCE;
    }
}
