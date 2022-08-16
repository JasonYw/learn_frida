package com.bytedance.android.btm.bridge.bullet.support;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.btm.bridge.IHybridContainerContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.bullet.core.model.context.ContextProviderFactory;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.lynx.tasm.LynxView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import p003X.C106862S5w;

/* loaded from: classes16.dex */
public final class BulletHybridContainerContext implements IHybridContainerContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<Class<? extends View>> viewClazzList;

    static {
        Covode.recordClassIndex(11345);
    }

    public BulletHybridContainerContext() {
        List<Class<? extends View>> mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(LynxView.class, WebView.class);
        for (Class<? extends View> cls : HybridViewClassManager.INSTANCE.getViewList()) {
            mutableListOf.add(cls);
        }
        this.viewClazzList = mutableListOf;
    }

    @Override // com.bytedance.android.btm.bridge.IHybridContainerContext
    public final String getHybridContainerType(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(xContextProviderFactory);
        if (obtainView(xContextProviderFactory) != null) {
            return "bullet";
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
        View view = null;
        ContextProviderFactory contextProviderFactory = (ContextProviderFactory) xContextProviderFactory.provideInstance(ContextProviderFactory.class);
        if (contextProviderFactory != null) {
            Iterator<Class<? extends View>> it = this.viewClazzList.iterator();
            while (it.hasNext() && (view = (View) contextProviderFactory.provideInstance(it.next())) == null) {
            }
        }
        return view;
    }
}
