package com.bytedance.android.live.browser.webview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.browser.AbstractC4051k;
import com.bytedance.android.live.browser.webview.config.LiveHybridSettingKeys;
import com.bytedance.android.live.core.setting.LiveInfraSettingKeys;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.device.info.CookiesManagerEntry;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ttnet.config.AppConfig;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.umeng.message.proguard.C34037f;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC88741Kxr;
import p003X.AbstractC98221OmN;
import p003X.C100942PpA;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C140565dVp;
import p003X.C387151Uv;
import p003X.C63741BDj;
import p003X.C63837BHb;
import p003X.C97714OeC;
import p003X.C97955Oi5;
import p003X.C98175Old;
import p003X.PLR;

/* loaded from: classes7.dex */
public class SSWebView extends WebView implements AbstractC98221OmN {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<Pattern> boeUrlPatternWhiteList;
    public AbstractC4051k jsBridgeService;
    public String pageStartUrl;

    static {
        Covode.recordClassIndex(23095);
    }

    public static /* synthetic */ void access$000(WebView webView, String str, Map map) {
        MethodCollector.m14708i(1550);
        if (PatchProxy.proxy(new Object[]{webView, str, map}, null, changeQuickRedirect, true, 4).isSupported) {
            MethodCollector.m14707o(1550);
            return;
        }
        super.loadUrl(str, map);
        MethodCollector.m14707o(1550);
    }

    public static /* synthetic */ void access$001(WebView webView, String str, byte[] bArr) {
        if (PatchProxy.proxy(new Object[]{webView, str, bArr}, null, changeQuickRedirect, true, 10).isSupported) {
            return;
        }
        super.postUrl(str, bArr);
    }

    public static /* synthetic */ void access$002(WebView webView, WebViewClient webViewClient) {
        if (PatchProxy.proxy(new Object[]{webView, webViewClient}, null, changeQuickRedirect, true, 30).isSupported) {
            return;
        }
        super.setWebViewClient(webViewClient);
    }

    private boolean isHotsoonBoeAddSuffix() {
        return false;
    }

