package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import android.app.Activity;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.FullScreenOpenPanel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87911KkT;
import p003X.C87954KlA;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$liveLifeCycle$1$onActivityResumed$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C87954KlA this$0;

    static {
        Covode.recordClassIndex(21111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$liveLifeCycle$1$onActivityResumed$1(C87954KlA c87954KlA, Activity activity) {
        super(0);
        this.this$0 = c87954KlA;
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3609d abstractC3609d = this.this$0.LIZIZ.LJIIIIZZ;
            if (!(abstractC3609d instanceof FullScreenOpenPanel)) {
                abstractC3609d = null;
            }
            FullScreenOpenPanel fullScreenOpenPanel = (FullScreenOpenPanel) abstractC3609d;
            if (fullScreenOpenPanel != null && fullScreenOpenPanel.LJII) {
                C87911KkT.LIZ(C87911KkT.LIZIZ, "call FullScreenOpenPanel on " + this.$activity + " Resume", null, 2, null);
                this.this$0.LIZIZ.onShow(null);
            }
        }
        return Unit.INSTANCE;
    }
}
