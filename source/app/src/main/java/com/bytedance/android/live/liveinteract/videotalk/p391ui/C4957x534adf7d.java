package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80652Hqg;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.CVideoCameraRoomWindowManager$EnlargePlayerViewHolder$playSeatCrownAnim$1 */
/* loaded from: classes3.dex */
public final class C4957x534adf7d extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80652Hqg this$0;

    static {
        Covode.recordClassIndex(30441);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4957x534adf7d(C80652Hqg c80652Hqg) {
        super(0);
        this.this$0 = c80652Hqg;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJII.LIZ(this.this$0.LJIIIZ);
            this.this$0.LJIIJJI = false;
        }
        return Unit.INSTANCE;
    }
}
