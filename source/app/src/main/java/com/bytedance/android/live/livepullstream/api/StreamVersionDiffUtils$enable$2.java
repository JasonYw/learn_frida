package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.live.player.api.LivePlayer;
import com.bytedance.android.livesdkapi.host.ILivePlayerHostService;
import com.bytedance.android.livesdkapi.model.PlayerConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StreamVersionDiffUtils$enable$2 extends Lambda implements Function0<Boolean> {
    public static final StreamVersionDiffUtils$enable$2 INSTANCE = new StreamVersionDiffUtils$enable$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32111);
    }

    public StreamVersionDiffUtils$enable$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        PlayerConfig playerConfig;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            ILivePlayerHostService hostService = LivePlayer.playerService().hostService();
            if (hostService != null && (playerConfig = (PlayerConfig) hostService.getConfig(PlayerConfig.class)) != null && playerConfig.getEnableRePullStream()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
