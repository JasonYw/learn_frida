package com.android.ttcjpaysdk.base.gecko;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.android.ttcjpaysdk.base.service.ICJPayGeckoService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C116125VnT;
import p003X.C137676cl6;
import p003X.C137678cl8;
import p003X.PJC;
import p003X.RunnableC137677cl7;
import p003X.TFG;

/* loaded from: classes17.dex */
public final class CJPayGeckoService implements ICJPayGeckoService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6078);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.base.gecko";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayGeckoService
    @CJPayModuleEntryReport
    public final void initGeckoClient(String str, String str2, Context context) {
        if (PatchProxy.proxy(new Object[]{str, str2, context}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str2);
        PJC.LIZIZ.LIZ(str, str2, context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayGeckoService
    @CJPayModuleEntryReport
    public final void initWebOffline(String str, String str2, Context context) {
        if (!PatchProxy.proxy(new Object[]{str, str2, context}, this, LIZ, false, 3).isSupported && !PatchProxy.proxy(new Object[]{str, str2, context}, C137678cl8.LIZJ, C137676cl6.LIZ, false, 1).isSupported) {
            C116125VnT.LIZ().LIZ(new RunnableC137677cl7(context, str2, str), TFG.LIZIZ);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayGeckoService
    @CJPayModuleEntryReport
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str, Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{webView, str, context}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (WebResourceResponse) proxy.result;
        }
        return PJC.LIZIZ.LIZ(webView, str, context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayGeckoService
    @CJPayModuleEntryReport
    public final WebResourceResponse shouldInterceptRequestByUrl(WebView webView, String str, Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{webView, str, context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (WebResourceResponse) proxy.result;
        }
        return C137678cl8.LIZJ.LIZ(webView, str, context);
    }
}
