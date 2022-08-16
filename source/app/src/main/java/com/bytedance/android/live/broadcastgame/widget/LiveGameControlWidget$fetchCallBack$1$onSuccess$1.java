package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87107KUb;

/* loaded from: classes5.dex */
public final class LiveGameControlWidget$fetchCallBack$1$onSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Sticker $sticker;
    public final /* synthetic */ C87107KUb this$0;

    static {
        Covode.recordClassIndex(21849);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameControlWidget$fetchCallBack$1$onSuccess$1(C87107KUb c87107KUb, Sticker sticker) {
        super(0);
        this.this$0 = c87107KUb;
        this.$sticker = sticker;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        long j;
        C3383p LJFF;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LiveGameControlWidget liveGameControlWidget = this.this$0.LIZIZ;
            Sticker sticker = this.$sticker;
            Map<String, ? extends Object> map = this.this$0.LIZIZ.LIZLLL;
            C3384q c3384q = this.this$0.LIZIZ.LIZIZ;
            if (c3384q != null && (LJFF = c3384q.LJFF()) != null) {
                j = LJFF.LIZLLL;
            } else {
                j = 0;
            }
            liveGameControlWidget.LIZ(sticker, map, j);
        }
        return Unit.INSTANCE;
    }
}
