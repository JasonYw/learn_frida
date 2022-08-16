package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3385r;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.C3776b;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6508ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ExtendedToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.be$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractC88139Ko9;
import p003X.AbstractC88140KoA;
import p003X.AbstractC88142KoC;
import p003X.AbstractC88150KoK;
import p003X.C106862S5w;
import p003X.C3BP;
import p003X.C3E3;
import p003X.C413202Xa;
import p003X.C415302c8;
import p003X.C441293cx;
import p003X.C4574547f;
import p003X.C87793KiZ;
import p003X.C87890Kk8;
import p003X.C88138Ko8;
import p003X.C88440Kt0;
import p003X.KW0;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.b */
/* loaded from: classes5.dex */
public final class C3756b extends AbstractC88142KoC<C3776b> {
    public static ChangeQuickRedirect LIZIZ;
    public List<String> LIZJ;
    public C88138Ko8 LIZLLL;

    /* renamed from: LJ */
    public final C3776b f26101LJ;
    public final C6508ci LJFF;
    public final Lazy LJI;

    static {
        Covode.recordClassIndex(21330);
    }

    private final AbstractC88140KoA<C3355o, C3380j, AbstractC6524y.AbstractView$OnClickListenerC6525b> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (AbstractC88140KoA) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // p003X.AbstractC88142KoC, com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3742c
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        C88138Ko8 c88138Ko8 = this.LIZLLL;
        if (c88138Ko8 != null && !PatchProxy.proxy(new Object[0], c88138Ko8, AbstractC88139Ko9.LIZJ, false, 3).isSupported) {
            c88138Ko8.LIZLLL.clear();
        }
        AbstractC88140KoA<C3355o, C3380j, AbstractC6524y.AbstractView$OnClickListenerC6525b> LIZJ = LIZJ();
        if (!PatchProxy.proxy(new Object[0], LIZJ, AbstractC88140KoA.LIZJ, false, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[0], LIZJ, AbstractC88140KoA.LIZJ, false, 4).isSupported) {
                for (Map.Entry<be$a, Pair<C3355o, AbstractC6524y.AbstractView$OnClickListenerC6525b>> entry : LIZJ.LIZLLL.entrySet()) {
                    C3355o first = entry.getValue().getFirst();
                    AbstractC6524y.AbstractView$OnClickListenerC6525b second = entry.getValue().getSecond();
                    if (!PatchProxy.proxy(new Object[]{first, second}, LIZJ, AbstractC88140KoA.LIZJ, false, 3).isSupported) {
                        C106862S5w.LIZ(first, second);
                        C413202Xa.LIZIZ().LIZIZ(first, second);
                    }
                }
            }
            LIZJ.LIZLLL.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.b$b */
    /* loaded from: classes5.dex */
    public final class C3757b extends AbstractC88140KoA<C3355o, C3380j, AbstractC6524y.AbstractView$OnClickListenerC6525b> {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(21332);
        }

        public C3757b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // p003X.AbstractC88140KoA
        /* renamed from: LIZ  reason: avoid collision after fix types in other method */
        public void LIZJ(C3380j c3380j) {
            C88138Ko8 c88138Ko8;
            AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ2;
            if (PatchProxy.proxy(new Object[]{c3380j}, this, LIZ, false, 4).isSupported) {
                return;
            }
            C106862S5w.LIZ(c3380j);
            C88138Ko8 c88138Ko82 = C3756b.this.LIZLLL;
            if (c88138Ko82 != null && (c88138Ko8 = C3756b.this.LIZLLL) != null && (LIZ2 = c88138Ko8.LIZ(c3380j)) != null) {
                c88138Ko82.LIZ(c3380j, (C3385r) null, LIZ2);
            }
        }

