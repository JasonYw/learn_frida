package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80828HtW;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.BaseEqualTalkRoomAdapter$BaseGuestViewHolder$onGuestBattleLastMinute$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4837xb19696e4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80828HtW this$0;

    static {
        Covode.recordClassIndex(29635);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4837xb19696e4(C80828HtW c80828HtW) {
        super(0);
        this.this$0 = c80828HtW;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.f7328LJ.setVisibility(8);
            this.this$0.LIZIZ.LJIIJ.LJFF();
        }
        return Unit.INSTANCE;
    }
}
