package com.bytedance.android.live.broadcastgame;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.broadcastgame.api.AbstractC3357f;
import com.bytedance.android.live.broadcastgame.api.AbstractC3358g;
import com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget;
import com.bytedance.android.live.broadcastgame.api.IAudienceGameWidget;
import com.bytedance.android.live.broadcastgame.api.interactgame.AbstractC3360k;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameInviteState;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameSeiStatus;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.interactgame.InteractGameLocalStatusUtils$notifyServerGameStop$1$1;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3381l;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3385r;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.p282a.C3328d;
import com.bytedance.android.live.broadcastgame.api.p283b.a$b;
import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.C3470f;
import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.C3471g;
import com.bytedance.android.live.broadcastgame.network.BroadcastGameApi;
import com.bytedance.android.live.broadcastgame.network.C3477a;
import com.bytedance.android.live.broadcastgame.opengame.network.C3531a;
import com.bytedance.android.live.broadcastgame.opengame.network.C3535aa;
import com.bytedance.android.live.broadcastgame.opengame.network.C3536ab;
import com.bytedance.android.live.broadcastgame.opengame.network.C3537ac;
import com.bytedance.android.live.broadcastgame.opengame.network.C3538ae;
import com.bytedance.android.live.broadcastgame.opengame.network.C3540af;
import com.bytedance.android.live.broadcastgame.opengame.network.C3542ag;
import com.bytedance.android.live.broadcastgame.opengame.network.C3544ah;
import com.bytedance.android.live.broadcastgame.opengame.network.C3545ai;
import com.bytedance.android.live.broadcastgame.opengame.network.C3546aj;
import com.bytedance.android.live.broadcastgame.opengame.network.C3547ak;
import com.bytedance.android.live.broadcastgame.opengame.network.C3548al;
import com.bytedance.android.live.broadcastgame.opengame.network.C3549am;
import com.bytedance.android.live.broadcastgame.opengame.network.C3550an;
import com.bytedance.android.live.broadcastgame.opengame.network.C3551ao;
import com.bytedance.android.live.broadcastgame.opengame.network.C3552ap;
import com.bytedance.android.live.broadcastgame.opengame.network.C3553aq;
import com.bytedance.android.live.broadcastgame.opengame.network.C3554ar;
import com.bytedance.android.live.broadcastgame.opengame.network.C3555as;
import com.bytedance.android.live.broadcastgame.opengame.network.C3556at;
import com.bytedance.android.live.broadcastgame.opengame.network.C3557au;
import com.bytedance.android.live.broadcastgame.opengame.network.C3559c;
import com.bytedance.android.live.broadcastgame.opengame.network.C3560d;
import com.bytedance.android.live.broadcastgame.opengame.network.C3562i;
import com.bytedance.android.live.broadcastgame.opengame.network.C3563j;
import com.bytedance.android.live.broadcastgame.opengame.network.C3564k;
import com.bytedance.android.live.broadcastgame.opengame.network.C3567m;
import com.bytedance.android.live.broadcastgame.opengame.network.C3584n;
import com.bytedance.android.live.broadcastgame.opengame.network.C3585o;
import com.bytedance.android.live.broadcastgame.opengame.network.C3588p;
import com.bytedance.android.live.broadcastgame.opengame.network.C3589q;
import com.bytedance.android.live.broadcastgame.opengame.network.C3591r;
import com.bytedance.android.live.broadcastgame.opengame.network.C3593s;
import com.bytedance.android.live.broadcastgame.opengame.network.C3595t;
import com.bytedance.android.live.broadcastgame.opengame.network.C3596u;
import com.bytedance.android.live.broadcastgame.opengame.network.C3597v;
import com.bytedance.android.live.broadcastgame.opengame.network.C3598w;
import com.bytedance.android.live.broadcastgame.opengame.network.C3600z;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3569a;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3570b;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3571c;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3572d;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3573e;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3575f;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3576g;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3577h;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3579j;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3580k;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3581l;
import com.bytedance.android.live.broadcastgame.opengame.network.model.C3582m;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.browser.jsbridge.AbstractC3941d;
import com.bytedance.android.live.core.gift.AbstractC4071b;
import com.bytedance.android.live.core.gift.IGiftCoreService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostLiveAd;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p1594ss.avframework.livestreamv2.core.IGameEngine;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.json.JSONObject;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC87801Kih;
import p003X.AbstractC88219KpR;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WD;
import p003X.C35F;
import p003X.C4315035k;
import p003X.C442103eG;
import p003X.C449833qj;
import p003X.C81814IMm;
import p003X.C81862IOi;
import p003X.C82036IVa;
import p003X.C87010KQi;
import p003X.C87168KWk;
import p003X.C87236KZa;
import p003X.C87237KZb;
import p003X.C87238KZc;
import p003X.C87240KZe;
import p003X.C87308Kak;
import p003X.C87311Kan;
import p003X.C87312Kao;
import p003X.C87313Kap;
import p003X.C87314Kaq;
import p003X.C87315Kar;
import p003X.C87316Kas;
import p003X.C87317Kat;
import p003X.C87318Kau;
import p003X.C87319Kav;
import p003X.C87320Kaw;
import p003X.C87321Kax;
import p003X.C87322Kay;
import p003X.C87323Kaz;
import p003X.C87324Kb0;
import p003X.C87325Kb1;
import p003X.C87326Kb2;
import p003X.C87327Kb3;
import p003X.C87328Kb4;
import p003X.C87329Kb5;
import p003X.C87330Kb6;
import p003X.C87331Kb7;
import p003X.C87332Kb8;
import p003X.C87333Kb9;
import p003X.C87334KbA;
import p003X.C87335KbB;
import p003X.C87336KbC;
import p003X.C87337KbD;
import p003X.C87338KbE;
import p003X.C87339KbF;
import p003X.C87340KbG;
import p003X.C87341KbH;
import p003X.C87342KbI;
import p003X.C87343KbJ;
import p003X.C87344KbK;
import p003X.C87345KbL;
import p003X.C87346KbM;
import p003X.C87347KbN;
import p003X.C87348KbO;
import p003X.C87349KbP;
import p003X.C87350KbQ;
import p003X.C87351KbR;
import p003X.C87352KbS;
import p003X.C87353KbT;
import p003X.C87354KbU;
import p003X.C87355KbV;
import p003X.C87356KbW;
import p003X.C87361Kbb;
import p003X.C87363Kbd;
import p003X.C87364Kbe;
import p003X.C87365Kbf;
import p003X.C87366Kbg;
import p003X.C87367Kbh;
import p003X.C87368Kbi;
import p003X.C87370Kbk;
import p003X.C87371Kbl;
import p003X.C87376Kbq;
import p003X.C87377Kbr;
import p003X.C87379Kbt;
import p003X.C87384Kby;
import p003X.C87385Kbz;
import p003X.C87386Kc0;
import p003X.C87428Kcg;
import p003X.C88133Ko3;
import p003X.C89330LHo;
import p003X.C91301Ly3;
import p003X.C95452Nio;
import p003X.DialogC88906L1g;
import p003X.H9B;
import p003X.H9C;
import p003X.IQV;
import p003X.KUC;
import p003X.KUD;
import p003X.KVU;
import p003X.KWN;
import p003X.KXO;
import p003X.KXP;
import p003X.KXQ;
import p003X.KYP;
import p003X.KYW;
import p003X.KYX;
import p003X.KZU;
import p003X.KZX;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class InteractGameService implements IInteractGameService, AbstractC4071b {
    public static final KXQ Companion;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final KXP diComponent;
    public String audienceMiniAppSchema;
    public WeakReference<Dialog> exceptionDialog;
    public AbstractC3357f gameAnchorService;
    public AbstractC3358g gameAudienceService;
    public C4315035k gameGuideHelper;
    public boolean isAudienceMiniAppReady;
    public boolean isOldVersionMiniApp;
    public final Lazy jsEventSender$delegate = LazyKt__LazyJVMKt.lazy(InteractGameService$jsEventSender$2.INSTANCE);
    public AbstractC3475n openPlatformService;
    public WeakReference<IGameEngine> wMiniGameEngine;

    private final List<AbstractC3941d> getJsEventSender() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (List) (proxy.isSupported ? proxy.result : this.jsEventSender$delegate.mo27335getValue());
    }

    public final AbstractC3357f getGameAnchorService() {
        return this.gameAnchorService;
    }

    public final AbstractC3358g getGameAudienceService() {
        return this.gameAudienceService;
    }

    public final AbstractC3475n getOpenPlatformService() {
        return this.openPlatformService;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final C4315035k getGameGuideHelper() {
        C4315035k c4315035k = this.gameGuideHelper;
        if (c4315035k == null || !c4315035k.LIZJ) {
            return null;
        }
        return c4315035k;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void clearAutoMountMiniAppData() {
        AbstractC3475n abstractC3475n;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45).isSupported && (abstractC3475n = this.openPlatformService) != null) {
            abstractC3475n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b createOpenGameBehaivor() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LJI();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Object createOpenToolbarEntBehavior() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<Object> gameBeInviteStateChange() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<GameInviteState> gameInviteStateChange() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final IAudienceGameWidget getAudienceGameWidget() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (IAudienceGameWidget) proxy.result;
        }
        AbstractC3358g abstractC3358g = this.gameAudienceService;
        if (abstractC3358g != null) {
            return abstractC3358g.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final C3384q getCurrentPlayingGame() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (C3384q) proxy.result;
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.mo15852LJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final PageDataV2 getPreMountMiniAppData() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44);
        if (proxy.isSupported) {
            return (PageDataV2) proxy.result;
        }
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.mo15849LJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void stopGameCastToAudience() {
        AbstractC3357f abstractC3357f;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48).isSupported && (abstractC3357f = this.gameAnchorService) != null) {
            abstractC3357f.LJII();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void stopRunningPlugin() {
        AbstractC3357f abstractC3357f;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && (abstractC3357f = this.gameAnchorService) != null) {
            abstractC3357f.LJI();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final IGameEngine getWMiniGameEngine() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (IGameEngine) proxy.result;
        }
        WeakReference<IGameEngine> weakReference = this.wMiniGameEngine;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean hasPreMountMiniApp() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n == null) {
            return false;
        }
        return abstractC3475n.LIZLLL();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean isInGameInviting() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f == null) {
            return false;
        }
        return abstractC3357f.LIZJ();
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean isPlayingGame() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f == null) {
            return false;
        }
        return abstractC3357f.LJFF();
    }

    static {
        KXP kzu;
        if (ReDexClinitStringAb.abTest >= 3) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(18996);
        Companion = new KXQ((byte) 0);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, KZU.LIZ, true, 2);
        if (proxy.isSupported) {
            kzu = (KXP) proxy.result;
        } else {
            KZX kzx = new KZX((byte) 0);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], kzx, KZX.LIZ, false, 1);
            if (proxy2.isSupported) {
                kzu = (KXP) proxy2.result;
            } else {
                if (kzx.LIZIZ == null) {
                    kzx.LIZIZ = new C87236KZa();
                }
                if (kzx.LIZJ == null) {
                    kzx.LIZJ = new C87237KZb();
                }
                if (kzx.LIZLLL == null) {
                    kzx.LIZLLL = new C87240KZe();
                }
                if (kzx.f8535LJ == null) {
                    kzx.f8535LJ = new C87238KZc();
                }
                kzu = new KZU(kzx, (byte) 0);
            }
        }
        Intrinsics.checkNotNullExpressionValue(kzu, "");
        diComponent = kzu;
    }

    private static void clinit$r$fake() {
        KXP kzu;
        Covode.recordClassIndex(18996);
        Companion = new KXQ((byte) 0);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, KZU.LIZ, true, 2);
        if (proxy.isSupported) {
            kzu = (KXP) proxy.result;
        } else {
            KZX kzx = new KZX((byte) 0);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], kzx, KZX.LIZ, false, 1);
            if (proxy2.isSupported) {
                kzu = (KXP) proxy2.result;
            } else {
                if (kzx.LIZIZ == null) {
                    kzx.LIZIZ = new C87236KZa();
                }
                if (kzx.LIZJ == null) {
                    kzx.LIZJ = new C87237KZb();
                }
                if (kzx.LIZLLL == null) {
                    kzx.LIZLLL = new C87240KZe();
                }
                if (kzx.f8535LJ == null) {
                    kzx.f8535LJ = new C87238KZc();
                }
                kzu = new KZU(kzx, (byte) 0);
            }
        }
        Intrinsics.checkNotNullExpressionValue(kzu, "");
        diComponent = kzu;
    }

    public InteractGameService() {
        diComponent.LIZ(this);
        ServiceManager.registerService(IInteractGameService.class, this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!PatchProxy.proxy(new Object[]{linkedHashMap}, null, C87365Kbf.LIZ, true, 1).isSupported && !PatchProxy.proxy(new Object[]{linkedHashMap}, new C87363Kbd(), C87363Kbd.LIZ, false, 1).isSupported) {
            linkedHashMap.put(C3477a.class, new C81862IOi());
            linkedHashMap.put(C3554ar.class, new C87366Kbg());
            linkedHashMap.put(C3564k.class, new C87342KbI());
            linkedHashMap.put(C3595t.class, new C87367Kbh());
            linkedHashMap.put(C3596u.class, new C87327Kb3());
            linkedHashMap.put(C3597v.class, new AbstractC10531b<C3597v>() { // from class: X.3dK
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(20392);
                }

                /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.broadcastgame.opengame.network.v, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.broadcastgame.opengame.network.v, java.lang.Object] */
                @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
                /* renamed from: decode */
                public final /* synthetic */ C3597v mo25795decode(C10532g c10532g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c10532g}, null, LIZ, true, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    C3597v c3597v = new C3597v();
                    c3597v.LIZ = new HashMap();
                    long LIZ2 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ != -1) {
                            if (LIZIZ != 1) {
                                QV1.LJII(c10532g);
                            } else {
                                long LIZ3 = c10532g.LIZ();
                                String str = null;
                                Integer num = null;
                                while (true) {
                                    int LIZIZ2 = c10532g.LIZIZ();
                                    if (LIZIZ2 == -1) {
                                        break;
                                    } else if (LIZIZ2 != 1) {
                                        if (LIZIZ2 == 2) {
                                            num = Integer.valueOf(QV1.LIZIZ(c10532g));
                                        }
                                    } else {
                                        str = QV1.LJFF(c10532g);
                                    }
                                }
                                c10532g.LIZ(LIZ3);
                                if (str != null) {
                                    if (num != null) {
                                        c3597v.LIZ.put(str, num);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            c10532g.LIZ(LIZ2);
                            return c3597v;
                        }
                    }
                }
            });
            linkedHashMap.put(C3598w.class, new AbstractC10531b<C3598w>() { // from class: X.3dL
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(20393);
                }

                /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.broadcastgame.opengame.network.w, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.broadcastgame.opengame.network.w, java.lang.Object] */
                @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
                /* renamed from: decode */
                public final /* synthetic */ C3598w mo25795decode(C10532g c10532g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c10532g}, null, LIZ, true, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    C3598w c3598w = new C3598w();
                    c3598w.LIZ = new HashMap();
                    long LIZ2 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ != -1) {
                            if (LIZIZ != 1) {
                                QV1.LJII(c10532g);
                            } else {
                                long LIZ3 = c10532g.LIZ();
                                String str = null;
                                Integer num = null;
                                while (true) {
                                    int LIZIZ2 = c10532g.LIZIZ();
                                    if (LIZIZ2 == -1) {
                                        break;
                                    } else if (LIZIZ2 != 1) {
                                        if (LIZIZ2 == 2) {
                                            num = Integer.valueOf(QV1.LIZIZ(c10532g));
                                        }
                                    } else {
                                        str = QV1.LJFF(c10532g);
                                    }
                                }
                                c10532g.LIZ(LIZ3);
                                if (str != null) {
                                    if (num != null) {
                                        c3598w.LIZ.put(str, num);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            c10532g.LIZ(LIZ2);
                            return c3598w;
                        }
                    }
                }
            });
            linkedHashMap.put(C3555as.class, new C87376Kbq());
            linkedHashMap.put(C3560d.class, new C87385Kbz());
            linkedHashMap.put(C3553aq.class, new C87384Kby());
            linkedHashMap.put(C3559c.class, new C87386Kc0());
            linkedHashMap.put(C3544ah.class, new H9B());
            linkedHashMap.put(C3545ai.class, new H9C());
            linkedHashMap.put(C3549am.class, new C87352KbS());
            linkedHashMap.put(C3550an.class, new C87377Kbr());
            linkedHashMap.put(C3551ao.class, new C87353KbT());
            linkedHashMap.put(C3552ap.class, new C87354KbU());
            linkedHashMap.put(C3575f.class, new C87315Kar());
            linkedHashMap.put(C3570b.class, new C87336KbC());
            linkedHashMap.put(C3571c.class, new C87346KbM());
            linkedHashMap.put(C3576g.class, new C87338KbE());
            linkedHashMap.put(C3577h.class, new C87348KbO());
            linkedHashMap.put(C3577h.C3578a.class, new C87356KbW());
            linkedHashMap.put(C3572d.class, new C87337KbD());
            linkedHashMap.put(C3573e.class, new C87347KbN());
            linkedHashMap.put(C3573e.C3574a.class, new C87355KbV());
            linkedHashMap.put(C3581l.class, new C87339KbF());
            linkedHashMap.put(C3569a.class, new C87345KbL());
            linkedHashMap.put(C3582m.class, new C87318Kau());
            linkedHashMap.put(C3582m.C3583a.class, new C87319Kav());
            linkedHashMap.put(C3579j.class, new C87428Kcg());
            linkedHashMap.put(C3580k.class, new C87349KbP());
            linkedHashMap.put(C3471g.class, new C89330LHo());
            linkedHashMap.put(C3470f.class, new KVU());
            linkedHashMap.put(C3531a.class, new C87368Kbi());
            linkedHashMap.put(C3531a.C3533b.class, new C87340KbG());
            linkedHashMap.put(C3531a.C3532a.class, new C87370Kbk());
            linkedHashMap.put(C3531a.C3534c.class, new C87371Kbl());
            linkedHashMap.put(C3562i.class, new C87320Kaw());
            linkedHashMap.put(C3563j.class, new C87341KbH());
            linkedHashMap.put(C3567m.class, new C87312Kao());
            linkedHashMap.put(C3567m.C3568a.class, new C87361Kbb());
            linkedHashMap.put(C3584n.class, new C87316Kas());
            linkedHashMap.put(C3585o.class, new C87322Kay());
            linkedHashMap.put(C3585o.C3586a.class, new C87321Kax());
            linkedHashMap.put(C3588p.class, new C87311Kan());
            linkedHashMap.put(C3589q.class, new C87323Kaz());
            linkedHashMap.put(C3589q.C3590a.class, new C87324Kb0());
            linkedHashMap.put(C3591r.class, new C87313Kap());
            linkedHashMap.put(C3591r.C3592a.class, new C87314Kaq());
            linkedHashMap.put(C3593s.class, new C87325Kb1());
            linkedHashMap.put(C3593s.C3594a.class, new C87326Kb2());
            linkedHashMap.put(C3600z.class, new C87317Kat());
            linkedHashMap.put(C3535aa.class, new C87350KbQ());
            linkedHashMap.put(C3536ab.class, new C87379Kbt());
            linkedHashMap.put(C3537ac.class, new C87351KbR());
            linkedHashMap.put(C3538ae.class, new C87328Kb4());
            linkedHashMap.put(C3538ae.C3539a.class, new C87329Kb5());
            linkedHashMap.put(C3540af.class, new C87330Kb6());
            linkedHashMap.put(C3540af.C3541a.class, new C87331Kb7());
            linkedHashMap.put(C3542ag.class, new C87332Kb8());
            linkedHashMap.put(C3542ag.C3543a.class, new C87333Kb9());
            linkedHashMap.put(C3546aj.class, new C87334KbA());
            linkedHashMap.put(C3547ak.class, new C87335KbB());
            linkedHashMap.put(C3548al.class, new C87364Kbe());
            linkedHashMap.put(C3556at.class, new C87343KbJ());
            linkedHashMap.put(C3557au.class, new C87344KbK());
        }
        ((INetworkService) ServiceManager.getService(INetworkService.class)).injectProtoDecoders(linkedHashMap);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void setAudienceMiniAppReady(boolean z) {
        this.isAudienceMiniAppReady = z;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void setAudienceMiniAppSchema(String str) {
        this.audienceMiniAppSchema = str;
    }

    public final void setGameAnchorService(AbstractC3357f abstractC3357f) {
        this.gameAnchorService = abstractC3357f;
    }

    public final void setGameAudienceService(AbstractC3358g abstractC3358g) {
        this.gameAudienceService = abstractC3358g;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void setOldVersionMiniApp(boolean z) {
        this.isOldVersionMiniApp = z;
    }

    public final void setOpenPlatformService(AbstractC3475n abstractC3475n) {
        this.openPlatformService = abstractC3475n;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void onSei(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC3358g abstractC3358g = this.gameAudienceService;
        if (abstractC3358g != null) {
            abstractC3358g.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void sendGameCastStatusSEI(boolean z) {
        AbstractC3357f abstractC3357f;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47).isSupported && (abstractC3357f = this.gameAnchorService) != null) {
            abstractC3357f.LIZIZ(z);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void setGameGuideHelper(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.gameGuideHelper = new C4315035k(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void setWMiniGameEngine(IGameEngine iGameEngine) {
        if (PatchProxy.proxy(new Object[]{iGameEngine}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        this.wMiniGameEngine = new WeakReference<>(iGameEngine);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void addJsEventSender(AbstractC3941d abstractC3941d) {
        MethodCollector.m14708i(1394);
        if (PatchProxy.proxy(new Object[]{abstractC3941d}, this, changeQuickRedirect, false, 26).isSupported) {
            MethodCollector.m14707o(1394);
            return;
        }
        C106862S5w.LIZ(abstractC3941d);
        synchronized (getJsEventSender()) {
            try {
                getJsEventSender().add(abstractC3941d);
            } catch (Throwable th) {
                MethodCollector.m14707o(1394);
                throw th;
            }
        }
        MethodCollector.m14707o(1394);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final String decryptUserInfo(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LIZ(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final AbstractC88219KpR<C3384q, a$b> getLiveOpenFeatureSceneFilter(DataCenter dataCenter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter}, this, changeQuickRedirect, false, 46);
        if (proxy.isSupported) {
            return (AbstractC88219KpR) proxy.result;
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZ(dataCenter);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Intent getPreviewOpenFeatureActivity(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (Intent) proxy.result;
        }
        C106862S5w.LIZ(context);
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LIZ(context);
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.gift.AbstractC4071b
    public final void onSendGiftResult(C81814IMm c81814IMm) {
        if (PatchProxy.proxy(new Object[]{c81814IMm}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81814IMm);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("name", "giftResult");
        jSONObject.put("body", jSONObject2);
        jSONObject2.put("success", c81814IMm.LIZ ? 1 : 0);
        dispatchJsEventMessage("message", jSONObject);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void removeJsEventSender(AbstractC3941d abstractC3941d) {
        MethodCollector.m14708i(1396);
        if (PatchProxy.proxy(new Object[]{abstractC3941d}, this, changeQuickRedirect, false, 28).isSupported) {
            MethodCollector.m14707o(1396);
            return;
        }
        C106862S5w.LIZ(abstractC3941d);
        synchronized (getJsEventSender()) {
            try {
                getJsEventSender().remove(abstractC3941d);
            } catch (Throwable th) {
                MethodCollector.m14707o(1396);
                throw th;
            }
        }
        MethodCollector.m14707o(1396);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void showGameInteractPanel(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41).isSupported) {
            return;
        }
        if (z) {
            AbstractC3357f abstractC3357f = this.gameAnchorService;
            if (abstractC3357f != null) {
                abstractC3357f.LIZLLL();
                return;
            }
            return;
        }
        AbstractC3358g abstractC3358g = this.gameAudienceService;
        if (abstractC3358g != null) {
            abstractC3358g.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean isInAudioZhufenGame(boolean z) {
        C2WD<C3383p> LIZ;
        C3383p LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (z) {
            C3384q currentPlayingGame = getCurrentPlayingGame();
            if (currentPlayingGame != null && currentPlayingGame.f26027LJ == InteractID.Zhufen.value) {
                return true;
            }
            return false;
        }
        C13491f LIZ3 = IQV.LIZ("InteractGameContext");
        if (!(LIZ3 instanceof C35F)) {
            LIZ3 = null;
        }
        C35F c35f = (C35F) LIZ3;
        if (c35f == null || (LIZ = c35f.LIZ()) == null || (LIZ2 = LIZ.LIZ()) == null) {
            return false;
        }
        if (!TextUtils.isEmpty(LIZ2.LJL) || !TextUtils.isEmpty(LIZ2.LJJZZIII)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean isPlayingGame(InteractID interactID) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{interactID}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(interactID);
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f == null) {
            return false;
        }
        return abstractC3357f.LIZ(interactID);
    }

    private final void runAnchorEnterRoomTask(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        String str;
        Long longOrNull;
        Long longOrNull2;
        Long longOrNull3;
        Long longOrNull4;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 38).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, KYP.LIZIZ, KYP.LIZ, false, 14).isSupported) {
            C87308Kak<ConcurrentHashMap<String, String>> c87308Kak = AbstractC80293Hkt.f7093cO;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            ConcurrentHashMap<String, String> LIZ = c87308Kak.LIZ();
            if (LIZ != null) {
                String str2 = LIZ.get("game_id");
                if (str2 != null && (longOrNull4 = StringsKt__StringNumberConversionsKt.toLongOrNull(str2)) != null) {
                    j2 = longOrNull4.longValue();
                } else {
                    j2 = 0;
                }
                String str3 = LIZ.get("room_id");
                if (str3 != null && (longOrNull3 = StringsKt__StringNumberConversionsKt.toLongOrNull(str3)) != null) {
                    j3 = longOrNull3.longValue();
                } else {
                    j3 = 0;
                }
                String str4 = LIZ.get("play_id");
                if (str4 != null && (longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(str4)) != null) {
                    j4 = longOrNull2.longValue();
                } else {
                    j4 = 0;
                }
                String str5 = LIZ.get("game_token");
                if (str5 != null && (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str5)) != null) {
                    j5 = longOrNull.longValue();
                } else {
                    j5 = 0;
                }
                C87308Kak<ConcurrentHashMap<String, String>> c87308Kak2 = AbstractC80293Hkt.f7093cO;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                ALogger.m15797i("InteractGameLocalStatusUtils", c87308Kak2.LIZ().toString());
                if (j2 != 0 && j3 != 0 && j4 != 0 && j3 == j) {
                    Observable<C5176i<Object>> observeOn = ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).notifyServerGameStop(j2, j, j4, "", true, 2, j5).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
                    Intrinsics.checkNotNullExpressionValue(observeOn, "");
                    C449833qj LIZ2 = C100839PnV.LIZ(3);
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    C91301Ly3.LIZ(observeOn, LIZ2).subscribe(KYW.LIZIZ, KYX.LIZIZ);
                    ALogger.m15797i("InteractGameLocalStatusUtils", "send game stop to server");
                    KYP.LIZIZ.LIZIZ(0L);
                    KYP.LIZIZ.LIZJ(0L);
                    C87308Kak<ConcurrentHashMap<String, String>> c87308Kak3 = AbstractC80293Hkt.f7093cO;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                    ConcurrentHashMap<String, String> LIZ3 = c87308Kak3.LIZ();
                    if (LIZ3 != null) {
                        str = LIZ3.get("in_game_cast");
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, "true")) {
                        LK1.LIZ(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, false, true, InteractGameLocalStatusUtils$notifyServerGameStop$1$1.INSTANCE);
                        KYP.LIZIZ.LIZ(false);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void downloadEffectResource(String str, Function1<? super Sticker, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{str, function1}, this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function1);
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            abstractC3357f.LIZ(str, function1);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void executeEnterRoomTask(boolean z, Room room) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), room}, this, changeQuickRedirect, false, 32).isSupported && z && room != null) {
            Long valueOf = Long.valueOf(room.getId());
            if (valueOf.longValue() != 0 && valueOf != null) {
                runAnchorEnterRoomTask(valueOf.longValue());
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final KUC getGameExitConformDialog(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (KUC) proxy.result;
        }
        C106862S5w.LIZ(context, str);
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZ(context, str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformItemBehavior(C3384q c3384q, AbstractC87801Kih abstractC87801Kih) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3384q, abstractC87801Kih}, this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        C106862S5w.LIZ(c3384q);
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LIZ(c3384q, abstractC87801Kih);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void dispatchJsEventMessage(String str, JSONObject jSONObject) {
        MethodCollector.m14708i(1395);
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 27).isSupported) {
            MethodCollector.m14707o(1395);
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
        synchronized (getJsEventSender()) {
            try {
                for (AbstractC3941d abstractC3941d : getJsEventSender()) {
                    abstractC3941d.LIZ(str, jSONObject);
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(1395);
                throw th;
            }
        }
        MethodCollector.m14707o(1395);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void initGameContext(Fragment fragment, boolean z) {
        if (PatchProxy.proxy(new Object[]{fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(fragment);
        if (z) {
            IQV.LIZ((C442103eG) IQV.LIZ(fragment, (Function1) null, 2, (Object) null).LIZ(C442103eG.class), "InteractGameContext");
        } else {
            IQV.LIZ((C35F) IQV.LIZ(fragment, (Function1) null, 2, (Object) null).LIZ(C35F.class), "InteractGameContext");
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final JsFuncInjector createOpenJsFuncInject(AbstractC3940c abstractC3940c, DataCenter dataCenter, Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c, dataCenter, context}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (JsFuncInjector) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c, dataCenter, context);
        ((IGiftCoreService) ServiceManager.getService(IGiftCoreService.class)).addGiftSendResultListener(this);
        return new KXO(abstractC3940c, dataCenter, context);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<C5176i<C3381l>> getGameEntrance(long j, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return C82036IVa.LIZIZ.LIZ().getGameEntrance(j, str, str2);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b getOldOpenPlatformBehavior(Context context, DataCenter dataCenter, AbstractC3360k abstractC3360k) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, dataCenter, abstractC3360k}, this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        C106862S5w.LIZ(context, dataCenter, abstractC3360k);
        return new C88133Ko3(context, dataCenter, abstractC3360k);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<C5176i<Object>> notifyAudiencePreloadFloatRes(long j, long j2, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZ(j, j2, str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final boolean openMiniApp(Context context, String str, Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, map}, this, changeQuickRedirect, false, 42);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(context, str, map);
        if (!this.isAudienceMiniAppReady) {
            return false;
        }
        if (!this.isOldVersionMiniApp) {
            C87010KQi.LIZ().LIZ(new C3328d(str));
        } else {
            String str2 = this.audienceMiniAppSchema;
            if (str2 == null || str2.length() == 0) {
                return false;
            }
            IHostLiveAd LJJIIZI = C95452Nio.m23163LJ().LJJIIZI();
            if (LJJIIZI != null) {
                String str3 = this.audienceMiniAppSchema;
                if (str3 == null) {
                    str3 = "";
                }
                LJJIIZI.openMiniApp(context, str3, true, map);
                return true;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void sendGameSeiStatus(GameSeiStatus gameSeiStatus, AbstractC5436a abstractC5436a, C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{gameSeiStatus, abstractC5436a, c3384q}, this, changeQuickRedirect, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(gameSeiStatus, abstractC5436a);
        if (!PatchProxy.proxy(new Object[]{gameSeiStatus, c3384q, abstractC5436a}, C87168KWk.LIZIZ, C87168KWk.LIZ, false, 15).isSupported) {
            C106862S5w.LIZ(gameSeiStatus, abstractC5436a);
            int i = KUD.LIZ[gameSeiStatus.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    abstractC5436a.LIZ("interact_game_sei", null, -1, true, false);
                    abstractC5436a.LIZ("interact_game_sei", C87168KWk.LIZIZ.LIZIZ(c3384q), 1, false, false);
                    return;
                }
                return;
            }
            abstractC5436a.LIZ("interact_game_sei", C87168KWk.LIZIZ.LIZ(c3384q), 1, false, false);
            abstractC5436a.LIZ("interact_game_sei", C87168KWk.LIZIZ.LIZJ(c3384q), -1, true, false);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final IAnchorGameWidget getAnchorGameWidget(AbstractC5436a abstractC5436a, Room room, Fragment fragment, FragmentManager fragmentManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5436a, room, fragment, fragmentManager}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (IAnchorGameWidget) proxy.result;
        }
        C106862S5w.LIZ(room, fragment, fragmentManager);
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            return abstractC3357f.LIZ(abstractC5436a, room, fragment, fragmentManager);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b getOpenPlatformBehavior(Context context, DataCenter dataCenter, Function2<? super C3380j, ? super C3385r, ? extends AbstractC6524y.AbstractView$OnClickListenerC6525b> function2, AbstractC3360k abstractC3360k) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, dataCenter, function2, abstractC3360k}, this, changeQuickRedirect, false, 35);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        C106862S5w.LIZ(context, dataCenter, function2, abstractC3360k);
        AbstractC3475n abstractC3475n = this.openPlatformService;
        if (abstractC3475n != null) {
            return abstractC3475n.LIZ(context, dataCenter, function2, abstractC3360k);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<C5176i<C3387w>> notifyServerGameStart(long j, long j2, String str, long j3) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str2, new Long(j3)}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        ALogger.m15801d("InteractGameService", "game/status/start: gameId " + j + ", roomId: " + j2 + ", gameToken: " + j3);
        BroadcastGameApi LIZ = C82036IVa.LIZIZ.LIZ();
        if (str2 == null) {
            str2 = "";
        }
        return LIZ.notifyServerGameStart(j, j2, str2, j3);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void tryGetSwitchGameConfirmDialog(C3384q c3384q, Context context, DataCenter dataCenter, Function0<Unit> function0, Function0<Unit> function02) {
        if (PatchProxy.proxy(new Object[]{c3384q, context, dataCenter, function0, function02}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3384q, context, dataCenter, function0, function02);
        AbstractC3357f abstractC3357f = this.gameAnchorService;
        if (abstractC3357f != null) {
            abstractC3357f.LIZ(c3384q, context, dataCenter, function0, function02);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final void confirmGameException(Context context, DataCenter dataCenter, C3384q c3384q, boolean z, Throwable th) {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[]{context, dataCenter, c3384q, Byte.valueOf(z ? (byte) 1 : (byte) 0), th}, this, changeQuickRedirect, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, dataCenter, c3384q, th);
        if ((th instanceof ApiException) && ((ApiException) th).mErrorCode == 4014029) {
            WeakReference<Dialog> weakReference = this.exceptionDialog;
            if (weakReference != null && (dialog = weakReference.get()) != null && dialog.isShowing()) {
                return;
            }
            v$a v_a = new v$a(context);
            v_a.LIZ(0);
            v$a LIZIZ = v_a.LIZLLL(2131588500).mo15264LJ(2131588505).LIZIZ(0, 2131588502, new KWN(th, c3384q, z, dataCenter));
            LIZIZ.LIZIZ(false);
            DialogC88906L1g LIZLLL = LIZIZ.LIZLLL();
            this.exceptionDialog = new WeakReference<>(LIZLLL);
            C116971W2r.LIZJ(LIZLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void confirmGameStartFailed(android.content.Context r6, com.bytedance.ies.sdk.widgets.DataCenter r7, com.bytedance.android.live.broadcastgame.api.model.C3384q r8, int r9, java.lang.Throwable r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
        /*
            r5 = this;
            r0 = 6
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r6
            r4 = 1
            r2[r4] = r7
            r0 = 2
            r2[r0] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r2[r0] = r10
            r0 = 5
            r2[r0] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.InteractGameService.changeQuickRedirect
            r0 = 30
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L26
            return
        L26:
            p003X.C106862S5w.LIZ(r6, r7, r8, r10)
            r0 = 4014029(0x3d3fcd, float:5.624853E-39)
            if (r9 != r0) goto L64
            r1 = 2131588504(0x7f0d7598, float:1.8803173E38)
        L31:
            r2 = 2131588501(0x7f0d7595, float:1.8803167E38)
        L34:
            com.bytedance.android.livesdk.widget.v$a r0 = new com.bytedance.android.livesdk.widget.v$a
            r0.<init>(r6)
            r0.LIZ(r3)
            com.bytedance.android.livesdk.widget.v$a r1 = r0.LIZLLL(r1)
            r0 = 2131588505(0x7f0d7599, float:1.8803175E38)
            com.bytedance.android.livesdk.widget.v$a r1 = r1.mo15264LJ(r0)
            X.KVm r0 = new X.KVm
            r0.<init>(r10, r8, r7)
            com.bytedance.android.livesdk.widget.v$a r2 = r1.LIZIZ(r4, r2, r0)
            r2.LIZIZ(r3)
            if (r11 == 0) goto L60
            r1 = 2131588503(0x7f0d7597, float:1.880317E38)
            X.Kbc r0 = new X.Kbc
            r0.<init>(r11)
            r2.LIZIZ(r3, r1, r0)
        L60:
            r2.LIZJ()
            return
        L64:
            r1 = 2131588500(0x7f0d7594, float:1.8803165E38)
            if (r9 == r0) goto L31
            r2 = 2131588502(0x7f0d7596, float:1.8803169E38)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.InteractGameService.confirmGameStartFailed(android.content.Context, com.bytedance.ies.sdk.widgets.DataCenter, com.bytedance.android.live.broadcastgame.api.model.q, int, java.lang.Throwable, kotlin.jvm.functions.Function0):void");
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService
    public final Observable<C5176i<Object>> notifyServerGameStop(long j, long j2, long j3, String str, boolean z, int i, long j4) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        ALogger.m15801d("InteractGameService", "game/status/stop: gameId " + j + ", roomId: " + j2 + ", gameToken: " + j4 + ", stopReason: " + i);
        BroadcastGameApi LIZ = C82036IVa.LIZIZ.LIZ();
        if (str2 == null) {
            str2 = "";
        }
        return LIZ.notifyServerGameStop(j, j2, j3, str2, z, i, j4);
    }
}
