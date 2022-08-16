package com.android.ttcjpaysdk.bindcard.quickbind.p143a;

import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.b$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.AbstractC135914cIf;
import p003X.C106862S5w;
import p003X.C135909cIa;
import p003X.C135910cIb;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.a.c */
/* loaded from: classes17.dex */
public final class C2231c extends AbstractC135914cIf<b$c> {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25479LJ;

    static {
        Covode.recordClassIndex(7219);
    }

    public final void LIZ(Map<String, String> map, String str) {
        if (PatchProxy.proxy(new Object[]{map, str}, this, f25479LJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, str);
        C2229a c2229a = (C2229a) this.mModel;
        if (c2229a != null) {
            c2229a.LIZ(map, str, new C135909cIa(this));
        }
    }

    public final void LIZ(Map<String, String> map, boolean z) {
        if (PatchProxy.proxy(new Object[]{map, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f25479LJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        C2229a c2229a = (C2229a) this.mModel;
        if (c2229a != null) {
            c2229a.LIZJ(map, new C135910cIb(this, z));
        }
    }
}
