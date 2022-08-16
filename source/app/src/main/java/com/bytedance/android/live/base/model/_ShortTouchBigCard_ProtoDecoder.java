package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _ShortTouchBigCard_ProtoDecoder implements AbstractC10531b<C2835i> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13976);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2835i mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2835i) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2835i decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2835i) proxy.result;
        }
        C2835i c2835i = new C2835i();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 5) {
                                    QV1.LJII(c10532g);
                                } else {
                                    c2835i.f25744LJ = QV1.LIZIZ(c10532g);
                                }
                            } else {
                                c2835i.LIZLLL = QV1.LIZIZ(c10532g);
                            }
                        } else {
                            c2835i.LIZJ = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        c2835i.LIZIZ = QV1.LIZIZ(c10532g);
                    }
                } else {
                    c2835i.LIZ = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2835i;
            }
        }
    }
}
