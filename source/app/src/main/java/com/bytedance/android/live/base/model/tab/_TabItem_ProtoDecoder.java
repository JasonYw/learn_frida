package com.bytedance.android.live.base.model.tab;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _TabItem_ProtoDecoder implements AbstractC10531b<C2847a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14123);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2847a mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2847a) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2847a decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2847a) proxy.result;
        }
        C2847a c2847a = new C2847a();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 16) {
                                    if (LIZIZ != 21) {
                                        if (LIZIZ != 200) {
                                            switch (LIZIZ) {
                                                case 7:
                                                    c2847a.f25753LJ = QV1.LJFF(c10532g);
                                                    continue;
                                                case 8:
                                                    c2847a.LJI = QV1.LIZJ(c10532g);
                                                    continue;
                                                case 9:
                                                    c2847a.LJII = QV1.LIZJ(c10532g);
                                                    continue;
                                                case 10:
                                                    c2847a.LJIIIIZZ = QV1.LIZJ(c10532g);
                                                    continue;
                                                case 11:
                                                    c2847a.LJIIIZ = QV1.LJFF(c10532g);
                                                    continue;
                                                default:
                                                    QV1.LJII(c10532g);
                                                    continue;
                                            }
                                        } else {
                                            c2847a.LJIIJJI = QV1.LJFF(c10532g);
                                        }
                                    } else {
                                        c2847a.LJIIJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                    }
                                } else {
                                    c2847a.LJFF = QV1.LJFF(c10532g);
                                }
                            } else {
                                c2847a.LIZLLL = QV1.LIZJ(c10532g);
                            }
                        } else {
                            c2847a.LIZJ = QV1.LJFF(c10532g);
                        }
                    } else {
                        c2847a.LIZIZ = QV1.LJFF(c10532g);
                    }
                } else {
                    c2847a.LIZ = (int) QV1.LIZJ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2847a;
            }
        }
    }
}
