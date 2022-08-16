package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$onStop$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20761);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$onStop$1(FullScreenOpenPanel fullScreenOpenPanel) {
        super(0);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            FullScreenOpenPanel fullScreenOpenPanel = this.this$0;
            fullScreenOpenPanel.LJI = false;
            if (!fullScreenOpenPanel.LJIILJJIL) {
                this.this$0.LJII = true;
            }
            FullScreenOpenPanel.LIZ(this.this$0, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
