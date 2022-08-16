package com.bytedance.android.live.liveinteract.videotalk.quickinteract;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C80583HpZ;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.e */
/* loaded from: classes3.dex */
public final class C4939e {
    public static ChangeQuickRedirect LIZ;
    public static final C80583HpZ LJIIIZ = new C80583HpZ((byte) 0);
    public final long LIZIZ;
    public final String LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public final long f26449LJ;
    public final ImageModel LJFF;
    public final String LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    static {
        Covode.recordClassIndex(30344);
    }

    public C4939e() {
        this(0L, null, 0L, 0L, null, null, 0, false, MotionEventCompat.ACTION_MASK);
    }

    public C4939e(long j, String str) {
        this(j, str, 0L, 0L, null, null, 0, false, 252);
    }

    public final boolean LIZ() {
        if (this.LIZLLL > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "score: " + this.LIZJ + ", receive from: " + this.LIZIZ + ", duration: " + this.LIZLLL + ", send from " + this.f26449LJ + ", content: " + this.LJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4939e(long r14, java.lang.String r16, int r17, com.bytedance.android.live.liveinteract.plantform.model.C4816k r18) {
        /*
            r13 = this;
            r3 = r16
            p003X.C106862S5w.LIZ(r3)
            r6 = 0
            r1 = r18
            if (r1 == 0) goto L35
            long r4 = r1.LIZJ
            com.bytedance.android.live.base.model.user.User r0 = r1.LIZIZ
            if (r0 == 0) goto L15
            long r6 = r0.getId()
        L15:
            if (r1 == 0) goto L33
            com.bytedance.android.live.base.model.user.User r0 = r1.LIZIZ
            if (r0 == 0) goto L33
            com.bytedance.android.live.base.model.ImageModel r8 = r0.getAvatarThumb()
        L1f:
            java.lang.String r9 = ""
            if (r1 == 0) goto L28
            java.lang.String r0 = r1.LIZLLL
            if (r0 == 0) goto L28
            r9 = r0
        L28:
            r11 = 0
            r12 = 128(0x80, float:1.794E-43)
            r0 = r13
            r1 = r14
            r10 = r17
            r0.<init>(r1, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        L33:
            r8 = 0
            goto L1f
        L35:
            r4 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e.<init>(long, java.lang.String, int, com.bytedance.android.live.liveinteract.plantform.model.k):void");
    }

    public C4939e(long j, String str, long j2, long j3, ImageModel imageModel, String str2, int i, boolean z) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = j2;
        this.f26449LJ = j3;
        this.LJFF = imageModel;
        this.LJI = str2;
        this.LJII = i;
        this.LJIIIIZZ = z;
    }

    public /* synthetic */ C4939e(long j, String str, long j2, long j3, ImageModel imageModel, String str2, int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) == 0 ? j3 : 0L, (i2 & 16) != 0 ? null : imageModel, (i2 & 32) != 0 ? "感谢TA" : str2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? z : false);
    }
}
