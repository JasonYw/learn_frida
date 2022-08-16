package com.bytedance.android.live.broadcast.download.p262ai;

import com.bytedance.android.live.broadcast.api.gamepromote.GameStageType;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.download.ai.f */
/* loaded from: classes5.dex */
public final class C2999f implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    @SerializedName("game_id")
    public String LIZJ;
    @SerializedName("name")
    public String LIZLLL;
    @SerializedName("android_package_size")

    /* renamed from: LJ */
    public String f25817LJ;
    @SerializedName("tags")
    public List<String> LJFF;
    @SerializedName("android_package_name")
    public String LJI;
    @SerializedName("game_stage")
    public int LJII;

    static {
        Covode.recordClassIndex(15558);
    }

    public C2999f(String str, String str2, String str3, String str4, List<String> list, String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25817LJ = str4;
        this.LJFF = list;
        this.LJI = str5;
        this.LJII = i;
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25817LJ, this.LJFF, this.LJI, Integer.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2999f) {
            return C106862S5w.LIZ(((C2999f) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SimpleGameInfo:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C2999f() {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25817LJ = "";
        this.LJFF = new ArrayList();
        this.LJI = "";
        this.LJII = GameStageType.NONE.type;
    }

    public C2999f(C10532g c10532g) {
        this.LJFF = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            if (LIZIZ != 6) {
                                if (LIZIZ != 7) {
                                    QV1.LJII(c10532g);
                                } else {
                                    this.LJII = QV1.LIZIZ(c10532g);
                                }
                            } else {
                                this.LJI = QV1.LJFF(c10532g);
                            }
                        } else {
                            this.f25817LJ = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LJFF.add(QV1.LJFF(c10532g));
                    }
                } else {
                    this.LIZLLL = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZJ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f25817LJ == null) {
            this.f25817LJ = "";
        }
        if (this.LJFF.isEmpty()) {
            this.LJFF = new ArrayList();
        }
        if (this.LJI == null) {
            this.LJI = "";
        }
        if (this.LJII == 0) {
            this.LJII = GameStageType.NONE.type;
        }
    }
}
