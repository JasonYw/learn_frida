package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80668Hqw;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.VideoCameraRoomWindowAdapterV2$BaseAudioGuestViewHolder$playSeatPoopAnim$1 */
/* loaded from: classes3.dex */
public final class C4844x18c43493 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80668Hqw this$0;

    static {
        Covode.recordClassIndex(29656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4844x18c43493(C80668Hqw c80668Hqw) {
        super(0);
        this.this$0 = c80668Hqw;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJII.LIZ(this.this$0.LJIJ);
            this.this$0.LJIILIIL = false;
        }
        return Unit.INSTANCE;
    }
}
