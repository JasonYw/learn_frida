package cn.com.chinatelecom.account.api;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.a */
/* loaded from: classes2.dex */
public final class RunnableC0628a implements Runnable {

    /* renamed from: a */
    public /* synthetic */ String f20860a;

    /* renamed from: b */
    public /* synthetic */ CtAccountJsBridge f20861b;

    static {
        Covode.recordClassIndex(2679);
    }

    public RunnableC0628a(CtAccountJsBridge ctAccountJsBridge, String str) {
        this.f20861b = ctAccountJsBridge;
        this.f20860a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20861b.mWebView != null) {
            WebView webView = this.f20861b.mWebView;
            C116971W2r.LIZIZ(webView, "javascript:ejsBridge.callbackPreCode('" + this.f20860a + "')");
        } else if (this.f20861b.callback == null) {
        } else {
            StringBuilder sb = new StringBuilder("javascript:ejsBridge.callbackPreCode('");
            sb.append(this.f20860a);
            sb.append("')");
        }
    }
}
