package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$adapterOld$2 extends Lambda implements Function0<Boolean> {
    public static final MiniAppCardSettingManagerV2$adapterOld$2 INSTANCE = new MiniAppCardSettingManagerV2$adapterOld$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21578);
    }

    public MiniAppCardSettingManagerV2$adapterOld$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_OPEN_PLATFORM_MINI_APP_CARD_ADAPTER_OLD;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        return settingKey.getValue();
    }
}
