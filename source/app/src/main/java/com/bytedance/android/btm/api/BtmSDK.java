package com.bytedance.android.btm.api;

import android.view.View;
import com.bytedance.android.btm.api.inner.EmptyServiceImpl;
import com.bytedance.android.btm.api.inner.IBtmService;
import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.android.btm.api.model.BtmSDKBuilder;
import com.bytedance.android.btm.api.model.EventModelV1;
import com.bytedance.android.btm.api.model.EventModelV3;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Constructor;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes18.dex */
public final class BtmSDK {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final BtmSDK INSTANCE = new BtmSDK();
    public static final Lazy service$delegate = LazyKt__LazyJVMKt.lazy(BtmSDK$service$2.INSTANCE);

    public final IBtmService getService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (IBtmService) (proxy.isSupported ? proxy.result : service$delegate.mo27335getValue());
    }

    public final BtmHostDependManager getDepend() {
        return BtmHostDependManager.INSTANCE;
    }

    static {
        Covode.recordClassIndex(11280);
    }

    public final BtmLaunchApi getLaunchApi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (BtmLaunchApi) proxy.result;
        }
        return getService().getLaunchApi();
    }

    public final BtmPageLifecycle getPageLifecycle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (BtmPageLifecycle) proxy.result;
        }
        return getService().getPageLifecycle();
    }

    public final IBtmService createService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (IBtmService) proxy.result;
        }
        try {
            Constructor declaredConstructor = C116971W2r.LIZ("com.bytedance.android.btm.impl.BtmServiceImpl").getDeclaredConstructor(new Class[0]);
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            if (newInstance != null) {
                return (IBtmService) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.btm.api.inner.IBtmService");
        } catch (Throwable unused) {
            return EmptyServiceImpl.INSTANCE;
        }
    }

    public final String getPageId(PageFinder pageFinder) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageFinder}, this, changeQuickRedirect, false, 29);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return getService().getPageId(pageFinder);
    }

    public final void registerPageClass(BtmPageClass btmPageClass) {
        if (PatchProxy.proxy(new Object[]{btmPageClass}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageClass);
        getDepend().registerPageClass(btmPageClass);
    }

    public final void registerPageInstance(BtmPageInstance btmPageInstance) {
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
        getDepend().registerPageInstance(btmPageInstance);
    }

    public final void unregisterPageInstance(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        getDepend().unregisterPageInstance(obj);
    }

    public final EventModelV1 addBtmEventParam(EventModelV1 eventModelV1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV1}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (EventModelV1) proxy.result;
        }
        C106862S5w.LIZ(eventModelV1);
        return getService().addBtmEventParam(eventModelV1);
    }

    public final JSONObject createBtmChain(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        return getService().createBtmChain(btmItem);
    }

    public final String createBtmId(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        return getService().createBtmId(btmItem);
    }

    public final void init(BtmSDKBuilder btmSDKBuilder) {
        if (PatchProxy.proxy(new Object[]{btmSDKBuilder}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmSDKBuilder);
        BtmHostDependManager.INSTANCE.initDepend$btm_api_release(btmSDKBuilder);
        getService().init();
    }

    public final EventModelV3 addBtmEventParam(EventModelV3 eventModelV3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV3}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (EventModelV3) proxy.result;
        }
        C106862S5w.LIZ(eventModelV3);
        return getService().addBtmEventParam(eventModelV3);
    }

    public final void onPageHide(Object obj, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{obj, bool}, this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        getPageLifecycle().onPageHide(obj, bool);
    }

    public final void onPageShow(Object obj, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{obj, bool}, this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        getPageLifecycle().onPageShow(obj, bool);
    }

    public final void createBtmChainAsync(BtmItem btmItem, ICreateBtmChainCallback iCreateBtmChainCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmChainCallback}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmChainCallback);
        getService().createBtmChainAsync(btmItem, iCreateBtmChainCallback);
    }

    public final void createBtmIdAcrossProcess(BtmItem btmItem, IAcrossProcessCallback iAcrossProcessCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iAcrossProcessCallback}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iAcrossProcessCallback);
        getService().createBtmIdAcrossProcess(btmItem, iAcrossProcessCallback);
    }

    public final void createBtmIdAsync(BtmItem btmItem, ICreateBtmIdCallback iCreateBtmIdCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmIdCallback}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmIdCallback);
        getService().createBtmIdAsync(btmItem, iCreateBtmIdCallback);
    }

    public final boolean registerBtmPage(View view, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(view, str);
        return getService().registerBtmPage(view, str);
    }

    public final void registerPageClass(Class<?> cls, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{cls, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, str);
        BtmHostDependManager.registerPageClass$default(getDepend(), (Class) cls, str, z, false, 8, (Object) null);
    }

    public final void registerPageInstance(Object obj, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{obj, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj, str);
        getDepend().registerPageInstance(obj, str, z);
    }

    public final void registerPageClass(Class<?> cls, String str, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{cls, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, str);
        getDepend().registerPageClass(cls, str, z, z2);
    }

    public final void registerPageClass(String str, String str2, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        getDepend().registerPageClass(str, str2, z, z2);
    }

    public static /* synthetic */ void onPageHide$default(BtmSDK btmSDK, Object obj, Boolean bool, int i, Object obj2) {
        if (PatchProxy.proxy(new Object[]{btmSDK, obj, bool, Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 27).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        btmSDK.onPageHide(obj, bool);
    }

    public static /* synthetic */ void onPageShow$default(BtmSDK btmSDK, Object obj, Boolean bool, int i, Object obj2) {
        if (PatchProxy.proxy(new Object[]{btmSDK, obj, bool, Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 25).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        btmSDK.onPageShow(obj, bool);
    }

    public static /* synthetic */ void registerPageClass$default(BtmSDK btmSDK, Class cls, String str, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmSDK, cls, str, Byte.valueOf(b), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        btmSDK.registerPageClass(cls, str, z);
    }

    public static /* synthetic */ void registerPageInstance$default(BtmSDK btmSDK, Object obj, String str, boolean z, int i, Object obj2) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmSDK, obj, str, Byte.valueOf(b), Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        btmSDK.registerPageInstance(obj, str, z);
    }

    public static /* synthetic */ void registerPageClass$default(BtmSDK btmSDK, Class cls, String str, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmSDK, cls, str, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        btmSDK.registerPageClass(cls, str, z, z2);
    }

    public static /* synthetic */ void registerPageClass$default(BtmSDK btmSDK, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmSDK, str, str2, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 9).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        btmSDK.registerPageClass(str, str2, z, z2);
    }
}
