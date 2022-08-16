package bytekn.foundation.encryption;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C104023Qxl;
import p003X.C106862S5w;
import p003X.C108921SuZ;

/* renamed from: bytekn.foundation.encryption.d */
/* loaded from: classes20.dex */
public abstract class AbstractC0617d {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ = 64;
    public final int LIZJ = 16;
    public final byte[] LIZLLL = new byte[this.LIZIZ];

    /* renamed from: LJ */
    public int f20854LJ;
    public long LJFF;

    static {
        Covode.recordClassIndex(2631);
    }

    public abstract void LIZ();

    public abstract void LIZ(byte[] bArr);

    public abstract byte[] LIZ(long j);

    public abstract void LIZIZ(byte[] bArr);

    public final byte[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (byte[]) proxy.result;
        }
        byte[] bArr = new byte[this.LIZJ];
        if (!PatchProxy.proxy(new Object[]{bArr}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(bArr);
            byte[] LIZ2 = LIZ(this.LJFF);
            int i = 0;
            while (i < LIZ2.length) {
                int i2 = this.LIZIZ;
                int i3 = this.f20854LJ;
                int i4 = i2 - i3;
                C104023Qxl.LIZ(LIZ2, i, this.LIZLLL, i3, i4);
                LIZ(this.LIZLLL);
                this.f20854LJ = 0;
                i += i4;
            }
            LIZIZ(bArr);
            LIZ();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bArr}, null, C108921SuZ.LIZ, true, 5);
        if (proxy2.isSupported) {
            return (byte[]) proxy2.result;
        }
        C106862S5w.LIZ(bArr);
        return bArr;
    }

    public AbstractC0617d(int i, int i2) {
    }

    public final AbstractC0617d LIZ(byte[] bArr, int i, int i2) {
        int i3 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, 0, Integer.valueOf(i2)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC0617d) proxy.result;
        }
        C106862S5w.LIZ(bArr);
        int i4 = i2;
        while (i4 > 0) {
            int min = Math.min(this.LIZIZ - this.f20854LJ, i4);
            C104023Qxl.LIZ(bArr, i3, this.LIZLLL, this.f20854LJ, min);
            i4 -= min;
            i3 += min;
            this.f20854LJ += min;
            int i5 = this.f20854LJ;
            int i6 = this.LIZIZ;
            if (i5 >= i6) {
                this.f20854LJ = i5 - i6;
                LIZ(this.LIZLLL);
            }
        }
        this.LJFF += i2;
        return this;
    }
}
