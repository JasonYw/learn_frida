package com.bytedance.android.live.broadcastgame.api.dummy;

import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.gecko.g$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88271KqH;
import p003X.AbstractC88290Kqa;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class InteractSourceManagerDummy implements IInteractSourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19086);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final void setDataCenter(DataCenter dataCenter) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final void setGeckoClient(AbstractC88290Kqa abstractC88290Kqa) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final void setTC21GeckoClient(AbstractC88271KqH abstractC88271KqH) {
    }

    public InteractSourceManagerDummy() {
        ServiceManager.registerService(IInteractSourceManager.class, this);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final Observable<g$b> getEffectSource(C3383p c3383p, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        Observable<g$b> error = Observable.error(new Throwable("can't create downloader"));
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final Observable<g$b> getPngFile(C3383p c3383p, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        Observable<g$b> error = Observable.error(new Throwable("float entrance style is null"));
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final Observable<g$b> getLynxFile(C3383p c3383p, boolean z, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3383p, Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        Observable<g$b> error = Observable.error(new Throwable("can't create downloader"));
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.interactgame.IInteractSourceManager
    public final Observable<g$b> updateOpenPlatformJsSdk(String str, String str2, String str3, String str4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        Observable<g$b> error = Observable.error(new Throwable("can't create downloader"));
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }
}
