package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import android.view.View;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.p286d.AbstractC3354n;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.C3777c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractC88139Ko9;
import p003X.AbstractC88142KoC;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C87793KiZ;
import p003X.C87890Kk8;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.i */
/* loaded from: classes5.dex */
public final class C3763i extends AbstractC88142KoC<C3777c> {
    public static ChangeQuickRedirect LIZIZ;
    public final C3777c LIZJ;
    public final Lazy LIZLLL = C77347GeT.LIZ(C3755x3c81721d.INSTANCE);

    static {
        Covode.recordClassIndex(21345);
    }

    public C3763i(C3777c c3777c) {
        C106862S5w.LIZ(c3777c);
        this.LIZJ = c3777c;
    }

    @Override // p003X.AbstractC88142KoC
    public final void LIZJ(View view, C3355o c3355o) {
        Object mo27335getValue;
        Object LIZ;
        if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, c3355o);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LIZLLL.mo27335getValue();
        }
        C3764j c3764j = (C3764j) mo27335getValue;
        C3380j c3380j = c3355o.LJFF;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3764j, c3380j, null, 2, null}, null, AbstractC88139Ko9.LIZJ, true, 2);
        if (proxy2.isSupported) {
            LIZ = proxy2.result;
        } else {
            LIZ = c3764j.LIZ(c3380j, null);
        }
        AbstractC3354n abstractC3354n = (AbstractC3354n) LIZ;
        if (abstractC3354n != null) {
            abstractC3354n.LIZ(view, c3355o);
        } else {
            C87890Kk8.LIZ("behavior 为null，无法点击");
        }
        if (c3355o.LIZLLL == 2) {
            C3762g LJIIZILJ = this.LIZJ.LJIIZILJ();
            C3380j c3380j2 = c3355o.LJFF;
            if (!PatchProxy.proxy(new Object[]{c3380j2}, LJIIZILJ, C3762g.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(c3380j2);
                LJIIZILJ.LIZIZ.add(c3380j2);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3743d
    public final void LIZIZ(View view, C3355o c3355o) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, c3355o);
        String str3 = c3355o.LJFF.LJIIIIZZ;
        if (str3 == null || !(!StringsKt__StringsJVMKt.isBlank(str3)) || (str = new JSONObject(str3).optString(Constants.APP_ID)) == null) {
            str = "";
        }
        String LIZ = C87793KiZ.LIZ(c3355o.LJFF.LJII, c3355o.LJFF.LIZIZ);
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m137to("mp_id", str);
        pairArr[1] = TuplesKt.m137to("_param_for_special", BdpAppEventConstant.MICRO_APP);
        pairArr[2] = TuplesKt.m137to("enter_position", LIZ);
        pairArr[3] = TuplesKt.m137to("entrance_form", "solid_entrance");
        pairArr[4] = TuplesKt.m137to("enter_from_merge", "live_take_page");
        if (c3355o.LIZIZ) {
            str2 = "in_live";
        } else {
            str2 = "before_live";
        }
        pairArr[5] = TuplesKt.m137to("live_status", str2);
        C4574547f.LIZ().LIZ("mp_show", false, MapsKt__MapsKt.mutableMapOf(pairArr), new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r7 < r0) goto L43;
     */
    @Override // p003X.AbstractC88142KoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.live.broadcastgame.api.p286d.C3355o LIZIZ(com.bytedance.android.live.broadcastgame.api.model.C3380j r17, boolean r18, int r19) {
        /*
            r16 = this;
            r3 = r16
            r3 = r3
            r0 = 3
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 0
            r4 = r17
            r7[r6] = r4
            r5 = r18
            java.lang.Byte r0 = java.lang.Byte.valueOf(r5)
            r12 = 1
            r7[r12] = r0
            r2 = r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 2
            r7[r1] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3763i.LIZIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r7, r3, r0, r6, r1)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.result
            com.bytedance.android.live.broadcastgame.api.d.o r0 = (com.bytedance.android.live.broadcastgame.api.p286d.C3355o) r0
            return r0
        L2c:
            p003X.C106862S5w.LIZ(r4)
            java.lang.String r13 = r4.LIZLLL()
            com.bytedance.android.live.broadcastgame.api.d.o r9 = new com.bytedance.android.live.broadcastgame.api.d.o
            com.bytedance.android.live.base.model.ImageModel r1 = r4.LJI
            r0 = 0
            if (r1 == 0) goto L3e
            java.util.List r0 = r1.getUrls()
        L3e:
            if (r0 == 0) goto Lcc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lcc
            r0 = 0
        L47:
            java.lang.String r14 = ""
            if (r0 != 0) goto L55
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LJI
            if (r0 == 0) goto L55
            java.util.List r10 = r0.getUrls()
            if (r10 != 0) goto L59
        L55:
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r14)
        L59:
            java.lang.String r11 = r4.f26023LJ
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
            if (r0 == 0) goto Lca
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lca
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
            if (r0 == 0) goto Lca
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lca
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto Lca
            long r7 = r3.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
            if (r0 == 0) goto Lc4
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lc4
            long r0 = r0.LIZIZ
        L83:
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 <= 0) goto Lca
            long r7 = r3.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
            if (r0 == 0) goto Lc1
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lc1
            long r0 = r0.LIZJ
        L97:
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto Lca
        L9b:
            java.lang.String r0 = r4.LJFF
            if (r0 == 0) goto La0
            r14 = r0
        La0:
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9.LIZIZ = r5
            long r0 = r4.LJII
            r9.LJIIZILJ = r0
            r0 = 0
            r9.LJII = r0
            int r0 = r4.LIZLLL
            r9.LJIJ = r0
            com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.c r0 = r3.LIZJ
            X.Kkz r0 = r0.LJIILL()
            boolean r0 = r0.LIZIZ(r13)
            r9.LIZJ = r0
            r9.LIZLLL = r2
            return r9
        Lc1:
            r0 = -1
            goto L97
        Lc4:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L83
        Lca:
            r12 = 0
            goto L9b
        Lcc:
            r0 = 1
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3763i.LIZIZ(com.bytedance.android.live.broadcastgame.api.model.j, boolean, int):com.bytedance.android.live.broadcastgame.api.d.o");
    }
}
