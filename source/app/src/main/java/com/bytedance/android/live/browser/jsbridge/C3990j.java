package com.bytedance.android.live.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.api.bridge.BaseJSBridgeMethodFactory;
import com.bytedance.android.annie.api.bridge.FragmentStateFulProvider;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.android.annie.api.bridge.RegisterPolicy;
import com.bytedance.android.annie.service.data.C2628b;
import com.bytedance.android.live.browser.AbstractC4051k;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.browser.jsbridge.newmethods.OpenCashVerifyMethod;
import com.bytedance.android.live.browser.jsbridge.newmethods.ResetHostVerifyMethod;
import com.bytedance.android.live.browser.jsbridge.newmethods.ShowStikerMethod;
import com.bytedance.android.live.browser.jsbridge.widget.BridgeSupportWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.p311c.AbstractC4059b;
import com.bytedance.android.live.room.api.ILiveShareService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13040ah;
import com.bytedance.ies.xbridge.AbstractC13103j;
import com.bytedance.ies.xbridge.C13104k;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.api.IContainerIDProvider;
import com.bytedance.ies.xbridge.api.INameSpaceProvider;
import com.bytedance.ies.xbridge.event.bridge.XSubscribeEventMethod;
import com.bytedance.ies.xbridge.event.bridge.XUnsubscribeEventMethod;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC101579PzR;
import p003X.AbstractC88741Kxr;
import p003X.C100264PeE;
import p003X.C100856Pnm;
import p003X.C100859Pnp;
import p003X.C100865Pnv;
import p003X.C100869Pnz;
import p003X.C100875Po5;
import p003X.C101035Pqf;
import p003X.C101044Pqo;
import p003X.C101074PrI;
import p003X.C101080PrO;
import p003X.C101083PrR;
import p003X.C101088PrW;
import p003X.C101276PuY;
import p003X.C101277PuZ;
import p003X.C101364Pvy;
import p003X.C101417Pwp;
import p003X.C101421Pwt;
import p003X.C101428Px0;
import p003X.C101432Px4;
import p003X.C101468Pxe;
import p003X.C101511PyL;
import p003X.C101515PyP;
import p003X.C101519PyT;
import p003X.C101529Pyd;
import p003X.C101533Pyh;
import p003X.C101558Pz6;
import p003X.C101569PzH;
import p003X.C101571PzJ;
import p003X.C101577PzP;
import p003X.C101578PzQ;
import p003X.C101582PzU;
import p003X.C101583PzV;
import p003X.C101586PzY;
import p003X.C101588Pza;
import p003X.C101590Pzc;
import p003X.C101592Pze;
import p003X.C101594Pzg;
import p003X.C101597Pzj;
import p003X.C101598Pzk;
import p003X.C101601Pzn;
import p003X.C101602Pzo;
import p003X.C101604Pzq;
import p003X.C101606Pzs;
import p003X.C101609Pzv;
import p003X.C101611Pzx;
import p003X.C101634Q0u;
import p003X.C103904Qvq;
import p003X.C106862S5w;
import p003X.C147983fRp;
import p003X.C382901Em;
import p003X.C382911En;
import p003X.C382921Eo;
import p003X.C382941Eq;
import p003X.C3OG;
import p003X.C417322fO;
import p003X.C417492ff;
import p003X.C418142gi;
import p003X.C427832wL;
import p003X.C427882wQ;
import p003X.C428932y7;
import p003X.C435133Jj;
import p003X.C440653bv;
import p003X.C441433dB;
import p003X.C441483dG;
import p003X.C442843fS;
import p003X.C446843lu;
import p003X.C447203mU;
import p003X.C64868Big;
import p003X.C70451DqX;
import p003X.C70847Dwv;
import p003X.C80165Hip;
import p003X.C80167Hir;
import p003X.C81295I2n;
import p003X.C81915IQj;
import p003X.C87247KZl;
import p003X.C87252KZq;
import p003X.C87282KaK;
import p003X.C88295Kqf;
import p003X.C88297Kqh;
import p003X.C88299Kqj;
import p003X.C88391KsD;
import p003X.C88456KtG;
import p003X.C88530KuS;
import p003X.C88531KuT;
import p003X.C88532KuU;
import p003X.C88533KuV;
import p003X.C88534KuW;
import p003X.C88643KwH;
import p003X.C88651KwP;
import p003X.C88652KwQ;
import p003X.C88683Kwv;
import p003X.C88724Kxa;
import p003X.C88881L0h;
import p003X.C89431LLl;
import p003X.C89508LOk;
import p003X.C89515LOr;
import p003X.C89520LOw;
import p003X.C89683LVd;
import p003X.C89691LVl;
import p003X.C89735LXd;
import p003X.C89736LXe;
import p003X.C89737LXf;
import p003X.C89742LXk;
import p003X.C89798LZo;
import p003X.C90524LlW;
import p003X.C90986Lsy;
import p003X.C91296Lxy;
import p003X.C91305Ly7;
import p003X.C98224OmQ;
import p003X.C98229OmV;
import p003X.C98710OuG;
import p003X.C99431PEb;
import p003X.C99432PEc;
import p003X.C99559PIz;
import p003X.C99761PQt;
import p003X.C99783PRp;
import p003X.IP0;
import p003X.IQE;
import p003X.ITQ;
import p003X.ITS;
import p003X.KYZ;
import p003X.KZG;
import p003X.KZK;
import p003X.LP2;
import p003X.LPC;
import p003X.P0E;
import p003X.P0H;
import p003X.P0I;
import p003X.PK0;
import p003X.PTL;
import p003X.Q01;
import p003X.Q02;

