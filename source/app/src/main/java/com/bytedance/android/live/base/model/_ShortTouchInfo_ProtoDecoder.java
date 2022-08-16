package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _ShortTouchInfo_ProtoDecoder implements AbstractC10531b<C2837k> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13978);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2837k mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2837k) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2837k decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2837k) proxy.result;
        }
        C2837k c2837k = new C2837k();
        c2837k.LJIIJJI = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2837k.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        c2837k.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        c2837k.LIZJ = QV1.LIZIZ(c10532g);
                        break;
                    case 4:
                        c2837k.LIZLLL = QV1.LIZIZ(c10532g);
                        break;
                    case 5:
                        c2837k.f25745LJ = QV1.LIZIZ(c10532g);
                        break;
                    case 6:
                        c2837k.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        c2837k.LJII = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        c2837k.LJIIIIZZ = QV1.LIZIZ(c10532g);
                        break;
                    case 9:
                        c2837k.LJIIIZ = QV1.LIZIZ(c10532g);
                        break;
                    case 10:
                        c2837k.LJIIJJI.add(QV1.LJFF(c10532g));
                        break;
                    case 11:
                        c2837k.LJI = _ShortTouchInfo_ShortTouchImageLayers_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 12:
                        c2837k.LJIIJ = QV1.LIZIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2837k;
            }
        }
    }
}
