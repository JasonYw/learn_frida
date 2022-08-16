package com.bytedance.android.live.base.model.gift;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _ExhibitionUser_ProtoDecoder implements AbstractC10531b<C2832f> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14055);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2832f mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2832f) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2832f decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2832f) proxy.result;
        }
        C2832f c2832f = new C2832f();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                QV1.LJII(c10532g);
                            } else {
                                c2832f.LIZLLL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                            }
                        } else {
                            c2832f.LIZJ = QV1.LJFF(c10532g);
                        }
                    } else {
                        c2832f.LIZIZ = QV1.LJFF(c10532g);
                    }
                } else {
                    c2832f.LIZ = QV1.LIZJ(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2832f;
            }
        }
    }
}
