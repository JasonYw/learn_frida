package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC87151KVt;

/* loaded from: classes5.dex */
public final class GameIntroductionAndCountDownHelper$show$1$1 extends Lambda implements Function1<List<? extends w$a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC87151KVt this$0;

    static {
        Covode.recordClassIndex(19615);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroductionAndCountDownHelper$show$1$1(View$OnClickListenerC87151KVt view$OnClickListenerC87151KVt) {
        super(1);
        this.this$0 = view$OnClickListenerC87151KVt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends w$a> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list);
            Runnable runnable = this.this$0.LIZIZ.LJII;
            if (runnable != null) {
                runnable.run();
            }
            this.this$0.LIZIZ.LIZ().run();
        }
        return Unit.INSTANCE;
    }
}
