package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87207KXx;

/* loaded from: classes25.dex */
public final class AnchorAudienceMsgChannel$createMessageChannel$1$7 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87207KXx $recv;

    static {
        Covode.recordClassIndex(19329);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorAudienceMsgChannel$createMessageChannel$1$7(C87207KXx c87207KXx) {
        super(1);
        this.$recv = c87207KXx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$recv.LIZIZ(longValue);
        }
        return Unit.INSTANCE;
    }
}
