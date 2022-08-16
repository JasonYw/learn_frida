package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _AnchorLevel_ProtoDecoder implements AbstractC10531b<AnchorLevel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14208);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final AnchorLevel mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AnchorLevel) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static AnchorLevel decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AnchorLevel) proxy.result;
        }
        AnchorLevel anchorLevel = new AnchorLevel();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        anchorLevel.LIZIZ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        anchorLevel.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        anchorLevel.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        anchorLevel.f25755LJ = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        anchorLevel.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        anchorLevel.LJI = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        anchorLevel.LJII = QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        anchorLevel.LJIIIIZZ = QV1.LIZJ(c10532g);
                        break;
                    case 9:
                        anchorLevel.LJIIIZ = QV1.LIZJ(c10532g);
                        break;
                    case 10:
                        anchorLevel.LJIIJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 11:
                        anchorLevel.LJIIJJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 12:
                        anchorLevel.LJIIL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 13:
                        anchorLevel.LJIILIIL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return anchorLevel;
            }
        }
    }
}
