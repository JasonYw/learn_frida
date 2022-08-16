package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.AbstractC5440d;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.report.AbstractC5443b;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC86456K5a;
import p003X.AbstractC86477K5v;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C440943cO;
import p003X.C86447K4r;
import p003X.C86479K5x;
import p003X.C87010KQi;
import p003X.C91211Lwb;
import p003X.GN7;
import p003X.GNB;
import p003X.K5T;
import p003X.K5Y;
import p003X.K61;
import p003X.K62;
import p003X.K6U;
import p003X.LK5;

/* loaded from: classes5.dex */
public class BgBroadcastServiceImpl extends GN7 implements AbstractC5440d {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static MediaProjection sProjection;
    public static Intent sProjectionIntent;
    public Disposable liveEventDisposable;
    public LiveStatus mLiveStatus;
    public AbstractC5440d mLiveStreamCallback;
    public AbstractC86456K5a mPushStreamReporter;
    public Room mRoom;
    public AbstractC86477K5v mStrategy;
    public Service mStub;
    public GNB mUiListener;
    public Disposable pauseStateDisposable;

    static {
        Covode.recordClassIndex(14665);
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onLogMonitor(String str, JSONObject jSONObject) {
        boolean z = PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 26).isSupported;
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onNetworkLow() {
    }

    public void onNetworkStatus(int i) {
        boolean z = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 25).isSupported;
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onReconnect() {
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onReconnected() {
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onStreamEnd(int i, C86447K4r c86447K4r) {
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onStreamStart() {
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public static Intent getProjectionIntent() {
        return sProjectionIntent;
    }

    @Override // p003X.GN7
    public boolean isLiveFinished() {
        if (this.mLiveStatus == LiveStatus.FINISHED) {
            return true;
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public enum LiveStatus {
        IDLE,
        LIVING,
        FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LiveStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (LiveStatus[]) proxy.result;
            }
            return (LiveStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(14666);
        }

        public static LiveStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (LiveStatus) proxy.result;
            }
            return (LiveStatus) Enum.valueOf(LiveStatus.class, str);
        }
    }

    public AbstractC5436a getLiveStream() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        AbstractC86477K5v abstractC86477K5v = this.mStrategy;
        if (abstractC86477K5v != null) {
            return abstractC86477K5v.mo23512LJ();
        }
        return null;
    }

    @Override // p003X.GN7
    public void startAudio() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        this.mStrategy.LIZIZ();
    }

    @Override // p003X.GN7
    public void stopAudio() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        this.mStrategy.LIZJ();
    }

    private void initPushStreamReporter() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        if (this.mRoom.getRoomLayout() == 999) {
            this.mPushStreamReporter = null;
        } else {
            this.mPushStreamReporter = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).getStreamReporter(this.mRoom, new AbstractC5443b(this) { // from class: X.K5w
                public static ChangeQuickRedirect LIZ;
                public final BgBroadcastServiceImpl LIZIZ;

                static {
                    Covode.recordClassIndex(14686);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // com.bytedance.android.live.pushstream.report.AbstractC5443b
                public final void LIZ(int i, boolean z, int i2, Throwable th) {
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), th}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.lambda$initPushStreamReporter$3$BgBroadcastServiceImpl(i, z, i2, th);
                }
            });
        }
    }

    @Override // p003X.GN7
    public Intent getNotificationIntent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Intent) proxy.result;
        }
        IHostApp iHostApp = (IHostApp) ServiceManager.getService(IHostApp.class);
        if (iHostApp == null) {
            return null;
        }
        Intent intent = new Intent(this.mStub, iHostApp.getHostActivity(6));
        intent.addFlags(268435456);
        intent.putExtra("hotsoon.intent.extra.ROOM_CONTINUE", true);
        return intent;
    }

    @Override // p003X.GN7
    public void startBgActivity() {
        Service service;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported && (service = this.mStub) != null) {
            Intent intent = new Intent(service, ((IHostApp) ServiceManager.getService(IHostApp.class)).getHostActivity(6));
            intent.addFlags(268435456);
            C116971W2r.LIZ(LK5.LJIIJ(), intent);
        }
    }

    @Override // p003X.GN7
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (ServiceManager.getService(IRoomService.class) == null) {
            this.mStub.stopSelf();
            return;
        }
        this.mRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        if (!Room.isValid(this.mRoom)) {
            this.mStub.stopSelf();
            return;
        }
        initPushStreamReporter();
        this.mLiveStatus = LiveStatus.IDLE;
        if (this.mRoom.isScreenshot) {
            this.mStrategy = new K6U(this.mStub, this.mRoom);
            sProjection = null;
            ((K6U) this.mStrategy).LJFF = this;
        } else if (this.mRoom.getRoomLayout() == 999) {
            this.mStrategy = new K62(this.mStub, this.mRoom);
            sProjection = null;
            ((K62) this.mStrategy).LIZJ = this;
        } else {
            this.mStrategy = new C86479K5x();
        }
        this.mStrategy.LIZ = new K61(this) { // from class: X.K60
            public static ChangeQuickRedirect LIZ;
            public final BgBroadcastServiceImpl LIZIZ;

            static {
                Covode.recordClassIndex(14683);
            }

            {
                this.LIZIZ = this;
            }

            @Override // p003X.K61
            public final void LIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$onCreate$0$BgBroadcastServiceImpl(i);
            }
        };
        this.pauseStateDisposable = C87010KQi.LIZ().LIZ(K5T.class).subscribe(new Consumer(this) { // from class: X.K5y
            public static ChangeQuickRedirect LIZ;
            public final BgBroadcastServiceImpl LIZIZ;

            static {
                Covode.recordClassIndex(14684);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$onCreate$1$BgBroadcastServiceImpl((K5T) obj);
            }
        });
        this.liveEventDisposable = C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new Consumer(this) { // from class: X.K5z
            public static ChangeQuickRedirect LIZ;
            public final BgBroadcastServiceImpl LIZIZ;

            static {
                Covode.recordClassIndex(14685);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.lambda$onCreate$2$BgBroadcastServiceImpl((C5986ap) obj);
            }
        });
    }

    @Override // p003X.GN7
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        K5Y k5y = K5Y.LJIJJLI;
        if (!PatchProxy.proxy(new Object[0], k5y, K5Y.LIZ, false, 24).isSupported) {
            K5Y.LJIJI = false;
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "room_id", K5Y.LJIJJ);
            k5y.LIZ(jSONObject);
            C91211Lwb.LIZIZ("ttlive_anchor_screenshot_track", 1006, jSONObject);
        }
        AbstractC86456K5a abstractC86456K5a = this.mPushStreamReporter;
        if (abstractC86456K5a != null) {
            abstractC86456K5a.LIZJ();
        }
        Disposable disposable = this.pauseStateDisposable;
        if (disposable != null) {
            disposable.dispose();
            this.pauseStateDisposable = null;
        }
        Disposable disposable2 = this.liveEventDisposable;
        if (disposable2 != null) {
            disposable2.dispose();
            this.liveEventDisposable = null;
        }
        stopStream(1, true);
        this.mRoom = null;
        if (ServiceManager.getService(IRoomService.class) != null) {
            ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).setCurrentRoom(null);
        }
        this.mPushStreamReporter = null;
        this.mLiveStatus = LiveStatus.IDLE;
        AbstractC86477K5v abstractC86477K5v = this.mStrategy;
        if (abstractC86477K5v != null) {
            abstractC86477K5v.LIZLLL();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
        this.mLiveStreamCallback = null;
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public static void setProjectionIntent(Intent intent) {
        sProjectionIntent = intent;
    }

    @Override // p003X.GN7
    public void bindService(Service service) {
        this.mStub = service;
    }

    @Override // p003X.GN7
    public void setLiveStatusListener(GNB gnb) {
        this.mUiListener = gnb;
    }

    public void setLiveStreamCallback(AbstractC5440d abstractC5440d) {
        this.mLiveStreamCallback = abstractC5440d;
    }

    @Override // p003X.GN7
    public void unBindService(Service service) {
        this.mStub = null;
    }

    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        stopStream(i, false);
    }

    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(K5T k5t) {
        if (PatchProxy.proxy(new Object[]{k5t}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        onEvent(k5t);
    }

    public final /* synthetic */ void lambda$onCreate$2$BgBroadcastServiceImpl(C5986ap c5986ap) {
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        onEvent(c5986ap);
    }

    @Override // p003X.GN7
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC86477K5v abstractC86477K5v;
        if (!PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, 9).isSupported && (abstractC86477K5v = this.mStrategy) != null) {
            abstractC86477K5v.LIZ(configuration);
        }
    }

    @Override // com.bytedance.android.live.pushstream.AbstractC5440d
    public void onInfo(float f) {
        AbstractC5440d abstractC5440d;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 19).isSupported && (abstractC5440d = this.mLiveStreamCallback) != null) {
            abstractC5440d.onInfo(f);
        }
    }

    public void setOnLiveStreamReadyCallback(Runnable runnable) {
        AbstractC86477K5v abstractC86477K5v;
        if (!PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 3).isSupported && (abstractC86477K5v = this.mStrategy) != null) {
            abstractC86477K5v.LIZ(runnable);
        }
    }

    @Override // p003X.GN7
    public void stopStream(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        stopStream(i, false);
    }

    private void report(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("live_type", "game");
            jSONObject.putOpt("state", Integer.valueOf(i));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        reportMonitor(505, jSONObject);
    }

    public void onEvent(K5T k5t) {
        AbstractC86456K5a abstractC86456K5a;
        if (PatchProxy.proxy(new Object[]{k5t}, this, changeQuickRedirect, false, 7).isSupported || k5t == null) {
            return;
        }
        if (k5t.LIZ == 0) {
            AbstractC86456K5a abstractC86456K5a2 = this.mPushStreamReporter;
            if (abstractC86456K5a2 != null) {
                abstractC86456K5a2.LIZIZ("anchor_pause");
            }
        } else if (k5t.LIZ == 1 && (abstractC86456K5a = this.mPushStreamReporter) != null) {
            abstractC86456K5a.LIZ("anchor_resume");
        }
    }

    @Override // p003X.GN7
    public boolean startStream(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.mLiveStatus == LiveStatus.LIVING) {
            return true;
        }
        AbstractC86477K5v abstractC86477K5v = this.mStrategy;
        if (abstractC86477K5v == null || !abstractC86477K5v.LIZ(z)) {
            return false;
        }
        AbstractC86456K5a abstractC86456K5a = this.mPushStreamReporter;
        if (abstractC86456K5a != null) {
            abstractC86456K5a.LIZ();
        }
        this.mLiveStatus = LiveStatus.LIVING;
        return true;
    }

    private void onEvent(C5986ap c5986ap) {
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, changeQuickRedirect, false, 5).isSupported || c5986ap == null) {
            return;
        }
        if (c5986ap.LIZ == 44) {
            stopService("finishFromResume");
        }
        if (c5986ap.LIZ == 30) {
            AbstractC86456K5a abstractC86456K5a = this.mPushStreamReporter;
            if (abstractC86456K5a != null) {
                abstractC86456K5a.LIZIZ("anchor_pause");
            }
            report(1);
        }
        if (c5986ap.LIZ == 31) {
            AbstractC86456K5a abstractC86456K5a2 = this.mPushStreamReporter;
            if (abstractC86456K5a2 != null) {
                abstractC86456K5a2.LIZ("anchor_resume");
            }
            report(0);
        }
    }

    @Override // p003X.GN7
    public void stopService(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        K5Y k5y = K5Y.LJIJJLI;
        if (!PatchProxy.proxy(new Object[]{str}, k5y, K5Y.LIZ, false, 22).isSupported) {
            C106862S5w.LIZ(str);
            K5Y.LJIJI = false;
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "room_id", K5Y.LJIJJ);
            C440943cO.LIZ(jSONObject, "trigger_from", str);
            k5y.LIZ(jSONObject);
            C91211Lwb.LIZIZ("ttlive_anchor_screenshot_track", 1007, jSONObject);
        }
        this.mStub.stopForeground(true);
        this.mStub.stopSelf();
    }

    private void reportMonitor(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), jSONObject2}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        C440943cO.LIZ(jSONObject3, "status", i);
        LiveTracingMonitor.EventModule eventModule = LiveTracingMonitor.EventModule.GAME_PROMOTE;
        LiveTracingMonitor.EventType eventType = LiveTracingMonitor.EventType.BUSSINESS_API_CALL;
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        LiveTracingMonitor.LIZ("ttlive_cooperation_partner_track", eventModule, eventType, jSONObject3, jSONObject4, jSONObject2);
    }

    private void stopStream(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 18).isSupported || this.mLiveStatus != LiveStatus.LIVING) {
            return;
        }
        this.mStrategy.LIZ();
        GNB gnb = this.mUiListener;
        if (gnb != null) {
            gnb.LIZ(i);
        }
        AbstractC86456K5a abstractC86456K5a = this.mPushStreamReporter;
        if (abstractC86456K5a != null && !z) {
            abstractC86456K5a.LIZ(i);
        }
        this.mLiveStatus = LiveStatus.FINISHED;
    }

    @Override // p003X.GN7
    public void setData(Intent intent, boolean z) {
        if (PatchProxy.proxy(new Object[]{intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        super.setData(intent, z);
        AbstractC86477K5v abstractC86477K5v = this.mStrategy;
        if (abstractC86477K5v == null) {
            return;
        }
        abstractC86477K5v.LIZ(intent, z);
    }

    public final /* synthetic */ void lambda$initPushStreamReporter$3$BgBroadcastServiceImpl(int i, boolean z, int i2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), th}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        if (i2 == 30001 || i2 == 50002 || i2 == 30003) {
            stopStream(1, false);
            GNB gnb = this.mUiListener;
            if (gnb != null) {
                gnb.LIZ(1);
            }
        }
    }
}
