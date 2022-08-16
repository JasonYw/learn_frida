package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81047Hx3;
import p003X.C80866Hu8;
import p003X.C81105Hxz;

/* loaded from: classes3.dex */
public final class DynamicEmojiTask$handle$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C81105Hxz $event;
    public final /* synthetic */ C80866Hu8 this$0;

    static {
        Covode.recordClassIndex(26292);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicEmojiTask$handle$1(C80866Hu8 c80866Hu8, C81105Hxz c81105Hxz) {
        super(0);
        this.this$0 = c80866Hu8;
        this.$event = c81105Hxz;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZ(SeatAnimTaskState.IDLE);
            AbstractC81047Hx3 LIZ = this.this$0.LIZ();
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
