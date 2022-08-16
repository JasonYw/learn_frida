package com.bytedance.android.live.browser.webview;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.utils.NetworkUtils;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Locale;
import p002O.C0002O;
import p003X.AbstractC90994Lt6;
import p003X.C101310Pv6;
import p003X.C116971W2r;
import p003X.M3U;
import p003X.PT4;

/* renamed from: com.bytedance.android.live.browser.webview.l */
/* loaded from: classes7.dex */
public final class C4056l implements PT4 {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23226);
    }

    @Override // p003X.PT4
    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int intValue = AbstractC90994Lt6.LIZIZ.getValue().intValue();
        if (intValue != 1 && intValue != 0 && intValue != 2) {
            return 2;
        }
        return intValue;
    }

    public final void LIZ(WebView webView) {
        if (!PatchProxy.proxy(new Object[]{webView}, this, LIZ, false, 2).isSupported && webView != null) {
            String LIZ2 = LIZ(webView.getContext(), webView);
            if (!TextUtils.isEmpty(LIZ2)) {
                C116971W2r.LIZ(webView.getSettings(), LIZ2);
            }
        }
    }

    private String LIZ(Context context, WebView webView) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, webView}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String LIZ2 = C101310Pv6.LIZ(context, webView);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        if (!TextUtils.isEmpty(LIZ2)) {
            new StringBuilder();
            String m25080C = C0002O.m25080C(LIZ2, " ", ((IHostContext) ServiceManager.getService(IHostContext.class)).appName(), "_", ((IHostContext) ServiceManager.getService(IHostContext.class)).getVersionCode(), " AppVersion/", ((IHostContext) ServiceManager.getService(IHostContext.class)).getVersionCode(), " JsSdk/2.0 NetType/", NetworkUtils.LIZIZ(((IHostContext) ServiceManager.getService(IHostContext.class)).context(), TokenCert.with("bpea-WebviewConfig_network_get_net_type")).toUpperCase(Locale.ROOT), " Channel/", ((IHostContext) ServiceManager.getService(IHostContext.class)).getChannel(), " ByteLocale/", Locale.CHINA.toString(), " Webcast_ByteLocale/", Locale.CHINA.getLanguage(), " Region/", Locale.CHINA.getCountry(), " App/", ((IHostContext) ServiceManager.getService(IHostContext.class)).appName(), " WebcastSDK/2560");
            if (M3U.LIZIZ.LIZ()) {
                new StringBuilder();
                return C0002O.m25086C(m25080C, " AppTheme/light");
            }
            return m25080C;
        }
        return LIZ2;
    }
}
