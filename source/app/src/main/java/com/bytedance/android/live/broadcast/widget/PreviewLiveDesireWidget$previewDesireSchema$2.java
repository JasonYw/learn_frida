package com.bytedance.android.live.broadcast.widget;

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
public final class PreviewLiveDesireWidget$previewDesireSchema$2 extends Lambda implements Function0<String> {
    public static final PreviewLiveDesireWidget$previewDesireSchema$2 INSTANCE = new PreviewLiveDesireWidget$previewDesireSchema$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18547);
    }

    public PreviewLiveDesireWidget$previewDesireSchema$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_DESIRE_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!Intrinsics.areEqual(settingKey.getValue(), "")) {
            SettingKey<String> settingKey2 = LiveConfigSettingKeys.LIVE_PREVIEW_DESIRE_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            return settingKey2.getValue();
        }
        return "sslocal://webcast_webview?type=fullscreen&status_bar_color=black&hide_nav_bar=1&hide_status_bar=1&status_bar_bg_color=%2300000000&web_bg_color=%23FFFFFFFF&height_percent=100&url=https%3A%2F%2Ftosv.byted.org%2Fobj%2Fgecko-internal%2Fwebcast%2Fmono%2Fh5%2Fdouyin_h5_vs%2Fppe_desire%2Ftemplate%2Fpages%2Fvs_desire_list_manage%2Findex.html";
    }
}
