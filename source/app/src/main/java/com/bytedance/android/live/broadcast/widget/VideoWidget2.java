package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.os.Message;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.broadcast.AbstractC2865ak;
import com.bytedance.android.live.broadcast.p264f.AbstractC3010b;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.n$a;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.n$c;
import com.bytedance.android.live.effect.sticker.p330a.C4209g;
import com.bytedance.android.live.effect.view.EffectLiveBroadcastActivityProxy;
import com.bytedance.android.live.gift.GiftType;
import com.bytedance.android.live.linkpk.AbstractC4255c;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.p417a.AbstractC5437g;
import com.bytedance.android.live.pushstream.p419f.AbstractC5441a;
import com.bytedance.android.live.room.AbstractC5503n;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.AbstractC5792i;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8670x;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.avframework.effect.IVideoEffectProcessor;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.opengl.GlUtil;
import com.p1594ss.avframework.utils.AVLog;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86561K9b;
import p003X.AbstractC86605KAt;
import p003X.AbstractC90419Ljp;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C144769ebr;
import p003X.C2W3;
import p003X.C3QC;
import p003X.C3QD;
import p003X.C413202Xa;
import p003X.C415302c8;
import p003X.C419422im;
import p003X.C4574547f;
import p003X.C64646Bf6;
import p003X.C80449HnP;
import p003X.C81888IPi;
import p003X.C82009ITz;
import p003X.C86431K4b;
import p003X.C86606KAu;
import p003X.C86665KDb;
import p003X.C86676KDm;
import p003X.C86699KEj;
import p003X.C86931KNh;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.C90526LlY;
import p003X.HU8;
import p003X.K41;
import p003X.K4D;
import p003X.K50;
import p003X.K79;
import p003X.K8Q;
import p003X.K9Y;
import p003X.K9Z;
import p003X.KA8;
import p003X.KA9;
import p003X.KAA;
import p003X.KAB;
import p003X.KAC;
import p003X.KAD;
import p003X.KAE;
import p003X.KAF;
import p003X.KAH;
import p003X.KAL;
import p003X.KAM;
import p003X.KAN;
import p003X.KAQ;
import p003X.KAR;
import p003X.KAS;
import p003X.KAT;
import p003X.KB4;
import p003X.KCU;
import p003X.KDM;
import p003X.KE1;
import p003X.KHM;
import p003X.KHN;
import p003X.LHN;
import p003X.LK5;

