package com.bytedance.android.live.base.model;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ShortTouchBubble_ProtoDecoder implements AbstractC10531b<C2836j> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13977);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2836j mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2836j) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2836j decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2836j) proxy.result;
        }
        C2836j c2836j = new C2836j();
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
                                c2836j.LIZLLL = QV1.LIZIZ(c10532g);
                            }
                        } else {
                            c2836j.LIZJ = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        c2836j.LIZIZ = _TextViewModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    c2836j.LIZ = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2836j;
            }
        }
    }
}
