package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _FeedExtra_ProtoDecoder implements AbstractC10531b<C2827a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14035);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2827a mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2827a) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2827a decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2827a) proxy.result;
        }
        C2827a c2827a = new C2827a();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 3) {
                        switch (LIZIZ) {
                            case 5:
                                c2827a.LIZIZ = QV1.LIZJ(c10532g);
                                continue;
                            case 6:
                                c2827a.LJFF = QV1.LIZJ(c10532g);
                                continue;
                            case 7:
                                c2827a.LJI = QV1.LIZJ(c10532g);
                                continue;
                            case 8:
                                c2827a.LJIIIZ = (int) QV1.LIZJ(c10532g);
                                continue;
                            case 9:
                                c2827a.LJIIIIZZ = _FeedBannerContainer_ProtoDecoder.decodeStatic(c10532g);
                                continue;
                            case 10:
                                c2827a.LIZJ = _RankRoundBanner_ProtoDecoder.decodeStatic(c10532g);
                                continue;
                            case 11:
                                c2827a.LIZLLL = QV1.LJFF(c10532g);
                                continue;
                            case 12:
                                c2827a.LJIIJ = (int) QV1.LIZJ(c10532g);
                                continue;
                            case 13:
                                c2827a.LJIIJJI = QV1.LIZJ(c10532g);
                                continue;
                            case 14:
                                c2827a.LJIIL = QV1.LIZIZ(c10532g);
                                continue;
                            default:
                                QV1.LJII(c10532g);
                                continue;
                        }
                    } else {
                        c2827a.hasMore = QV1.LIZ(c10532g);
                    }
                } else {
                    c2827a.f25739LJ = _FeedExtra_LogPb_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2827a;
            }
        }
    }
}
