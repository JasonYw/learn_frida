package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C87906KkO;
import p003X.KM9;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.q */
/* loaded from: classes5.dex */
public final class C3384q implements AbstractC3379i, C3LJ {
    public static ChangeQuickRedirect LIZ;
    public transient long LIZIZ;
    public C87906KkO LIZJ;
    public boolean LIZLLL;
    @SerializedName("interact_id")

    /* renamed from: LJ */
    public int f26027LJ;
    @SerializedName("name")
    public String LJFF;
    @SerializedName("icon_url")
    public List<String> LJI;
    @SerializedName("rank")
    public long LJII;
    @SerializedName("group_type")
    public long LJIIIIZZ;
    @SerializedName("support_live_entrance_list")
    public List<Long> LJIIIZ;
    @SerializedName("extra")
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public C3383p LJIILIIL;

    static {
        Covode.recordClassIndex(19204);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "InteractItem(interactId=" + this.f26027LJ + ", name=" + this.LJFF + ", iconUrl=" + this.LJI + ", rank=" + this.LJII + ", groupType=" + this.LJIIIIZZ + ", supportiveEntrance=" + this.LJIIIZ + ", extra=" + this.LJIIJ + ")";
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final int LIZ() {
        return this.f26027LJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final List<Long> LIZJ() {
        return this.LJIIIZ;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final C3383p LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C3383p) proxy.result;
        }
        return LJFF();
    }

    /* renamed from: LJ */
    public final String m15851LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!this.LJIIJJI) {
            LJI();
        }
        return this.LJIIL;
    }

    public final C3383p LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C3383p) proxy.result;
        }
        if (!this.LJIIJJI) {
            LJI();
        }
        return this.LJIILIIL;
    }

    public C3384q() {
        this.f26027LJ = InteractID.Unknown.value;
        this.LJFF = "";
        this.LJI = new ArrayList();
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = "";
        this.LIZJ = new C87906KkO(false, 0, false, 7);
    }

    public final String LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return InteractID.Companion.LIZ(this.f26027LJ, this.LJFF, LJFF());
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (((this.LJFF.hashCode() * 31) + this.LJI.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    private final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported || this.LJIIJJI) {
            return;
        }
        String str = this.LJIIJ;
        if (str != null && str.length() != 0) {
            try {
                JsonElement parse = KM9.LIZJ().parse(this.LJIIJ);
                Intrinsics.checkNotNullExpressionValue(parse, "");
                JsonObject asJsonObject = parse.getAsJsonObject();
                asJsonObject.addProperty("game_name", this.LJFF);
                asJsonObject.addProperty("anchor_audience_module_version", "1.0.0");
                asJsonObject.addProperty("anchor_live_version", (Number) 2560);
                this.LJIILIIL = (C3383p) KM9.LIZ().fromJson((JsonElement) asJsonObject, (Class<Object>) C3383p.class);
                C3383p c3383p = this.LJIILIIL;
                if (c3383p != null && this.f26027LJ == InteractID.EffectGame.value) {
                    asJsonObject.addProperty("game_identifier", Long.valueOf(c3383p.LJJIJIIJI));
                }
                this.LJIIL = asJsonObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.LJIIJJI = true;
    }

    public final void LIZ(C87906KkO c87906KkO) {
        if (PatchProxy.proxy(new Object[]{c87906KkO}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c87906KkO);
        this.LIZJ = c87906KkO;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            C3384q c3384q = (C3384q) obj;
            if (!(!Intrinsics.areEqual(this.LJFF, c3384q.LJFF)) && !(!Intrinsics.areEqual(this.LJI, c3384q.LJI)) && !(!Intrinsics.areEqual(LIZLLL(), c3384q.LIZLLL()))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.api.model.InteractItem");
    }

    public C3384q(C10532g c10532g) {
        List list;
        Object valueOf;
        this.LJI = new ArrayList();
        this.LJIIIZ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.f26027LJ = QV1.LIZIZ(c10532g);
                        continue;
                    case 2:
                        this.LJFF = QV1.LJFF(c10532g);
                        continue;
                    case 3:
                        list = this.LJI;
                        valueOf = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LJII = QV1.LIZJ(c10532g);
                        continue;
                    case 5:
                        this.LJIIIIZZ = QV1.LIZJ(c10532g);
                        continue;
                    case 6:
                        this.LJIIJ = QV1.LJFF(c10532g);
                        continue;
                    case 7:
                        list = this.LJIIIZ;
                        valueOf = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    default:
                        QV1.LJII(c10532g);
                        continue;
                }
                list.add(valueOf);
            } else {
                c10532g.LIZ(LIZ2);
                if (this.f26027LJ == 0) {
                    this.f26027LJ = InteractID.Unknown.value;
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI.isEmpty()) {
                    this.LJI = new ArrayList();
                }
                if (this.LJII == 0) {
                    this.LJII = 0L;
                }
                if (this.LJIIIIZZ == 0) {
                    this.LJIIIIZZ = 0L;
                }
                if (this.LJIIIZ.isEmpty()) {
                    this.LJIIIZ = new ArrayList();
                }
                if (this.LJIIJ == null) {
                    this.LJIIJ = "";
                }
                this.LIZJ = new C87906KkO(false, 0, false, 7);
                return;
            }
        }
    }

    public C3384q(int i, String str, List<String> list, long j, long j2, List<Long> list2, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f26027LJ = i;
        this.LJFF = str;
        this.LJI = list;
        this.LJII = j;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = list2;
        this.LJIIJ = str2;
        this.LIZJ = new C87906KkO(false, 0, false, 7);
    }

    public /* synthetic */ C3384q(int i, String str, List list, long j, long j2, List list2, String str2, int i2) {
        this(i, str, list, 0L, j2, new ArrayList(), str2);
    }
}
