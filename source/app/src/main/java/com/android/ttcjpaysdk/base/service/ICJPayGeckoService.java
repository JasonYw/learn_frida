package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayGeckoService extends ICJPayService {
    static {
        Covode.recordClassIndex(6449);
    }

    void initGeckoClient(String str, String str2, Context context);

    void initWebOffline(String str, String str2, Context context);

    WebResourceResponse shouldInterceptRequest(WebView webView, String str, Context context);

    WebResourceResponse shouldInterceptRequestByUrl(WebView webView, String str, Context context);
}
