package com.bytedance.android.live.broadcast.refactoring;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.refactoring.LiveBroadcastEndWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.gift.IRoomStateService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.android.livesdk.message.model.C8749au;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.LinkedList;
import java.util.Queue;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC86311Jzl;
import p003X.C134798c0f;
import p003X.C86665KDb;
import p003X.C87010KQi;
import p003X.C88613Kvn;
import p003X.K06;
import p003X.KCU;
import p003X.LOA;

/* loaded from: classes5.dex */
public class LiveBroadcastEndWidget extends AbstractBroadcastWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public final LiveStreamManager LIZLLL;

    /* renamed from: LJ */
    public final K06 f25942LJ;
    public boolean LJFF;
    public String LJI;
    public CharSequence LJII;
    public CharSequence LJIIIIZZ;
    public CharSequence LJIIIZ;
    public final AbstractC86311Jzl LJIIJJI;
    public Queue<KVData> LJIIL = new LinkedList();
    public CompositeDisposable LJIIJ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(17711);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 16).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 14).isSupported) {
            return;
        }
        super.onDestroy();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 12).isSupported) {
            return;
        }
        super.onStop();
        this.LJIIJ.clear();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 11).isSupported) {
            return;
        }
        super.onResume();
        this.LJIIJ.clear();
        if (!PatchProxy.proxy(new Object[]{C5986ap.class}, this, LIZJ, false, 13).isSupported) {
            this.LJIIJ.add(C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new Consumer(this) { // from class: X.K1b
                public static ChangeQuickRedirect LIZ;
                public final LiveBroadcastEndWidget LIZIZ;

                static {
                    Covode.recordClassIndex(17735);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveBroadcastEndWidget liveBroadcastEndWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, liveBroadcastEndWidget, LiveBroadcastEndWidget.LIZJ, false, 15).isSupported || !(obj instanceof C5986ap)) {
                        return;
                    }
                    liveBroadcastEndWidget.onEvent((C5986ap) obj);
                }
            }));
        }
        while (!this.LJIIL.isEmpty()) {
            onChanged(this.LJIIL.poll());
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        LIZ(false, 1);
    }

    private void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 10).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_stop_live", "LiveBroadcastFragment");
        K06 k06 = this.f25942LJ;
        if (k06 != null) {
            k06.mo23486LJ();
        }
        if (this.LIZLLL.LJIIIIZZ != null) {
            this.LIZLLL.LJIIIIZZ.LIZ(i);
        } else {
            this.LIZLLL.LJIIIIZZ = this.LJIIJJI.LIZJ(i);
        }
        this.LJIIJJI.LIZIZ(i);
        this.LIZLLL.LIZ();
        this.LJFF = true;
        this.LIZLLL.LJIIJ = true;
        TimeCostUtil.LIZJ(TimeCostUtil.Tag.CreateLive);
        LOA.LIZ().LIZ(TimeCostUtil.Tag.CreateLive.name());
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onExitRoom();
        ((IRoomStateService) ServiceManager.getService(IRoomStateService.class)).onExitRoom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZ */
    public void onChanged(KVData kVData) {
        if (!PatchProxy.proxy(new Object[]{kVData}, this, LIZJ, false, 9).isSupported && this.LJIIJJI.LJIILIIL() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.LIZIZ) {
                this.LJIIL.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            if (key.hashCode() == -22762362 && key.equals("cmd_stop_live_broadcast")) {
                LIZ(((Integer) kVData.getData()).intValue());
            }
        }
    }

    public void onEvent(C5986ap c5986ap) {
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        int i = c5986ap.LIZ;
        if (i != 5) {
            if (i != 7) {
                if (i != 11) {
                    if (i != 17) {
                        return;
                    }
                } else if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
                    return;
                } else {
                    C86665KDb.LIZ("ttlive_on_live_end", "room").LIZ().LIZ();
                    LIZ(104);
                    C88613Kvn.LIZ(getContext(), 2131586140, 1L);
                    this.LJIIJJI.LJIJI().getActivity().finish();
                    return;
                }
            } else {
                C86665KDb.LIZIZ("ttlive_action_show_live_end_dialog", "LiveBroadcastFragment");
                AbstractC9021r abstractC9021r = c5986ap.LIZJ;
                if (abstractC9021r instanceof C8749au) {
                    C8749au c8749au = (C8749au) abstractC9021r;
                    if (c8749au.LIZIZ == 4) {
                        if (c8749au.LIZLLL == null) {
                            return;
                        }
                        this.LJI = c8749au.LIZLLL.LIZ;
                        this.LJII = C134798c0f.LIZ(c8749au.LIZLLL.LIZJ, "");
                        this.LJIIIIZZ = C134798c0f.LIZ(c8749au.LIZLLL.LIZLLL, "");
                        this.LJIIIZ = C134798c0f.LIZ(c8749au.LIZLLL.f27864LJ, "");
                        LIZ(true, 103);
                        return;
                    } else if (c8749au.LIZIZ == 3) {
                        LIZ(false, 102);
                        return;
                    } else {
                        LIZ(false);
                        return;
                    }
                }
                LIZ(false);
                return;
            }
        }
        C86665KDb.LIZIZ("ttlive_on_back_to_main", "LiveBroadcastFragment");
        this.LJIIJJI.LJIJI().getActivity().finish();
    }

    public final void LIZ(boolean z, int i) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZJ, false, 7).isSupported) {
            return;
        }
        C86665KDb.LIZ("ttlive_on_live_end", "room").LIZ().LIZ();
        if (!this.LJFF) {
            LIZ(i);
        } else if (LiveConfigSettingKeys.LIVE_END_ENABLESTOP_VIDEO_CAPTURE.getValue().booleanValue()) {
            this.LIZLLL.LIZ();
        }
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        ALogger.m15801d("LiveBroadcastFragment", C0002O.m25086C("room close onLiveEnd endByBanned:", str));
        this.LJIIJJI.LJIIL();
        if (z) {
            KCU.LIZ(false, 103, "room banned");
        } else {
            KCU.LIZ(true, 0, (String) null);
        }
        KCU.LIZ(i);
    }

    public LiveBroadcastEndWidget(AbstractC86311Jzl abstractC86311Jzl, DataCenter dataCenter, K06 k06, LiveStreamManager liveStreamManager) {
        this.LJIIJJI = abstractC86311Jzl;
        this.LIZLLL = liveStreamManager;
        this.dataCenter = dataCenter;
        this.f25942LJ = k06;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            this.dataCenter.observeForever("cmd_stop_live_broadcast", this);
        }
    }
}
