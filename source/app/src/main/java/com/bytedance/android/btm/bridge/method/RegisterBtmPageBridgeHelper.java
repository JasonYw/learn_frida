package com.bytedance.android.btm.bridge.method;

import android.view.View;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.bridge.HybridContainerContextManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XCollectionsKt;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C142330dyW;
import p003X.C142347dyn;
import p003X.C142370dzA;

/* loaded from: classes18.dex */
public final class RegisterBtmPageBridgeHelper {
    public static final RegisterBtmPageBridgeHelper INSTANCE = new RegisterBtmPageBridgeHelper();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11354);
    }

    public final void handle(XCoreBridgeMethod xCoreBridgeMethod, XReadableMap xReadableMap, XBridgeMethod.Callback callback, XBridgePlatformType xBridgePlatformType) {
        View obtainView;
        LinkedHashMap linkedHashMap;
        if (PatchProxy.proxy(new Object[]{xCoreBridgeMethod, xReadableMap, callback, xBridgePlatformType}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(xCoreBridgeMethod, xReadableMap, callback, xBridgePlatformType);
        if (C142370dzA.LIZ().LIZ != 1) {
            xCoreBridgeMethod.onSuccess(callback, new LinkedHashMap(), "btm switch is off");
            return;
        }
        String optString$default = XCollectionsKt.optString$default(xReadableMap, "btm", null, 2, null);
        Logger.INSTANCE.api("FE", new RegisterBtmPageBridgeHelper$handle$1(optString$default));
        XContextProviderFactory contextProviderFactory = xCoreBridgeMethod.getContextProviderFactory();
        if (contextProviderFactory != null && (obtainView = HybridContainerContextManager.INSTANCE.obtainView(contextProviderFactory)) != null) {
            C142347dyn c142347dyn = C142347dyn.LIZIZ;
            Intrinsics.checkNotNull(obtainView);
            if (c142347dyn.LIZ(obtainView, optString$default)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (Intrinsics.areEqual(HybridContainerContextManager.INSTANCE.getContainerType(xCoreBridgeMethod.getContextProviderFactory()), "live")) {
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(C2521l.LJIIL, linkedHashMap2);
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                XCoreBridgeMethod.onSuccess$default(xCoreBridgeMethod, callback, linkedHashMap, null, 4, null);
                return;
            }
            return;
        }
        XCoreBridgeMethod.onFailure$default(xCoreBridgeMethod, callback, 0, "Hybrid view is null", null, 8, null);
        C142330dyW.LIZ(C142330dyW.LIZIZ, 1014, "registerBtmPage", null, false, false, null, 60, null);
    }
}
