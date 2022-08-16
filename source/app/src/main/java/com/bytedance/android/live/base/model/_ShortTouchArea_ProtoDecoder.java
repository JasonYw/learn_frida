package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _ShortTouchArea_ProtoDecoder implements AbstractC10531b<C2834h> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13975);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2834h mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2834h) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2834h decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2834h) proxy.result;
        }
        C2834h c2834h = new C2834h();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2834h.LIZ = QV1.LIZIZ(c10532g);
                        break;
                    case 2:
                        c2834h.LIZIZ = QV1.LIZIZ(c10532g);
                        break;
                    case 3:
                        c2834h.LIZJ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        c2834h.LIZLLL = QV1.LIZIZ(c10532g);
                        break;
                    case 5:
                        c2834h.LJFF = _ShortTouchInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        c2834h.LJI = _ShortTouchBigCard_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 7:
                        c2834h.LJII = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        c2834h.LJIIIIZZ = QV1.LIZIZ(c10532g);
                        break;
                    case 9:
                        c2834h.LJIIIZ = _ShortTouchBubble_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 10:
                        c2834h.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2834h;
            }
        }
    }
}
