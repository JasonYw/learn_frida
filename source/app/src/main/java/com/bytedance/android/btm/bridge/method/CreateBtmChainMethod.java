package com.bytedance.android.btm.bridge.method;

import android.text.TextUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.bridge.BtmBridgeProvider;
import com.bytedance.android.btm.bridge.HybridContainerContextManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XCollectionsKt;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.sdk.xbridge.p1359cn.protocol.StatefulMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C142316dyI;
import p003X.C142370dzA;

/* loaded from: classes18.dex */
public final class CreateBtmChainMethod extends XCoreBridgeMethod implements StatefulMethod {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String name = "createBtmChain";
    public final XBridgeMethod.Access access = XBridgeMethod.Access.PROTECT;

    static {
        Covode.recordClassIndex(11349);
    }

    @Override // com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod, com.bytedance.ies.xbridge.XBridgeMethod
    public final XBridgeMethod.Access getAccess() {
        return this.access;
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    public final String getName() {
        return this.name;
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    public final void handle(XReadableMap xReadableMap, XBridgeMethod.Callback callback, XBridgePlatformType xBridgePlatformType) {
        int i;
        LinkedHashMap linkedHashMap;
        if (PatchProxy.proxy(new Object[]{xReadableMap, callback, xBridgePlatformType}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(xReadableMap, callback, xBridgePlatformType);
        if (C142370dzA.LIZ().LIZ != 1) {
            onSuccess(callback, new LinkedHashMap(), "btm switch is off");
            return;
        }
        try {
            String optString = XCollectionsKt.optString(xReadableMap, "btm", "");
            Logger.INSTANCE.api("FE", new CreateBtmChainMethod$handle$1(optString, xReadableMap));
            if (TextUtils.isEmpty(optString)) {
                XCoreBridgeMethod.onFailure$default(this, callback, 0, "createBtmChain must have a btm param", null, 8, null);
                return;
            }
            String createBtmId = BtmBridgeProvider.INSTANCE.createBtmId(xReadableMap, getContextProviderFactory(), null);
            if (xReadableMap.getBoolean("add_btm_chain")) {
                i = xReadableMap.getInt("chain_length");
            } else {
                i = 0;
            }
            Map LIZ = C142316dyI.LIZ(C142316dyI.LIZIZ, createBtmId, i, null, 4, null);
            if (LIZ != null && !LIZ.isEmpty()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : LIZ.entrySet()) {
                    if (entry.getValue() != null) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Intrinsics.checkNotNull(value);
                        linkedHashMap2.put(key, value);
                    }
                }
                if (Intrinsics.areEqual(HybridContainerContextManager.INSTANCE.getContainerType(getContextProviderFactory()), "live")) {
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(C2521l.LJIIL, linkedHashMap2);
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                XCoreBridgeMethod.onSuccess$default(this, callback, linkedHashMap, null, 4, null);
                return;
            }
            XCoreBridgeMethod.onFailure$default(this, callback, 0, "create btm chain error", null, 8, null);
        } catch (Exception e) {
            XCoreBridgeMethod.onFailure$default(this, callback, 0, C0002O.m25086C("Exception：", e.getMessage()), null, 8, null);
        }
    }
}
