package com.bytedance.android.annie.card.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.android.annie.card.base.AbstractC2599d;
import com.bytedance.android.annie.log.LogLevel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99775PRh;
import p003X.C99777PRj;
import p003X.PQJ;

/* renamed from: com.bytedance.android.annie.card.web.c */
/* loaded from: classes7.dex */
public class C2603c implements AbstractC2599d {
    public static ChangeQuickRedirect LIZIZ;
    public AbstractC2599d LIZJ;

    static {
        Covode.recordClassIndex(10721);
    }

    public C2603c() {
        this(null, 1);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(C13039ag c13039ag) {
        if (PatchProxy.proxy(new Object[]{c13039ag}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(c13039ag);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(JSONObject jSONObject, C13039ag c13039ag) {
        if (PatchProxy.proxy(new Object[]{jSONObject, c13039ag}, this, LIZIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c13039ag);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(boolean z) {
        boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 44).isSupported;
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZLLL() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45).isSupported;
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJIIJ() {
    }

    public void LIZ(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(webView);
        if (this.LIZJ != null) {
            return;
        }
        LIZ("onWebViewCreated");
    }

    public void LIZ(WebView webView, String str, boolean z) {
        if (!PatchProxy.proxy(new Object[]{webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 3).isSupported && this.LIZJ == null) {
            LIZ("shouldInterceptRequest");
        }
    }

    public final void LIZ(WebView webView, WebResourceRequest webResourceRequest) {
        if (!PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, LIZIZ, false, 4).isSupported && this.LIZJ == null) {
            LIZ("shouldInterceptRequest");
        }
    }

    public void LIZ(WebView webView, String str) {
        if (!PatchProxy.proxy(new Object[]{webView, str}, this, LIZIZ, false, 5).isSupported && this.LIZJ == null) {
            LIZ("onReceivedTitle");
        }
    }

    public void LIZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceError}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        LIZ("onReceivedError");
    }

    public void LIZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceResponse}, this, LIZIZ, false, 10).isSupported && this.LIZJ == null) {
            LIZ("onReceivedHttpError");
        }
    }

    public void LIZ(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (!PatchProxy.proxy(new Object[]{webView, sslErrorHandler, sslError}, this, LIZIZ, false, 12).isSupported && this.LIZJ == null) {
            LIZ("onReceivedSslError");
        }
    }

    public void LIZ(WebView webView, int i) {
        if (!PatchProxy.proxy(new Object[]{webView, Integer.valueOf(i)}, this, LIZIZ, false, 13).isSupported && this.LIZJ == null) {
            LIZ("onProgressChanged");
        }
    }

    public void LIZ(String str, GeolocationPermissions.Callback callback) {
        if (!PatchProxy.proxy(new Object[]{str, callback}, this, LIZIZ, false, 21).isSupported && this.LIZJ == null) {
            LIZ("onGeolocationPermissionsShowPrompt");
        }
    }

    public final void LIZ(String str, ValueCallback<String> valueCallback) {
        if (!PatchProxy.proxy(new Object[]{str, valueCallback}, this, LIZIZ, false, 22).isSupported && this.LIZJ == null) {
            LIZ("onEvaluateJavascript");
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        C99775PRh.LIZIZ.LIZIZ(new C99777PRj("Annie_Web-Lifecycle", LogLevel.INFO, null, str, 4));
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, boolean z, String str, long j) {
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, new Long(j)}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC2599d abstractC2599d = this.LIZJ;
        if (abstractC2599d == null) {
            return;
        }
        abstractC2599d.LIZ(view, z, str, j);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{str, annieResType, hybridType, map}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, annieResType, hybridType);
        AbstractC2599d abstractC2599d = this.LIZJ;
        if (abstractC2599d == null) {
            return;
        }
        abstractC2599d.LIZ(str, annieResType, hybridType, map);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 39).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 40).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZIZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZJ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 41).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZJ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    /* renamed from: LJ */
    public final void mo15986LJ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.mo15986LJ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJFF() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LJFF();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJI() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 26).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LJI();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJII() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 27).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LJII();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJIIIIZZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LJIIIIZZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJIIIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 29).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LJIIIZ();
        }
    }

    public void LJIIJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported && this.LIZJ == null) {
            LIZ("onGeolocationPermissionsHidePrompt");
        }
    }

    public void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported && this.LIZJ == null) {
            LIZ("onHideCustomView");
        }
    }

    public C2603c(AbstractC2599d abstractC2599d) {
        this.LIZJ = abstractC2599d;
    }

    public void LIZLLL(WebView webView) {
        if (!PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 17).isSupported && this.LIZJ == null) {
            LIZ("onAttachedToWindow");
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZIZ, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PQJ.LIZ(this, view);
    }

    public void LIZJ(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        LIZ("reload");
    }

    /* renamed from: LJ */
    public void mo15987LJ(WebView webView) {
        if (!PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 18).isSupported && this.LIZJ == null) {
            LIZ("onDestory");
        }
    }

    public void LJFF(WebView webView) {
        if (!PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 19).isSupported && this.LIZJ == null) {
            LIZ("onRelease");
        }
    }

    public void LIZIZ(WebView webView) {
        if (!PatchProxy.proxy(new Object[]{webView}, this, LIZIZ, false, 14).isSupported && this.LIZJ == null) {
            LIZ("onGoBack");
        }
    }

    public /* synthetic */ C2603c(AbstractC2599d abstractC2599d, int i) {
        this(null);
    }

    public void LIZ(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (!PatchProxy.proxy(new Object[]{view, customViewCallback}, this, LIZIZ, false, 6).isSupported && this.LIZJ == null) {
            LIZ("onShowCustomView");
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, String str) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str}, this, LIZIZ, false, 38).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZ(view, str);
        }
    }

    public void LIZIZ(WebView webView, String str) {
        if (!PatchProxy.proxy(new Object[]{webView, str}, this, LIZIZ, false, 15).isSupported && this.LIZJ == null) {
            LIZ("onLoadUrl");
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, Set<String> set) {
        if (PatchProxy.proxy(new Object[]{view, set}, this, LIZIZ, false, 47).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, set);
        PQJ.LIZ(this, view, set);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, boolean z) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 33).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZ(view, z);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZIZ(View view, String str, String str2) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, str2}, this, LIZIZ, false, 42).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZIZ(view, str, str2);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, String str, String str2) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, str2}, this, LIZIZ, false, 32).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZ(view, str, str2);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, String str, Bitmap bitmap, boolean z) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 37).isSupported && (abstractC2599d = this.LIZJ) != null) {
            abstractC2599d.LIZ(view, str, bitmap, z);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Long> map) {
        if (PatchProxy.proxy(new Object[]{str, annieResType, hybridType, map}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, annieResType, hybridType, map);
        AbstractC2599d abstractC2599d = this.LIZJ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZIZ(str, annieResType, hybridType, map);
        }
    }
}