/* loaded from: classes5.dex */
public class VideoWidget2 extends CaptureWidget2 implements Observer<KVData>, AbstractC3010b, AbstractC3312ab, AbstractC5441a, AbstractC5792i, AbstractC6070q, WeakHandler.IHandler, OnMessageListener, OnMessageListener {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26007LJ;
    public static final String LJFF = VideoWidget2.class.getSimpleName();
    public final EffectLiveBroadcastActivityProxy LJI;
    public AbstractC2865ak LJII;
    public AbstractC2864aj LJIIIIZZ;
    public K9Y LJIIIZ;
    public C90526LlY LJIIJ;
    public K41 LJIILJJIL;
    public K4D LJIILL;
    public Room LJIILLIIL;
    public volatile boolean LJIJ;
    public long LJIJI;
    public FrameLayout LJIJJLI;
    public Disposable LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public Sticker LJJIFFI;
    public StreamUrlExtra LJJIIZ;
    public IVideoEffectProcessor.FaceDetectListener LJJIIZI;
    public FragmentManager LJJIJ;
    public KDM LJJIJIIJI;
    public C82009ITz LJJIJIL;
    public boolean LJJIJL;
    public K9Z LJJJIL;
    public AbstractC86561K9b LJJJJ;
    public WeakHandler LJIIZILJ = new WeakHandler(this);
    public KAR LJIJJ = new KAR(this, (byte) 0);
    public boolean LJJIJIIJIL = false;
    public boolean LJJIJLIJ = false;
    public KAC LJJIL = new KAC((byte) 0);
    public KB4 LJJII = new KB4();
    public boolean LJJIZ = true;
    public boolean LJJJ = false;
    public boolean LJJIII = false;
    public int LJJIIJ = -1;
    public List<C3311b> LJJJI = new ArrayList();
    public Observer<AbstractC4256d> LJJIIJZLJL = new Observer<AbstractC4256d>() { // from class: com.bytedance.android.live.broadcast.widget.VideoWidget2.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(18858);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(AbstractC4256d abstractC4256d) {
            KAQ kaq;
            KAQ kaq2;
            KHN khn;
            KHM khm;
            if (!PatchProxy.proxy(new Object[]{abstractC4256d}, this, LIZ, false, 1).isSupported && (abstractC4256d instanceof AbstractC4256d.C4259c)) {
                AbstractC4255c abstractC4255c = null;
                if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
                    abstractC4255c = ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJIILIIL();
                }
                if ((abstractC4255c instanceof HU8) && VideoWidget2.this.LJI != null) {
                    EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = VideoWidget2.this.LJI;
                    if (!PatchProxy.proxy(new Object[0], effectLiveBroadcastActivityProxy, EffectLiveBroadcastActivityProxy.LIZ, false, 26).isSupported) {
                        KHM khm2 = effectLiveBroadcastActivityProxy.LJFF;
                        if (khm2 != null && khm2.isShowing() && (khm = effectLiveBroadcastActivityProxy.LJFF) != null) {
                            C116971W2r.LIZ(khm);
                        }
                        KHN khn2 = effectLiveBroadcastActivityProxy.LJI;
                        if (khn2 != null && khn2.LJIILIIL() && (khn = effectLiveBroadcastActivityProxy.LJI) != null) {
                            khn.dismiss();
                        }
                    }
                    EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy2 = VideoWidget2.this.LJI;
                    if (!PatchProxy.proxy(new Object[0], effectLiveBroadcastActivityProxy2, EffectLiveBroadcastActivityProxy.LIZ, false, 24).isSupported && (kaq = effectLiveBroadcastActivityProxy2.f26244LJ) != null && kaq.isShowing() && (kaq2 = effectLiveBroadcastActivityProxy2.f26244LJ) != null) {
                        kaq2.dismissAllowingStateLoss();
                    }
                }
            }
        }
    };

    @Override // com.bytedance.android.live.broadcast.p264f.AbstractC3010b
    public final void LIZ(String str, String str2, boolean z) {
        boolean z2 = PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f26007LJ, false, 26).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final void LJFF() {
        boolean z = PatchProxy.proxy(new Object[0], this, f26007LJ, false, 51).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public AbstractC5436a getLiveStream() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26007LJ, false, 50);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26007LJ, false, 52).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, f26007LJ, false, 2).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ((Class) cls).compose(getAutoUnbindTransformer()).subscribe(new KAD(this));
    }

    @Override // com.bytedance.android.livehostapi.business.depend.AbstractC5792i
    public final boolean LIZ(String str, Effect effect) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, effect}, this, f26007LJ, false, 38);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : effect.getTags() != null && effect.getTags().contains("filtered_by_room_live");
    }

    public final boolean LIZ(DataCenter dataCenter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter}, this, f26007LJ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (dataCenter == null) {
            return false;
        }
        return ((Boolean) dataCenter.get("data_is_anchor", (String) Boolean.FALSE)).booleanValue() && dataCenter.get("data_live_mode", (String) LiveMode.VIDEO) == LiveMode.VIDEO;
    }

    static {
        Covode.recordClassIndex(18857);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3312ab
    public final void LIZJ() {
        C90526LlY c90526LlY;
        if (!PatchProxy.proxy(new Object[0], this, f26007LJ, false, 21).isSupported && (c90526LlY = this.LJIIJ) != null) {
            c90526LlY.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public LiveCore getLiveCore() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26007LJ, false, 32);
        if (proxy.isSupported) {
            return (LiveCore) proxy.result;
        }
        return this.LIZJ.LJIILL();
    }

    private String LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26007LJ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJIILLIIL;
        if (room != null && room.getOwner() != null) {
            return String.valueOf(this.LJIILLIIL.getOwner().getId());
        }
        return "";
    }

    public void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 7).isSupported) {
            return;
        }
        C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(new KA8(this));
    }

    /* renamed from: LJ */
    public final void m15854LJ() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 8).isSupported) {
            return;
        }
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        LIZIZ.LIZ(ToolbarButton.GESTURE_MAGIC, new KAB(this, (byte) 0));
        LIZIZ.LIZ(ToolbarButton.STICKER, new C86431K4b(this, (byte) 0));
        LIZIZ.LIZ(ToolbarButton.REVERSE_CAMERA, new KAS(this, (byte) 0));
        LIZIZ.LIZ(ToolbarButton.REVERSE_MIRROR, this.LJIJJ);
    }

    public void LJI() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 9).isSupported) {
            return;
        }
        if (this.LIZJ != null && this.LIZJ.LJIIJ() != null) {
            if (this.LJJIJIIJI == null) {
                this.LJJIJIIJI = new KDM();
            }
            this.LJJIJIIJI.LIZ(this.LIZJ.LJIIJ(), this, LJIIL());
            return;
        }
        ALogger.m15800e(LJFF, "CupRecognitionManager init fail,mLiveStream is null or  filterMgr is null");
    }

    public void LJII() {
        C5923dp LIZ;
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 11).isSupported || (LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, LJIIJ())) == null) {
            return;
        }
        LIZ.LLJJI().LIZIZ().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this) { // from class: X.K4B
            public static ChangeQuickRedirect LIZ;
            public final VideoWidget2 LIZIZ;

            static {
                Covode.recordClassIndex(18946);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VideoWidget2 videoWidget2 = this.LIZIZ;
                Integer num = (Integer) obj;
                if (PatchProxy.proxy(new Object[]{num}, videoWidget2, VideoWidget2.f26007LJ, false, 47).isSupported || num.intValue() != 5) {
                    return;
                }
                videoWidget2.m15854LJ();
            }
        });
    }

    public void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 14).isSupported || this.LJJJI.isEmpty()) {
            return;
        }
        for (C3311b c3311b : this.LJJJI) {
            LIZ(c3311b.LIZ, c3311b.LIZIZ, c3311b.LIZJ, c3311b.LIZLLL);
        }
        this.LJJJI.clear();
    }

    public final long LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26007LJ, false, 42);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        Room room = this.LJIILLIIL;
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 17).isSupported) {
            return;
        }
        super.onResume();
        KB4 kb4 = this.LJJII;
        if (kb4 != null) {
            kb4.LIZ();
        }
        C90526LlY c90526LlY = this.LJIIJ;
        if (c90526LlY != null) {
            c90526LlY.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p264f.AbstractC3010b
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 25).isSupported) {
            return;
        }
        C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ("effect_gift");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 18).isSupported) {
            return;
        }
        super.onPause();
        KB4 kb4 = this.LJJII;
        if (kb4 != null && !PatchProxy.proxy(new Object[0], kb4, KB4.LIZ, false, 3).isSupported) {
            kb4.LJI = true;
            ALogger.m15801d("CaptureImageUploadController", "pause");
            Disposable disposable2 = kb4.LIZIZ;
            if (disposable2 != null && !disposable2.isDisposed() && (disposable = kb4.LIZIZ) != null) {
                disposable.dispose();
            }
        }
        this.LJJIJL = false;
        AbstractC2865ak abstractC2865ak = this.LJII;
        if (abstractC2865ak != null && abstractC2865ak.LIZ().LIZ(this.LJIILLIIL)) {
            this.LJJIJL = true;
        } else if (this.LJIIIZ == null) {
        }
    }

    private void LJIILIIL() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 12).isSupported) {
            return;
        }
        this.LJIIIZ = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).getCameraCaptureInst(this.LJIILIIL, this.LIZJ);
        KCU.LIZ(LiveMode.VIDEO, "live_core_start");
        K9Y k9y = this.LJIIIZ;
        if (k9y == null) {
            return;
        }
        k9y.LIZ(this.LJIIL);
        this.LJJJJ = new KAH(this);
        this.LJIIIZ.LIZJ = (AbstractC86561K9b) C64646Bf6.LIZ(this.LJJJJ);
        this.LJJIIZI = new KAA(this);
        this.LJIIIZ.LIZ(this.LJJIIZI);
        this.LJJJIL = new K50(this);
        this.LJIIIZ.LIZ((K9Z) C64646Bf6.LIZ(this.LJJJIL));
        AbstractC2864aj abstractC2864aj = this.LJIIIIZZ;
        if (abstractC2864aj != null) {
            abstractC2864aj.LIZ(this.LJIIIZ);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.observe("cast_game_panel_height_change", this);
        }
        MessageCenter.addListener(this.LJJIL);
        int intValue = LiveSettingKeys.STREAM_HARDWARE_ENCODE.getValue().intValue();
        if (intValue > 0) {
            if (intValue == 2) {
                z = true;
            }
        } else {
            z = this.LJJIIZ.hardwareEncode;
        }
        this.LJJIJIL = new C82009ITz(this.LIZJ, this.LJJIIZ.LIZIZ(), this.LJJIIZ.LIZ(), z);
        this.LJJIJIL.LIZLLL();
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJI;
        if (effectLiveBroadcastActivityProxy != null) {
            effectLiveBroadcastActivityProxy.LIZ(this.LIZJ);
            this.LJI.LIZ(new K79(this));
        }
        if (!LiveConfigSettingKeys.LIVE_ANCHOR_FIX_UPLOAD_ORIGIN_FRAMES_ENABLE.getValue().booleanValue() || !LiveSettingKeys.LIVE_STREAM_REFACTOR.getValue().booleanValue()) {
            LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public final void LIZIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 20).isSupported) {
            return;
        }
        super.LIZIZ();
        String str2 = "use";
        if (AbstractC80293Hkt.LLLLZLLIL.LIZ().booleanValue() && this.LJIILLIIL != null) {
            HashMap hashMap = new HashMap();
            if (!AbstractC80293Hkt.LLLZIIL.LIZ().booleanValue()) {
                str = "unuse";
            } else {
                str = str2;
            }
            hashMap.put("user_status", str);
            hashMap.put("room_id", String.valueOf(this.LJIILLIIL.getIdStr()));
            hashMap.put("anchor_id", String.valueOf(this.LJIILLIIL.ownerUserId));
            Room room = this.LJIILLIIL;
            if (room != null && room.hasCommerceGoods()) {
                hashMap.put("is_ecom", "1");
            } else {
                hashMap.put("is_ecom", "0");
            }
            C4574547f.LIZ().LIZ("livesdk_live_replay_use", hashMap, new C8668v(), Room.class);
        }
        if (AbstractC80293Hkt.LLLLZLL.LIZ().booleanValue()) {
            HashMap hashMap2 = new HashMap();
            if (!AbstractC80293Hkt.f7259j.LIZ().booleanValue()) {
                str2 = "unuse";
            }
            hashMap2.put("user_status", str2);
            C4574547f.LIZ().LIZ("livesdk_live_record_use", hashMap2, new C8668v(), Room.class);
        }
        AbstractC2864aj abstractC2864aj = this.LJIIIIZZ;
        if (abstractC2864aj != null) {
            abstractC2864aj.LIZIZ();
        }
        KB4 kb4 = this.LJJII;
        if (kb4 != null && !PatchProxy.proxy(new Object[0], kb4, KB4.LIZ, false, 4).isSupported) {
            kb4.LJII = 0L;
            kb4.LIZIZ();
        }
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJI;
        if (effectLiveBroadcastActivityProxy != null) {
            effectLiveBroadcastActivityProxy.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJI().LIZ(this);
        if (LiveSettingKeys.LIVE_STREAM_REFACTOR.getValue().booleanValue()) {
            if (!PatchProxy.proxy(new Object[0], this, f26007LJ, false, 5).isSupported) {
                LJIILIIL();
                this.LJIIJ = new C90526LlY(this);
                return;
            }
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, f26007LJ, false, 4).isSupported) {
            LIZ(C5986ap.class);
            LIZ(C3QD.class);
            LIZ(C3QC.class);
            this.LJIILLIIL = (Room) this.dataCenter.get("data_room");
            this.LJJ = false;
            LJIILIIL();
            this.LJIIJ = new C90526LlY(this);
            this.dataCenter.put("data_sticker_message_manager", this.LJIIJ);
            this.dataCenter.observe("data_broadcast_pause_state", this);
            if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
                ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ(this.LJJIIJZLJL);
            }
            m15854LJ();
            LJII();
            this.dataCenter.put("data_broadcast_preview_surface_view", new WeakReference(this.LJIILIIL));
            this.LJIL = C5923dp.LJIIJ.LIZ(this.dataCenter, LJIIJ()).LLILL().LIZIZ().subscribe(new Consumer(this) { // from class: X.KAI
                public static ChangeQuickRedirect LIZ;
                public final VideoWidget2 LIZIZ;

                static {
                    Covode.recordClassIndex(18944);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LIZIZ((Boolean) obj);
                }
            });
            LJI();
        }
        this.LJJIII = true;
    }

    public final void LJIIIZ() {
        if (!PatchProxy.proxy(new Object[0], this, f26007LJ, false, 39).isSupported && this.LJJIJ != null && this.dataCenter != null) {
            AbstractC5503n hostStickerViewService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).hostStickerViewService();
            Context context = getContext();
            KAM kam = new KAM(this);
            if (hostStickerViewService != null && (context instanceof AppCompatActivity) && !((IHostAction) ServiceManager.getService(IHostAction.class)).isLiveInPluginMode() && !LiveSettingKeys.LIVE_ANCHOR_ENABLE_OWN_STICKER_PANEL.getValue().booleanValue()) {
                hostStickerViewService.LIZ(new KA9(this));
                Sticker sticker = this.LJJIFFI;
                if (sticker != null) {
                    hostStickerViewService.LIZ((AppCompatActivity) context, sticker, this.LJIJJLI, true, true);
                    this.LJJIFFI = null;
                }
                hostStickerViewService.LIZ(new KAN(this));
                C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ().LIZ(new KAE(this, hostStickerViewService));
                IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(MessageType.PROPS_BG_IMAGE_MESSAGE.LIZ(), this);
                    ALogger.m15801d(LJFF, "add message listener successful.");
                }
                C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ().LJI = LJIIJ();
                hostStickerViewService.LIZ(this);
                hostStickerViewService.LIZ((AppCompatActivity) context, this.LJJIJ, C86676KDm.LIZLLL, this.LJIJJLI, kam);
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("content_type", "normal_type");
                C4574547f LIZ = C4574547f.LIZ();
                HashMap<String, String> LIZ2 = LIZ(hashMap);
                C8668v c8668v = new C8668v();
                c8668v.LIZIZ("live_take");
                c8668v.LJFF("click");
                c8668v.LIZ("live_take_detail");
                LIZ.LIZ("pm_live_sticker_click", LIZ2, c8668v, new C8670x());
                if (((Boolean) this.dataCenter.get("data_need_show_task_sticker_toast", (String) Boolean.FALSE)).booleanValue() && this.LJJIZ) {
                    C88440Kt0.LIZ(LK5.LIZ(2131582606));
                    this.LJJIZ = false;
                }
            } else if (this.LJI != null) {
                if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                    this.LJI.LIZ(kam);
                    IMessageManager iMessageManager2 = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
                    if (iMessageManager2 != null) {
                        iMessageManager2.addMessageListener(MessageType.PROPS_BG_IMAGE_MESSAGE.LIZ(), this);
                        ALogger.m15801d(LJFF, "add message listener successful.");
                    }
                    C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ().LJI = LJIIJ();
                    C86931KNh mo15786LJ = C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ();
                    EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJI;
                    effectLiveBroadcastActivityProxy.getClass();
                    mo15786LJ.LIZ(KAL.LIZ(effectLiveBroadcastActivityProxy));
                }
                this.LJI.LIZ(true);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        MethodCollector.m14708i(1383);
        if (PatchProxy.proxy(new Object[0], this, f26007LJ, false, 19).isSupported) {
            MethodCollector.m14707o(1383);
            return;
        }
        super.onDestroy();
        Disposable disposable = this.LJIL;
        if (disposable != null) {
            disposable.dispose();
        }
        MessageCenter.removeListener(this.LJJIL);
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
            ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZIZ(this.LJJIIJZLJL);
        }
        K9Y k9y = this.LJIIIZ;
        if (k9y != null) {
            k9y.LIZ();
            this.LJIIIZ.LIZIZ(this.LJJIIZI);
            this.LJIIIZ.LIZJ = null;
        }
        this.LJIILL = null;
        this.LJIILJJIL = null;
        C90526LlY c90526LlY = this.LJIIJ;
        if (c90526LlY != null && !PatchProxy.proxy(new Object[0], c90526LlY, C90526LlY.LIZ, false, 14).isSupported) {
            c90526LlY.f9024LJ.removeCallbacksAndMessages(null);
            c90526LlY.LIZIZ.clear();
            c90526LlY.LIZJ.clear();
            if (c90526LlY.LJFF != null) {
                c90526LlY.LJFF.LIZ();
            }
            ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).removeAnimationEngine(GiftType.STICKER_GIFT);
            C80449HnP c80449HnP = c90526LlY.LJIIIZ;
            if (!PatchProxy.proxy(new Object[0], c80449HnP, C80449HnP.LIZ, false, 3).isSupported) {
                MessageCenter.removeListener(c80449HnP);
            }
        }
        GlUtil.nativeDetachThreadToOpenGl();
        WeakHandler weakHandler = this.LJIIZILJ;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        C82009ITz c82009ITz = this.LJJIJIL;
        if (c82009ITz != null) {
            if (!PatchProxy.proxy(new Object[0], c82009ITz, C82009ITz.LIZ, false, 5).isSupported) {
                ALogger.m15801d("CaptureVideoUploadController", "stop");
                if (!c82009ITz.LIZJ().isDisposed()) {
                    c82009ITz.LIZJ().dispose();
                }
                try {
                    C116971W2r.LIZ(new File(c82009ITz.LIZ()));
                    C116971W2r.LIZ(new File(c82009ITz.LIZIZ()));
                } catch (Throwable th) {
                    ALogger.m15798e("CaptureVideoUploadController", th);
                }
            }
            this.LJJIJIL = null;
        }
        AbstractC5503n hostStickerViewService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).hostStickerViewService();
        if (hostStickerViewService != null) {
            hostStickerViewService.LIZJ();
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(MessageType.PROPS_BG_IMAGE_MESSAGE.LIZ(), this);
            ALogger.m15801d(LJFF, "remove message listener successful");
        }
        KDM kdm = this.LJJIJIIJI;
        if (kdm != null) {
            kdm.LIZJ = true;
        }
        MethodCollector.m14707o(1383);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [byte, boolean] */
    public final /* synthetic */ void LJIIJJI() {
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy;
        KE1 ke1;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, f26007LJ, false, 46).isSupported && (effectLiveBroadcastActivityProxy = this.LJI) != null) {
            this.LJJIJIIJIL = true;
            ?? r8 = this.LJJ;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(r8 == true ? (byte) 1 : (byte) 0)}, effectLiveBroadcastActivityProxy, EffectLiveBroadcastActivityProxy.LIZ, false, 31).isSupported) {
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJI().LIZ(1, 0);
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(effectLiveBroadcastActivityProxy.LJIJI);
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(effectLiveBroadcastActivityProxy.LJIJJ);
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) r8)}, effectLiveBroadcastActivityProxy, EffectLiveBroadcastActivityProxy.LIZ, false, 30).isSupported) {
                    ALogger.m15801d("EffectLiveBroadcastActivityProxy", "COMPOSER INIT : initializing config");
                    if (r8 != 0) {
                        AbstractC4169j LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
                        n$a n_a = new n$a();
                        n_a.LIZ(CollectionsKt__CollectionsKt.emptyList());
                        n_a.LIZIZ(CollectionsKt__CollectionsJVMKt.listOf("effect_gift"));
                        n_a.LIZ(effectLiveBroadcastActivityProxy.LJIJJLI);
                        KAT LIZ = n_a.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        LJII.LIZ(LIZ);
                    } else {
                        AbstractC4169j LJII2 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
                        n$a n_a2 = new n$a();
                        n_a2.LIZ(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{C86676KDm.LIZJ, C86676KDm.LJI, "beauty", C86676KDm.LIZLLL, C86676KDm.LJIIIZ}));
                        n_a2.LIZIZ(CollectionsKt__CollectionsJVMKt.listOf("effect_gift"));
                        n_a2.LIZ(effectLiveBroadcastActivityProxy.LJIJJLI);
                        KAT LIZ2 = n_a2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        LJII2.LIZ(LIZ2);
                    }
                }
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LJFF(C86676KDm.LIZJ);
                SettingKey<Boolean> settingKey = LiveEffectSettingKeys.RESTORE_VIDEO_EFFECT;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    C4209g LIZ3 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ();
                    HashMap hashMap = new HashMap();
                    C86606KAu c86606KAu = new C86606KAu();
                    if (!PatchProxy.proxy(new Object[]{hashMap, c86606KAu}, LIZ3, C4209g.LIZLLL, false, 13).isSupported) {
                        LIZ3.LIZIZ.queryVideoUsedStickers(hashMap, c86606KAu);
                    }
                } else {
                    C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LJFF(C86676KDm.LIZLLL);
                }
                SettingKey<Boolean> settingKey2 = LiveEffectSettingKeys.LIVE_STICKER_FAVORITE_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Boolean value2 = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                if (value2.booleanValue()) {
                    C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LIZLLL(C86676KDm.LIZLLL);
                }
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().mo15785LJ().LIZ(new C4181a(0L, 1, 1));
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZJ().LIZ();
                C86699KEj.LIZ(C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZIZ(), (n$c) null, (String) null, new C4181a(0L, 1, 1), 3, (Object) null);
                if (effectLiveBroadcastActivityProxy.LJIIIZ == null) {
                    effectLiveBroadcastActivityProxy.LJIIIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
                    KE1 ke12 = effectLiveBroadcastActivityProxy.LJIIIZ;
                    if (ke12 != null && ke12.LIZLLL() > 0) {
                        if (!PatchProxy.proxy(new Object[0], effectLiveBroadcastActivityProxy, EffectLiveBroadcastActivityProxy.LIZ, false, 37).isSupported && effectLiveBroadcastActivityProxy.LJIIIZ != null && ((ke1 = effectLiveBroadcastActivityProxy.LJIIIZ) == null || ke1.LIZLLL() != 0)) {
                            AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                            HashMap<String, String> hashMap2 = new HashMap<>();
                            hashMap2.put("event_page", "live_take_detail");
                            hashMap2.put("event_belong", "live_take");
                            hashMap2.put("event_type", "click");
                            hashMap2.put("action_type", "click");
                            KE1 ke13 = effectLiveBroadcastActivityProxy.LJIIIZ;
                            if (ke13 == null || (str = String.valueOf(ke13.LIZLLL())) == null) {
                                str = "0";
                            }
                            hashMap2.put("filter_id", str);
                            LIZIZ.LIZ("live_take_filter_select", hashMap2);
                        }
                        effectLiveBroadcastActivityProxy.LIZIZ(false);
                    }
                }
                effectLiveBroadcastActivityProxy.LJIIJ = new C144769ebr(LiveEffectContextFactory.Type.DEFAULT);
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LIZ(true);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3312ab
    public final void LIZ(K41 k41) {
        this.LJIILJJIL = k41;
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3312ab
    public final void LIZ(K4D k4d) {
        this.LJIILL = k4d;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final Client LIZ(InteractConfig interactConfig) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{interactConfig}, this, f26007LJ, false, 31);
        if (proxy.isSupported) {
            return (Client) proxy.result;
        }
        return this.LIZJ.LIZ(interactConfig);
    }

    public void onEvent(C3QC c3qc) {
        EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy;
        if (!PatchProxy.proxy(new Object[]{c3qc}, this, f26007LJ, false, 29).isSupported && (effectLiveBroadcastActivityProxy = this.LJI) != null) {
            effectLiveBroadcastActivityProxy.LJFF();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public void setAudioMute(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f26007LJ, false, 33).isSupported) {
            return;
        }
        this.LIZJ.LIZ(z);
    }

    public HashMap<String, String> LIZ(HashMap<String, String> hashMap) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hashMap}, this, f26007LJ, false, 37);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        hashMap.put("room_id", String.valueOf(LJIIJ()));
        return hashMap;
    }

    public final /* synthetic */ void LIZIZ(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, f26007LJ, false, 49).isSupported) {
            return;
        }
        if (bool.booleanValue()) {
            this.LJJII.LIZ(this.LIZJ, LJIIJ());
        } else {
            this.LJJII.LIZIZ();
        }
        this.LJJJ = bool.booleanValue();
    }

    public void onEvent(C3QD c3qd) {
        if (PatchProxy.proxy(new Object[]{c3qd}, this, f26007LJ, false, 28).isSupported) {
            return;
        }
        LJIIIZ();
    }

    private void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f26007LJ, false, 16).isSupported || this.dataCenter == null) {
            return;
        }
        if (i == 4) {
            AVLog.ioi("JIESI", "zhongtai receive rending sucess msg from effectSDK");
            C5923dp LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
            if (LIZ != null && LIZ.m15555LL().LIZ().booleanValue()) {
                LIZ.LJZL().LIZ(Boolean.TRUE);
                LIZ.m15555LL().LIZ(Boolean.FALSE);
            }
        } else if (i == 3) {
            Toast makeText = Toast.makeText(getContext(), "渲染失败，请重启道具恢复效果", 0);
            makeText.setGravity(17, 0, 0);
            C116971W2r.LIZIZ(makeText);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        K4D k4d;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{message}, this, f26007LJ, false, 36).isSupported && isViewValid() && message.what == 101 && !this.LJJJ && (k4d = this.LJIILL) != null) {
            if (this.LJJIJLIJ || !(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != 0) {
                z = false;
            }
            k4d.LIZ(z);
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f26007LJ, false, 13).isSupported || i != 1 || this.LJJIJIIJIL) {
            return;
        }
        ALogger.m15801d(LJFF, "COMPOSER INIT : camera state is ready(EFFECT_INIT_SUCCESS).");
        C86665KDb.LIZIZ("ttlive_camera_state_ready", LJFF);
        this.LJIIZILJ.post(new Runnable(this) { // from class: X.KAG
            public static ChangeQuickRedirect LIZ;
            public final VideoWidget2 LIZIZ;

            static {
                Covode.recordClassIndex(18947);
            }

            {
                this.LIZIZ = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.LJIIJJI();
            }
        });
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        C2W3 c2w3;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, f26007LJ, false, 1).isSupported && kVData2 != null && kVData2.getKey() != null && kVData2.getData() != null) {
            String key = kVData2.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -2135400523) {
                if (hashCode == 1370395648 && key.equals("cast_game_panel_height_change")) {
                    int intValue = ((Integer) kVData2.getData(0)).intValue();
                    SurfaceView surfaceView = this.LJIILIIL;
                    if (surfaceView != null) {
                        if (intValue == 0) {
                            surfaceView.getLayoutParams().height = -1;
                        } else {
                            surfaceView.getLayoutParams().height = (int) ((LHN.LIZJ() - intValue) - LK5.LIZJ(2.0f));
                        }
                        surfaceView.requestLayout();
                    }
                }
            } else if (!key.equals("data_broadcast_pause_state") || (c2w3 = (C2W3) kVData2.getData()) == null || this.LJIILL == null) {
            } else {
                if (c2w3.LIZ == 1) {
                    this.LJJIJLIJ = true;
                } else if (c2w3.LIZ != 3) {
                } else {
                    this.LJJIJLIJ = false;
                }
            }
        }
    }

    public void onEvent(C5986ap c5986ap) {
        String string;
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, f26007LJ, false, 27).isSupported) {
            return;
        }
        int i = c5986ap.LIZ;
        if (i != 2) {
            if (i != 28) {
                if (i != 21) {
                    if (i == 22) {
                        boolean z = !AbstractC80293Hkt.LJIIIIZZ.LIZ().booleanValue();
                        AbstractC80293Hkt.LJIIIIZZ.LIZ(Boolean.valueOf(z));
                        K9Y k9y = this.LJIIIZ;
                        if (k9y != null) {
                            k9y.LIZJ();
                        }
                        if (!this.LJJ) {
                            Context context = this.context;
                            if (z) {
                                string = this.context.getResources().getString(2131586005);
                            } else {
                                string = this.context.getResources().getString(2131586006);
                            }
                            C88613Kvn.LIZ(context, string);
                        }
                        C419422im.LIZ(this.context);
                        ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
                        LJIIJ();
                        ALogger.m15801d(LJFF, "Reverse Mirror, CAMERA_MIRROR: " + z);
                        return;
                    }
                    return;
                }
                EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy = this.LJI;
                if (effectLiveBroadcastActivityProxy != null) {
                    effectLiveBroadcastActivityProxy.LIZ(false);
                    return;
                }
                return;
            }
            List<Sticker> LIZIZ = C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(C86676KDm.LIZLLL);
            if (isViewValid() && !LIZIZ.isEmpty() && LIZIZ.get(0).getGame()) {
                C88440Kt0.LIZ(2131585349);
                return;
            }
            EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy2 = this.LJI;
            if (effectLiveBroadcastActivityProxy2 != null) {
                effectLiveBroadcastActivityProxy2.LJFF();
                return;
            }
            return;
        }
        K9Y k9y2 = this.LJIIIZ;
        if (k9y2 != null) {
            k9y2.LIZIZ();
        }
        ALogger.m15801d(LJFF, "Switch Camera, CAMERA_MIRROR: " + AbstractC80293Hkt.LJIIIIZZ);
        AbstractC80293Hkt.LJIIIIZZ.LIZ(Boolean.FALSE);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, f26007LJ, false, 45).isSupported && (iMessage instanceof C81888IPi)) {
            C81888IPi c81888IPi = (C81888IPi) iMessage;
            C86931KNh mo15786LJ = C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ();
            if (c81888IPi.LIZ != null && c81888IPi.LIZ.intValue() == 1) {
                if (c81888IPi.LIZIZ != null) {
                    C88440Kt0.LIZ(c81888IPi.LIZIZ);
                }
                if (c81888IPi.LIZJ == null || c81888IPi.LIZJ.LIZJ == null || c81888IPi.LIZJ.LIZJ.mUrls == null || c81888IPi.LIZJ.LIZJ.mUrls.size() <= 0) {
                    str = "";
                } else {
                    str = c81888IPi.LIZJ.LIZJ.mUrls.get(0);
                }
                ALogger.m15801d(LJFF, C0002O.m25086C("set url to pixelLoopStickerHelper : ", str));
                if (!PatchProxy.proxy(new Object[]{str}, mo15786LJ, C86931KNh.LIZ, false, 9).isSupported) {
                    C106862S5w.LIZ(str);
                    Pair<String, Boolean> pair = mo15786LJ.LIZLLL;
                    if (pair != null) {
                        str2 = pair.getFirst();
                    } else {
                        str2 = null;
                    }
                    if (!new File(str2).exists()) {
                        if (true ^ Intrinsics.areEqual(str, "")) {
                            mo15786LJ.LIZLLL = new Pair<>(mo15786LJ.LIZIZ(str), Boolean.TRUE);
                        } else {
                            ALogger.m15801d("PixelLoopStickerHelper", "url from server is null when picture checked success");
                            C88440Kt0.LIZ(2131587667);
                        }
                    }
                    if (mo15786LJ.LIZLLL != null) {
                        List<Pair<String, Boolean>> list = mo15786LJ.LIZIZ;
                        Pair<String, Boolean> pair2 = mo15786LJ.LIZLLL;
                        Intrinsics.checkNotNull(pair2);
                        list.add(0, new Pair<>(pair2.getFirst(), Boolean.FALSE));
                    }
                    if (mo15786LJ.LIZIZ.size() > 5) {
                        mo15786LJ.LIZIZ.remove(5);
                    }
                    mo15786LJ.LJII = 0;
                    mo15786LJ.LIZLLL = null;
                    KAF kaf = mo15786LJ.LJFF;
                    if (kaf != null) {
                        kaf.LIZ(mo15786LJ.LIZIZ(), mo15786LJ.LJII);
                    }
                    ALogger.m15801d("PixelLoopStickerHelper", "on checked successful");
                }
            } else if (c81888IPi.LIZIZ != null) {
                C88440Kt0.LIZ(c81888IPi.LIZIZ);
                mo15786LJ.LIZ(true);
            } else {
                mo15786LJ.LIZ(false);
            }
        }
    }

    public final /* synthetic */ void LIZ(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, f26007LJ, false, 48).isSupported) {
            return;
        }
        if (bool.booleanValue()) {
            this.LJJII.LIZ(this.LIZJ, LJIIJ());
        } else {
            this.LJJII.LIZIZ();
        }
        this.LJJJ = bool.booleanValue();
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbstractC3312ab
    public final void LIZ(FrameLayout frameLayout, FragmentManager fragmentManager) {
        this.LJIJJLI = frameLayout;
        this.LJJIJ = fragmentManager;
    }

    @Override // com.bytedance.android.live.broadcast.p264f.AbstractC3010b
    public final void LIZ(Sticker sticker, boolean z) {
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f26007LJ, false, 24).isSupported) {
            return;
        }
        C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ("effect_gift", sticker);
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$b */
    /* loaded from: classes5.dex */
    public static class C3311b {
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public String LIZLLL;

        static {
            Covode.recordClassIndex(18870);
        }

        public C3311b(int i, int i2, int i3, String str) {
            this.LIZ = i;
            this.LIZIZ = i2;
            this.LIZJ = i3;
            this.LIZLLL = str;
        }
    }

    public VideoWidget2(AbstractC5437g abstractC5437g, StreamUrlExtra streamUrlExtra, AbstractC5436a abstractC5436a, EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy) {
        super(abstractC5437g, abstractC5436a);
        this.LJJIIZ = streamUrlExtra;
        this.LJI = effectLiveBroadcastActivityProxy;
    }

    public final void LIZ(int i, int i2, int i3, String str) {
        KDM kdm;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f26007LJ, false, 15).isSupported) {
            return;
        }
        if (!this.LJJIII) {
            this.LJJJI.add(new C3311b(i, i2, i3, str));
        } else if (i == 48) {
            if (this.dataCenter != null) {
                this.dataCenter.put("cmd_effect_start", Boolean.TRUE);
                C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJII().LIZIZ(-1L);
                this.LJI.LJIIIIZZ();
            }
        } else if (i == 96) {
            LIZIZ(i2);
        } else if (i == 55) {
            if (this.dataCenter != null) {
                this.dataCenter.put("cmd_magic_gesture_active", str);
            }
        } else if (i == 56 && (kdm = this.LJJIJIIJI) != null) {
            kdm.LIZ(i, i2, i3, str);
        }
    }
}
