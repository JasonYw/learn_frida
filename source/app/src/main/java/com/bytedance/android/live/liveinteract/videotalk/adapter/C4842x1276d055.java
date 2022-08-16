package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80854Htw;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.VideoCameraRoomWindowAdapterV2$BaseAudioGuestViewHolder$onGuestBattleLastMinute$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4842x1276d055 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80854Htw this$0;

    static {
        Covode.recordClassIndex(29654);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4842x1276d055(C80854Htw c80854Htw) {
        super(0);
        this.this$0 = c80854Htw;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJIIIIZZ.setVisibility(8);
            this.this$0.LIZIZ.LJIIL.LJFF();
        }
        return Unit.INSTANCE;
    }
}
