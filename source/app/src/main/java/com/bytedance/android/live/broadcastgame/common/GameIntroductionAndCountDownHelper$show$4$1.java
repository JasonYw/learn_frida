package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC87150KVs;

/* loaded from: classes5.dex */
public final class GameIntroductionAndCountDownHelper$show$4$1 extends Lambda implements Function1<List<? extends w$a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC87150KVs this$0;

    static {
        Covode.recordClassIndex(19618);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroductionAndCountDownHelper$show$4$1(View$OnClickListenerC87150KVs view$OnClickListenerC87150KVs) {
        super(1);
        this.this$0 = view$OnClickListenerC87150KVs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends w$a> list) {
        List<? extends w$a> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            this.this$0.LIZIZ.LIZJ.addAll(list2);
            Runnable runnable = this.this$0.LIZIZ.LJII;
            if (runnable != null) {
                runnable.run();
            }
            if (this.this$0.LIZJ) {
                this.this$0.LIZIZ.LIZIZ();
            } else {
                this.this$0.LIZIZ.LIZ().run();
                ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameCountDown(1, this.this$0.LIZIZ.LJFF);
            }
        }
        return Unit.INSTANCE;
    }
}
