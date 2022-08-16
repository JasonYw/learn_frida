package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.be$b;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.bk$b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C87906KkO;
import p003X.KM9;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.j */
/* loaded from: classes5.dex */
public final class C3380j implements AbstractC3379i, be$b, bk$b, C3LJ {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public C87906KkO LIZJ;
    @SerializedName("interact_type")
    public int LIZLLL;
    @SerializedName("title")

    /* renamed from: LJ */
    public String f26023LJ;
    @SerializedName("desc")
    public String LJFF;
    @SerializedName("icon")
    public ImageModel LJI;
    @SerializedName("group_id")
    public long LJII;
    @SerializedName("extra")
    public String LJIIIIZZ;
    @SerializedName("game_card_extra")
    public String LJIIIZ;
    public boolean LJIIJ;
    public C3383p LJIIJJI;

    static {
        Covode.recordClassIndex(19197);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "InteractEntranceCell(interactType=" + this.LIZLLL + ", title=" + this.f26023LJ + ", desc=" + this.LJFF + ", icon=" + this.LJI + ", groupType=" + this.LJII + ", extra=" + this.LJIIIIZZ + ", gameCardExtra=" + this.LJIIIZ + ")";
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.be$b
    /* renamed from: LJ */
    public final long mo15524LJ() {
        return this.LJII;
    }

    public C3380j() {
        this.LIZLLL = 0;
        this.f26023LJ = "";
        this.LJFF = "";
        this.LJI = null;
        this.LJII = 0L;
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LIZJ = new C87906KkO(false, 0, false, 7);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final C3383p LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C3383p) proxy.result;
        }
        return LJFF();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i
    public final List<Long> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C3383p LJFF = LJFF();
        if (LJFF != null) {
            return LJFF.LJLJL;
        }
        return null;
    }

    public final C3383p LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C3383p) proxy.result;
        }
        if (!this.LJIIJ) {
            LJIIIIZZ();
        }
        return this.LJIIJJI;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.be$b
    public final String LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return InteractID.Companion.LIZ(this.LIZLLL, this.f26023LJ, LJFF());
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.bk$b
    public final String LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!this.LIZJ.LIZLLL) {
            return String.valueOf(this.LIZLLL);
        }
        return LIZLLL();
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int hashCode = this.f26023LJ.hashCode() * 31;
        ImageModel imageModel = this.LJI;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.LJIIIIZZ;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported || this.LJIIJ) {
            return;
        }
        String str = this.LJIIIIZZ;
        if (str != null && str.length() != 0) {
            try {
                JsonElement parse = KM9.LIZJ().parse(this.LJIIIIZZ);
                Intrinsics.checkNotNullExpressionValue(parse, "");
                JsonObject asJsonObject = parse.getAsJsonObject();
                asJsonObject.addProperty("game_name", this.f26023LJ);
                asJsonObject.addProperty("anchor_audience_module_version", "1.0.0");
                asJsonObject.addProperty("anchor_live_version", (Number) 2560);
                this.LJIIJJI = (C3383p) KM9.LIZ().fromJson((JsonElement) asJsonObject, (Class<Object>) C3383p.class);
                C3383p c3383p = this.LJIIJJI;
                if (c3383p != null && this.LIZLLL == InteractID.EffectGame.value) {
                    asJsonObject.addProperty("game_identifier", Long.valueOf(c3383p.LJJIJIIJI));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.LJIIJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.live.broadcastgame.api.model.C3384q LJI() {
        /*
            r12 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.api.model.C3380j.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r12, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            com.bytedance.android.live.broadcastgame.api.model.q r0 = (com.bytedance.android.live.broadcastgame.api.model.C3384q) r0
            return r0
        L13:
            int r1 = r12.LIZLLL
            com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.OpenGame
            int r0 = r0.value
            r10 = 0
            java.lang.String r11 = ""
            if (r1 == r0) goto L5a
            int r1 = r12.LIZLLL
            com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.SonicMiniGame
            int r0 = r0.value
            if (r1 == r0) goto L5a
            com.bytedance.android.live.broadcastgame.api.model.q r2 = new com.bytedance.android.live.broadcastgame.api.model.q
            int r3 = r12.LIZLLL
            java.lang.String r4 = r12.f26023LJ
            if (r4 != 0) goto L2f
            r4 = r11
        L2f:
            com.bytedance.android.live.base.model.ImageModel r0 = r12.LJI
            if (r0 == 0) goto L37
            java.util.List<java.lang.String> r5 = r0.mUrls
            if (r5 != 0) goto L3c
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L3c:
            r6 = 0
            long r8 = r12.LJII
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto L48
            java.util.List<java.lang.Long> r10 = r0.LJLJL
        L48:
            java.lang.String r0 = r12.LJIIIIZZ
            if (r0 == 0) goto L4d
            r11 = r0
        L4d:
            r2.<init>(r3, r4, r5, r6, r8, r10, r11)
            X.KkO r0 = r12.LIZJ
            r2.LIZ(r0)
            boolean r0 = r12.LIZIZ
            r2.LIZLLL = r0
            return r2
        L5a:
            java.lang.String r0 = r12.LJIIIIZZ
            if (r0 == 0) goto L6c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = "game_card_extra"
            java.lang.String r0 = r12.LJIIIZ     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r1 = r10
        L6d:
            com.bytedance.android.live.broadcastgame.api.model.q r2 = new com.bytedance.android.live.broadcastgame.api.model.q
            int r3 = r12.LIZLLL
            java.lang.String r4 = r12.f26023LJ
            if (r4 != 0) goto L76
            r4 = r11
        L76:
            com.bytedance.android.live.base.model.ImageModel r0 = r12.LJI
            if (r0 == 0) goto L7e
            java.util.List<java.lang.String> r5 = r0.mUrls
            if (r5 != 0) goto L83
        L7e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L83:
            r6 = 0
            long r8 = r12.LJII
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto L8f
            java.util.List<java.lang.Long> r10 = r0.LJLJL
        L8f:
            if (r1 == 0) goto L98
            java.lang.String r0 = r1.toString()
            if (r0 == 0) goto L98
            r11 = r0
        L98:
            r2.<init>(r3, r4, r5, r6, r8, r10, r11)
            X.KkO r0 = r12.LIZJ
            r2.LIZ(r0)
            boolean r0 = r12.LIZIZ
            r2.LIZLLL = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.api.model.C3380j.LJI():com.bytedance.android.live.broadcastgame.api.model.q");
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        String str2 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if ((!Intrinsics.areEqual(cls2, cls)) || !(obj instanceof C3380j)) {
            return false;
        }
        C3380j c3380j = (C3380j) obj;
        if (!Intrinsics.areEqual(this.f26023LJ, c3380j.f26023LJ)) {
            return false;
        }
        ImageModel imageModel = this.LJI;
        if (imageModel != null) {
            str = imageModel.mUri;
        } else {
            str = null;
        }
        ImageModel imageModel2 = c3380j.LJI;
        if (imageModel2 != null) {
            str2 = imageModel2.mUri;
        }
        if (!(!Intrinsics.areEqual(str, str2)) && !(!Intrinsics.areEqual(LIZLLL(), c3380j.LIZLLL()))) {
            return true;
        }
        return false;
    }

    public C3380j(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            if (LIZIZ != 5) {
                                if (LIZIZ != 99) {
                                    if (LIZIZ != 100) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        this.LJIIIZ = QV1.LJFF(c10532g);
                                    }
                                } else {
                                    this.LJIIIIZZ = QV1.LJFF(c10532g);
                                }
                            } else {
                                this.LJII = QV1.LIZJ(c10532g);
                            }
                        } else {
                            this.LJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        }
                    } else {
                        this.LJFF = QV1.LJFF(c10532g);
                    }
                } else {
                    this.f26023LJ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZLLL = QV1.LIZIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZLLL == 0) {
            this.LIZLLL = 0;
        }
        if (this.f26023LJ == null) {
            this.f26023LJ = "";
        }
        if (this.LJFF == null) {
            this.LJFF = "";
        }
        if (this.LJI == null) {
            this.LJI = null;
        }
        if (this.LJII == 0) {
            this.LJII = 0L;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = "";
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = "";
        }
        this.LIZJ = new C87906KkO(false, 0, false, 7);
    }

    public C3380j(int i, String str, String str2, ImageModel imageModel, long j, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.LIZLLL = i;
        this.f26023LJ = str;
        this.LJFF = str2;
        this.LJI = imageModel;
        this.LJII = j;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LIZJ = new C87906KkO(false, 0, false, 7);
    }

    public /* synthetic */ C3380j(int i, String str, String str2, ImageModel imageModel, long j, String str3, String str4, int i2) {
        this(i, str, str2, imageModel, 1L, str3, "");
    }

    public static /* synthetic */ C3380j LIZ(C3380j c3380j, int i, String str, String str2, ImageModel imageModel, long j, String str3, String str4, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j, 0, null, null, null, new Long(j), null, null, 111, null}, null, LIZ, true, 12);
        if (proxy.isSupported) {
            return (C3380j) proxy.result;
        }
        int i3 = c3380j.LIZLLL;
        String str5 = c3380j.f26023LJ;
        String str6 = c3380j.LJFF;
        ImageModel imageModel2 = c3380j.LJI;
        String str7 = c3380j.LJIIIIZZ;
        String str8 = c3380j.LJIIIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i3), str5, str6, imageModel2, new Long(j), str7, str8}, c3380j, LIZ, false, 11);
        if (proxy2.isSupported) {
            return (C3380j) proxy2.result;
        }
        C106862S5w.LIZ(str5);
        return new C3380j(i3, str5, str6, imageModel2, j, str7, str8);
    }
}
