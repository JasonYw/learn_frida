package com.bytedance.android.btm.bridge;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes18.dex */
public final class HybridContainerContextManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final HybridContainerContextManager INSTANCE = new HybridContainerContextManager();
    public static final Lazy hybridContainerContextList$delegate = LazyKt__LazyJVMKt.lazy(HybridContainerContextManager$hybridContainerContextList$2.INSTANCE);

    private final List<IHybridContainerContext> getHybridContainerContextList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (List) (proxy.isSupported ? proxy.result : hybridContainerContextList$delegate.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(11339);
    }

    public final IHybridContainerContext getBulletContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (IHybridContainerContext) proxy.result;
        }
        try {
            Constructor declaredConstructor = C116971W2r.LIZ("com.bytedance.android.btm.bridge.bullet.support.BulletHybridContainerContext").getDeclaredConstructor(new Class[0]);
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            if (newInstance != null) {
                return (IHybridContainerContext) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.btm.bridge.IHybridContainerContext");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final IHybridContainerContext getLiveContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (IHybridContainerContext) proxy.result;
        }
        try {
            Constructor declaredConstructor = C116971W2r.LIZ("com.bytedance.android.btm.bridge.live.support.LiveHybridContainerContext").getDeclaredConstructor(new Class[0]);
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            if (newInstance != null) {
                return (IHybridContainerContext) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.btm.bridge.IHybridContainerContext");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final View obtainView(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(xContextProviderFactory);
        View view = null;
        int size = getHybridContainerContextList().size();
        for (int i = 0; i < size; i++) {
            view = getHybridContainerContextList().get(i).obtainView(xContextProviderFactory);
            if (view != null) {
                break;
            }
        }
        return view;
    }

    public final String getContainerType(XContextProviderFactory xContextProviderFactory) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xContextProviderFactory}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (xContextProviderFactory == null) {
            return "unkown";
        }
        int size = INSTANCE.getHybridContainerContextList().size();
        String str = "unkown";
        for (int i = 0; i < size; i++) {
            str = INSTANCE.getHybridContainerContextList().get(i).getHybridContainerType(xContextProviderFactory);
            if (!Intrinsics.areEqual(str, "unkown")) {
                break;
            }
        }
        return str;
    }
}
