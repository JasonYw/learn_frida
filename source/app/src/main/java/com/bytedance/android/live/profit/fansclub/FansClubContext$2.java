package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C427292vT;
import p003X.C458314An;

/* loaded from: classes12.dex */
public final class FansClubContext$2 extends Lambda implements Function1<C5257d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C458314An this$0;

    static {
        Covode.recordClassIndex(33254);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubContext$2(C458314An c458314An) {
        super(1);
        this.this$0 = c458314An;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5257d c5257d) {
        C5257d c5257d2 = c5257d;
        if (!PatchProxy.proxy(new Object[]{c5257d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5257d2);
            C427292vT.LIZ(c5257d2.LIZIZ, this.this$0.m24859LJ());
            C427292vT.LIZ(c5257d2.LIZJ, this.this$0.LJFF());
        }
        return Unit.INSTANCE;
    }
}
