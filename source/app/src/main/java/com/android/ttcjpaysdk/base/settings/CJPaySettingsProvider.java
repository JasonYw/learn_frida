package com.android.ttcjpaysdk.base.settings;

import com.android.ttcjpaysdk.base.service.ICJPaySettingService;
import com.android.ttcjpaysdk.base.service.bean.ReuseHostDomain;
import com.android.ttcjpaysdk.base.service.bean.WebViewCommonConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C136992ca3;

/* loaded from: classes17.dex */
public final class CJPaySettingsProvider implements ICJPaySettingService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6554);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.base.settings";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySettingService
    public final WebViewCommonConfig getWebViewCommonConfig() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (WebViewCommonConfig) proxy.result;
        }
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        WebViewCommonConfig LJIIJ = LIZ2.LJIIJ();
        Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
        return LJIIJ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPaySettingService
    public final ReuseHostDomain getHostDomain(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (ReuseHostDomain) proxy.result;
        }
        C106862S5w.LIZ(str);
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        ReuseHostDomain LJIIIZ = LIZ2.LJIIIZ();
        Intrinsics.checkNotNullExpressionValue(LJIIIZ, "");
        return LJIIIZ;
    }
}
