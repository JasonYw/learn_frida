package com.bytedance.android.live.base.model.dynamic;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _NoticeDetail_ProtoDecoder implements AbstractC10531b<C2821f> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14005);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2821f mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2821f) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2821f decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2821f) proxy.result;
        }
        C2821f c2821f = new C2821f();
        c2821f.LIZLLL = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        c2821f.LIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        c2821f.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        c2821f.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        c2821f.LIZLLL.add(QV1.LJFF(c10532g));
                        break;
                    case 5:
                        c2821f.f25734LJ = QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        c2821f.LJFF = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2821f;
            }
        }
    }
}
