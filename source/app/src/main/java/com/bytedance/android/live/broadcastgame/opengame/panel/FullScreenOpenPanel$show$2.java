package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$show$2 extends Lambda implements Function1<Intent, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20765);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$show$2(FullScreenOpenPanel fullScreenOpenPanel) {
        super(1);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Intent intent) {
        Intent intent2 = intent;
        if (!PatchProxy.proxy(new Object[]{intent2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(intent2);
            intent2.putExtra("token", this.this$0.LIZ());
        }
        return Unit.INSTANCE;
    }
}
