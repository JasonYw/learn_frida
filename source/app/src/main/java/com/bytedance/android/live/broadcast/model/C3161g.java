package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.model.g */
/* loaded from: classes5.dex */
public final class C3161g implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("word_list")
    public List<C3160f> LIZIZ;
    public boolean LIZJ;

    static {
        Covode.recordClassIndex(16995);
    }

    public C3161g() {
    }

    public C3161g(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ2);
                this.LIZIZ.isEmpty();
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ.add(new C3160f(c10532g));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZ() {
        /*
            r4 = this;
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.model.C3161g.LIZ
            r2 = 1
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r4, r0, r3, r2)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L17:
            java.util.List<com.bytedance.android.live.broadcast.model.f> r0 = r4.LIZIZ
            if (r0 != 0) goto L1c
            return r3
        L1c:
            java.util.Iterator r1 = r0.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            com.bytedance.android.live.broadcast.model.f r0 = (com.bytedance.android.live.broadcast.model.C3160f) r0
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L20
        L36:
            return r3
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.model.C3161g.LIZ():boolean");
    }
}
