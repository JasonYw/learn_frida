package com.bytedance.android.live.browser.jsbridge;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.android.live.browser.jsbridge.newmethods.OpenCashVerifyMethod;
import com.bytedance.android.live.browser.jsbridge.newmethods.ResetHostVerifyMethod;
import com.bytedance.android.live.browser.jsbridge.newmethods.ShowStikerMethod;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.p311c.AbstractC4059b;
import com.bytedance.android.live.room.api.ILiveShareService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import com.bytedance.ies.web.jsbridge2.AbstractC13048e;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13040ah;
import com.bytedance.ies.web.jsbridge2.C13042ai;
import com.bytedance.ies.web.jsbridge2.C13055n;
import com.bytedance.ies.web.jsbridge2.PermissionGroup;
import com.bytedance.ies.xbridge.event.EventCenter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88741Kxr;
import p003X.C100264PeE;
import p003X.C100855Pnl;
import p003X.C100858Pno;
import p003X.C100864Pnu;
import p003X.C100868Pny;
import p003X.C100874Po4;
import p003X.C100941Pp9;
import p003X.C100942PpA;
import p003X.C101080PrO;
import p003X.C101083PrR;
import p003X.C101087PrV;
import p003X.C101175Psv;
import p003X.C101249Pu7;
import p003X.C101254PuC;
import p003X.C101255PuD;
import p003X.C101274PuW;
import p003X.C101276PuY;
import p003X.C101277PuZ;
import p003X.C101363Pvx;
import p003X.C101416Pwo;
import p003X.C101420Pws;
import p003X.C101427Pwz;
import p003X.C101431Px3;
import p003X.C101437Px9;
import p003X.C101467Pxd;
import p003X.C101510PyK;
import p003X.C101514PyO;
import p003X.C101518PyS;
import p003X.C101528Pyc;
import p003X.C101532Pyg;
import p003X.C101568PzG;
import p003X.C101570PzI;
import p003X.C101580PzS;
import p003X.C101581PzT;
import p003X.C101584PzW;
import p003X.C101585PzX;
import p003X.C101587PzZ;
import p003X.C101589Pzb;
import p003X.C101591Pzd;
import p003X.C101593Pzf;
import p003X.C101595Pzh;
import p003X.C101596Pzi;
import p003X.C101599Pzl;
import p003X.C101600Pzm;
import p003X.C101603Pzp;
import p003X.C101605Pzr;
import p003X.C101607Pzt;
import p003X.C101610Pzw;
import p003X.C101612Pzy;
import p003X.C101613Pzz;
import p003X.C103904Qvq;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C147862fPs;
import p003X.C147867fPx;
import p003X.C147983fRp;
import p003X.C3OF;
import p003X.C417322fO;
import p003X.C417492ff;
import p003X.C418142gi;
import p003X.C427832wL;
import p003X.C427882wQ;
import p003X.C428922y6;
import p003X.C435133Jj;
import p003X.C439993ar;
import p003X.C440653bv;
import p003X.C441433dB;
import p003X.C441473dF;
import p003X.C442833fR;
import p003X.C447193mT;
import p003X.C64868Big;
import p003X.C77103GaX;
import p003X.C77105GaZ;
import p003X.C81879IOz;
import p003X.C81915IQj;
import p003X.C87246KZk;
import p003X.C87251KZp;
import p003X.C87281KaJ;
import p003X.C88295Kqf;
import p003X.C88297Kqh;
import p003X.C88299Kqj;
import p003X.C88390KsC;
import p003X.C88456KtG;
import p003X.C88644KwI;
import p003X.C88650KwO;
import p003X.C88652KwQ;
import p003X.C88682Kwu;
import p003X.C88724Kxa;
import p003X.C88880L0g;
import p003X.C89430LLk;
import p003X.C89507LOj;
import p003X.C89514LOq;
import p003X.C89519LOv;
import p003X.C89682LVc;
import p003X.C89690LVk;
import p003X.C89735LXd;
import p003X.C89737LXf;
import p003X.C89738LXg;
import p003X.C89741LXj;
import p003X.C89797LZn;
import p003X.C90524LlW;
import p003X.C91296Lxy;
import p003X.C91305Ly7;
import p003X.C98171OlZ;
import p003X.C98224OmQ;
import p003X.C98710OuG;
import p003X.C99575PJp;
import p003X.DialogInterface$OnClickListenerC64426BbY;
import p003X.IQD;
import p003X.IRF;
import p003X.KYZ;
import p003X.KZF;
import p003X.KZJ;
import p003X.LP0;
import p003X.LP1;
import p003X.LPB;
import p003X.P0E;
import p003X.P0N;
import p003X.PK0;
import p003X.PKN;
import p003X.PM2;
import p003X.Q01;
import p003X.Q02;

