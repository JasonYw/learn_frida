package com.bytedance.android.live.broadcast.link.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC86638KCa;
import p003X.C106862S5w;
import p003X.K8F;
import p003X.KE8;

/* renamed from: com.bytedance.android.live.broadcast.link.effect.f */
/* loaded from: classes5.dex */
public final class C3152f extends K8F implements KE8 {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(16919);
    }

    @Override // p003X.KE8
    public final void LIZ() {
        AbstractC86638KCa abstractC86638KCa;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (abstractC86638KCa = this.LIZJ) != null) {
            abstractC86638KCa.LIZ((String) null, 1.0f, true);
        }
    }

    @Override // p003X.KE8
    public final void LIZ(String str, float f, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (z) {
            AbstractC86638KCa abstractC86638KCa = this.LIZJ;
            if (abstractC86638KCa != null) {
                abstractC86638KCa.LIZ(str, f, false);
                return;
            }
            return;
        }
        AbstractC86638KCa abstractC86638KCa2 = this.LIZJ;
        if (abstractC86638KCa2 != null) {
            abstractC86638KCa2.LIZ(str, 1.0f, true);
        }
    }

    @Override // p003X.KE8
    public final void LIZ(String str, String str2, float f, float f2, float f3, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (z) {
            AbstractC86638KCa abstractC86638KCa = this.LIZJ;
            if (abstractC86638KCa != null) {
                abstractC86638KCa.LIZ(str, str2, f, f2, f3, false);
                return;
            }
            return;
        }
        AbstractC86638KCa abstractC86638KCa2 = this.LIZJ;
        if (abstractC86638KCa2 != null) {
            abstractC86638KCa2.LIZ(str, str2, f, f2, f3, true);
        }
    }
}
