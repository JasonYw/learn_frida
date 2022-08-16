package com.android.ttcjpaysdk.bindcard.quickbind.p143a;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.b$e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135899cIQ;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.a.e */
/* loaded from: classes17.dex */
public final class C2233e extends C135543cCg<C2229a, b$e> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7225);
    }

    public final void LIZ(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4);
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            c2208b.LIZ(str, str2, str3, str4, new C135899cIQ(this));
        }
    }
}
