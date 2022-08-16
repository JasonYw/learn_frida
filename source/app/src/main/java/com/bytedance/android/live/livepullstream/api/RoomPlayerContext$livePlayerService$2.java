package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.live.player.api.LivePlayer;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class RoomPlayerContext$livePlayerService$2 extends Lambda implements Function0<ILivePlayerService> {
    public static final RoomPlayerContext$livePlayerService$2 INSTANCE = new RoomPlayerContext$livePlayerService$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32110);
    }

    public RoomPlayerContext$livePlayerService$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.livesdkapi.roomplayer.ILivePlayerService] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ILivePlayerService mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LivePlayer.playerService();
    }
}
