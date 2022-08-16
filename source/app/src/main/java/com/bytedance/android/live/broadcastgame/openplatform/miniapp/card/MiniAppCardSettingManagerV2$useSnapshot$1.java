package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87811Kir;
import p003X.C87838KjI;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$useSnapshot$1 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $result;

    static {
        Covode.recordClassIndex(21584);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingManagerV2$useSnapshot$1(Function1 function1) {
        super(1);
        this.$result = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
        C87838KjI c87838KjI;
        Pair<? extends String, ? extends String> pair2 = pair;
        if (!PatchProxy.proxy(new Object[]{pair2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(pair2);
            String component1 = pair2.component1();
            String component2 = pair2.component2();
            PageDataV2 LIZIZ = C87811Kir.LIZIZ();
            if (LIZIZ != null && (c87838KjI = LIZIZ.LIZIZ) != null) {
                c87838KjI.LIZ(component1, component2);
            }
            this.$result.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
