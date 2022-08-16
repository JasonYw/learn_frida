package com.bytedance.android.btm.bridge.live.support;

import android.view.View;
import com.bytedance.android.btm.bridge.IHybridContainerContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import p003X.C106862S5w;

/* loaded from: classes16.dex */
public final class LiveHybridContainerContext implements IHybridContainerContext {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11348);
    }

    @Override // com.bytedance.android.btm.bridge.IHybridContainerContext
    public final String getHybridContainerType(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(xContextProviderFactory);
        if (obtainView(xContextProviderFactory) != null) {
            return "live";
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
        C13052h c13052h = (C13052h) xContextProviderFactory.provideInstance(C13052h.class);
        if (c13052h == null || c13052h.f29849LJ == null) {
            return null;
        }
        return c13052h.f29849LJ;
    }
}
