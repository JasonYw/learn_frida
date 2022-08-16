package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80668Hqw;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.VideoCameraRoomWindowAdapterV2$BaseAudioGuestViewHolder$itemClick$1 */
/* loaded from: classes3.dex */
public final class C4841xa1a0e746 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80668Hqw this$0;

    static {
        Covode.recordClassIndex(29653);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4841xa1a0e746(C80668Hqw c80668Hqw) {
        super(0);
        this.this$0 = c80668Hqw;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIJJLI.f26437LJ.LIZ(this.this$0.LJIJI);
        }
        return Unit.INSTANCE;
    }
}
