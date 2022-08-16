package bytekn.foundation.encryption;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C149620fsJ;

/* renamed from: bytekn.foundation.encryption.g */
/* loaded from: classes20.dex */
public final class C0618g extends AbstractC0617d {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public static final C149620fsJ f20855LJ = new C149620fsJ((byte) 0);
    public static final int[] LJIIIIZZ = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};
    public static final int[] LJIIIZ;
    public final int[] LJFF = new int[4];
    public final int[] LJI = new int[4];
    public final int[] LJII = new int[16];

    public C0618g() {
        super(64, 16);
        LIZ();
    }

    @Override // bytekn.foundation.encryption.AbstractC0617d
    public final void LIZ() {
        int[] iArr = this.LJFF;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    static {
        Covode.recordClassIndex(2634);
        int i = 0;
        int[] iArr = new int[64];
        do {
            iArr[i] = (int) (Math.abs(Math.sin(i + 1.0d)) * 4.294967296E9d);
            i++;
        } while (i < 64);
        LJIIIZ = iArr;
    }

    @Override // bytekn.foundation.encryption.AbstractC0617d
    public final byte[] LIZ(long j) {
        long j2 = 8 * j;
        byte[] bArr = new byte[(int) (((((j + 8) / this.LIZIZ) + 1) * this.LIZIZ) - j)];
        bArr[0] = Byte.MIN_VALUE;
        for (int i = 0; i < 8; i++) {
            bArr[(bArr.length - 8) + i] = (byte) (j2 >>> (i * 8));
        }
        return bArr;
    }

    @Override // bytekn.foundation.encryption.AbstractC0617d
    public final void LIZIZ(byte[] bArr) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{bArr}, this, LIZLLL, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(bArr);
        do {
            bArr[i] = (byte) (this.LJFF[i / 4] >>> ((i % 4) * 8));
            i++;
        } while (i < 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    @Override // bytekn.foundation.encryption.AbstractC0617d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(byte[] r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.encryption.C0618g.LIZ(byte[]):void");
    }
}
