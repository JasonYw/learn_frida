package com.android.ttcjpaysdk.ttcjpayapi;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface TTCJPayObserver {
    static {
        Covode.recordClassIndex(9303);
    }

    void onEvent(String str, Map<String, String> map);

    void onMonitor(String str, int i, JSONObject jSONObject);

    void onPayCallback(TTCJPayResult tTCJPayResult);

    void onWebViewInit(WeakReference<WebView> weakReference);
}
