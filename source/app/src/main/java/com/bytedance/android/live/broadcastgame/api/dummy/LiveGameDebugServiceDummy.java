package com.bytedance.android.live.broadcastgame.api.dummy;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C6D6;

/* loaded from: classes23.dex */
public final class LiveGameDebugServiceDummy implements ILiveGameDebugService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19087);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void clearMessage(Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void dispatchLiveGameDebugMsg(C6D6 c6d6) {
        if (PatchProxy.proxy(new Object[]{c6d6}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6d6);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void registerMessageWatcher(Class<?> cls, boolean z, Function1<?, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{cls, Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, function1);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void setDebugContainer(WidgetManager widgetManager, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{widgetManager, viewGroup}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(widgetManager);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void startLiveGameDebug() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void stopLiveGameDebug() {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.ILiveGameDebugService
    public final void unregisterMessageWatcher(Class<?> cls, Function1<?, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{cls, function1}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, function1);
    }

    public LiveGameDebugServiceDummy() {
        ServiceManager.registerService(ILiveGameDebugService.class, this);
    }
}
