package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.benchmark.mediacodec.g */
/* loaded from: classes10.dex */
public final class C2501g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public byte[] LIZJ;
    public int[] LIZLLL;

    /* renamed from: LJ */
    public long f25584LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;

    static {
        Covode.recordClassIndex(9695);
    }

    public final boolean LIZ() {
        int i = this.LIZIZ;
        if (i == 17) {
            int[] iArr = this.LIZLLL;
            if (iArr != null && iArr.length == 3) {
                return true;
            }
            return false;
        } else if (i != 16 && i != 14 && i != 15) {
            if (this.LIZJ != null) {
                return true;
            }
            return false;
        } else {
            int[] iArr2 = this.LIZLLL;
            if (iArr2 != null && iArr2.length > 0) {
                return true;
            }
            return false;
        }
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Format: " + this.LIZIZ + "; PTS: " + this.f25584LJ + "; DTS: " + this.LJFF + "; isEOF: " + this.LJII + "; isKeyFrame: " + this.LJI;
    }
}
