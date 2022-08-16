package com.bytedance.android.live.base.model.user;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _Author_ProtoDecoder implements AbstractC10531b<Author> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14211);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final Author mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Author) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static Author decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Author) proxy.result;
        }
        Author author = new Author();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        author.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        author.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        author.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        author.f25756LJ = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        author.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        author.LJI = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                return author;
            }
        }
    }
}
