package com.bytedance.android.live.base.model.dynamic;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _VideoItem_ProtoDecoder implements AbstractC10531b<C2823h> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14006);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2823h mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2823h) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2823h decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2823h) proxy.result;
        }
        C2823h c2823h = new C2823h();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2823h.LIZ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        c2823h.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 3:
                        c2823h.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        c2823h.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        c2823h.LJI = (int) QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        c2823h.LJII = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        c2823h.LJIIIIZZ = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        c2823h.LJIIIZ = QV1.LIZIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2823h;
            }
        }
    }
}
