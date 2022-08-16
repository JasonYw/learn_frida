package com.bytedance.android.live.liveinteract.interact.audience.seat;

import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.SeatAnimTaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.HJR;
import p003X.HJS;
import p003X.HJX;

/* loaded from: classes3.dex */
public final class PkDynamicEmojiTask$handle$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HJX $event;
    public final /* synthetic */ HJS this$0;

    static {
        Covode.recordClassIndex(27403);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkDynamicEmojiTask$handle$1(HJS hjs, HJX hjx) {
        super(0);
        this.this$0 = hjs;
        this.$event = hjx;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(SeatAnimTaskState.IDLE);
            HJR LIZ = this.this$0.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(this.$event);
            }
            HSImageView hSImageView = this.this$0.LIZJ;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
