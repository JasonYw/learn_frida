package com.bytedance.android.live.base.model.dynamic;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _DynamicHistory_ProtoDecoder implements AbstractC10531b<C2818c> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14003);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2818c mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2818c) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2818c decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2818c) proxy.result;
        }
        C2818c c2818c = new C2818c();
        c2818c.LJI = new ArrayList();
        c2818c.LJIIJJI = new ArrayList();
        c2818c.LJII = new ArrayList();
        c2818c.LJIIIIZZ = new ArrayList();
        c2818c.LJIIJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2818c.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        c2818c.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        c2818c.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        c2818c.f25733LJ = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        c2818c.LJFF = QV1.LIZ(c10532g);
                        break;
                    case 6:
                        c2818c.LJI.add(_VideoItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 7:
                        c2818c.LJII.add(_VideoItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 8:
                        c2818c.LJIIIIZZ.add(_VideoItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 9:
                        c2818c.LJIIIZ = QV1.LIZJ(c10532g);
                        break;
                    case 10:
                        c2818c.LJIIJ.add(_VideoItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 11:
                        c2818c.LJIIJJI.add(_VideoItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 12:
                        c2818c.LJIIL = QV1.LIZIZ(c10532g);
                        break;
                    case 13:
                        c2818c.LJIILIIL = QV1.LIZJ(c10532g);
                        break;
                    case 14:
                        c2818c.LJIILJJIL = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2818c;
            }
        }
    }
}
