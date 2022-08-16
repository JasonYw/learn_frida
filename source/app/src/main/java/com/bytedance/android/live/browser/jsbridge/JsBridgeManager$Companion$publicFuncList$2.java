package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class JsBridgeManager$Companion$publicFuncList$2 extends Lambda implements Function0<List<String>> {
    public static final JsBridgeManager$Companion$publicFuncList$2 INSTANCE = new JsBridgeManager$Companion$publicFuncList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22038);
    }

    public JsBridgeManager$Companion$publicFuncList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List<java.lang.String>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PUBLIC_METHOD_AUTH_CONTROL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            return CollectionsKt__CollectionsKt.arrayListOf("config", "appInfo", "login", "logout", "close", "gallery", "toggleGalleryBars", "slideShow", "relatedShow", "toast", "slideDownload", "requestChangeOrientation", "adInfo");
        }
        return new ArrayList();
    }
}
