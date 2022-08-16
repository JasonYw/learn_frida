package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcastgame.api.model.C3371aa;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.p282a.C3327c;
import com.bytedance.android.live.broadcastgame.opengame.network.C3559c;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.TrackMiniCardService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC87170KWm;
import p003X.C106862S5w;
import p003X.C1KL;
import p003X.C1L9;
import p003X.C2WD;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87793KiZ;
import p003X.C87804Kik;
import p003X.C87811Kir;
import p003X.C87819Kiz;
import p003X.C87838KjI;
import p003X.C87851KjV;
import p003X.C87853KjX;
import p003X.C87885Kk3;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.c */
/* loaded from: classes5.dex */
public final class C3796c extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public PageDataV2 LIZJ;
    public PageDataV2 LIZLLL;

    /* renamed from: LJ */
    public Pair<C8733af, C3561g> f26110LJ;
    public final /* synthetic */ C87549Ked LJIILIIL = new C87549Ked();
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$customTitle$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$customCover$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$cardInfo$2.INSTANCE);
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$showCardSwitch$2.INSTANCE);
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$loadingStatus$2.INSTANCE);
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$hasChangePermission$2.INSTANCE);
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(new CardSettingViewModel$canChangeCover$2(this));
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$reviewStatus$2.INSTANCE);
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(CardSettingViewModel$saveRs$2.INSTANCE);

    static {
        Covode.recordClassIndex(21610);
    }

    public final C1KL<String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIILIIL.LIZ(disposable);
    }

    public final C1KL<String> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final C1KL<Pair<C8733af, C3561g>> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final C1KL<Boolean> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    /* renamed from: LJ */
    public final C1KL<Boolean> m15833LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public final C1KL<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    public final Boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (Boolean) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    public final C1KL<PageDataV2.ReviewStatus> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C1KL) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    public final void LIZ(String str) {
        String str2;
        String str3;
        Disposable subscribe;
        C87838KjI c87838KjI;
        String str4;
        PageDataV2.C3362b c3362b;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ((C1KL<C1KL<Boolean>>) m15833LJ(), (C1KL<Boolean>) Boolean.TRUE);
        PageDataV2 pageDataV2 = this.LIZJ;
        String str5 = "";
        if (pageDataV2 == null || (c3362b = pageDataV2.f26017LJ) == null || (str2 = c3362b.LJFF) == null) {
            str2 = str5;
        }
        C87819Kiz c87819Kiz = C87819Kiz.LIZIZ;
        PageDataV2 pageDataV22 = this.LIZJ;
        if (pageDataV22 == null || (str3 = pageDataV22.LIZIZ()) == null) {
            str3 = "小程序";
        }
        PageDataV2 pageDataV23 = this.LIZJ;
        if (pageDataV23 != null && (c87838KjI = pageDataV23.LIZIZ) != null && (str4 = c87838KjI.LIZIZ) != null) {
            str5 = str4;
        }
        Observable<AbstractC100834PnQ<C3559c>> LIZ2 = c87819Kiz.LIZ(str, str2, str3, str5);
        if (LIZ2 == null || (subscribe = LIZ2.subscribe(new C87851KjV(this), new C87853KjX(this))) == null) {
            return;
        }
        LIZ(subscribe);
    }

    public final boolean LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 26);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : !C87811Kir.LJI.LIZ(str, str2);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        super.onCleared();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            this.LJIILIIL.LIZ();
        }
    }

    public final String LIZ(C3561g c3561g) {
        C87885Kk3 c87885Kk3;
        String str;
        String LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3561g}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        PageDataV2 pageDataV2 = this.LIZJ;
        if (pageDataV2 != null && (LIZIZ = pageDataV2.LIZIZ()) != null && (!StringsKt__StringsJVMKt.isBlank(LIZIZ))) {
            PageDataV2 pageDataV22 = this.LIZJ;
            if (pageDataV22 == null || (str = pageDataV22.LIZIZ()) == null) {
                return "";
            }
        } else if (c3561g == null || (c87885Kk3 = c3561g.f26070LJ) == null || (str = c87885Kk3.LIZJ) == null) {
            return "";
        }
        return str;
    }

    public final void LIZ(C8733af c8733af) {
        C3561g c3561g;
        C3561g c3561g2;
        if (PatchProxy.proxy(new Object[]{c8733af}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C3561g c3561g3 = null;
        if (c8733af != null) {
            c3561g = C87811Kir.LJI.LIZ(c8733af);
        } else {
            c3561g = null;
        }
        this.f26110LJ = new Pair<>(c8733af, c3561g);
        C1KL<String> LIZIZ = LIZIZ();
        Pair<C8733af, C3561g> pair = this.f26110LJ;
        if (pair != null) {
            c3561g2 = pair.getSecond();
        } else {
            c3561g2 = null;
        }
        LIZ((C1KL<C1KL<String>>) LIZIZ, (C1KL<String>) LIZ(c3561g2, false));
        C1KL<String> LIZ2 = LIZ();
        Pair<C8733af, C3561g> pair2 = this.f26110LJ;
        if (pair2 != null) {
            c3561g3 = pair2.getSecond();
        }
        LIZ((C1KL<C1KL<String>>) LIZ2, (C1KL<String>) LIZ(c3561g3));
        LIZ((C1KL<C1KL<Pair<C8733af, C3561g>>>) LIZJ(), (C1KL<Pair<C8733af, C3561g>>) this.f26110LJ);
    }

    public final <T> void LIZ(C1KL<T> c1kl, T t) {
        if (PatchProxy.proxy(new Object[]{c1kl, t}, this, LIZ, false, 29).isSupported) {
            return;
        }
        c1kl.LIZ((ViewModel) this, (C3796c) t);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String LIZ(com.bytedance.android.live.broadcastgame.opengame.network.C3561g r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            r2[r4] = r7
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0 = 1
            r2[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3796c.LIZ
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.result
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1e:
            java.lang.String r5 = ""
            r3 = 0
            if (r8 != 0) goto Lc1
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lbe
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r1 = r0.LJII
        L29:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r0 = com.bytedance.android.live.broadcastgame.api.model.PageDataV2.ReviewStatus.REVIEW_UNKNOWN
            if (r1 != r0) goto Lc1
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lbb
            X.KjI r0 = r0.LIZJ
            if (r0 == 0) goto Lbb
            java.lang.String r1 = r0.LIZJ
        L37:
            if (r1 == 0) goto L3f
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto L53
        L3f:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lb9
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r2 = r0.LJII
        L45:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r0 = com.bytedance.android.live.broadcastgame.api.model.PageDataV2.ReviewStatus.REVIEW_PASS
            if (r2 != r0) goto L53
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lb7
            X.KjI r0 = r0.LIZJ
            if (r0 == 0) goto Lb7
            java.lang.String r1 = r0.LIZJ
        L53:
            if (r1 == 0) goto L5b
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto L6f
        L5b:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lb5
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r2 = r0.LJII
        L61:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2$ReviewStatus r0 = com.bytedance.android.live.broadcastgame.api.model.PageDataV2.ReviewStatus.REVIEW_UNKNOWN
            if (r2 != r0) goto L6f
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lb3
            X.KjI r0 = r0.LJIIIIZZ
            if (r0 == 0) goto Lb3
            java.lang.String r1 = r0.LIZJ
        L6f:
            if (r1 == 0) goto L77
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto L89
        L77:
            if (r7 == 0) goto L89
            com.bytedance.android.live.base.model.ImageModel r0 = r7.LIZLLL
            if (r0 == 0) goto Lb1
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto Lb1
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
        L89:
            if (r1 == 0) goto L91
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto L9c
        L91:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto L9b
            X.KjI r0 = r0.LJIIIZ
            if (r0 == 0) goto L9b
            java.lang.String r3 = r0.LIZJ
        L9b:
            r1 = r3
        L9c:
            if (r1 == 0) goto La4
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 == 0) goto Lc4
        La4:
            com.bytedance.android.live.broadcastgame.api.model.PageDataV2 r0 = r6.LIZJ
            if (r0 == 0) goto Lb0
            X.KjI r0 = r0.LIZIZ
            if (r0 == 0) goto Lb0
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto Lc4
        Lb0:
            return r5
        Lb1:
            r1 = r3
            goto L89
        Lb3:
            r1 = r3
            goto L6f
        Lb5:
            r2 = r3
            goto L61
        Lb7:
            r1 = r3
            goto L53
        Lb9:
            r2 = r3
            goto L45
        Lbb:
            r1 = r3
            goto L37
        Lbe:
            r1 = r3
            goto L29
        Lc1:
            r1 = r5
            goto L37
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3796c.LIZ(com.bytedance.android.live.broadcastgame.opengame.network.g, boolean):java.lang.String");
    }

    public final void LIZIZ(long j, String str) {
        String str2;
        String str3;
        String str4;
        PageDataV2.C3362b c3362b;
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C87804Kik c87804Kik = TrackMiniCardService.LJI;
        PageDataV2 pageDataV2 = this.LIZJ;
        String str5 = null;
        if (pageDataV2 != null && (c3362b = pageDataV2.f26017LJ) != null) {
            str2 = c3362b.LIZIZ;
        } else {
            str2 = null;
        }
        if (!PatchProxy.proxy(new Object[]{new Long(j), str, str2}, c87804Kik, C87804Kik.LIZ, false, 8).isSupported) {
            C106862S5w.LIZ(str);
            C4574547f LIZ2 = C4574547f.LIZ();
            Map<String, String> LIZ3 = TrackCommonService.LIZJ.LIZ();
            IUser LIZ4 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            LIZ3.put("anchor_id", String.valueOf(LIZ4.getId()));
            LIZ3.put("room_id", String.valueOf(j));
            if (j == -1) {
                str3 = "before_live";
            } else {
                str3 = "in_live";
            }
            LIZ3.put("live_status", str3);
            C1L9 LIZJ = C87811Kir.LJI.LIZJ();
            if (LIZJ != null) {
                str5 = LIZJ.LIZIZ;
            }
            if (Intrinsics.areEqual(str, str5)) {
                str4 = "change";
            } else {
                str4 = "add_new";
            }
            LIZ3.put("add_type", str4);
            LIZ3.put("page_path", String.valueOf(str2));
            LIZ2.LIZ("livesdk_small_program_giveup_reminder", LIZ3, Room.class);
        }
    }

    public final void LIZ(long j, String str) {
        String str2;
        PageDataV2 pageDataV2;
        C87838KjI c87838KjI;
        C87838KjI c87838KjI2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        C2WD<C3371aa> LJJII;
        C3371aa LIZ2;
        String str11;
        long j2;
        boolean z;
        String str12;
        String str13;
        String str14;
        PageDataV2.C3362b c3362b;
        PageDataV2.C3362b c3362b2;
        PageDataV2.C3362b c3362b3;
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        PageDataV2 pageDataV22 = this.LIZJ;
        if (pageDataV22 == null || (c3362b3 = pageDataV22.f26017LJ) == null || (str2 = c3362b3.LIZIZ) == null) {
            str2 = "";
        }
        String str15 = "1";
        if (!LIZ(str, str2)) {
            C87804Kik c87804Kik = TrackMiniCardService.LJI;
            PageDataV2 pageDataV23 = this.LIZJ;
            if (pageDataV23 == null || (c3362b2 = pageDataV23.f26017LJ) == null || (str6 = c3362b2.LIZIZ) == null) {
                str6 = "";
            }
            PageDataV2 pageDataV24 = this.LIZJ;
            if (pageDataV24 == null || (c3362b = pageDataV24.f26017LJ) == null || (str7 = c3362b.LJIIIIZZ) == null) {
                str7 = "";
            }
            if (!PatchProxy.proxy(new Object[]{new Long(j), str, str6, str7}, c87804Kik, C87804Kik.LIZ, false, 9).isSupported) {
                C106862S5w.LIZ(str, str6, str7);
                Uri parse = Uri.parse(str6);
                Intrinsics.checkNotNullExpressionValue(parse, "");
                String path = parse.getPath();
                String valueOf = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
                String str16 = "add_new";
                if (j == -1) {
                    if (C87811Kir.LIZLLL() != null) {
                        C1L9 LIZJ = C87811Kir.LJI.LIZJ();
                        if (LIZJ != null) {
                            str14 = LIZJ.LIZIZ;
                        } else {
                            str14 = null;
                        }
                        if (Intrinsics.areEqual(str, str14)) {
                            str16 = "change_page";
                        } else {
                            str16 = "change_mp";
                        }
                    }
                    C4574547f LIZ3 = C4574547f.LIZ();
                    HashMap hashMap = new HashMap();
                    hashMap.put("program_id", str);
                    C3384q m23465LJ = C87811Kir.m23465LJ();
                    if (m23465LJ == null || (str11 = m23465LJ.LJFF) == null) {
                        str11 = "";
                    }
                    hashMap.put("program_name", str11);
                    hashMap.put("anchor_id", valueOf);
                    hashMap.put("room_id", "");
                    hashMap.put("live_status", "before_live");
                    hashMap.put("add_type", str16);
                    hashMap.put("page_path", str6);
                    C3384q m23465LJ2 = C87811Kir.m23465LJ();
                    if (m23465LJ2 != null) {
                        j2 = m23465LJ2.LJIIIIZZ;
                    } else {
                        j2 = 0;
                    }
                    C3384q m23465LJ3 = C87811Kir.m23465LJ();
                    if (m23465LJ3 != null) {
                        z = m23465LJ3.LIZLLL;
                    } else {
                        z = false;
                    }
                    hashMap.put("mp_position", C87793KiZ.LIZ(j2, z));
                    PageDataV2 LIZ4 = C87811Kir.LIZ();
                    if (LIZ4 == null || !LIZ4.LJIIJJI) {
                        str12 = "0";
                    } else {
                        str12 = str15;
                    }
                    hashMap.put("is_auto", str12);
                    if (str7.length() == 0 || !Intrinsics.areEqual(str7, path)) {
                        str13 = "0";
                    } else {
                        str13 = str15;
                    }
                    hashMap.put("if_change_home_page", str13);
                    LIZ3.LIZ("livesdk_live_small_program_add", hashMap, Room.class);
                } else {
                    C4574547f LIZ5 = C4574547f.LIZ();
                    Map<String, String> LIZ6 = TrackCommonService.LIZJ.LIZ();
                    LIZ6.put("anchor_id", valueOf);
                    LIZ6.put("room_id", String.valueOf(j));
                    LIZ6.put("live_status", "in_live");
                    if (C87811Kir.LIZ() != null) {
                        str16 = "change_page";
                    }
                    LIZ6.put("add_type", str16);
                    LIZ6.put("page_path", str6);
                    AbstractC87170KWm LIZ7 = AbstractC87170KWm.LJI.LIZ();
                    if (LIZ7 == null || (LJJII = LIZ7.LJJII()) == null || (LIZ2 = LJJII.LIZ()) == null || (str8 = LIZ2.LIZIZ) == null) {
                        str8 = "";
                    }
                    LIZ6.put("mp_position", str8);
                    PageDataV2 LIZ8 = C87811Kir.LIZ();
                    if (LIZ8 == null || !LIZ8.LJIIJJI) {
                        str9 = "0";
                    } else {
                        str9 = str15;
                    }
                    LIZ6.put("is_auto", str9);
                    if (str7.length() == 0 || !Intrinsics.areEqual(str7, path)) {
                        str10 = "0";
                    } else {
                        str10 = str15;
                    }
                    LIZ6.put("if_change_home_page", str10);
                    LIZ5.LIZ("livesdk_live_small_program_add", LIZ6, Room.class);
                }
            }
        }
        PageDataV2 pageDataV25 = this.LIZJ;
        if (pageDataV25 != null) {
            pageDataV2 = pageDataV25.LIZ();
        } else {
            pageDataV2 = null;
        }
        C87811Kir.LIZ(pageDataV2);
        C87010KQi.LIZ().LIZ(new C3327c(true));
        C87804Kik c87804Kik2 = TrackMiniCardService.LJI;
        PageDataV2 pageDataV26 = this.LIZJ;
        PageDataV2 pageDataV27 = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{pageDataV26, pageDataV27}, c87804Kik2, C87804Kik.LIZ, false, 6).isSupported) {
            if (pageDataV26 != null) {
                c87838KjI = pageDataV26.LIZJ;
            } else {
                c87838KjI = null;
            }
            if (pageDataV27 != null) {
                c87838KjI2 = pageDataV27.LIZJ;
            } else {
                c87838KjI2 = null;
            }
            int i = !Intrinsics.areEqual(c87838KjI, c87838KjI2) ? 1 : 0;
            if (pageDataV26 != null) {
                str3 = pageDataV26.LIZLLL;
            } else {
                str3 = null;
            }
            if (pageDataV27 != null) {
                str4 = pageDataV27.LIZLLL;
            } else {
                str4 = null;
            }
            int i2 = !Intrinsics.areEqual(str3, str4) ? 1 : 0;
            C4574547f LIZ9 = C4574547f.LIZ();
            Map<String, String> LIZ10 = TrackCommonService.LIZJ.LIZ();
            if (pageDataV26 != null) {
                str5 = pageDataV26.LIZLLL;
            } else {
                str5 = null;
            }
            LIZ10.put("title", String.valueOf(str5));
            if (pageDataV26 == null || !pageDataV26.LJFF) {
                str15 = "0";
            }
            LIZ10.put("on_off", str15);
            LIZ10.put("picture_status", String.valueOf(i));
            LIZ10.put("title_status", String.valueOf(i2));
            LIZ9.LIZ("livesdk_small_program_explanation_card_set_save", LIZ10, Room.class);
        }
    }
}
