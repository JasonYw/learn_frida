package com.bytedance.android.live.base.model.gift;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.C3L5;
import p003X.C3LN;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _GiftExhibitionHomeResponse_ProtoDecoder implements AbstractC10531b<C2833g> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14056);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2833g mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2833g) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2833g decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2833g) proxy.result;
        }
        C2833g c2833g = new C2833g();
        c2833g.LIZIZ = new ArrayList();
        c2833g.LIZJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2833g.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        c2833g.LIZIZ.add(_ExhibitionGiftItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 3:
                        c2833g.LIZJ.add(_ExhibitionGiftItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 4:
                        c2833g.LIZLLL = _ExhibitionGiftItem_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        c2833g.f25742LJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        c2833g.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        c2833g.LJI = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        c2833g.LJII = new C3L5(c10532g);
                        break;
                    case 9:
                        c2833g.LJIIIIZZ = new C3LN(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2833g;
            }
        }
    }
}
