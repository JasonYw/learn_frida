package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import p003X.AbstractC4569445g;

/* loaded from: classes3.dex */
public class ScreenWidget extends LiveWidget implements AbstractC6070q, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC5436a LIZIZ;

    static {
        Covode.recordClassIndex(18780);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final void LJFF() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public AbstractC5436a getLiveStream() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public LiveCore getLiveCore() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (LiveCore) proxy.result;
        }
        return this.LIZIZ.LJIILL();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
    }

    public ScreenWidget(AbstractC5436a abstractC5436a) {
        this.LIZIZ = abstractC5436a;
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public final Client LIZ(InteractConfig interactConfig) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{interactConfig}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Client) proxy.result;
        }
        return this.LIZIZ.LIZ(interactConfig);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    public void setAudioMute(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ.LIZ(z);
    }
}
