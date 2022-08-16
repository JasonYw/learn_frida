package com.bytedance.android.btm.api;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.android.btm.api.depend.IALogDepend;
import com.bytedance.android.btm.api.depend.IAppLogDepend;
import com.bytedance.android.btm.api.depend.IExecutorDepend;
import com.bytedance.android.btm.api.depend.ILogDepend;
import com.bytedance.android.btm.api.depend.IMonitorDepend;
import com.bytedance.android.btm.api.depend.ISettingDepend;
import com.bytedance.android.btm.api.inner.IMonitor;
import com.bytedance.android.btm.api.model.BtmSDKBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmHostDependManager {
    public static IALogDepend aLogDepend;
    public static Application app;
    public static IAppLogDepend appLogDepend;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean debug;
    public static boolean enableBtmPageAnnotation;
    public static boolean enableErrorDialog;
    public static IExecutorDepend executorDepend;
    public static boolean hasLancet;
    public static ILogDepend logDepend;
    public static IMonitorDepend monitorDepend;
    public static ISettingDepend settingDepend;
    public static final BtmHostDependManager INSTANCE = new BtmHostDependManager();
    public static String[] appIds = new String[0];
    public static String defaultA = "";
    public static boolean enableDebugCrash = true;
    public static String deviceId = "";
    public static final CopyOnWriteArraySet<BtmPageClass> pageClassSet = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<BtmPageInstance> pageInstanceSet = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<HybridContainerClass> hybridContainerSet = new CopyOnWriteArraySet<>();

    public final IALogDepend getALogDepend() {
        return aLogDepend;
    }

    public final Application getApp() {
        return app;
    }

    public final String[] getAppIds() {
        return appIds;
    }

    public final IAppLogDepend getAppLogDepend() {
        return appLogDepend;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final String getDefaultA() {
        return defaultA;
    }

    public final String getDeviceId() {
        return deviceId;
    }

    public final boolean getEnableBtmPageAnnotation() {
        return enableBtmPageAnnotation;
    }

    public final boolean getEnableDebugCrash() {
        return enableDebugCrash;
    }

    public final boolean getEnableErrorDialog() {
        return enableErrorDialog;
    }

    public final IExecutorDepend getExecutorDepend() {
        return executorDepend;
    }

    public final boolean getHasLancet() {
        return hasLancet;
    }

    public final CopyOnWriteArraySet<HybridContainerClass> getHybridContainerSet() {
        return hybridContainerSet;
    }

    public final ILogDepend getLogDepend() {
        return logDepend;
    }

    public final IMonitorDepend getMonitorDepend() {
        return monitorDepend;
    }

    public final CopyOnWriteArraySet<BtmPageClass> getPageClassSet() {
        return pageClassSet;
    }

    public final CopyOnWriteArraySet<BtmPageInstance> getPageInstanceSet() {
        return pageInstanceSet;
    }

    public final ISettingDepend getSettingDepend() {
        return settingDepend;
    }

    public final Context getContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        Application application = app;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(11269);
    }

    public final void setALogDepend(IALogDepend iALogDepend) {
        aLogDepend = iALogDepend;
    }

    public final void setApp(Application application) {
        app = application;
    }

    public final void setAppLogDepend(IAppLogDepend iAppLogDepend) {
        appLogDepend = iAppLogDepend;
    }

    public final void setDebug(boolean z) {
        debug = z;
    }

    public final void setEnableBtmPageAnnotation(boolean z) {
        enableBtmPageAnnotation = z;
    }

    public final void setEnableDebugCrash(boolean z) {
        enableDebugCrash = z;
    }

    public final void setEnableErrorDialog(boolean z) {
        enableErrorDialog = z;
    }

    public final void setExecutorDepend(IExecutorDepend iExecutorDepend) {
        executorDepend = iExecutorDepend;
    }

    public final void setHasLancet(boolean z) {
        hasLancet = z;
    }

    public final void setLogDepend(ILogDepend iLogDepend) {
        logDepend = iLogDepend;
    }

    public final void setMonitorDepend(IMonitorDepend iMonitorDepend) {
        monitorDepend = iMonitorDepend;
    }

    public final void setSettingDepend(ISettingDepend iSettingDepend) {
        settingDepend = iSettingDepend;
    }

    public final void setAppIds(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) strArr);
        appIds = strArr;
    }

    public final void setDefaultA(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        defaultA = str;
    }

    public final void setDeviceId(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        deviceId = str;
    }

    public final void registerHybridContainer(HybridContainerClass hybridContainerClass) {
        if (PatchProxy.proxy(new Object[]{hybridContainerClass}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(hybridContainerClass);
        hybridContainerSet.add(hybridContainerClass);
        BtmSDK.INSTANCE.getService().onRegisterHybridContainer(hybridContainerClass);
    }

    public final void registerPageClass(BtmPageClass btmPageClass) {
        if (PatchProxy.proxy(new Object[]{btmPageClass}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageClass);
        pageClassSet.add(btmPageClass);
        BtmSDK.INSTANCE.getService().onRegisterPage(btmPageClass);
    }

    public final void registerPageInstance(BtmPageInstance btmPageInstance) {
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
        pageInstanceSet.add(btmPageInstance);
        BtmSDK.INSTANCE.getService().onRegisterPage(btmPageInstance);
    }

    public final void unregisterPageInstance(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        for (BtmPageInstance btmPageInstance : pageInstanceSet) {
            if (Intrinsics.areEqual(btmPageInstance.getPageRef().get(), obj)) {
                pageInstanceSet.remove(btmPageInstance);
                BtmSDK.INSTANCE.getService().onUnregisterPage(btmPageInstance);
                return;
            }
        }
    }

    public final void initDepend$btm_api_release(BtmSDKBuilder btmSDKBuilder) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{btmSDKBuilder}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmSDKBuilder);
        app = btmSDKBuilder.getApp();
        debug = btmSDKBuilder.getDebug();
        appLogDepend = btmSDKBuilder.getAppLogDepend();
        settingDepend = btmSDKBuilder.getSettingDepend();
        logDepend = btmSDKBuilder.getLogDepend();
        aLogDepend = btmSDKBuilder.getALogDepend();
        monitorDepend = btmSDKBuilder.getMonitorDepend();
        executorDepend = btmSDKBuilder.getExecutorDepend();
        appIds = btmSDKBuilder.getAppIds();
        defaultA = btmSDKBuilder.getDefaultA();
        hasLancet = btmSDKBuilder.getHasLancet();
        enableErrorDialog = btmSDKBuilder.getEnableErrorDialog();
        enableDebugCrash = btmSDKBuilder.getEnableDebugCrash();
        enableBtmPageAnnotation = btmSDKBuilder.getEnableBtmPageAnnotation();
        deviceId = btmSDKBuilder.getDeviceId();
        IMonitor monitor = BtmSDK.INSTANCE.getService().getMonitor();
        if (app == null || appLogDepend == null || appIds.length == 0 || defaultA.length() <= 0) {
            z = false;
        }
        monitor.check(z, BtmHostDependManager$initDepend$1.INSTANCE);
        Application application = app;
        if (application != null) {
            application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.bytedance.android.btm.api.BtmHostDependManager$initDepend$2
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(11271);
                }

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                    if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(configuration);
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
                        return;
                    }
                    BtmSDK.INSTANCE.getService().onLowMemory();
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported && i == 80) {
                        BtmSDK.INSTANCE.getService().onLowMemory();
                    }
                }
            });
        }
    }

    public final void registerPageInstance(Object obj, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{obj, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj, str);
        BtmPageInstance btmPageInstance = new BtmPageInstance(new WeakReference(obj), str, z, false, 8, null);
        pageInstanceSet.add(btmPageInstance);
        BtmSDK.INSTANCE.getService().onRegisterPage(btmPageInstance);
    }

    public final void registerPageClass(Class<?> cls, String str, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{cls, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, str);
        BtmPageClass btmPageClass = new BtmPageClass(cls, "", str, z, z2);
        pageClassSet.add(btmPageClass);
        BtmSDK.INSTANCE.getService().onRegisterPage(btmPageClass);
    }

    public final void registerPageClass(String str, String str2, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        BtmPageClass btmPageClass = new BtmPageClass(null, str, str2, z, z2);
        pageClassSet.add(btmPageClass);
        BtmSDK.INSTANCE.getService().onRegisterPage(btmPageClass);
    }

    public static /* synthetic */ void registerPageInstance$default(BtmHostDependManager btmHostDependManager, Object obj, String str, boolean z, int i, Object obj2) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmHostDependManager, obj, str, Byte.valueOf(b), Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 11).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        btmHostDependManager.registerPageInstance(obj, str, z);
    }

    public static /* synthetic */ void registerPageClass$default(BtmHostDependManager btmHostDependManager, Class cls, String str, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmHostDependManager, cls, str, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 7).isSupported) {
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
        btmHostDependManager.registerPageClass(cls, str, z, z2);
    }

    public static /* synthetic */ void registerPageClass$default(BtmHostDependManager btmHostDependManager, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{btmHostDependManager, str, str2, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 9).isSupported) {
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
        btmHostDependManager.registerPageClass(str, str2, z, z2);
    }
}
