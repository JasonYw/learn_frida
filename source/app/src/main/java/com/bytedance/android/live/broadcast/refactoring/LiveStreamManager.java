package com.bytedance.android.live.broadcast.refactoring;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2865ak;
import com.bytedance.android.live.broadcast.PhoneStateReceiver;
import com.bytedance.android.live.broadcast.api.LiveLifecycle;
import com.bytedance.android.live.broadcast.refactoring.LiveStreamManager;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.event.C4201f;
import com.bytedance.android.live.effect.event.ReleaseStatus;
import com.bytedance.android.live.effect.soundeffect.SoundRepelContext;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.player.api.LivePlayer;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.livead.ILiveMiniAppService;
import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.android.livesdk.C8030j;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerService;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC150230g2A;
import p003X.AbstractC4569445g;
import p003X.AbstractC86311Jzl;
import p003X.AbstractC86387K2j;
import p003X.AbstractC86456K5a;
import p003X.AbstractC87170KWm;
import p003X.C100839PnV;
import p003X.C2HJ;
import p003X.C2VQ;
import p003X.C2W3;
import p003X.C2W5;
import p003X.C4574547f;
import p003X.C78368Guw;
import p003X.C86320Jzu;
import p003X.C86407K3d;
import p003X.C86470K5o;
import p003X.C86665KDb;
import p003X.C86676KDm;
import p003X.C86748KGg;
import p003X.C86797KId;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.C91264LxS;
import p003X.IQV;
import p003X.K0G;
import p003X.K2T;
import p003X.K2Z;
import p003X.K3G;
import p003X.K4P;
import p003X.KCU;

