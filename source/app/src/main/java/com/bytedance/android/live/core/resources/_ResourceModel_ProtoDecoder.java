package com.bytedance.android.live.core.resources;

import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class _ResourceModel_ProtoDecoder implements AbstractC10531b<C4086b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23587);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C4086b mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C4086b) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C4086b decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C4086b) proxy.result;
        }
        C4086b c4086b = new C4086b();
        c4086b.LIZIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c4086b.LIZ = QV1.LJFF(c10532g);
                    }
                } else {
                    c4086b.LIZIZ.add(QV1.LJFF(c10532g));
                }
            } else {
                c10532g.LIZ(LIZ);
                return c4086b;
            }
        }
    }
}