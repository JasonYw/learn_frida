package com.bytedance.android.live.broadcastgame.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameSeiStatus;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3387w;
import com.bytedance.android.live.broadcastgame.widget.LiveBroadcastGameControlWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$a;
import com.bytedance.android.live.effect.api.l$d;
import com.bytedance.android.live.effect.sticker.p330a.C4209g;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C100839PnV;
import p003X.C442103eG;
import p003X.C443233g5;
import p003X.C4574547f;
import p003X.C536537Hj;
import p003X.C64646Bf6;
import p003X.C79169HIt;
import p003X.C7IZ;
import p003X.C86738KFw;
import p003X.C88613Kvn;
import p003X.KEQ;
import p003X.KU6;
import p003X.KU9;
import p003X.KUC;
import p003X.KYP;

/* loaded from: classes5.dex */
public class LiveBroadcastGameControlWidget extends LiveWidget implements Observer<KVData>, MessageCenter.Listener, l$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Sticker LIZIZ;
    public boolean LIZJ;
    public KU6 LIZLLL;

    /* renamed from: LJ */
    public long f26118LJ;
    public long LJFF;
    public Room LJI;
    public long LJII;
    public l$d LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public CompositeDisposable LJIIL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(21837);
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker) {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700387;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 25).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.widget.LiveBroadcastGameControlWidget$1 */
    /* loaded from: classes5.dex */
    public class C38701 implements l$d {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ KEQ LIZIZ;

        static {
            Covode.recordClassIndex(21838);
        }

        @Override // com.bytedance.android.live.effect.api.l$d
        /* renamed from: I_ */
        public final void mo15781I_() {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                return;
            }
            ALogger.m15800e("LiveBroadcastGameControlWidget", "onSyncStickersFailed() ");
        }

        @Override // com.bytedance.android.live.effect.api.l$d
        public final void LIZ(EffectChannelResponse effectChannelResponse) {
            if (PatchProxy.proxy(new Object[]{effectChannelResponse}, this, LIZ, false, 1).isSupported || effectChannelResponse == null) {
                return;
            }
            List<Effect> allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
            if (Lists.isEmpty(allCategoryEffects)) {
                return;
            }
            Single<Sticker> LIZ2 = C86738KFw.LIZ(allCategoryEffects.get(0));
            final KEQ keq = this.LIZIZ;
            LIZ2.subscribe(new BiConsumer(this, keq) { // from class: X.KSx
                public static ChangeQuickRedirect LIZ;
                public final LiveBroadcastGameControlWidget.C38701 LIZIZ;
                public final KEQ LIZJ;

                static {
                    Covode.recordClassIndex(21859);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = keq;
                }

                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    if (PatchProxy.proxy(new Object[]{obj, obj2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveBroadcastGameControlWidget.C38701 c38701 = this.LIZIZ;
                    KEQ keq2 = this.LIZJ;
                    Sticker sticker = (Sticker) obj;
                    if (PatchProxy.proxy(new Object[]{keq2, sticker, obj2}, c38701, LiveBroadcastGameControlWidget.C38701.LIZ, false, 3).isSupported) {
                        return;
                    }
                    sticker.setDownloaded(keq2.LIZ(sticker));
                    if (!sticker.isDownloaded()) {
                        LiveBroadcastGameControlWidget.this.f26118LJ = System.currentTimeMillis();
                        keq2.LIZ("livemoneygame", sticker, LiveBroadcastGameControlWidget.this);
                        return;
                    }
                    LiveBroadcastGameControlWidget.this.LIZIZ = sticker;
                }
            });
        }

        public C38701(KEQ keq) {
            this.LIZIZ = keq;
        }
    }

    private void LIZ() {
        C4209g LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported || (LIZ2 = C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ()) == null) {
            return;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new C38701(LIZ2);
        }
        LIZ2.LIZ("livemoneygame", (l$d) C64646Bf6.LIZ(this.LJIIIIZZ));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LJI = (Room) this.dataCenter.get("data_room");
        LIZ();
        MessageCenter.addListener(this);
        this.dataCenter.observeForever("cmd_old_broadcast_game_click", this).observeForever("data_link_state", this).observeForever("data_eyes_blinked_game_item", this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJII = 0L;
        MessageCenter.removeListener(this);
        this.dataCenter.removeObserver(this);
        this.LJIIL.clear();
        this.LJIIJ = 0L;
        this.LIZLLL = null;
        this.f26118LJ = 0L;
        this.LJIIIZ = false;
        super.onDestroy();
    }

    private void LIZ(Runnable runnable) {
        KU6 ku6;
        if (!PatchProxy.proxy(new Object[]{runnable}, this, LIZ, false, 4).isSupported && (ku6 = this.LIZLLL) != null && ku6.LIZJ != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZ(boolean z) {
        KU6 ku6;
        KU6 ku62;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJII = 0L;
        if (this.LIZIZ != null) {
            LIZ(new Runnable(this) { // from class: X.KU8
                public static ChangeQuickRedirect LIZ;
                public final LiveBroadcastGameControlWidget LIZIZ;

                static {
                    Covode.recordClassIndex(21853);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[0], liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 22).isSupported) {
                        return;
                    }
                    KUH.LIZIZ.LIZIZ(liveBroadcastGameControlWidget.LIZLLL.LIZJ);
                }
            });
            ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("blink");
            C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ("livemoneygame");
            this.dataCenter.put("cmd_hide_other_toolbar", Boolean.FALSE);
            this.dataCenter.removeObserver("cmd_broadcast_game_finish", this);
            this.LIZJ = false;
            Room room = this.LJI;
            if (!PatchProxy.proxy(new Object[]{room, Byte.valueOf((byte) z)}, this, LIZ, false, 15).isSupported && (ku62 = this.LIZLLL) != null && ku62.LIZJ != null && room != null) {
                if (this.LIZLLL.LIZJ.LJFF() != null) {
                    str = String.valueOf(this.LIZLLL.LIZJ.LJFF().LIZLLL);
                } else {
                    str = "4000002";
                }
                if (z != 0) {
                    str2 = "abnormal";
                } else {
                    str2 = "normal";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("room_id", room.getIdStr());
                hashMap.put("game_name", this.LIZLLL.LIZJ.LJFF);
                hashMap.put("end_type", str2);
                if (KU9.LIZIZ.LIZ(this.dataCenter) > 1) {
                    hashMap.put("status", "play_again");
                } else {
                    hashMap.put("status", "play_end");
                }
                hashMap.put("game_id", str);
                C4574547f.LIZ().LIZ("livesdk_live_game_end", hashMap, Room.class);
                this.LIZLLL.LIZIZ = Long.valueOf(System.currentTimeMillis());
                Long valueOf = Long.valueOf(this.LIZLLL.LIZIZ.longValue() - this.LIZLLL.LIZ.longValue());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap2.put("room_id", room.getIdStr());
                hashMap2.put("game_name", this.LIZLLL.LIZJ.LJFF);
                hashMap2.put("game_id", str);
                hashMap2.put("duration", String.valueOf(valueOf));
                C4574547f.LIZ().LIZ("livesdk_game_duration", hashMap2, Room.class);
            }
            Room room2 = this.LJI;
            if (!PatchProxy.proxy(new Object[]{room2, Byte.valueOf((byte) z)}, this, LIZ, false, 12).isSupported && room2 != null && this.LJFF != 0 && (ku6 = this.LIZLLL) != null && ku6.LIZJ != null) {
                long j = 4000002;
                if (this.LIZLLL.LIZJ.LJFF() != null) {
                    j = this.LIZLLL.LIZJ.LJFF().LIZLLL;
                }
                LIZ(GameSeiStatus.GAME_STOP, this.LIZLLL.LIZJ);
                final long j2 = this.LJFF;
                ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).notifyServerGameStop(j, room2.getId(), this.LJFF, "", z, 1, 0L).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).retryWhen(C100839PnV.LIZ(3)).subscribe(new Consumer(this, j2) { // from class: X.KU3
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastGameControlWidget LIZIZ;
                    public final long LIZJ;

                    static {
                        Covode.recordClassIndex(21857);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = j2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                        long j3 = this.LIZJ;
                        C5171b c5171b = (C5171b) obj;
                        if (PatchProxy.proxy(new Object[]{new Long(j3), c5171b}, liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 18).isSupported) {
                            return;
                        }
                        ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStatusStop(0, liveBroadcastGameControlWidget.LIZLLL.LIZJ, j3, null, c5171b.f26526LJ);
                    }
                }, new Consumer(this, j2) { // from class: X.KU4
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastGameControlWidget LIZIZ;
                    public final long LIZJ;

                    static {
                        Covode.recordClassIndex(21858);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = j2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                        long j3 = this.LIZJ;
                        Throwable th = (Throwable) obj;
                        if (PatchProxy.proxy(new Object[]{new Long(j3), th}, liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 17).isSupported) {
                            return;
                        }
                        ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStatusStop(1, liveBroadcastGameControlWidget.LIZLLL.LIZJ, j3, th, "");
                    }
                });
                this.LJFF = 0L;
                this.LJIIJJI = 0L;
                KYP.LIZIZ.LIZ();
            }
            this.dataCenter.put("data_blink_is_playing", Boolean.FALSE);
            KU6 ku63 = this.LIZLLL;
            if (ku63 != null && ku63.LIZJ != null) {
                ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStop(0, this.LIZLLL.LIZJ, z);
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        KU6 ku6;
        String str;
        String str2;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 10).isSupported) {
            if (kVData2.getKey().equals("data_link_state")) {
                if (C79169HIt.LIZIZ(((Integer) kVData2.getData(0)).intValue(), 4)) {
                    LIZ(true);
                }
            } else if (kVData2.getKey().equals("cmd_broadcast_game_finish")) {
                KUC gameExitConformDialog = ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).getGameExitConformDialog(this.context, "old-game");
                gameExitConformDialog.LIZIZ(new View.OnClickListener(this) { // from class: X.KUA
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastGameControlWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(21854);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{view}, liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 21).isSupported || !liveBroadcastGameControlWidget.LIZJ) {
                            return;
                        }
                        liveBroadcastGameControlWidget.LIZ(false);
                    }
                });
                gameExitConformDialog.show();
            } else if (kVData2.getKey().equals("cmd_old_broadcast_game_click")) {
                if (!this.LIZJ) {
                    if (this.LIZIZ == null) {
                        LIZ();
                    }
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && !this.isDestroyed) {
                        if (this.LIZIZ != null) {
                            LIZ(new Runnable(this) { // from class: X.KU7
                                public static ChangeQuickRedirect LIZ;
                                public final LiveBroadcastGameControlWidget LIZIZ;

                                static {
                                    Covode.recordClassIndex(21851);
                                }

                                {
                                    this.LIZIZ = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                                    if (PatchProxy.proxy(new Object[0], liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 24).isSupported) {
                                        return;
                                    }
                                    KUH.LIZIZ.LIZ(liveBroadcastGameControlWidget.LIZLLL.LIZJ);
                                }
                            });
                            this.dataCenter.put("data_blink_is_playing", Boolean.TRUE);
                            ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStart("blink", null);
                            C4173o.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ("livemoneygame", this.LIZIZ);
                            this.dataCenter.put("cmd_hide_other_toolbar", Boolean.TRUE);
                            this.dataCenter.observe("cmd_broadcast_game_finish", this);
                            this.LIZJ = true;
                            this.LJII = System.currentTimeMillis();
                            LIZ(new Runnable(this) { // from class: X.KU5
                                public static ChangeQuickRedirect LIZ;
                                public final LiveBroadcastGameControlWidget LIZIZ;

                                static {
                                    Covode.recordClassIndex(21852);
                                }

                                {
                                    this.LIZIZ = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                                    if (PatchProxy.proxy(new Object[0], liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 23).isSupported) {
                                        return;
                                    }
                                    KUH.LIZIZ.LIZ(liveBroadcastGameControlWidget.LIZLLL.LIZJ, new HashMap());
                                }
                            });
                            if (this.LJI != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("anchor_id", String.valueOf(this.LJI.getOwnerUserId()));
                                hashMap.put("room_id", this.LJI.getIdStr());
                                hashMap.put("action_type", "click");
                                C4574547f.LIZ().LIZ("livesdk_blinkgame_click", hashMap, new Object[0]);
                                if (this.LIZLLL == null) {
                                    this.LIZLLL = new KU6((C3384q) this.dataCenter.get("data_eyes_blinked_game_item"));
                                }
                                if (C442103eG.LJIJJ() != null && !this.LIZLLL.LIZJ.LIZLLL().isEmpty()) {
                                    C443233g5.LIZIZ.LIZ(this.LIZLLL.LIZJ.LIZLLL(), C443233g5.LIZIZ.LIZ());
                                }
                                this.LIZLLL.LIZ = Long.valueOf(System.currentTimeMillis());
                                Room room = this.LJI;
                                String str3 = "";
                                if (!PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 14).isSupported && (ku6 = this.LIZLLL) != null && ku6.LIZJ != null && room != null) {
                                    if (this.LIZLLL.LIZJ.LJFF() != null) {
                                        str = String.valueOf(this.LIZLLL.LIZJ.LJFF().LIZLLL);
                                    } else {
                                        str = "4000002";
                                    }
                                    if (KU9.LIZIZ.LIZ(this.dataCenter) > 0) {
                                        str2 = "play_again";
                                    } else {
                                        str2 = "first_start";
                                    }
                                    KU9 ku9 = KU9.LIZIZ;
                                    DataCenter dataCenter = this.dataCenter;
                                    if (!PatchProxy.proxy(new Object[]{dataCenter}, ku9, KU9.LIZ, false, 2).isSupported && dataCenter != null) {
                                        Object obj = dataCenter.get("data_eyes_blinked_game_start_times", (String) 0);
                                        Intrinsics.checkNotNullExpressionValue(obj, str3);
                                        dataCenter.get("data_eyes_blinked_game_start_times", (String) Integer.valueOf(((Number) obj).intValue() + 1));
                                    }
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                                    hashMap2.put("room_id", room.getIdStr());
                                    hashMap2.put("game_name", this.LIZLLL.LIZJ.LJFF);
                                    hashMap2.put("status", str2);
                                    hashMap2.put("game_id", str);
                                    C4574547f.LIZ().LIZ("livesdk_live_game_start", hashMap2, Room.class);
                                }
                                Room room2 = this.LJI;
                                if (!PatchProxy.proxy(new Object[]{room2}, this, LIZ, false, 11).isSupported && room2 != null) {
                                    long j = 4000002;
                                    KU6 ku62 = this.LIZLLL;
                                    if (ku62 != null && ku62.LIZJ != null) {
                                        if (this.LIZLLL.LIZJ.LJFF() != null) {
                                            j = this.LIZLLL.LIZJ.LJFF().LIZLLL;
                                            str3 = this.LIZLLL.LIZJ.LJFF().LJFF;
                                        }
                                        LIZ(GameSeiStatus.GAME_START, this.LIZLLL.LIZJ);
                                    }
                                    this.LJIIJJI = System.currentTimeMillis();
                                    KYP.LIZIZ.LIZJ(this.LJIIJJI);
                                    KYP.LIZIZ.LIZ(j);
                                    this.LJIIL.add(((C536537Hj) ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).notifyServerGameStart(j, room2.getId(), str3, System.currentTimeMillis()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).m151as(C7IZ.LIZ())).LIZ(C100839PnV.LIZ(3)).subscribe(new Consumer(this) { // from class: X.KU1
                                        public static ChangeQuickRedirect LIZ;
                                        public final LiveBroadcastGameControlWidget LIZIZ;

                                        static {
                                            Covode.recordClassIndex(21855);
                                        }

                                        {
                                            this.LIZIZ = this;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj2) {
                                            if (PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 1).isSupported) {
                                                return;
                                            }
                                            LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                                            C5171b c5171b = (C5171b) obj2;
                                            if (PatchProxy.proxy(new Object[]{c5171b}, liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 20).isSupported) {
                                                return;
                                            }
                                            liveBroadcastGameControlWidget.LJFF = ((C3387w) c5171b.LIZJ).LIZIZ;
                                            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStatusStart(0, liveBroadcastGameControlWidget.LIZLLL.LIZJ, liveBroadcastGameControlWidget.LJFF, null, c5171b.f26526LJ);
                                            KYP.LIZIZ.LIZIZ(liveBroadcastGameControlWidget.LJFF);
                                        }
                                    }, new Consumer(this) { // from class: X.KU2
                                        public static ChangeQuickRedirect LIZ;
                                        public final LiveBroadcastGameControlWidget LIZIZ;

                                        static {
                                            Covode.recordClassIndex(21856);
                                        }

                                        {
                                            this.LIZIZ = this;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj2) {
                                            if (PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 1).isSupported) {
                                                return;
                                            }
                                            LiveBroadcastGameControlWidget liveBroadcastGameControlWidget = this.LIZIZ;
                                            Throwable th = (Throwable) obj2;
                                            if (PatchProxy.proxy(new Object[]{th}, liveBroadcastGameControlWidget, LiveBroadcastGameControlWidget.LIZ, false, 19).isSupported) {
                                                return;
                                            }
                                            ALogger.m15798e("LiveBroadcastGameControlWidget", th);
                                            ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStatusStart(1, liveBroadcastGameControlWidget.LIZLLL.LIZJ, 0L, th, "");
                                        }
                                    }));
                                }
                                ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStartupResult(0, (C3384q) this.dataCenter.get("data_draw_guess_game_item", (String) null), null);
                                return;
                            }
                            return;
                        }
                        C88613Kvn.LIZ(this.context, 2131583746);
                        ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).logGameStartupResult(1, (C3384q) this.dataCenter.get("data_draw_guess_game_item", (String) null), null);
                    }
                }
            } else if (!kVData2.getKey().equals("data_eyes_blinked_game_item")) {
            } else {
                C3384q c3384q = (C3384q) this.dataCenter.get("data_eyes_blinked_game_item");
                if (this.LIZLLL == null) {
                    this.LIZLLL = new KU6(c3384q);
                }
                long j2 = this.LJIIJ;
                if (j2 == 0) {
                    return;
                }
                LIZ(this.LJI, j2, this.LJIIIZ);
                this.LJIIJ = 0L;
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZIZ(String str, Sticker sticker) {
        if (!PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 8).isSupported && str.equals("livemoneygame")) {
            this.LIZIZ = sticker;
            this.LJIIIZ = true;
            this.LJIIJ = System.currentTimeMillis() - this.f26118LJ;
            if (this.LIZLLL != null) {
                LIZ(this.LJI, this.LJIIJ, this.LJIIIZ);
            }
        }
    }

    private void LIZ(GameSeiStatus gameSeiStatus, C3384q c3384q) {
        C5923dp LIZ2;
        AbstractC5436a LIZIZ;
        if (!PatchProxy.proxy(new Object[]{gameSeiStatus, c3384q}, this, LIZ, false, 13).isSupported && (LIZ2 = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L)) != null && LIZ2.LJJLIIIJL() != null && (LIZIZ = LIZ2.LJJLIIIJL().LIZIZ()) != null) {
            ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).sendGameSeiStatus(gameSeiStatus, LIZIZ, c3384q);
        }
    }

    private void LIZ(Room room, long j, boolean z) {
        KU6 ku6;
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[]{room, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported && (ku6 = this.LIZLLL) != null && ku6.LIZJ != null && room != null) {
            if (!z) {
                str = "0";
            } else {
                str = "1";
            }
            if (this.LIZLLL.LIZJ.LJFF() != null) {
                str2 = String.valueOf(this.LIZLLL.LIZJ.LJFF().LIZLLL);
            } else {
                str2 = "4000002";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", room.getIdStr());
            hashMap.put("game_name", this.LIZLLL.LIZJ.LJFF);
            hashMap.put("duration", String.valueOf(j));
            hashMap.put("game_id", str2);
            hashMap.put("status", str);
            C4574547f.LIZ().LIZ("livesdk_live_game_loading_duration", hashMap, new Object[0]);
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker, ExceptionResult exceptionResult) {
        if (!PatchProxy.proxy(new Object[]{str, sticker, exceptionResult}, this, LIZ, false, 7).isSupported && str.equals("livemoneygame")) {
            this.LJIIIZ = false;
            this.LJIIJ = System.currentTimeMillis() - this.f26118LJ;
            if (this.LIZLLL != null) {
                LIZ(this.LJI, this.LJIIJ, this.LJIIIZ);
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 9).isSupported && i == 10101 && i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (this.LJI != null && this.LJII != 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.LJI.getOwnerUserId()));
                    hashMap.put("room_id", this.LJI.getIdStr());
                    hashMap.put("action_type", "click");
                    hashMap.put("game_score", jSONObject.opt("score").toString());
                    hashMap.put("play_duration", String.valueOf(((float) (System.currentTimeMillis() - this.LJII)) / 1000.0f));
                    C4574547f.LIZ().LIZ("livesdk_blinkgame_exit", hashMap, new Object[0]);
                    this.LJII = System.currentTimeMillis();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
