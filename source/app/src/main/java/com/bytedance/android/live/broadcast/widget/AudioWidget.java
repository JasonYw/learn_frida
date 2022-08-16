package com.bytedance.android.live.broadcast.widget;

import android.os.Handler;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.broadcast.AbstractC2865ak;
import com.bytedance.android.live.broadcast.widget.AudioWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.n$a;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.n$c;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.p417a.AbstractC5437g;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.AbstractC86578K9s;
import p003X.AbstractC87170KWm;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C76993GXb;
import p003X.C79169HIt;
import p003X.C81168Hz0;
import p003X.C86634KBw;
import p003X.C86665KDb;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.HSB;
import p003X.IQA;
import p003X.IU0;
import p003X.IU2;
import p003X.K51;
import p003X.K7A;
import p003X.K7C;
import p003X.K8Q;
import p003X.K9Y;
import p003X.K9Z;
import p003X.LRG;

/* loaded from: classes5.dex */
public class AudioWidget extends CaptureWidget2 implements Observer<KVData>, AbstractC3322w, AbstractC6069p, AbstractC6070q, AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25966LJ;
    public K9Y LJFF;
    public AbstractC86578K9s LJI;
    public boolean LJII;
    public Disposable LJIIIIZZ;
    public AbstractC2865ak LJIIIZ;
    public AbstractC2864aj LJIIJ;
    public Room LJIILJJIL;
    public boolean LJIILL;
    public LRG LJIILLIIL;
    public K7A LJIIZILJ;
    public boolean LJIJ;
    public IU0 LJIJI;

    static {
        Covode.recordClassIndex(18303);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p
    public final void LIZ(String str, String str2) {
        boolean z = PatchProxy.proxy(new Object[]{str, str2}, this, f25966LJ, false, 21).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p
    public final void LIZIZ(String str, String str2) {
        boolean z = PatchProxy.proxy(new Object[]{str, str2}, this, f25966LJ, false, 22).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p, com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final void LJFF() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public AbstractC5436a getLiveStream() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25966LJ, false, 23);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f25966LJ, false, 24).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p
    /* renamed from: y_ */
    public final void mo15547y_() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p
    /* renamed from: z_ */
    public final void mo15546z_() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public LiveCore getLiveCore() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25966LJ, false, 12);
        if (proxy.isSupported) {
            return (LiveCore) proxy.result;
        }
        return this.LIZJ.LJIILL();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 9).isSupported) {
            return;
        }
        super.onResume();
        if (!this.LJIILL) {
            this.LIZJ.LIZIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p
    /* renamed from: A_ */
    public final void mo15548A_() {
        LRG lrg;
        Handler handler;
        if (!PatchProxy.proxy(new Object[0], this, f25966LJ, false, 17).isSupported && (lrg = this.LJIILLIIL) != null && !PatchProxy.proxy(new Object[0], lrg, LRG.LIZ, false, 7).isSupported && lrg.LIZJ != null && (handler = lrg.LIZJ) != null) {
            handler.sendEmptyMessage(234);
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3322w
    public final void LIZ() {
        int i;
        int i2;
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 14).isSupported) {
            return;
        }
        AbstractC5436a abstractC5436a = this.LIZJ;
        SurfaceView surfaceView = this.LJIILIIL;
        DataCenter dataCenter = this.dataCenter;
        if (!PatchProxy.proxy(new Object[]{abstractC5436a, surfaceView, dataCenter}, null, C81168Hz0.LIZ, true, 2).isSupported && abstractC5436a != null && surfaceView != null) {
            surfaceView.setVisibility(0);
            if (C81168Hz0.LIZ()) {
                if (abstractC5436a.LJIIZILJ() > 0) {
                    i = abstractC5436a.LJIIZILJ();
                } else {
                    i = C81168Hz0.LIZIZ;
                }
                if (abstractC5436a.LJIJ() > 0) {
                    i2 = abstractC5436a.LJIJ();
                } else {
                    i2 = C81168Hz0.LIZJ;
                }
                if (dataCenter != null) {
                    dataCenter.put("data_is_need_wait_encoder_format_changed_msg", Boolean.TRUE);
                    dataCenter.put("cdm_video_encoder_format_changed", Boolean.FALSE);
                }
                abstractC5436a.LIZ(i, i2);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 18).isSupported) {
            return;
        }
        super.onDestroy();
        LRG lrg = this.LJIILLIIL;
        if (lrg != null) {
            lrg.quitSafely();
            this.LJIILLIIL = null;
        }
        IU0 iu0 = this.LJIJI;
        if (iu0 != null) {
            if (!PatchProxy.proxy(new Object[0], iu0, IU0.LIZ, false, 4).isSupported) {
                ALogger.m15801d("CaptureAudioUploadController", "stop");
                if (!iu0.LIZIZ().isDisposed()) {
                    iu0.LIZIZ().dispose();
                }
                try {
                    C116971W2r.LIZ(new File(iu0.LIZ()));
                } catch (Throwable th) {
                    ALogger.m15798e("CaptureAudioUploadController", th);
                }
            }
            this.LJIJI = null;
        }
        this.dataCenter.removeObserver(this);
        this.LJFF.LIZ();
        C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZLLL();
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJIIIIZZ.dispose();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 10).isSupported) {
            return;
        }
        super.onPause();
        AbstractC2865ak abstractC2865ak = this.LJIIIZ;
        if ((abstractC2865ak == null || !abstractC2865ak.LIZ().LIZ(this.LJIILJJIL)) && !((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true) && AbstractC87170KWm.LJJIII()) {
            this.LJIILL = false;
            this.LIZJ.LIZJ();
            return;
        }
        this.LJIILL = true;
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public final void LIZIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 8).isSupported) {
            return;
        }
        super.LIZIZ();
        if (AbstractC80293Hkt.LLLLZLLIL.LIZ().booleanValue()) {
            HashMap hashMap = new HashMap();
            if (AbstractC80293Hkt.LLLZIIL.LIZ().booleanValue()) {
                str = "use";
            } else {
                str = "unuse";
            }
            hashMap.put("user_status", str);
            hashMap.put("room_id", String.valueOf(this.LJIILJJIL.getIdStr()));
            hashMap.put("anchor_id", String.valueOf(this.LJIILJJIL.ownerUserId));
            Room room = this.LJIILJJIL;
            if (room != null && room.hasCommerceGoods()) {
                hashMap.put("is_ecom", "1");
            } else {
                hashMap.put("is_ecom", "0");
            }
            C4574547f.LIZ().LIZ("livesdk_live_replay_use", hashMap, new C8668v(), Room.class);
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, f25966LJ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJI().LIZ(this);
        this.LJIILJJIL = (Room) this.dataCenter.get("data_room", (String) null);
        this.LIZJ.LIZ(this.LJIILIIL);
        C81168Hz0.LIZ(this.LIZJ, this.LJIILIIL);
        if (!PatchProxy.proxy(new Object[0], this, f25966LJ, false, 3).isSupported) {
            this.LJIIZILJ = new K7A();
            this.LJIIZILJ.LIZJ = this.LIZJ.LJIILL().getBuilder().getVideoCaptureHeight() / 2;
            this.LJIIZILJ.LIZIZ = this.LIZJ.LJIILL().getBuilder().getVideoCaptureWidth() / 2;
            Room currentRoomFromRoomContext = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoomFromRoomContext();
            if (currentRoomFromRoomContext != null && currentRoomFromRoomContext.cover() != null && currentRoomFromRoomContext.cover().getUrls() != null && currentRoomFromRoomContext.cover().getUrls().size() > 0 && !currentRoomFromRoomContext.cover().getUrls().get(0).isEmpty()) {
                this.LJIIZILJ.LIZ = currentRoomFromRoomContext.cover().getUrls().get(0);
            } else {
                IUser LIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                if ((LIZ instanceof User) && LIZ.getAvatarLarge() != null && LIZ.getAvatarLarge().getUrls() != null && LIZ.getAvatarLarge().getUrls().size() > 0) {
                    this.LJIIZILJ.LIZ = LIZ.getAvatarLarge().getUrls().get(0);
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, f25966LJ, false, 5).isSupported) {
            this.LIZJ.LJIIJ().enable(false);
            this.LIZJ.LJIIJ().composerSetMode(1, 0);
            this.LJFF = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).getVoiceRoomCameraCaptureInst(this.LJIILIIL, this.LIZJ);
            K9Y k9y = this.LJFF;
            if (k9y != null) {
                k9y.LIZ(new C32771());
                AbstractC2864aj abstractC2864aj = this.LJIIJ;
                if (abstractC2864aj != null) {
                    abstractC2864aj.LIZ(this.LJFF);
                }
            }
        }
        this.LIZJ.LJI();
        this.dataCenter.observe("cmd_reset_audio_widget_surface_view", this);
        this.LJIJI = new IU0(this.LIZJ);
        IU0 iu0 = this.LJIJI;
        if (!PatchProxy.proxy(new Object[0], iu0, IU0.LIZ, false, 3).isSupported) {
            SettingKey<Float> settingKey = LiveConfigSettingKeys.LIVE_CAPTURE_AUDIO_RECORD_DURATION;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().floatValue() <= 0.0f) {
                C87308Kak<Long> c87308Kak = AbstractC80293Hkt.LJIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(0L);
                return;
            }
            C87308Kak<Long> c87308Kak2 = AbstractC80293Hkt.LJIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            Long LIZ2 = c87308Kak2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (!IQA.LIZIZ(LIZ2.longValue())) {
                CompositeDisposable LIZIZ = iu0.LIZIZ();
                Observable just = Observable.just(1);
                SettingKey<Long> settingKey2 = LiveConfigSettingKeys.LIVE_CAPTURE_AUDIO_DELAY_DURATION;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Long value = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                LIZIZ.add(just.delay(value.longValue(), TimeUnit.SECONDS).subscribe(new IU2(iu0), C76993GXb.LIZIZ));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.AudioWidget$1 */
    /* loaded from: classes5.dex */
    public class C32771 implements K9Z {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18304);
        }

        public C32771() {
        }

        @Override // p003X.K9Z
        public final void LIZ(int i, int i2, String str) {
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), null}, this, LIZ, false, 1).isSupported) {
                return;
            }
            ALogger.m15800e("ttlive_link_video", "CameraState onError status: " + i + ", ret: " + i2 + ", msg: " + ((String) null));
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_callback_name", "normal_push_stream_occur_error");
            C86634KBw.LIZIZ.LIZLLL(LiveTracingMonitor.EventModule.OPEN_LIVE, C86634KBw.LIZIZ.LIZ(hashMap, i));
        }

        @Override // p003X.K9Z
        public final void LIZIZ(int i, int i2, String str) {
            if (!PatchProxy.proxy(new Object[]{1, Integer.valueOf(i2), str}, this, LIZ, false, 2).isSupported && !AudioWidget.this.LJII) {
                ALogger.m15801d("AudioWidget", "COMPOSER INIT : camera state is ready(EFFECT_INIT_SUCCESS).");
                C86665KDb.LIZIZ("ttlive_camera_state_ready", "AudioWidget");
                AudioWidget.this.LJIIIIZZ = Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this) { // from class: X.K87
                    public static ChangeQuickRedirect LIZ;
                    public final AudioWidget.C32771 LIZIZ;

                    static {
                        Covode.recordClassIndex(18961);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        AudioWidget.C32771 c32771 = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{obj}, c32771, AudioWidget.C32771.LIZ, false, 4).isSupported) {
                            return;
                        }
                        AudioWidget audioWidget = AudioWidget.this;
                        if (PatchProxy.proxy(new Object[0], audioWidget, AudioWidget.f25966LJ, false, 7).isSupported) {
                            return;
                        }
                        if (audioWidget.LJIIJ == null) {
                            ALogger.m15800e("AudioWidget", "COMPOSER INIT : fail for that broadcastEffectService is null.");
                            C86665KDb.LIZIZ("ttlive_broadcast_effect_service_is_null", "AudioWidget");
                        } else if (audioWidget.LJII) {
                        } else {
                            audioWidget.LJII = true;
                            if (audioWidget.LJI == null) {
                                audioWidget.LJI = audioWidget.LJIIJ.LIZ();
                                audioWidget.LJFF.LIZ((K8F) audioWidget.LJI);
                            }
                            AbstractC86578K9s abstractC86578K9s = audioWidget.LJI;
                            if (!PatchProxy.proxy(new Object[]{abstractC86578K9s}, audioWidget, AudioWidget.f25966LJ, false, 6).isSupported) {
                                ALogger.m15801d("AudioWidget", "COMPOSER INIT : initializing config");
                                C86665KDb.LIZIZ("ttlive_initializing_config", "AudioWidget");
                                if (audioWidget.LJIIJ == null) {
                                    ALogger.m15800e("AudioWidget", "COMPOSER INIT : fail for that broadcastEffectService is null.");
                                    C86665KDb.LIZIZ("ttlive_broadcast_effect_service_is_null", "AudioWidget");
                                } else {
                                    AbstractC4169j LJII = C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
                                    n$a n_a = new n$a();
                                    n_a.LIZ(audioWidget.LJIIJ.LIZ(abstractC86578K9s));
                                    n_a.LIZ(Arrays.asList(C86676KDm.LJI, C86676KDm.LIZJ, "beauty", C86676KDm.LIZLLL, C86676KDm.LJIIIZ));
                                    LJII.LIZ(n_a.LIZ());
                                }
                            }
                            C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZJ().LIZ();
                            C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZIZ().LIZ((n$c) null, C86676KDm.LJI, (C4181a) null);
                        }
                    }
                }, K51.LIZIZ);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final Client LIZ(InteractConfig interactConfig) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{interactConfig}, this, f25966LJ, false, 11);
        if (proxy.isSupported) {
            return (Client) proxy.result;
        }
        return this.LIZJ.LIZ(interactConfig);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public void setAudioMute(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f25966LJ, false, 13).isSupported) {
            return;
        }
        this.LIZJ.LIZ(z);
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        MethodCollector.m14708i(1366);
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, f25966LJ, false, 2).isSupported) {
            if (kVData2 != null && kVData2.getKey().equals("cmd_reset_audio_widget_surface_view")) {
                ViewParent parent = this.LJIILIIL.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.LJIILIIL);
                }
                this.LJIILIIL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.containerView.addView(this.LJIILIIL);
                C81168Hz0.LIZ(this.LIZJ, this.LJIILIIL);
            } else {
                MethodCollector.m14707o(1366);
                return;
            }
        }
        MethodCollector.m14707o(1366);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3322w
    public final void LIZ(K7C k7c) {
        if (PatchProxy.proxy(new Object[]{k7c}, this, f25966LJ, false, 15).isSupported) {
            return;
        }
        if (k7c.LIZ) {
            AbstractC5436a abstractC5436a = this.LIZJ;
            DataCenter dataCenter = this.dataCenter;
            int i = k7c.LIZIZ;
            int i2 = k7c.LIZJ;
            if (!PatchProxy.proxy(new Object[]{abstractC5436a, dataCenter, Integer.valueOf(i), Integer.valueOf(i2)}, null, C81168Hz0.LIZ, true, 3).isSupported && abstractC5436a != null && dataCenter != null && C81168Hz0.LIZ()) {
                if (i <= 0) {
                    if (abstractC5436a.LJIIZILJ() > 0) {
                        i = abstractC5436a.LJIIZILJ();
                    } else {
                        i = C81168Hz0.LIZIZ;
                    }
                }
                if (i2 <= 0) {
                    if (abstractC5436a.LJIJ() > 0) {
                        i2 = abstractC5436a.LJIJ();
                    } else {
                        i2 = C81168Hz0.LIZJ;
                    }
                }
                dataCenter.put("data_is_need_wait_encoder_format_changed_msg", Boolean.TRUE);
                dataCenter.put("cdm_video_encoder_format_changed", Boolean.FALSE);
                abstractC5436a.LIZ(i, i2);
                return;
            }
            return;
        }
        C81168Hz0.LIZ(this.LIZJ, this.LJIILIIL);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3322w
    public final void LIZ(HSB hsb) {
        Room currentRoomFromRoomContext;
        MethodCollector.m14708i(1365);
        if (PatchProxy.proxy(new Object[]{hsb}, this, f25966LJ, false, 16).isSupported) {
            MethodCollector.m14707o(1365);
        } else if (hsb.LIZ == 0) {
            ViewParent parent = this.LJIILIIL.getParent();
            if ((parent instanceof ViewGroup) && parent != this.containerView) {
                ((ViewGroup) parent).removeView(this.LJIILIIL);
                this.LJIILIIL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.containerView.addView(this.LJIILIIL);
            }
            this.LJIILLIIL = new LRG(this.LIZJ.LJIILL(), this.LJIIZILJ);
            this.LJIILLIIL.start();
            if (!this.LJIJ && !PatchProxy.proxy(new Object[0], this, f25966LJ, false, 4).isSupported && (currentRoomFromRoomContext = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoomFromRoomContext()) != null && (System.currentTimeMillis() / 1000) - currentRoomFromRoomContext.getCreateTime() > LiveConfigSettingKeys.LIVE_PK_AUDIO_FETCH_LATEST_COVER_INTERVAL.getValue().longValue()) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("room_id", String.valueOf(currentRoomFromRoomContext.getId()));
                ((AbstractC81278I1w) ((RoomRetrofitApi) C88306Kqq.LIZ().LIZ(RoomRetrofitApi.class)).fetchRoom(hashMap).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new Consumer(this) { // from class: X.K7B
                    public static ChangeQuickRedirect LIZ;
                    public final AudioWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(18959);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        this.LIZIZ.LIZ((C5176i) obj);
                    }
                }, new Consumer(this) { // from class: X.K53
                    public static ChangeQuickRedirect LIZ;
                    public final AudioWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(18960);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported && !PatchProxy.proxy(new Object[]{obj}, this.LIZIZ, AudioWidget.f25966LJ, false, 19).isSupported) {
                            ALogger.m15801d("AudioWidget", "updatePkConfig: /room/info/ onError");
                        }
                    }
                });
            }
            MethodCollector.m14707o(1365);
        } else {
            if (hsb.LIZ == 1) {
                if (!(hsb.LIZIZ instanceof Boolean) || !((Boolean) hsb.LIZIZ).booleanValue()) {
                    C81168Hz0.LIZ(this.LIZJ, this.LJIILIIL);
                }
                LRG lrg = this.LJIILLIIL;
                if (lrg != null) {
                    lrg.quitSafely();
                    this.LJIILLIIL = null;
                }
            }
            MethodCollector.m14707o(1365);
        }
    }

    public final /* synthetic */ void LIZ(C5176i c5176i) {
        if (!PatchProxy.proxy(new Object[]{c5176i}, this, f25966LJ, false, 20).isSupported && c5176i.LIZJ != 0 && !((Room) c5176i.LIZJ).getCoverUrl().isEmpty()) {
            this.LJIIZILJ.LIZ = ((Room) c5176i.LIZJ).getCoverUrl();
            if (C79169HIt.LIZIZ(((Integer) this.dataCenter.get("data_link_state", (String) 0)).intValue(), 4)) {
                LRG lrg = this.LJIILLIIL;
                if (lrg != null) {
                    lrg.quitSafely();
                    this.LJIILLIIL = null;
                }
                this.LJIILLIIL = new LRG(this.LIZJ.LJIILL(), this.LJIIZILJ);
                this.LJIILLIIL.start();
            }
            this.LJIJ = true;
        }
    }

    public AudioWidget(AbstractC5437g abstractC5437g, AbstractC5436a abstractC5436a) {
        super(abstractC5437g, abstractC5436a);
    }
}
