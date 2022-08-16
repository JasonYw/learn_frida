package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC414772bH;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C427292vT;
import p003X.C458314An;

/* loaded from: classes12.dex */
public final class FansClubContext$1 extends Lambda implements Function1<AbstractC5272q, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C458314An this$0;

    static {
        Covode.recordClassIndex(33253);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubContext$1(C458314An c458314An) {
        super(1);
        this.this$0 = c458314An;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC5272q abstractC5272q) {
        Object LIZ;
        AbstractC5272q abstractC5272q2 = abstractC5272q;
        if (!PatchProxy.proxy(new Object[]{abstractC5272q2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC5272q2);
            C427292vT.LIZ(abstractC5272q2.LIZJ(), this.this$0.LIZ());
            AbstractC414772bH<String> LIZ2 = abstractC5272q2.LIZ();
            C458314An c458314An = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c458314An, C458314An.LIZ, false, 4);
            if (proxy.isSupported) {
                LIZ = proxy.result;
            } else {
                LIZ = c458314An.LIZJ.LIZ(c458314An, C458314An.LIZIZ[1]);
            }
            C427292vT.LIZ(LIZ2, (C2WC) LIZ);
            C427292vT.LIZ(abstractC5272q2.mo15618LJ(), this.this$0.LJIIL());
            C427292vT.LIZ(abstractC5272q2.LIZIZ(), this.this$0.LIZLLL());
        }
        return Unit.INSTANCE;
    }
}
