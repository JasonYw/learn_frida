package com.bytedance.android.live.browser.webview.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.webx.seclink.p1416a.AbstractC14439b;
import java.util.Map;
import p003X.AbstractC101351Pvl;
import p003X.C101286Pui;
import p003X.C116971W2r;
import p003X.C145409emF;
import p003X.C63837BHb;
import p003X.C98175Old;
import p003X.OMO;

/* loaded from: classes8.dex */
public class RoundSecLinkRectWebView extends RoundRectWebView {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC101351Pvl mCallback;
    public AbstractC14439b mStrategy;

    static {
        Covode.recordClassIndex(23245);
    }

    @Override // com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public boolean canGoBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : m15807x807e68e5(this);
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView__onDetachedFromWindow$___twin___ */
    public void m15808x46546de5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.live.browser.webview.view.RoundRectWebView, com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        m15806x819958a9(this);
    }

    @Override // com.bytedance.android.live.browser.webview.view.RoundRectWebView, com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void loadUrl(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        m15805xbbc6e72f(this, str);
    }

    @Override // com.bytedance.android.live.browser.webview.view.RoundRectWebView, com.bytedance.android.live.browser.webview.SSWebView, android.webkit.WebView
    public void loadUrl(String str, Map map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        m15804xbbc6e72f(this, str, map);
    }

    @Override // com.bytedance.android.live.browser.webview.view.RoundRectWebView, com.bytedance.android.live.browser.webview.SSWebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        m15803x937fcf1e(this);
    }

    public AbstractC14439b getCurrentStrategy() {
        return this.mStrategy;
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView__canGoBack$___twin___ */
    public boolean m15812xfb217da9() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getCurrentStrategy() == null) {
            return super.canGoBack();
        }
        if (!super.canGoBack() || !getCurrentStrategy().LIZIZ()) {
            return false;
        }
        return true;
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView__goBack$___twin___ */
    public void m15811xb19ada01() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        if (getCurrentStrategy() == null) {
            super.goBack();
        } else if (getCurrentStrategy().LIZJ()) {
        } else {
            super.goBack();
        }
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_onDetachedFromWindow */
    public static void m15803x937fcf1e(RoundSecLinkRectWebView roundSecLinkRectWebView) {
        if (PatchProxy.proxy(new Object[]{roundSecLinkRectWebView}, null, changeQuickRedirect, true, 14).isSupported) {
            return;
        }
        C98175Old.LIZJ.removePageContainer(roundSecLinkRectWebView);
        roundSecLinkRectWebView.m15808x46546de5();
    }

    public void setCallback(AbstractC101351Pvl abstractC101351Pvl) {
        if (PatchProxy.proxy(new Object[]{abstractC101351Pvl}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        this.mCallback = abstractC101351Pvl;
        AbstractC14439b abstractC14439b = this.mStrategy;
        if (abstractC14439b != null) {
            abstractC14439b.LIZ(abstractC101351Pvl);
        }
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView_com_bytedance_ies_security_lancet_web_SecLinkLancet_canGoBack */
    public static boolean m15807x807e68e5(RoundSecLinkRectWebView roundSecLinkRectWebView) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{roundSecLinkRectWebView}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (roundSecLinkRectWebView.m15812xfb217da9() && OMO.LIZIZ.LIZ(roundSecLinkRectWebView)) {
            return true;
        }
        return false;
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView_com_bytedance_ies_security_lancet_web_SecLinkLancet_goBack */
    public static void m15806x819958a9(RoundSecLinkRectWebView roundSecLinkRectWebView) {
        if (PatchProxy.proxy(new Object[]{roundSecLinkRectWebView}, null, changeQuickRedirect, true, 10).isSupported || OMO.LIZIZ.LIZIZ(roundSecLinkRectWebView)) {
            return;
        }
        roundSecLinkRectWebView.m15811xb19ada01();
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView__loadUrl$___twin___ */
    public void m15810xaf04399f(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        String LIZ = C101286Pui.LIZ(str, this.mStrategy);
        ALogger.m15801d("RoundSecLinkRectWebView", LIZ);
        super.loadUrl(LIZ);
    }

    public RoundSecLinkRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView_com_bytedance_ies_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m15805xbbc6e72f(RoundSecLinkRectWebView roundSecLinkRectWebView, String str) {
        if (PatchProxy.proxy(new Object[]{roundSecLinkRectWebView, str}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        String LIZ = OMO.LIZIZ.LIZ(roundSecLinkRectWebView, str);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        roundSecLinkRectWebView.m15810xaf04399f(str);
    }

    public RoundSecLinkRectWebView(Context context, String str) {
        super(context);
        str = (TextUtils.isEmpty(str) || "null".equals(str)) ? "deeplink" : str;
        AbstractC14439b abstractC14439b = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this, str}, null, C101286Pui.LIZ, true, 4);
        if (proxy.isSupported) {
            abstractC14439b = (AbstractC14439b) proxy.result;
        } else if (C101286Pui.LIZJ.LIZ()) {
            abstractC14439b = C145409emF.LIZ(this, str);
        }
        this.mStrategy = abstractC14439b;
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView__loadUrl$___twin___ */
    public void m15809xaf04399f(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        String LIZ = C101286Pui.LIZ(str, this.mStrategy);
        ALogger.m15801d("RoundSecLinkRectWebView", LIZ);
        super.loadUrl(LIZ, map);
    }

    public RoundSecLinkRectWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (C63837BHb.LIZJ.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C116971W2r.LIZ(settings, sb.toString());
            }
        }
    }

    /* renamed from: com_bytedance_android_live_browser_webview_view_RoundSecLinkRectWebView_com_bytedance_ies_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m15804xbbc6e72f(RoundSecLinkRectWebView roundSecLinkRectWebView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{roundSecLinkRectWebView, str, map}, null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        String LIZ = OMO.LIZIZ.LIZ(roundSecLinkRectWebView, str);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        roundSecLinkRectWebView.m15809xaf04399f(str, map);
    }
}
