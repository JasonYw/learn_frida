package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.capture.p279a.C3240b;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.KCT;

/* renamed from: com.bytedance.android.live.broadcast.effect.c */
/* loaded from: classes5.dex */
public final class C3007c implements KCT {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final C3240b LIZJ;

    static {
        Covode.recordClassIndex(15746);
    }

    @Override // p003X.KCT
    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LJIIJ();
        return 0;
    }

    @Override // p003X.KCT
    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ();
        return 1;
    }

    public C3007c(C3240b c3240b) {
        C106862S5w.LIZ(c3240b);
        this.LIZJ = c3240b;
    }

    @Override // p003X.KCT
    public final int LIZJ(String[] strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        this.LIZJ.LIZJ(strArr);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZIZ(String[] strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZIZ(strArr);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ(z);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZ(String[] strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ(strArr);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZ(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ(i, i2);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZIZ(String[] strArr, String[] strArr2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        this.LIZJ.LIZIZ(strArr, strArr2);
        return 1;
    }

    @Override // p003X.KCT
    public final int LIZ(String[] strArr, String[] strArr2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ(strArr, strArr2);
        return 1;
    }

    @Override // p003X.KCT
    public final /* synthetic */ int LIZ(String str, String str2, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(str, str2);
        if (!this.LIZIZ) {
            return -1;
        }
        this.LIZJ.LIZ(str, str2, booleanValue);
        return 1;
    }
}
