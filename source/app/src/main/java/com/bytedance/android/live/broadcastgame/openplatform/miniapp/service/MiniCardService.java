package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import com.bytedance.android.live.broadcastgame.api.model.PageData;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.livehostapi.business.depend.livead.ILiveMiniAppService;
import com.bytedance.android.livesdkapi.TTLiveService;
import com.bytedance.android.livesdkapi.service.ILiveService;
import com.bytedance.bdp.live.livecontainer.miniapp.PageConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.Map;
import java.util.NoSuchElementException;
import p003X.AbstractC520466hM;
import p003X.C106862S5w;
import p003X.C441223cq;
import p003X.C87425Kcd;
import p003X.C87426Kce;
import p003X.C87811Kir;
import p003X.C87837KjH;
import p003X.C87840KjK;
import p003X.C87842KjM;
import p003X.KM9;

@AbstractC520466hM(LIZ = AnchorMiniCardService.class, LIZIZ = AudienceMiniCardService.class)
/* loaded from: classes5.dex */
public abstract class MiniCardService implements AbstractC3662k, AbstractC3717a {
    public static ChangeQuickRedirect LJIIIIZZ;
    public C3682x LIZ;

    static {
        Covode.recordClassIndex(21809);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIIIIZZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 6).isSupported;
    }

    public void LIZLLL() {
    }

    /* renamed from: LJ */
    public void mo15832LJ() {
    }

    public void LJI() {
    }

    public abstract String LJIIIZ();

    public abstract PageConfig LJIIJ();

    public C3682x LJIIJJI() {
        return this.LIZ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 5).isSupported) {
            return;
        }
        C87426Kce.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ() {
        PageData pageData;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        PageData.ReviewStatus reviewStatus;
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        C441223cq c441223cq = C441223cq.f949LJ;
        PageDataV2 LIZ = C87811Kir.LIZ();
        if (LIZ != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ, PageDataV2.LIZ, false, 9);
            if (proxy.isSupported) {
                pageData = proxy.result;
            } else {
                PageData pageData2 = new PageData();
                pageData2.LIZIZ.LIZ(new C87840KjK(LIZ.LIZIZ.LIZIZ, LIZ.LIZIZ.LIZJ));
                pageData2.LIZJ.LIZ(new C87840KjK(LIZ.LIZJ.LIZIZ, LIZ.LIZJ.LIZJ));
                String LIZIZ = LIZ.LIZIZ();
                if (!PatchProxy.proxy(new Object[]{LIZIZ}, pageData2, PageData.LIZ, false, 3).isSupported) {
                    C106862S5w.LIZ(LIZIZ);
                    pageData2.LIZLLL = LIZIZ;
                }
                PageDataV2.C3362b c3362b = LIZ.f26017LJ;
                if (c3362b == null || (str = c3362b.LIZLLL) == null) {
                    str = "";
                }
                PageDataV2.C3362b c3362b2 = LIZ.f26017LJ;
                if (c3362b2 == null || (str2 = c3362b2.f26018LJ) == null) {
                    str2 = "";
                }
                PageDataV2.C3362b c3362b3 = LIZ.f26017LJ;
                if (c3362b3 == null || (str3 = c3362b3.LJFF) == null) {
                    str3 = "";
                }
                PageDataV2.C3362b c3362b4 = LIZ.f26017LJ;
                if (c3362b4 == null || (str4 = c3362b4.LJI) == null) {
                    str4 = "";
                }
                PageDataV2.C3362b c3362b5 = LIZ.f26017LJ;
                if (c3362b5 == null || (str5 = c3362b5.LIZIZ) == null) {
                    str5 = "";
                }
                PageDataV2.C3362b c3362b6 = LIZ.f26017LJ;
                if (c3362b6 == null || (str6 = c3362b6.LIZJ) == null) {
                    str6 = "";
                }
                PageDataV2.C3362b c3362b7 = LIZ.f26017LJ;
                if (c3362b7 == null || (str7 = c3362b7.LJII) == null) {
                    str7 = "";
                }
                pageData2.f26016LJ = new C87837KjH(str5, str6, str, str2, str3, str4, str7);
                pageData2.LJFF = LIZ.LJFF;
                pageData2.LJI = LIZ.LJI;
                C87842KjM c87842KjM = PageData.ReviewStatus.Companion;
                Integer num = LIZ.LJII.TYPE;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c87842KjM, C87842KjM.LIZ, false, 1);
                if (proxy2.isSupported) {
                    reviewStatus = (PageData.ReviewStatus) proxy2.result;
                } else {
                    PageData.ReviewStatus[] valuesCustom = PageData.ReviewStatus.valuesCustom();
                    int length = valuesCustom.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        reviewStatus = valuesCustom[i2];
                        Integer num2 = reviewStatus.TYPE;
                        if (num2 == null || num2.intValue() != i) {
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                if (!PatchProxy.proxy(new Object[]{reviewStatus}, pageData2, PageData.LIZ, false, 4).isSupported) {
                    C106862S5w.LIZ(reviewStatus);
                    pageData2.LJII = reviewStatus;
                }
                pageData2.LJIIIIZZ.LIZ(new C87840KjK(LIZ.LJIIIIZZ.LIZIZ, LIZ.LJIIIIZZ.LIZJ));
                pageData = pageData2;
            }
        } else {
            pageData = null;
        }
        if (!PatchProxy.proxy(new Object[]{pageData}, c441223cq, C441223cq.LIZ, false, 5).isSupported) {
            if (pageData != null) {
                C441223cq.LIZJ.LIZIZ(C441223cq.f949LJ.LIZJ(), GsonProtectorUtils.toJson(KM9.LIZIZ(), pageData));
            } else {
                C441223cq.LIZJ.LIZIZ(C441223cq.f949LJ.LIZJ(), "");
            }
        }
    }

    public MiniCardService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZ = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LJIIIIZZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        C87425Kcd.LIZ(this, obj);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        ILiveService liveService;
        ILiveMiniAppService iLiveMiniAppService;
        if (!PatchProxy.proxy(new Object[]{map}, this, LJIIIIZZ, false, 1).isSupported && LJIIJJI().LJIIIIZZ.LIZIZ != -1 && (liveService = TTLiveService.getLiveService()) != null && (iLiveMiniAppService = (ILiveMiniAppService) liveService.liveMiniAppService(ILiveMiniAppService.class)) != null) {
            iLiveMiniAppService.setMiniAppActivityStatue(true);
        }
    }
}
