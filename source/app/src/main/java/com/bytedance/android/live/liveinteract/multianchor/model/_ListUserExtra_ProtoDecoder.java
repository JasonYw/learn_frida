package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class _ListUserExtra_ProtoDecoder implements AbstractC10531b<C4534a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28150);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C4534a mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C4534a) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C4534a decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C4534a) proxy.result;
        }
        C4534a c4534a = new C4534a();
        c4534a.LJIIL = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c4534a.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        c4534a.LIZJ = QV1.LIZ(c10532g);
                        break;
                    case 3:
                        c4534a.f26353LJ = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        c4534a.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        c4534a.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        c4534a.LJI = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        c4534a.LJII = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        c4534a.LJIIIIZZ = QV1.LIZJ(c10532g);
                        break;
                    case 9:
                        c4534a.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    case 10:
                        c4534a.LJIIJJI = QV1.LJFF(c10532g);
                        break;
                    case 11:
                        c4534a.LJIIL.add(Long.valueOf(QV1.LIZJ(c10532g)));
                        break;
                    case 12:
                        c4534a.LJIIIZ = QV1.LIZIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c4534a;
            }
        }
    }
}