    /* renamed from: com_bytedance_android_live_browser_webview_SSWebView__onDetachedFromWindow$___twin___ */
    public void m15818xeda4a1a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47).isSupported) {
            return;
        }
        m15817x98216ddf(this);
    }

    @Override // p003X.AbstractC98221OmN
    public String getSafeUrl() {
        return this.pageStartUrl;
    }

    private Boolean isReplaceUrlToBoe() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.FALSE;
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoForward() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void clearFormData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27).isSupported) {
            return;
        }
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void clearHistory() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35).isSupported) {
            return;
        }
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    @Override // android.webkit.WebView
    public String getOriginalUrl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.webkit.WebView
    public int getProgress() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C100942PpA.LIZ().LIZ().LIZ(this);
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    private boolean isDouyinBoe() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return ((IHostContext) ServiceManager.getService(IHostContext.class)).isBoe();
    }

    public void setPageStartUrl(String str) {
        this.pageStartUrl = str;
    }

    public SSWebView(Context context) {
        super(context);
        MethodCollector.m14708i(1547);
        init();
        MethodCollector.m14707o(1547);
    }

    /* renamed from: com_bytedance_android_live_browser_webview_SSWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_onDetachedFromWindow */
    public static void m15817x98216ddf(SSWebView sSWebView) {
        if (PatchProxy.proxy(new Object[]{sSWebView}, null, changeQuickRedirect, true, 46).isSupported) {
            return;
        }
        C98175Old.LIZJ.removePageContainer(sSWebView);
        sSWebView.m15818xeda4a1a6();
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        try {
            String filterUrl = filterUrl(str);
            m15822xc4f27dda(this, filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setBackgroundColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 34).isSupported) {
            return;
        }
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        if (PatchProxy.proxy(new Object[]{downloadListener}, this, changeQuickRedirect, false, 32).isSupported) {
            return;
        }
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (PatchProxy.proxy(new Object[]{webChromeClient}, this, changeQuickRedirect, false, 33).isSupported) {
            return;
        }
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (PatchProxy.proxy(new Object[]{webViewClient}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        try {
            m15823x20e5b04d(this, webViewClient);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoBackOrForward(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44).isSupported) {
            return;
        }
        try {
            super.setOverScrollMode(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isInSafeHostList(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        for (String str2 : this.jsBridgeService.LIZ()) {
            if (host != null && (host.equals(str2) || host.startsWith(C0002O.m25086C(".", str2)))) {
                return true;
            }
        }
        return false;
    }

    private String filterUrl(String str) {
        boolean z;
        boolean z2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context context = getContext();
        try {
            z = !TextUtils.equals(Uri.parse(str).getQueryParameter("keep_origin_url"), "1");
        } catch (Exception e) {
            e.printStackTrace();
            z = true;
        }
        if (context != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, null, C63741BDj.LIZ, true, 1);
            if (proxy2.isSupported) {
                z2 = ((Boolean) proxy2.result).booleanValue();
            } else if (!StringUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && z) {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{context, str}, null, C63741BDj.LIZ, true, 2);
                if (proxy3.isSupported) {
                    str = (String) proxy3.result;
                } else {
                    AppConfig.LIZ(context);
                    str = AppConfig.LIZJ(str);
                }
            }
        }
        if (LiveHybridSettingKeys.ENABLE_BOE_URL_REPLACE.getValue().booleanValue() && isReplaceUrlToBoe().booleanValue()) {
            str = tryReplaceUrlToBoe(str);
        }
        syncCookie(str);
        return str;
    }

    private void syncCookie(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42).isSupported) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        List<String> LIZ = ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZ(str);
        Uri parse = Uri.parse(str);
        if (parse == null) {
            str2 = "";
        } else {
            str2 = parse.getHost();
        }
        if (LIZ != null && str2 != null) {
            for (int i = 0; i < LIZ.size(); i++) {
                for (String str3 : LIZ.get(i).split(";")) {
                    String replace = str3.replace(" ", "");
                    TokenCert with = TokenCert.with("bpea-live_old_hybrid_use_cookie");
                    if (!PatchProxy.proxy(new Object[]{cookieManager, str2, replace, with}, null, PLR.LIZ, true, 3).isSupported) {
                        C106862S5w.LIZ(cookieManager);
                        SettingKey<Boolean> settingKey = LiveInfraSettingKeys.LIVE_BPEA_SWITCH;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Boolean value = settingKey.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "");
                        if (value.booleanValue()) {
                            CookiesManagerEntry.Companion.setCookie(cookieManager, str2, replace, with);
                        } else {
                            C116971W2r.LIZ(cookieManager, str2, replace);
                        }
                    }
                }
            }
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        String replace;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return str;
        }
        try {
            URI create = URI.create(str);
            String host = create.getHost();
            String scheme = create.getScheme();
            if ("https".equals(scheme)) {
                scheme = "http";
            }
            String[] value = LiveConfigSettingKeys.LIVE_WEBVIEW_DEBUG_BOE_ALLOW_LIST.getValue();
            int length = value.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (!host.startsWith(value[i])) {
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                if (this.boeUrlPatternWhiteList == null) {
                    String[] value2 = LiveConfigSettingKeys.LIVE_WEBVIEW_DEBUG_BOE_ALLOW_REGEXES.getValue();
                    this.boeUrlPatternWhiteList = new ArrayList(value2.length);
                    for (String str2 : value2) {
                        try {
                            this.boeUrlPatternWhiteList.add(C116971W2r.LIZJ(str2));
                        } catch (PatternSyntaxException unused) {
                        }
                    }
                }
                Iterator<Pattern> it = this.boeUrlPatternWhiteList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().matcher(str).matches()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z || !host.endsWith(".boe-gateway.byted.org")) {
                replace = host;
            } else {
                replace = host.replace(".boe-gateway.byted.org", "");
            }
            if (!host.endsWith(".boe-gateway.byted.org") && z) {
                new StringBuilder();
                replace = C0002O.m25086C(host, ".boe-gateway.byted.org");
            }
            if (!StringUtils.isEmpty(replace)) {
                return C387151Uv.LIZ(scheme, replace, create.getPort(), create.getRawPath(), create.getRawQuery(), create.getRawFragment()).toString();
            }
            return str;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1548);
        init();
        MethodCollector.m14707o(1548);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 36).isSupported) {
            return;
        }
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (PatchProxy.proxy(new Object[]{str, bArr}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        try {
            m15819x59f81739(this, filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        try {
            String filterUrl = filterUrl(str);
            m15822xc4f27dda(this, filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_SSWebView_com_bytedance_ies_security_lancet_web_WebViewCSRFLancet_setWebViewClient */
    public static void m15823x20e5b04d(WebView webView, WebViewClient webViewClient) {
        if (PatchProxy.proxy(new Object[]{webView, webViewClient}, null, changeQuickRedirect, true, 31).isSupported) {
            return;
        }
        if (C63837BHb.LIZJ.LIZ() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        access$002(webView, webViewClient);
    }

    private Map<String, String> requestHeader(String str, Map<String, String> map) {
        Map<String, String> LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 43);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        if (isInSafeHostList(str) && (LIZIZ = ((AbstractC88741Kxr) ServiceManager.getService(AbstractC88741Kxr.class)).LIZIZ(str)) != null && !LIZIZ.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap(map);
                for (Map.Entry<String, String> entry : LIZIZ.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                return hashMap;
            }
            return LIZIZ;
        }
        return map;
    }

    public String getConfigFromAssets(Context context, String str) {
        String str2;
        MethodCollector.m14708i(1551);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            String str3 = (String) proxy.result;
            MethodCollector.m14707o(1551);
            return str3;
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            str2 = new String(bArr, C34037f.f43302f);
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable unused) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            str2 = "";
        }
        MethodCollector.m14707o(1551);
        return str2;
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_SSWebView_com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl */
    public static void m15821x99d900ae(WebView webView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{webView, str, map}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        C97955Oi5.LIZ(str);
        access$000(webView, str, map);
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1549);
        init();
        MethodCollector.m14707o(1549);
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_SSWebView_com_bytedance_ies_security_lancet_web_WebViewLancet_loadUrl */
    public static void m15822xc4f27dda(WebView webView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{webView, str, map}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        String LIZ = C97714OeC.LIZJ.LIZ(webView, str);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        m15820x855a3d33(webView, str, map);
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_SSWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_loadUrl */
    public static void m15820x855a3d33(WebView webView, String str, Map map) {
        if (PatchProxy.proxy(new Object[]{webView, str, map}, null, changeQuickRedirect, true, 6).isSupported) {
            return;
        }
        String LIZ = C140565dVp.LIZIZ.LIZ(str, "get", webView);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        m15821x99d900ae(webView, str, map);
    }

    /* renamed from: INVOKESPECIAL_com_bytedance_android_live_browser_webview_SSWebView_com_ss_android_ugc_aweme_security_web_WebviewLancet_postUrl */
    public static void m15819x59f81739(WebView webView, String str, byte[] bArr) {
        if (PatchProxy.proxy(new Object[]{webView, str, bArr}, null, changeQuickRedirect, true, 11).isSupported) {
            return;
        }
        String LIZ = C140565dVp.LIZIZ.LIZ(str, UGCMonitor.TYPE_POST, webView);
        if (!TextUtils.isEmpty(LIZ)) {
            str = LIZ;
        }
        access$001(webView, str, bArr);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
