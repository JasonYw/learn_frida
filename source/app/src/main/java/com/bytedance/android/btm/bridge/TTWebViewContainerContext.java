package com.bytedance.android.btm.bridge;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import p003X.C106862S5w;

/* loaded from: classes16.dex */
public final class TTWebViewContainerContext implements IHybridContainerContext {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11343);
    }

    @Override // com.bytedance.android.btm.bridge.IHybridContainerContext
    public final String getHybridContainerType(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(xContextProviderFactory);
        if (obtainView(xContextProviderFactory) != null) {
            return "ttwebview";
        }
        return "unkown";
    }

    @Override // com.bytedance.android.btm.bridge.IHybridContainerContext
    public final View obtainView(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(xContextProviderFactory);
        return (View) xContextProviderFactory.provideInstance(WebView.class);
    }
}
