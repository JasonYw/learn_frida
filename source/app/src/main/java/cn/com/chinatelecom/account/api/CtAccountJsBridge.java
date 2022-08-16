package cn.com.chinatelecom.account.api;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import cn.com.chinatelecom.account.api.p035b.AbstractC0634a;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class CtAccountJsBridge implements AbstractC0634a {
    public static final String TAG = CtAccountJsBridge.class.getSimpleName();
    public static Handler mHandler = new Handler(Looper.getMainLooper());
    public AbstractC0639c callback;
    public WebView mWebView;

    static {
        Covode.recordClassIndex(2673);
    }

    public CtAccountJsBridge(WebView webView) {
        this.mWebView = webView;
    }

    public CtAccountJsBridge(AbstractC0639c abstractC0639c) {
        this.callback = abstractC0639c;
    }

    @Override // cn.com.chinatelecom.account.api.p035b.AbstractC0634a
    public void callbackPreCode(String str) {
        CtAuth.info(TAG, "callbackPreCode:".concat(String.valueOf(str)));
        mHandler.post(new RunnableC0628a(this, str));
    }

    @Override // cn.com.chinatelecom.account.api.p035b.AbstractC0634a
    public void callbackPreCodeParams(String str) {
        CtAuth.info(TAG, "callbackPreCodeParams:".concat(String.valueOf(str)));
        mHandler.post(new RunnableC0633b(this, str));
    }

    public void getPreCodeParams(String str) {
        CtAuth.info(TAG, "getPreCodeParams:".concat(String.valueOf(str)));
        CtAuth.getInstance().getPreCodeParamsByJs(str, this);
    }

    public void requestPreCode(String str) {
        CtAuth.info(TAG, "requestPreCode:".concat(String.valueOf(str)));
        CtAuth.getInstance().requestPreCodeByJs(str, this);
    }
}
