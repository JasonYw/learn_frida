package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.H3V;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.VoiceTeamFightViewManager$showResultAnimation$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C5053x214bb001 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H3V this$0;

    static {
        Covode.recordClassIndex(31307);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5053x214bb001(H3V h3v) {
        super(0);
        this.this$0 = h3v;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJFF.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