/* renamed from: com.bytedance.android.live.browser.jsbridge.j */
/* loaded from: classes8.dex */
public final class C3990j implements AbstractC4051k {
    public static ChangeQuickRedirect LIZ;
    public final Collection<C3989h> LIZIZ = new CopyOnWriteArraySet();
    public final Collection<AbstractC3885b> LIZJ = new CopyOnWriteArraySet();
    public final Collection<BaseJSBridgeMethodFactory> LIZLLL = new CopyOnWriteArraySet();

    /* renamed from: LJ */
    public final Lazy f26150LJ = LazyKt__LazyJVMKt.lazy(JsBridgeService$safeHostList$2.INSTANCE);

    static {
        Covode.recordClassIndex(22488);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final List<String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (List) (proxy.isSupported ? proxy.result : this.f26150LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final <T extends LiveRecyclableWidget> Class<T> LIZIZ() {
        return BridgeSupportWidget.class;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final <T> void LIZ(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        for (C3989h c3989h : this.LIZIZ) {
            c3989h.LIZIZ().LIZ(str, (String) t);
        }
        ((AbstractC101579PzR) C99783PRp.LJIIJ.LIZ(AbstractC101579PzR.class)).LIZ(str, t);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Observable<Unit> LIZ(AbstractC3885b abstractC3885b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3885b}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3885b);
        if (this.LIZJ.add(abstractC3885b)) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC3885b}, this, LIZ, false, 9);
            BaseJSBridgeMethodFactory c101558Pz6 = proxy2.isSupported ? (BaseJSBridgeMethodFactory) proxy2.result : new C101558Pz6(abstractC3885b);
            ((AbstractC101579PzR) C99783PRp.LJIIJ.LIZ(AbstractC101579PzR.class)).LIZ(c101558Pz6);
            for (C3989h c3989h : this.LIZIZ) {
                c3989h.LIZ(abstractC3885b);
            }
            Observable<Unit> doOnDispose = Observable.create(C382911En.LIZIZ).doOnDispose(new C101577PzP(this, c101558Pz6, abstractC3885b));
            Intrinsics.checkNotNullExpressionValue(doOnDispose, "");
            return doOnDispose;
        }
        Observable<Unit> create = Observable.create(C382921Eo.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Observable<C3952am> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Observable<C3952am> doOnDispose = Observable.create(new C70847Dwv(objectRef, str)).doOnDispose(new C70451DqX(objectRef, str));
        Intrinsics.checkNotNullExpressionValue(doOnDispose, "");
        return doOnDispose;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Map<String, PK0<?, ?>> LIZ(C13040ah c13040ah, RegisterPolicy registerPolicy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c13040ah, registerPolicy}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(registerPolicy);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (registerPolicy == RegisterPolicy.DEFAULT || registerPolicy == RegisterPolicy.SPECIFIED) {
            Pair[] pairArr = new Pair[1];
            pairArr[0] = TuplesKt.m137to("webviewNavigation", new C98224OmQ(c13040ah != null ? c13040ah.LJFF : null));
            linkedHashMap.putAll(MapsKt__MapsKt.mutableMapOf(pairArr));
        }
        if (registerPolicy == RegisterPolicy.DEFAULT || registerPolicy == RegisterPolicy.CACHEABLE) {
            linkedHashMap.putAll(MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("getXTtToken", new C440653bv()), TuplesKt.m137to("toast", new C88652KwQ()), TuplesKt.m137to("sendLogV3", new C441433dB()), TuplesKt.m137to("sendLogV1", new C418142gi()), TuplesKt.m137to("reportADLog", new C98710OuG()), TuplesKt.m137to("open_webview_action", new C88299Kqj()), TuplesKt.m137to("sendMonitor", new C91296Lxy()), TuplesKt.m137to("setBannerVisibility", new Q02()), TuplesKt.m137to("isTeenMode", new C88724Kxa()), TuplesKt.m137to("sendPokemon", new C100264PeE()), TuplesKt.m137to("statusNotification", new C427882wQ()), TuplesKt.m137to("resetHostVerify", new ResetHostVerifyMethod()), TuplesKt.m137to("saveLocalData", new C91305Ly7()), TuplesKt.m137to("openCashVerify", new OpenCashVerifyMethod()), TuplesKt.m137to("addRedDot", new C90524LlW()), TuplesKt.m137to("openPKPanel", new C88297Kqh()), TuplesKt.m137to("monitorLynx", new C147983fRp()), TuplesKt.m137to("openPanel", new C88295Kqf()), TuplesKt.m137to("setBottomBannerVisibility", new C435133Jj()), TuplesKt.m137to("fansClubMsgGuide", new Q01()), TuplesKt.m137to("openFaceStickerPanel", new ShowStikerMethod()), TuplesKt.m137to("webcastBroadcast", new C101083PrR()), TuplesKt.m137to("__getCurrentState", new C101080PrO()), TuplesKt.m137to("GetMaixuRoomStatus", new C417322fO()), TuplesKt.m137to("getMaixuRoomStatus", new C417322fO()), TuplesKt.m137to("isInstalledApp", new KYZ()), TuplesKt.m137to("liveDownloadMedia", new C103904Qvq()), TuplesKt.m137to("bindSourceParams", new C417492ff()), TuplesKt.m137to("handleSharedKv", new C88456KtG()), TuplesKt.m137to("reportStarEvent", new C427832wL()), TuplesKt.m137to("shareScreen", ((ILiveShareService) ServiceManager.getService(ILiveShareService.class)).getShareScreenMethod()), TuplesKt.m137to("dismissFinishPage", new C81915IQj()), TuplesKt.m137to("getStorage", new C89735LXd()), TuplesKt.m137to("removeStorage", new C89737LXf()), TuplesKt.m137to("reportAppLog", new C441433dB())));
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_JSB_STORAGE_ASYNC;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            linkedHashMap.put("setStorage", new C89736LXe());
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final void LIZ(IJSBridgeManager iJSBridgeManager) {
        if (PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZLLL();
        P0E p0e = P0E.LIZIZ;
        if (PatchProxy.proxy(new Object[]{iJSBridgeManager}, p0e, P0E.LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        XContextProviderFactory xContextProviderFactory = new XContextProviderFactory();
        xContextProviderFactory.registerWeakHolder(Context.class, iJSBridgeManager.getActivity());
        xContextProviderFactory.registerHolder(INameSpaceProvider.class, new C99431PEb());
        xContextProviderFactory.registerHolder(XBridgeMethod.JsEventDelegate.class, new C99432PEc(iJSBridgeManager));
        xContextProviderFactory.registerHolder(IContainerIDProvider.class, new C99761PQt(iJSBridgeManager));
        P0H.LIZJ.LIZ(C99559PIz.class);
        P0H.LIZJ.LIZ(XSubscribeEventMethod.class);
        P0H.LIZJ.LIZ(XUnsubscribeEventMethod.class);
        p0e.LIZ();
        C13104k c13104k = new C13104k();
        Iterator<T> it = P0H.LIZ().iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                try {
                    XBridgeMethod xBridgeMethod = (XBridgeMethod) cls.newInstance();
                    c13104k.LIZ(xBridgeMethod.getName(), new C98229OmV(xBridgeMethod, c13104k, xContextProviderFactory));
                } catch (Exception e) {
                    ALogger.m15798e("XbridgeManager", e);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out com.bytedance.ies.xbridge.XBridgeMethod>");
                break;
            }
            ALogger.m15798e("XbridgeManager", e);
        }
        for (Map.Entry<String, AbstractC13103j> entry : c13104k.LIZIZ().entrySet()) {
            String key = entry.getKey();
            iJSBridgeManager.registerMethod(key, new P0I(key, entry, iJSBridgeManager));
        }
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Map<String, FragmentStateFulProvider<? extends AbstractC13049f<?, ?>>> LIZ(Fragment fragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(fragment);
        return MapsKt__MapsKt.mapOf(TuplesKt.m137to("uploadPhoto", new C88531KuT(fragment)), TuplesKt.m137to("uploadPicture", new C88532KuU(fragment)), TuplesKt.m137to("uploadVideo", new C88533KuV(fragment)), TuplesKt.m137to("upload", new C88534KuW(fragment)), TuplesKt.m137to("cropAndUploadEmoji", new C88530KuS(fragment)));
    }

    public C3990j() {
        LazyKt__LazyJVMKt.lazy(JsBridgeService$kv$2.INSTANCE);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        C2628b.LIZLLL.LIZ((PTL) new C101035Pqf(null, 1)).subscribe();
        C2628b.LIZLLL.LIZ(new C80165Hip());
        C2628b.LIZLLL.LIZ(new C80167Hir());
        C2628b.LIZLLL.LIZ(new ITQ());
        C2628b.LIZLLL.LIZ(new ITS());
        C2628b.LIZLLL.LIZ(new C81295I2n());
        C2628b.LIZLLL.LIZ(new C101044Pqo());
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final PK0<?, ?> LIZ(DialogFragment dialogFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogFragment}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (PK0) proxy.result;
        }
        C106862S5w.LIZ(dialogFragment);
        return new C101277PuZ(dialogFragment);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final PK0<?, ?> LIZIZ(DialogFragment dialogFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogFragment}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (PK0) proxy.result;
        }
        C106862S5w.LIZ(dialogFragment);
        return new C101276PuY(null, dialogFragment);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC13049f<?, ?> LIZ(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (AbstractC13049f) proxy.result;
        }
        C106862S5w.LIZ(view);
        return new C101634Q0u(view);
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Observable<Unit> LIZ(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{baseJSBridgeMethodFactory}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(baseJSBridgeMethodFactory);
        if (this.LIZLLL.add(baseJSBridgeMethodFactory)) {
            ((AbstractC101579PzR) C99783PRp.LJIIJ.LIZ(AbstractC101579PzR.class)).LIZ(baseJSBridgeMethodFactory);
            Observable<Unit> doOnDispose = Observable.create(C382901Em.LIZIZ).doOnDispose(new C101578PzQ(this, baseJSBridgeMethodFactory));
            Intrinsics.checkNotNullExpressionValue(doOnDispose, "");
            return doOnDispose;
        }
        Observable<Unit> create = Observable.create(C382941Eq.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC3973g.AbstractC3976d LIZ(String str, IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, iJSBridgeManager}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (AbstractC3973g.AbstractC3976d) proxy.result;
        }
        C106862S5w.LIZ(str, iJSBridgeManager);
        return new C101074PrI();
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final Map<String, AbstractC13049f.AbstractC13051b> LIZIZ(C13040ah c13040ah, RegisterPolicy registerPolicy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c13040ah, registerPolicy}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(registerPolicy);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (registerPolicy == RegisterPolicy.DEFAULT || registerPolicy == RegisterPolicy.SPECIFIED) {
            linkedHashMap.putAll(MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("fetch", new C88643KwH(c13040ah)), TuplesKt.m137to("appInfo", new C89508LOk(c13040ah)), TuplesKt.m137to("requestOrientationPermission", new C101583PzV(c13040ah)), TuplesKt.m137to("monitorCommerceLotteryNumMsg", new C90986Lsy(c13040ah))));
        }
        if (registerPolicy == RegisterPolicy.DEFAULT || registerPolicy == RegisterPolicy.CACHEABLE) {
            linkedHashMap.putAll(MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("openTimeSchedule", C101606Pzs.LIZIZ), TuplesKt.m137to("vibrate", C441483dG.LIZIZ), TuplesKt.m137to("showLeaveRoomDialog", KZG.LIZIZ), TuplesKt.m137to("getGiftExtraData", C89798LZo.LIZIZ), TuplesKt.m137to("observeShakeMobile", IQE.LIZIZ), TuplesKt.m137to(C64868Big.LIZJ, C88881L0h.LIZIZ), TuplesKt.m137to("openZmCert", C87252KZq.LIZIZ), TuplesKt.m137to("openHostVerify", KZK.LIZIZ), TuplesKt.m137to("liveLoading", C87282KaK.LIZIZ), TuplesKt.m137to("app.showModal", C101601Pzn.LIZIZ), TuplesKt.m137to("showModal", C101602Pzo.LIZIZ), TuplesKt.m137to("webcastAlertModal", C88683Kwv.LIZIZ), TuplesKt.m137to("handleNotificationSettings", C101586PzY.LIZIZ), TuplesKt.m137to("callPhone", C101598Pzk.LIZIZ), TuplesKt.m137to("setFansStatus", C101609Pzv.LIZIZ), TuplesKt.m137to("setAppointmentStatus", C100856Pnm.LIZIZ), TuplesKt.m137to("startAnimationEvent", C428932y7.LIZIZ), TuplesKt.m137to("dialog", C101611Pzx.LIZIZ), TuplesKt.m137to(UGCMonitor.EVENT_COMMENT, C447203mU.LIZIZ), TuplesKt.m137to("authorization", C442843fS.LIZIZ), TuplesKt.m137to("fetchPb", C88391KsD.LIZIZ), TuplesKt.m137to("commercialComponentOperation", C101088PrW.LIZIZ), TuplesKt.m137to("createChatGroup", IP0.LIZIZ), TuplesKt.m137to("openGameRankPromotePanel", C101428Px0.LIZIZ), TuplesKt.m137to("openCommentPanel", C101588Pza.LIZIZ), TuplesKt.m137to("openTicketPriceInputPanel", C89431LLl.LIZIZ), TuplesKt.m137to("openEmojiPanel", C446843lu.LIZIZ), TuplesKt.m137to("gameCpAnchorPrivacy", C87247KZl.LIZIZ), TuplesKt.m137to("refreshActivityBannerNumber", C100865Pnv.LIZIZ), TuplesKt.m137to("setMemoryByContainer", C100859Pnp.LIZIZ), TuplesKt.m137to("openRechargeDialog", C101590Pzc.LIZIZ), TuplesKt.m137to("openFansGroupSettingDirect", C100875Po5.LIZIZ), TuplesKt.m137to("alert", C89683LVd.LIZIZ), TuplesKt.m137to("changeVsCameraView", C100869Pnz.LIZIZ), TuplesKt.m137to("alertCheckDialog", C101604Pzq.LIZIZ), TuplesKt.m137to("gameCpOpenGame", C101592Pze.LIZIZ), TuplesKt.m137to("openAudienceGamePromoteDetail", LPC.LIZIZ), TuplesKt.m137to("openGamePromotePropsPurchaseDialog", C101421Pwt.LIZIZ), TuplesKt.m137to("openAnchorShowAddDialog", LP2.LIZIZ), TuplesKt.m137to("registerGamePromoteDownload", C101529Pyd.LIZIZ), TuplesKt.m137to("performGamePromoteDownloadAction", C101515PyP.LIZIZ), TuplesKt.m137to("cancelGamePromoteDownload", C101511PyL.LIZIZ), TuplesKt.m137to("gamePromoteSendAdEvent", C101432Px4.LIZIZ), TuplesKt.m137to("sendAdLog", C101468Pxe.LIZIZ), TuplesKt.m137to("sendThirdTrack", C101533Pyh.LIZIZ), TuplesKt.m137to("adInfo", C3OG.LIZIZ), TuplesKt.m137to("unRegisterGamePromoteDownload", C101519PyT.LIZIZ), TuplesKt.m137to("giftPackReserveButtonClick", C89691LVl.LIZIZ), TuplesKt.m137to("imageToast", C101364Pvy.LIZIZ), TuplesKt.m137to("getClientSetting", C101594Pzg.LIZIZ), TuplesKt.m137to("showToast", C88651KwP.LIZIZ), TuplesKt.m137to("showLoading", C89520LOw.LIZIZ), TuplesKt.m137to("hideLoading", C89515LOr.LIZIZ), TuplesKt.m137to("getAppInfo", new C101582PzU(c13040ah)), TuplesKt.m137to("makePhoneCall", C101597Pzj.LIZIZ), TuplesKt.m137to("checkPermission", C101569PzH.LIZIZ), TuplesKt.m137to("requestPermission", C101571PzJ.LIZIZ), TuplesKt.m137to("sendCommerceEvent", C101417Pwp.LIZIZ)));
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_JSB_STORAGE_ASYNC;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            linkedHashMap.put("setStorage", C89742LXk.LIZIZ);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC3940c LIZ(Activity activity, AbstractC13046b abstractC13046b, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, abstractC13046b, Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC3940c) proxy.result;
        }
        C106862S5w.LIZ(activity, abstractC13046b);
        C3989h c3989h = new C3989h(activity, abstractC13046b, i, new JsBridgeService$createJsBridgeManager$5(this));
        this.LIZIZ.add(c3989h);
        return c3989h;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC3940c LIZ(AbstractC4059b abstractC4059b, AbstractC13046b abstractC13046b, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4059b, abstractC13046b, 2}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (AbstractC3940c) proxy.result;
        }
        C106862S5w.LIZ(abstractC4059b, abstractC13046b);
        C3989h c3989h = new C3989h(abstractC4059b, abstractC13046b, 2, new JsBridgeService$createJsBridgeManager$7(this));
        this.LIZIZ.add(c3989h);
        return c3989h;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC3940c LIZ(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, webView, webViewClient, webChromeClient, 1}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (AbstractC3940c) proxy.result;
        }
        C106862S5w.LIZ(activity, webView, webViewClient, webChromeClient);
        C3989h c3989h = new C3989h(activity, webView, webViewClient, webChromeClient, 1, new JsBridgeService$createJsBridgeManager$3(this));
        this.LIZIZ.add(c3989h);
        return c3989h;
    }

    @Override // com.bytedance.android.live.browser.AbstractC4051k
    public final AbstractC3940c LIZ(AbstractC4059b abstractC4059b, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4059b, webView, webViewClient, webChromeClient, 1}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC3940c) proxy.result;
        }
        C106862S5w.LIZ(abstractC4059b, webView, webViewClient, webChromeClient);
        C3989h c3989h = new C3989h(abstractC4059b, webView, webViewClient, webChromeClient, 1, new JsBridgeService$createJsBridgeManager$1(this));
        this.LIZIZ.add(c3989h);
        return c3989h;
    }
}
