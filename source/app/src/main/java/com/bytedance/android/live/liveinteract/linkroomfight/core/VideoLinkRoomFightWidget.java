package com.bytedance.android.live.liveinteract.linkroomfight.core;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.C78658Gzc;

/* loaded from: classes3.dex */
public final class VideoLinkRoomFightWidget extends LinkRoomFightWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;
    public Disposable LJIIIZ;

    static {
        Covode.recordClassIndex(27631);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        Disposable disposable = this.LJIIIZ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightWidget
    public final void LJII() {
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 1).isSupported && (LJJJI = LJJJI()) != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ.mo15536LJ()) != null && (subscribe = mo15536LJ.subscribe(new C78658Gzc(new VideoLinkRoomFightWidget$initSceneSwitchListener$1(this)))) != null) {
            LIZ(subscribe);
        }
    }
}
