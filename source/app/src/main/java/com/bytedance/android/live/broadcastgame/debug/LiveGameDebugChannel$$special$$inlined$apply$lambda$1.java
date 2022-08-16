package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class LiveGameDebugChannel$$special$$inlined$apply$lambda$1 extends Lambda implements Function1<List<? extends C3324a>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3465b this$0;

    static {
        Covode.recordClassIndex(19691);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDebugChannel$$special$$inlined$apply$lambda$1(C3465b c3465b) {
        super(1);
        this.this$0 = c3465b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends C3324a> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list);
            List<Function1<?, Unit>> list2 = this.this$0.LIZ().get(C3324a.class);
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    Function1 function1 = (Function1) it.next();
                    if (TypeIntrinsics.isFunctionOfArity(function1, 1) && function1 != null) {
                        function1.invoke(list);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
