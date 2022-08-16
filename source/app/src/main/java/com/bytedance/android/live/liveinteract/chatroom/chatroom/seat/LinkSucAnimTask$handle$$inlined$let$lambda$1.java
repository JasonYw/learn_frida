package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81047Hx3;
import p003X.C80918Huy;
import p003X.C81032Hwo;
import p003X.C81105Hxz;

/* loaded from: classes3.dex */
public final class LinkSucAnimTask$handle$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C81105Hxz $event$inlined;
    public final /* synthetic */ C81032Hwo $info$inlined;
    public final /* synthetic */ C80918Huy this$0;

    static {
        Covode.recordClassIndex(26295);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkSucAnimTask$handle$$inlined$let$lambda$1(C81032Hwo c81032Hwo, C80918Huy c80918Huy, C81105Hxz c81105Hxz) {
        super(0);
        this.$info$inlined = c81032Hwo;
        this.this$0 = c80918Huy;
        this.$event$inlined = c81105Hxz;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(SeatAnimTaskState.IDLE);
            AbstractC81047Hx3 LIZ = this.this$0.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(this.$event$inlined);
            }
        }
        return Unit.INSTANCE;
    }
}
