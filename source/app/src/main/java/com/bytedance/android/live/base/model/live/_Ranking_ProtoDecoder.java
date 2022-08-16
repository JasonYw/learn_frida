package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _Ranking_ProtoDecoder implements AbstractC10531b<C2843d> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14075);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2843d mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2843d) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2843d decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2843d) proxy.result;
        }
        C2843d c2843d = new C2843d();
        c2843d.LIZJ = new ArrayList();
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
                                    c2843d.f25749LJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                                }
                            } else {
                                c2843d.LIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            }
                        } else {
                            c2843d.LIZIZ = QV1.LJFF(c10532g);
                        }
                    } else {
                        c2843d.LIZJ.add(_RankUser_ProtoDecoder.decodeStatic(c10532g));
                    }
                } else {
                    c2843d.LIZLLL = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2843d;
            }
        }
    }
}
