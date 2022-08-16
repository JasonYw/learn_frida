package com.bytedance.android.live.player.utils;

import com.bytedance.android.live.player.api.LivePlayer;
import com.bytedance.android.livesdkapi.host.ILivePlayerHostService;
import com.bytedance.android.livesdkapi.host.ILivePlayerNetwork;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C114464V4g;

/* loaded from: classes8.dex */
public final class PlayerRequestHelper$playerApi$2 extends Lambda implements Function0<ILivePlayerApi> {
    public static final PlayerRequestHelper$playerApi$2 INSTANCE = new PlayerRequestHelper$playerApi$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32832);
    }

    public PlayerRequestHelper$playerApi$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.livesdkapi.roomplayer.ILivePlayerApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ILivePlayerApi mo30099invoke() {
        ILivePlayerNetwork livePlayerNetwork;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ILivePlayerHostService hostService = LivePlayer.playerService().hostService();
        if (hostService != null && (livePlayerNetwork = hostService.livePlayerNetwork()) != null) {
            return livePlayerNetwork.LIZ();
        }
        C114464V4g.LIZ("create playerApi failed! Null playerNetwork");
        return null;
    }
}
