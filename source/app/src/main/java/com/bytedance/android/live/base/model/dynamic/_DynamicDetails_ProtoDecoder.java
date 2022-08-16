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
public final class _DynamicDetails_ProtoDecoder implements AbstractC10531b<C2817b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14002);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2817b mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2817b) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2817b decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2817b) proxy.result;
        }
        C2817b c2817b = new C2817b();
        c2817b.LJIIIIZZ = new ArrayList();
        c2817b.LJIIL = new ArrayList();
        c2817b.LJIIJ = new ArrayList();
        c2817b.LJIIIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (c10532g.LIZIZ() != -1) {
            QV1.LJII(c10532g);
        }
        c10532g.LIZ(LIZ);
        return c2817b;
    }
}
