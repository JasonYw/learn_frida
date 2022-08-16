package cn.com.chinatelecom.account.api;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.b */
/* loaded from: classes2.dex */
public final class RunnableC0633b implements Runnable {

    /* renamed from: a */
    public /* synthetic */ String f20866a;

    /* renamed from: b */
    public /* synthetic */ CtAccountJsBridge f20867b;

    static {
        Covode.recordClassIndex(2684);
    }

    public RunnableC0633b(CtAccountJsBridge ctAccountJsBridge, String str) {
        this.f20867b = ctAccountJsBridge;
        this.f20866a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20867b.mWebView != null) {
            WebView webView = this.f20867b.mWebView;
            C116971W2r.LIZIZ(webView, "javascript:ejsBridge.callbackPreCodeParams('" + this.f20866a + "')");
        } else if (this.f20867b.callback == null) {
        } else {
            StringBuilder sb = new StringBuilder("javascript:ejsBridge.callbackPreCodeParams('");
            sb.append(this.f20866a);
            sb.append("')");
        }
    }
}
