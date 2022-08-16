package com.bytedance.android.live.liveinteract.review;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.HJY;

/* loaded from: classes3.dex */
public final class LinkmicReviewWidget extends RoomWidget implements a$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HJY LIZIZ;

    static {
        Covode.recordClassIndex(29616);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 4).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        HJY hjy = this.LIZIZ;
        if (hjy != null) {
            hjy.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZIZ = new HJY();
        HJY hjy = this.LIZIZ;
        if (hjy != null) {
            hjy.LIZ((a$a) this);
        }
    }
}