/* renamed from: com.bytedance.android.live.browser.jsbridge.h */
/* loaded from: classes8.dex */
public final class C3989h implements AbstractC3940c {
    public static ChangeQuickRedirect LIZ;
    public C13040ah LIZIZ;
    public C3990j LIZJ;
    public final int LIZLLL;
    public final HashSet<AbstractC3885b> LJI;
    public final WeakReference<Context> LJII;
    public WeakReference<AlertDialog> LJIIIIZZ;
    public AbstractC4059b LJIIIZ;
    public final List<String> LJIIJ;
    public C13042ai LJIIJJI;
    public final Activity LJIIL;
    public final Function1<C3989h, Unit> LJIILIIL;
    public static final C101612Pzy LJFF = new C101612Pzy((byte) 0);

    /* renamed from: LJ */
    public static final Lazy f26149LJ = LazyKt__LazyJVMKt.lazy(JsBridgeManager$Companion$publicFuncList$2.INSTANCE);

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final Activity LIZ() {
        return this.LJIIL;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final List<String> LJFF() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final AbstractC4059b LJI() {
        return this.LJIIIZ;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final <T> void LIZ(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, t);
        if (LIZIZ().LJII) {
            return;
        }
        LIZIZ().LIZ(str, (String) t);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZ(String str, AbstractC13049f.AbstractC13051b abstractC13051b) {
        if (PatchProxy.proxy(new Object[]{str, abstractC13051b}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC13051b);
        LIZIZ().LIZ(str, abstractC13051b);
        this.LJIIJ.add(str);
    }

    static {
        Covode.recordClassIndex(22402);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final C13040ah LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C13040ah) proxy.result;
        }
        C13040ah c13040ah = this.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c13040ah;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final C13042ai LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C13042ai) proxy.result;
        }
        C13042ai c13042ai = this.LJIIJJI;
        if (c13042ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c13042ai;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZLLL() {
        String c13040ah;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZIZ().LIZIZ();
        LIZJ().LIZ();
        this.LJI.clear();
        this.LJIILIIL.invoke(this);
        AbstractC4059b LJI = LJI();
        if (LJI == null || (c13040ah = LJI.LJIIIIZZ()) == null) {
            c13040ah = LIZIZ().toString();
        }
        EventCenter.release(c13040ah);
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    /* renamed from: LJ */
    public final void mo15825LJ() {
        WeakReference<AlertDialog> weakReference;
        AlertDialog alertDialog;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (weakReference = this.LJIIIIZZ) != null && (alertDialog = weakReference.get()) != null && alertDialog.isShowing()) {
            C116971W2r.LIZ(alertDialog);
        }
    }

    private final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        LJIIIZ();
        LJIIIIZZ();
        C3990j c3990j = this.LIZJ;
        if (c3990j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        for (AbstractC3885b abstractC3885b : c3990j.LIZJ) {
            this.LJI.add(abstractC3885b);
            Iterator<T> it = abstractC3885b.LIZJ(this).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                LIZ((String) entry.getKey(), (PK0) entry.getValue());
            }
            Iterator<T> it2 = abstractC3885b.LIZ(this).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                LIZ((String) entry2.getKey(), (AbstractC13049f.AbstractC13051b) entry2.getValue());
            }
            Iterator<T> it3 = abstractC3885b.LIZLLL(this).entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                LIZ((String) entry3.getKey(), (IJavaMethod) entry3.getValue());
            }
        }
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        Iterator<T> it = C98171OlZ.LIZ().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Function0) it.next()).mo30099invoke()).entrySet()) {
                LIZ((String) entry.getKey(), (PK0) entry.getValue());
            }
        }
        Iterator<T> it2 = C98171OlZ.LIZIZ().iterator();
        while (it2.hasNext()) {
            for (Map.Entry entry2 : ((Map) ((Function0) it2.next()).mo30099invoke()).entrySet()) {
                LIZ((String) entry2.getKey(), (AbstractC13049f.AbstractC13051b) entry2.getValue());
            }
        }
        Iterator<T> it3 = C98171OlZ.LIZJ().iterator();
        while (it3.hasNext()) {
            for (Map.Entry entry3 : ((Map) ((Function0) it3.next()).mo30099invoke()).entrySet()) {
                LIZ((String) entry3.getKey(), (IJavaMethod) entry3.getValue());
            }
        }
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        LIZIZ().LIZ(LIZJ());
        for (Map.Entry<String, PK0<?, ?>> entry : LJIIJ().entrySet()) {
            LIZ(entry.getKey(), (PK0) entry.getValue());
        }
        for (Map.Entry<String, AbstractC13049f.AbstractC13051b> entry2 : LJIIJJI().entrySet()) {
            LIZ(entry2.getKey(), entry2.getValue());
        }
        P0E.LIZIZ.LIZ(LIZ(), this, this.LIZLLL);
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_JSB_STORAGE_ASYNC;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LIZ("setStorage", (AbstractC13049f.AbstractC13051b) C89741LXj.LIZIZ);
            LIZ("getStorage", (PK0) new C89735LXd());
            LIZ("removeStorage", (PK0) new C89737LXf());
            return;
        }
        C89738LXg.LIZ(this);
    }

    private final Map<String, PK0<?, ?>> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.mapOf(TuplesKt.m137to("getXTtToken", new C440653bv()), TuplesKt.m137to("toast", new C88652KwQ()), TuplesKt.m137to("sendLogV3", new C441433dB()), TuplesKt.m137to("sendLogV1", new C418142gi()), TuplesKt.m137to("reportADLog", new C98710OuG()), TuplesKt.m137to("open_webview_action", new C88299Kqj()), TuplesKt.m137to("sendMonitor", new C91296Lxy()), TuplesKt.m137to("setBannerVisibility", new Q02()), TuplesKt.m137to("close", new C101277PuZ(LIZ())), TuplesKt.m137to("setSideslip", new C101249Pu7(LJI())), TuplesKt.m137to("isTeenMode", new C88724Kxa()), TuplesKt.m137to("sendPokemon", new C100264PeE()), TuplesKt.m137to("statusNotification", new C427882wQ()), TuplesKt.m137to("resetHostVerify", new ResetHostVerifyMethod()), TuplesKt.m137to("saveLocalData", new C91305Ly7()), TuplesKt.m137to("openCashVerify", new OpenCashVerifyMethod()), TuplesKt.m137to("addRedDot", new C90524LlW()), TuplesKt.m137to("openPKPanel", new C88297Kqh()), TuplesKt.m137to("monitorLynx", new C147983fRp()), TuplesKt.m137to("openPanel", new C88295Kqf()), TuplesKt.m137to("webviewNavigation", new C98224OmQ(LIZIZ().LJFF)), TuplesKt.m137to("setBottomBannerVisibility", new C435133Jj()), TuplesKt.m137to("fansClubMsgGuide", new Q01()), TuplesKt.m137to("pull_down_height", new C100941Pp9()), TuplesKt.m137to("dialogPullDownClose", new C101175Psv()), TuplesKt.m137to("openFaceStickerPanel", new ShowStikerMethod()), TuplesKt.m137to("webcastBroadcast", new C101083PrR()), TuplesKt.m137to("__getCurrentState", new C101080PrO()), TuplesKt.m137to("GetMaixuRoomStatus", new C417322fO()), TuplesKt.m137to("getMaixuRoomStatus", new C417322fO()), TuplesKt.m137to("isInstalledApp", new KYZ()), TuplesKt.m137to("liveDownloadMedia", new C103904Qvq()), TuplesKt.m137to("bindSourceParams", new C417492ff()), TuplesKt.m137to("handleSharedKv", new C88456KtG()), TuplesKt.m137to("reportStarEvent", new C427832wL()), TuplesKt.m137to("shareScreen", ((ILiveShareService) ServiceManager.getService(ILiveShareService.class)).getShareScreenMethod()), TuplesKt.m137to("closeAndOpen", new C101276PuY(LIZ(), null, 2)), TuplesKt.m137to("dismissFinishPage", new C81915IQj()), TuplesKt.m137to("reportAppLog", new C441433dB()));
    }

    private final Map<String, AbstractC13049f.AbstractC13051b> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.mapOf(TuplesKt.m137to("appInfo", new C89507LOj(this)), TuplesKt.m137to("openTimeSchedule", C101605Pzr.LIZIZ), TuplesKt.m137to("getContainerID", new P0N(this)), TuplesKt.m137to("canIUse", new C101584PzW(this)), TuplesKt.m137to("changeVsCameraView", C100868Pny.LIZIZ), TuplesKt.m137to("gameCpAnchorPrivacy", C87246KZk.LIZIZ), TuplesKt.m137to("vibrate", C441473dF.LIZIZ), TuplesKt.m137to("showLeaveRoomDialog", KZF.LIZIZ), TuplesKt.m137to("getGiftExtraData", C89797LZn.LIZIZ), TuplesKt.m137to("observeShakeMobile", IQD.LIZIZ), TuplesKt.m137to(C64868Big.LIZJ, C88880L0g.LIZIZ), TuplesKt.m137to("openZmCert", C87251KZp.LIZIZ), TuplesKt.m137to("openHostVerify", KZJ.LIZIZ), TuplesKt.m137to("liveLoading", C87281KaJ.LIZIZ), TuplesKt.m137to("app.showModal", C101599Pzl.LIZIZ), TuplesKt.m137to("showModal", C101600Pzm.LIZIZ), TuplesKt.m137to("webcastAlertModal", C88682Kwu.LIZIZ), TuplesKt.m137to("alert", C89682LVc.LIZIZ), TuplesKt.m137to("alertCheckDialog", C101603Pzp.LIZIZ), TuplesKt.m137to("handleNotificationSettings", C101585PzX.LIZIZ), TuplesKt.m137to("callPhone", C101596Pzi.LIZIZ), TuplesKt.m137to("setFansStatus", C101607Pzt.LIZIZ), TuplesKt.m137to("setAppointmentStatus", C100855Pnl.LIZIZ), TuplesKt.m137to("startAnimationEvent", C428922y6.LIZIZ), TuplesKt.m137to("dialog", C101610Pzw.LIZIZ), TuplesKt.m137to(UGCMonitor.EVENT_COMMENT, C447193mT.LIZIZ), TuplesKt.m137to("authorization", C442833fR.LIZIZ), TuplesKt.m137to("fetch", new C88644KwI(this)), TuplesKt.m137to("fetchPb", C88390KsC.LIZIZ), TuplesKt.m137to("commercialComponentOperation", C101087PrV.LIZIZ), TuplesKt.m137to("requestOrientationPermission", new C101580PzS(this)), TuplesKt.m137to("setMemoryByContainer", C100858Pno.LIZIZ), TuplesKt.m137to("preDownloadGame", C101437Px9.LIZIZ), TuplesKt.m137to("refreshActivityBannerNumber", C100864Pnu.LIZIZ), TuplesKt.m137to("setTitle", new C101274PuW(this)), TuplesKt.m137to("openCommentPanel", C101587PzZ.LIZIZ), TuplesKt.m137to("openTicketPriceInputPanel", C89430LLk.LIZIZ), TuplesKt.m137to("createChatGroup", C81879IOz.LIZIZ), TuplesKt.m137to("openGameRankPromotePanel", C101427Pwz.LIZIZ), TuplesKt.m137to("openRechargeDialog", C101589Pzb.LIZIZ), TuplesKt.m137to("openFansGroupSettingDirect", C100874Po4.LIZIZ), TuplesKt.m137to("refreshGiftPanelContent", IRF.LIZIZ), TuplesKt.m137to("gameCpOpenGame", C101591Pzd.LIZIZ), TuplesKt.m137to("openAudienceGamePromoteDetail", LPB.LIZIZ), TuplesKt.m137to("openGamePromotePropsPurchaseDialog", C101420Pws.LIZIZ), TuplesKt.m137to("registerGamePromoteDownload", C101528Pyc.LIZIZ), TuplesKt.m137to("performGamePromoteDownloadAction", C101514PyO.LIZIZ), TuplesKt.m137to("cancelGamePromoteDownload", C101510PyK.LIZIZ), TuplesKt.m137to("gamePromoteSendAdEvent", C101431Px3.LIZIZ), TuplesKt.m137to("sendAdLog", C101467Pxd.LIZIZ), TuplesKt.m137to("adInfo", C3OF.LIZIZ), TuplesKt.m137to("sendThirdTrack", C101532Pyg.LIZIZ), TuplesKt.m137to("giftPackReserveButtonClick", C89690LVk.LIZIZ), TuplesKt.m137to("unRegisterGamePromoteDownload", C101518PyS.LIZIZ), TuplesKt.m137to("imageToast", C101363Pvx.LIZIZ), TuplesKt.m137to("openAnchorShowAddDialog", LP0.LIZIZ), TuplesKt.m137to("getClientSetting", C101593Pzf.LIZIZ), TuplesKt.m137to("openAnchorShowAddDialog", LP1.LIZIZ), TuplesKt.m137to("showToast", C88650KwO.LIZIZ), TuplesKt.m137to("showLoading", C89519LOv.LIZIZ), TuplesKt.m137to("hideLoading", C89514LOq.LIZIZ), TuplesKt.m137to("getAppInfo", new C101581PzT(this)), TuplesKt.m137to("makePhoneCall", C101595Pzh.LIZIZ), TuplesKt.m137to("checkPermission", C101568PzG.LIZIZ), TuplesKt.m137to("requestPermission", C101570PzI.LIZIZ), TuplesKt.m137to("sendCommerceEvent", C101416Pwo.LIZIZ));
    }

    public static final /* synthetic */ C13040ah LIZ(C3989h c3989h) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3989h}, null, LIZ, true, 21);
        if (proxy.isSupported) {
            return (C13040ah) proxy.result;
        }
        C13040ah c13040ah = c3989h.LIZIZ;
        if (c13040ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c13040ah;
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZIZ(AbstractC3885b abstractC3885b) {
        if (PatchProxy.proxy(new Object[]{abstractC3885b}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3885b);
        if (!this.LJI.remove(abstractC3885b)) {
            return;
        }
        for (String str : SetsKt___SetsKt.plus(SetsKt___SetsKt.plus((Set) abstractC3885b.LIZLLL(this).keySet(), (Iterable) abstractC3885b.LIZJ(this).keySet()), (Iterable) abstractC3885b.LIZ(this).keySet())) {
            LIZIZ().LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZ(AbstractC3885b abstractC3885b) {
        if (PatchProxy.proxy(new Object[]{abstractC3885b}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3885b);
        if (!this.LJI.add(abstractC3885b)) {
            return;
        }
        Iterator<T> it = abstractC3885b.LIZLLL(this).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LIZ((String) entry.getKey(), (IJavaMethod) entry.getValue());
        }
        Iterator<T> it2 = abstractC3885b.LIZJ(this).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            LIZ((String) entry2.getKey(), (PK0) entry2.getValue());
        }
        Iterator<T> it3 = abstractC3885b.LIZ(this).entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            LIZ((String) entry3.getKey(), (AbstractC13049f.AbstractC13051b) entry3.getValue());
        }
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final <P, R> void LIZ(String str, PK0<P, R> pk0) {
        if (PatchProxy.proxy(new Object[]{str, pk0}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pk0);
        LIZIZ().LIZ(str, (PK0<?, ?>) pk0);
        this.LJIIJ.add(str);
    }

    private final void LIZ(Activity activity, AbstractC13046b abstractC13046b) {
        if (PatchProxy.proxy(new Object[]{activity, abstractC13046b}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C13055n LIZ2 = C13040ah.LIZ(new PM2(abstractC13046b));
        LIZ2.LIZ(activity);
        LIZ2.LIZ(abstractC13046b);
        LIZ2.LIZIZ(false);
        LIZ2.LIZJ(true);
        LIZ2.LIZ("ToutiaoJSBridge");
        C3990j c3990j = this.LIZJ;
        if (c3990j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C13055n LIZ3 = LIZ2.LIZ(c3990j.LIZ());
        if (C101613Pzz.LIZIZ.LIZ()) {
            LIZ3.LIZ();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_HYBRID_USE_FULL_LINK_MONITOR;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LIZ3.LIZIZ(new PKN(new C77105GaZ()));
        }
        C13055n LIZ4 = LIZ3.LIZ(new C101255PuD());
        LIZ4.LIZ(false);
        LIZ4.LIZIZ("webcast");
        C13040ah LIZIZ = LIZ4.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LIZIZ = LIZIZ;
        C13042ai LIZ5 = C13042ai.LIZ((WebView) null, LIZIZ());
        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
        this.LJIIJJI = LIZ5;
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_JSB_ENABLE_INIT_XBRIDGE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue()) {
            ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZLLL();
        }
        LJII();
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZ(String str, GeolocationPermissions.Callback callback) {
        Activity LIZ2;
        AlertDialog alertDialog;
        if (PatchProxy.proxy(new Object[]{str, callback}, this, LIZ, false, 8).isSupported || StringUtils.isEmpty(str) || (LIZ2 = C439993ar.LIZ(this.LJII.get())) == null) {
            return;
        }
        WeakReference<AlertDialog> weakReference = this.LJIIIIZZ;
        if (weakReference != null && (alertDialog = weakReference.get()) != null && alertDialog.isShowing()) {
            C116971W2r.LIZ(alertDialog);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(LIZ2);
        builder.setTitle(2131583759);
        builder.setMessage(LIZ2.getString(2131583758, new Object[]{str}));
        DialogInterface$OnClickListenerC64426BbY dialogInterface$OnClickListenerC64426BbY = new DialogInterface$OnClickListenerC64426BbY(LIZ2, str, callback);
        builder.setNegativeButton(2131583757, dialogInterface$OnClickListenerC64426BbY);
        builder.setPositiveButton(2131583756, dialogInterface$OnClickListenerC64426BbY);
        builder.setCancelable(false);
        this.LJIIIIZZ = new WeakReference<>(builder.show());
    }

    @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3940c
    public final void LIZ(String str, IJavaMethod iJavaMethod) {
        if (PatchProxy.proxy(new Object[]{str, iJavaMethod}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, iJavaMethod);
        LIZJ().LIZ(str, iJavaMethod);
        this.LJIIJ.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3989h(Activity activity, int i, Function1<? super C3989h, Unit> function1) {
        this.LJIIL = activity;
        this.LIZLLL = i;
        this.LJIILIIL = function1;
        this.LJI = new HashSet<>();
        this.LJII = new WeakReference<>(LIZ());
        this.LJIIJ = new ArrayList();
        C100942PpA.LIZ().LIZIZ().LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3989h(Activity activity, AbstractC13046b abstractC13046b, int i, Function1<? super C3989h, Unit> function1) {
        this(activity, i, function1);
        C106862S5w.LIZ(activity, abstractC13046b, function1);
        LIZ(activity, abstractC13046b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3989h(AbstractC4059b abstractC4059b, AbstractC13046b abstractC13046b, int i, Function1<? super C3989h, Unit> function1) {
        this(abstractC4059b.LJII(), i, function1);
        C106862S5w.LIZ(abstractC4059b, abstractC13046b, function1);
        this.LJIIIZ = abstractC4059b;
        LIZ(LIZ(), abstractC13046b);
    }

    private final void LIZ(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        Object mo27335getValue;
        C13040ah c13040ah;
        if (PatchProxy.proxy(new Object[]{activity, webView, webViewClient, webChromeClient}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C13055n LIZ2 = C13040ah.LIZ(webView);
        LIZ2.LIZ(activity);
        LIZ2.LIZ(new C101254PuC());
        LIZ2.LIZ(new C147862fPs(webView));
        LIZ2.LIZIZ(false);
        LIZ2.LIZJ(true);
        C3990j c3990j = this.LIZJ;
        if (c3990j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ2.LIZ(c3990j.LIZ());
        LIZ2.LIZIZ(new C147867fPx(webView));
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_HYBRID_USE_FULL_LINK_MONITOR;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LIZ2.LIZIZ(new PKN(new C77103GaX()));
        }
        LIZ2.LIZ("ToutiaoJSBridge");
        if (C101613Pzz.LIZIZ.LIZ()) {
            LIZ2.LIZ();
        }
        LIZ2.LIZIZ("webcast");
        C13040ah LIZIZ = LIZ2.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LIZIZ = LIZIZ;
        C13042ai LIZ3 = C13042ai.LIZ(webView, LIZIZ()).LIZJ("bytedance").LIZ(webViewClient).LIZ(webChromeClient);
        C3990j c3990j2 = this.LIZJ;
        if (c3990j2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        List<String> LIZ4 = c3990j2.LIZ();
        LIZ3.LIZJ.setSafeHost(LIZ4);
        C99575PJp c99575PJp = LIZ3.LIZIZ.LJIIL.LIZJ;
        if (!PatchProxy.proxy(new Object[]{LIZ4}, c99575PJp, C99575PJp.LIZ, false, 3).isSupported) {
            c99575PJp.LIZIZ.addAll(LIZ4);
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LJFF, C101612Pzy.LIZ, false, 1);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = f26149LJ.mo27335getValue();
        }
        List<String> list = (List) mo27335getValue;
        LIZ3.LIZJ.setPublicFunc(list);
        C99575PJp c99575PJp2 = LIZ3.LIZIZ.LJIIL.LIZJ;
        if (!PatchProxy.proxy(new Object[]{list}, c99575PJp2, C99575PJp.LIZ, false, 5).isSupported) {
            c99575PJp2.LIZJ.addAll(list);
        }
        for (String str : list) {
            AbstractC13048e abstractC13048e = LIZ3.LIZLLL.get(str);
            if (abstractC13048e != null) {
                abstractC13048e.LIZ = PermissionGroup.PUBLIC;
            }
        }
        this.LJIIJJI = LIZ3;
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.JSB_ENABLE_HOST_METHOD_IMPORT;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue() && (c13040ah = (C13040ah) ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZ(activity, LIZIZ())) != null) {
            LIZIZ().LIZ(C1315c.f22208f, c13040ah);
        }
        SettingKey<Boolean> settingKey3 = LiveConfigSettingKeys.LIVE_JSB_ENABLE_INIT_XBRIDGE;
        Intrinsics.checkNotNullExpressionValue(settingKey3, "");
        Boolean value3 = settingKey3.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "");
        if (value3.booleanValue()) {
            ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZLLL();
        }
        LJII();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3989h(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i, Function1<? super C3989h, Unit> function1) {
        this(activity, i, function1);
        C106862S5w.LIZ(activity, webView, webViewClient, webChromeClient, function1);
        LIZ(activity, webView, webViewClient, webChromeClient);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3989h(AbstractC4059b abstractC4059b, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i, Function1<? super C3989h, Unit> function1) {
        this(abstractC4059b.LJII(), i, function1);
        C106862S5w.LIZ(abstractC4059b, webView, webViewClient, webChromeClient, function1);
        this.LJIIIZ = abstractC4059b;
        LIZ(LIZ(), webView, webViewClient, webChromeClient);
    }
}
