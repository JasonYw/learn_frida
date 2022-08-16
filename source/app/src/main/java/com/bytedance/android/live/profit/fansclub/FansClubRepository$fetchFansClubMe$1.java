package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.live.profit.fansclub.transfer.C5275e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC414762bG;
import p003X.C106862S5w;
import p003X.C4324038w;
import p003X.C436193Nl;
import p003X.C438173Vb;
import p003X.C458354Ar;
import p003X.C458374At;
import p003X.C458394Av;

/* loaded from: classes12.dex */
public final class FansClubRepository$fetchFansClubMe$1 extends Lambda implements Function1<C5275e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C458354Ar this$0;

    static {
        Covode.recordClassIndex(33266);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubRepository$fetchFansClubMe$1(C458354Ar c458354Ar) {
        super(1);
        this.this$0 = c458354Ar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5275e c5275e) {
        C5256c c5256c;
        C4324038w c4324038w;
        Object c5265k;
        Object c5264j;
        C5275e c5275e2 = c5275e;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{c5275e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5275e2);
            String str = c5275e2.LIZJ;
            if (str != null && str.length() > 0) {
                this.this$0.LIZJ.LIZ(str);
            }
            Integer num = c5275e2.LJI;
            if (num != null) {
                this.this$0.LIZLLL.LIZ(num);
            }
            C5265k LIZ = this.this$0.f1143LJ.LIZ();
            AbstractC414762bG abstractC414762bG = this.this$0.f1143LJ;
            C5256c c5256c2 = LIZ.LIZIZ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5275e2, c5256c2}, null, C436193Nl.LIZ, true, 1);
            if (proxy.isSupported) {
                c5256c = (C5256c) proxy.result;
            } else {
                C106862S5w.LIZ(c5275e2);
                C458374At c458374At = c5275e2.f26560LJ;
                if (c458374At != null) {
                    String str2 = c458374At.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int i2 = c458374At.LIZIZ;
                    FansClubUserStatus LIZ2 = C438173Vb.LIZ(c458374At.LIZJ);
                    if (c5256c2 != null) {
                        c4324038w = c5256c2.f26558LJ;
                    } else {
                        c4324038w = null;
                    }
                    c5256c = new C5256c(str2, i2, LIZ2, c4324038w);
                } else {
                    c5256c = null;
                }
            }
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ, c5256c, null, null, 6, null}, null, C5265k.LIZ, true, 3);
            if (proxy2.isSupported) {
                c5265k = proxy2.result;
            } else {
                C5256c c5256c3 = LIZ.LIZJ;
                C5256c c5256c4 = LIZ.LIZLLL;
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c5256c, c5256c3, c5256c4}, LIZ, C5265k.LIZ, false, 2);
                if (proxy3.isSupported) {
                    c5265k = proxy3.result;
                } else {
                    c5265k = new C5265k(c5256c, c5256c3, c5256c4);
                }
            }
            abstractC414762bG.LIZ(c5265k);
            AbstractC414762bG abstractC414762bG2 = this.this$0.LJI;
            PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{c5275e2}, null, C436193Nl.LIZ, true, 7);
            if (proxy4.isSupported) {
                c5264j = proxy4.result;
            } else {
                C106862S5w.LIZ(c5275e2);
                C458394Av c458394Av = c5275e2.LJFF;
                if (c458394Av != null) {
                    i = c458394Av.LIZ;
                }
                c5264j = new C5264j(i);
            }
            abstractC414762bG2.LIZ(c5264j);
        }
        return Unit.INSTANCE;
    }
}
