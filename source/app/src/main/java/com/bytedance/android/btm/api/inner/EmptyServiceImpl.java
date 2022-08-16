package com.bytedance.android.btm.api.inner;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.btm.api.BtmLaunchApi;
import com.bytedance.android.btm.api.BtmPageClass;
import com.bytedance.android.btm.api.BtmPageInstance;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.HybridContainerClass;
import com.bytedance.android.btm.api.IAcrossProcessCallback;
import com.bytedance.android.btm.api.ICreateBtmChainCallback;
import com.bytedance.android.btm.api.ICreateBtmIdCallback;
import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.android.btm.api.model.EventModelV1;
import com.bytedance.android.btm.api.model.EventModelV3;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class EmptyServiceImpl implements IBtmService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final EmptyServiceImpl INSTANCE = new EmptyServiceImpl();
    public static final EmptyServiceImpl$emptyAppLog$1 emptyAppLog = new IAppLog() { // from class: com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyAppLog$1
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11304);
        }

        @Override // com.bytedance.android.btm.api.inner.IAppLog
        public final void onEventV1(EventModelV1 eventModelV1) {
            if (PatchProxy.proxy(new Object[]{eventModelV1}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(eventModelV1);
        }

        @Override // com.bytedance.android.btm.api.inner.IAppLog
        public final void onEventV3(EventModelV3 eventModelV3) {
            if (PatchProxy.proxy(new Object[]{eventModelV3}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(eventModelV3);
        }
    };
    public static final EmptyServiceImpl$emptyMonitor$1 emptyMonitor = new IMonitor() { // from class: com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyMonitor$1
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11307);
        }

        @Override // com.bytedance.android.btm.api.inner.IMonitor
        public final void check(boolean z, Function0<? extends Object> function0) {
            if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), function0}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(function0);
        }
    };
    public static final EmptyServiceImpl$emptyLifecycle$1 emptyLifecycle = new BtmPageLifecycle() { // from class: com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyLifecycle$1
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11306);
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final BtmPageLifecycle.State getNativeState(Object obj) {
            return null;
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final BtmPageLifecycle.State getPageState(Object obj) {
            return null;
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void ignoreAShow(Object obj) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void onPageDestroy(Object obj) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void onPageHide(Object obj, Boolean bool) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void onPageShow(Object obj, Boolean bool) {
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void setNativeState(Object obj, BtmPageLifecycle.State state) {
            if (PatchProxy.proxy(new Object[]{obj, state}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(state);
        }

        @Override // com.bytedance.android.btm.api.BtmPageLifecycle
        public final void setUserVisibleHint(Object obj, boolean z) {
            if (PatchProxy.proxy(new Object[]{obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(obj);
        }
    };
    public static final EmptyServiceImpl$emptyLaunch$1 emptyLaunch = new BtmLaunchApi() { // from class: com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyLaunch$1
        static {
            Covode.recordClassIndex(11305);
        }

        @Override // com.bytedance.android.btm.api.BtmLaunchApi
        public final void onAppExit() {
        }
    };

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String createBtmId(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        return "";
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String findBtmByPage(Object obj) {
        return null;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String getPageId(PageFinder pageFinder) {
        return null;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final Activity getTopActivity() {
        return null;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void init() {
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final boolean judgeTopActivity() {
        return true;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onLowMemory() {
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterHybridContainer(HybridContainerClass hybridContainerClass) {
        if (PatchProxy.proxy(new Object[]{hybridContainerClass}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(hybridContainerClass);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterPage(BtmPageClass btmPageClass) {
        if (PatchProxy.proxy(new Object[]{btmPageClass}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageClass);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterPage(BtmPageInstance btmPageInstance) {
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onUnregisterPage(BtmPageInstance btmPageInstance) {
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final boolean registerBtmPage(View view, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(view, str);
        return false;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final IAppLog getAppLog() {
        return emptyAppLog;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final BtmLaunchApi getLaunchApi() {
        return emptyLaunch;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final IMonitor getMonitor() {
        return emptyMonitor;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final BtmPageLifecycle getPageLifecycle() {
        return emptyLifecycle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyAppLog$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyMonitor$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyLifecycle$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.btm.api.inner.EmptyServiceImpl$emptyLaunch$1] */
    static {
        Covode.recordClassIndex(11303);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final JSONObject createBtmChain(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        return new JSONObject();
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final EventModelV1 addBtmEventParam(EventModelV1 eventModelV1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV1}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (EventModelV1) proxy.result;
        }
        C106862S5w.LIZ(eventModelV1);
        JSONObject ext_json = eventModelV1.getExt_json();
        if (ext_json != null) {
            ext_json.remove("btm_id");
        }
        return eventModelV1;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final EventModelV3 addBtmEventParam(EventModelV3 eventModelV3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV3}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (EventModelV3) proxy.result;
        }
        C106862S5w.LIZ(eventModelV3);
        JSONObject params = eventModelV3.getParams();
        if (params != null) {
            params.remove("btm_id");
        }
        return eventModelV3;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmIdAcrossProcess(BtmItem btmItem, IAcrossProcessCallback iAcrossProcessCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iAcrossProcessCallback}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iAcrossProcessCallback);
        iAcrossProcessCallback.run(null);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmIdAsync(BtmItem btmItem, ICreateBtmIdCallback iCreateBtmIdCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmIdCallback}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmIdCallback);
        iCreateBtmIdCallback.run("");
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmChainAsync(BtmItem btmItem, ICreateBtmChainCallback iCreateBtmChainCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmChainCallback}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmChainCallback);
        iCreateBtmChainCallback.run(new JSONObject());
    }
}
