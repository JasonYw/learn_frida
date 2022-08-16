package com.bytedance.android.live.profit;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C427292vT;
import p003X.C91085LuZ;

/* loaded from: classes5.dex */
public final class PrivilegeContext$1 extends Lambda implements Function1<C5277g, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C91085LuZ this$0;

    static {
        Covode.recordClassIndex(33211);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivilegeContext$1(C91085LuZ c91085LuZ) {
        super(1);
        this.this$0 = c91085LuZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5277g c5277g) {
        C5277g c5277g2 = c5277g;
        if (!PatchProxy.proxy(new Object[]{c5277g2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5277g2);
            C427292vT.LIZ(c5277g2.LJI, this.this$0.LIZ());
            C427292vT.LIZ(c5277g2.LJIIIIZZ, this.this$0.LJIIIIZZ());
        }
        return Unit.INSTANCE;
    }
}
