package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C101322PvI;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class LiveLynxComponent$renderUrl$3 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101322PvI this$0;

    static {
        Covode.recordClassIndex(32175);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxComponent$renderUrl$3(C101322PvI c101322PvI) {
        super(1);
        this.this$0 = c101322PvI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            this.this$0.LIZ("stateObserverChange", str);
        }
        return Unit.INSTANCE;
    }
}
