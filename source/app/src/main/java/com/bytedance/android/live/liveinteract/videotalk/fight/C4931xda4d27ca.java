package com.bytedance.android.live.liveinteract.videotalk.fight;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.H3T;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.fight.VideoTeamFightViewManager$showResultAnimation$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4931xda4d27ca extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H3T this$0;

    static {
        Covode.recordClassIndex(30247);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4931xda4d27ca(H3T h3t) {
        super(0);
        this.this$0 = h3t;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.f6555LJ.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
