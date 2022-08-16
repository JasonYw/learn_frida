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
public final class OpenPlatformPerfDog$BATTERY_TEMPERATURE_THRESHOLD$2 extends Lambda implements Function0<Integer> {
    public static final OpenPlatformPerfDog$BATTERY_TEMPERATURE_THRESHOLD$2 INSTANCE = new OpenPlatformPerfDog$BATTERY_TEMPERATURE_THRESHOLD$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20796);
    }

    public OpenPlatformPerfDog$BATTERY_TEMPERATURE_THRESHOLD$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            i = ((Integer) proxy.result).intValue();
        } else {
            SettingKey<C6967ew> settingKey = LiveConfigSettingKeys.LIVE_OPEN_PLATFORM_PERF_TEST_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            i = settingKey.getValue().LJFF;
        }
        return Integer.valueOf(i);
    }
}
