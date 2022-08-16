package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.KY7;
import p003X.KY9;
import p003X.KYA;

/* loaded from: classes5.dex */
public final class am$c {
    public static ChangeQuickRedirect LIZ;
    public static final KY7 LJIIJJI = new KY7((byte) 0);
    public final KYA<Long> LIZIZ;
    public final KYA<Long> LIZJ;
    public final KYA<Long> LIZLLL;

    /* renamed from: LJ */
    public final KYA<Integer> f26039LJ;
    public final KYA<Integer> LJFF;
    public final KYA<Integer> LJI;
    public final KYA<Integer> LJII;
    public final KYA<String> LJIIIIZZ;
    public final KY9<String> LJIIIZ;
    public final KY9<String> LJIIJ;

    static {
        Covode.recordClassIndex(19409);
    }

    public am$c() {
        this(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26039LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof am$c) {
            return C106862S5w.LIZ(((am$c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MessageVersionAdapter$GameStatus:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public am$c(KYA<Long> kya, KYA<Long> kya2, KYA<Long> kya3, KYA<Integer> kya4, KYA<Integer> kya5, KYA<Integer> kya6, KYA<Integer> kya7, KYA<String> kya8, KY9<String> ky9, KY9<String> ky92) {
        C106862S5w.LIZ(kya, kya2, kya3, kya4, kya5, kya6, kya7, kya8, ky9, ky92);
        this.LIZIZ = kya;
        this.LIZJ = kya2;
        this.LIZLLL = kya3;
        this.f26039LJ = kya4;
        this.LJFF = kya5;
        this.LJI = kya6;
        this.LJII = kya7;
        this.LJIIIIZZ = kya8;
        this.LJIIIZ = ky9;
        this.LJIIJ = ky92;
    }

    public /* synthetic */ am$c(KYA kya, KYA kya2, KYA kya3, KYA kya4, KYA kya5, KYA kya6, KYA kya7, KYA kya8, KY9 ky9, KY9 ky92, int i) {
        this(new KYA("seq", Long.TYPE, 0L), new KYA("conn_id", Long.TYPE, 0L), new KYA(C33968a.f42937f, Long.TYPE, 0L), new KYA("game_status", Integer.TYPE, -1), new KYA("container_status", Integer.TYPE, -1), new KYA("entrance_status", Integer.TYPE, -1), new KYA("entrance_pic", Integer.TYPE, -1), new KYA("lynx_res_ver", String.class, null), new KY9("name", String.class, null), new KY9("body", String.class, "{}"));
    }
}
