package com.bytedance.android.live.broadcast.stream.capture.p279a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileNotFoundException;
import p002O.C0002O;
import p003X.AbstractC86578K9s;
import p003X.AbstractC86638KCa;
import p003X.C86642KCe;
import p003X.K8F;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.a.b */
/* loaded from: classes5.dex */
public final class C3240b extends K8F implements AbstractC86578K9s {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(17926);
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(String[] strArr, String[] strArr2) {
        if (PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (this.LIZJ == null) {
            throw new IllegalStateException("Effect is not bind");
        }
        this.LIZJ.LIZ(strArr, strArr.length, strArr2);
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        if (this.LIZJ != null) {
            this.LIZJ.LIZ((String) null);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZIZ(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (strArr != null && strArr.length != 0) {
            if (this.LIZJ != null) {
                this.LIZJ.LIZ(strArr);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
        throw new RuntimeException("nodes is Null or empty");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZJ(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (strArr != null && strArr.length != 0) {
            if (this.LIZJ != null) {
                this.LIZJ.LIZIZ(strArr);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
        throw new RuntimeException("nodePaths is Null or empty");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (this.LIZJ != null) {
            this.LIZJ.LIZ(z);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(String[] strArr) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZJ != null) {
            AbstractC86638KCa abstractC86638KCa = this.LIZJ;
            if (strArr != null) {
                i = strArr.length;
            }
            abstractC86638KCa.LIZ(strArr, i);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (i >= 0 && i2 >= 0) {
            if (this.LIZJ != null) {
                this.LIZJ.LIZ(i, i2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
        throw new IllegalStateException("mode is " + i + "order type is " + i2);
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZIZ(String[] strArr, String[] strArr2) {
        if (PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (strArr != null && strArr.length != 0) {
            if (this.LIZJ != null) {
                this.LIZJ.LIZ(strArr, strArr2);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
        throw new RuntimeException("nodes is Null or empty");
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(String str, boolean z) {
        boolean exists;
        if (PatchProxy.proxy(new Object[]{str, (byte) 0}, this, LIZ, false, 1).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, C86642KCe.LIZ, true, 2);
        if (proxy.isSupported) {
            exists = ((Boolean) proxy.result).booleanValue();
        } else {
            if (!TextUtils.isEmpty(str)) {
                exists = new File(str).exists();
            }
            throw new FileNotFoundException(C0002O.m25086C("Filter file not exists:", str));
        }
        if (exists) {
            if (this.LIZJ != null) {
                this.LIZJ.LIZ(str, false);
                return;
            }
            throw new IllegalStateException("Effect is not bind");
        }
        throw new FileNotFoundException(C0002O.m25086C("Filter file not exists:", str));
    }

    @Override // p003X.AbstractC86578K9s
    public final void LIZ(String str, String str2, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (this.LIZJ != null) {
            this.LIZJ.LIZ(str, str2, z);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }
}
