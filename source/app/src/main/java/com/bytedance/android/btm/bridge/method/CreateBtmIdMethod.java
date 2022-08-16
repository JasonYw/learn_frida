package com.bytedance.android.btm.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.sdk.xbridge.p1359cn.protocol.StatefulMethod;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class CreateBtmIdMethod extends XCoreBridgeMethod implements StatefulMethod {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String name = "createBtmId";
    public final XBridgeMethod.Access access = XBridgeMethod.Access.PROTECT;

    static {
        Covode.recordClassIndex(11353);
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
        if (PatchProxy.proxy(new Object[]{xReadableMap, callback, xBridgePlatformType}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(xReadableMap, callback, xBridgePlatformType);
        CreateBtmIdHelper.INSTANCE.handle(this, xReadableMap, callback, xBridgePlatformType);
    }
}
