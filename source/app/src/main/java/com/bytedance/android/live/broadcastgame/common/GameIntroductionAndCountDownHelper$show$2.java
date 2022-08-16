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
import p003X.C87146KVo;

/* loaded from: classes5.dex */
public final class GameIntroductionAndCountDownHelper$show$2 extends Lambda implements Function1<List<? extends w$a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87146KVo this$0;

    static {
        Covode.recordClassIndex(19616);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroductionAndCountDownHelper$show$2(C87146KVo c87146KVo) {
        super(1);
        this.this$0 = c87146KVo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends w$a> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list);
            this.this$0.LIZ().run();
        }
        return Unit.INSTANCE;
    }
}
