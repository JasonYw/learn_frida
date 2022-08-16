package com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80884HuQ;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.GuestBattleQuickInteractView$showAnimation$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4944x77dd69d9 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80884HuQ this$0;

    static {
        Covode.recordClassIndex(30357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4944x77dd69d9(C80884HuQ c80884HuQ) {
        super(0);
        this.this$0 = c80884HuQ;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.getAnimationIcon().setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
