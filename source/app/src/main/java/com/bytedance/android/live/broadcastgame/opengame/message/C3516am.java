package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.am */
/* loaded from: classes5.dex */
public class C3516am extends C3523i {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ;
    public String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;
    public final int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public C3514ak LJJ;
    public final int LJJI;
    public String LJJIFFI;
    public String LJJII;

    static {
        Covode.recordClassIndex(20275);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.message.C3523i, p003X.C87463KdF
    public final JSONObject LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZIZ = super.LIZIZ();
        LIZIZ.put("schema", this.LJIIJ);
        LIZIZ.put("mode", this.LJIILIIL);
        LIZIZ.put("developer", this.LJIIZILJ);
        LIZIZ.put("current_game_identifer", this.LJIILJJIL);
        LIZIZ.put("current_game_version", this.LJIIIZ);
        JSONObject put = LIZIZ.put("business_type", this.LJIJ);
        Intrinsics.checkNotNullExpressionValue(put, "");
        return put;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3516am(long j, String str, long j2, long j3, String str2, String str3, String str4, String str5, long j4, String str6, int i, boolean z, String str7, int i2, int i3, boolean z2, boolean z3, int i4, C3514ak c3514ak, int i5, String str8, String str9) {
        super(str2, j2, j3, j3, 0L, 16);
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7);
        this.LIZIZ = j;
        this.LJIIIZ = str;
        this.LJIIJ = str3;
        this.LJIIJJI = str4;
        this.LJIIL = str5;
        this.LJIILIIL = j4;
        this.LJIILJJIL = str6;
        this.LJIILL = i;
        this.LJIILLIIL = z;
        this.LJIIZILJ = str7;
        this.LJIJ = i2;
        this.LJIJI = i3;
        this.LJIJJ = z2;
        this.LJIJJLI = z3;
        this.LJIL = i4;
        this.LJJ = c3514ak;
        this.LJJI = i5;
        this.LJJIFFI = str8;
        this.LJJII = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3516am(long r28, java.lang.String r30, long r31, long r33, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, long r39, java.lang.String r41, int r42, boolean r43, java.lang.String r44, int r45, int r46, boolean r47, boolean r48, int r49, com.bytedance.android.live.broadcastgame.opengame.message.C3514ak r50, int r51, java.lang.String r52, java.lang.String r53, int r54) {
        /*
            r27 = this;
            r0 = r54
            r14 = r41
            r12 = r39
            r10 = r37
            r11 = r38
            r4 = r31
            r21 = r48
            r6 = r33
            r23 = r50
            r15 = r42
            r16 = r43
            r18 = r45
            r19 = r46
            r20 = r47
            r22 = r49
            r24 = r51
            r25 = r52
            r3 = r0 & 4
            r1 = 0
            if (r3 == 0) goto L2a
            r4 = 0
        L2a:
            r1 = r0 & 8
            if (r1 == 0) goto L30
            r6 = 0
        L30:
            r1 = r0 & 64
            java.lang.String r17 = ""
            if (r1 == 0) goto L38
            r10 = r17
        L38:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3e
            r11 = r17
        L3e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L44
            r12 = 0
        L44:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r14 = r17
        L4a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L50
            r15 = 0
        L50:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L56
            r16 = 0
        L56:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L5c
            r17 = r44
        L5c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L62
            r18 = 0
        L62:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L69
            r1 = 1
            r19 = 1
        L69:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L71
            r20 = 0
        L71:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L78
            r21 = 0
        L78:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L7f
            r22 = 0
        L7f:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            r26 = 0
            if (r1 == 0) goto L88
            r23 = r26
        L88:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L90
            r1 = -1
            r24 = -1
        L90:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L97
            r25 = r26
        L97:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 != 0) goto L9e
            r26 = r53
        L9e:
            r0 = r27
            r3 = r30
            r1 = r28
            r8 = r35
            r9 = r36
            r0.<init>(r1, r3, r4, r6, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.message.C3516am.<init>(long, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, boolean, java.lang.String, int, int, boolean, boolean, int, com.bytedance.android.live.broadcastgame.opengame.message.ak, int, java.lang.String, java.lang.String, int):void");
    }
}
