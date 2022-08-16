package com.bytedance.android.live.broadcastgame.effectgame.choosemusic;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C89333LHr;
import p003X.KM9;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.effectgame.choosemusic.g */
/* loaded from: classes5.dex */
public final class C3471g implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    @SerializedName(C33968a.f42937f)
    public long LIZJ;
    @SerializedName("title")
    public String LIZLLL;
    @SerializedName("author")

    /* renamed from: LJ */
    public String f26048LJ;
    @SerializedName("song_url")
    public String LJFF;
    @SerializedName("cover_url")
    public String LJI;
    @SerializedName("beat_tracking_url")
    public String LJII;
    @SerializedName("duration")
    public long LJIIIIZZ;

    static {
        Covode.recordClassIndex(19823);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZJ), this.LIZLLL, this.f26048LJ, this.LJFF, this.LJI, this.LJII, Long.valueOf(this.LJIIIIZZ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3471g) {
            return C106862S5w.LIZ(((C3471g) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DanceMusicStruct:%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public C3471g() {
        this.LIZJ = -1L;
        this.LIZLLL = "";
        this.f26048LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = -1L;
        this.LIZIZ = 1;
    }

    public final C89333LHr LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C89333LHr) proxy.result;
        }
        try {
            return (C89333LHr) KM9.LIZ().fromJson(this.LJI, (Class<Object>) C89333LHr.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public C3471g(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.f26048LJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJIIIIZZ = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZJ == 0) {
                    this.LIZJ = -1L;
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f26048LJ == null) {
                    this.f26048LJ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = "";
                }
                if (this.LJII == null) {
                    this.LJII = "";
                }
                if (this.LJIIIIZZ == 0) {
                    this.LJIIIIZZ = -1L;
                }
                this.LIZIZ = 1;
                return;
            }
        }
    }

    public C3471g(long j, String str, String str2, String str3, String str4, String str5, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.LIZJ = j;
        this.LIZLLL = str;
        this.f26048LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = j2;
        this.LIZIZ = 1;
    }

    public /* synthetic */ C3471g(long j, String str, String str2, String str3, String str4, String str5, long j2, int i) {
        this(-1L, "", "", "", "", "", -1L);
    }
}
