package com.bytedance.android.live.broadcastgame.effectgame;

import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87132KVa;

/* loaded from: classes5.dex */
public final class AnchorAudioZhufenGameWidget$checkAndStartNewGame$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3384q $newItem;
    public final /* synthetic */ AnchorAudioZhufenGameWidget this$0;

    static {
        Covode.recordClassIndex(19726);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorAudioZhufenGameWidget$checkAndStartNewGame$1(AnchorAudioZhufenGameWidget anchorAudioZhufenGameWidget, C3384q c3384q) {
        super(0);
        this.this$0 = anchorAudioZhufenGameWidget;
        this.$newItem = c3384q;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87132KVa c87132KVa = this.this$0.LIZIZ;
            if (c87132KVa != null) {
                c87132KVa.LIZ(0L);
            }
            this.this$0.LIZ(this.$newItem);
        }
        return Unit.INSTANCE;
    }
}
