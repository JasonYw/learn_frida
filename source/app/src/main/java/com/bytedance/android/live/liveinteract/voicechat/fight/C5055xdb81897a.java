package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79046HEa;
import p003X.C88440Kt0;
import p003X.H3P;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.VoiceTeamFightViewManager$showTeamFightStartEffect$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C5055xdb81897a extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H3P this$0;

    static {
        Covode.recordClassIndex(31309);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5055xdb81897a(H3P h3p) {
        super(0);
        this.this$0 = h3p;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZIZ.setVisibility(8);
            if (this.this$0.LIZIZ.LJIIIZ) {
                C88440Kt0.LIZ(2131588022);
            } else if (!this.this$0.LIZIZ.LJIIIZ) {
                C79046HEa LIZ = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (LIZ.LIZJ()) {
                    C88440Kt0.LIZ(2131588023);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
