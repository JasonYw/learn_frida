package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _FeedBanner_ProtoDecoder implements AbstractC10531b<C2807a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13989);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2807a mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2807a) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2807a decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2807a) proxy.result;
        }
        C2807a c2807a = new C2807a();
        c2807a.LIZLLL = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2807a.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        c2807a.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        c2807a.LIZLLL.add(QV1.LJFF(c10532g));
                        break;
                    case 4:
                        c2807a.f25729LJ = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        c2807a.LJFF = (int) QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        c2807a.LJI = (int) QV1.LIZJ(c10532g);
                        break;
                    case 7:
                    case 10:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 8:
                        c2807a.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 9:
                        c2807a.LJII = QV1.LJFF(c10532g);
                        break;
                    case 11:
                        c2807a.LJIIJJI = (int) QV1.LIZJ(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2807a;
            }
        }
    }
}
