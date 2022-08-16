package com.bytedance.android.live.broadcastgame.debug;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C6D5;
import p003X.C6D6;

/* loaded from: classes23.dex */
public final class LiveGameDebugService implements ILiveGameDebugService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public WeakReference<ViewGroup> containerView;
    public boolean containerViewVisible;
    public final Lazy debugMsgChannel$delegate = LazyKt__LazyJVMKt.lazy(LiveGameDebugService$debugMsgChannel$2.INSTANCE);

    static {
        Covode.recordClassIndex(19693);
    }

    private final void safeRun(Function0<Unit> function0) {
        boolean z = PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 3).isSupported;
    }

    public final C3465b getDebugMsgChannel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (C3465b) (proxy.isSupported ? proxy.result : this.debugMsgChannel$delegate.mo27335getValue());
    }

    public LiveGameDebugService() {
        ServiceManager.registerService(ILiveGameDebugService.class, this);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void startLiveGameDebug() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        safeRun(new LiveGameDebugService$startLiveGameDebug$1(this));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void stopLiveGameDebug() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        safeRun(new LiveGameDebugService$stopLiveGameDebug$1(this));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void dispatchLiveGameDebugMsg(C6D6 c6d6) {
        if (PatchProxy.proxy(new Object[]{c6d6}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6d6);
        safeRun(new LiveGameDebugService$dispatchLiveGameDebugMsg$1(this, c6d6));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void clearMessage(Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls);
        C3465b debugMsgChannel = getDebugMsgChannel();
        if (!PatchProxy.proxy(new Object[]{cls}, debugMsgChannel, C3465b.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(cls);
            C6D5<?, ?> c6d5 = debugMsgChannel.LIZIZ.get(cls);
            if (c6d5 != null) {
                c6d5.LIZIZ();
            }
            C6D5<?, ?> c6d52 = debugMsgChannel.LIZIZ.get(cls);
            if (c6d52 != null) {
                c6d52.LIZ();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void setDebugContainer(WidgetManager widgetManager, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{widgetManager, viewGroup}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(widgetManager);
        safeRun(new LiveGameDebugService$setDebugContainer$1(this, viewGroup, widgetManager));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void unregisterMessageWatcher(Class<?> cls, Function1<?, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{cls, function1}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, function1);
        safeRun(new LiveGameDebugService$unregisterMessageWatcher$1(this, cls, function1));
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void registerMessageWatcher(Class<?> cls, boolean z, Function1<?, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{cls, Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, function1);
        safeRun(new LiveGameDebugService$registerMessageWatcher$1(this, cls, z, function1));
    }
}
