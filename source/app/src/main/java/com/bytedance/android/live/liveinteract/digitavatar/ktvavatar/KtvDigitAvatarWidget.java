package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4269g;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.C4383i;
import com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarMsgController;
import com.bytedance.android.live.liveinteract.digitavatar.ktvavatar.KtvSingModeProcessor;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.api.KtvDigitAvatarApi;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.C7013k;
import com.bytedance.android.livesdk.ktvapi.AbstractC8050a;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9542o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC449173pf;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C17X;
import p003X.C17Y;
import p003X.C17Z;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C30K;
import p003X.C3809617a;
import p003X.C3809717b;
import p003X.C3809817c;
import p003X.C79046HEa;
import p003X.C79216HKo;
import p003X.C80402Hme;
import p003X.C80403Hmf;
import p003X.C80404Hmg;
import p003X.C80405Hmh;
import p003X.C80407Hmj;
import p003X.C80408Hmk;
import p003X.C80410Hmm;
import p003X.C80412Hmo;
import p003X.C80413Hmp;
import p003X.C80414Hmq;
import p003X.C80420Hmw;
import p003X.C80421Hmx;
import p003X.C80430Hn6;
import p003X.C80432Hn8;
import p003X.C80438HnE;
import p003X.C80470Hnk;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.H6G;
import p003X.HH8;
import p003X.HHB;
import p003X.IHF;
import p003X.IHG;
import p003X.IHH;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class KtvDigitAvatarWidget extends RoomWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;
    public DigitAvatarMsgController LIZLLL;

    /* renamed from: LJ */
    public KtvSingModeProcessor f26309LJ;
    public KtvMusic LJFF;
    public C80405Hmh LJII;
    public final HHB LJIIIIZZ;
    public final HSImageView LJIIIZ;
    public Disposable LJIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public C80470Hnk LJIJ;
    public final C7013k LJIJI;
    public final C7013k LJIJJ;
    public final View LJIJJLI;
    public long LIZIZ = System.currentTimeMillis();
    public final CompositeDisposable LJIIJ = new CompositeDisposable();
    public final C30K<Integer> LJIIJJI = new C80410Hmm(this);
    public final C80407Hmj LJIILIIL = new C80407Hmj(this);
    public final Handler LJIILJJIL = new Handler(Looper.getMainLooper());
    public KtvSingMode LJI = KtvSingMode.AUDIO;
    public final C80430Hn6 LJIIZILJ = new C80430Hn6(null, 1);

    static {
        Covode.recordClassIndex(26647);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LIZ() {
        if (this.LJI == KtvSingMode.DIGIT_AVATAR) {
            return true;
        }
        return false;
    }

    private final void LIZJ() {
        C2WC<C4383i> LIZIZ;
        C4383i LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        C4382d LIZ3 = C4382d.LIZLLL.LIZ();
        if (LIZ3 != null && (LIZIZ = LIZ3.LIZIZ()) != null && (LIZ2 = LIZIZ.LIZ()) != null && (LIZ2.LJFF || LIZ2.LIZIZ || !LIZ2.LIZ())) {
            ALogger.m15797i("KtvDigitAvatar", "getAvatarAuditResult：用户已经审核过了，或者没有设置自定义形象，so不用真正发请求");
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "fire getAvatarAuditResult(), 开始从server请求avatar审核结果");
        this.LJIIJ.add(((KtvDigitAvatarApi) C88306Kqq.LIZ().LIZ(KtvDigitAvatarApi.class)).getAvatarAuditResult().compose(C100839PnV.LIZJ()).subscribe(new C80438HnE(this), C80412Hmo.LIZIZ));
    }

    public final void LIZIZ() {
        Disposable disposable;
        Observable<AbstractC8050a> observeOn;
        AbstractC81278I1w abstractC81278I1w;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        if (this.LJFF != null) {
            Disposable disposable2 = this.LJIIL;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            Observable<AbstractC8050a> musicPlayProgressObservable = ((IKtvService) ServiceManager.getService(IKtvService.class)).getMusicPlayProgressObservable();
            if (musicPlayProgressObservable != null && (observeOn = musicPlayProgressObservable.observeOn(AndroidSchedulers.mainThread())) != null && (abstractC81278I1w = (AbstractC81278I1w) observeOn.m151as(C148062fT6.LIZ(this))) != null) {
                disposable = abstractC81278I1w.LIZ(new C80414Hmq(this), C17X.LIZ);
            } else {
                disposable = null;
            }
            this.LJIIL = disposable;
            return;
        }
        Disposable disposable3 = this.LJIIL;
        if (disposable3 != null) {
            disposable3.dispose();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C2WC<KtvSingMode> LIZ2;
        KtvSingMode LIZ3;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroy();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ("livedigitavatar");
        this.LJIIIIZZ.LIZIZ(this.LJIILIIL);
        Disposable disposable = this.LJIIL;
        if (disposable != null) {
            disposable.dispose();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILLIIL = LJJJI.LJIILLIIL()) != null && (LIZIZ = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ.removeMessageListener(this);
        }
        DigitAvatarMsgController digitAvatarMsgController = this.LIZLLL;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZIZ();
        DigitAvatarMsgController digitAvatarMsgController2 = this.LIZLLL;
        if (digitAvatarMsgController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController2.LIZIZ = null;
        this.LJIIZILJ.LIZJ = null;
        C80470Hnk c80470Hnk = this.LJIJ;
        if (c80470Hnk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], c80470Hnk, C80470Hnk.LIZ, false, 5).isSupported) {
            c80470Hnk.LIZIZ.clear();
            c80470Hnk.LIZLLL.onComplete();
        }
        this.LJIILJJIL.removeCallbacksAndMessages(null);
        C79046HEa.LIZ().LIZ((C30K) this.LJIIJJI);
        C4382d LIZ4 = C4382d.LIZLLL.LIZ();
        if (LIZ4 != null) {
            LIZ4.LJIILIIL();
        }
        C4382d LIZ5 = C4382d.LIZLLL.LIZ();
        if (LIZ5 != null && (LIZ2 = LIZ5.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7148dQ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Integer.valueOf(LIZ3.type));
        }
        this.LJIIJ.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC5436a LJIJ;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        boolean z;
        Observable<AbstractC449173pf<KtvMusic>> LIZIZ;
        AbstractC81278I1w abstractC81278I1w;
        Observable<Boolean> LIZIZ2;
        AbstractC81278I1w abstractC81278I1w2;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ3;
        AbstractC413402Xu<Boolean> LJIILJJIL2;
        AbstractC413402Xu<Boolean> LJIILJJIL3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Pair LIZ2 = IQV.LIZ((Function0) new KtvDigitAvatarWidget$onCreate$pair$1(this));
        ((IInteractService) ServiceManager.getService(IInteractService.class)).addBusinessDegradeStrategy(this.LJIJI);
        ((IInteractService) ServiceManager.getService(IInteractService.class)).addBusinessDegradeStrategy(this.LJIJJ);
        IQX.LIZ((C13491f) LIZ2.getFirst(), C4382d.class);
        this.LJIIJ.add((Disposable) LIZ2.getSecond());
        C80432Hn8.LIZIZ();
        C4382d c4382d = (C4382d) LIZ2.getFirst();
        this.LJI = c4382d.LIZ().LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        KtvMusic ktvMusic = null;
        if (proxy.isSupported) {
            LJIJ = (AbstractC5436a) proxy.result;
        } else {
            C5923dp LJJJI = LJJJI();
            if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
                AbstractC5004d LIZ3 = AbstractC5004d.LIZIZ.LIZ();
                if (LIZ3 != null) {
                    LJIJ = LIZ3.LJIJJLI();
                }
                LJIJ = null;
            } else {
                AbstractC5015e LIZ4 = AbstractC5015e.LIZIZ.LIZ();
                if (LIZ4 != null) {
                    LJIJ = LIZ4.LJIJ();
                }
                LJIJ = null;
            }
        }
        this.LIZLLL = new DigitAvatarMsgController(LJIJ);
        DigitAvatarMsgController digitAvatarMsgController = this.LIZLLL;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZ();
        DigitAvatarMsgController digitAvatarMsgController2 = this.LIZLLL;
        if (digitAvatarMsgController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJII = new C80405Hmh(digitAvatarMsgController2, this.LJI);
        KtvSingMode ktvSingMode = this.LJI;
        DigitAvatarMsgController digitAvatarMsgController3 = this.LIZLLL;
        if (digitAvatarMsgController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJIILJJIL3 = LJJJI2.LJIILJJIL()) != null && LJIILJJIL3.LIZIZ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f26309LJ = new KtvSingModeProcessor(ktvSingMode, false, digitAvatarMsgController3, z);
        this.LJIJ = new C80470Hnk(this.LJIIIZ, this.LJIJJLI);
        C80470Hnk c80470Hnk = this.LJIJ;
        if (c80470Hnk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) c80470Hnk.LIZLLL.observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(new C80408Hmk(this), C17Z.LIZ);
        C5923dp LJJJI3 = LJJJI();
        if (LJJJI3 == null || (LJIILJJIL2 = LJJJI3.LJIILJJIL()) == null || !LJIILJJIL2.LIZIZ().booleanValue()) {
            this.LJIIIIZZ.LIZ(this.LJIILIIL);
        }
        C5923dp LJJJI4 = LJJJI();
        if (LJJJI4 != null && (LJIILLIIL = LJJJI4.LJIILLIIL()) != null && (LIZIZ3 = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ3.addMessageListener(MessageType.LINKER.LIZ(), this);
        }
        C2WD<KtvMusic> currentSongOfSelf = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentSongOfSelf();
        if (currentSongOfSelf != null) {
            ktvMusic = currentSongOfSelf.LIZ();
        }
        this.LJFF = ktvMusic;
        C2WC<Boolean> currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger();
        if (currentIsSinger != null && (LIZIZ2 = currentIsSinger.LIZIZ()) != null && (abstractC81278I1w2 = (AbstractC81278I1w) LIZIZ2.m151as(C148062fT6.LIZ(this))) != null) {
            abstractC81278I1w2.LIZ(new C80413Hmp(this), C3809617a.LIZ);
        }
        C2WD<KtvMusic> currentSongOfSelf2 = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentSongOfSelf();
        if (currentSongOfSelf2 != null && (LIZIZ = currentSongOfSelf2.LIZIZ()) != null && (abstractC81278I1w = (AbstractC81278I1w) LIZIZ.m151as(C148062fT6.LIZ(this))) != null) {
            abstractC81278I1w.LIZ(new C80403Hmf(this), C3809717b.LIZ);
        }
        C79046HEa LIZ5 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
        LIZ(LIZ5.LIZJ());
        C79046HEa.LIZ().LIZIZ(this.LJIIJJI);
        ((AbstractC81278I1w) c4382d.LIZ().LIZIZ().m151as(C148062fT6.LIZ(this))).LIZ(new H6G(this), C3809817c.LIZ);
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ(C4269g.class).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(new C79216HKo(this), C17Y.LIZ);
        DigitAvatarMsgController digitAvatarMsgController4 = this.LIZLLL;
        if (digitAvatarMsgController4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController4.LIZIZ = new C80402Hme(this);
        this.LJIIZILJ.LIZJ = new C80404Hmg(this);
    }

    public static final /* synthetic */ KtvSingModeProcessor LIZ(KtvDigitAvatarWidget ktvDigitAvatarWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ktvDigitAvatarWidget}, null, LIZ, true, 14);
        if (proxy.isSupported) {
            return (KtvSingModeProcessor) proxy.result;
        }
        KtvSingModeProcessor ktvSingModeProcessor = ktvDigitAvatarWidget.f26309LJ;
        if (ktvSingModeProcessor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return ktvSingModeProcessor;
    }

    public static final /* synthetic */ DigitAvatarMsgController LIZIZ(KtvDigitAvatarWidget ktvDigitAvatarWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ktvDigitAvatarWidget}, null, LIZ, true, 16);
        if (proxy.isSupported) {
            return (DigitAvatarMsgController) proxy.result;
        }
        DigitAvatarMsgController digitAvatarMsgController = ktvDigitAvatarWidget.LIZLLL;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return digitAvatarMsgController;
    }

    public final void LIZ(AbstractC8050a abstractC8050a) {
        if (PatchProxy.proxy(new Object[]{abstractC8050a}, this, LIZ, false, 8).isSupported || !this.LJIILL) {
            return;
        }
        if (Intrinsics.areEqual(abstractC8050a, IHG.LIZ)) {
            C80405Hmh c80405Hmh = this.LJII;
            if (c80405Hmh == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c80405Hmh.LIZLLL = 0;
            KtvSingMode ktvSingMode = c80405Hmh.LIZJ;
            KtvSingMode ktvSingMode2 = KtvSingMode.DIGIT_AVATAR;
        } else if (Intrinsics.areEqual(abstractC8050a, IHH.LIZ)) {
            C80405Hmh c80405Hmh2 = this.LJII;
            if (c80405Hmh2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c80405Hmh2.LIZLLL = 0;
            KtvSingMode ktvSingMode3 = c80405Hmh2.LIZJ;
            KtvSingMode ktvSingMode4 = KtvSingMode.DIGIT_AVATAR;
        } else if (abstractC8050a instanceof IHF) {
            C80405Hmh c80405Hmh3 = this.LJII;
            if (c80405Hmh3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            long j = ((IHF) abstractC8050a).LIZ;
            if (!PatchProxy.proxy(new Object[]{new Long(j)}, c80405Hmh3, C80405Hmh.LIZ, false, 2).isSupported) {
                if (c80405Hmh3.LIZJ != KtvSingMode.DIGIT_AVATAR) {
                    if (c80405Hmh3.LIZLLL != 0) {
                        c80405Hmh3.LIZLLL = 0;
                        return;
                    }
                    return;
                }
                c80405Hmh3.LIZ(j);
            }
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 11).isSupported && (iMessage instanceof C8874fl)) {
            C8874fl c8874fl = (C8874fl) iMessage;
            if (c8874fl.LIZIZ == 20) {
                C9542o c9542o = c8874fl.LJJIIZI;
                if (c9542o != null) {
                    ALogger.m15797i("KtvDigitAvatar", "收到server审核结果消息。result=" + c9542o.LIZ + ", reason=" + c9542o.LIZIZ + '}');
                    if (c9542o.LIZ == 2) {
                        C88440Kt0.LIZ(2131584629);
                    }
                    LIZ(c9542o.LIZJ, c9542o.LIZ, c9542o.LIZIZ);
                    return;
                }
                ALogger.m15795w("KtvDigitAvatar", "收到server审核结果消息,但是avatarAuditContent=null");
            }
        }
    }

    public final void LIZ(KtvSingMode ktvSingMode) {
        Disposable disposable;
        Disposable disposable2;
        C7013k c7013k;
        boolean z;
        C7013k c7013k2;
        if (PatchProxy.proxy(new Object[]{ktvSingMode}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (ktvSingMode == KtvSingMode.DIGIT_AVATAR && (c7013k2 = this.LJIJI) != null && c7013k2.LIZJ && ktvSingMode != KtvSingMode.AUDIO) {
            C88440Kt0.LIZ("房间性能异常，暂不支持开启虚拟形象");
            return;
        }
        if (ktvSingMode == KtvSingMode.VIDEO && (c7013k = this.LJIJJ) != null) {
            if (C7013k.LJII >= c7013k.LJI.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            c7013k.LIZJ = z;
            if (!c7013k.LIZJ) {
                c7013k.LIZLLL = 0;
            }
            if (c7013k.LIZJ && ktvSingMode != KtvSingMode.AUDIO) {
                C88440Kt0.LIZ("房间性能异常，暂不支持视频及虚拟形象模式");
                return;
            }
        }
        if (ktvSingMode == KtvSingMode.VIDEO && this.LJIILLIIL) {
            this.LJIILLIIL = false;
        }
        this.LJI = ktvSingMode;
        if (LIZ() && (((disposable2 = this.LJIIL) == null || disposable2.isDisposed()) && this.LJFF != null)) {
            LIZIZ();
        } else {
            Disposable disposable3 = this.LJIIL;
            if (disposable3 != null && !disposable3.isDisposed() && !LIZ() && (disposable = this.LJIIL) != null) {
                disposable.dispose();
            }
        }
        KtvSingModeProcessor ktvSingModeProcessor = this.f26309LJ;
        if (ktvSingModeProcessor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{ktvSingMode}, ktvSingModeProcessor, KtvSingModeProcessor.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(ktvSingMode);
            if (ktvSingModeProcessor.LJII != ktvSingMode) {
                KtvSingMode ktvSingMode2 = ktvSingModeProcessor.LJII;
                ktvSingModeProcessor.LJII = ktvSingMode;
                if (ktvSingModeProcessor.LJIIIIZZ) {
                    ktvSingModeProcessor.LIZ(ktvSingMode2, C80420Hmw.LJFF, ktvSingMode);
                    ktvSingModeProcessor.LIZ(ktvSingMode, KtvSingModeProcessor.SingModeStartType.SingModeChange);
                }
            }
        }
        C80405Hmh c80405Hmh = this.LJII;
        if (c80405Hmh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{ktvSingMode}, c80405Hmh, C80405Hmh.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(ktvSingMode);
            if (c80405Hmh.LIZJ != ktvSingMode) {
                c80405Hmh.LIZLLL = 0;
            }
            c80405Hmh.LIZJ = ktvSingMode;
        }
        C80470Hnk c80470Hnk = this.LJIJ;
        if (c80470Hnk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{ktvSingMode}, c80470Hnk, C80470Hnk.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(ktvSingMode);
            if (c80470Hnk.LIZ()) {
                c80470Hnk.LIZJ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(boolean z) {
        StringBuilder sb;
        C4382d LIZ2;
        C2WC<KtvSingMode> LIZ3;
        KtvSingMode ktvSingMode;
        C2WC<KtvSingMode> LIZ4;
        C2WC<KtvSingMode> LIZ5;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (z != 0) {
            sb = new StringBuilder("轮到我开始演唱了, 演唱模式singMode=");
        } else {
            sb = new StringBuilder("我演唱完了, 演唱模式singMode=");
        }
        sb.append(this.LJI);
        ALogger.m15797i("KtvDigitAvatar", sb.toString());
        this.LJIILL = z;
        if (z == 0) {
            if (this.f26309LJ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else if (((IKtvService) ServiceManager.getService(IKtvService.class)).isKtvChallengeModeOpen() && (LIZ2 = C4382d.LIZLLL.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null && LIZ3.LIZ() != null) {
            C4382d LIZ6 = C4382d.LIZLLL.LIZ();
            if (LIZ6 != null && (LIZ5 = LIZ6.LIZ()) != null) {
                ktvSingMode = LIZ5.LIZ();
            } else {
                ktvSingMode = null;
            }
            if (ktvSingMode != KtvSingMode.AUDIO) {
                C88440Kt0.LIZ(2131584672);
                C4382d LIZ7 = C4382d.LIZLLL.LIZ();
                if (LIZ7 != null && (LIZ4 = LIZ7.LIZ()) != null) {
                    LIZ4.LIZ(KtvSingMode.AUDIO);
                    return;
                }
                return;
            }
        }
        KtvSingModeProcessor ktvSingModeProcessor = this.f26309LJ;
        if (ktvSingModeProcessor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, ktvSingModeProcessor, KtvSingModeProcessor.LIZ, false, 2).isSupported && ktvSingModeProcessor.LJIIIIZZ != z) {
            ktvSingModeProcessor.LJIIIIZZ = z;
            if (z != 0) {
                ktvSingModeProcessor.LIZ(ktvSingModeProcessor.LJII, KtvSingModeProcessor.SingModeStartType.BeSinger);
            } else {
                KtvSingMode ktvSingMode2 = ktvSingModeProcessor.LJII;
                C80421Hmx c80421Hmx = C80421Hmx.LJFF;
                if (!PatchProxy.proxy(new Object[]{ktvSingModeProcessor, ktvSingMode2, c80421Hmx, null, 4, null}, null, KtvSingModeProcessor.LIZ, true, 11).isSupported) {
                    ktvSingModeProcessor.LIZ(ktvSingMode2, c80421Hmx, null);
                }
            }
        }
        C80470Hnk c80470Hnk = this.LJIJ;
        if (c80470Hnk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, c80470Hnk, C80470Hnk.LIZ, false, 1).isSupported && c80470Hnk.LIZ()) {
            c80470Hnk.LIZJ();
        }
    }

    public final void LIZ(boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (z) {
            str = "我上麦位了";
        } else {
            str = "我下麦位了";
        }
        ALogger.m15797i("KtvDigitAvatar", str);
        if (z) {
            ALogger.m15797i("KtvDigitAvatar", "start pre download digit avatar stickers");
            this.LJIIZILJ.LIZ();
            LIZJ();
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null) {
                LIZ2.LJIILL();
            }
        }
    }

    public KtvDigitAvatarWidget(HHB hhb, HSImageView hSImageView, View view) {
        C106862S5w.LIZ(hhb, hSImageView, view);
        this.LJIIIIZZ = hhb;
        this.LJIIIZ = hSImageView;
        this.LJIJJLI = view;
        C7013k LIZ2 = C7013k.LJIIIIZZ.LIZ("ktv_open_avatar");
        if (LIZ2 != null) {
            LIZ2.LIZ(new KtvDigitAvatarWidget$$special$$inlined$apply$lambda$1(this));
        } else {
            LIZ2 = null;
        }
        this.LJIJI = LIZ2;
        C7013k LIZ3 = C7013k.LJIIIIZZ.LIZ("ktv_video_preview");
        if (LIZ3 != null) {
            LIZ3.LIZ(new KtvDigitAvatarWidget$$special$$inlined$apply$lambda$2(this));
        } else {
            LIZ3 = null;
        }
        this.LJIJJ = LIZ3;
    }

    public final void LIZ(long j, long j2, String str) {
        C4382d LIZ2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ3;
        C2WC<C4383i> LIZIZ2;
        C4383i LIZ4;
        C2WC<C4383i> LIZIZ3;
        C4383i LIZ5;
        C2WC<C4383i> LIZIZ4;
        C4383i LIZ6;
        C2WC<C4383i> LIZIZ5;
        C4383i LIZ7;
        C2WC<C4383i> LIZIZ6;
        C4383i LIZ8;
        C2WC<C4383i> LIZIZ7;
        C4383i LIZ9;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str}, this, LIZ, false, 13).isSupported && (LIZ2 = C4382d.LIZLLL.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null && (LIZ3 = LIZIZ.LIZ()) != null && LIZ3.LIZ() && !LIZ3.LJFF) {
            HH8.LIZIZ.LIZ(j, LIZ3.LJI, j2, str);
            if (j == LIZ3.LJI) {
                if (j2 == 1) {
                    C88440Kt0.LIZ(2131582907);
                    C4382d LIZ10 = C4382d.LIZLLL.LIZ();
                    if (LIZ10 != null && (LIZIZ7 = LIZ10.LIZIZ()) != null && (LIZ9 = LIZIZ7.LIZ()) != null) {
                        LIZ9.LIZLLL = true;
                    }
                    C4382d LIZ11 = C4382d.LIZLLL.LIZ();
                    if (LIZ11 != null && (LIZIZ6 = LIZ11.LIZIZ()) != null && (LIZ8 = LIZIZ6.LIZ()) != null) {
                        LIZ8.LJFF = true;
                    }
                    KtvSingModeProcessor ktvSingModeProcessor = this.f26309LJ;
                    if (ktvSingModeProcessor == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ktvSingModeProcessor.LIZ(true);
                    C4382d LIZ12 = C4382d.LIZLLL.LIZ();
                    if (LIZ12 != null) {
                        LIZ12.LJIILIIL();
                        return;
                    }
                    return;
                } else if (j2 != 2) {
                    return;
                } else {
                    C88440Kt0.LIZ(2131582906);
                    C4382d LIZ13 = C4382d.LIZLLL.LIZ();
                    if (LIZ13 != null && (LIZIZ5 = LIZ13.LIZIZ()) != null && (LIZ7 = LIZIZ5.LIZ()) != null) {
                        LIZ7.LIZLLL = false;
                    }
                    C4382d LIZ14 = C4382d.LIZLLL.LIZ();
                    if (LIZ14 != null && (LIZIZ4 = LIZ14.LIZIZ()) != null && (LIZ6 = LIZIZ4.LIZ()) != null) {
                        LIZ6.LJFF = true;
                    }
                    KtvSingModeProcessor ktvSingModeProcessor2 = this.f26309LJ;
                    if (ktvSingModeProcessor2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    ktvSingModeProcessor2.LIZ(false);
                    C4382d LIZ15 = C4382d.LIZLLL.LIZ();
                    if (LIZ15 == null) {
                        return;
                    }
                    LIZ15.LJIILIIL();
                    return;
                }
            }
            ALogger.m15797i("KtvDigitAvatar", "收到的审核auditID(" + j + ")和本地avatar保存的id(" + LIZ3.LJI + ")不一致");
            if (LIZ3.LIZIZ || LIZ3.LJFF) {
                return;
            }
            C88440Kt0.LIZ(2131582906);
            C4382d LIZ16 = C4382d.LIZLLL.LIZ();
            if (LIZ16 != null && (LIZIZ3 = LIZ16.LIZIZ()) != null && (LIZ5 = LIZIZ3.LIZ()) != null) {
                LIZ5.LIZLLL = false;
            }
            C4382d LIZ17 = C4382d.LIZLLL.LIZ();
            if (LIZ17 != null && (LIZIZ2 = LIZ17.LIZIZ()) != null && (LIZ4 = LIZIZ2.LIZ()) != null) {
                LIZ4.LJFF = true;
            }
            KtvSingModeProcessor ktvSingModeProcessor3 = this.f26309LJ;
            if (ktvSingModeProcessor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ktvSingModeProcessor3.LIZ(false);
            C4382d LIZ18 = C4382d.LIZLLL.LIZ();
            if (LIZ18 == null) {
                return;
            }
            LIZ18.LJIILIIL();
        }
    }
}
