package com.bytedance.android.live.base.model.gift;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C3MD;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class _ExhibitionGiftItem_ProtoDecoder implements AbstractC10531b<C2830b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14053);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2830b mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2830b) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2830b decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2830b) proxy.result;
        }
        C2830b c2830b = new C2830b();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2830b.LIZ = _ExhibitionGiftStruct_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 2:
                        c2830b.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        c2830b.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        c2830b.LIZLLL = QV1.LIZ(c10532g);
                        break;
                    case 5:
                        c2830b.f25740LJ = _ExhibitionUser_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        c2830b.LJFF = new C3MD(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2830b;
            }
        }
    }
}
