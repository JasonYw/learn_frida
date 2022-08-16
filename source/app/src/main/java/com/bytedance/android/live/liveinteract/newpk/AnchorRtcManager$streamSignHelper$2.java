package com.bytedance.android.live.liveinteract.newpk;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.p420g.AbstractC5442a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79199HJx;

/* loaded from: classes3.dex */
public final class AnchorRtcManager$streamSignHelper$2 extends Lambda implements Function0<AbstractC5442a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C79199HJx this$0;

    static {
        Covode.recordClassIndex(28486);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorRtcManager$streamSignHelper$2(C79199HJx c79199HJx) {
        super(0);
        this.this$0 = c79199HJx;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.android.live.pushstream.g.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5442a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SEI_SIGN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            ALogger.m15801d("ttlive_interact", "enable rtc client metadata sign");
            return ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).createStreamSignHelper(this.this$0.LJIILJJIL);
        }
        return null;
    }
}
