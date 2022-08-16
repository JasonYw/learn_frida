package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.model.C9623ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class RoomPlayerContext$innerDrawerConfig$2 extends Lambda implements Function0<C9623ak> {
    public static final RoomPlayerContext$innerDrawerConfig$2 INSTANCE = new RoomPlayerContext$innerDrawerConfig$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32109);
    }

    public RoomPlayerContext$innerDrawerConfig$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.livesdkapi.model.ak] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C9623ak mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<C9623ak> settingKey = LiveConfigSettingKeys.PLAYER_INNER_DRAW_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        return settingKey.getValue();
    }
}
