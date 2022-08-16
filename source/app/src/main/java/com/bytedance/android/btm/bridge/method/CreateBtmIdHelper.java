package com.bytedance.android.btm.bridge.method;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.bridge.BtmBridgeProvider;
import com.bytedance.android.btm.bridge.HybridContainerContextManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C142370dzA;

/* loaded from: classes18.dex */
public final class CreateBtmIdHelper {
    public static final CreateBtmIdHelper INSTANCE = new CreateBtmIdHelper();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11351);
    }

    public final void handle(XCoreBridgeMethod xCoreBridgeMethod, XReadableMap xReadableMap, XBridgeMethod.Callback callback, XBridgePlatformType xBridgePlatformType) {
        LinkedHashMap linkedHashMap;
        if (PatchProxy.proxy(new Object[]{xCoreBridgeMethod, xReadableMap, callback, xBridgePlatformType}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(xCoreBridgeMethod, xReadableMap, callback, xBridgePlatformType);
        if (C142370dzA.LIZ().LIZ != 1) {
            xCoreBridgeMethod.onSuccess(callback, new LinkedHashMap(), "btm switch is off");
            return;
        }
        Logger.INSTANCE.api("FE", new CreateBtmIdHelper$handle$1(xReadableMap));
        String createBtmId = BtmBridgeProvider.INSTANCE.createBtmId(xReadableMap, xCoreBridgeMethod.getContextProviderFactory(), null);
        if (createBtmId != null && createBtmId.length() != 0) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("btm_id", createBtmId);
            if (Intrinsics.areEqual(HybridContainerContextManager.INSTANCE.getContainerType(xCoreBridgeMethod.getContextProviderFactory()), "live")) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(C2521l.LJIIL, linkedHashMap2);
            } else {
                linkedHashMap = linkedHashMap2;
            }
            XCoreBridgeMethod.onSuccess$default(xCoreBridgeMethod, callback, linkedHashMap, null, 4, null);
            return;
        }
        XCoreBridgeMethod.onFailure$default(xCoreBridgeMethod, callback, -1000, "btm_id is empty", null, 8, null);
    }
}
