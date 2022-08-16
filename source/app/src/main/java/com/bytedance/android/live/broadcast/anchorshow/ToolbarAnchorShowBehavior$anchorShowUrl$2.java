package com.bytedance.android.live.broadcast.anchorshow;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class ToolbarAnchorShowBehavior$anchorShowUrl$2 extends Lambda implements Function0<String> {
    public static final ToolbarAnchorShowBehavior$anchorShowUrl$2 INSTANCE = new ToolbarAnchorShowBehavior$anchorShowUrl$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14360);
    }

    public ToolbarAnchorShowBehavior$anchorShowUrl$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_SHOW_MOREPANEL_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        return settingKey.getValue();
    }
}
