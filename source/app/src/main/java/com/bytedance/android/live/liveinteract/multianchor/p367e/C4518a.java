package com.bytedance.android.live.liveinteract.multianchor.p367e;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ttm.player.MediaPlayer;
import p003X.C106862S5w;
import p003X.C79345HPn;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.e.a */
/* loaded from: classes3.dex */
public final class C4518a {
    public static ChangeQuickRedirect LIZ;
    public static final C79345HPn LJIIJ = new C79345HPn((byte) 0);
    public final String LIZIZ;
    public int LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public final boolean f26340LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    static {
        Covode.recordClassIndex(27996);
    }

    public C4518a() {
        this(null, 0, null, false, false, false, 0, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "AnchorConnectionContext{Type=" + this.LIZIZ + ", matchType=" + this.LIZJ + ", inviteeList=" + this.LIZLLL + ", pkSwitchToLink=" + this.f26340LJ + ", switchChannel=" + this.LJFF + ", multiToMulti=" + this.LJI + ", connectionRoleType=" + this.LJII + ", pkConnectionType=" + this.LJIIIIZZ + '}';
    }

    public C4518a(String str, int i, String str2, boolean z, boolean z2, boolean z3, int i2, String str3, String str4) {
        C106862S5w.LIZ(str, str2, str3, str4);
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.f26340LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = i2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4518a(java.lang.String r12, int r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, int r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r11 = this;
            r3 = r13
            r2 = r12
            r6 = r16
            r1 = r21
            r10 = r20
            r7 = r17
            r9 = r19
            r0 = r1 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L13
            r2 = r4
        L13:
            r0 = r1 & 2
            r8 = 0
            if (r0 == 0) goto L19
            r3 = 0
        L19:
            r0 = r1 & 4
            if (r0 != 0) goto L1e
            r4 = r14
        L1e:
            r0 = r1 & 16
            if (r0 == 0) goto L23
            r6 = 0
        L23:
            r0 = r1 & 32
            if (r0 == 0) goto L28
            r7 = 0
        L28:
            r0 = r1 & 64
            if (r0 != 0) goto L2e
            r8 = r18
        L2e:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L34
            java.lang.String r9 = "manual_npk"
        L34:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3a
            java.lang.String r10 = "link_banner"
        L3a:
            r0 = 0
            r1 = r11
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a.<init>(java.lang.String, int, java.lang.String, boolean, boolean, boolean, int, java.lang.String, java.lang.String, int):void");
    }
}
