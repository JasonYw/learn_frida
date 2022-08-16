package com.bytedance.android.live.base.model.banner;

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
public final class _FeedBannerContainer_ProtoDecoder implements AbstractC10531b<C2808b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13988);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2808b mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2808b) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2808b decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2808b) proxy.result;
        }
        C2808b c2808b = new C2808b();
        c2808b.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2808b.LIZ.add(_FeedBanner_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 2:
                        c2808b.LIZIZ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        c2808b.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 4:
                        c2808b.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        c2808b.f25730LJ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        c2808b.LJFF = (int) QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2808b;
            }
        }
    }
}
