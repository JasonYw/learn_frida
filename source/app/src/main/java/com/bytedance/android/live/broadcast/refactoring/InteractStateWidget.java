package com.bytedance.android.live.broadcast.refactoring;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.LinkedList;
import java.util.Queue;
import p003X.AbstractC4569445g;
import p003X.AbstractC86311Jzl;

/* loaded from: classes5.dex */
public class InteractStateWidget extends AbstractBroadcastWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public final AbstractC86311Jzl LIZLLL;

    /* renamed from: LJ */
    public final LiveStreamManager f25941LJ;
    public Queue<KVData> LJFF = new LinkedList();

    static {
        Covode.recordClassIndex(17710);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 5).isSupported) {
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

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        MethodCollector.m14708i(1317);
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZJ, false, 2).isSupported) {
            if (isViewValid() && kVData2 != null && kVData2.getKey() != null && kVData2.getData() != null) {
                if (!this.LIZIZ) {
                    this.LJFF.offer(kVData2);
                    MethodCollector.m14707o(1317);
                    return;
                }
                String key = kVData2.getKey();
                if (key.hashCode() == -1180299966 && key.equals("cmd_interact_state_change")) {
                    C5984am c5984am = (C5984am) kVData2.getData();
                    if (!PatchProxy.proxy(new Object[]{c5984am}, this, LIZJ, false, 3).isSupported) {
                        if (c5984am.LIZ == 7) {
                            LiveStreamManager liveStreamManager = this.f25941LJ;
                            liveStreamManager.LJFF = true;
                            if (!PatchProxy.proxy(new Object[0], liveStreamManager, LiveStreamManager.LIZJ, false, 9).isSupported && liveStreamManager.LJIIIIZZ != null) {
                                liveStreamManager.LJIIIIZZ.LIZ();
                            }
                            MethodCollector.m14707o(1317);
                            return;
                        } else if (c5984am.LIZ == 8) {
                            this.f25941LJ.LJFF = false;
                            MethodCollector.m14707o(1317);
                            return;
                        } else if (c5984am.LIZ == 10) {
                            if (this.LIZLLL.getView() != null) {
                                ViewGroup viewGroup = (ViewGroup) this.LIZLLL.getView().findViewById(2131166409);
                                viewGroup.removeAllViews();
                                View view = (View) c5984am.LIZIZ;
                                view.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
                                viewGroup.addView(view);
                                MethodCollector.m14707o(1317);
                                return;
                            }
                        } else if (c5984am.LIZ == 11 && this.LIZLLL.getView() != null) {
                            ((ViewGroup) this.LIZLLL.getView().findViewById(2131166409)).removeAllViews();
                        }
                    }
                }
            } else {
                MethodCollector.m14707o(1317);
                return;
            }
        }
        MethodCollector.m14707o(1317);
    }

    public InteractStateWidget(AbstractC86311Jzl abstractC86311Jzl, DataCenter dataCenter, LiveStreamManager liveStreamManager) {
        this.LIZLLL = abstractC86311Jzl;
        this.f25941LJ = liveStreamManager;
        this.dataCenter = dataCenter;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            this.dataCenter.observeForever("cmd_interact_state_change", this);
        }
    }
}
