package com.bytedance.android.annie.api.bridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.annie.api.container.HybridDialog;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import p003X.C106862S5w;
import p003X.PK0;

/* loaded from: classes7.dex */
public class BaseJSBridgeMethodFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10451);
    }

    public Map<String, IJavaMethod> provideLegacyCacheableMethods() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, AbstractC13049f.AbstractC13051b> provideStatefulCacheableMethods() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> provideStatelessCacheableMethods() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, IJavaMethod> provideLegacySpecifiedMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, AbstractC13049f.AbstractC13051b> provideStateFulFragmentMethods(HybridFragment hybridFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hybridFragment}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(hybridFragment);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> provideStateLessFragmentMethods(HybridFragment hybridFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hybridFragment}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(hybridFragment);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, AbstractC13049f.AbstractC13051b> provideStatefulSpecifiedMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> provideStatelessSpecifiedMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, IJavaMethod> provideLegacyMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.plus(provideLegacyCacheableMethods(), provideLegacySpecifiedMethods(iJSBridgeManager));
    }

    public Map<String, AbstractC13049f.AbstractC13051b> provideStatefulMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.plus(provideStatefulCacheableMethods(), provideStatefulSpecifiedMethods(iJSBridgeManager));
    }

    public Map<String, PK0<?, ?>> provideStatelessMethods(IJSBridgeManager iJSBridgeManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        return MapsKt__MapsKt.plus(provideStatelessCacheableMethods(), provideStatelessSpecifiedMethods(iJSBridgeManager));
    }

    public Map<String, IJavaMethod> provideDialogFragmentLegacyMethods(Activity activity, HybridDialog hybridDialog) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, hybridDialog}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(activity, hybridDialog);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> provideDialogFragmentStatusLessMethods(Activity activity, HybridDialog hybridDialog) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, hybridDialog}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(activity, hybridDialog);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, IJavaMethod> provideFragmentLegacyMethods(Activity activity, HybridFragment hybridFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, hybridFragment}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(activity, hybridFragment);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, FragmentStateFulProvider<? extends AbstractC13049f<?, ?>>> provideProxyStateFulFragmentMethods(Context context, HybridFragment hybridFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, hybridFragment}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(context, hybridFragment);
        return MapsKt__MapsKt.emptyMap();
    }
}
