package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.base.model.user.C2852e;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5816w;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.CallableC87822Kj2;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$uploadSnapshot$1$1 extends Lambda implements Function1<C5816w, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CallableC87822Kj2 this$0;

    static {
        Covode.recordClassIndex(21581);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingManagerV2$uploadSnapshot$1$1(CallableC87822Kj2 callableC87822Kj2) {
        super(1);
        this.this$0 = callableC87822Kj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5816w c5816w) {
        List<String> list;
        String str;
        String str2;
        List<String> list2;
        C5816w c5816w2 = c5816w;
        if (!PatchProxy.proxy(new Object[]{c5816w2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5816w2);
            C2852e c2852e = c5816w2.LIZ;
            if (c2852e != null && (list = c2852e.LIZIZ) != null && (!list.isEmpty())) {
                C2852e c2852e2 = c5816w2.LIZ;
                String str3 = null;
                if (c2852e2 != null) {
                    str = c2852e2.LIZ;
                } else {
                    str = null;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    Function1 function1 = this.this$0.f8579LJ;
                    C2852e c2852e3 = c5816w2.LIZ;
                    if (c2852e3 != null) {
                        str2 = c2852e3.LIZ;
                    } else {
                        str2 = null;
                    }
                    Intrinsics.checkNotNull(str2);
                    C2852e c2852e4 = c5816w2.LIZ;
                    if (c2852e4 != null && (list2 = c2852e4.LIZIZ) != null) {
                        str3 = list2.get(0);
                    }
                    Intrinsics.checkNotNull(str3);
                    function1.invoke(new Pair(str2, str3));
                }
            }
            this.this$0.LIZLLL.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
