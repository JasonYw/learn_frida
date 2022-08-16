package com.android.ttcjpaysdk.base.p132h5;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.spec.JsbridgeEventHelper;
import com.umeng.message.proguard.C34037f;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C76765GOh;

/* renamed from: com.android.ttcjpaysdk.base.h5.CJPayJsBridgeWebView */
/* loaded from: classes17.dex */
public class CJPayJsBridgeWebView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public WebView LIZIZ;
    public Map<String, String> LIZJ;

    static {
        Covode.recordClassIndex(6110);
    }

    public WebView getWebView() {
        return this.LIZIZ;
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.canGoBack();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ.goBack();
    }

    public WebSettings getSettings() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (WebSettings) proxy.result;
        }
        return this.LIZIZ.getSettings();
    }

    public String getUrl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        WebView webView = this.LIZIZ;
        if (webView != null) {
            return webView.getUrl();
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    public int getProgress() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        WebView webView = this.LIZIZ;
        if (webView == null) {
            return 0;
        }
        return webView.getProgress();
    }

    public void setHeaderParams(Map<String, String> map) {
        if (map != null) {
            this.LIZJ = map;
        }
    }

    public CJPayJsBridgeWebView(Context context) {
        super(context);
        MethodCollector.m14708i(362);
        LIZ(context, null, ".snssdk.com");
        MethodCollector.m14707o(362);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (PatchProxy.proxy(new Object[]{webChromeClient}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (PatchProxy.proxy(new Object[]{webViewClient}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C116971W2r.LIZ(this.LIZIZ, webViewClient);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str.startsWith("javascript");
        }
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            C116971W2r.LIZIZ(this.LIZIZ, str, map);
        } else {
            C116971W2r.LIZIZ(this.LIZIZ, str);
        }
    }

    public void setUserAgent(int i) {
        String str;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZIZ.getSettings().getUserAgentString());
        sb.append(" CJPay/");
        sb.append(CJPayBasicUtils.getRealVersion());
        sb.append(" DID/");
        sb.append(CJPayHostInfo.did);
        sb.append(" Lang/");
        sb.append(CJPayHostInfo.languageTypeStr);
        sb.append(" AID");
        sb.append(CJPayHostInfo.aid);
        sb.append("/");
        sb.append(CJPayBasicUtils.getAppVersionName(getContext()));
        sb.append(" SBarH/");
        sb.append((int) (C76765GOh.LIZ(getContext()) / getContext().getResources().getDisplayMetrics().density));
        sb.append(" Host/ULPay");
        if (CJPayHostInfo.serverType == 2) {
            str = " Env/BOE";
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (i != -1) {
            sb2 = sb2 + " CallbackId/" + i;
        }
        WebSettings settings = this.LIZIZ.getSettings();
        if (!PatchProxy.proxy(new Object[]{settings, sb2}, this, LIZ, false, 20).isSupported) {
            C116971W2r.LIZ(settings, sb2);
        }
    }

    public CJPayJsBridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(363);
        LIZ(context, null, ".snssdk.com");
        MethodCollector.m14707o(363);
    }

    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 14).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C2521l.LJIIL, str);
            jSONObject.put("type", str2);
            JsbridgeEventHelper.INSTANCE.sendEvent("ttcjpay.receiveSDKNotification", jSONObject, this.LIZIZ);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(null)) {
            C116971W2r.LIZIZ(this.LIZIZ, (String) null);
        }
    }

    public final void LIZJ(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 23).isSupported && this.LIZIZ != null) {
            String m25083C = C0002O.m25083C("window.localStorage.setItem('", str, "','", str2, "');");
            C0002O.m25083C("javascript:(function({ var localStorage = window.localStorage; localStorage.setItem(\"", str, "\",\"", str2, "\")})()");
            this.LIZIZ.evaluateJavascript(m25083C, null);
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str.startsWith("javascript");
        }
        C116971W2r.LIZ(this.LIZIZ, str, str2.getBytes());
    }

    public CJPayJsBridgeWebView(Context context, AttributeSet attributeSet, Map<String, String> map) {
        super(context, attributeSet);
        MethodCollector.m14708i(364);
        LIZ(context, map, ".snssdk.com");
        MethodCollector.m14707o(364);
    }

    private void LIZ(Context context, Map<String, String> map, String str) {
        MethodCollector.m14708i(366);
        if (PatchProxy.proxy(new Object[]{context, map, str}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(366);
            return;
        }
        this.LIZIZ = new WebView(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDefaultTextEncodingName(C34037f.f43302f);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
        getSettings().setSavePassword(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        if (getContext() != null) {
            getSettings().setDatabaseEnabled(true);
            getSettings().setDatabasePath(getContext().getApplicationContext().getDir("database", 0).getPath());
            getSettings().setAppCacheEnabled(true);
            getSettings().setAppCachePath(getContext().getApplicationContext().getDir("cache", 0).getPath());
            getSettings().setAppCacheMaxSize(8388608L);
        }
        getSettings().setMixedContentMode(0);
        this.LIZIZ.setVerticalScrollBarEnabled(true);
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                new StringBuilder();
                arrayList.add(C0002O.m25085C(entry.getKey(), "=", entry.getValue()));
            }
        }
        addView(this.LIZIZ);
        MethodCollector.m14707o(366);
    }

    public CJPayJsBridgeWebView(Context context, AttributeSet attributeSet, Map<String, String> map, String str) {
        super(context, attributeSet);
        MethodCollector.m14708i(365);
        LIZ(context, map, str);
        MethodCollector.m14707o(365);
    }
}
