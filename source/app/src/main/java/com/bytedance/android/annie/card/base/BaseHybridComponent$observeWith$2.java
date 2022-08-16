package com.bytedance.android.annie.card.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.PTC;

/* loaded from: classes7.dex */
public final class BaseHybridComponent$observeWith$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PTC this$0;

    static {
        Covode.recordClassIndex(10673);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHybridComponent$observeWith$2(PTC ptc) {
        super(1);
        this.this$0 = ptc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            this.this$0.sendJsEvent("stateObserverChange", str);
        }
        return Unit.INSTANCE;
    }
}
