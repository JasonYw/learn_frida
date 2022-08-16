package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.C2837k;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes11.dex */
public final class _ShortTouchInfo_ShortTouchImageLayers_ProtoDecoder implements AbstractC10531b<C2837k.C2838a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13980);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final C2837k.C2838a mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (C2837k.C2838a) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static C2837k.C2838a decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (C2837k.C2838a) proxy.result;
        }
        C2837k.C2838a c2838a = new C2837k.C2838a();
        c2838a.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            QV1.LJII(c10532g);
                        } else {
                            c2838a.LIZJ = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        c2838a.LIZIZ = QV1.LIZIZ(c10532g);
                    }
                } else {
                    c2838a.LIZ.add(_ShortTouchInfo_ShortTouchImageLayers_Layer_ProtoDecoder.decodeStatic(c10532g));
                }
            } else {
                c10532g.LIZ(LIZ);
                return c2838a;
            }
        }
    }
}
