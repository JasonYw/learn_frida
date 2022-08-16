package com.bytedance.android.live.broadcastgame.opengame.performance;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6967ew;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfDog$STUTTER_RATE_THRESHOLD$2 extends Lambda implements Function0<Float> {
    public static final OpenPlatformPerfDog$STUTTER_RATE_THRESHOLD$2 INSTANCE = new OpenPlatformPerfDog$STUTTER_RATE_THRESHOLD$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20798);
    }

    public OpenPlatformPerfDog$STUTTER_RATE_THRESHOLD$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Float mo30099invoke() {
        float f;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            f = ((Float) proxy.result).floatValue();
        } else {
            SettingKey<C6967ew> settingKey = LiveConfigSettingKeys.LIVE_OPEN_PLATFORM_PERF_TEST_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            f = settingKey.getValue().f27253LJ / 100.0f;
        }
        return Float.valueOf(f);
    }
}
