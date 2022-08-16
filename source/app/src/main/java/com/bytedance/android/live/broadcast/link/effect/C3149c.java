package com.bytedance.android.live.broadcast.link.effect;

import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC86638KCa;
import p003X.K8F;
import p003X.KCT;

/* renamed from: com.bytedance.android.live.broadcast.link.effect.c */
/* loaded from: classes5.dex */
public final class C3149c extends K8F implements KCT {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(16914);
    }

    @Override // p003X.KCT
    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LJIIJ();
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ((String) null);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZJ(String[] strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZIZ(strArr);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZIZ(String[] strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ(strArr);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ(z);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZ(String[] strArr) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            abstractC86638KCa.LIZ(strArr, i);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ(i, i2);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZIZ(String[] strArr, String[] strArr2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ(strArr, strArr2);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZ(String[] strArr, String[] strArr2) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            abstractC86638KCa.LIZ(strArr, i, strArr2);
        }
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZ(String str, String str2, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, bool}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC86638KCa abstractC86638KCa = this.LIZJ;
        if (abstractC86638KCa != null) {
            abstractC86638KCa.LIZ(str, str2, Intrinsics.areEqual(bool, Boolean.TRUE));
        }
        return 0;
    }
}