        @Override // p003X.AbstractC88140KoA
        public final /* synthetic */ AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ(C3380j c3380j) {
            C3380j c3380j2 = c3380j;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j2}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
            }
            C106862S5w.LIZ(c3380j2);
            C88138Ko8 c88138Ko8 = C3756b.this.LIZLLL;
            if (c88138Ko8 != null) {
                return c88138Ko8.LIZ(c3380j2);
            }
            return null;
        }

        @Override // p003X.AbstractC88140KoA
        public final /* synthetic */ C3355o LIZIZ(C3380j c3380j) {
            List<String> list;
            List<String> listOf;
            ImageModel imageModel;
            C3380j c3380j2 = c3380j;
            boolean z = false;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j2}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return (C3355o) proxy.result;
            }
            C106862S5w.LIZ(c3380j2);
            ImageModel imageModel2 = c3380j2.LJI;
            if (imageModel2 != null) {
                list = imageModel2.getUrls();
            } else {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                z = true;
            }
            if (z || (imageModel = c3380j2.LJI) == null || (listOf = imageModel.getUrls()) == null) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf("");
            }
            String str = c3380j2.f26023LJ;
            boolean LIZ2 = C3756b.this.LIZ(c3380j2);
            String LIZLLL = c3380j2.LIZLLL();
            String str2 = c3380j2.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            C3355o c3355o = new C3355o(listOf, str, LIZ2, LIZLLL, str2, c3380j2);
            c3355o.LIZIZ = true;
            c3355o.LJIIZILJ = c3380j2.LJII;
            c3355o.LJIJ = c3380j2.LIZLLL;
            c3355o.LIZJ = C3756b.this.f26101LJ.LJIILL().LIZIZ(c3355o.LJJIFFI);
            c3355o.LIZLLL = c3380j2.LIZJ.LIZJ;
            C3756b.this.LIZ(c3355o);
            return c3355o;
        }

        @Override // p003X.AbstractC88140KoA
        public final /* synthetic */ C3355o LIZ(C3380j c3380j, C3355o c3355o) {
            List<String> list;
            boolean z;
            List<String> listOf;
            ImageModel imageModel;
            C3380j c3380j2 = c3380j;
            C3355o c3355o2 = c3355o;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j2, c3355o2}, this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (C3355o) proxy.result;
            }
            C106862S5w.LIZ(c3380j2, c3355o2);
            ImageModel imageModel2 = c3380j2.LJI;
            if (imageModel2 != null) {
                list = imageModel2.getUrls();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z || (imageModel = c3380j2.LJI) == null || (listOf = imageModel.getUrls()) == null) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf("");
            }
            c3355o2.LIZ(listOf);
            c3355o2.LIZIZ(c3380j2.f26023LJ);
            c3355o2.LJJI = C3756b.this.LIZ(c3380j2);
            String str = c3380j2.LJFF;
            if (str == null) {
                str = "";
            }
            if (!PatchProxy.proxy(new Object[]{str}, c3355o2, C3355o.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(str);
                c3355o2.f26015LJ = str;
            }
            if (!PatchProxy.proxy(new Object[]{c3380j2}, c3355o2, C3355o.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(c3380j2);
                c3355o2.LJFF = c3380j2;
            }
            c3355o2.LIZIZ = true;
            c3355o2.LJIIZILJ = c3380j2.LJII;
            c3355o2.LJIJ = c3380j2.LIZLLL;
            c3355o2.LIZJ = C3756b.this.f26101LJ.LJIILL().LIZIZ(c3380j2.LIZLLL());
            c3355o2.LIZLLL = c3380j2.LIZJ.LIZJ;
            C3756b.this.LIZ(c3355o2);
            return c3355o2;
        }
    }

    public final void LIZ(ExtendedToolbarButton extendedToolbarButton) {
        if (PatchProxy.proxy(new Object[]{extendedToolbarButton}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        List<String> list = this.LIZJ;
        if (list != null) {
            if (list.contains(extendedToolbarButton.LIZLLL())) {
                extendedToolbarButton.LIZ(ExtendedToolbarButton.HighLightMode.TRUE);
                list.remove(extendedToolbarButton.LIZLLL());
                return;
            }
            extendedToolbarButton.LIZ(ExtendedToolbarButton.HighLightMode.FALSE);
            return;
        }
        extendedToolbarButton.LIZ(ExtendedToolbarButton.HighLightMode.DISABLE);
    }

    public C3756b(C3776b c3776b) {
        Function2<C3380j, C3385r, AbstractC6524y.AbstractView$OnClickListenerC6525b> LJIIIZ;
        Context LJIIIIZZ;
        AbstractC88150KoK abstractC88150KoK;
        DataCenter LJII;
        C106862S5w.LIZ(c3776b);
        this.f26101LJ = c3776b;
        C415302c8 LIZIZ2 = C413202Xa.LIZIZ();
        if (LIZIZ2 != null) {
            this.LJFF = LIZIZ2;
            AbstractC88150KoK abstractC88150KoK2 = this.f26101LJ.LJIIZILJ;
            if (abstractC88150KoK2 != null && (LJIIIZ = abstractC88150KoK2.LJIIIZ()) != null) {
                C88138Ko8 c88138Ko8 = new C88138Ko8(LJIIIZ);
                AbstractC88150KoK abstractC88150KoK3 = this.f26101LJ.LJIIZILJ;
                if (abstractC88150KoK3 != null && (LJIIIIZZ = abstractC88150KoK3.LJIIIIZZ()) != null && (abstractC88150KoK = this.f26101LJ.LJIIZILJ) != null && (LJII = abstractC88150KoK.LJII()) != null) {
                    c88138Ko8.LIZIZ = new C3385r(LJIIIIZZ, LJII, this.LJFF);
                }
                this.LIZLLL = c88138Ko8;
            }
            this.LJI = LazyKt__LazyJVMKt.lazy(new LiveOpenFeatureIconBehaviorController$openFeatureIconLoader$2(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r9 >= r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
        if (r9 >= r0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZ(com.bytedance.android.live.broadcastgame.api.model.C3380j r12) {
        /*
            r11 = this;
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r6 = 0
            r2[r6] = r12
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3756b.LIZIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r11, r1, r6, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            com.bytedance.android.live.broadcastgame.api.model.p r1 = r12.LJFF()
            r0 = 0
            if (r1 == 0) goto L23
            X.KoD r0 = r1.LJJIIJZLJL
        L23:
            r4 = -1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L54
            long r9 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Ld4
            X.KoD r0 = r0.LJJIIJZLJL
            if (r0 == 0) goto Ld4
            long r0 = r0.LIZJ
        L3c:
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L54
            long r9 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Ld0
            X.KoD r0 = r0.LJJIIJZLJL
            if (r0 == 0) goto Ld0
            long r0 = r0.LIZLLL
        L50:
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 < 0) goto Lc6
        L54:
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto L86
            X.KoE r0 = r0.LJJIIZ
            if (r0 == 0) goto L86
            long r9 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Lca
            X.KoE r0 = r0.LJJIIZ
            if (r0 == 0) goto Lca
            long r0 = r0.LIZJ
        L6e:
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L86
            long r9 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Lc7
            X.KoE r0 = r0.LJJIIZ
            if (r0 == 0) goto Lc7
            long r0 = r0.LIZLLL
        L82:
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 < 0) goto Lc6
        L86:
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Ldb
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Ldb
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Ldb
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Ldb
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto Ldb
            long r8 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Lae
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lae
            long r2 = r0.LIZIZ
        Lae:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ldb
            long r1 = r11.LIZIZ()
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r12.LJFF()
            if (r0 == 0) goto Lc2
            X.KoF r0 = r0.LJJIIZI
            if (r0 == 0) goto Lc2
            long r4 = r0.LIZJ
        Lc2:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto Ldb
        Lc6:
            return r7
        Lc7:
            r0 = -1
            goto L82
        Lca:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L6e
        Ld0:
            r0 = -1
            goto L50
        Ld4:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L3c
        Ldb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3756b.LIZ(com.bytedance.android.live.broadcastgame.api.model.j):boolean");
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3743d
    public final void LIZIZ(View view, C3355o c3355o) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, c3355o);
        C415302c8 LIZIZ2 = C413202Xa.LIZIZ();
        if (!(LIZIZ2 instanceof C6508ci)) {
            LIZIZ2 = null;
        }
        if (LIZIZ2 != null) {
            Map<ExtendedToolbarButton, View> map = LIZIZ2.LJFF;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(c3355o, view);
            LIZIZ2.LIZ(c3355o, view);
            if (c3355o.LJFF.LIZLLL == InteractID.OpenMicroApp.value) {
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
        }
    }

    @Override // p003X.AbstractC88142KoC
    public final void LIZJ(View view, C3355o c3355o) {
        AbstractC6524y.AbstractView$OnClickListenerC6525b abstractView$OnClickListenerC6525b;
        boolean contains;
        int i;
        if (PatchProxy.proxy(new Object[]{view, c3355o}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, c3355o);
        C3E3.LIZIZ(c3355o.LIZJ());
        View findViewById = view.findViewById(2131187532);
        if (!PatchProxy.proxy(new Object[]{findViewById, c3355o}, this, LIZIZ, false, 4).isSupported && findViewById != null) {
            if (c3355o.LJJI && !C3E3.LIZ(c3355o.LIZJ())) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
        if (this.LJFF.LIZLLL(c3355o)) {
            String mo15520LJ = this.LJFF.mo15520LJ(c3355o);
            if (!TextUtils.isEmpty(mo15520LJ)) {
                C88440Kt0.LIZ(mo15520LJ);
                return;
            }
            return;
        }
        AbstractC6524y.AbstractView$OnClickListenerC6525b LJFF = this.LJFF.LJFF(c3355o);
        String str = null;
        if (!(LJFF instanceof C3BP)) {
            abstractView$OnClickListenerC6525b = null;
        } else {
            abstractView$OnClickListenerC6525b = LJFF;
        }
        C3BP c3bp = (C3BP) abstractView$OnClickListenerC6525b;
        if (c3bp != null) {
            c3bp.LIZIZ(c3355o.LJFF.LJI());
        }
        if (LJFF != null) {
            KW0.LIZIZ.LIZ(c3355o.LJFF.LJI());
            LJFF.onClick(view);
            C441293cx c441293cx = InteractID.Companion;
            InteractID LIZ = c441293cx.LIZ(c3355o.LJIJ);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ}, c441293cx, C441293cx.LIZ, false, 8);
            if (proxy.isSupported) {
                contains = ((Boolean) proxy.result).booleanValue();
            } else {
                C106862S5w.LIZ(LIZ);
                contains = SetsKt__SetsKt.setOf((Object[]) new InteractID[]{InteractID.EffectGame, InteractID.DrawSth, InteractID.OpenGame, InteractID.OpenMicroApp, InteractID.SonicMiniGame}).contains(LIZ);
            }
            if (!contains) {
                this.f26101LJ.LJI();
                return;
            }
            C3384q currentPlayingGame = ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).getCurrentPlayingGame();
            if (currentPlayingGame != null) {
                str = currentPlayingGame.LIZLLL();
            }
            if (Intrinsics.areEqual(str, c3355o.LJJIFFI)) {
                this.f26101LJ.LJI();
                return;
            }
            return;
        }
        C87890Kk8.LIZ("behavior 为 null，无法点击");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.AbstractC88142KoC
    public final C3355o LIZIZ(C3380j c3380j, boolean z, int i) {
        ExtendedToolbarButton LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (C3355o) proxy.result;
        }
        C106862S5w.LIZ(c3380j);
        AbstractC88140KoA<C3355o, C3380j, AbstractC6524y.AbstractView$OnClickListenerC6525b> LIZJ = LIZJ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3380j}, LIZJ, AbstractC88140KoA.LIZJ, false, 1);
        if (proxy2.isSupported) {
            LIZIZ2 = (ExtendedToolbarButton.C6484c) proxy2.result;
        } else {
            C106862S5w.LIZ(c3380j);
            final String LIZLLL = c3380j.LIZLLL();
            final long mo15524LJ = c3380j.mo15524LJ();
            Object obj = new Object(LIZLLL, mo15524LJ) { // from class: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.be$a
                public static ChangeQuickRedirect LIZ;
                public final String LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(41661);
                }

                private Object[] LIZ() {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
                    return proxy3.isSupported ? (Object[]) proxy3.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ)};
                }

                public final boolean equals(Object obj2) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 4);
                    if (proxy3.isSupported) {
                        return ((Boolean) proxy3.result).booleanValue();
                    }
                    if (this == obj2) {
                        return true;
                    }
                    if (obj2 instanceof be$a) {
                        return C106862S5w.LIZ(((be$a) obj2).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                    return proxy3.isSupported ? ((Integer) proxy3.result).intValue() : Objects.hash(LIZ());
                }

                public final String toString() {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
                    return proxy3.isSupported ? (String) proxy3.result : C106862S5w.LIZ("NetworkIconToolbarLoader$Key:%s,%s", LIZ());
                }

                {
                    C106862S5w.LIZ(LIZLLL);
                    this.LIZIZ = LIZLLL;
                    this.LIZJ = mo15524LJ;
                }
            };
            if (LIZJ.LIZLLL.containsKey(obj)) {
                LIZJ.LIZJ(c3380j);
                Pair<C3355o, AbstractC6524y.AbstractView$OnClickListenerC6525b> pair = LIZJ.LIZLLL.get(obj);
                Intrinsics.checkNotNull(pair);
                LIZIZ2 = LIZJ.LIZ(c3380j, pair.getFirst());
            } else {
                LIZIZ2 = LIZJ.LIZIZ(c3380j);
                AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ = LIZJ.LIZ(c3380j);
                if (LIZ != null) {
                    if (!PatchProxy.proxy(new Object[]{LIZIZ2, LIZ}, LIZJ, AbstractC88140KoA.LIZJ, false, 2).isSupported) {
                        C106862S5w.LIZ(LIZIZ2, LIZ);
                        C413202Xa.LIZIZ().LIZ(LIZIZ2, LIZ);
                    }
                    LIZJ.LIZLLL.put(obj, new Pair(LIZIZ2, LIZ));
                }
            }
        }
        return (C3355o) LIZIZ2;
    }
}
