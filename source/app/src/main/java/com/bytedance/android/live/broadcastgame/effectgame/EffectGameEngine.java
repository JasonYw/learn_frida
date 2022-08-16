package com.bytedance.android.live.broadcastgame.effectgame;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.game.BEFGameView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.channel.AbstractC3444w;
import com.bytedance.android.live.broadcastgame.common.network.AnchorGameApi;
import com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3467i;
import com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j;
import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.LiveGameMusicControl;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.soundeffect.SoundRepelContext;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.message.model.MusicPanel;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C449833qj;
import p003X.C77061GZr;
import p003X.C77062GZs;
import p003X.C82036IVa;
import p003X.C87308Kak;
import p003X.C88303Kqn;
import p003X.C91301Ly3;
import p003X.IQV;
import p003X.KUH;
import p003X.KUQ;
import p003X.KUS;
import p003X.KV2;
import p003X.KVC;
import p003X.KVD;
import p003X.KVE;
import p003X.KVG;
import p003X.KVH;
import p003X.KVI;
import p003X.KVQ;
import p003X.KVV;
import p003X.KW0;
import p003X.KYP;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class EffectGameEngine implements Observer<KVData>, MessageCenter.Listener, AbstractC3444w, AbstractC3468j, WeakHandler.IHandler, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public C3384q LIZIZ;
    public Sticker LIZJ;
    public IFilterManager LIZLLL;

    /* renamed from: LJ */
    public KVQ f26045LJ;
    public long LJFF;
    public final C88303Kqn LJI;
    public final Context LJII;
    public final long LJIIIIZZ;
    public final FragmentManager LJIIIZ;
    public final KVC LJIIJ;
    public final AbstractC5436a LJIIJJI;
    public DataCenter LJIIL;
    public AbstractC3467i LJIILIIL;
    public KVG LJIILJJIL;
    public WeakHandler LJIILL;
    public IMessageManager LJIILLIIL;
    public final HandlerThread LJIIZILJ;
    public String LJIJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public JsFuncInjector LJJIFFI;
    public String LJJII;
    public int LJIJI = 1;
    public CompositeDisposable LJIJJ = new CompositeDisposable();
    public final Lazy LJJI = LazyKt__LazyJVMKt.lazy(new EffectGameEngine$jsBridgeManager$2(this));
    public volatile STATE LJJIII = STATE.INIT;

    /* loaded from: classes5.dex */
    public enum STATE {
        INIT,
        GUIDE,
        START,
        DESTROY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19728);
        }

        public static STATE valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (STATE) (proxy.isSupported ? proxy.result : Enum.valueOf(STATE.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static STATE[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (STATE[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19727);
    }

    private final AbstractC3940c LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC3940c) (proxy.isSupported ? proxy.result : this.LJJI.mo27335getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if (r11 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.Sticker r17, com.bytedance.android.live.broadcastgame.api.model.C3384q r18, java.util.Map<java.lang.String, ? extends java.lang.Object> r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LIZ(com.bytedance.android.livesdkapi.depend.model.Sticker, com.bytedance.android.live.broadcastgame.api.model.q, java.util.Map):void");
    }

    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    public final synchronized boolean LIZ() {
        MethodCollector.m14708i(1416);
        if (this.LJJIII == STATE.INIT || this.LJJIII == STATE.DESTROY) {
            MethodCollector.m14707o(1416);
            return false;
        }
        MethodCollector.m14707o(1416);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bytedance.live.datacontext.f] */
    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    public final void LIZ(boolean z, int i, String str) {
        C2WC<Boolean> LIZJ;
        MethodCollector.m14708i(1420);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1420);
            return;
        }
        synchronized (this) {
            try {
                if (this.LJJIII == STATE.DESTROY) {
                    MethodCollector.m14707o(1420);
                    return;
                }
                LIZ(STATE.DESTROY);
                AbstractC3467i abstractC3467i = this.LJIILIIL;
                if (abstractC3467i == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC3467i.LIZ(z, i, str);
                LJIIIIZZ();
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
                    Observable.create(new KVD(this)).subscribeOn(Schedulers.m138io()).subscribe();
                }
                IFilterManager iFilterManager = this.LIZLLL;
                if (iFilterManager != null) {
                    iFilterManager.stopEffectAudio();
                }
                KVQ kvq = this.f26045LJ;
                if (kvq != null) {
                    kvq.dismissAllowingStateLoss();
                }
                JsFuncInjector jsFuncInjector = this.LJJIFFI;
                if (jsFuncInjector != null) {
                    jsFuncInjector.LIZJ();
                }
                LIZ(str, z, false);
                if (i == 1) {
                    IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
                    C3384q c3384q = this.LIZIZ;
                    if (c3384q == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    iInteractGameMonitorService.logGameStop(0, c3384q, z);
                }
                ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("game_platform");
                KUH kuh = KUH.LIZIZ;
                C3384q c3384q2 = this.LIZIZ;
                if (c3384q2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                kuh.LIZIZ(c3384q2);
                this.LJIIJ.LIZ();
                this.LJFF = 0L;
                this.LJIJJ.clear();
                SoundRepelContext soundRepelContext = null;
                this.LJJII = null;
                ?? LIZ2 = IQV.LIZ("SoundRepelContext");
                if (LIZ2 instanceof SoundRepelContext) {
                    soundRepelContext = LIZ2;
                }
                SoundRepelContext soundRepelContext2 = soundRepelContext;
                if (soundRepelContext2 == null || (LIZJ = soundRepelContext2.LIZJ()) == null) {
                    MethodCollector.m14707o(1420);
                    return;
                }
                LIZJ.LIZ(Boolean.FALSE);
                MethodCollector.m14707o(1420);
            } catch (Throwable th) {
                MethodCollector.m14707o(1420);
                throw th;
            }
        }
    }

    private final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("runEffectGame sticker.id: ");
        Sticker sticker = this.LIZJ;
        if (sticker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        sb.append(sticker.getId());
        sb.append(", chooseMusic:");
        sb.append(z);
        ALogger.m15800e("EffectGameEngine", sb.toString());
        if (z) {
            LK1.LIZ(0L, false, false, new EffectGameEngine$runEffectGame$1(this), 7, null);
            return;
        }
        IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
        C3384q c3384q = this.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iInteractGameMonitorService.logEffectGameMusicShow(1, c3384q);
        LIZ(0);
        IInteractGameMonitorService iInteractGameMonitorService2 = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
        C3384q c3384q2 = this.LIZIZ;
        if (c3384q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iInteractGameMonitorService2.logEffectGameGuideVideoShow(1, c3384q2);
    }

    private final void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 24).isSupported) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("dataTable");
            if (optJSONObject == null) {
                return;
            }
            JSONObject LJIIIZ = LJIIIZ();
            Iterator<String> keys = optJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                LJIIIZ.put(next, optJSONObject.get(next));
            }
            C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7272w;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Map<String, String> LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.put(str, LJIIIZ.toString());
            C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7272w;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(LIZ2);
        } catch (Exception e) {
            ALogger.m15800e("EffectGameEngine", "saveGameData effectId: " + str + ", data: " + jSONObject + ", error: " + e);
            e.printStackTrace();
        }
    }

    private final void LIZ(String str, boolean z, boolean z2) {
        if (!PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 32).isSupported && this.LJFF != 0) {
            String str2 = null;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("music_choose", this.LJIL);
                    str2 = jSONObject.toString();
                } catch (Exception unused) {
                }
            }
            long j = this.LJFF;
            IInteractGameService iInteractGameService = (IInteractGameService) ServiceManager.getService(IInteractGameService.class);
            C3384q c3384q = this.LIZIZ;
            if (c3384q == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C3383p LJFF = c3384q.LJFF();
            long j2 = LJFF != null ? LJFF.LIZLLL : 0L;
            long j3 = this.LJIIIIZZ;
            long j4 = this.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            Observable<C5176i<Object>> observeOn = iInteractGameService.notifyServerGameStop(j2, j3, j4, str2, z, 1, this.LJIJJLI).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn, "");
            C449833qj LIZ2 = C100839PnV.LIZ(3);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            C91301Ly3.LIZ(observeOn, LIZ2).subscribe(new KUQ(this, j), new KUS(this, j));
            LIZ(z, z2);
            if (!z2) {
                LJIIJJI();
            }
            IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
            C3384q c3384q2 = this.LIZIZ;
            if (c3384q2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            iInteractGameMonitorService.logEffectGameEnd(z ? 1 : 0, c3384q2);
            this.LJFF = 0L;
            this.LJIJJLI = 0L;
            KYP.LIZIZ.LIZ();
        }
    }

    private final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C3384q c3384q = this.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c3384q.LJFF() == null) {
            return;
        }
        KW0 kw0 = KW0.LIZIZ;
        C3384q c3384q2 = this.LIZIZ;
        if (c3384q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        boolean z3 = !z ? 1 : 0;
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        boolean z4 = ((IInteractService) service).getPkService().LJIIIZ() == 1;
        IService service2 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        KW0.LIZ(kw0, null, c3384q2, z2, z3, z4, ((IInteractService) service2).getPkService().LJIIIZ() == 2, this.LJFF, null, null, false, 896, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.channel.AbstractC3444w
    public final void LIZ(int i, int i2, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 23).isSupported) {
            return;
        }
        if (str != null) {
            try {
                if (Intrinsics.areEqual(new JSONObject(str).optString("name"), "GAME_CONTROL_MESSAGE")) {
                    return;
                }
            } catch (Exception unused) {
            }
        }
        ALogger.m15800e("EffectGameEngine", "sendEffectMsg what: " + i + ", arg1:" + i2 + ", arg2:" + i3 + ", arg3:" + str);
        IFilterManager iFilterManager = this.LIZLLL;
        if (iFilterManager == null) {
            return;
        }
        iFilterManager.sendEffectMsg(i, i2, i3, str);
    }

    private synchronized boolean LJII() {
        MethodCollector.m14708i(1417);
        if (this.LJJIII == STATE.START) {
            MethodCollector.m14707o(1417);
            return true;
        }
        MethodCollector.m14707o(1417);
        return false;
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        ALogger.m15800e("EffectGameEngine", "stopPlayMusic ");
        IAudioFilterManager LJIILJJIL = this.LJIIJJI.LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.setEnable(false);
            LJIILJJIL.stop();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    public final void LIZJ() {
        BEFGameView bEFGameView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        KVC kvc = this.LJIIJ;
        if (!PatchProxy.proxy(new Object[0], kvc, KVC.LIZ, false, 2).isSupported && (bEFGameView = kvc.LIZIZ) != null) {
            bEFGameView.resumeGame();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    public final void LIZLLL() {
        BEFGameView bEFGameView;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        if (this.LJIIJ.LIZIZ != null) {
            KVC kvc = this.LJIIJ;
            if (!PatchProxy.proxy(new Object[0], kvc, KVC.LIZ, false, 3).isSupported && (bEFGameView = kvc.LIZIZ) != null) {
                bEFGameView.pauseGame();
            }
        }
        if (LJII()) {
            AbstractC3467i abstractC3467i = this.LJIILIIL;
            if (abstractC3467i == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC3467i.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    /* renamed from: LJ */
    public final void mo15850LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        MessageCenter.removeListener(this);
        DataCenter dataCenter = this.LJIIL;
        dataCenter.removeObserver("cmd_broadcast_game_music_control", this);
        dataCenter.removeObserver("cmd_broadcast_music_game_start", this);
        KVG kvg = this.LJIILJJIL;
        if (kvg != null) {
            kvg.LIZIZ();
        }
        LJI().LIZLLL();
        this.LJIJJ.clear();
        JsFuncInjector jsFuncInjector = this.LJJIFFI;
        if (jsFuncInjector != null) {
            jsFuncInjector.LIZJ();
        }
    }

    public final JSONObject LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        String str = this.LJJII;
        if (str == null) {
            JSONObject jSONObject = new JSONObject();
            Sticker sticker = this.LIZJ;
            if (sticker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            jSONObject.put("effectPath", sticker.getUnzipPath());
            return jSONObject;
        }
        return new JSONObject(str);
    }

    private final JSONObject LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7272w;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Map<String, String> LIZ2 = c87308Kak.LIZ();
        Sticker sticker = this.LIZJ;
        if (sticker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        String str = LIZ2.get(sticker.getEffectId());
        if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
            return new JSONObject(str);
        }
        return new JSONObject();
    }

    private final void LJIIJJI() {
        boolean z;
        boolean z2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        C3384q c3384q = this.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c3384q.LJFF() != null) {
            KW0 kw0 = KW0.LIZIZ;
            C3384q c3384q2 = this.LIZIZ;
            if (c3384q2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJJ;
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (((IInteractService) service).getPkService().LJIIIZ() == 1) {
                z = true;
            } else {
                z = false;
            }
            IService service2 = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service2, "");
            if (((IInteractService) service2).getPkService().LJIIIZ() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            KW0.LIZ(kw0, c3384q2, currentTimeMillis, z, z2, this.LJFF, 0L, null, null, false, 480, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LJIIJ() {
        /*
            r11 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LIZ
            r0 = 31
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r11, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            long r0 = java.lang.System.currentTimeMillis()
            r11.LJIJJLI = r0
            X.KYP r2 = p003X.KYP.LIZIZ
            long r0 = r11.LJIJJLI
            r2.LIZJ(r0)
            java.lang.Class<com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService> r0 = com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService.class
            com.bytedance.android.live.base.IService r3 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService r3 = (com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService) r3
            com.bytedance.android.live.broadcastgame.api.model.q r0 = r11.LIZIZ
            java.lang.String r2 = ""
            if (r0 != 0) goto L7e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L2e:
            r4 = 0
        L30:
            long r6 = r11.LJIIIIZZ
            com.bytedance.android.live.broadcastgame.api.model.q r0 = r11.LIZIZ
            if (r0 != 0) goto L73
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L39:
            r8 = r2
        L3a:
            long r9 = r11.LJIJJLI
            io.reactivex.Observable r1 = r3.notifyServerGameStart(r4, r6, r8, r9)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.m138io()
            io.reactivex.Observable r1 = r1.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r1 = r1.observeOn(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0 = 3
            X.3qj r0 = p003X.C100839PnV.LIZ(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            io.reactivex.Observable r2 = p003X.C91301Ly3.LIZ(r1, r0)
            X.KUP r1 = new X.KUP
            r1.<init>(r11)
            X.KUR r0 = new X.KUR
            r0.<init>(r11)
            io.reactivex.disposables.Disposable r1 = r2.subscribe(r1, r0)
            io.reactivex.disposables.CompositeDisposable r0 = r11.LJIJJ
            r0.add(r1)
            return
        L73:
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r0.LJFF()
            if (r0 == 0) goto L39
            java.lang.String r8 = r0.LJFF
            if (r8 != 0) goto L3a
            goto L39
        L7e:
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r0.LJFF()
            if (r0 == 0) goto L2e
            long r4 = r0.LIZLLL
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LJIIJ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L14;
     */
    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void LIZIZ() {
        /*
            r13 = this;
            monitor-enter(r13)
            r5 = 1419(0x58b, float:1.988E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r5)     // Catch: java.lang.Throwable -> Lb8
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LIZ     // Catch: java.lang.Throwable -> Lb8
            r0 = 3
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r13, r1, r2, r0)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.isSupported     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L19
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r13)
            return
        L19:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LIZ     // Catch: java.lang.Throwable -> Lb8
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r13, r1, r2, r0)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r1.isSupported     // Catch: java.lang.Throwable -> Lb8
            r3 = 1
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.result     // Catch: java.lang.Throwable -> Lb8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L8d
        L31:
            com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine$STATE r1 = r13.LJJIII     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine$STATE r0 = com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.STATE.INIT     // Catch: java.lang.Throwable -> Lb8
            if (r1 != r0) goto L8d
            com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine$STATE r0 = com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.STATE.GUIDE     // Catch: java.lang.Throwable -> Lb8
            r13.LIZ(r0)     // Catch: java.lang.Throwable -> Lb8
            r6 = 0
            r8 = 0
            r9 = 0
            com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine$startGame$1 r10 = new com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine$startGame$1     // Catch: java.lang.Throwable -> Lb8
            r10.<init>(r13)     // Catch: java.lang.Throwable -> Lb8
            r11 = 7
            r12 = 0
            p003X.LK1.LIZ(r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class<com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService> r0 = com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService.class
            com.bytedance.android.live.base.IService r3 = com.bytedance.android.live.utility.ServiceManager.getService(r0)     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService r3 = (com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService) r3     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.android.live.broadcastgame.api.model.q r1 = r13.LIZIZ     // Catch: java.lang.Throwable -> Lb8
            if (r1 != 0) goto L5b
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lb8
        L5b:
            r3.logEffectGameGuideVideoShow(r2, r1)     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)     // Catch: java.lang.Throwable -> Lb8
            goto L8b
        L62:
            com.bytedance.android.livesdkapi.depend.model.Sticker r1 = r13.LIZJ     // Catch: java.lang.Throwable -> Lb8
            if (r1 != 0) goto L6b
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lb8
        L6b:
            X.KUk r4 = r1.getGameInfo()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r4.LJI     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L8d
            int r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> Lb8
            if (r0 <= 0) goto L31
            X.Kak<java.util.Map<java.lang.String, java.lang.Double>> r1 = p003X.AbstractC80293Hkt.f7271v     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Throwable -> Lb8
            int r1 = r13.LIZ(r1)     // Catch: java.lang.Throwable -> Lb8
            int r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> Lb8
            if (r1 > r0) goto L8d
            goto L31
        L8b:
            monitor-exit(r13)
            return
        L8d:
            com.bytedance.android.livesdkapi.depend.model.Sticker r1 = r13.LIZJ     // Catch: java.lang.Throwable -> Lb8
            if (r1 != 0) goto L96
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lb8
        L96:
            X.KUk r0 = r1.getGameInfo()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.LJFF     // Catch: java.lang.Throwable -> Lb8
            r13.LIZ(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class<com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService> r0 = com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService.class
            com.bytedance.android.live.base.IService r2 = com.bytedance.android.live.utility.ServiceManager.getService(r0)     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService r2 = (com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService) r2     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.android.live.broadcastgame.api.model.q r1 = r13.LIZIZ     // Catch: java.lang.Throwable -> Lb8
            if (r1 != 0) goto Lb0
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lb8
        Lb0:
            r2.logEffectGameGuideVideoShow(r3, r1)     // Catch: java.lang.Throwable -> Lb8
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r13)
            return
        Lb8:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.LIZIZ():void");
    }

    private final synchronized void LIZ(STATE state) {
        MethodCollector.m14708i(1418);
        this.LJJIII = state;
        MethodCollector.m14707o(1418);
    }

    public static final /* synthetic */ Sticker LIZ(EffectGameEngine effectGameEngine) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{effectGameEngine}, null, LIZ, true, 39);
        if (proxy.isSupported) {
            return (Sticker) proxy.result;
        }
        Sticker sticker = effectGameEngine.LIZJ;
        if (sticker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return sticker;
    }

    public static final /* synthetic */ C3384q LIZIZ(EffectGameEngine effectGameEngine) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{effectGameEngine}, null, LIZ, true, 40);
        if (proxy.isSupported) {
            return (C3384q) proxy.result;
        }
        C3384q c3384q = effectGameEngine.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c3384q;
    }

    private final int LIZ(C87308Kak<Map<String, Double>> c87308Kak) {
        double d;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c87308Kak}, this, LIZ, false, 28);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Map<String, Double> LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        Map<String, Double> mutableMap = MapsKt__MapsKt.toMutableMap(LIZ2);
        Sticker sticker = this.LIZJ;
        if (sticker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Double d2 = mutableMap.get(sticker.getEffectId());
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        double d3 = d + 1.0d;
        Sticker sticker2 = this.LIZJ;
        if (sticker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        mutableMap.put(sticker2.getEffectId(), Double.valueOf(d3));
        c87308Kak.LIZ(mutableMap);
        return (int) d3;
    }

    private final void LIZIZ(boolean z) {
        boolean z2;
        boolean z3;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C3384q c3384q = this.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c3384q.LJFF() != null) {
            KW0 kw0 = KW0.LIZIZ;
            C3384q c3384q2 = this.LIZIZ;
            if (c3384q2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (((IInteractService) service).getPkService().LJIIIZ() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            IService service2 = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service2, "");
            if (((IInteractService) service2).getPkService().LJIIIZ() == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            KW0.LIZ(kw0, c3384q2, z, z2, z3, false, 16, (Object) null);
        }
    }

    private JSONObject LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 26);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("effectPath");
            if (!TextUtils.isEmpty(optString)) {
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Sticker sticker = this.LIZJ;
                if (sticker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) optString, (CharSequence) sticker.getUnzipPath(), false, 2, (Object) null)) {
                    return jSONObject;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            String optString = new JSONObject(str).optString("effectPath");
            if (!TextUtils.isEmpty(optString)) {
                Intrinsics.checkNotNullExpressionValue(optString, "");
                String str2 = KV2.LJII;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                if (StringsKt__StringsKt.contains$default((CharSequence) optString, (CharSequence) str2, false, 2, (Object) null)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String key;
        Pair pair;
        IFilterManager iFilterManager;
        LiveGameMusicControl liveGameMusicControl;
        String str;
        MusicPanel first;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 13).isSupported && kVData2 != null && (key = kVData2.getKey()) != null) {
            int hashCode = key.hashCode();
            if (hashCode != -1807648238) {
                if (hashCode == 131996889 && key.equals("cmd_broadcast_game_music_control") && (liveGameMusicControl = (LiveGameMusicControl) kVData2.getData()) != null) {
                    int i = KVV.LIZ[liveGameMusicControl.LIZJ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            LJIIIIZZ();
                            return;
                        }
                        return;
                    }
                    Pair<MusicPanel, MusicPanel> pair2 = liveGameMusicControl.LIZIZ;
                    LJIIIIZZ();
                    if (pair2 == null || (first = pair2.getFirst()) == null || (str = first.LIZJ) == null) {
                        str = "";
                    }
                    LIZ(str, new EffectGameEngine$onChanged$$inlined$let$lambda$1(this));
                }
            } else if (key.equals("cmd_broadcast_music_game_start") && (pair = (Pair) kVData2.getData()) != null) {
                this.LJIL = ((MusicPanel) pair.getFirst()).LJIIL.LIZIZ;
                String str2 = ((MusicPanel) pair.getFirst()).LIZJ;
                String str3 = ((MusicPanel) pair.getSecond()).LIZJ;
                if (!PatchProxy.proxy(new Object[]{str2, str3}, this, LIZ, false, 19).isSupported) {
                    LJIIIIZZ();
                    this.LJIJ = str2;
                    if (!TextUtils.isEmpty(str3)) {
                        Sticker sticker = this.LIZJ;
                        if (sticker == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        if (sticker.getGameInfo().f8495LJ && (iFilterManager = this.LIZLLL) != null) {
                            iFilterManager.updateEffAudioTimestampMs(0L);
                            iFilterManager.setMusicNodeFilePath(str3);
                        }
                    }
                    ALogger.m15800e("EffectGameEngine", C0002O.m25084C("chooseMusicFinish filePath: ", str2, ", beatInfoFile: ", str3));
                    LIZ(0);
                }
            }
        }
    }

    private final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{0}, this, LIZ, false, 21).isSupported) {
            return;
        }
        ALogger.m15800e("EffectGameEngine", "startEffectGame arg1: 0");
        AbstractC5436a abstractC5436a = this.LJIIJJI;
        StringBuilder sb = new StringBuilder();
        Sticker sticker = this.LIZJ;
        if (sticker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        sb.append(sticker.getUnzipPath());
        sb.append(File.separator);
        sb.append("audioRecordPath");
        abstractC5436a.LIZIZ(sb.toString());
        LIZ(46, 0, this.LJIJI, LJFF().toString());
        AbstractC3467i abstractC3467i = this.LJIILIIL;
        if (abstractC3467i == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC3467i.LIZIZ();
        KVG kvg = this.LJIILJJIL;
        if (kvg != null) {
            kvg.LIZ();
        }
        Message obtain = Message.obtain(this.LJIILL, 46, 0, this.LJIJI, LJFF().toString());
        Intrinsics.checkNotNullExpressionValue(obtain, "");
        LIZ(obtain);
        LIZ(STATE.START);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
        if (r9 != false) goto L47;
     */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    private final void LIZ(Message message) {
        if (PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 30).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "GAME_CONTROL_MESSAGE");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msgId", message.what);
        jSONObject2.put("arg1", message.arg1);
        jSONObject2.put("arg2", message.arg2);
        jSONObject2.put("arg3", message.obj.toString());
        jSONObject.put("body", jSONObject2);
        C3384q c3384q = this.LIZIZ;
        if (c3384q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C3383p LJFF = c3384q.LJFF();
        if (LJFF != null && LJFF.LJJJJLL) {
            jSONObject.put("interface", "interactiveLocalBroadcast");
            this.LJI.LIZ(40L, 0L, 0L, jSONObject.toString());
        }
        C3384q c3384q2 = this.LIZIZ;
        if (c3384q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C3383p LJFF2 = c3384q2.LJFF();
        if (LJFF2 != null && LJFF2.LJJJJZ) {
            jSONObject.put("interface", "audienceBroadcast");
            this.LJI.LIZ(40L, 0L, 0L, jSONObject.toString());
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.handler.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C3383p LJFF;
        C3383p LJFF2;
        String str;
        if (PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(message);
        if (LIZIZ(message.obj.toString())) {
            return;
        }
        int i = message.what;
        long j = 0;
        if (i != 42) {
            if (i != 45) {
                if (i == 47) {
                    if (message.arg1 == 0) {
                        LJIIIIZZ();
                        return;
                    } else if (message.arg1 == 1 && (str = this.LJIJ) != null) {
                        LIZ(str, EffectGameEngine$handleMsg$1$1.INSTANCE);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            LIZ(message);
            if (message.arg1 == 2 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
                JSONObject LJFF3 = LJFF();
                LJFF3.put("dataTable", LJIIIZ());
                String jSONObject = LJFF3.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                LIZ(42, 1, 0, jSONObject);
            }
            JSONObject LIZ2 = LIZ(message.obj.toString());
            if (LIZ2 == null) {
                return;
            }
            int i2 = message.arg1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        LIZ(message.obj.toString(), false, true);
                        KVG kvg = this.LJIILJJIL;
                        if (kvg != null) {
                            String obj = message.obj.toString();
                            if (!PatchProxy.proxy(new Object[]{obj}, kvg, KVG.LIZ, false, 4).isSupported) {
                                C106862S5w.LIZ(obj);
                                if (!kvg.LJFF) {
                                    try {
                                        if (new JSONObject(obj).has("score")) {
                                            AnchorGameApi anchorGameApi = (AnchorGameApi) C82036IVa.LIZIZ.LIZ(AnchorGameApi.class);
                                            C3384q c3384q = kvg.LJI;
                                            if (c3384q != null && (LJFF2 = c3384q.LJFF()) != null) {
                                                j = LJFF2.LIZLLL;
                                            }
                                            kvg.LIZJ.add(anchorGameApi.getGameRoundStopData(j, kvg.LJII, obj).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KVI(kvg, obj), C77061GZr.LIZIZ));
                                            return;
                                        }
                                        return;
                                    } catch (Exception unused) {
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LJJII = message.obj.toString();
                    AbstractC3467i abstractC3467i = this.LJIILIIL;
                    if (abstractC3467i == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    abstractC3467i.LIZ();
                    JsFuncInjector jsFuncInjector = this.LJJIFFI;
                    if (jsFuncInjector != null) {
                        jsFuncInjector.LIZ();
                        return;
                    }
                    return;
                }
                boolean optBoolean = LIZ2.optBoolean("selectMusicAgain");
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15).isSupported) {
                    LIZ(optBoolean);
                    LJIIJ();
                    LIZIZ(true);
                    IInteractGameMonitorService iInteractGameMonitorService = (IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class);
                    C3384q c3384q2 = this.LIZIZ;
                    if (c3384q2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    iInteractGameMonitorService.logEffectGameStart(c3384q2);
                    return;
                }
                return;
            }
            AbstractC3467i abstractC3467i2 = this.LJIILIIL;
            if (abstractC3467i2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC3467i2.LIZIZ(message.obj.toString());
            KVG kvg2 = this.LJIILJJIL;
            if (kvg2 != null) {
                kvg2.LIZIZ();
                return;
            }
            return;
        }
        int i3 = message.arg1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = message.arg2;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            String obj2 = message.obj.toString();
                            if (!PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 37).isSupported) {
                                try {
                                    KW0.LIZIZ.LIZ(new JSONObject(obj2), (AbstractC3332b.AbstractC3333b) null, (Room) this.LJIIL.get("data_room", (String) null), (DataCenter) null);
                                    return;
                                } catch (Exception e) {
                                    ALogger.m15801d("EffectGameEngine", e.toString());
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    KVG kvg3 = this.LJIILJJIL;
                    if (kvg3 != null) {
                        String obj3 = message.obj.toString();
                        if (!PatchProxy.proxy(new Object[]{obj3}, kvg3, KVG.LIZ, false, 6).isSupported) {
                            C106862S5w.LIZ(obj3);
                            try {
                                JSONObject jSONObject2 = new JSONObject(obj3);
                                String optString = jSONObject2.optString("count");
                                Intrinsics.checkNotNullExpressionValue(optString, "");
                                int parseInt = Integer.parseInt(optString);
                                String optString2 = jSONObject2.optString("offset");
                                Intrinsics.checkNotNullExpressionValue(optString2, "");
                                int parseInt2 = Integer.parseInt(optString2);
                                String optString3 = jSONObject2.optString("rank_type");
                                Intrinsics.checkNotNullExpressionValue(optString3, "");
                                int parseInt3 = Integer.parseInt(optString3);
                                long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
                                AnchorGameApi anchorGameApi2 = (AnchorGameApi) C82036IVa.LIZIZ.LIZ(AnchorGameApi.class);
                                C3384q c3384q3 = kvg3.LJI;
                                if (c3384q3 != null && (LJFF = c3384q3.LJFF()) != null) {
                                    j = LJFF.LIZLLL;
                                }
                                Boolean.valueOf(kvg3.LIZJ.add(anchorGameApi2.getGameRankList(j, LIZIZ, parseInt2, parseInt, parseInt3).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KVH(kvg3), C77062GZs.LIZIZ)));
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            JSONObject LIZ3 = LIZ(message.obj.toString());
            if (LIZ3 != null) {
                Sticker sticker = this.LIZJ;
                if (sticker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZ(sticker.getEffectId(), LIZ3);
                return;
            }
            return;
        }
        AbstractC3467i abstractC3467i3 = this.LJIILIIL;
        if (abstractC3467i3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC3467i3.LIZ(message.obj.toString());
    }

    private final void LIZ(String str, Function0<Unit> function0) {
        IAudioFilterManager LJIILJJIL;
        if (!PatchProxy.proxy(new Object[]{str, function0}, this, LIZ, false, 18).isSupported && (LJIILJJIL = this.LJIIJJI.LJIILJJIL()) != null) {
            LJIILJJIL.setBGMProgressListener(new KVE(this, function0, str));
            LJIILJJIL.setBGMMusic(str);
            LJIILJJIL.setMixerEnable(true);
            LJIILJJIL.setEnable(true);
            LJIILJJIL.resume();
            LJIILJJIL.setLoopEnable(false);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (i != 40) {
            if (i != 42 && i != 45) {
                switch (i) {
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    case 48:
                    case 49:
                        break;
                    default:
                        return;
                }
            }
            WeakHandler weakHandler = this.LJIILL;
            ALogger.m15800e("EffectGameEngine", "onMessageReceived messageType: " + i + ", arg1:" + i2 + ", arg2:" + i3 + ", arg3:" + str);
            weakHandler.sendMessage(Message.obtain(weakHandler, i, i2, i3, str));
            return;
        }
        this.LJI.LIZ(i, i2, i3, str);
    }

    @Override // com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j
    public final void LIZIZ(int i, int i2, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{42, 2, Integer.valueOf(i3), str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ(42, 2, i3, str);
    }

    public EffectGameEngine(Context context, long j, FragmentManager fragmentManager, KVC kvc, AbstractC5436a abstractC5436a, DataCenter dataCenter) {
        C106862S5w.LIZ(context, fragmentManager, kvc, abstractC5436a, dataCenter);
        this.LJII = context;
        this.LJIIIIZZ = j;
        this.LJIIIZ = fragmentManager;
        this.LJIIJ = kvc;
        this.LJIIJJI = abstractC5436a;
        this.LJIIL = dataCenter;
        HandlerThread handlerThread = new HandlerThread("EffectGameThread");
        handlerThread.start();
        this.LJIIZILJ = handlerThread;
        this.LJI = new C88303Kqn(this.LJII, this);
        this.LJIILL = new WeakHandler(this.LJIIZILJ.getLooper(), this);
        KVC kvc2 = this.LJIIJ;
        if (!PatchProxy.proxy(new Object[]{this}, kvc2, KVC.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(this);
            kvc2.LIZJ = this;
        }
        MessageCenter.addListener(this);
        DataCenter dataCenter2 = this.LJIIL;
        dataCenter2.observe("cmd_broadcast_game_music_control", this);
        dataCenter2.observe("cmd_broadcast_music_game_start", this);
        this.LJJIFFI = ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).createOpenJsFuncInject(LJI(), this.LJIIL, this.LJII);
    }
}