/* loaded from: classes5.dex */
public class LiveStreamManager extends AbstractBroadcastWidget implements Observer<KVData>, PhoneStateReceiver.AbstractC2858a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public static String LIZLLL = "stream_type";

    /* renamed from: LJ */
    public static int f25944LJ = 1;
    public boolean LJFF;
    public boolean LJI;
    public final AbstractC86311Jzl LJII;
    public AbstractC86456K5a LJIIIIZZ;
    public Room LJIIIZ;
    public boolean LJIIJ;
    public long LJIILJJIL;
    public LiveLifecycle LJIILL;
    public AbstractC5826c LJIILLIIL;
    public final WeakHandler LJIIZILJ;
    public final AbstractC2865ak LJIJ;
    public final C2W5 LJIJI;
    public final K2Z LJIJJ;
    public final AbstractC2863ai LJIJJLI;
    public PhoneStateReceiver LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public AbstractC86387K2j LJJIFFI;
    public C5923dp LJJII;
    public K2T LJJIII;
    public Disposable LJJIIJ;
    public AbstractC4169j.AbstractC4171b LJIIJJI = new AbstractC4169j.AbstractC4171b() { // from class: com.bytedance.android.live.broadcast.refactoring.LiveStreamManager.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(17715);
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4169j.AbstractC4171b
        public final void LIZ(String str, Sticker sticker) {
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4169j.AbstractC4171b
        public final void LIZ(boolean z, String str, Sticker sticker) {
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, sticker}, this, LIZ, false, 1).isSupported && C86676KDm.LIZLLL.equals(str)) {
                Map<String, Object> LIZLLL2 = LiveStreamManager.this.LJIIIIZZ.LIZLLL();
                if (z) {
                    LIZLLL2.put("current_sticker_id", Long.valueOf(sticker.getId()));
                    C91264LxS.LIZJ.LIZ(Long.valueOf(sticker.getId()));
                    return;
                }
                LIZLLL2.remove("current_sticker_id");
            }
        }
    };
    public Queue<KVData> LJJIIJZLJL = new LinkedList();
    public CompositeDisposable LJIIL = new CompositeDisposable();
    public Disposable LJIILIIL = null;

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 43).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final /* synthetic */ void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZJ, false, 40).isSupported) {
            return;
        }
        if ((obj instanceof C5986ap) && this.LIZIZ) {
            onEvent((C5986ap) obj);
        } else if ((obj instanceof C2HJ) && this.LIZIZ) {
            onEvent((C2HJ) obj);
        } else if (!(obj instanceof C4201f) || !this.LIZIZ) {
        } else {
            LIZ((C4201f) obj);
        }
    }

    static {
        Covode.recordClassIndex(17714);
    }

    /* renamed from: LJ */
    private void m15883LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported && !this.LJI) {
            LIZJ("");
        }
    }

    private void LJFF() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported && !this.LJI) {
            LIZ("");
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 32).isSupported) {
            return;
        }
        this.LJIL = new PhoneStateReceiver(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 13).isSupported) {
            return;
        }
        super.onStart();
        LIZ(C5986ap.class);
        LIZ(C2HJ.class);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 12).isSupported) {
            return;
        }
        super.onCreate();
        this.LJIILIIL = C87010KQi.LIZ().LIZ(C4201f.class).subscribe(new Consumer(this) { // from class: X.K1d
            public static ChangeQuickRedirect LIZ;
            public final LiveStreamManager LIZIZ;

            static {
                Covode.recordClassIndex(17842);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LiveStreamManager liveStreamManager = this.LIZIZ;
                C4201f c4201f = (C4201f) obj;
                if (PatchProxy.proxy(new Object[]{c4201f}, liveStreamManager, LiveStreamManager.LIZJ, false, 41).isSupported) {
                    return;
                }
                liveStreamManager.LIZ(c4201f);
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 15).isSupported) {
            return;
        }
        super.onStop();
        this.LJIIL.clear();
        if (this.LJIIJ) {
            return;
        }
        if (this.LJII.LIZ() == null || this.LJII.LIZ().LJIILLIIL().LIZLLL()) {
            LJFF();
        }
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 24).isSupported) {
            return;
        }
        super.onPause();
        if (K0G.LIZ() && AbstractC87170KWm.LJJIII()) {
            this.LJJ = false;
            AbstractC2865ak abstractC2865ak = this.LJIJ;
            if ((abstractC2865ak == null || !abstractC2865ak.LIZ().LIZ(this.LJIIIZ)) && !((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                try {
                    if (this.LJIJJ != null) {
                        this.LJIJJ.LIZ(this.LJIL);
                    }
                } catch (Throwable unused) {
                }
                if (this.LJII.LIZ() != null && !this.LJI) {
                    this.LJII.LIZ().LIZJ();
                    C86748KGg.LIZIZ("ttlive_pause_live", "viewDisappear");
                    return;
                }
                return;
            }
            this.LJJ = true;
        }
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 14).isSupported) {
            return;
        }
        super.onResume();
        if (this.LJIIJ) {
            this.LJIIZILJ.removeCallbacksAndMessages(null);
            return;
        }
        while (!this.LJJIIJZLJL.isEmpty()) {
            onChanged(this.LJJIIJZLJL.poll());
        }
        if (!this.LJJ) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            K2Z k2z = this.LJIJJ;
            if (k2z != null) {
                k2z.LIZ(this.LJIL, intentFilter);
            }
            if (this.LJII.LIZ() != null && !this.LJI) {
                this.LJII.LIZ().LIZIZ();
                C86748KGg.LIZIZ("ttlive_resume_live", "viewAppear");
            }
            m15883LJ();
        }
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 23).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_stop_live_stream", "LiveBroadcastFragment");
        C86748KGg.LIZ("ttlive_stop_live_stream", "LiveBroadcastFragment");
        this.LJII.LIZ().LIZ();
        Room room = this.LJIIIZ;
        if ((room != null && room.isLiveTypeAudio()) || LiveConfigSettingKeys.LIVE_END_ENABLESTOP_VIDEO_CAPTURE.getValue().booleanValue()) {
            this.LJII.LIZ().LJII();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        AbstractC86456K5a abstractC86456K5a;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 31).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable = this.LJIILIIL;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJIILIIL.dispose();
        }
        LiveLifecycle liveLifecycle = this.LJIILL;
        if (liveLifecycle != null) {
            liveLifecycle.LIZ();
        }
        if (this.LJIILLIIL != null) {
            C8030j.LIZ().LIZIZ(this.LJIILLIIL);
        }
        if (LiveConfigSettingKeys.LIVE_BROADCAST_DESTROY_NEED_LEAVE_AND_REPORT_PING.getValue().booleanValue() && (abstractC86456K5a = this.LJIIIIZZ) != null) {
            abstractC86456K5a.LIZ(1);
        }
        AbstractC86456K5a abstractC86456K5a2 = this.LJIIIIZZ;
        if (abstractC86456K5a2 != null) {
            abstractC86456K5a2.LIZIZ();
            C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(this.LJIIJJI);
        }
        if (this.LJII.LIZ() != null) {
            this.LJII.LIZ().mo15611LJ();
        }
        K2T k2t = this.LJJIII;
        if (k2t != null) {
            k2t.LIZJ();
            this.LJJIII = null;
        }
        Disposable disposable2 = this.LJJIIJ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.LJIIL.clear();
        ILivePlayerService playerService = LivePlayer.playerService();
        if (playerService != null) {
            playerService.vqosLogger().LIZIZ();
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 35).isSupported) {
            return;
        }
        C86748KGg.LIZ("ttlive_anchor_enter_background", "LiveStreamManager");
        this.LJJII.LJJ().LIZ(Boolean.TRUE);
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported && this.LJIIIZ != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", C2VQ.LIZ(this.LJIIIZ.getStreamType()));
            AbstractC2865ak abstractC2865ak = this.LJIJ;
            if (abstractC2865ak != null && abstractC2865ak.LIZ().LIZ(this.LJIIIZ)) {
                hashMap.put("is_voice", "1");
                hashMap.put("switch_type", "mini_window");
            } else if (((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                hashMap.put("is_voice", "1");
                hashMap.put("switch_type", "background");
            } else {
                hashMap.put("is_voice", "0");
                hashMap.put("switch_type", "suspend");
            }
            C86665KDb.LIZ("ttlive_anchor_background_status", "room").LIZ((String) hashMap.get("switch_type")).LIZ().LIZ();
            C78368Guw.LIZIZ.LIZ(hashMap);
            C4574547f.LIZ().LIZ("anchor_backgroud_status", hashMap, Room.class, C8668v.class);
            this.LJIILJJIL = System.currentTimeMillis();
        }
        if ((!((ILiveMiniAppService) ServiceManager.getService(ILiveMiniAppService.class)).getMiniAppActivityState() || K0G.LIZ()) && AbstractC87170KWm.LJJIII() && this.LJII.LIZ() != null && this.LJII.LIZ().LJIILLIIL().m23507LJ() && !this.LJI) {
            this.LJJI = false;
            AbstractC2865ak abstractC2865ak2 = this.LJIJ;
            if ((abstractC2865ak2 == null || !abstractC2865ak2.LIZ().LIZ(this.LJIIIZ)) && !((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                this.LJII.LIZ().LIZJ();
                C86748KGg.LIZIZ("ttlive_pause_live", "enterBackground");
                LJFF();
                return;
            }
            this.LJJI = true;
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 36).isSupported) {
            return;
        }
        C86748KGg.LIZ("ttlive_anchor_enter_foreground", "LiveStreamManager");
        this.LJJII.LJJ().LIZ(Boolean.FALSE);
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 8).isSupported && this.LJIIIZ != null) {
            HashMap hashMap = new HashMap();
            AbstractC2865ak abstractC2865ak = this.LJIJ;
            if (abstractC2865ak != null && abstractC2865ak.LIZ().LIZ(this.LJIIIZ)) {
                hashMap.put("is_voice", "1");
                hashMap.put("switch_type", "mini_window");
            } else if (((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                hashMap.put("is_voice", "1");
                hashMap.put("switch_type", "background");
            } else {
                hashMap.put("is_voice", "0");
                hashMap.put("switch_type", "suspend");
            }
            C86665KDb.LIZ("ttlive_anchor_finish_background", "room").LIZ((String) hashMap.get("switch_type")).LIZ().LIZ();
            C78368Guw.LIZIZ.LIZ(hashMap);
            hashMap.put("over_type", "back");
            if (this.LJIILJJIL > 0) {
                hashMap.put("duration", String.valueOf((System.currentTimeMillis() - this.LJIILJJIL) / 1000));
                this.LJIILJJIL = 0L;
            }
            C4574547f.LIZ().LIZ("livesdk_anchor_backgroud_over", hashMap, Room.class, C8668v.class);
        }
        if (!((ILiveMiniAppService) ServiceManager.getService(ILiveMiniAppService.class)).getMiniAppActivityState() && !K0G.LIZ() && this.LJII.LIZ() != null && !this.LJII.LIZ().LJIILLIIL().m23507LJ() && !this.LJI && AbstractC87170KWm.LJJIII() && !this.LJJI) {
            this.LJII.LIZ().LIZIZ();
            m15883LJ();
            C86748KGg.LIZIZ("ttlive_resume_live", "enterForeground");
        }
    }

    private void LIZJ(String str) {
        AbstractC86456K5a abstractC86456K5a;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 4).isSupported && (abstractC86456K5a = this.LJIIIIZZ) != null) {
            abstractC86456K5a.LIZ(str);
        }
    }

    public void LIZ(String str) {
        AbstractC86456K5a abstractC86456K5a;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 6).isSupported && (abstractC86456K5a = this.LJIIIIZZ) != null) {
            abstractC86456K5a.LIZIZ(str);
        }
    }

    private <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZJ, false, 16).isSupported) {
            return;
        }
        this.LJIIL.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new Consumer(this) { // from class: X.K2X
            public static ChangeQuickRedirect LIZ;
            public final LiveStreamManager LIZIZ;

            static {
                Covode.recordClassIndex(17843);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.LIZ(obj);
            }
        }));
    }

    public void onEvent(C2HJ c2hj) {
        if (PatchProxy.proxy(new Object[]{c2hj}, this, LIZJ, false, 18).isSupported) {
            return;
        }
        if (c2hj.LIZ == 1) {
            C88613Kvn.LIZ(getContext(), 2131585717);
        } else if (c2hj.LIZ == 0) {
            C88613Kvn.LIZ(getContext(), 2131585732);
        }
    }

    @Override // com.bytedance.android.live.broadcast.PhoneStateReceiver.AbstractC2858a
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 30).isSupported) {
            return;
        }
        if (TelephonyManager.EXTRA_STATE_IDLE.equals(str) && !this.LJI) {
            this.LJII.LIZ().LIZIZ();
            C86748KGg.LIZIZ("ttlive_resume_live", "phone");
        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(str) && !this.LJI) {
            this.LJII.LIZ().LIZJ();
            C86748KGg.LIZIZ("ttlive_pause_live", "phone");
        }
    }

    public void onEvent(C5986ap c5986ap) {
        if (!PatchProxy.proxy(new Object[]{c5986ap}, this, LIZJ, false, 17).isSupported && c5986ap.LIZ == 3) {
            this.LJII.getView().findViewById(2131181026).setVisibility(8);
            if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 20).isSupported && this.LIZIZ && !this.LJIIJ && !this.LJFF) {
                if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 21).isSupported && this.LJIIIZ != null && this.LJII.LIZ() != null && this.LJIIZILJ != null && !this.LJIIJ) {
                    if (TextUtils.isEmpty(this.LJIIIZ.getStreamUrl().bindNodeRtmpUrl)) {
                        this.LJIIIZ.getStreamUrl().bindNodeRtmpUrl = this.LJIIIZ.getStreamUrl().LIZ();
                    }
                    ALogger.m15801d("LiveBroadcastFragment", "initAndStartLive, room id: " + this.LJIIIZ.getId());
                    this.LJII.mo15905j_();
                    if (this.LJIIIZ.isLiveTypeAudio()) {
                        this.LJJIIJ = Observable.timer(1L, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).subscribe(new Consumer(this) { // from class: X.K0N
                            public static ChangeQuickRedirect LIZ;
                            public final LiveStreamManager LIZIZ;

                            static {
                                Covode.recordClassIndex(17844);
                            }

                            {
                                this.LIZIZ = this;
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                LiveStreamManager liveStreamManager = this.LIZIZ;
                                if (PatchProxy.proxy(new Object[]{obj}, liveStreamManager, LiveStreamManager.LIZJ, false, 39).isSupported) {
                                    return;
                                }
                                liveStreamManager.LJII.LIZ().LIZ(LiveStreamManager.LIZLLL, Integer.valueOf(LiveStreamManager.f25944LJ), -1, true, false);
                            }
                        });
                    }
                }
                this.dataCenter.put("cmd_auto_join_channel", new Object());
            }
            this.dataCenter.put("cmd_ready_starting_live", Boolean.TRUE);
            this.LJJII.LLIILII().LIZ(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZ */
    public void onChanged(KVData kVData) {
        if (!PatchProxy.proxy(new Object[]{kVData}, this, LIZJ, false, 11).isSupported && this.LJII.LJIILIIL() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.LIZIZ) {
                this.LJJIIJZLJL.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            if (key.hashCode() == -2135400523 && key.equals("data_broadcast_pause_state")) {
                C2W3 c2w3 = (C2W3) kVData.getData();
                if (!PatchProxy.proxy(new Object[]{c2w3}, this, LIZJ, false, 25).isSupported && c2w3 != null) {
                    if (c2w3.LIZ == 1) {
                        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 29).isSupported && this.LJII.LIZ() != null) {
                            this.LJIJJLI.LIZ(getContext(), this.LJII.LIZ(), false, new Function0(this) { // from class: X.K1y
                                public static ChangeQuickRedirect LIZ;
                                public final LiveStreamManager LIZIZ;

                                static {
                                    Covode.recordClassIndex(17846);
                                }

                                {
                                    this.LIZIZ = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public final Object mo30099invoke() {
                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                                    if (proxy.isSupported) {
                                        return proxy.result;
                                    }
                                    LiveStreamManager liveStreamManager = this.LIZIZ;
                                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], liveStreamManager, LiveStreamManager.LIZJ, false, 37);
                                    if (proxy2.isSupported) {
                                        return proxy2.result;
                                    }
                                    liveStreamManager.LJI = true;
                                    liveStreamManager.LIZ("anchor_pause");
                                    return null;
                                }
                            }, K3G.LIZIZ);
                            HashMap hashMap = new HashMap();
                            Room room = this.LJIIIZ;
                            if (room != null) {
                                hashMap.put("live_mode", LiveMode.convertLiveModeToString(room.getStreamType()));
                                hashMap.put("room_id", String.valueOf(this.LJIIIZ.getRoomId()));
                            }
                            C86797KId.f8419LJ.LIZJ("privacy_start_live", "privacy_live_broadcast_pause_manually", hashMap, C86470K5o.LIZ(), K4P.LIZ());
                        }
                        C2W5 c2w5 = this.LJIJI;
                        if (c2w5 != null) {
                            c2w5.LIZ();
                        }
                    } else if (c2w3.LIZ == 3) {
                        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 26).isSupported) {
                            this.LJI = false;
                            C2W5 c2w52 = this.LJIJI;
                            if (c2w52 != null) {
                                c2w52.LIZIZ();
                            }
                            if (this.LJII.LIZ() != null) {
                                this.LJII.LIZ().LIZ(2);
                                LIZJ("anchor_resume");
                            }
                        }
                    } else if (c2w3.LIZ == 4 && !PatchProxy.proxy(new Object[0], this, LIZJ, false, 27).isSupported) {
                        this.LJI = false;
                        C86665KDb.LIZ("ttlive_on_voluntary_pause_finish", "room").LIZ().LIZ();
                        if (this.dataCenter != null) {
                            this.dataCenter.put("cmd_stop_live_broadcast", 111);
                        }
                    }
                }
            }
        }
    }

    public void LIZ(C4201f c4201f) {
        if (PatchProxy.proxy(new Object[]{c4201f}, this, LIZJ, false, 19).isSupported) {
            return;
        }
        if (c4201f.LIZ == ReleaseStatus.Start) {
            this.LJII.LIZ().LIZ(true);
        } else {
            this.LJII.LIZ().LIZ(false);
        }
    }

    public final /* synthetic */ Unit LIZ(int i, int i2, Throwable th, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), th, bool}, this, LIZJ, false, 38);
        if (proxy.isSupported) {
            return (Unit) proxy.result;
        }
        if (bool.booleanValue()) {
            LIZ(i, true, i2, th);
        }
        ALogger.m15801d("LiveBroadcastFragment", "room close anchor ping double check errorCode:" + i2 + "canFinish: " + bool);
        return null;
    }

    public final void LIZ(final int i, boolean z, final int i2, final Throwable th) {
        int i3 = 1;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), th}, this, LIZJ, false, 28).isSupported) {
            return;
        }
        if (i2 == 30001 || i2 == 50002 || i2 == 30003) {
            ALogger.m15801d("LiveBroadcastFragment", "room close onStatusResult errorCode:" + i2 + "isFinish: " + z);
            if (i2 == 30001) {
                i3 = 100;
            } else if (i2 == 30003) {
                i3 = BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS;
            }
            if (!z && LiveConfigSettingKeys.LIVE_BROADCAST_PING_ANCHOR_DOUBLE_CHECK.getValue().booleanValue() && this.LJIIIIZZ != null) {
                ALogger.m15801d("LiveBroadcastFragment", "room close anchor ping double check errorCode:" + i2 + "isFinish: " + z);
                this.LJIIIIZZ.LIZ(i3, "anchor_ping", new Function1(this, i, i2, th) { // from class: X.K1X
                    public static ChangeQuickRedirect LIZ;
                    public final LiveStreamManager LIZIZ;
                    public final int LIZJ;
                    public final int LIZLLL;

                    /* renamed from: LJ */
                    public final Throwable f8307LJ;

                    static {
                        Covode.recordClassIndex(17845);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = i;
                        this.LIZLLL = i2;
                        this.f8307LJ = th;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                        return proxy.isSupported ? proxy.result : this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL, this.f8307LJ, (Boolean) obj);
                    }
                });
                return;
            }
            C86665KDb.LIZ("ttlive_on_status_result", "room").LIZ(C86407K3d.LIZIZ(i2)).LIZ().LIZ();
            C86320Jzu.LIZ("ping_anchor_error_close_live", i2, "ping anchor error", this.LJIIIZ);
            AbstractC86387K2j abstractC86387K2j = this.LJJIFFI;
            if (abstractC86387K2j != null) {
                abstractC86387K2j.LIZLLL(i3);
                C88440Kt0.LIZ(this.context, 2131582041);
            }
        }
    }

    public LiveStreamManager(DataCenter dataCenter, C5923dp c5923dp, Context context, WeakHandler weakHandler, AbstractC2863ai abstractC2863ai, C2W5 c2w5, AbstractC2865ak abstractC2865ak, AbstractC86311Jzl abstractC86311Jzl, K2Z k2z, AbstractC86387K2j abstractC86387K2j) {
        LiveMode liveMode;
        Context context2;
        this.dataCenter = dataCenter;
        this.LJJII = c5923dp;
        this.context = context;
        this.LJIIZILJ = weakHandler;
        this.LJIJ = abstractC2865ak;
        this.LJIJI = c2w5;
        this.LJII = abstractC86311Jzl;
        this.LJIJJ = k2z;
        this.LJIJJLI = abstractC2863ai;
        this.LJJIFFI = abstractC86387K2j;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            AbstractC2863ai abstractC2863ai2 = this.LJIJJLI;
            if (abstractC2863ai2 != null) {
                abstractC2863ai2.LIZ();
                C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZ(this.LJIJJLI.LIZLLL());
            }
            Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
            if (currentRoom == null) {
                liveMode = LiveMode.UNDEFINED;
            } else if (currentRoom.isLiveTypeAudio()) {
                liveMode = LiveMode.AUDIO;
            } else {
                liveMode = LiveMode.VIDEO;
            }
            KCU.LIZ(liveMode, "broadcast_fragment_create");
            ILivePlayerService playerService = LivePlayer.playerService();
            if (playerService != null) {
                playerService.vqosLogger().LIZ();
            }
            IQV.LIZ(IQV.LIZ(this.LJII.LJIJI()).LIZ(SoundRepelContext.class), "SoundRepelContext");
            this.dataCenter.observe("data_broadcast_pause_state", this);
            if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 34).isSupported && (context2 = getContext()) != null) {
                if (LiveConfigSettingKeys.LIVE_BROADCAST_BACKGROUND_OPT_ENABLE.getValue().booleanValue()) {
                    if (this.LJIILLIIL == null) {
                        this.LJIILLIIL = new AbstractC5826c.C5827a() { // from class: com.bytedance.android.live.broadcast.refactoring.LiveStreamManager.2
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(17716);
                            }

                            @Override // com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c.C5827a, com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c
                            public final void LIZ(boolean z, boolean z2) {
                                if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                super.LIZ(z, z2);
                                if (z2) {
                                    return;
                                }
                                if (z) {
                                    LiveStreamManager.this.LIZLLL();
                                } else {
                                    LiveStreamManager.this.LIZJ();
                                }
                            }
                        };
                    }
                    C8030j.LIZ().LIZ(this.LJIILLIIL);
                    return;
                }
                this.LJIILL = new LiveLifecycle(context2, new AbstractC150230g2A() { // from class: com.bytedance.android.live.broadcast.refactoring.LiveStreamManager.3
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(17717);
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZ(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZIZ(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZJ(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZLLL(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    /* renamed from: LJ */
                    public final void mo15882LJ(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LJFF(Activity activity) {
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        LiveStreamManager.this.LIZLLL();
                    }

                    @Override // p003X.AbstractC150230g2A
                    public final void LIZ(Context context3) {
                        if (PatchProxy.proxy(new Object[]{context3}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveStreamManager.this.LIZJ();
                    }
                });
            }
        }
    }
}
