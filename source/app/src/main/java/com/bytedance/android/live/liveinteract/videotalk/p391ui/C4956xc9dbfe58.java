package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80855Htx;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.CVideoCameraRoomWindowManager$EnlargePlayerViewHolder$onGuestBattleLastMinute$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4956xc9dbfe58 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80855Htx this$0;

    static {
        Covode.recordClassIndex(30440);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4956xc9dbfe58(C80855Htx c80855Htx) {
        super(0);
        this.this$0 = c80855Htx;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJFF.setVisibility(8);
            this.this$0.LIZIZ.LJI.LJFF();
        }
        return Unit.INSTANCE;
    }
}
