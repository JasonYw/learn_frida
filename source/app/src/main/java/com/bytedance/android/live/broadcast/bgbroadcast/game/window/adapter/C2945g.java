package com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter;

import com.bytedance.android.live.broadcast.api.gamepromote.GameStageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter.g */
/* loaded from: classes5.dex */
public final class C2945g {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25787LJ;
    public final String LJFF;
    public final GameStageType LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    static {
        Covode.recordClassIndex(14875);
    }

    private C2945g LIZ(String str, String str2, String str3, String str4, String str5, GameStageType gameStageType, String str6, String str7) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, gameStageType, str6, str7}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2945g) proxy.result;
        }
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7);
        return new C2945g(str, str2, str3, str4, str5, gameStageType, str6, str7);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25787LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2945g) {
            return C106862S5w.LIZ(((C2945g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SimpleItemData:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C2945g(String str, String str2, String str3, String str4, String str5, GameStageType gameStageType, String str6, String str7) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25787LJ = str4;
        this.LJFF = str5;
        this.LJI = gameStageType;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C2945g(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.bytedance.android.live.broadcast.api.gamepromote.GameStageType r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
            r9 = this;
            r7 = r16
            r6 = r15
            r1 = r18
            r0 = r1 & 32
            if (r0 == 0) goto La
            r6 = 0
        La:
            r0 = r1 & 64
            java.lang.String r8 = ""
            if (r0 == 0) goto L11
            r7 = r8
        L11:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L17
            r8 = r17
        L17:
            r0 = r9
            r5 = r14
            r4 = r13
            r2 = r11
            r1 = r10
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter.C2945g.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.live.broadcast.api.gamepromote.GameStageType, java.lang.String, java.lang.String, int):void");
    }
}
