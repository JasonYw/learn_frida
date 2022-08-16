package com.bytedance.android.btm.bridge;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.btm.api.model.BtmItemBuilder;
import com.bytedance.android.btm.bridge.method.CreateBtmChainMethod;
import com.bytedance.android.btm.bridge.method.CreateBtmIdMethod;
import com.bytedance.android.btm.bridge.method.RegisterBtmPageMethod;
import com.bytedance.android.btm.bridge.method.XCreateBtmIdMethod;
import com.bytedance.android.btm.bridge.method.XRegisterBtmPageMethod;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XCollectionsKt;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import p003X.C106862S5w;
import p003X.C142328dyU;
import p003X.C142330dyW;

/* loaded from: classes18.dex */
public final class BtmBridgeProvider {
    public static final BtmBridgeProvider INSTANCE = new BtmBridgeProvider();
    public static ChangeQuickRedirect changeQuickRedirect;
    public static IHybridContainerContext hybridContainerContext;

    public final IHybridContainerContext getHybridContainerContext() {
        return hybridContainerContext;
    }

    static {
        Covode.recordClassIndex(11337);
    }

    @Deprecated(message = "Use getBridges instead.")
    public final List<Class<? extends XBridgeMethod>> getXBridges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(XCreateBtmIdMethod.class);
        arrayList.add(CreateBtmIdMethod.class);
        arrayList.add(XRegisterBtmPageMethod.class);
        arrayList.add(RegisterBtmPageMethod.class);
        return arrayList;
    }

    public final List<Class<? extends XBridgeMethod>> getBridges() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateBtmIdMethod.class);
        arrayList.add(CreateBtmChainMethod.class);
        arrayList.add(RegisterBtmPageMethod.class);
        return arrayList;
    }

    public final void setHybridContainerContext(IHybridContainerContext iHybridContainerContext) {
        hybridContainerContext = iHybridContainerContext;
    }

    public final String createBtmId(XReadableMap xReadableMap, XContextProviderFactory xContextProviderFactory, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xReadableMap, xContextProviderFactory, str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(xReadableMap);
        BtmItemBuilder createBtmBuilder = createBtmBuilder(xReadableMap, xContextProviderFactory, str);
        if (createBtmBuilder == null) {
            return null;
        }
        return C142328dyU.LIZIZ.LIZ(createBtmBuilder.build());
    }

    public final BtmItemBuilder createBtmBuilder(XReadableMap xReadableMap, XContextProviderFactory xContextProviderFactory, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{xReadableMap, xContextProviderFactory, str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        C106862S5w.LIZ(xReadableMap);
        if (str == null) {
            str = XCollectionsKt.optString(xReadableMap, "btm", "");
        }
        View view = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        XReadableArray optArray$default = XCollectionsKt.optArray$default(xReadableMap, "target_pages", null, 2, null);
        if (optArray$default != null) {
            int size = optArray$default.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(optArray$default.getString(i));
            }
        }
        if (xContextProviderFactory == null || (view = HybridContainerContextManager.INSTANCE.obtainView(xContextProviderFactory)) == null) {
            C142330dyW.LIZ(C142330dyW.LIZIZ, 1014, "createBtmId", null, false, false, null, 60, null);
        }
        return new BtmItemBuilder(str, Boolean.valueOf(XCollectionsKt.optBoolean(xReadableMap, "enter_new_page", false))).withView(view).setTargetPagesBtm(arrayList);
    }
}
