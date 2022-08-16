package com.android.ttcjpaysdk.fastpay.p150c;

import com.android.ttcjpaysdk.fastpay.data.p151a.C2262e;
import com.android.ttcjpaysdk.fastpay.p149b.C2259a;
import com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C137000caB;
import p003X.C137002caD;
import p003X.C137014caP;

/* renamed from: com.android.ttcjpaysdk.fastpay.c.a */
/* loaded from: classes17.dex */
public final class C2260a extends C135543cCg<C2259a, AbstractC2265a> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7456);
    }

    public final void LIZ(Map<String, String> map, C2262e c2262e) {
        C2259a c2259a;
        if (!PatchProxy.proxy(new Object[]{map, c2262e}, this, LIZ, false, 2).isSupported && (c2259a = (C2259a) this.mModel) != null) {
            c2259a.LIZ(map, c2262e, new C137002caD(this));
        }
    }

    public final void LIZ(Map<String, String> map, String str) {
        if (PatchProxy.proxy(new Object[]{map, str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C2259a c2259a = (C2259a) this.mModel;
        if (c2259a != null) {
            c2259a.LIZ(map, str, new C137000caB(this), new C137014caP());
        }
    }
}
