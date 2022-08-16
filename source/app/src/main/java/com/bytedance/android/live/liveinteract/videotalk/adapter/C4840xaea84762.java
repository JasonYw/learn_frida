package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80675Hr3;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.VideoCameraRoomWindowAdapter$BaseAudioGuestViewHolder$itemClick$1 */
/* loaded from: classes3.dex */
public final class C4840xaea84762 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80675Hr3 this$0;

    static {
        Covode.recordClassIndex(29647);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4840xaea84762(C80675Hr3 c80675Hr3) {
        super(0);
        this.this$0 = c80675Hr3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIIZILJ.LIZIZ.LIZ(this.this$0.LJIILLIIL);
        }
        return Unit.INSTANCE;
    }
}
